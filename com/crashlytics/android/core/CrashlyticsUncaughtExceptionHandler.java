package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsUncaughtExceptionHandler
  implements Thread.UncaughtExceptionHandler
{
  private final CrashlyticsUncaughtExceptionHandler.CrashListener crashListener;
  private final Thread.UncaughtExceptionHandler defaultHandler;
  private final boolean firebaseCrashlyticsClientFlag;
  private final AtomicBoolean isHandlingException;
  private final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider;
  
  public CrashlyticsUncaughtExceptionHandler(CrashlyticsUncaughtExceptionHandler.CrashListener paramCrashListener, CrashlyticsUncaughtExceptionHandler.SettingsDataProvider paramSettingsDataProvider, boolean paramBoolean, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.crashListener = paramCrashListener;
    this.settingsDataProvider = paramSettingsDataProvider;
    this.firebaseCrashlyticsClientFlag = paramBoolean;
    this.defaultHandler = paramUncaughtExceptionHandler;
    AtomicBoolean localAtomicBoolean = new java/util/concurrent/atomic/AtomicBoolean;
    localAtomicBoolean.<init>(false);
    this.isHandlingException = localAtomicBoolean;
  }
  
  boolean isHandlingException()
  {
    return this.isHandlingException.get();
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object localObject1 = this.isHandlingException;
    boolean bool1 = true;
    ((AtomicBoolean)localObject1).set(bool1);
    try
    {
      localObject1 = this.crashListener;
      localObject4 = this.settingsDataProvider;
      boolean bool2 = this.firebaseCrashlyticsClientFlag;
      ((CrashlyticsUncaughtExceptionHandler.CrashListener)localObject1).onUncaughtException((CrashlyticsUncaughtExceptionHandler.SettingsDataProvider)localObject4, paramThread, paramThrowable, bool2);
      localObject1 = Fabric.getLogger();
      localObject4 = "CrashlyticsCore";
      str1 = "Crashlytics completed exception processing. Invoking default exception handler.";
      ((Logger)localObject1).d((String)localObject4, str1);
      this.defaultHandler.uncaughtException(paramThread, paramThrowable);
      localObject1 = this.isHandlingException;
      ((AtomicBoolean)localObject1).set(false);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject4 = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "An error occurred in the uncaught exception handler";
        ((Logger)localObject4).e(str1, str2, localException);
        Object localObject2 = Fabric.getLogger();
        localObject4 = "CrashlyticsCore";
        str1 = "Crashlytics completed exception processing. Invoking default exception handler.";
        ((Logger)localObject2).d((String)localObject4, str1);
        this.defaultHandler.uncaughtException(paramThread, paramThrowable);
        localObject2 = this.isHandlingException;
        ((AtomicBoolean)localObject2).set(false);
      }
    }
    finally
    {
      Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
      this.defaultHandler.uncaughtException(paramThread, paramThrowable);
      this.isHandlingException.set(false);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */