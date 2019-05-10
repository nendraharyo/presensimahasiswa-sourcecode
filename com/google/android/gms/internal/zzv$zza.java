package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

class zzv$zza
{
  public String key;
  public long zzaB;
  public String zzb;
  public long zzc;
  public long zzd;
  public long zze;
  public long zzf;
  public Map zzg;
  
  private zzv$zza() {}
  
  public zzv$zza(String paramString, zzb.zza paramzza)
  {
    this.key = paramString;
    long l = paramzza.data.length;
    this.zzaB = l;
    Object localObject = paramzza.zzb;
    this.zzb = ((String)localObject);
    l = paramzza.zzc;
    this.zzc = l;
    l = paramzza.zzd;
    this.zzd = l;
    l = paramzza.zze;
    this.zze = l;
    l = paramzza.zzf;
    this.zzf = l;
    localObject = paramzza.zzg;
    this.zzg = ((Map)localObject);
  }
  
  public static zza zzf(InputStream paramInputStream)
  {
    Object localObject1 = new com/google/android/gms/internal/zzv$zza;
    ((zza)localObject1).<init>();
    int i = zzv.zzb(paramInputStream);
    int j = 538247942;
    if (i != j)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    Object localObject2 = zzv.zzd(paramInputStream);
    ((zza)localObject1).key = ((String)localObject2);
    localObject2 = zzv.zzd(paramInputStream);
    ((zza)localObject1).zzb = ((String)localObject2);
    localObject2 = ((zza)localObject1).zzb;
    String str = "";
    boolean bool = ((String)localObject2).equals(str);
    if (bool)
    {
      bool = false;
      localObject2 = null;
      ((zza)localObject1).zzb = null;
    }
    long l = zzv.zzc(paramInputStream);
    ((zza)localObject1).zzc = l;
    l = zzv.zzc(paramInputStream);
    ((zza)localObject1).zzd = l;
    l = zzv.zzc(paramInputStream);
    ((zza)localObject1).zze = l;
    l = zzv.zzc(paramInputStream);
    ((zza)localObject1).zzf = l;
    localObject2 = zzv.zze(paramInputStream);
    ((zza)localObject1).zzg = ((Map)localObject2);
    return (zza)localObject1;
  }
  
  public boolean zza(OutputStream paramOutputStream)
  {
    bool = true;
    int i = 538247942;
    for (;;)
    {
      try
      {
        zzv.zza(paramOutputStream, i);
        localObject = this.key;
        zzv.zza(paramOutputStream, (String)localObject);
        localObject = this.zzb;
        if (localObject != null) {
          continue;
        }
        localObject = "";
        zzv.zza(paramOutputStream, (String)localObject);
        long l = this.zzc;
        zzv.zza(paramOutputStream, l);
        l = this.zzd;
        zzv.zza(paramOutputStream, l);
        l = this.zze;
        zzv.zza(paramOutputStream, l);
        l = this.zzf;
        zzv.zza(paramOutputStream, l);
        localObject = this.zzg;
        zzv.zza((Map)localObject, paramOutputStream);
        paramOutputStream.flush();
      }
      catch (IOException localIOException)
      {
        Object localObject;
        String str2 = "%s";
        Object[] arrayOfObject = new Object[bool];
        String str1 = localIOException.toString();
        arrayOfObject[0] = str1;
        zzs.zzb(str2, arrayOfObject);
        bool = false;
        arrayOfObject = null;
        continue;
      }
      return bool;
      localObject = this.zzb;
    }
  }
  
  public zzb.zza zzb(byte[] paramArrayOfByte)
  {
    zzb.zza localzza = new com/google/android/gms/internal/zzb$zza;
    localzza.<init>();
    localzza.data = paramArrayOfByte;
    Object localObject = this.zzb;
    localzza.zzb = ((String)localObject);
    long l = this.zzc;
    localzza.zzc = l;
    l = this.zzd;
    localzza.zzd = l;
    l = this.zze;
    localzza.zze = l;
    l = this.zzf;
    localzza.zzf = l;
    localObject = this.zzg;
    localzza.zzg = ((Map)localObject);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzv$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */