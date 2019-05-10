package com.google.android.gms.gcm;

import android.os.Bundle;

public class OneoffTask$Builder
  extends Task.Builder
{
  private long zzaLY;
  private long zzaLZ;
  
  public OneoffTask$Builder()
  {
    this.zzaLY = l;
    this.zzaLZ = l;
    this.isPersisted = false;
  }
  
  public OneoffTask build()
  {
    checkConditions();
    OneoffTask localOneoffTask = new com/google/android/gms/gcm/OneoffTask;
    localOneoffTask.<init>(this, null);
    return localOneoffTask;
  }
  
  protected void checkConditions()
  {
    long l1 = -1;
    super.checkConditions();
    long l2 = this.zzaLY;
    boolean bool = l2 < l1;
    IllegalArgumentException localIllegalArgumentException;
    if (bool)
    {
      l2 = this.zzaLZ;
      bool = l2 < l1;
      if (bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Must specify an execution window using setExecutionWindow.");
      throw localIllegalArgumentException;
    }
    l2 = this.zzaLY;
    l1 = this.zzaLZ;
    bool = l2 < l1;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Window start must be shorter than window end.");
      throw localIllegalArgumentException;
    }
  }
  
  public Builder setExecutionWindow(long paramLong1, long paramLong2)
  {
    this.zzaLY = paramLong1;
    this.zzaLZ = paramLong2;
    return this;
  }
  
  public Builder setExtras(Bundle paramBundle)
  {
    this.extras = paramBundle;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\OneoffTask$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */