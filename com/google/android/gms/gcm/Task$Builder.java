package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;

public abstract class Task$Builder
{
  protected Bundle extras;
  protected String gcmTaskService;
  protected boolean isPersisted;
  protected int requiredNetworkState;
  protected boolean requiresCharging;
  protected String tag;
  protected boolean updateCurrent;
  protected zzd zzaMn;
  
  public Task$Builder()
  {
    zzd localzzd = zzd.zzaMc;
    this.zzaMn = localzzd;
  }
  
  public abstract Task build();
  
  protected void checkConditions()
  {
    Object localObject = this.gcmTaskService;
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      String str = "Must provide an endpoint for this task by calling setService(ComponentName).";
      zzx.zzb(bool, str);
      GcmNetworkManager.zzdT(this.tag);
      localObject = this.zzaMn;
      Task.zza((zzd)localObject);
      bool = this.isPersisted;
      if (bool)
      {
        localObject = this.extras;
        Task.zzG((Bundle)localObject);
      }
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public abstract Builder setExtras(Bundle paramBundle);
  
  public abstract Builder setPersisted(boolean paramBoolean);
  
  public abstract Builder setRequiredNetwork(int paramInt);
  
  public abstract Builder setRequiresCharging(boolean paramBoolean);
  
  public abstract Builder setService(Class paramClass);
  
  public abstract Builder setTag(String paramString);
  
  public abstract Builder setUpdateCurrent(boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\Task$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */