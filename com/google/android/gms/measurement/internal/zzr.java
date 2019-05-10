package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.zzx;

class zzr
  extends BroadcastReceiver
{
  static final String zzSZ = zzr.class.getName();
  private boolean zzTa;
  private boolean zzTb;
  private final zzw zzaTV;
  
  zzr(zzw paramzzw)
  {
    zzx.zzz(paramzzw);
    this.zzaTV = paramzzw;
  }
  
  private Context getContext()
  {
    return this.zzaTV.getContext();
  }
  
  private zzp zzAo()
  {
    return this.zzaTV.zzAo();
  }
  
  public boolean isRegistered()
  {
    this.zzaTV.zzjk();
    return this.zzTa;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    this.zzaTV.zzjv();
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = zzAo().zzCK();
    Object localObject3 = "NetworkBroadcastReceiver received action";
    ((zzp.zza)localObject2).zzj((String)localObject3, localObject1);
    localObject2 = "android.net.conn.CONNECTIVITY_CHANGE";
    boolean bool1 = ((String)localObject2).equals(localObject1);
    if (bool1)
    {
      localObject1 = this.zzaTV.zzCW();
      boolean bool2 = ((zzq)localObject1).zzlB();
      bool1 = this.zzTb;
      if (bool1 != bool2)
      {
        this.zzTb = bool2;
        localObject2 = this.zzaTV.zzCn();
        localObject3 = new com/google/android/gms/measurement/internal/zzr$1;
        ((zzr.1)localObject3).<init>(this, bool2);
        ((zzv)localObject2).zzg((Runnable)localObject3);
      }
    }
    for (;;)
    {
      return;
      localObject2 = zzAo().zzCF();
      localObject3 = "NetworkBroadcastReceiver received unknown action";
      ((zzp.zza)localObject2).zzj((String)localObject3, localObject1);
    }
  }
  
  public void unregister()
  {
    String str = null;
    this.zzaTV.zzjv();
    Object localObject1 = this.zzaTV;
    ((zzw)localObject1).zzjk();
    boolean bool = isRegistered();
    if (!bool) {}
    for (;;)
    {
      return;
      localObject1 = zzAo().zzCK();
      Object localObject2 = "Unregistering connectivity change receiver";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
      this.zzTa = false;
      this.zzTb = false;
      localObject1 = getContext();
      try
      {
        ((Context)localObject1).unregisterReceiver(this);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject2 = zzAo().zzCE();
        str = "Failed to unregister the network broadcast receiver";
        ((zzp.zza)localObject2).zzj(str, localIllegalArgumentException);
      }
    }
  }
  
  public void zzly()
  {
    this.zzaTV.zzjv();
    Object localObject1 = this.zzaTV;
    ((zzw)localObject1).zzjk();
    boolean bool1 = this.zzTa;
    if (bool1) {}
    for (;;)
    {
      return;
      localObject1 = getContext();
      Object localObject2 = new android/content/IntentFilter;
      ((IntentFilter)localObject2).<init>("android.net.conn.CONNECTIVITY_CHANGE");
      ((Context)localObject1).registerReceiver(this, (IntentFilter)localObject2);
      bool1 = this.zzaTV.zzCW().zzlB();
      this.zzTb = bool1;
      localObject1 = zzAo().zzCK();
      localObject2 = "Registering connectivity change receiver. Network connected";
      boolean bool2 = this.zzTb;
      Boolean localBoolean = Boolean.valueOf(bool2);
      ((zzp.zza)localObject1).zzj((String)localObject2, localBoolean);
      bool1 = true;
      this.zzTa = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */