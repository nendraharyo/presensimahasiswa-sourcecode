package io.fabric.sdk.android.services.settings;

public class FeaturesSettingsData
{
  public final boolean collectAnalytics;
  public final boolean collectLoggedException;
  public final boolean collectReports;
  public final boolean firebaseCrashlyticsEnabled;
  public final boolean promptEnabled;
  
  public FeaturesSettingsData(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    this.promptEnabled = paramBoolean1;
    this.collectLoggedException = paramBoolean2;
    this.collectReports = paramBoolean3;
    this.collectAnalytics = paramBoolean4;
    this.firebaseCrashlyticsEnabled = paramBoolean5;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\FeaturesSettingsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */