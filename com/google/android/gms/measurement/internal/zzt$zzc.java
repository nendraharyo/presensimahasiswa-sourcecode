package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.security.SecureRandom;

public final class zzt$zzc
{
  private final long zzTl;
  final String zzaXC;
  private final String zzaXD;
  private final String zzaXE;
  
  private zzt$zzc(zzt paramzzt, String paramString, long paramLong)
  {
    zzx.zzcM(paramString);
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzac(bool);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + ":start";
      this.zzaXC = ((String)localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + ":count";
      this.zzaXD = ((String)localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + ":value";
      this.zzaXE = ((String)localObject);
      this.zzTl = paramLong;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  private void zzlL()
  {
    this.zzaXA.zzjk();
    long l = this.zzaXA.zzjl().currentTimeMillis();
    SharedPreferences.Editor localEditor = zzt.zza(this.zzaXA).edit();
    String str = this.zzaXD;
    localEditor.remove(str);
    str = this.zzaXE;
    localEditor.remove(str);
    str = this.zzaXC;
    localEditor.putLong(str, l);
    localEditor.apply();
  }
  
  private long zzlM()
  {
    long l1 = 0L;
    zzt localzzt = this.zzaXA;
    localzzt.zzjk();
    long l2 = zzlO();
    boolean bool = l2 < l1;
    if (!bool) {
      zzlL();
    }
    for (;;)
    {
      return l1;
      zzmq localzzmq = this.zzaXA.zzjl();
      l1 = localzzmq.currentTimeMillis();
      l1 = Math.abs(l2 - l1);
    }
  }
  
  private long zzlO()
  {
    SharedPreferences localSharedPreferences = zzt.zzc(this.zzaXA);
    String str = this.zzaXC;
    return localSharedPreferences.getLong(str, 0L);
  }
  
  public void zzbq(String paramString)
  {
    zzf(paramString, 1L);
  }
  
  public void zzf(String paramString, long paramLong)
  {
    long l1 = Long.MAX_VALUE;
    long l2 = 0L;
    Object localObject1 = this.zzaXA;
    ((zzt)localObject1).zzjk();
    long l3 = zzlO();
    boolean bool = l3 < l2;
    if (!bool) {
      zzlL();
    }
    if (paramString == null) {
      paramString = "";
    }
    localObject1 = zzt.zza(this.zzaXA);
    Object localObject2 = this.zzaXD;
    long l4 = ((SharedPreferences)localObject1).getLong((String)localObject2, l2);
    bool = l4 < l2;
    if (!bool)
    {
      localObject1 = zzt.zza(this.zzaXA).edit();
      localObject2 = this.zzaXE;
      ((SharedPreferences.Editor)localObject1).putString((String)localObject2, paramString);
      localObject2 = this.zzaXD;
      ((SharedPreferences.Editor)localObject1).putLong((String)localObject2, paramLong);
      ((SharedPreferences.Editor)localObject1).apply();
      return;
    }
    localObject1 = zzt.zzb(this.zzaXA);
    l3 = ((SecureRandom)localObject1).nextLong() & l1;
    l2 = l4 + paramLong;
    l2 = l1 / l2 * paramLong;
    bool = l3 < l2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      localObject2 = zzt.zza(this.zzaXA).edit();
      if (bool)
      {
        localObject1 = this.zzaXE;
        ((SharedPreferences.Editor)localObject2).putString((String)localObject1, paramString);
      }
      localObject1 = this.zzaXD;
      l4 += paramLong;
      ((SharedPreferences.Editor)localObject2).putLong((String)localObject1, l4);
      ((SharedPreferences.Editor)localObject2).apply();
      break;
      bool = false;
      localObject1 = null;
    }
  }
  
  public Pair zzlN()
  {
    long l1 = 0L;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.zzaXA;
    ((zzt)localObject2).zzjk();
    long l2 = zzlM();
    long l3 = this.zzTl;
    boolean bool2 = l2 < l3;
    if (bool2) {}
    for (;;)
    {
      return (Pair)localObject1;
      l3 = this.zzTl;
      long l4 = 2;
      l3 *= l4;
      bool2 = l2 < l3;
      if (bool2)
      {
        zzlL();
      }
      else
      {
        localObject2 = zzt.zzc(this.zzaXA);
        Object localObject3 = this.zzaXE;
        localObject2 = ((SharedPreferences)localObject2).getString((String)localObject3, null);
        localObject1 = zzt.zzc(this.zzaXA);
        localObject3 = this.zzaXD;
        l2 = ((SharedPreferences)localObject1).getLong((String)localObject3, l1);
        zzlL();
        if (localObject2 != null)
        {
          bool1 = l2 < l1;
          if (bool1) {}
        }
        else
        {
          localObject1 = zzt.zzaXh;
          continue;
        }
        localObject1 = new android/util/Pair;
        localObject3 = Long.valueOf(l2);
        ((Pair)localObject1).<init>(localObject2, localObject3);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzt$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */