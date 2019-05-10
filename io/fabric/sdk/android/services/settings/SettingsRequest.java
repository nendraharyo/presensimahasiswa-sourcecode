package io.fabric.sdk.android.services.settings;

public class SettingsRequest
{
  public final String apiKey;
  public final String buildVersion;
  public final String deviceModel;
  public final String displayVersion;
  public final String iconHash;
  public final String installationId;
  public final String instanceId;
  public final String osBuildVersion;
  public final String osDisplayVersion;
  public final int source;
  
  public SettingsRequest(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt, String paramString9)
  {
    this.apiKey = paramString1;
    this.deviceModel = paramString2;
    this.osBuildVersion = paramString3;
    this.osDisplayVersion = paramString4;
    this.installationId = paramString5;
    this.instanceId = paramString6;
    this.displayVersion = paramString7;
    this.buildVersion = paramString8;
    this.source = paramInt;
    this.iconHash = paramString9;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\SettingsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */