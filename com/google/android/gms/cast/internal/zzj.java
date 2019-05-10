package com.google.android.gms.cast.internal;

import android.os.IInterface;
import com.google.android.gms.cast.ApplicationMetadata;

public abstract interface zzj
  extends IInterface
{
  public abstract void onApplicationDisconnected(int paramInt);
  
  public abstract void zza(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract void zza(String paramString, double paramDouble, boolean paramBoolean);
  
  public abstract void zza(String paramString, long paramLong, int paramInt);
  
  public abstract void zzb(ApplicationStatus paramApplicationStatus);
  
  public abstract void zzb(DeviceStatus paramDeviceStatus);
  
  public abstract void zzb(String paramString, byte[] paramArrayOfByte);
  
  public abstract void zzbk(int paramInt);
  
  public abstract void zzbl(int paramInt);
  
  public abstract void zzbm(int paramInt);
  
  public abstract void zzbn(int paramInt);
  
  public abstract void zzc(String paramString, long paramLong);
  
  public abstract void zzt(String paramString1, String paramString2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */