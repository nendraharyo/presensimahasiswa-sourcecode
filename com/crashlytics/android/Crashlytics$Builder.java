package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsCore.Builder;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;

public class Crashlytics$Builder
{
  private Answers answers;
  private Beta beta;
  private CrashlyticsCore core;
  private CrashlyticsCore.Builder coreBuilder;
  
  private CrashlyticsCore.Builder getCoreBuilder()
  {
    try
    {
      CrashlyticsCore.Builder localBuilder = this.coreBuilder;
      if (localBuilder == null)
      {
        localBuilder = new com/crashlytics/android/core/CrashlyticsCore$Builder;
        localBuilder.<init>();
        this.coreBuilder = localBuilder;
      }
      localBuilder = this.coreBuilder;
      return localBuilder;
    }
    finally {}
  }
  
  public Builder answers(Answers paramAnswers)
  {
    if (paramAnswers == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("Answers Kit must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.answers;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Answers Kit already set.");
      throw ((Throwable)localObject);
    }
    this.answers = paramAnswers;
    return this;
  }
  
  public Builder beta(Beta paramBeta)
  {
    if (paramBeta == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("Beta Kit must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.beta;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Beta Kit already set.");
      throw ((Throwable)localObject);
    }
    this.beta = paramBeta;
    return this;
  }
  
  public Crashlytics build()
  {
    Object localObject = this.coreBuilder;
    if (localObject != null)
    {
      localObject = this.core;
      if (localObject != null)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
        throw ((Throwable)localObject);
      }
      localObject = this.coreBuilder.build();
      this.core = ((CrashlyticsCore)localObject);
    }
    localObject = this.answers;
    if (localObject == null)
    {
      localObject = new com/crashlytics/android/answers/Answers;
      ((Answers)localObject).<init>();
      this.answers = ((Answers)localObject);
    }
    localObject = this.beta;
    if (localObject == null)
    {
      localObject = new com/crashlytics/android/beta/Beta;
      ((Beta)localObject).<init>();
      this.beta = ((Beta)localObject);
    }
    localObject = this.core;
    if (localObject == null)
    {
      localObject = new com/crashlytics/android/core/CrashlyticsCore;
      ((CrashlyticsCore)localObject).<init>();
      this.core = ((CrashlyticsCore)localObject);
    }
    localObject = new com/crashlytics/android/Crashlytics;
    Answers localAnswers = this.answers;
    Beta localBeta = this.beta;
    CrashlyticsCore localCrashlyticsCore = this.core;
    ((Crashlytics)localObject).<init>(localAnswers, localBeta, localCrashlyticsCore);
    return (Crashlytics)localObject;
  }
  
  public Builder core(CrashlyticsCore paramCrashlyticsCore)
  {
    if (paramCrashlyticsCore == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("CrashlyticsCore Kit must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.core;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("CrashlyticsCore Kit already set.");
      throw ((Throwable)localObject);
    }
    this.core = paramCrashlyticsCore;
    return this;
  }
  
  public Builder delay(float paramFloat)
  {
    getCoreBuilder().delay(paramFloat);
    return this;
  }
  
  public Builder disabled(boolean paramBoolean)
  {
    getCoreBuilder().disabled(paramBoolean);
    return this;
  }
  
  public Builder listener(CrashlyticsListener paramCrashlyticsListener)
  {
    getCoreBuilder().listener(paramCrashlyticsListener);
    return this;
  }
  
  public Builder pinningInfo(PinningInfoProvider paramPinningInfoProvider)
  {
    getCoreBuilder().pinningInfo(paramPinningInfoProvider);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\Crashlytics$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */