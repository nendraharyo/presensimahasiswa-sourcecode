package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zzg
  implements zzk
{
  private final zzl zzahj;
  private boolean zzahk = false;
  
  public zzg(zzl paramzzl)
  {
    this.zzahj = paramzzl;
  }
  
  private void zza(zzj.zze paramzze)
  {
    this.zzahj.zzagW.zzb(paramzze);
    Object localObject1 = this.zzahj.zzagW;
    Object localObject2 = paramzze.zzoR();
    localObject1 = ((zzj)localObject1).zza((Api.zzc)localObject2);
    boolean bool = ((Api.zzb)localObject1).isConnected();
    if (!bool)
    {
      localObject2 = this.zzahj.zzaio;
      Api.zzc localzzc = paramzze.zzoR();
      bool = ((Map)localObject2).containsKey(localzzc);
      if (bool)
      {
        localObject1 = new com/google/android/gms/common/api/Status;
        int i = 17;
        ((Status)localObject1).<init>(i);
        paramzze.zzw((Status)localObject1);
      }
    }
    for (;;)
    {
      return;
      paramzze.zzb((Api.zzb)localObject1);
    }
  }
  
  public void begin() {}
  
  public void connect()
  {
    boolean bool = this.zzahk;
    if (bool)
    {
      bool = false;
      this.zzahk = false;
      zzl localzzl = this.zzahj;
      zzg.2 local2 = new com/google/android/gms/common/api/internal/zzg$2;
      local2.<init>(this, this);
      localzzl.zza(local2);
    }
  }
  
  public boolean disconnect()
  {
    boolean bool1 = true;
    zzl localzzl = null;
    boolean bool2 = this.zzahk;
    Object localObject1;
    if (bool2)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool1;
      Object localObject2 = this.zzahj.zzagW;
      bool2 = ((zzj)localObject2).zzpG();
      if (bool2)
      {
        this.zzahk = bool1;
        localObject1 = this.zzahj.zzagW.zzaia;
        localObject2 = ((Set)localObject1).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (zzx)((Iterator)localObject2).next();
          ((zzx)localObject1).zzpU();
        }
        bool1 = false;
        localObject1 = null;
      }
      else
      {
        localzzl = this.zzahj;
        bool2 = false;
        localObject2 = null;
        localzzl.zzh(null);
      }
    }
  }
  
  public void onConnected(Bundle paramBundle) {}
  
  public void onConnectionSuspended(int paramInt)
  {
    this.zzahj.zzh(null);
    zzp.zza localzza = this.zzahj.zzais;
    boolean bool = this.zzahk;
    localzza.zzc(paramInt, bool);
  }
  
  public zza.zza zza(zza.zza paramzza)
  {
    return zzb(paramzza);
  }
  
  public void zza(ConnectionResult paramConnectionResult, Api paramApi, int paramInt) {}
  
  public zza.zza zzb(zza.zza paramzza)
  {
    try
    {
      zza(paramzza);
      return paramzza;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      for (;;)
      {
        zzl localzzl = this.zzahj;
        zzg.1 local1 = new com/google/android/gms/common/api/internal/zzg$1;
        local1.<init>(this, this);
        localzzl.zza(local1);
      }
    }
  }
  
  void zzps()
  {
    boolean bool = this.zzahk;
    if (bool)
    {
      this.zzahk = false;
      zzj localzzj = this.zzahj.zzagW;
      localzzj.zzaa(false);
      disconnect();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */