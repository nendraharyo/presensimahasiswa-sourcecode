package com.crashlytics.android.answers;

final class SessionEventMetadata
{
  public final String appBundleId;
  public final String appVersionCode;
  public final String appVersionName;
  public final String betaDeviceToken;
  public final String buildId;
  public final String deviceModel;
  public final String executionId;
  public final String installationId;
  public final Boolean limitAdTrackingEnabled;
  public final String osVersion;
  private String stringRepresentation;
  
  public SessionEventMetadata(String paramString1, String paramString2, String paramString3, Boolean paramBoolean, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    this.appBundleId = paramString1;
    this.executionId = paramString2;
    this.installationId = paramString3;
    this.limitAdTrackingEnabled = paramBoolean;
    this.betaDeviceToken = paramString4;
    this.buildId = paramString5;
    this.osVersion = paramString6;
    this.deviceModel = paramString7;
    this.appVersionCode = paramString8;
    this.appVersionName = paramString9;
  }
  
  public String toString()
  {
    Object localObject1 = this.stringRepresentation;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("appBundleId=");
      Object localObject2 = this.appBundleId;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", executionId=");
      localObject2 = this.executionId;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", installationId=");
      localObject2 = this.installationId;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", limitAdTrackingEnabled=");
      localObject2 = this.limitAdTrackingEnabled;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", betaDeviceToken=");
      localObject2 = this.betaDeviceToken;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", buildId=");
      localObject2 = this.buildId;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", osVersion=");
      localObject2 = this.osVersion;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", deviceModel=");
      localObject2 = this.deviceModel;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", appVersionCode=");
      localObject2 = this.appVersionCode;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", appVersionName=");
      localObject2 = this.appVersionName;
      localObject1 = (String)localObject2;
      this.stringRepresentation = ((String)localObject1);
    }
    return this.stringRepresentation;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionEventMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */