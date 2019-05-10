package com.crashlytics.android.answers;

import android.os.Bundle;

public class FirebaseAnalyticsEvent
{
  private final String eventName;
  private final Bundle eventParams;
  
  FirebaseAnalyticsEvent(String paramString, Bundle paramBundle)
  {
    this.eventName = paramString;
    this.eventParams = paramBundle;
  }
  
  public String getEventName()
  {
    return this.eventName;
  }
  
  public Bundle getEventParams()
  {
    return this.eventParams;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\FirebaseAnalyticsEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */