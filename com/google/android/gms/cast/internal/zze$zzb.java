package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

class zze$zzb
  extends zzj.zza
{
  private final Handler mHandler;
  private final AtomicReference zzadU;
  
  public zze$zzb(zze paramzze)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>(paramzze);
    this.zzadU = ((AtomicReference)localObject);
    localObject = new android/os/Handler;
    Looper localLooper = paramzze.getLooper();
    ((Handler)localObject).<init>(localLooper);
    this.mHandler = ((Handler)localObject);
  }
  
  private void zza(zze paramzze, long paramLong, int paramInt)
  {
    synchronized (zze.zzg(paramzze))
    {
      Object localObject2 = zze.zzg(paramzze);
      Long localLong = Long.valueOf(paramLong);
      localObject2 = ((Map)localObject2).remove(localLong);
      localObject2 = (zza.zzb)localObject2;
      if (localObject2 != null)
      {
        ??? = new com/google/android/gms/common/api/Status;
        ((Status)???).<init>(paramInt);
        ((zza.zzb)localObject2).zzs(???);
      }
      return;
    }
  }
  
  private boolean zza(zze paramzze, int paramInt)
  {
    synchronized ()
    {
      zza.zzb localzzb = zze.zzh(paramzze);
      if (localzzb != null)
      {
        localzzb = zze.zzh(paramzze);
        Status localStatus = new com/google/android/gms/common/api/Status;
        localStatus.<init>(paramInt);
        localzzb.zzs(localStatus);
        bool = false;
        localzzb = null;
        zze.zzb(paramzze, null);
        bool = true;
        return bool;
      }
      boolean bool = false;
      localzzb = null;
    }
  }
  
  public boolean isDisposed()
  {
    Object localObject = this.zzadU.get();
    boolean bool;
    if (localObject == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public void onApplicationDisconnected(int paramInt)
  {
    Object localObject = null;
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      zze.zza(localzze, null);
      zze.zzb(localzze, null);
      zza(localzze, paramInt);
      localObject = zze.zzd(localzze);
      if (localObject != null)
      {
        localObject = this.mHandler;
        zze.zzb.1 local1 = new com/google/android/gms/cast/internal/zze$zzb$1;
        local1.<init>(this, localzze, paramInt);
        ((Handler)localObject).post(local1);
      }
    }
  }
  
  public void zza(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = this.zzadU.get();
    Object localObject3 = localObject1;
    localObject3 = (zze)localObject1;
    if (localObject3 == null) {}
    for (;;)
    {
      return;
      zze.zza((zze)localObject3, paramApplicationMetadata);
      localObject1 = paramApplicationMetadata.getApplicationId();
      zze.zza((zze)localObject3, (String)localObject1);
      zze.zzb((zze)localObject3, paramString2);
      synchronized (zze.zzoq())
      {
        localObject1 = zze.zzc((zze)localObject3);
        if (localObject1 != null)
        {
          zza.zzb localzzb = zze.zzc((zze)localObject3);
          localObject1 = new com/google/android/gms/cast/internal/zze$zza;
          Status localStatus = new com/google/android/gms/common/api/Status;
          localStatus.<init>(0);
          ((zze.zza)localObject1).<init>(localStatus, paramApplicationMetadata, paramString1, paramString2, paramBoolean);
          localzzb.zzs(localObject1);
          localObject1 = null;
          zze.zza((zze)localObject3, null);
        }
      }
    }
  }
  
  public void zza(String paramString, double paramDouble, boolean paramBoolean)
  {
    zzl localzzl = zze.zzop();
    Object[] arrayOfObject = new Object[0];
    localzzl.zzb("Deprecated callback: \"onStatusreceived\"", arrayOfObject);
  }
  
  public void zza(String paramString, long paramLong, int paramInt)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      zza(localzze, paramLong, paramInt);
    }
  }
  
  public void zzb(ApplicationStatus paramApplicationStatus)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      Object localObject = zze.zzop();
      Object[] arrayOfObject = new Object[0];
      ((zzl)localObject).zzb("onApplicationStatusChanged", arrayOfObject);
      localObject = this.mHandler;
      zze.zzb.3 local3 = new com/google/android/gms/cast/internal/zze$zzb$3;
      local3.<init>(this, localzze, paramApplicationStatus);
      ((Handler)localObject).post(local3);
    }
  }
  
  public void zzb(DeviceStatus paramDeviceStatus)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      Object localObject = zze.zzop();
      Object[] arrayOfObject = new Object[0];
      ((zzl)localObject).zzb("onDeviceStatusChanged", arrayOfObject);
      localObject = this.mHandler;
      zze.zzb.2 local2 = new com/google/android/gms/cast/internal/zze$zzb$2;
      local2.<init>(this, localzze, paramDeviceStatus);
      ((Handler)localObject).post(local2);
    }
  }
  
  public void zzb(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = (zze)this.zzadU.get();
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = zze.zzop();
      String str = "IGNORING: Receive (type=binary, ns=%s) <%d bytes>";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      int j = 1;
      int k = paramArrayOfByte.length;
      Integer localInteger = Integer.valueOf(k);
      arrayOfObject[j] = localInteger;
      ((zzl)localObject).zzb(str, arrayOfObject);
    }
  }
  
  public void zzbk(int paramInt)
  {
    zze localzze = zzos();
    if (localzze == null) {}
    for (;;)
    {
      return;
      zzl localzzl = zze.zzop();
      String str = "ICastDeviceControllerListener.onDisconnected: %d";
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      localzzl.zzb(str, arrayOfObject);
      if (paramInt != 0)
      {
        int j = 2;
        localzze.zzbS(j);
      }
    }
  }
  
  public void zzbl(int paramInt)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      synchronized (zze.zzoq())
      {
        zza.zzb localzzb = zze.zzc(localzze);
        if (localzzb != null)
        {
          localzzb = zze.zzc(localzze);
          zze.zza localzza = new com/google/android/gms/cast/internal/zze$zza;
          Status localStatus = new com/google/android/gms/common/api/Status;
          localStatus.<init>(paramInt);
          localzza.<init>(localStatus);
          localzzb.zzs(localzza);
          localzzb = null;
          zze.zza(localzze, null);
        }
      }
    }
  }
  
  public void zzbm(int paramInt)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      zza(localzze, paramInt);
    }
  }
  
  public void zzbn(int paramInt)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      zza(localzze, paramInt);
    }
  }
  
  public void zzc(String paramString, long paramLong)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      zza(localzze, paramLong, 0);
    }
  }
  
  public zze zzos()
  {
    zze localzze = (zze)this.zzadU.getAndSet(null);
    if (localzze == null) {
      localzze = null;
    }
    for (;;)
    {
      return localzze;
      zze.zzb(localzze);
    }
  }
  
  public void zzt(String paramString1, String paramString2)
  {
    zze localzze = (zze)this.zzadU.get();
    if (localzze == null) {}
    for (;;)
    {
      return;
      Object localObject = zze.zzop();
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString1;
      int j = 1;
      arrayOfObject[j] = paramString2;
      ((zzl)localObject).zzb("Receive (type=text, ns=%s) %s", arrayOfObject);
      localObject = this.mHandler;
      zze.zzb.4 local4 = new com/google/android/gms/cast/internal/zze$zzb$4;
      local4.<init>(this, localzze, paramString1, paramString2);
      ((Handler)localObject).post(local4);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zze$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */