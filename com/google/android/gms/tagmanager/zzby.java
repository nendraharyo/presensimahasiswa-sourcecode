package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;
import java.util.Collections;
import java.util.List;

class zzby
  implements zzau
{
  private static final String zzQR;
  private final Context mContext;
  private final zzby.zzb zzbjE;
  private volatile zzac zzbjF;
  private final zzav zzbjG;
  private final String zzbjH;
  private long zzbjI;
  private final int zzbjJ;
  private zzmq zzqW;
  
  static
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = "gtm_hits";
    arrayOfObject[1] = "hit_id";
    arrayOfObject[2] = "hit_time";
    arrayOfObject[3] = "hit_url";
    arrayOfObject[4] = "hit_first_send_time";
    zzQR = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", arrayOfObject);
  }
  
  zzby(zzav paramzzav, Context paramContext)
  {
    this(paramzzav, paramContext, "gtm_urls.db", 2000);
  }
  
  zzby(zzav paramzzav, Context paramContext, String paramString, int paramInt)
  {
    Object localObject1 = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject1);
    this.zzbjH = paramString;
    this.zzbjG = paramzzav;
    localObject1 = zzmt.zzsc();
    this.zzqW = ((zzmq)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzby$zzb;
    Context localContext = this.mContext;
    Object localObject2 = this.zzbjH;
    ((zzby.zzb)localObject1).<init>(this, localContext, (String)localObject2);
    this.zzbjE = ((zzby.zzb)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcx;
    localContext = this.mContext;
    localObject2 = new com/google/android/gms/tagmanager/zzby$zza;
    ((zzby.zza)localObject2).<init>(this);
    ((zzcx)localObject1).<init>(localContext, (zzcx.zza)localObject2);
    this.zzbjF = ((zzac)localObject1);
    this.zzbjI = 0L;
    this.zzbjJ = paramInt;
  }
  
  private void zzGQ()
  {
    int i = zzGR();
    int j = this.zzbjJ;
    i = i - j + 1;
    if (i > 0)
    {
      Object localObject1 = zzkl(i);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Store full, deleting ");
      int k = ((List)localObject1).size();
      localObject2 = ((StringBuilder)localObject2).append(k);
      String str = " hits to make room.";
      zzbg.v(str);
      j = 0;
      localObject2 = new String[0];
      localObject1 = (String[])((List)localObject1).toArray((Object[])localObject2);
      zzf((String[])localObject1);
    }
  }
  
  private void zzd(long paramLong1, long paramLong2)
  {
    SQLiteDatabase localSQLiteDatabase = zzgb("Error opening database for getNumStoredHits.");
    if (localSQLiteDatabase == null) {}
    for (;;)
    {
      return;
      Object localObject2 = new android/content/ContentValues;
      ((ContentValues)localObject2).<init>();
      Object localObject3 = Long.valueOf(paramLong2);
      ((ContentValues)localObject2).put("hit_first_send_time", (Long)localObject3);
      String str1 = "gtm_hits";
      localObject3 = "hit_id=?";
      int i = 1;
      try
      {
        String[] arrayOfString = new String[i];
        String str2 = String.valueOf(paramLong1);
        arrayOfString[0] = str2;
        localSQLiteDatabase.update(str1, (ContentValues)localObject2, (String)localObject3, arrayOfString);
      }
      catch (SQLiteException localSQLiteException)
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "Error setting HIT_FIRST_DISPATCH_TIME for hitId: ";
        localObject1 = (String)localObject2 + paramLong1;
        zzbg.zzaK((String)localObject1);
        zzq(paramLong1);
      }
    }
  }
  
  private SQLiteDatabase zzgb(String paramString)
  {
    try
    {
      localObject1 = this.zzbjE;
      localObject1 = ((zzby.zzb)localObject1).getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject1;
        zzbg.zzaK(paramString);
        Object localObject2 = null;
      }
    }
    return (SQLiteDatabase)localObject1;
  }
  
  private void zzh(long paramLong, String paramString)
  {
    Object localObject1 = zzgb("Error opening database for putHit");
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      ContentValues localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      Object localObject2 = Long.valueOf(paramLong);
      localContentValues.put("hit_time", (Long)localObject2);
      localContentValues.put("hit_url", paramString);
      localObject2 = Integer.valueOf(0);
      localContentValues.put("hit_first_send_time", (Integer)localObject2);
      String str2 = "gtm_hits";
      localObject2 = null;
      try
      {
        ((SQLiteDatabase)localObject1).insert(str2, null, localContentValues);
        localObject1 = this.zzbjG;
        localContentValues = null;
        ((zzav)localObject1).zzax(false);
      }
      catch (SQLiteException localSQLiteException)
      {
        String str1 = "Error storing hit";
        zzbg.zzaK(str1);
      }
    }
  }
  
  private void zzq(long paramLong)
  {
    String[] arrayOfString = new String[1];
    String str = String.valueOf(paramLong);
    arrayOfString[0] = str;
    zzf(arrayOfString);
  }
  
  public void dispatch()
  {
    zzbg.v("GTM Dispatch running...");
    Object localObject = this.zzbjF;
    boolean bool1 = ((zzac)localObject).zzGw();
    if (!bool1) {}
    for (;;)
    {
      return;
      int i = 40;
      localObject = zzkm(i);
      boolean bool2 = ((List)localObject).isEmpty();
      if (bool2)
      {
        zzbg.v("...nothing to dispatch");
        localObject = this.zzbjG;
        bool2 = true;
        ((zzav)localObject).zzax(bool2);
      }
      else
      {
        zzac localzzac = this.zzbjF;
        localzzac.zzE((List)localObject);
        i = zzGS();
        if (i > 0)
        {
          localObject = zzcu.zzHo();
          ((zzcu)localObject).dispatch();
        }
      }
    }
  }
  
  int zzGR()
  {
    Cursor localCursor = null;
    int i = 0;
    Object localObject1 = null;
    SQLiteDatabase localSQLiteDatabase = zzgb("Error opening database for getNumStoredHits.");
    if (localSQLiteDatabase == null) {}
    for (;;)
    {
      return i;
      String str2 = "SELECT COUNT(*) from gtm_hits";
      try
      {
        localCursor = localSQLiteDatabase.rawQuery(str2, null);
        boolean bool = localCursor.moveToFirst();
        if (bool)
        {
          bool = false;
          localSQLiteDatabase = null;
          long l = localCursor.getLong(0);
          i = (int)l;
        }
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
      }
      catch (SQLiteException localSQLiteException)
      {
        String str1 = "Error getting numStoredHits";
        zzbg.zzaK(str1);
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
  }
  
  /* Error */
  int zzGS()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: ldc -98
    //   7: invokespecial 162	com/google/android/gms/tagmanager/zzby:zzgb	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnonnull +5 -> 17
    //   15: iload_1
    //   16: ireturn
    //   17: ldc 28
    //   19: astore 4
    //   21: iconst_2
    //   22: istore 5
    //   24: iload 5
    //   26: anewarray 42	java/lang/String
    //   29: astore 6
    //   31: iconst_0
    //   32: istore 7
    //   34: aconst_null
    //   35: astore 8
    //   37: ldc 31
    //   39: astore 9
    //   41: aload 6
    //   43: iconst_0
    //   44: aload 9
    //   46: aastore
    //   47: iconst_1
    //   48: istore 7
    //   50: ldc 40
    //   52: astore 9
    //   54: aload 6
    //   56: iload 7
    //   58: aload 9
    //   60: aastore
    //   61: ldc_w 280
    //   64: astore 8
    //   66: aconst_null
    //   67: astore 9
    //   69: aload_3
    //   70: aload 4
    //   72: aload 6
    //   74: aload 8
    //   76: aconst_null
    //   77: aconst_null
    //   78: aconst_null
    //   79: aconst_null
    //   80: invokevirtual 284	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   83: astore 4
    //   85: aload 4
    //   87: invokeinterface 287 1 0
    //   92: istore 10
    //   94: aload 4
    //   96: ifnull +10 -> 106
    //   99: aload 4
    //   101: invokeinterface 276 1 0
    //   106: iload 10
    //   108: istore_1
    //   109: goto -94 -> 15
    //   112: astore_3
    //   113: iconst_0
    //   114: istore 10
    //   116: aconst_null
    //   117: astore_3
    //   118: ldc_w 289
    //   121: astore 4
    //   123: aload 4
    //   125: invokestatic 194	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   128: aload_3
    //   129: ifnull +54 -> 183
    //   132: aload_3
    //   133: invokeinterface 276 1 0
    //   138: iconst_0
    //   139: istore 10
    //   141: aconst_null
    //   142: astore_3
    //   143: goto -37 -> 106
    //   146: astore_3
    //   147: aload_2
    //   148: ifnull +9 -> 157
    //   151: aload_2
    //   152: invokeinterface 276 1 0
    //   157: aload_3
    //   158: athrow
    //   159: astore_3
    //   160: aload 4
    //   162: astore_2
    //   163: goto -16 -> 147
    //   166: astore 4
    //   168: aload_3
    //   169: astore_2
    //   170: aload 4
    //   172: astore_3
    //   173: goto -26 -> 147
    //   176: astore_3
    //   177: aload 4
    //   179: astore_3
    //   180: goto -62 -> 118
    //   183: iconst_0
    //   184: istore 10
    //   186: aconst_null
    //   187: astore_3
    //   188: goto -82 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	zzby
    //   1	108	1	i	int
    //   3	167	2	localObject1	Object
    //   10	60	3	localSQLiteDatabase	SQLiteDatabase
    //   112	1	3	localSQLiteException1	SQLiteException
    //   117	26	3	localObject2	Object
    //   146	12	3	localObject3	Object
    //   159	10	3	localObject4	Object
    //   172	1	3	localObject5	Object
    //   176	1	3	localSQLiteException2	SQLiteException
    //   179	9	3	localObject6	Object
    //   19	142	4	localObject7	Object
    //   166	12	4	localObject8	Object
    //   22	3	5	j	int
    //   29	44	6	arrayOfString	String[]
    //   32	25	7	k	int
    //   35	40	8	str1	String
    //   39	29	9	str2	String
    //   92	93	10	m	int
    // Exception table:
    //   from	to	target	type
    //   24	29	112	android/database/sqlite/SQLiteException
    //   44	47	112	android/database/sqlite/SQLiteException
    //   58	61	112	android/database/sqlite/SQLiteException
    //   79	83	112	android/database/sqlite/SQLiteException
    //   24	29	146	finally
    //   44	47	146	finally
    //   58	61	146	finally
    //   79	83	146	finally
    //   85	92	159	finally
    //   123	128	166	finally
    //   85	92	176	android/database/sqlite/SQLiteException
  }
  
  void zzf(String[] paramArrayOfString)
  {
    boolean bool = true;
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      if (i != 0) {
        break label14;
      }
    }
    label14:
    Object localObject1;
    do
    {
      return;
      localObject1 = zzgb("Error opening database for deleteHits.");
    } while (localObject1 == null);
    Object localObject2 = new Object[bool];
    int j = paramArrayOfString.length;
    String str1 = "?";
    List localList = Collections.nCopies(j, str1);
    String str2 = TextUtils.join(",", localList);
    localObject2[0] = str2;
    String str3 = String.format("HIT_ID in (%s)", (Object[])localObject2);
    localObject2 = "gtm_hits";
    for (;;)
    {
      try
      {
        ((SQLiteDatabase)localObject1).delete((String)localObject2, str3, paramArrayOfString);
        localObject1 = this.zzbjG;
        int k = zzGR();
        if (k != 0) {
          break label136;
        }
        ((zzav)localObject1).zzax(bool);
      }
      catch (SQLiteException localSQLiteException)
      {
        str4 = "Error deleting hits";
        zzbg.zzaK(str4);
      }
      break;
      label136:
      bool = false;
      String str4 = null;
    }
  }
  
  public void zzg(long paramLong, String paramString)
  {
    zzjN();
    zzGQ();
    zzh(paramLong, paramString);
  }
  
  int zzjN()
  {
    boolean bool1 = true;
    int i = 0;
    Object localObject = this.zzqW;
    long l1 = ((zzmq)localObject).currentTimeMillis();
    long l2 = this.zzbjI;
    long l3 = 86400000L;
    l2 += l3;
    boolean bool2 = l1 < l2;
    if (!bool2) {}
    do
    {
      return i;
      this.zzbjI = l1;
      localObject = zzgb("Error opening database for deleteStaleHits.");
    } while (localObject == null);
    l2 = this.zzqW.currentTimeMillis();
    l3 = 2592000000L;
    l2 -= l3;
    String str1 = "HIT_TIME < ?";
    String[] arrayOfString = new String[bool1];
    String str2 = Long.toString(l2);
    arrayOfString[0] = str2;
    int k = ((SQLiteDatabase)localObject).delete("gtm_hits", str1, arrayOfString);
    zzav localzzav = this.zzbjG;
    int j = zzGR();
    if (j == 0) {}
    for (;;)
    {
      localzzav.zzax(bool1);
      i = k;
      break;
      bool1 = false;
    }
  }
  
  /* Error */
  List zzkl(int paramInt)
  {
    // Byte code:
    //   0: new 347	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 348	java/util/ArrayList:<init>	()V
    //   8: iload_1
    //   9: ifgt +13 -> 22
    //   12: ldc_w 350
    //   15: invokestatic 194	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   18: aload_2
    //   19: astore_3
    //   20: aload_3
    //   21: areturn
    //   22: aload_0
    //   23: ldc_w 352
    //   26: invokespecial 162	com/google/android/gms/tagmanager/zzby:zzgb	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   29: astore_3
    //   30: aload_3
    //   31: ifnonnull +8 -> 39
    //   34: aload_2
    //   35: astore_3
    //   36: goto -16 -> 20
    //   39: ldc 28
    //   41: astore 4
    //   43: iconst_1
    //   44: istore 5
    //   46: iload 5
    //   48: anewarray 42	java/lang/String
    //   51: astore 6
    //   53: aconst_null
    //   54: astore 7
    //   56: ldc 31
    //   58: astore 8
    //   60: aload 6
    //   62: iconst_0
    //   63: aload 8
    //   65: aastore
    //   66: aconst_null
    //   67: astore 7
    //   69: aconst_null
    //   70: astore 8
    //   72: ldc_w 354
    //   75: astore 9
    //   77: iconst_1
    //   78: istore 10
    //   80: iload 10
    //   82: anewarray 4	java/lang/Object
    //   85: astore 11
    //   87: ldc 31
    //   89: astore 12
    //   91: aload 11
    //   93: iconst_0
    //   94: aload 12
    //   96: aastore
    //   97: aload 9
    //   99: aload 11
    //   101: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   104: astore 9
    //   106: iload_1
    //   107: invokestatic 357	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   110: astore 11
    //   112: aload_3
    //   113: aload 4
    //   115: aload 6
    //   117: aconst_null
    //   118: aconst_null
    //   119: aconst_null
    //   120: aconst_null
    //   121: aload 9
    //   123: aload 11
    //   125: invokevirtual 360	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   128: astore 4
    //   130: aload 4
    //   132: invokeinterface 269 1 0
    //   137: istore 13
    //   139: iload 13
    //   141: ifeq +46 -> 187
    //   144: iconst_0
    //   145: istore 13
    //   147: aconst_null
    //   148: astore_3
    //   149: aload 4
    //   151: iconst_0
    //   152: invokeinterface 273 2 0
    //   157: lstore 14
    //   159: lload 14
    //   161: invokestatic 180	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   164: astore_3
    //   165: aload_2
    //   166: aload_3
    //   167: invokeinterface 364 2 0
    //   172: pop
    //   173: aload 4
    //   175: invokeinterface 367 1 0
    //   180: istore 13
    //   182: iload 13
    //   184: ifne -40 -> 144
    //   187: aload 4
    //   189: ifnull +10 -> 199
    //   192: aload 4
    //   194: invokeinterface 276 1 0
    //   199: aload_2
    //   200: astore_3
    //   201: goto -181 -> 20
    //   204: astore_3
    //   205: aconst_null
    //   206: astore 4
    //   208: new 111	java/lang/StringBuilder
    //   211: astore 6
    //   213: aload 6
    //   215: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   218: ldc_w 369
    //   221: astore 7
    //   223: aload 6
    //   225: aload 7
    //   227: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: astore 6
    //   232: aload_3
    //   233: invokevirtual 372	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   236: astore_3
    //   237: aload 6
    //   239: aload_3
    //   240: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: astore_3
    //   244: aload_3
    //   245: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   248: astore_3
    //   249: aload_3
    //   250: invokestatic 194	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   253: aload 4
    //   255: ifnull -56 -> 199
    //   258: aload 4
    //   260: invokeinterface 276 1 0
    //   265: goto -66 -> 199
    //   268: astore_3
    //   269: aconst_null
    //   270: astore 4
    //   272: aload 4
    //   274: ifnull +10 -> 284
    //   277: aload 4
    //   279: invokeinterface 276 1 0
    //   284: aload_3
    //   285: athrow
    //   286: astore_3
    //   287: goto -15 -> 272
    //   290: astore_3
    //   291: goto -83 -> 208
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	294	0	this	zzby
    //   0	294	1	paramInt	int
    //   3	197	2	localArrayList	java.util.ArrayList
    //   19	182	3	localObject1	Object
    //   204	29	3	localSQLiteException1	SQLiteException
    //   236	14	3	localObject2	Object
    //   268	17	3	localObject3	Object
    //   286	1	3	localObject4	Object
    //   290	1	3	localSQLiteException2	SQLiteException
    //   41	237	4	localObject5	Object
    //   44	3	5	i	int
    //   51	187	6	localObject6	Object
    //   54	172	7	str1	String
    //   58	13	8	str2	String
    //   75	47	9	str3	String
    //   78	3	10	j	int
    //   85	39	11	localObject7	Object
    //   89	6	12	str4	String
    //   137	46	13	bool	boolean
    //   157	3	14	l	long
    // Exception table:
    //   from	to	target	type
    //   46	51	204	android/database/sqlite/SQLiteException
    //   63	66	204	android/database/sqlite/SQLiteException
    //   80	85	204	android/database/sqlite/SQLiteException
    //   94	97	204	android/database/sqlite/SQLiteException
    //   99	104	204	android/database/sqlite/SQLiteException
    //   106	110	204	android/database/sqlite/SQLiteException
    //   123	128	204	android/database/sqlite/SQLiteException
    //   46	51	268	finally
    //   63	66	268	finally
    //   80	85	268	finally
    //   94	97	268	finally
    //   99	104	268	finally
    //   106	110	268	finally
    //   123	128	268	finally
    //   130	137	286	finally
    //   151	157	286	finally
    //   159	164	286	finally
    //   166	173	286	finally
    //   173	180	286	finally
    //   208	211	286	finally
    //   213	218	286	finally
    //   225	230	286	finally
    //   232	236	286	finally
    //   239	243	286	finally
    //   244	248	286	finally
    //   249	253	286	finally
    //   130	137	290	android/database/sqlite/SQLiteException
    //   151	157	290	android/database/sqlite/SQLiteException
    //   159	164	290	android/database/sqlite/SQLiteException
    //   166	173	290	android/database/sqlite/SQLiteException
    //   173	180	290	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public List zzkm(int paramInt)
  {
    // Byte code:
    //   0: new 347	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 348	java/util/ArrayList:<init>	()V
    //   8: aload_0
    //   9: astore_3
    //   10: aload_0
    //   11: ldc_w 374
    //   14: invokespecial 162	com/google/android/gms/tagmanager/zzby:zzgb	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore 4
    //   19: aload 4
    //   21: ifnonnull +9 -> 30
    //   24: aload_2
    //   25: astore 4
    //   27: aload 4
    //   29: areturn
    //   30: aconst_null
    //   31: astore 5
    //   33: ldc 28
    //   35: astore 6
    //   37: iconst_3
    //   38: istore 7
    //   40: iload 7
    //   42: anewarray 42	java/lang/String
    //   45: astore 8
    //   47: iconst_0
    //   48: istore 9
    //   50: aconst_null
    //   51: astore 10
    //   53: ldc 31
    //   55: astore 11
    //   57: aload 8
    //   59: iconst_0
    //   60: aload 11
    //   62: aastore
    //   63: iconst_1
    //   64: istore 9
    //   66: ldc 34
    //   68: astore 11
    //   70: aload 8
    //   72: iload 9
    //   74: aload 11
    //   76: aastore
    //   77: iconst_2
    //   78: istore 9
    //   80: ldc 40
    //   82: astore 11
    //   84: aload 8
    //   86: iload 9
    //   88: aload 11
    //   90: aastore
    //   91: iconst_0
    //   92: istore 9
    //   94: aconst_null
    //   95: astore 10
    //   97: iconst_0
    //   98: istore 12
    //   100: aconst_null
    //   101: astore 11
    //   103: iconst_0
    //   104: istore 13
    //   106: ldc_w 354
    //   109: astore 14
    //   111: iconst_1
    //   112: istore 15
    //   114: iload 15
    //   116: anewarray 4	java/lang/Object
    //   119: astore 16
    //   121: aconst_null
    //   122: astore 17
    //   124: ldc 31
    //   126: astore 18
    //   128: aload 16
    //   130: iconst_0
    //   131: aload 18
    //   133: aastore
    //   134: aload 14
    //   136: aload 16
    //   138: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   141: astore 14
    //   143: iload_1
    //   144: invokestatic 357	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   147: astore 16
    //   149: aload 4
    //   151: aload 6
    //   153: aload 8
    //   155: aconst_null
    //   156: aconst_null
    //   157: aconst_null
    //   158: aconst_null
    //   159: aload 14
    //   161: aload 16
    //   163: invokevirtual 360	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   166: astore 17
    //   168: new 347	java/util/ArrayList
    //   171: astore 5
    //   173: aload 5
    //   175: invokespecial 348	java/util/ArrayList:<init>	()V
    //   178: aload 17
    //   180: invokeinterface 269 1 0
    //   185: istore 19
    //   187: iload 19
    //   189: ifeq +87 -> 276
    //   192: new 376	com/google/android/gms/tagmanager/zzaq
    //   195: astore 6
    //   197: iconst_0
    //   198: istore 7
    //   200: aconst_null
    //   201: astore 8
    //   203: aload 17
    //   205: iconst_0
    //   206: invokeinterface 273 2 0
    //   211: lstore 20
    //   213: iconst_1
    //   214: istore 12
    //   216: aload 17
    //   218: iload 12
    //   220: invokeinterface 273 2 0
    //   225: lstore 22
    //   227: iconst_2
    //   228: istore 13
    //   230: aload 17
    //   232: iload 13
    //   234: invokeinterface 273 2 0
    //   239: lstore 24
    //   241: aload 6
    //   243: lload 20
    //   245: lload 22
    //   247: lload 24
    //   249: invokespecial 379	com/google/android/gms/tagmanager/zzaq:<init>	(JJJ)V
    //   252: aload 5
    //   254: aload 6
    //   256: invokeinterface 364 2 0
    //   261: pop
    //   262: aload 17
    //   264: invokeinterface 367 1 0
    //   269: istore 19
    //   271: iload 19
    //   273: ifne -81 -> 192
    //   276: aload 17
    //   278: ifnull +10 -> 288
    //   281: aload 17
    //   283: invokeinterface 276 1 0
    //   288: aconst_null
    //   289: astore_2
    //   290: ldc 28
    //   292: astore 6
    //   294: iconst_2
    //   295: istore 7
    //   297: iload 7
    //   299: anewarray 42	java/lang/String
    //   302: astore 8
    //   304: iconst_0
    //   305: istore 9
    //   307: aconst_null
    //   308: astore 10
    //   310: ldc 31
    //   312: astore 11
    //   314: aload 8
    //   316: iconst_0
    //   317: aload 11
    //   319: aastore
    //   320: iconst_1
    //   321: istore 9
    //   323: ldc 37
    //   325: astore 11
    //   327: aload 8
    //   329: iload 9
    //   331: aload 11
    //   333: aastore
    //   334: iconst_0
    //   335: istore 9
    //   337: aconst_null
    //   338: astore 10
    //   340: iconst_0
    //   341: istore 12
    //   343: aconst_null
    //   344: astore 11
    //   346: iconst_0
    //   347: istore 13
    //   349: ldc_w 354
    //   352: astore 14
    //   354: iconst_1
    //   355: istore 15
    //   357: iload 15
    //   359: anewarray 4	java/lang/Object
    //   362: astore 16
    //   364: aconst_null
    //   365: astore 18
    //   367: ldc 31
    //   369: astore 26
    //   371: aload 16
    //   373: iconst_0
    //   374: aload 26
    //   376: aastore
    //   377: aload 14
    //   379: aload 16
    //   381: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   384: astore 14
    //   386: iload_1
    //   387: invokestatic 357	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   390: astore 16
    //   392: aload 4
    //   394: aload 6
    //   396: aload 8
    //   398: aconst_null
    //   399: aconst_null
    //   400: aconst_null
    //   401: aconst_null
    //   402: aload 14
    //   404: aload 16
    //   406: invokevirtual 360	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   409: astore 6
    //   411: aload 6
    //   413: invokeinterface 269 1 0
    //   418: istore 27
    //   420: iload 27
    //   422: ifeq +98 -> 520
    //   425: iconst_0
    //   426: istore 7
    //   428: aconst_null
    //   429: astore 8
    //   431: aload 6
    //   433: astore_3
    //   434: aload 6
    //   436: checkcast 381	android/database/sqlite/SQLiteCursor
    //   439: astore_3
    //   440: aload_3
    //   441: astore 4
    //   443: aload_3
    //   444: invokevirtual 385	android/database/sqlite/SQLiteCursor:getWindow	()Landroid/database/CursorWindow;
    //   447: astore 4
    //   449: aload 4
    //   451: invokevirtual 390	android/database/CursorWindow:getNumRows	()I
    //   454: istore 27
    //   456: iload 27
    //   458: ifle +176 -> 634
    //   461: aload 5
    //   463: iload 7
    //   465: invokeinterface 394 2 0
    //   470: astore 4
    //   472: aload 4
    //   474: checkcast 376	com/google/android/gms/tagmanager/zzaq
    //   477: astore 4
    //   479: iconst_1
    //   480: istore 9
    //   482: aload 6
    //   484: iload 9
    //   486: invokeinterface 397 2 0
    //   491: astore 10
    //   493: aload 4
    //   495: aload 10
    //   497: invokevirtual 400	com/google/android/gms/tagmanager/zzaq:zzgf	(Ljava/lang/String;)V
    //   500: iload 7
    //   502: iconst_1
    //   503: iadd
    //   504: istore 27
    //   506: aload 6
    //   508: invokeinterface 367 1 0
    //   513: istore 7
    //   515: iload 7
    //   517: ifne +433 -> 950
    //   520: aload 6
    //   522: ifnull +10 -> 532
    //   525: aload 6
    //   527: invokeinterface 276 1 0
    //   532: aload 5
    //   534: astore 4
    //   536: goto -509 -> 27
    //   539: astore 6
    //   541: iconst_0
    //   542: istore 7
    //   544: aconst_null
    //   545: astore 8
    //   547: aload_2
    //   548: astore 4
    //   550: new 111	java/lang/StringBuilder
    //   553: astore 10
    //   555: aload 10
    //   557: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   560: ldc_w 369
    //   563: astore 11
    //   565: aload 10
    //   567: aload 11
    //   569: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   572: astore 10
    //   574: aload 6
    //   576: invokevirtual 372	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   579: astore 6
    //   581: aload 10
    //   583: aload 6
    //   585: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: astore 6
    //   590: aload 6
    //   592: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   595: astore 6
    //   597: aload 6
    //   599: invokestatic 194	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   602: aload 8
    //   604: ifnull -577 -> 27
    //   607: aload 8
    //   609: invokeinterface 276 1 0
    //   614: goto -587 -> 27
    //   617: astore 4
    //   619: aload 5
    //   621: ifnull +10 -> 631
    //   624: aload 5
    //   626: invokeinterface 276 1 0
    //   631: aload 4
    //   633: athrow
    //   634: ldc_w 402
    //   637: astore 10
    //   639: iconst_1
    //   640: istore 27
    //   642: iload 27
    //   644: anewarray 4	java/lang/Object
    //   647: astore 11
    //   649: aload 5
    //   651: iload 7
    //   653: invokeinterface 394 2 0
    //   658: astore 4
    //   660: aload 4
    //   662: checkcast 376	com/google/android/gms/tagmanager/zzaq
    //   665: astore 4
    //   667: aload 4
    //   669: invokevirtual 405	com/google/android/gms/tagmanager/zzaq:zzGD	()J
    //   672: lstore 24
    //   674: lload 24
    //   676: invokestatic 171	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   679: astore 4
    //   681: aload 11
    //   683: iconst_0
    //   684: aload 4
    //   686: aastore
    //   687: aload 10
    //   689: aload 11
    //   691: invokestatic 46	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   694: astore 4
    //   696: aload 4
    //   698: invokestatic 194	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   701: goto -201 -> 500
    //   704: astore 4
    //   706: aload 6
    //   708: astore 17
    //   710: new 111	java/lang/StringBuilder
    //   713: astore 6
    //   715: aload 6
    //   717: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   720: ldc_w 407
    //   723: astore 8
    //   725: aload 6
    //   727: aload 8
    //   729: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   732: astore 6
    //   734: aload 4
    //   736: invokevirtual 372	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   739: astore 4
    //   741: aload 6
    //   743: aload 4
    //   745: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: astore 4
    //   750: aload 4
    //   752: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   755: astore 4
    //   757: aload 4
    //   759: invokestatic 194	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   762: new 347	java/util/ArrayList
    //   765: astore 6
    //   767: aload 6
    //   769: invokespecial 348	java/util/ArrayList:<init>	()V
    //   772: iconst_0
    //   773: istore 7
    //   775: aconst_null
    //   776: astore 8
    //   778: aload 5
    //   780: invokeinterface 411 1 0
    //   785: astore 10
    //   787: aload 10
    //   789: invokeinterface 416 1 0
    //   794: istore 27
    //   796: iload 27
    //   798: ifeq +43 -> 841
    //   801: aload 10
    //   803: invokeinterface 420 1 0
    //   808: astore 4
    //   810: aload 4
    //   812: checkcast 376	com/google/android/gms/tagmanager/zzaq
    //   815: astore 4
    //   817: aload 4
    //   819: invokevirtual 423	com/google/android/gms/tagmanager/zzaq:zzGF	()Ljava/lang/String;
    //   822: astore 11
    //   824: aload 11
    //   826: invokestatic 426	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   829: istore 12
    //   831: iload 12
    //   833: ifeq +30 -> 863
    //   836: iload 7
    //   838: ifeq +22 -> 860
    //   841: aload 17
    //   843: ifnull +10 -> 853
    //   846: aload 17
    //   848: invokeinterface 276 1 0
    //   853: aload 6
    //   855: astore 4
    //   857: goto -830 -> 27
    //   860: iconst_1
    //   861: istore 7
    //   863: aload 6
    //   865: aload 4
    //   867: invokeinterface 364 2 0
    //   872: pop
    //   873: goto -86 -> 787
    //   876: astore 4
    //   878: aload 17
    //   880: ifnull +10 -> 890
    //   883: aload 17
    //   885: invokeinterface 276 1 0
    //   890: aload 4
    //   892: athrow
    //   893: astore 4
    //   895: aload 6
    //   897: astore 17
    //   899: goto -21 -> 878
    //   902: astore 4
    //   904: goto -194 -> 710
    //   907: astore 4
    //   909: aload 17
    //   911: astore 5
    //   913: goto -294 -> 619
    //   916: astore 4
    //   918: aload 8
    //   920: astore 5
    //   922: goto -303 -> 619
    //   925: astore 6
    //   927: aload 17
    //   929: astore 8
    //   931: aload_2
    //   932: astore 4
    //   934: goto -384 -> 550
    //   937: astore 6
    //   939: aload 17
    //   941: astore 8
    //   943: aload 5
    //   945: astore 4
    //   947: goto -397 -> 550
    //   950: iload 27
    //   952: istore 7
    //   954: goto -523 -> 431
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	957	0	this	zzby
    //   0	957	1	paramInt	int
    //   3	929	2	localArrayList	java.util.ArrayList
    //   9	435	3	localObject1	Object
    //   17	532	4	localObject2	Object
    //   617	15	4	localObject3	Object
    //   658	39	4	localObject4	Object
    //   704	31	4	localSQLiteException1	SQLiteException
    //   739	127	4	localObject5	Object
    //   876	15	4	localObject6	Object
    //   893	1	4	localObject7	Object
    //   902	1	4	localSQLiteException2	SQLiteException
    //   907	1	4	localObject8	Object
    //   916	1	4	localObject9	Object
    //   932	14	4	localObject10	Object
    //   31	913	5	localObject11	Object
    //   35	491	6	localObject12	Object
    //   539	36	6	localSQLiteException3	SQLiteException
    //   579	317	6	localObject13	Object
    //   925	1	6	localSQLiteException4	SQLiteException
    //   937	1	6	localSQLiteException5	SQLiteException
    //   38	466	7	i	int
    //   513	139	7	j	int
    //   773	180	7	k	int
    //   45	897	8	localObject14	Object
    //   48	437	9	m	int
    //   51	751	10	localObject15	Object
    //   55	770	11	localObject16	Object
    //   98	244	12	n	int
    //   829	3	12	bool1	boolean
    //   104	244	13	i1	int
    //   109	294	14	str1	String
    //   112	246	15	i2	int
    //   119	286	16	localObject17	Object
    //   122	818	17	localObject18	Object
    //   126	240	18	str2	String
    //   185	87	19	bool2	boolean
    //   211	33	20	l1	long
    //   225	21	22	l2	long
    //   239	436	24	l3	long
    //   369	6	26	str3	String
    //   418	3	27	bool3	boolean
    //   454	189	27	i3	int
    //   794	157	27	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   40	45	539	android/database/sqlite/SQLiteException
    //   60	63	539	android/database/sqlite/SQLiteException
    //   74	77	539	android/database/sqlite/SQLiteException
    //   88	91	539	android/database/sqlite/SQLiteException
    //   114	119	539	android/database/sqlite/SQLiteException
    //   131	134	539	android/database/sqlite/SQLiteException
    //   136	141	539	android/database/sqlite/SQLiteException
    //   143	147	539	android/database/sqlite/SQLiteException
    //   161	166	539	android/database/sqlite/SQLiteException
    //   40	45	617	finally
    //   60	63	617	finally
    //   74	77	617	finally
    //   88	91	617	finally
    //   114	119	617	finally
    //   131	134	617	finally
    //   136	141	617	finally
    //   143	147	617	finally
    //   161	166	617	finally
    //   411	418	704	android/database/sqlite/SQLiteException
    //   434	439	704	android/database/sqlite/SQLiteException
    //   443	447	704	android/database/sqlite/SQLiteException
    //   449	454	704	android/database/sqlite/SQLiteException
    //   463	470	704	android/database/sqlite/SQLiteException
    //   472	477	704	android/database/sqlite/SQLiteException
    //   484	491	704	android/database/sqlite/SQLiteException
    //   495	500	704	android/database/sqlite/SQLiteException
    //   506	513	704	android/database/sqlite/SQLiteException
    //   642	647	704	android/database/sqlite/SQLiteException
    //   651	658	704	android/database/sqlite/SQLiteException
    //   660	665	704	android/database/sqlite/SQLiteException
    //   667	672	704	android/database/sqlite/SQLiteException
    //   674	679	704	android/database/sqlite/SQLiteException
    //   684	687	704	android/database/sqlite/SQLiteException
    //   689	694	704	android/database/sqlite/SQLiteException
    //   696	701	704	android/database/sqlite/SQLiteException
    //   297	302	876	finally
    //   317	320	876	finally
    //   331	334	876	finally
    //   357	362	876	finally
    //   374	377	876	finally
    //   379	384	876	finally
    //   386	390	876	finally
    //   404	409	876	finally
    //   710	713	876	finally
    //   715	720	876	finally
    //   727	732	876	finally
    //   734	739	876	finally
    //   743	748	876	finally
    //   750	755	876	finally
    //   757	762	876	finally
    //   762	765	876	finally
    //   767	772	876	finally
    //   778	785	876	finally
    //   787	794	876	finally
    //   801	808	876	finally
    //   810	815	876	finally
    //   817	822	876	finally
    //   824	829	876	finally
    //   865	873	876	finally
    //   411	418	893	finally
    //   434	439	893	finally
    //   443	447	893	finally
    //   449	454	893	finally
    //   463	470	893	finally
    //   472	477	893	finally
    //   484	491	893	finally
    //   495	500	893	finally
    //   506	513	893	finally
    //   642	647	893	finally
    //   651	658	893	finally
    //   660	665	893	finally
    //   667	672	893	finally
    //   674	679	893	finally
    //   684	687	893	finally
    //   689	694	893	finally
    //   696	701	893	finally
    //   297	302	902	android/database/sqlite/SQLiteException
    //   317	320	902	android/database/sqlite/SQLiteException
    //   331	334	902	android/database/sqlite/SQLiteException
    //   357	362	902	android/database/sqlite/SQLiteException
    //   374	377	902	android/database/sqlite/SQLiteException
    //   379	384	902	android/database/sqlite/SQLiteException
    //   386	390	902	android/database/sqlite/SQLiteException
    //   404	409	902	android/database/sqlite/SQLiteException
    //   168	171	907	finally
    //   173	178	907	finally
    //   178	185	907	finally
    //   192	195	907	finally
    //   205	211	907	finally
    //   218	225	907	finally
    //   232	239	907	finally
    //   247	252	907	finally
    //   254	262	907	finally
    //   262	269	907	finally
    //   550	553	916	finally
    //   555	560	916	finally
    //   567	572	916	finally
    //   574	579	916	finally
    //   583	588	916	finally
    //   590	595	916	finally
    //   597	602	916	finally
    //   168	171	925	android/database/sqlite/SQLiteException
    //   173	178	925	android/database/sqlite/SQLiteException
    //   178	185	937	android/database/sqlite/SQLiteException
    //   192	195	937	android/database/sqlite/SQLiteException
    //   205	211	937	android/database/sqlite/SQLiteException
    //   218	225	937	android/database/sqlite/SQLiteException
    //   232	239	937	android/database/sqlite/SQLiteException
    //   247	252	937	android/database/sqlite/SQLiteException
    //   254	262	937	android/database/sqlite/SQLiteException
    //   262	269	937	android/database/sqlite/SQLiteException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzby.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */