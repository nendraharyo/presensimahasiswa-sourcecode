package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

class ActivityChooserModel
  extends DataSetObservable
{
  static final String ATTRIBUTE_ACTIVITY = "activity";
  static final String ATTRIBUTE_TIME = "time";
  static final String ATTRIBUTE_WEIGHT = "weight";
  static final boolean DEBUG = false;
  private static final int DEFAULT_ACTIVITY_INFLATION = 5;
  private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0F;
  public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
  public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
  private static final String HISTORY_FILE_EXTENSION = ".xml";
  private static final int INVALID_INDEX = 255;
  static final String LOG_TAG = ActivityChooserModel.class.getSimpleName();
  static final String TAG_HISTORICAL_RECORD = "historical-record";
  static final String TAG_HISTORICAL_RECORDS = "historical-records";
  private static final Map sDataModelRegistry;
  private static final Object sRegistryLock;
  private final List mActivities;
  private ActivityChooserModel.OnChooseActivityListener mActivityChoserModelPolicy;
  private ActivityChooserModel.ActivitySorter mActivitySorter;
  boolean mCanReadHistoricalData;
  final Context mContext;
  private final List mHistoricalRecords;
  private boolean mHistoricalRecordsChanged;
  final String mHistoryFileName;
  private int mHistoryMaxSize;
  private final Object mInstanceLock;
  private Intent mIntent;
  private boolean mReadShareHistoryCalled;
  private boolean mReloadActivities;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    sRegistryLock = localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    sDataModelRegistry = (Map)localObject;
  }
  
  private ActivityChooserModel(Context paramContext, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.mInstanceLock = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mActivities = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mHistoricalRecords = ((List)localObject);
    localObject = new android/support/v7/widget/ActivityChooserModel$DefaultSorter;
    ((ActivityChooserModel.DefaultSorter)localObject).<init>();
    this.mActivitySorter = ((ActivityChooserModel.ActivitySorter)localObject);
    this.mHistoryMaxSize = 50;
    this.mCanReadHistoricalData = bool1;
    this.mReadShareHistoryCalled = false;
    this.mHistoricalRecordsChanged = bool1;
    this.mReloadActivities = false;
    localObject = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject);
    boolean bool2 = TextUtils.isEmpty(paramString);
    if (!bool2)
    {
      localObject = ".xml";
      bool2 = paramString.endsWith((String)localObject);
      if (!bool2)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(paramString);
        str = ".xml";
        localObject = str;
      }
    }
    for (this.mHistoryFileName = ((String)localObject);; this.mHistoryFileName = paramString) {
      return;
    }
  }
  
  private boolean addHistoricalRecord(ActivityChooserModel.HistoricalRecord paramHistoricalRecord)
  {
    List localList = this.mHistoricalRecords;
    boolean bool1 = localList.add(paramHistoricalRecord);
    if (bool1)
    {
      boolean bool2 = true;
      this.mHistoricalRecordsChanged = bool2;
      pruneExcessiveHistoricalRecordsIfNeeded();
      persistHistoricalDataIfNeeded();
      sortActivitiesIfNeeded();
      notifyChanged();
    }
    return bool1;
  }
  
  private void ensureConsistentState()
  {
    boolean bool1 = loadActivitiesIfNeeded();
    boolean bool2 = readHistoricalDataIfNeeded();
    bool1 |= bool2;
    pruneExcessiveHistoricalRecordsIfNeeded();
    if (bool1)
    {
      sortActivitiesIfNeeded();
      notifyChanged();
    }
  }
  
  public static ActivityChooserModel get(Context paramContext, String paramString)
  {
    synchronized (sRegistryLock)
    {
      Object localObject2 = sDataModelRegistry;
      localObject2 = ((Map)localObject2).get(paramString);
      localObject2 = (ActivityChooserModel)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v7/widget/ActivityChooserModel;
        ((ActivityChooserModel)localObject2).<init>(paramContext, paramString);
        Map localMap = sDataModelRegistry;
        localMap.put(paramString, localObject2);
      }
      return (ActivityChooserModel)localObject2;
    }
  }
  
  private boolean loadActivitiesIfNeeded()
  {
    int i = 0;
    ResolveInfo localResolveInfo = null;
    int j = this.mReloadActivities;
    if (j != 0)
    {
      Object localObject1 = this.mIntent;
      if (localObject1 != null)
      {
        this.mReloadActivities = false;
        this.mActivities.clear();
        localObject1 = this.mContext.getPackageManager();
        Object localObject2 = this.mIntent;
        localObject2 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, 0);
        int k = ((List)localObject2).size();
        j = 0;
        localObject1 = null;
        while (j < k)
        {
          localResolveInfo = (ResolveInfo)((List)localObject2).get(j);
          List localList = this.mActivities;
          ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo = new android/support/v7/widget/ActivityChooserModel$ActivityResolveInfo;
          localActivityResolveInfo.<init>(localResolveInfo);
          localList.add(localActivityResolveInfo);
          i = j + 1;
          j = i;
        }
        i = 1;
      }
    }
    return i;
  }
  
  private void persistHistoricalDataIfNeeded()
  {
    boolean bool = this.mReadShareHistoryCalled;
    Object localObject1;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("No preceding call to #readHistoricalData");
      throw ((Throwable)localObject1);
    }
    bool = this.mHistoricalRecordsChanged;
    if (!bool) {}
    for (;;)
    {
      return;
      this.mHistoricalRecordsChanged = false;
      localObject1 = this.mHistoryFileName;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = new android/support/v7/widget/ActivityChooserModel$PersistHistoryAsyncTask;
        ((ActivityChooserModel.PersistHistoryAsyncTask)localObject1).<init>(this);
        Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        ArrayList localArrayList = new java/util/ArrayList;
        Object localObject2 = this.mHistoricalRecords;
        localArrayList.<init>((Collection)localObject2);
        arrayOfObject[0] = localArrayList;
        int j = 1;
        localObject2 = this.mHistoryFileName;
        arrayOfObject[j] = localObject2;
        ((ActivityChooserModel.PersistHistoryAsyncTask)localObject1).executeOnExecutor(localExecutor, arrayOfObject);
      }
    }
  }
  
  private void pruneExcessiveHistoricalRecordsIfNeeded()
  {
    Object localObject = this.mHistoricalRecords;
    int i = ((List)localObject).size();
    int j = this.mHistoryMaxSize;
    int k = i - j;
    if (k <= 0) {}
    for (;;)
    {
      return;
      i = 1;
      this.mHistoricalRecordsChanged = i;
      for (j = 0; j < k; j = i)
      {
        localObject = (ActivityChooserModel.HistoricalRecord)this.mHistoricalRecords.remove(0);
        i = j + 1;
      }
    }
  }
  
  private boolean readHistoricalDataIfNeeded()
  {
    boolean bool1 = true;
    boolean bool2 = this.mCanReadHistoricalData;
    if (bool2)
    {
      bool2 = this.mHistoricalRecordsChanged;
      if (bool2)
      {
        String str = this.mHistoryFileName;
        bool2 = TextUtils.isEmpty(str);
        if (!bool2)
        {
          this.mCanReadHistoricalData = false;
          this.mReadShareHistoryCalled = bool1;
          readHistoricalDataImpl();
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  /* Error */
  private void readHistoricalDataImpl()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 119	android/support/v7/widget/ActivityChooserModel:mContext	Landroid/content/Context;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 143	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   11: astore_3
    //   12: aload_2
    //   13: aload_3
    //   14: invokevirtual 248	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   17: astore_3
    //   18: invokestatic 254	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   21: astore 4
    //   23: ldc_w 256
    //   26: astore_2
    //   27: aload 4
    //   29: aload_3
    //   30: aload_2
    //   31: invokeinterface 262 3 0
    //   36: iconst_0
    //   37: istore 5
    //   39: aconst_null
    //   40: astore_2
    //   41: iload 5
    //   43: iload_1
    //   44: if_icmpeq +25 -> 69
    //   47: iconst_2
    //   48: istore 6
    //   50: iload 5
    //   52: iload 6
    //   54: if_icmpeq +15 -> 69
    //   57: aload 4
    //   59: invokeinterface 265 1 0
    //   64: istore 5
    //   66: goto -25 -> 41
    //   69: ldc 41
    //   71: astore_2
    //   72: aload 4
    //   74: invokeinterface 268 1 0
    //   79: astore 7
    //   81: aload_2
    //   82: aload 7
    //   84: invokevirtual 271	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   87: istore 5
    //   89: iload 5
    //   91: ifne +90 -> 181
    //   94: new 273	org/xmlpull/v1/XmlPullParserException
    //   97: astore_2
    //   98: ldc_w 275
    //   101: astore 4
    //   103: aload_2
    //   104: aload 4
    //   106: invokespecial 276	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   109: aload_2
    //   110: athrow
    //   111: astore_2
    //   112: getstatic 71	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   115: astore 4
    //   117: new 133	java/lang/StringBuilder
    //   120: astore 7
    //   122: aload 7
    //   124: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   127: ldc_w 278
    //   130: astore 8
    //   132: aload 7
    //   134: aload 8
    //   136: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: astore 7
    //   141: aload_0
    //   142: getfield 143	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   145: astore 8
    //   147: aload 7
    //   149: aload 8
    //   151: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: astore 7
    //   156: aload 7
    //   158: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: astore 7
    //   163: aload 4
    //   165: aload 7
    //   167: aload_2
    //   168: invokestatic 284	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   171: pop
    //   172: aload_3
    //   173: ifnull +7 -> 180
    //   176: aload_3
    //   177: invokevirtual 289	java/io/FileInputStream:close	()V
    //   180: return
    //   181: aload_0
    //   182: getfield 95	android/support/v7/widget/ActivityChooserModel:mHistoricalRecords	Ljava/util/List;
    //   185: astore_2
    //   186: aload_2
    //   187: invokeinterface 186 1 0
    //   192: aload 4
    //   194: invokeinterface 265 1 0
    //   199: istore 6
    //   201: iload 6
    //   203: iload_1
    //   204: if_icmpne +18 -> 222
    //   207: aload_3
    //   208: ifnull -28 -> 180
    //   211: aload_3
    //   212: invokevirtual 289	java/io/FileInputStream:close	()V
    //   215: goto -35 -> 180
    //   218: astore_2
    //   219: goto -39 -> 180
    //   222: iconst_3
    //   223: istore 9
    //   225: iload 6
    //   227: iload 9
    //   229: if_icmpeq -37 -> 192
    //   232: iconst_4
    //   233: istore 9
    //   235: iload 6
    //   237: iload 9
    //   239: if_icmpeq -47 -> 192
    //   242: aload 4
    //   244: invokeinterface 268 1 0
    //   249: astore 7
    //   251: ldc 38
    //   253: astore 8
    //   255: aload 8
    //   257: aload 7
    //   259: invokevirtual 271	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   262: istore 6
    //   264: iload 6
    //   266: ifne +96 -> 362
    //   269: new 273	org/xmlpull/v1/XmlPullParserException
    //   272: astore_2
    //   273: ldc_w 293
    //   276: astore 4
    //   278: aload_2
    //   279: aload 4
    //   281: invokespecial 276	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   284: aload_2
    //   285: athrow
    //   286: astore_2
    //   287: getstatic 71	android/support/v7/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   290: astore 4
    //   292: new 133	java/lang/StringBuilder
    //   295: astore 7
    //   297: aload 7
    //   299: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   302: ldc_w 278
    //   305: astore 8
    //   307: aload 7
    //   309: aload 8
    //   311: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: astore 7
    //   316: aload_0
    //   317: getfield 143	android/support/v7/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   320: astore 8
    //   322: aload 7
    //   324: aload 8
    //   326: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: astore 7
    //   331: aload 7
    //   333: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: astore 7
    //   338: aload 4
    //   340: aload 7
    //   342: aload_2
    //   343: invokestatic 284	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   346: pop
    //   347: aload_3
    //   348: ifnull -168 -> 180
    //   351: aload_3
    //   352: invokevirtual 289	java/io/FileInputStream:close	()V
    //   355: goto -175 -> 180
    //   358: astore_2
    //   359: goto -179 -> 180
    //   362: iconst_0
    //   363: istore 6
    //   365: aconst_null
    //   366: astore 7
    //   368: ldc 9
    //   370: astore 8
    //   372: aload 4
    //   374: aconst_null
    //   375: aload 8
    //   377: invokeinterface 297 3 0
    //   382: astore 7
    //   384: iconst_0
    //   385: istore 9
    //   387: aconst_null
    //   388: astore 8
    //   390: ldc 12
    //   392: astore 10
    //   394: aload 4
    //   396: aconst_null
    //   397: aload 10
    //   399: invokeinterface 297 3 0
    //   404: astore 8
    //   406: aload 8
    //   408: invokestatic 303	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   411: lstore 11
    //   413: fconst_0
    //   414: fstore 13
    //   416: aconst_null
    //   417: astore 14
    //   419: ldc 15
    //   421: astore 15
    //   423: aload 4
    //   425: aconst_null
    //   426: aload 15
    //   428: invokeinterface 297 3 0
    //   433: astore 14
    //   435: aload 14
    //   437: invokestatic 309	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   440: fstore 13
    //   442: new 241	android/support/v7/widget/ActivityChooserModel$HistoricalRecord
    //   445: astore 15
    //   447: aload 15
    //   449: aload 7
    //   451: lload 11
    //   453: fload 13
    //   455: invokespecial 312	android/support/v7/widget/ActivityChooserModel$HistoricalRecord:<init>	(Ljava/lang/String;JF)V
    //   458: aload_2
    //   459: aload 15
    //   461: invokeinterface 149 2 0
    //   466: pop
    //   467: goto -275 -> 192
    //   470: astore_2
    //   471: aload_3
    //   472: ifnull +7 -> 479
    //   475: aload_3
    //   476: invokevirtual 289	java/io/FileInputStream:close	()V
    //   479: aload_2
    //   480: athrow
    //   481: astore_2
    //   482: goto -302 -> 180
    //   485: astore_3
    //   486: goto -7 -> 479
    //   489: astore_2
    //   490: goto -310 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	493	0	this	ActivityChooserModel
    //   1	204	1	i	int
    //   6	104	2	localObject1	Object
    //   111	57	2	localXmlPullParserException1	org.xmlpull.v1.XmlPullParserException
    //   185	2	2	localList	List
    //   218	1	2	localIOException1	java.io.IOException
    //   272	13	2	localXmlPullParserException2	org.xmlpull.v1.XmlPullParserException
    //   286	57	2	localIOException2	java.io.IOException
    //   358	101	2	localIOException3	java.io.IOException
    //   470	10	2	localObject2	Object
    //   481	1	2	localIOException4	java.io.IOException
    //   489	1	2	localFileNotFoundException	java.io.FileNotFoundException
    //   11	465	3	localObject3	Object
    //   485	1	3	localIOException5	java.io.IOException
    //   21	403	4	localObject4	Object
    //   37	28	5	j	int
    //   87	3	5	bool1	boolean
    //   48	192	6	k	int
    //   262	102	6	bool2	boolean
    //   79	371	7	localObject5	Object
    //   130	277	8	str1	String
    //   223	163	9	m	int
    //   392	6	10	str2	String
    //   411	41	11	l	long
    //   414	40	13	f	float
    //   417	19	14	str3	String
    //   421	39	15	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   18	21	111	org/xmlpull/v1/XmlPullParserException
    //   30	36	111	org/xmlpull/v1/XmlPullParserException
    //   57	64	111	org/xmlpull/v1/XmlPullParserException
    //   72	79	111	org/xmlpull/v1/XmlPullParserException
    //   82	87	111	org/xmlpull/v1/XmlPullParserException
    //   94	97	111	org/xmlpull/v1/XmlPullParserException
    //   104	109	111	org/xmlpull/v1/XmlPullParserException
    //   109	111	111	org/xmlpull/v1/XmlPullParserException
    //   181	185	111	org/xmlpull/v1/XmlPullParserException
    //   186	192	111	org/xmlpull/v1/XmlPullParserException
    //   192	199	111	org/xmlpull/v1/XmlPullParserException
    //   242	249	111	org/xmlpull/v1/XmlPullParserException
    //   257	262	111	org/xmlpull/v1/XmlPullParserException
    //   269	272	111	org/xmlpull/v1/XmlPullParserException
    //   279	284	111	org/xmlpull/v1/XmlPullParserException
    //   284	286	111	org/xmlpull/v1/XmlPullParserException
    //   375	382	111	org/xmlpull/v1/XmlPullParserException
    //   397	404	111	org/xmlpull/v1/XmlPullParserException
    //   406	411	111	org/xmlpull/v1/XmlPullParserException
    //   426	433	111	org/xmlpull/v1/XmlPullParserException
    //   435	440	111	org/xmlpull/v1/XmlPullParserException
    //   442	445	111	org/xmlpull/v1/XmlPullParserException
    //   453	458	111	org/xmlpull/v1/XmlPullParserException
    //   459	467	111	org/xmlpull/v1/XmlPullParserException
    //   211	215	218	java/io/IOException
    //   18	21	286	java/io/IOException
    //   30	36	286	java/io/IOException
    //   57	64	286	java/io/IOException
    //   72	79	286	java/io/IOException
    //   82	87	286	java/io/IOException
    //   94	97	286	java/io/IOException
    //   104	109	286	java/io/IOException
    //   109	111	286	java/io/IOException
    //   181	185	286	java/io/IOException
    //   186	192	286	java/io/IOException
    //   192	199	286	java/io/IOException
    //   242	249	286	java/io/IOException
    //   257	262	286	java/io/IOException
    //   269	272	286	java/io/IOException
    //   279	284	286	java/io/IOException
    //   284	286	286	java/io/IOException
    //   375	382	286	java/io/IOException
    //   397	404	286	java/io/IOException
    //   406	411	286	java/io/IOException
    //   426	433	286	java/io/IOException
    //   435	440	286	java/io/IOException
    //   442	445	286	java/io/IOException
    //   453	458	286	java/io/IOException
    //   459	467	286	java/io/IOException
    //   351	355	358	java/io/IOException
    //   18	21	470	finally
    //   30	36	470	finally
    //   57	64	470	finally
    //   72	79	470	finally
    //   82	87	470	finally
    //   94	97	470	finally
    //   104	109	470	finally
    //   109	111	470	finally
    //   112	115	470	finally
    //   117	120	470	finally
    //   122	127	470	finally
    //   134	139	470	finally
    //   141	145	470	finally
    //   149	154	470	finally
    //   156	161	470	finally
    //   167	172	470	finally
    //   181	185	470	finally
    //   186	192	470	finally
    //   192	199	470	finally
    //   242	249	470	finally
    //   257	262	470	finally
    //   269	272	470	finally
    //   279	284	470	finally
    //   284	286	470	finally
    //   287	290	470	finally
    //   292	295	470	finally
    //   297	302	470	finally
    //   309	314	470	finally
    //   316	320	470	finally
    //   324	329	470	finally
    //   331	336	470	finally
    //   342	347	470	finally
    //   375	382	470	finally
    //   397	404	470	finally
    //   406	411	470	finally
    //   426	433	470	finally
    //   435	440	470	finally
    //   442	445	470	finally
    //   453	458	470	finally
    //   459	467	470	finally
    //   176	180	481	java/io/IOException
    //   475	479	485	java/io/IOException
    //   2	6	489	java/io/FileNotFoundException
    //   7	11	489	java/io/FileNotFoundException
    //   13	17	489	java/io/FileNotFoundException
  }
  
  private boolean sortActivitiesIfNeeded()
  {
    Object localObject = this.mActivitySorter;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.mIntent;
      if (localObject != null)
      {
        localObject = this.mActivities;
        bool = ((List)localObject).isEmpty();
        if (!bool)
        {
          localObject = this.mHistoricalRecords;
          bool = ((List)localObject).isEmpty();
          if (!bool)
          {
            localObject = this.mActivitySorter;
            Intent localIntent = this.mIntent;
            List localList1 = this.mActivities;
            List localList2 = Collections.unmodifiableList(this.mHistoricalRecords);
            ((ActivityChooserModel.ActivitySorter)localObject).sort(localIntent, localList1, localList2);
            bool = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public Intent chooseActivity(int paramInt)
  {
    ActivityChooserModel.HistoricalRecord localHistoricalRecord = null;
    synchronized (this.mInstanceLock)
    {
      Object localObject2 = this.mIntent;
      if (localObject2 == null) {}
      ComponentName localComponentName;
      for (localObject2 = null;; localObject2 = null)
      {
        return (Intent)localObject2;
        ensureConsistentState();
        localObject2 = this.mActivities;
        localObject2 = ((List)localObject2).get(paramInt);
        localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
        localComponentName = new android/content/ComponentName;
        Object localObject4 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).resolveInfo;
        localObject4 = ((ResolveInfo)localObject4).activityInfo;
        localObject4 = ((ActivityInfo)localObject4).packageName;
        localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).resolveInfo;
        localObject2 = ((ResolveInfo)localObject2).activityInfo;
        localObject2 = ((ActivityInfo)localObject2).name;
        localComponentName.<init>((String)localObject4, (String)localObject2);
        localObject2 = new android/content/Intent;
        localObject4 = this.mIntent;
        ((Intent)localObject2).<init>((Intent)localObject4);
        ((Intent)localObject2).setComponent(localComponentName);
        localObject4 = this.mActivityChoserModelPolicy;
        if (localObject4 == null) {
          break;
        }
        localObject4 = new android/content/Intent;
        ((Intent)localObject4).<init>((Intent)localObject2);
        ActivityChooserModel.OnChooseActivityListener localOnChooseActivityListener = this.mActivityChoserModelPolicy;
        boolean bool = localOnChooseActivityListener.onChooseActivity(this, (Intent)localObject4);
        if (!bool) {
          break;
        }
      }
      localHistoricalRecord = new android/support/v7/widget/ActivityChooserModel$HistoricalRecord;
      long l = System.currentTimeMillis();
      float f = 1.0F;
      localHistoricalRecord.<init>(localComponentName, l, f);
      addHistoricalRecord(localHistoricalRecord);
    }
  }
  
  public ResolveInfo getActivity(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      Object localObject2 = this.mActivities;
      localObject2 = ((List)localObject2).get(paramInt);
      localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
      localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).resolveInfo;
      return (ResolveInfo)localObject2;
    }
  }
  
  public int getActivityCount()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      List localList = this.mActivities;
      int i = localList.size();
      return i;
    }
  }
  
  public int getActivityIndex(ResolveInfo paramResolveInfo)
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      List localList = this.mActivities;
      int i = localList.size();
      int j = 0;
      while (j < i)
      {
        Object localObject2 = localList.get(j);
        localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
        localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).resolveInfo;
        if (localObject2 == paramResolveInfo)
        {
          k = j;
          return k;
        }
        j += 1;
      }
      int k = -1;
    }
  }
  
  public ResolveInfo getDefaultActivity()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      Object localObject2 = this.mActivities;
      boolean bool = ((List)localObject2).isEmpty();
      if (!bool)
      {
        localObject2 = this.mActivities;
        localObject2 = ((List)localObject2).get(0);
        localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
        localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).resolveInfo;
        return (ResolveInfo)localObject2;
      }
      bool = false;
      localObject2 = null;
    }
  }
  
  public int getHistoryMaxSize()
  {
    synchronized (this.mInstanceLock)
    {
      int i = this.mHistoryMaxSize;
      return i;
    }
  }
  
  public int getHistorySize()
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      List localList = this.mHistoricalRecords;
      int i = localList.size();
      return i;
    }
  }
  
  public Intent getIntent()
  {
    synchronized (this.mInstanceLock)
    {
      Intent localIntent = this.mIntent;
      return localIntent;
    }
  }
  
  public void setActivitySorter(ActivityChooserModel.ActivitySorter paramActivitySorter)
  {
    synchronized (this.mInstanceLock)
    {
      ActivityChooserModel.ActivitySorter localActivitySorter = this.mActivitySorter;
      if (localActivitySorter == paramActivitySorter) {
        return;
      }
      this.mActivitySorter = paramActivitySorter;
      boolean bool = sortActivitiesIfNeeded();
      if (bool) {
        notifyChanged();
      }
    }
  }
  
  public void setDefaultActivity(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      ensureConsistentState();
      Object localObject2 = this.mActivities;
      localObject2 = ((List)localObject2).get(paramInt);
      localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
      Object localObject4 = this.mActivities;
      float f1 = 0.0F;
      ComponentName localComponentName = null;
      localObject4 = ((List)localObject4).get(0);
      localObject4 = (ActivityChooserModel.ActivityResolveInfo)localObject4;
      if (localObject4 != null)
      {
        f2 = ((ActivityChooserModel.ActivityResolveInfo)localObject4).weight;
        f1 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).weight;
        f2 -= f1;
        f1 = 5.0F;
        f2 += f1;
        localComponentName = new android/content/ComponentName;
        Object localObject5 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).resolveInfo;
        localObject5 = ((ResolveInfo)localObject5).activityInfo;
        localObject5 = ((ActivityInfo)localObject5).packageName;
        localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).resolveInfo;
        localObject2 = ((ResolveInfo)localObject2).activityInfo;
        localObject2 = ((ActivityInfo)localObject2).name;
        localComponentName.<init>((String)localObject5, (String)localObject2);
        localObject2 = new android/support/v7/widget/ActivityChooserModel$HistoricalRecord;
        long l = System.currentTimeMillis();
        ((ActivityChooserModel.HistoricalRecord)localObject2).<init>(localComponentName, l, f2);
        addHistoricalRecord((ActivityChooserModel.HistoricalRecord)localObject2);
        return;
      }
      float f2 = 1.0F;
    }
  }
  
  public void setHistoryMaxSize(int paramInt)
  {
    synchronized (this.mInstanceLock)
    {
      int i = this.mHistoryMaxSize;
      if (i == paramInt) {
        return;
      }
      this.mHistoryMaxSize = paramInt;
      pruneExcessiveHistoricalRecordsIfNeeded();
      boolean bool = sortActivitiesIfNeeded();
      if (bool) {
        notifyChanged();
      }
    }
  }
  
  public void setIntent(Intent paramIntent)
  {
    synchronized (this.mInstanceLock)
    {
      Intent localIntent = this.mIntent;
      if (localIntent == paramIntent) {
        return;
      }
      this.mIntent = paramIntent;
      boolean bool = true;
      this.mReloadActivities = bool;
      ensureConsistentState();
    }
  }
  
  public void setOnChooseActivityListener(ActivityChooserModel.OnChooseActivityListener paramOnChooseActivityListener)
  {
    synchronized (this.mInstanceLock)
    {
      this.mActivityChoserModelPolicy = paramOnChooseActivityListener;
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserModel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */