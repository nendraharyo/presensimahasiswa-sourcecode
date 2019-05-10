package com.google.android.gms.gcm;

import android.os.Bundle;

public class PeriodicTask$Builder
  extends Task.Builder
{
  private long zzaMa;
  private long zzaMb;
  
  public PeriodicTask$Builder()
  {
    this.zzaMa = l;
    this.zzaMb = l;
    this.isPersisted = true;
  }
  
  public PeriodicTask build()
  {
    checkConditions();
    PeriodicTask localPeriodicTask = new com/google/android/gms/gcm/PeriodicTask;
    localPeriodicTask.<init>(this, null);
    return localPeriodicTask;
  }
  
  protected void checkConditions()
  {
    long l1 = -1;
    super.checkConditions();
    long l2 = this.zzaMa;
    boolean bool = l2 < l1;
    IllegalArgumentException localIllegalArgumentException;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Must call setPeriod(long) to establish an execution interval for this periodic task.");
      throw localIllegalArgumentException;
    }
    l2 = this.zzaMa;
    long l3 = 0L;
    bool = l2 < l3;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Period set cannot be less or equal to 0: ");
      l3 = this.zzaMa;
      localObject = l3;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    l2 = this.zzaMb;
    bool = l2 < l1;
    if (!bool)
    {
      float f1 = (float)this.zzaMa;
      float f2 = 0.1F;
      f1 *= f2;
      l2 = f1;
      this.zzaMb = l2;
    }
    for (;;)
    {
      return;
      l2 = this.zzaMb;
      l3 = this.zzaMa;
      bool = l2 < l3;
      if (bool)
      {
        l2 = this.zzaMa;
        this.zzaMb = l2;
      }
    }
  }
  
  public Builder setExtras(Bundle paramBundle)
  {
    this.extras = paramBundle;
    return this;
  }
  
  public Builder setFlex(long paramLong)
  {
    this.zzaMb = paramLong;
    return this;
  }
  
  public Builder setPeriod(long paramLong)
  {
    this.zzaMa = paramLong;
    return this;
  }
  
  public Builder setPersisted(boolean paramBoolean)
  {
    this.isPersisted = paramBoolean;
    return this;
  }
  
  public Builder setRequiredNetwork(int paramInt)
  {
    this.requiredNetworkState = paramInt;
    return this;
  }
  
  public Builder setRequiresCharging(boolean paramBoolean)
  {
    this.requiresCharging = paramBoolean;
    return this;
  }
  
  public Builder setService(Class paramClass)
  {
    String str = paramClass.getName();
    this.gcmTaskService = str;
    return this;
  }
  
  public Builder setTag(String paramString)
  {
    this.tag = paramString;
    return this;
  }
  
  public Builder setUpdateCurrent(boolean paramBoolean)
  {
    this.updateCurrent = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\PeriodicTask$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */