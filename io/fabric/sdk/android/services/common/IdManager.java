package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdManager
{
  private static final String BAD_ANDROID_ID = "9774d56d682e549c";
  public static final String COLLECT_DEVICE_IDENTIFIERS = "com.crashlytics.CollectDeviceIdentifiers";
  public static final String COLLECT_USER_IDENTIFIERS = "com.crashlytics.CollectUserIdentifiers";
  public static final String DEFAULT_VERSION_NAME = "0.0";
  private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");
  private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
  static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
  private static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
  AdvertisingInfo advertisingInfo;
  AdvertisingInfoProvider advertisingInfoProvider;
  private final Context appContext;
  private final String appIdentifier;
  private final String appInstallIdentifier;
  private final boolean collectHardwareIds;
  private final boolean collectUserIds;
  boolean fetchedAdvertisingInfo;
  FirebaseInfo firebaseInfo;
  private final ReentrantLock installationIdLock;
  private final InstallerPackageNameProvider installerPackageNameProvider;
  private final Collection kits;
  
  public IdManager(Context paramContext, String paramString1, String paramString2, Collection paramCollection)
  {
    Object localObject1 = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject1).<init>();
    this.installationIdLock = ((ReentrantLock)localObject1);
    if (paramContext == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("appContext must not be null");
      throw ((Throwable)localObject1);
    }
    if (paramString1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("appIdentifier must not be null");
      throw ((Throwable)localObject1);
    }
    if (paramCollection == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("kits must not be null");
      throw ((Throwable)localObject1);
    }
    this.appContext = paramContext;
    this.appIdentifier = paramString1;
    this.appInstallIdentifier = paramString2;
    this.kits = paramCollection;
    localObject1 = new io/fabric/sdk/android/services/common/InstallerPackageNameProvider;
    ((InstallerPackageNameProvider)localObject1).<init>();
    this.installerPackageNameProvider = ((InstallerPackageNameProvider)localObject1);
    localObject1 = new io/fabric/sdk/android/services/common/AdvertisingInfoProvider;
    ((AdvertisingInfoProvider)localObject1).<init>(paramContext);
    this.advertisingInfoProvider = ((AdvertisingInfoProvider)localObject1);
    localObject1 = new io/fabric/sdk/android/services/common/FirebaseInfo;
    ((FirebaseInfo)localObject1).<init>();
    this.firebaseInfo = ((FirebaseInfo)localObject1);
    localObject1 = "com.crashlytics.CollectDeviceIdentifiers";
    boolean bool2 = CommonUtils.getBooleanResourceValue(paramContext, (String)localObject1, bool1);
    this.collectHardwareIds = bool2;
    bool2 = this.collectHardwareIds;
    String str1;
    Object localObject2;
    String str2;
    if (!bool2)
    {
      localObject1 = Fabric.getLogger();
      str1 = "Fabric";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Device ID collection disabled for ");
      str2 = paramContext.getPackageName();
      localObject2 = str2;
      ((Logger)localObject1).d(str1, (String)localObject2);
    }
    localObject1 = "com.crashlytics.CollectUserIdentifiers";
    bool2 = CommonUtils.getBooleanResourceValue(paramContext, (String)localObject1, bool1);
    this.collectUserIds = bool2;
    bool2 = this.collectUserIds;
    if (!bool2)
    {
      localObject1 = Fabric.getLogger();
      str1 = "Fabric";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("User information collection disabled for ");
      str2 = paramContext.getPackageName();
      localObject2 = str2;
      ((Logger)localObject1).d(str1, (String)localObject2);
    }
  }
  
  private void checkAdvertisingIdRotation(SharedPreferences paramSharedPreferences)
  {
    Object localObject = getAdvertisingInfo();
    if (localObject != null)
    {
      localObject = ((AdvertisingInfo)localObject).advertisingId;
      flushInstallationIdIfNecessary(paramSharedPreferences, (String)localObject);
    }
  }
  
  private String createInstallationUUID(SharedPreferences paramSharedPreferences)
  {
    this.installationIdLock.lock();
    Object localObject1 = "crashlytics.installation.id";
    SharedPreferences.Editor localEditor = null;
    try
    {
      localObject1 = paramSharedPreferences.getString((String)localObject1, null);
      if (localObject1 == null)
      {
        localObject1 = UUID.randomUUID();
        localObject1 = ((UUID)localObject1).toString();
        localObject1 = formatId((String)localObject1);
        localEditor = paramSharedPreferences.edit();
        String str = "crashlytics.installation.id";
        localEditor = localEditor.putString(str, (String)localObject1);
        localEditor.commit();
      }
      return (String)localObject1;
    }
    finally
    {
      this.installationIdLock.unlock();
    }
  }
  
  private Boolean explicitCheckLimitAdTracking()
  {
    Object localObject = getAdvertisingInfo();
    boolean bool;
    if (localObject != null) {
      bool = ((AdvertisingInfo)localObject).limitAdTrackingEnabled;
    }
    for (localObject = Boolean.valueOf(bool);; localObject = null)
    {
      return (Boolean)localObject;
      bool = false;
    }
  }
  
  /* Error */
  private void flushInstallationIdIfNecessary(SharedPreferences paramSharedPreferences, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 75	io/fabric/sdk/android/services/common/IdManager:installationIdLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_3
    //   5: aload_3
    //   6: invokevirtual 171	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_2
    //   10: invokestatic 219	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   13: istore 4
    //   15: iload 4
    //   17: ifeq +13 -> 30
    //   20: aload_0
    //   21: getfield 75	io/fabric/sdk/android/services/common/IdManager:installationIdLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   24: astore_3
    //   25: aload_3
    //   26: invokevirtual 204	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   29: return
    //   30: ldc 24
    //   32: astore_3
    //   33: iconst_0
    //   34: istore 5
    //   36: aconst_null
    //   37: astore 6
    //   39: aload_1
    //   40: aload_3
    //   41: aconst_null
    //   42: invokeinterface 177 3 0
    //   47: astore_3
    //   48: aload_3
    //   49: invokestatic 219	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   52: istore 5
    //   54: iload 5
    //   56: ifeq +43 -> 99
    //   59: aload_1
    //   60: invokeinterface 191 1 0
    //   65: astore_3
    //   66: ldc 24
    //   68: astore 6
    //   70: aload_3
    //   71: aload 6
    //   73: aload_2
    //   74: invokeinterface 197 3 0
    //   79: astore_3
    //   80: aload_3
    //   81: invokeinterface 201 1 0
    //   86: pop
    //   87: aload_0
    //   88: getfield 75	io/fabric/sdk/android/services/common/IdManager:installationIdLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   91: astore_3
    //   92: aload_3
    //   93: invokevirtual 204	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   96: goto -67 -> 29
    //   99: aload_3
    //   100: aload_2
    //   101: invokevirtual 225	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   104: istore 4
    //   106: iload 4
    //   108: ifne -21 -> 87
    //   111: aload_1
    //   112: invokeinterface 191 1 0
    //   117: astore_3
    //   118: ldc 27
    //   120: astore 6
    //   122: aload_3
    //   123: aload 6
    //   125: invokeinterface 229 2 0
    //   130: astore_3
    //   131: ldc 24
    //   133: astore 6
    //   135: aload_3
    //   136: aload 6
    //   138: aload_2
    //   139: invokeinterface 197 3 0
    //   144: astore_3
    //   145: aload_3
    //   146: invokeinterface 201 1 0
    //   151: pop
    //   152: goto -65 -> 87
    //   155: astore_3
    //   156: aload_0
    //   157: getfield 75	io/fabric/sdk/android/services/common/IdManager:installationIdLock	Ljava/util/concurrent/locks/ReentrantLock;
    //   160: invokevirtual 204	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   163: aload_3
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	IdManager
    //   0	165	1	paramSharedPreferences	SharedPreferences
    //   0	165	2	paramString	String
    //   4	142	3	localObject1	Object
    //   155	9	3	localObject2	Object
    //   13	94	4	bool1	boolean
    //   34	21	5	bool2	boolean
    //   37	100	6	str	String
    // Exception table:
    //   from	to	target	type
    //   9	13	155	finally
    //   41	47	155	finally
    //   48	52	155	finally
    //   59	65	155	finally
    //   73	79	155	finally
    //   80	87	155	finally
    //   100	104	155	finally
    //   111	117	155	finally
    //   123	130	155	finally
    //   138	144	155	finally
    //   145	152	155	finally
  }
  
  private String formatId(String paramString)
  {
    if (paramString == null) {}
    Locale localLocale;
    for (String str = null;; str = str.toLowerCase(localLocale))
    {
      return str;
      str = ID_PATTERN.matcher(paramString).replaceAll("");
      localLocale = Locale.US;
    }
  }
  
  private void putNonNullIdInto(Map paramMap, IdManager.DeviceIdentifierType paramDeviceIdentifierType, String paramString)
  {
    if (paramString != null) {
      paramMap.put(paramDeviceIdentifierType, paramString);
    }
  }
  
  private String removeForwardSlashesIn(String paramString)
  {
    String str = FORWARD_SLASH_REGEX;
    return paramString.replaceAll(str, "");
  }
  
  public boolean canCollectUserIds()
  {
    return this.collectUserIds;
  }
  
  public String createIdHeaderValue(String paramString1, String paramString2)
  {
    return "";
  }
  
  public String getAdvertisingId()
  {
    return null;
  }
  
  AdvertisingInfo getAdvertisingInfo()
  {
    try
    {
      boolean bool = this.fetchedAdvertisingInfo;
      if (!bool)
      {
        localObject1 = this.advertisingInfoProvider;
        localObject1 = ((AdvertisingInfoProvider)localObject1).getAdvertisingInfo();
        this.advertisingInfo = ((AdvertisingInfo)localObject1);
        bool = true;
        this.fetchedAdvertisingInfo = bool;
      }
      Object localObject1 = this.advertisingInfo;
      return (AdvertisingInfo)localObject1;
    }
    finally {}
  }
  
  public String getAndroidId()
  {
    return null;
  }
  
  public String getAppIdentifier()
  {
    return this.appIdentifier;
  }
  
  public String getAppInstallIdentifier()
  {
    String str = this.appInstallIdentifier;
    if (str == null)
    {
      SharedPreferences localSharedPreferences = CommonUtils.getSharedPrefs(this.appContext);
      checkAdvertisingIdRotation(localSharedPreferences);
      str = localSharedPreferences.getString("crashlytics.installation.id", null);
      if (str == null) {
        str = createInstallationUUID(localSharedPreferences);
      }
    }
    return str;
  }
  
  public String getBluetoothMacAddress()
  {
    return null;
  }
  
  public Map getDeviceIdentifiers()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.kits;
    Iterator localIterator1 = ((Collection)localObject).iterator();
    boolean bool1;
    boolean bool2;
    do
    {
      bool1 = localIterator1.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Kit)localIterator1.next();
      bool2 = localObject instanceof DeviceIdentifierProvider;
    } while (!bool2);
    localObject = ((DeviceIdentifierProvider)localObject).getDeviceIdentifiers().entrySet();
    Iterator localIterator2 = ((Set)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator2.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Map.Entry)localIterator2.next();
      IdManager.DeviceIdentifierType localDeviceIdentifierType = (IdManager.DeviceIdentifierType)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      putNonNullIdInto(localHashMap, localDeviceIdentifierType, (String)localObject);
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public String getInstallerPackageName()
  {
    InstallerPackageNameProvider localInstallerPackageNameProvider = this.installerPackageNameProvider;
    Context localContext = this.appContext;
    return localInstallerPackageNameProvider.getInstallerPackageName(localContext);
  }
  
  public String getModelName()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    String str = Build.MANUFACTURER;
    str = removeForwardSlashesIn(str);
    arrayOfObject[0] = str;
    str = Build.MODEL;
    str = removeForwardSlashesIn(str);
    arrayOfObject[1] = str;
    return String.format(localLocale, "%s/%s", arrayOfObject);
  }
  
  public String getOsBuildVersionString()
  {
    String str = Build.VERSION.INCREMENTAL;
    return removeForwardSlashesIn(str);
  }
  
  public String getOsDisplayVersionString()
  {
    String str = Build.VERSION.RELEASE;
    return removeForwardSlashesIn(str);
  }
  
  public String getOsVersionString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = getOsDisplayVersionString();
    localStringBuilder = localStringBuilder.append(str).append("/");
    str = getOsBuildVersionString();
    return str;
  }
  
  public String getSerialNumber()
  {
    return null;
  }
  
  public String getTelephonyId()
  {
    return null;
  }
  
  public String getWifiMacAddress()
  {
    return null;
  }
  
  public Boolean isLimitAdTrackingEnabled()
  {
    Boolean localBoolean = null;
    boolean bool = shouldCollectHardwareIds();
    if (bool) {
      localBoolean = explicitCheckLimitAdTracking();
    }
    return localBoolean;
  }
  
  protected boolean shouldCollectHardwareIds()
  {
    boolean bool = this.collectHardwareIds;
    FirebaseInfo localFirebaseInfo;
    if (bool)
    {
      localFirebaseInfo = this.firebaseInfo;
      Context localContext = this.appContext;
      bool = localFirebaseInfo.isFirebaseCrashlyticsEnabled(localContext);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localFirebaseInfo = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\IdManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */