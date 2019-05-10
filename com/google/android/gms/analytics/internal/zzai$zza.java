package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.util.UUID;

public final class zzai$zza
{
  private final String mName;
  private final long zzTl;
  
  private zzai$zza(zzai paramzzai, String paramString, long paramLong)
  {
    zzx.zzcM(paramString);
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      zzx.zzac(bool);
      this.mName = paramString;
      this.zzTl = paramLong;
      return;
    }
  }
  
  private void zzlL()
  {
    long l = this.zzTm.zzjl().currentTimeMillis();
    SharedPreferences.Editor localEditor = zzai.zza(this.zzTm).edit();
    String str = zzlQ();
    localEditor.remove(str);
    str = zzlR();
    localEditor.remove(str);
    str = zzlP();
    localEditor.putLong(str, l);
    localEditor.commit();
  }
  
  private long zzlM()
  {
    long l1 = 0L;
    long l2 = zzlO();
    boolean bool = l2 < l1;
    if (!bool) {}
    for (;;)
    {
      return l1;
      zzmq localzzmq = this.zzTm.zzjl();
      l1 = localzzmq.currentTimeMillis();
      l1 = Math.abs(l2 - l1);
    }
  }
  
  private long zzlO()
  {
    SharedPreferences localSharedPreferences = zzai.zza(this.zzTm);
    String str = zzlP();
    return localSharedPreferences.getLong(str, 0L);
  }
  
  private String zzlP()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.mName;
    return str + ":start";
  }
  
  private String zzlQ()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.mName;
    return str + ":count";
  }
  
  public void zzbq(String paramString)
  {
    long l1 = Long.MAX_VALUE;
    long l2 = 1L;
    long l3 = 0L;
    long l4 = zzlO();
    boolean bool = l4 < l3;
    if (!bool) {
      zzlL();
    }
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      try
      {
        Object localObject1 = this.zzTm;
        localObject1 = zzai.zza((zzai)localObject1);
        Object localObject4 = zzlQ();
        long l5 = 0L;
        l5 = ((SharedPreferences)localObject1).getLong((String)localObject4, l5);
        bool = l5 < l3;
        if (!bool)
        {
          localObject1 = this.zzTm;
          localObject1 = zzai.zza((zzai)localObject1);
          localObject1 = ((SharedPreferences)localObject1).edit();
          localObject4 = zzlR();
          ((SharedPreferences.Editor)localObject1).putString((String)localObject4, paramString);
          localObject4 = zzlQ();
          l5 = 1L;
          ((SharedPreferences.Editor)localObject1).putLong((String)localObject4, l5);
          ((SharedPreferences.Editor)localObject1).apply();
          return;
        }
        localObject1 = UUID.randomUUID();
        l4 = ((UUID)localObject1).getLeastSignificantBits() & l1;
        l3 = Long.MAX_VALUE;
        l1 = l5 + l2;
        l3 /= l1;
        bool = l4 < l3;
        if (bool)
        {
          bool = true;
          localObject4 = this.zzTm;
          localObject4 = zzai.zza((zzai)localObject4);
          localObject4 = ((SharedPreferences)localObject4).edit();
          if (bool)
          {
            localObject1 = zzlR();
            ((SharedPreferences.Editor)localObject4).putString((String)localObject1, paramString);
          }
          localObject1 = zzlQ();
          l5 += l2;
          ((SharedPreferences.Editor)localObject4).putLong((String)localObject1, l5);
          ((SharedPreferences.Editor)localObject4).apply();
          continue;
        }
        bool = false;
      }
      finally {}
      Object localObject3 = null;
    }
  }
  
  public Pair zzlN()
  {
    long l1 = 0L;
    Pair localPair = null;
    long l2 = zzlM();
    long l3 = this.zzTl;
    boolean bool1 = l2 < l3;
    if (bool1) {}
    for (;;)
    {
      return localPair;
      l3 = this.zzTl;
      long l4 = 2;
      l3 *= l4;
      bool1 = l2 < l3;
      if (bool1)
      {
        zzlL();
      }
      else
      {
        Object localObject1 = zzai.zza(this.zzTm);
        Object localObject2 = zzlR();
        localObject1 = ((SharedPreferences)localObject1).getString((String)localObject2, null);
        localObject2 = zzai.zza(this.zzTm);
        String str = zzlQ();
        l2 = ((SharedPreferences)localObject2).getLong(str, l1);
        zzlL();
        if (localObject1 != null)
        {
          boolean bool2 = l2 < l1;
          if (bool2)
          {
            localPair = new android/util/Pair;
            localObject2 = Long.valueOf(l2);
            localPair.<init>(localObject1, localObject2);
          }
        }
      }
    }
  }
  
  protected String zzlR()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.mName;
    return str + ":value";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzai$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */