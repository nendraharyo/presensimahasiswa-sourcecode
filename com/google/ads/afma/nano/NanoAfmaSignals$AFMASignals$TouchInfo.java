package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;

public final class NanoAfmaSignals$AFMASignals$TouchInfo
  extends zzsu
{
  private static volatile TouchInfo[] zzaM;
  public Long tcxSignal;
  public Long tcySignal;
  
  public NanoAfmaSignals$AFMASignals$TouchInfo()
  {
    clear();
  }
  
  public static TouchInfo[] emptyArray()
  {
    TouchInfo[] arrayOfTouchInfo = zzaM;
    if (arrayOfTouchInfo == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfTouchInfo = zzaM;
      if (arrayOfTouchInfo == null)
      {
        arrayOfTouchInfo = null;
        arrayOfTouchInfo = new TouchInfo[0];
        zzaM = arrayOfTouchInfo;
      }
      return zzaM;
    }
  }
  
  public static TouchInfo parseFrom(zzsm paramzzsm)
  {
    TouchInfo localTouchInfo = new com/google/ads/afma/nano/NanoAfmaSignals$AFMASignals$TouchInfo;
    localTouchInfo.<init>();
    return localTouchInfo.mergeFrom(paramzzsm);
  }
  
  public static TouchInfo parseFrom(byte[] paramArrayOfByte)
  {
    TouchInfo localTouchInfo = new com/google/ads/afma/nano/NanoAfmaSignals$AFMASignals$TouchInfo;
    localTouchInfo.<init>();
    return (TouchInfo)zzsu.mergeFrom(localTouchInfo, paramArrayOfByte);
  }
  
  public TouchInfo clear()
  {
    this.tcxSignal = null;
    this.tcySignal = null;
    this.zzbuu = -1;
    return this;
  }
  
  public TouchInfo mergeFrom(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      long l;
      Long localLong;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        l = paramzzsm.zzJa();
        localLong = Long.valueOf(l);
        this.tcxSignal = localLong;
        break;
      case 16: 
        l = paramzzsm.zzJa();
        localLong = Long.valueOf(l);
        this.tcySignal = localLong;
      }
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Long localLong1 = this.tcxSignal;
    int i;
    Long localLong2;
    long l;
    if (localLong1 != null)
    {
      i = 1;
      localLong2 = this.tcxSignal;
      l = localLong2.longValue();
      paramzzsn.zzb(i, l);
    }
    localLong1 = this.tcySignal;
    if (localLong1 != null)
    {
      i = 2;
      localLong2 = this.tcySignal;
      l = localLong2.longValue();
      paramzzsn.zzb(i, l);
    }
    super.writeTo(paramzzsn);
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Long localLong1 = this.tcxSignal;
    Long localLong2;
    long l;
    int j;
    if (localLong1 != null)
    {
      localLong2 = this.tcxSignal;
      l = localLong2.longValue();
      j = zzsn.zzd(1, l);
      i += j;
    }
    localLong1 = this.tcySignal;
    if (localLong1 != null)
    {
      localLong2 = this.tcySignal;
      l = localLong2.longValue();
      j = zzsn.zzd(2, l);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\afma\nano\NanoAfmaSignals$AFMASignals$TouchInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */