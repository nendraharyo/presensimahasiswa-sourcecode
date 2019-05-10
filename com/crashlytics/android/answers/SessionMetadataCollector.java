package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Map;
import java.util.UUID;

class SessionMetadataCollector
{
  private final Context context;
  private final IdManager idManager;
  private final String versionCode;
  private final String versionName;
  
  public SessionMetadataCollector(Context paramContext, IdManager paramIdManager, String paramString1, String paramString2)
  {
    this.context = paramContext;
    this.idManager = paramIdManager;
    this.versionCode = paramString1;
    this.versionName = paramString2;
  }
  
  public SessionEventMetadata getMetadata()
  {
    Object localObject1 = this.idManager.getDeviceIdentifiers();
    String str1 = this.idManager.getAppIdentifier();
    String str2 = this.idManager.getAppInstallIdentifier();
    Boolean localBoolean = this.idManager.isLimitAdTrackingEnabled();
    Object localObject2 = IdManager.DeviceIdentifierType.FONT_TOKEN;
    String str3 = (String)((Map)localObject1).get(localObject2);
    String str4 = CommonUtils.resolveBuildId(this.context);
    String str5 = this.idManager.getOsVersionString();
    String str6 = this.idManager.getModelName();
    localObject2 = UUID.randomUUID().toString();
    localObject1 = new com/crashlytics/android/answers/SessionEventMetadata;
    String str7 = this.versionCode;
    String str8 = this.versionName;
    ((SessionEventMetadata)localObject1).<init>(str1, (String)localObject2, str2, localBoolean, str3, str4, str5, str6, str7, str8);
    return (SessionEventMetadata)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionMetadataCollector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */