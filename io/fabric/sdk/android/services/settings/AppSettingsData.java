package io.fabric.sdk.android.services.settings;

public class AppSettingsData
{
  public static final String STATUS_ACTIVATED = "activated";
  public static final String STATUS_CONFIGURED = "configured";
  public static final String STATUS_NEW = "new";
  public final AppIconSettingsData icon;
  public final String identifier;
  public final String ndkReportsUrl;
  public final String reportsUrl;
  public final String status;
  public final boolean updateRequired;
  public final String url;
  
  public AppSettingsData(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, AppIconSettingsData paramAppIconSettingsData)
  {
    this.identifier = paramString1;
    this.status = paramString2;
    this.url = paramString3;
    this.reportsUrl = paramString4;
    this.ndkReportsUrl = paramString5;
    this.updateRequired = paramBoolean;
    this.icon = paramAppIconSettingsData;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\AppSettingsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */