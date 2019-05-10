package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class Settings
{
  public static final String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
  private static final String SETTINGS_URL_FORMAT = "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings";
  private boolean initialized;
  private SettingsController settingsController;
  private final AtomicReference settingsData;
  private final CountDownLatch settingsDataLatch;
  
  private Settings()
  {
    Object localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    this.settingsData = ((AtomicReference)localObject);
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    this.settingsDataLatch = ((CountDownLatch)localObject);
    this.initialized = false;
  }
  
  public static Settings getInstance()
  {
    return Settings.LazyHolder.access$100();
  }
  
  private void setSettingsData(SettingsData paramSettingsData)
  {
    this.settingsData.set(paramSettingsData);
    this.settingsDataLatch.countDown();
  }
  
  public SettingsData awaitSettingsData()
  {
    try
    {
      localObject = this.settingsDataLatch;
      ((CountDownLatch)localObject).await();
      localObject = this.settingsData;
      localObject = ((AtomicReference)localObject).get();
      localObject = (SettingsData)localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject;
        Logger localLogger = Fabric.getLogger();
        String str1 = "Fabric";
        String str2 = "Interrupted while waiting for settings data.";
        localLogger.e(str1, str2);
        localLogger = null;
      }
    }
    return (SettingsData)localObject;
  }
  
  public void clearSettings()
  {
    this.settingsData.set(null);
  }
  
  /* Error */
  public Settings initialize(io.fabric.sdk.android.Kit paramKit, io.fabric.sdk.android.services.common.IdManager paramIdManager, io.fabric.sdk.android.services.network.HttpRequestFactory paramHttpRequestFactory, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	io/fabric/sdk/android/services/settings/Settings:initialized	Z
    //   6: istore 7
    //   8: iload 7
    //   10: ifeq +11 -> 21
    //   13: aload_0
    //   14: astore 8
    //   16: aload_0
    //   17: monitorexit
    //   18: aload 8
    //   20: areturn
    //   21: aload_0
    //   22: getfield 82	io/fabric/sdk/android/services/settings/Settings:settingsController	Lio/fabric/sdk/android/services/settings/SettingsController;
    //   25: astore 8
    //   27: aload 8
    //   29: ifnonnull +288 -> 317
    //   32: aload_1
    //   33: invokevirtual 88	io/fabric/sdk/android/Kit:getContext	()Landroid/content/Context;
    //   36: astore 8
    //   38: aload_2
    //   39: invokevirtual 94	io/fabric/sdk/android/services/common/IdManager:getAppIdentifier	()Ljava/lang/String;
    //   42: astore 9
    //   44: new 96	io/fabric/sdk/android/services/common/ApiKey
    //   47: astore 10
    //   49: aload 10
    //   51: invokespecial 97	io/fabric/sdk/android/services/common/ApiKey:<init>	()V
    //   54: aload 10
    //   56: aload 8
    //   58: invokevirtual 101	io/fabric/sdk/android/services/common/ApiKey:getValue	(Landroid/content/Context;)Ljava/lang/String;
    //   61: astore 10
    //   63: aload_2
    //   64: invokevirtual 104	io/fabric/sdk/android/services/common/IdManager:getInstallerPackageName	()Ljava/lang/String;
    //   67: astore 11
    //   69: new 106	io/fabric/sdk/android/services/common/SystemCurrentTimeProvider
    //   72: astore 12
    //   74: aload 12
    //   76: invokespecial 107	io/fabric/sdk/android/services/common/SystemCurrentTimeProvider:<init>	()V
    //   79: new 109	io/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform
    //   82: astore 13
    //   84: aload 13
    //   86: invokespecial 110	io/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform:<init>	()V
    //   89: new 112	io/fabric/sdk/android/services/settings/DefaultCachedSettingsIo
    //   92: astore 14
    //   94: aload 14
    //   96: aload_1
    //   97: invokespecial 115	io/fabric/sdk/android/services/settings/DefaultCachedSettingsIo:<init>	(Lio/fabric/sdk/android/Kit;)V
    //   100: aload 8
    //   102: invokestatic 120	io/fabric/sdk/android/services/common/CommonUtils:getAppIconHashOrNull	(Landroid/content/Context;)Ljava/lang/String;
    //   105: astore 15
    //   107: getstatic 126	java/util/Locale:US	Ljava/util/Locale;
    //   110: astore 16
    //   112: ldc 12
    //   114: astore 17
    //   116: iconst_1
    //   117: istore 18
    //   119: iload 18
    //   121: anewarray 4	java/lang/Object
    //   124: astore 19
    //   126: iconst_0
    //   127: istore 20
    //   129: aconst_null
    //   130: astore 21
    //   132: aload 19
    //   134: iconst_0
    //   135: aload 9
    //   137: aastore
    //   138: aload 16
    //   140: aload 17
    //   142: aload 19
    //   144: invokestatic 132	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   147: astore 9
    //   149: new 134	io/fabric/sdk/android/services/settings/DefaultSettingsSpiCall
    //   152: astore 22
    //   154: aload 22
    //   156: aload_1
    //   157: aload 6
    //   159: aload 9
    //   161: aload_3
    //   162: invokespecial 137	io/fabric/sdk/android/services/settings/DefaultSettingsSpiCall:<init>	(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;)V
    //   165: aload_2
    //   166: invokevirtual 140	io/fabric/sdk/android/services/common/IdManager:getModelName	()Ljava/lang/String;
    //   169: astore 9
    //   171: aload_2
    //   172: invokevirtual 143	io/fabric/sdk/android/services/common/IdManager:getOsBuildVersionString	()Ljava/lang/String;
    //   175: astore 16
    //   177: aload_2
    //   178: invokevirtual 146	io/fabric/sdk/android/services/common/IdManager:getOsDisplayVersionString	()Ljava/lang/String;
    //   181: astore 17
    //   183: aload_2
    //   184: invokevirtual 149	io/fabric/sdk/android/services/common/IdManager:getAppInstallIdentifier	()Ljava/lang/String;
    //   187: astore 19
    //   189: iconst_1
    //   190: istore 20
    //   192: iload 20
    //   194: anewarray 128	java/lang/String
    //   197: astore 21
    //   199: aload 8
    //   201: invokestatic 152	io/fabric/sdk/android/services/common/CommonUtils:resolveBuildId	(Landroid/content/Context;)Ljava/lang/String;
    //   204: astore 8
    //   206: aload 21
    //   208: iconst_0
    //   209: aload 8
    //   211: aastore
    //   212: aload 21
    //   214: invokestatic 156	io/fabric/sdk/android/services/common/CommonUtils:createInstanceIdFrom	([Ljava/lang/String;)Ljava/lang/String;
    //   217: astore 21
    //   219: aload 11
    //   221: invokestatic 162	io/fabric/sdk/android/services/common/DeliveryMechanism:determineFrom	(Ljava/lang/String;)Lio/fabric/sdk/android/services/common/DeliveryMechanism;
    //   224: astore 8
    //   226: aload 8
    //   228: invokevirtual 166	io/fabric/sdk/android/services/common/DeliveryMechanism:getId	()I
    //   231: istore 23
    //   233: new 168	io/fabric/sdk/android/services/settings/SettingsRequest
    //   236: astore 8
    //   238: aload 5
    //   240: astore 11
    //   242: aload 8
    //   244: aload 10
    //   246: aload 9
    //   248: aload 16
    //   250: aload 17
    //   252: aload 19
    //   254: aload 21
    //   256: aload 5
    //   258: aload 4
    //   260: iload 23
    //   262: aload 15
    //   264: invokespecial 171	io/fabric/sdk/android/services/settings/SettingsRequest:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   267: new 173	io/fabric/sdk/android/services/settings/DefaultSettingsController
    //   270: astore 10
    //   272: aload_1
    //   273: astore 9
    //   275: aload 8
    //   277: astore 16
    //   279: aload 12
    //   281: astore 17
    //   283: aload 13
    //   285: astore 19
    //   287: aload 14
    //   289: astore 21
    //   291: aload 22
    //   293: astore 11
    //   295: aload 10
    //   297: aload_1
    //   298: aload 8
    //   300: aload 12
    //   302: aload 13
    //   304: aload 14
    //   306: aload 22
    //   308: invokespecial 176	io/fabric/sdk/android/services/settings/DefaultSettingsController:<init>	(Lio/fabric/sdk/android/Kit;Lio/fabric/sdk/android/services/settings/SettingsRequest;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;Lio/fabric/sdk/android/services/settings/CachedSettingsIo;Lio/fabric/sdk/android/services/settings/SettingsSpiCall;)V
    //   311: aload_0
    //   312: aload 10
    //   314: putfield 82	io/fabric/sdk/android/services/settings/Settings:settingsController	Lio/fabric/sdk/android/services/settings/SettingsController;
    //   317: iconst_1
    //   318: istore 7
    //   320: aload_0
    //   321: iload 7
    //   323: putfield 39	io/fabric/sdk/android/services/settings/Settings:initialized	Z
    //   326: aload_0
    //   327: astore 8
    //   329: goto -313 -> 16
    //   332: astore 8
    //   334: aload_0
    //   335: monitorexit
    //   336: aload 8
    //   338: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	339	0	this	Settings
    //   0	339	1	paramKit	io.fabric.sdk.android.Kit
    //   0	339	2	paramIdManager	io.fabric.sdk.android.services.common.IdManager
    //   0	339	3	paramHttpRequestFactory	io.fabric.sdk.android.services.network.HttpRequestFactory
    //   0	339	4	paramString1	String
    //   0	339	5	paramString2	String
    //   0	339	6	paramString3	String
    //   6	316	7	bool	boolean
    //   14	314	8	localObject1	Object
    //   332	5	8	localObject2	Object
    //   42	232	9	localObject3	Object
    //   47	266	10	localObject4	Object
    //   67	227	11	localObject5	Object
    //   72	229	12	localSystemCurrentTimeProvider	io.fabric.sdk.android.services.common.SystemCurrentTimeProvider
    //   82	221	13	localDefaultSettingsJsonTransform	DefaultSettingsJsonTransform
    //   92	213	14	localDefaultCachedSettingsIo	DefaultCachedSettingsIo
    //   105	158	15	str	String
    //   110	168	16	localObject6	Object
    //   114	168	17	localObject7	Object
    //   117	3	18	i	int
    //   124	162	19	localObject8	Object
    //   127	66	20	j	int
    //   130	160	21	localObject9	Object
    //   152	155	22	localDefaultSettingsSpiCall	DefaultSettingsSpiCall
    //   231	30	23	k	int
    // Exception table:
    //   from	to	target	type
    //   2	6	332	finally
    //   21	25	332	finally
    //   32	36	332	finally
    //   38	42	332	finally
    //   44	47	332	finally
    //   49	54	332	finally
    //   56	61	332	finally
    //   63	67	332	finally
    //   69	72	332	finally
    //   74	79	332	finally
    //   79	82	332	finally
    //   84	89	332	finally
    //   89	92	332	finally
    //   96	100	332	finally
    //   100	105	332	finally
    //   107	110	332	finally
    //   119	124	332	finally
    //   135	138	332	finally
    //   142	147	332	finally
    //   149	152	332	finally
    //   161	165	332	finally
    //   165	169	332	finally
    //   171	175	332	finally
    //   177	181	332	finally
    //   183	187	332	finally
    //   192	197	332	finally
    //   199	204	332	finally
    //   209	212	332	finally
    //   212	217	332	finally
    //   219	224	332	finally
    //   226	231	332	finally
    //   233	236	332	finally
    //   262	267	332	finally
    //   267	270	332	finally
    //   306	311	332	finally
    //   312	317	332	finally
    //   321	326	332	finally
  }
  
  /* Error */
  public boolean loadSettingsData()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 82	io/fabric/sdk/android/services/settings/Settings:settingsController	Lio/fabric/sdk/android/services/settings/SettingsController;
    //   6: astore_1
    //   7: aload_1
    //   8: invokeinterface 182 1 0
    //   13: astore_1
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial 186	io/fabric/sdk/android/services/settings/Settings:setSettingsData	(Lio/fabric/sdk/android/services/settings/SettingsData;)V
    //   19: aload_1
    //   20: ifnull +9 -> 29
    //   23: iconst_1
    //   24: istore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: iload_2
    //   28: ireturn
    //   29: iconst_0
    //   30: istore_2
    //   31: aconst_null
    //   32: astore_1
    //   33: goto -8 -> 25
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	Settings
    //   6	27	1	localObject1	Object
    //   36	4	1	localObject2	Object
    //   24	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	36	finally
    //   7	13	36	finally
    //   15	19	36	finally
  }
  
  /* Error */
  public boolean loadSettingsSkippingCache()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 82	io/fabric/sdk/android/services/settings/Settings:settingsController	Lio/fabric/sdk/android/services/settings/SettingsController;
    //   6: astore_1
    //   7: getstatic 192	io/fabric/sdk/android/services/settings/SettingsCacheBehavior:SKIP_CACHE_LOOKUP	Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;
    //   10: astore_2
    //   11: aload_1
    //   12: aload_2
    //   13: invokeinterface 195 2 0
    //   18: astore_1
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 186	io/fabric/sdk/android/services/settings/Settings:setSettingsData	(Lio/fabric/sdk/android/services/settings/SettingsData;)V
    //   24: aload_1
    //   25: ifnonnull +24 -> 49
    //   28: invokestatic 68	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   31: astore_2
    //   32: ldc 70
    //   34: astore_3
    //   35: ldc -59
    //   37: astore 4
    //   39: aload_2
    //   40: aload_3
    //   41: aload 4
    //   43: aconst_null
    //   44: invokeinterface 200 4 0
    //   49: aload_1
    //   50: ifnull +11 -> 61
    //   53: iconst_1
    //   54: istore 5
    //   56: aload_0
    //   57: monitorexit
    //   58: iload 5
    //   60: ireturn
    //   61: iconst_0
    //   62: istore 5
    //   64: aconst_null
    //   65: astore_1
    //   66: goto -10 -> 56
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	Settings
    //   6	60	1	localObject1	Object
    //   69	4	1	localObject2	Object
    //   10	30	2	localObject3	Object
    //   34	7	3	str1	String
    //   37	5	4	str2	String
    //   54	9	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	69	finally
    //   7	10	69	finally
    //   12	18	69	finally
    //   20	24	69	finally
    //   28	31	69	finally
    //   43	49	69	finally
  }
  
  public void setSettingsController(SettingsController paramSettingsController)
  {
    this.settingsController = paramSettingsController;
  }
  
  public Object withSettings(Settings.SettingsAccess paramSettingsAccess, Object paramObject)
  {
    SettingsData localSettingsData = (SettingsData)this.settingsData.get();
    if (localSettingsData == null) {}
    for (;;)
    {
      return paramObject;
      paramObject = paramSettingsAccess.usingSettings(localSettingsData);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\Settings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */