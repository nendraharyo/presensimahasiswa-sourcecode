package io.fabric.sdk.android.services.settings;

public class BetaSettingsData
{
  public final int updateSuspendDurationSeconds;
  public final String updateUrl;
  
  public BetaSettingsData(String paramString, int paramInt)
  {
    this.updateUrl = paramString;
    this.updateSuspendDurationSeconds = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\BetaSettingsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */