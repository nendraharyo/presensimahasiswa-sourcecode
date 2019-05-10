package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.zzb;
import java.util.HashSet;
import java.util.Set;

final class zzm$zzb
{
  private int mState;
  private IBinder zzakD;
  private ComponentName zzamc;
  private final zzm.zzb.zza zzamd;
  private final Set zzame;
  private boolean zzamf;
  private final zzm.zza zzamg;
  
  public zzm$zzb(zzm paramzzm, zzm.zza paramzza)
  {
    this.zzamg = paramzza;
    Object localObject = new com/google/android/gms/common/internal/zzm$zzb$zza;
    ((zzm.zzb.zza)localObject).<init>(this);
    this.zzamd = ((zzm.zzb.zza)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzame = ((Set)localObject);
    this.mState = 2;
  }
  
  public IBinder getBinder()
  {
    return this.zzakD;
  }
  
  public ComponentName getComponentName()
  {
    return this.zzamc;
  }
  
  public int getState()
  {
    return this.mState;
  }
  
  public boolean isBound()
  {
    return this.zzamf;
  }
  
  public void zza(ServiceConnection paramServiceConnection, String paramString)
  {
    zzb localzzb = zzm.zzc(this.zzamh);
    Context localContext = zzm.zzb(this.zzamh);
    Intent localIntent = this.zzamg.zzqS();
    localzzb.zza(localContext, paramServiceConnection, paramString, localIntent);
    this.zzame.add(paramServiceConnection);
  }
  
  public boolean zza(ServiceConnection paramServiceConnection)
  {
    return this.zzame.contains(paramServiceConnection);
  }
  
  public void zzb(ServiceConnection paramServiceConnection, String paramString)
  {
    zzb localzzb = zzm.zzc(this.zzamh);
    Context localContext = zzm.zzb(this.zzamh);
    localzzb.zzb(localContext, paramServiceConnection);
    this.zzame.remove(paramServiceConnection);
  }
  
  public void zzcH(String paramString)
  {
    this.mState = 3;
    Object localObject1 = zzm.zzc(this.zzamh);
    Object localObject2 = zzm.zzb(this.zzamh);
    Intent localIntent = this.zzamg.zzqS();
    zzm.zzb.zza localzza = this.zzamd;
    int i = 129;
    Object localObject3 = paramString;
    boolean bool = ((zzb)localObject1).zza((Context)localObject2, paramString, localIntent, localzza, i);
    this.zzamf = bool;
    bool = this.zzamf;
    if (!bool)
    {
      int j = 2;
      this.mState = j;
    }
    try
    {
      localObject1 = this.zzamh;
      localObject1 = zzm.zzc((zzm)localObject1);
      localObject2 = this.zzamh;
      localObject2 = zzm.zzb((zzm)localObject2);
      localObject3 = this.zzamd;
      ((zzb)localObject1).zza((Context)localObject2, (ServiceConnection)localObject3);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public void zzcI(String paramString)
  {
    zzb localzzb = zzm.zzc(this.zzamh);
    Context localContext = zzm.zzb(this.zzamh);
    zzm.zzb.zza localzza = this.zzamd;
    localzzb.zza(localContext, localzza);
    this.zzamf = false;
    this.mState = 2;
  }
  
  public boolean zzqT()
  {
    return this.zzame.isEmpty();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzm$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */