package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class zziw$zzb
  extends zzk
{
  private final zziw.zza zzMD;
  private final zzm.zzb zzaG;
  
  public zziw$zzb(String paramString, zziw.zza paramzza, zzm.zzb paramzzb)
  {
    super(0, paramString, local1);
    this.zzMD = paramzza;
    this.zzaG = paramzzb;
  }
  
  protected zzm zza(zzi paramzzi)
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    Object localObject = paramzzi.data;
    localByteArrayInputStream.<init>((byte[])localObject);
    localObject = zzx.zzb(paramzzi);
    return zzm.zza(localByteArrayInputStream, (zzb.zza)localObject);
  }
  
  protected void zzj(InputStream paramInputStream)
  {
    zzm.zzb localzzb = this.zzaG;
    Object localObject = this.zzMD.zzh(paramInputStream);
    localzzb.zzb(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziw$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */