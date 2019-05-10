package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;

public final class NanoAfmaSignals$AdAttestationSignal
  extends zzsu
{
  private static volatile AdAttestationSignal[] zzaN;
  public Integer reasons;
  public Integer responseType;
  public Boolean suspicious;
  public Long timestampMs;
  
  public NanoAfmaSignals$AdAttestationSignal()
  {
    clear();
  }
  
  public static AdAttestationSignal[] emptyArray()
  {
    AdAttestationSignal[] arrayOfAdAttestationSignal = zzaN;
    if (arrayOfAdAttestationSignal == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfAdAttestationSignal = zzaN;
      if (arrayOfAdAttestationSignal == null)
      {
        arrayOfAdAttestationSignal = null;
        arrayOfAdAttestationSignal = new AdAttestationSignal[0];
        zzaN = arrayOfAdAttestationSignal;
      }
      return zzaN;
    }
  }
  
  public static AdAttestationSignal parseFrom(zzsm paramzzsm)
  {
    AdAttestationSignal localAdAttestationSignal = new com/google/ads/afma/nano/NanoAfmaSignals$AdAttestationSignal;
    localAdAttestationSignal.<init>();
    return localAdAttestationSignal.mergeFrom(paramzzsm);
  }
  
  public static AdAttestationSignal parseFrom(byte[] paramArrayOfByte)
  {
    AdAttestationSignal localAdAttestationSignal = new com/google/ads/afma/nano/NanoAfmaSignals$AdAttestationSignal;
    localAdAttestationSignal.<init>();
    return (AdAttestationSignal)zzsu.mergeFrom(localAdAttestationSignal, paramArrayOfByte);
  }
  
  public AdAttestationSignal clear()
  {
    this.timestampMs = null;
    this.responseType = null;
    this.suspicious = null;
    this.reasons = null;
    this.zzbuu = -1;
    return this;
  }
  
  public AdAttestationSignal mergeFrom(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject;
      switch (i)
      {
      default: 
        boolean bool1 = zzsx.zzb(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 8: 
        long l = paramzzsm.zzJa();
        localObject = Long.valueOf(l);
        this.timestampMs = ((Long)localObject);
        break;
      case 16: 
        int j = paramzzsm.zzJb();
        switch (j)
        {
        default: 
          break;
        case 0: 
        case 1: 
        case 2: 
        case 3: 
          localObject = Integer.valueOf(j);
          this.responseType = ((Integer)localObject);
        }
        break;
      case 24: 
        boolean bool2 = paramzzsm.zzJc();
        localObject = Boolean.valueOf(bool2);
        this.suspicious = ((Boolean)localObject);
        break;
      case 32: 
        int k = paramzzsm.zzJb();
        switch (k)
        {
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
          localObject = Integer.valueOf(k);
          this.reasons = ((Integer)localObject);
        }
        break;
      }
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.timestampMs;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.timestampMs;
      long l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.responseType;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.responseType;
      int j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.suspicious;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.suspicious;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    localObject1 = this.reasons;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.reasons;
      int k = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, k);
    }
    super.writeTo(paramzzsn);
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.timestampMs;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = this.timestampMs;
      long l = ((Long)localObject2).longValue();
      j = zzsn.zzd(1, l);
      i += j;
    }
    localObject1 = this.responseType;
    if (localObject1 != null)
    {
      localObject2 = this.responseType;
      int k = ((Integer)localObject2).intValue();
      j = zzsn.zzC(2, k);
      i += j;
    }
    localObject1 = this.suspicious;
    if (localObject1 != null)
    {
      localObject2 = this.suspicious;
      boolean bool = ((Boolean)localObject2).booleanValue();
      j = zzsn.zzf(3, bool);
      i += j;
    }
    localObject1 = this.reasons;
    if (localObject1 != null)
    {
      localObject2 = this.reasons;
      int m = ((Integer)localObject2).intValue();
      j = zzsn.zzC(4, m);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\afma\nano\NanoAfmaSignals$AdAttestationSignal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */