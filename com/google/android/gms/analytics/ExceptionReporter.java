package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.zzae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class ExceptionReporter
  implements Thread.UncaughtExceptionHandler
{
  private final Context mContext;
  private final Thread.UncaughtExceptionHandler zzPa;
  private final Tracker zzPb;
  private ExceptionParser zzPc;
  private GoogleAnalytics zzPd;
  
  public ExceptionReporter(Tracker paramTracker, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, Context paramContext)
  {
    if (paramTracker == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("tracker cannot be null");
      throw ((Throwable)localObject1);
    }
    if (paramContext == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("context cannot be null");
      throw ((Throwable)localObject1);
    }
    this.zzPa = paramUncaughtExceptionHandler;
    this.zzPb = paramTracker;
    Object localObject1 = new com/google/android/gms/analytics/StandardExceptionParser;
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    ((StandardExceptionParser)localObject1).<init>(paramContext, (Collection)localObject2);
    this.zzPc = ((ExceptionParser)localObject1);
    localObject1 = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append("ExceptionReporter created, original handler is ");
    if (paramUncaughtExceptionHandler == null) {}
    for (localObject1 = "null";; localObject1 = paramUncaughtExceptionHandler.getClass().getName())
    {
      zzae.v((String)localObject1);
      return;
    }
  }
  
  public ExceptionParser getExceptionParser()
  {
    return this.zzPc;
  }
  
  public void setExceptionParser(ExceptionParser paramExceptionParser)
  {
    this.zzPc = paramExceptionParser;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object localObject1 = "UncaughtException";
    Object localObject2 = this.zzPc;
    if (localObject2 != null) {
      if (paramThread == null) {
        break label149;
      }
    }
    label149:
    for (localObject1 = paramThread.getName();; localObject1 = null)
    {
      localObject2 = this.zzPc;
      localObject1 = ((ExceptionParser)localObject2).getDescription((String)localObject1, paramThrowable);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      zzae.v("Reporting uncaught exception: " + (String)localObject1);
      localObject2 = this.zzPb;
      HitBuilders.ExceptionBuilder localExceptionBuilder = new com/google/android/gms/analytics/HitBuilders$ExceptionBuilder;
      localExceptionBuilder.<init>();
      localObject1 = localExceptionBuilder.setDescription((String)localObject1);
      boolean bool = true;
      localObject1 = ((HitBuilders.ExceptionBuilder)localObject1).setFatal(bool).build();
      ((Tracker)localObject2).send((Map)localObject1);
      localObject1 = zziC();
      ((GoogleAnalytics)localObject1).dispatchLocalHits();
      ((GoogleAnalytics)localObject1).zziG();
      localObject1 = this.zzPa;
      if (localObject1 != null)
      {
        zzae.v("Passing exception to the original handler");
        localObject1 = this.zzPa;
        ((Thread.UncaughtExceptionHandler)localObject1).uncaughtException(paramThread, paramThrowable);
      }
      return;
    }
  }
  
  GoogleAnalytics zziC()
  {
    GoogleAnalytics localGoogleAnalytics = this.zzPd;
    if (localGoogleAnalytics == null)
    {
      localGoogleAnalytics = GoogleAnalytics.getInstance(this.mContext);
      this.zzPd = localGoogleAnalytics;
    }
    return this.zzPd;
  }
  
  Thread.UncaughtExceptionHandler zziD()
  {
    return this.zzPa;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\ExceptionReporter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */