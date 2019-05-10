package com.crashlytics.android.answers;

import android.os.Bundle;

public abstract interface EventLogger
{
  public abstract void logEvent(String paramString, Bundle paramBundle);
  
  public abstract void logEvent(String paramString1, String paramString2, Bundle paramBundle);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\EventLogger.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */