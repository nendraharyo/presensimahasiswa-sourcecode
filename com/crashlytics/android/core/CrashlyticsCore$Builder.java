package com.crashlytics.android.core;

public class CrashlyticsCore$Builder
{
  private float delay = -1.0F;
  private boolean disabled = false;
  private CrashlyticsListener listener;
  private PinningInfoProvider pinningInfoProvider;
  
  public CrashlyticsCore build()
  {
    float f1 = this.delay;
    float f2 = 0.0F;
    boolean bool1 = f1 < 0.0F;
    if (bool1)
    {
      int i = 1065353216;
      f1 = 1.0F;
      this.delay = f1;
    }
    CrashlyticsCore localCrashlyticsCore = new com/crashlytics/android/core/CrashlyticsCore;
    f2 = this.delay;
    CrashlyticsListener localCrashlyticsListener = this.listener;
    PinningInfoProvider localPinningInfoProvider = this.pinningInfoProvider;
    boolean bool2 = this.disabled;
    localCrashlyticsCore.<init>(f2, localCrashlyticsListener, localPinningInfoProvider, bool2);
    return localCrashlyticsCore;
  }
  
  public Builder delay(float paramFloat)
  {
    boolean bool = paramFloat < 0.0F;
    Object localObject;
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("delay must be greater than 0");
      throw ((Throwable)localObject);
    }
    float f = this.delay;
    bool = f < 0.0F;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("delay already set.");
      throw ((Throwable)localObject);
    }
    this.delay = paramFloat;
    return this;
  }
  
  public Builder disabled(boolean paramBoolean)
  {
    this.disabled = paramBoolean;
    return this;
  }
  
  public Builder listener(CrashlyticsListener paramCrashlyticsListener)
  {
    if (paramCrashlyticsListener == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("listener must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.listener;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("listener already set.");
      throw ((Throwable)localObject);
    }
    this.listener = paramCrashlyticsListener;
    return this;
  }
  
  public Builder pinningInfo(PinningInfoProvider paramPinningInfoProvider)
  {
    if (paramPinningInfoProvider == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("pinningInfoProvider must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.pinningInfoProvider;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("pinningInfoProvider already set.");
      throw ((Throwable)localObject);
    }
    this.pinningInfoProvider = paramPinningInfoProvider;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsCore$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */