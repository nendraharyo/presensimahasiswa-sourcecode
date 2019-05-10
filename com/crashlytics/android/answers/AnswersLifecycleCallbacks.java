package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;
import io.fabric.sdk.android.ActivityLifecycleManager.Callbacks;

class AnswersLifecycleCallbacks
  extends ActivityLifecycleManager.Callbacks
{
  private final SessionAnalyticsManager analyticsManager;
  private final BackgroundManager backgroundManager;
  
  public AnswersLifecycleCallbacks(SessionAnalyticsManager paramSessionAnalyticsManager, BackgroundManager paramBackgroundManager)
  {
    this.analyticsManager = paramSessionAnalyticsManager;
    this.backgroundManager = paramBackgroundManager;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    SessionAnalyticsManager localSessionAnalyticsManager = this.analyticsManager;
    SessionEvent.Type localType = SessionEvent.Type.PAUSE;
    localSessionAnalyticsManager.onLifecycle(paramActivity, localType);
    this.backgroundManager.onActivityPaused();
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    SessionAnalyticsManager localSessionAnalyticsManager = this.analyticsManager;
    SessionEvent.Type localType = SessionEvent.Type.RESUME;
    localSessionAnalyticsManager.onLifecycle(paramActivity, localType);
    this.backgroundManager.onActivityResumed();
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    SessionAnalyticsManager localSessionAnalyticsManager = this.analyticsManager;
    SessionEvent.Type localType = SessionEvent.Type.START;
    localSessionAnalyticsManager.onLifecycle(paramActivity, localType);
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    SessionAnalyticsManager localSessionAnalyticsManager = this.analyticsManager;
    SessionEvent.Type localType = SessionEvent.Type.STOP;
    localSessionAnalyticsManager.onLifecycle(paramActivity, localType);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersLifecycleCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */