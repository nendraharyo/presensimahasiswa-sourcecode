package com.google.android.gms.measurement.internal;

import android.support.v4.h.a;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpz.zza;
import com.google.android.gms.internal.zzqa.zza;
import com.google.android.gms.internal.zzqa.zzb;
import com.google.android.gms.internal.zzqa.zzc;
import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import java.io.IOException;
import java.util.Map;

public class zzu
  extends zzz
{
  private final Map zzaXF;
  private final Map zzaXG;
  private final Map zzaXH;
  
  zzu(zzw paramzzw)
  {
    super(paramzzw);
    a locala = new android/support/v4/h/a;
    locala.<init>();
    this.zzaXF = locala;
    locala = new android/support/v4/h/a;
    locala.<init>();
    this.zzaXG = locala;
    locala = new android/support/v4/h/a;
    locala.<init>();
    this.zzaXH = locala;
  }
  
  private Map zza(zzqa.zzb paramzzb)
  {
    a locala = new android/support/v4/h/a;
    locala.<init>();
    if (paramzzb != null)
    {
      zzqa.zzc[] arrayOfzzc1 = paramzzb.zzaZV;
      if (arrayOfzzc1 != null)
      {
        zzqa.zzc[] arrayOfzzc2 = paramzzb.zzaZV;
        int i = arrayOfzzc2.length;
        int j = 0;
        arrayOfzzc1 = null;
        while (j < i)
        {
          Object localObject = arrayOfzzc2[j];
          if (localObject != null)
          {
            String str = ((zzqa.zzc)localObject).key;
            localObject = ((zzqa.zzc)localObject).value;
            locala.put(str, localObject);
          }
          j += 1;
        }
      }
    }
    return locala;
  }
  
  private Map zzb(zzqa.zzb paramzzb)
  {
    a locala = new android/support/v4/h/a;
    locala.<init>();
    if (paramzzb != null)
    {
      zzqa.zza[] arrayOfzza1 = paramzzb.zzaZW;
      if (arrayOfzza1 != null)
      {
        zzqa.zza[] arrayOfzza2 = paramzzb.zzaZW;
        int i = arrayOfzza2.length;
        int j = 0;
        arrayOfzza1 = null;
        while (j < i)
        {
          Object localObject = arrayOfzza2[j];
          if (localObject != null)
          {
            String str = ((zzqa.zza)localObject).name;
            localObject = ((zzqa.zza)localObject).zzaZS;
            locala.put(str, localObject);
          }
          j += 1;
        }
      }
    }
    return locala;
  }
  
  private zzqa.zzb zzf(String paramString, byte[] paramArrayOfByte)
  {
    zzqa.zzb localzzb;
    if (paramArrayOfByte == null)
    {
      localzzb = new com/google/android/gms/internal/zzqa$zzb;
      localzzb.<init>();
    }
    for (;;)
    {
      return localzzb;
      Object localObject2 = zzsm.zzD(paramArrayOfByte);
      localzzb = new com/google/android/gms/internal/zzqa$zzb;
      localzzb.<init>();
      try
      {
        localzzb.zzA((zzsm)localObject2);
        localObject2 = zzAo();
        localObject2 = ((zzp)localObject2).zzCK();
        str1 = "Parsed config. version, gmp_app_id";
        Long localLong = localzzb.zzaZT;
        String str2 = localzzb.zzaVt;
        ((zzp.zza)localObject2).zze(str1, localLong, str2);
      }
      catch (IOException localIOException)
      {
        localObject2 = zzAo().zzCF();
        String str1 = "Unable to merge remote config";
        ((zzp.zza)localObject2).zze(str1, paramString, localIOException);
        Object localObject1 = null;
      }
    }
  }
  
  private void zzfj(String paramString)
  {
    Map localMap1 = null;
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    Object localObject = this.zzaXH;
    boolean bool = ((Map)localObject).containsKey(paramString);
    if (!bool)
    {
      localObject = zzCj().zzfa(paramString);
      if (localObject != null) {
        break label86;
      }
      this.zzaXF.put(paramString, null);
      this.zzaXG.put(paramString, null);
      localObject = this.zzaXH;
      ((Map)localObject).put(paramString, null);
    }
    for (;;)
    {
      return;
      label86:
      localObject = zzf(paramString, (byte[])localObject);
      localMap1 = this.zzaXF;
      Map localMap2 = zza((zzqa.zzb)localObject);
      localMap1.put(paramString, localMap2);
      localMap1 = this.zzaXG;
      localMap2 = zzb((zzqa.zzb)localObject);
      localMap1.put(paramString, localMap2);
      localMap1 = this.zzaXH;
      localMap1.put(paramString, localObject);
    }
  }
  
  String zzO(String paramString1, String paramString2)
  {
    zzjk();
    zzfj(paramString1);
    Object localObject = (Map)this.zzaXF.get(paramString1);
    if (localObject != null) {}
    for (localObject = (String)((Map)localObject).get(paramString2);; localObject = null) {
      return (String)localObject;
    }
  }
  
  boolean zzP(String paramString1, String paramString2)
  {
    zzjk();
    zzfj(paramString1);
    Object localObject = (Map)this.zzaXG.get(paramString1);
    boolean bool;
    if (localObject != null)
    {
      localObject = (Boolean)((Map)localObject).get(paramString2);
      if (localObject == null)
      {
        bool = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      continue;
      bool = false;
      localObject = null;
    }
  }
  
  protected boolean zze(String paramString, byte[] paramArrayOfByte)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    localObject1 = zzf(paramString, paramArrayOfByte);
    boolean bool;
    Object localObject2;
    if (localObject1 == null)
    {
      bool = false;
      localObject2 = null;
    }
    for (;;)
    {
      return bool;
      localObject2 = this.zzaXG;
      localObject3 = zzb((zzqa.zzb)localObject1);
      ((Map)localObject2).put(paramString, localObject3);
      this.zzaXH.put(paramString, localObject1);
      localObject2 = this.zzaXF;
      localObject3 = zza((zzqa.zzb)localObject1);
      ((Map)localObject2).put(paramString, localObject3);
      localObject2 = zzCe();
      localObject3 = ((zzqa.zzb)localObject1).zzaZX;
      ((zzc)localObject2).zza(paramString, (zzpz.zza[])localObject3);
      bool = false;
      localObject2 = null;
      try
      {
        ((zzqa.zzb)localObject1).zzaZX = null;
        i = ((zzqa.zzb)localObject1).getSerializedSize();
        localObject2 = new byte[i];
        localObject3 = zzsn.zzE((byte[])localObject2);
        ((zzqa.zzb)localObject1).writeTo((zzsn)localObject3);
        paramArrayOfByte = (byte[])localObject2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          int i;
          localObject1 = zzAo().zzCF();
          localObject3 = "Unable to serialize reduced-size config.  Storing full config instead.";
          ((zzp.zza)localObject1).zzj((String)localObject3, localIOException);
        }
      }
      localObject2 = zzCj();
      ((zze)localObject2).zzd(paramString, paramArrayOfByte);
      i = 1;
    }
  }
  
  protected zzqa.zzb zzfk(String paramString)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    zzfj(paramString);
    return (zzqa.zzb)this.zzaXH.get(paramString);
  }
  
  protected void zziJ() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */