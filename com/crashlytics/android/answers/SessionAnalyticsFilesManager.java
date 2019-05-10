package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import io.fabric.sdk.android.services.events.EventsStorage;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.UUID;

class SessionAnalyticsFilesManager
  extends EventsFilesManager
{
  private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
  private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
  private AnalyticsSettingsData analyticsSettingsData;
  
  SessionAnalyticsFilesManager(Context paramContext, SessionEventTransform paramSessionEventTransform, CurrentTimeProvider paramCurrentTimeProvider, EventsStorage paramEventsStorage)
  {
    super(paramContext, paramSessionEventTransform, paramCurrentTimeProvider, paramEventsStorage, 100);
  }
  
  protected String generateUniqueRollOverFileName()
  {
    Object localObject = UUID.randomUUID();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("sa").append("_");
    localObject = ((UUID)localObject).toString();
    localObject = localStringBuilder.append((String)localObject).append("_");
    long l = this.currentTimeProvider.getCurrentTimeMillis();
    return l + ".tap";
  }
  
  protected int getMaxByteSizePerFile()
  {
    AnalyticsSettingsData localAnalyticsSettingsData = this.analyticsSettingsData;
    if (localAnalyticsSettingsData == null) {}
    for (int i = super.getMaxByteSizePerFile();; i = localAnalyticsSettingsData.maxByteSizePerFile)
    {
      return i;
      localAnalyticsSettingsData = this.analyticsSettingsData;
    }
  }
  
  protected int getMaxFilesToKeep()
  {
    AnalyticsSettingsData localAnalyticsSettingsData = this.analyticsSettingsData;
    if (localAnalyticsSettingsData == null) {}
    for (int i = super.getMaxFilesToKeep();; i = localAnalyticsSettingsData.maxPendingSendFileCount)
    {
      return i;
      localAnalyticsSettingsData = this.analyticsSettingsData;
    }
  }
  
  void setAnalyticsSettingsData(AnalyticsSettingsData paramAnalyticsSettingsData)
  {
    this.analyticsSettingsData = paramAnalyticsSettingsData;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionAnalyticsFilesManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */