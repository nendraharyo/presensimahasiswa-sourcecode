package com.crashlytics.android.core;

class CrashlyticsController$6
  implements CrashlyticsUncaughtExceptionHandler.CrashListener
{
  CrashlyticsController$6(CrashlyticsController paramCrashlyticsController) {}
  
  public void onUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider paramSettingsDataProvider, Thread paramThread, Throwable paramThrowable, boolean paramBoolean)
  {
    this.this$0.handleUncaughtException(paramSettingsDataProvider, paramThread, paramThrowable, paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */