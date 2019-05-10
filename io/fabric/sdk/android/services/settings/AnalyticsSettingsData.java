package io.fabric.sdk.android.services.settings;

public class AnalyticsSettingsData
{
  public static final int DEFAULT_SAMPLING_RATE = 1;
  public final String analyticsURL;
  public final int flushIntervalSeconds;
  public final boolean flushOnBackground;
  public final boolean forwardToFirebaseAnalytics;
  public final boolean includePurchaseEventsInForwardedEvents;
  public final int maxByteSizePerFile;
  public final int maxFileCountPerSend;
  public final int maxPendingSendFileCount;
  public final int samplingRate;
  public final boolean trackCustomEvents;
  public final boolean trackPredefinedEvents;
  
  public AnalyticsSettingsData(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    this(paramString, paramInt1, paramInt2, paramInt3, paramInt4, false, false, paramBoolean, true, 1, true);
  }
  
  public AnalyticsSettingsData(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
  {
    this(paramString, paramInt1, paramInt2, paramInt3, paramInt4, false, false, paramBoolean, true, paramInt5, true);
  }
  
  public AnalyticsSettingsData(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt5, boolean paramBoolean5)
  {
    this.analyticsURL = paramString;
    this.flushIntervalSeconds = paramInt1;
    this.maxByteSizePerFile = paramInt2;
    this.maxFileCountPerSend = paramInt3;
    this.maxPendingSendFileCount = paramInt4;
    this.forwardToFirebaseAnalytics = paramBoolean1;
    this.includePurchaseEventsInForwardedEvents = paramBoolean2;
    this.trackCustomEvents = paramBoolean3;
    this.trackPredefinedEvents = paramBoolean4;
    this.samplingRate = paramInt5;
    this.flushOnBackground = paramBoolean5;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\AnalyticsSettingsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */