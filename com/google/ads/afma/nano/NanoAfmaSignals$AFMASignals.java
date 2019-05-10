package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;

public final class NanoAfmaSignals$AFMASignals
  extends zzsu
{
  private static volatile AFMASignals[] zzaL;
  public Long actSignal;
  public Long acxSignal;
  public Long acySignal;
  public Long aczSignal;
  public NanoAfmaSignals.AdAttestationSignal adAttestationSignal;
  public String afmaVersion;
  public Long attSignal;
  public Long atvSignal;
  public Long btlSignal;
  public Long btsSignal;
  public String cerSignal;
  public Boolean didOptOut;
  public String didSignal;
  public String didSignalAndroidAdId;
  public Integer didSignalType;
  public Long evtTime;
  public String intSignal;
  public Long jbkSignal;
  public Long netSignal;
  public Long ornSignal;
  public String osVersion;
  public NanoAfmaSignals.AFMASignals.TouchInfo[] previousTouches;
  public Long psnSignal;
  public NanoAfmaSignals.RawAdAttestationSignal rawAdAttestationSignal;
  public Long reqType;
  public String stkSignal;
  public Long swzSignal;
  public Long tccSignal;
  public Long tcdSignal;
  public Long tcdnSignal;
  public Long tcmSignal;
  public Long tcpSignal;
  public Long tctSignal;
  public Long tcuSignal;
  public Long tcxSignal;
  public Long tcySignal;
  public Long uhSignal;
  public Long uptSignal;
  public Long usgSignal;
  public Long utzSignal;
  public Long uwSignal;
  public Long vcdSignal;
  public Long visSignal;
  public String vnmSignal;
  
  public NanoAfmaSignals$AFMASignals()
  {
    clear();
  }
  
  public static AFMASignals[] emptyArray()
  {
    AFMASignals[] arrayOfAFMASignals = zzaL;
    if (arrayOfAFMASignals == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfAFMASignals = zzaL;
      if (arrayOfAFMASignals == null)
      {
        arrayOfAFMASignals = null;
        arrayOfAFMASignals = new AFMASignals[0];
        zzaL = arrayOfAFMASignals;
      }
      return zzaL;
    }
  }
  
  public static AFMASignals parseFrom(zzsm paramzzsm)
  {
    AFMASignals localAFMASignals = new com/google/ads/afma/nano/NanoAfmaSignals$AFMASignals;
    localAFMASignals.<init>();
    return localAFMASignals.mergeFrom(paramzzsm);
  }
  
  public static AFMASignals parseFrom(byte[] paramArrayOfByte)
  {
    AFMASignals localAFMASignals = new com/google/ads/afma/nano/NanoAfmaSignals$AFMASignals;
    localAFMASignals.<init>();
    return (AFMASignals)zzsu.mergeFrom(localAFMASignals, paramArrayOfByte);
  }
  
  public AFMASignals clear()
  {
    this.osVersion = null;
    this.afmaVersion = null;
    this.atvSignal = null;
    this.attSignal = null;
    this.btsSignal = null;
    this.btlSignal = null;
    this.acxSignal = null;
    this.acySignal = null;
    this.aczSignal = null;
    this.actSignal = null;
    this.netSignal = null;
    this.ornSignal = null;
    this.stkSignal = null;
    this.tcxSignal = null;
    this.tcySignal = null;
    this.tctSignal = null;
    this.uptSignal = null;
    this.visSignal = null;
    this.swzSignal = null;
    this.psnSignal = null;
    this.jbkSignal = null;
    this.usgSignal = null;
    this.intSignal = null;
    this.cerSignal = null;
    this.uwSignal = null;
    this.uhSignal = null;
    this.utzSignal = null;
    this.vnmSignal = null;
    this.vcdSignal = null;
    this.tcpSignal = null;
    this.tcdSignal = null;
    this.adAttestationSignal = null;
    this.tcuSignal = null;
    this.tcmSignal = null;
    this.tcdnSignal = null;
    this.tccSignal = null;
    NanoAfmaSignals.AFMASignals.TouchInfo[] arrayOfTouchInfo = NanoAfmaSignals.AFMASignals.TouchInfo.emptyArray();
    this.previousTouches = arrayOfTouchInfo;
    this.reqType = null;
    this.didSignal = null;
    this.didSignalType = null;
    this.didOptOut = null;
    this.didSignalAndroidAdId = null;
    this.evtTime = null;
    this.rawAdAttestationSignal = null;
    this.zzbuu = -1;
    return this;
  }
  
  public AFMASignals mergeFrom(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject1;
      long l;
      switch (i)
      {
      default: 
        boolean bool1 = zzsx.zzb(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 10: 
        localObject1 = paramzzsm.readString();
        this.osVersion = ((String)localObject1);
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.afmaVersion = ((String)localObject1);
        break;
      case 24: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.atvSignal = ((Long)localObject1);
        break;
      case 32: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.attSignal = ((Long)localObject1);
        break;
      case 40: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.btsSignal = ((Long)localObject1);
        break;
      case 48: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.btlSignal = ((Long)localObject1);
        break;
      case 56: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.acxSignal = ((Long)localObject1);
        break;
      case 64: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.acySignal = ((Long)localObject1);
        break;
      case 72: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.aczSignal = ((Long)localObject1);
        break;
      case 80: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.actSignal = ((Long)localObject1);
        break;
      case 88: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.netSignal = ((Long)localObject1);
        break;
      case 96: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.ornSignal = ((Long)localObject1);
        break;
      case 106: 
        localObject1 = paramzzsm.readString();
        this.stkSignal = ((String)localObject1);
        break;
      case 112: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tcxSignal = ((Long)localObject1);
        break;
      case 120: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tcySignal = ((Long)localObject1);
        break;
      case 128: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tctSignal = ((Long)localObject1);
        break;
      case 136: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.uptSignal = ((Long)localObject1);
        break;
      case 144: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.visSignal = ((Long)localObject1);
        break;
      case 152: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.swzSignal = ((Long)localObject1);
        break;
      case 160: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.psnSignal = ((Long)localObject1);
        break;
      case 168: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.reqType = ((Long)localObject1);
        break;
      case 176: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.jbkSignal = ((Long)localObject1);
        break;
      case 184: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.usgSignal = ((Long)localObject1);
        break;
      case 194: 
        localObject1 = paramzzsm.readString();
        this.didSignal = ((String)localObject1);
        break;
      case 200: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.evtTime = ((Long)localObject1);
        break;
      case 208: 
        int j = paramzzsm.zzJb();
        switch (j)
        {
        default: 
          break;
        case 0: 
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
          localObject1 = Integer.valueOf(j);
          this.didSignalType = ((Integer)localObject1);
        }
        break;
      case 218: 
        localObject1 = paramzzsm.readString();
        this.intSignal = ((String)localObject1);
        break;
      case 224: 
        boolean bool2 = paramzzsm.zzJc();
        localObject1 = Boolean.valueOf(bool2);
        this.didOptOut = ((Boolean)localObject1);
        break;
      case 234: 
        localObject1 = paramzzsm.readString();
        this.cerSignal = ((String)localObject1);
        break;
      case 242: 
        localObject1 = paramzzsm.readString();
        this.didSignalAndroidAdId = ((String)localObject1);
        break;
      case 248: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.uwSignal = ((Long)localObject1);
        break;
      case 256: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.uhSignal = ((Long)localObject1);
        break;
      case 264: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.utzSignal = ((Long)localObject1);
        break;
      case 274: 
        localObject1 = paramzzsm.readString();
        this.vnmSignal = ((String)localObject1);
        break;
      case 280: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.vcdSignal = ((Long)localObject1);
        break;
      case 288: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tcpSignal = ((Long)localObject1);
        break;
      case 296: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tcdSignal = ((Long)localObject1);
        break;
      case 306: 
        localObject1 = this.adAttestationSignal;
        if (localObject1 == null)
        {
          localObject1 = new com/google/ads/afma/nano/NanoAfmaSignals$AdAttestationSignal;
          ((NanoAfmaSignals.AdAttestationSignal)localObject1).<init>();
          this.adAttestationSignal = ((NanoAfmaSignals.AdAttestationSignal)localObject1);
        }
        localObject1 = this.adAttestationSignal;
        paramzzsm.zza((zzsu)localObject1);
        break;
      case 312: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tcuSignal = ((Long)localObject1);
        break;
      case 320: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tcmSignal = ((Long)localObject1);
        break;
      case 328: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tcdnSignal = ((Long)localObject1);
        break;
      case 336: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.tccSignal = ((Long)localObject1);
        break;
      case 346: 
        int k = 346;
        int m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.previousTouches;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
        }
        NanoAfmaSignals.AFMASignals.TouchInfo[] arrayOfTouchInfo;
        for (;;)
        {
          m += k;
          arrayOfTouchInfo = new NanoAfmaSignals.AFMASignals.TouchInfo[m];
          if (k != 0)
          {
            localObject2 = this.previousTouches;
            System.arraycopy(localObject2, 0, arrayOfTouchInfo, 0, k);
          }
          for (;;)
          {
            int n = arrayOfTouchInfo.length + -1;
            if (k >= n) {
              break;
            }
            localObject2 = new com/google/ads/afma/nano/NanoAfmaSignals$AFMASignals$TouchInfo;
            ((NanoAfmaSignals.AFMASignals.TouchInfo)localObject2).<init>();
            arrayOfTouchInfo[k] = localObject2;
            localObject2 = arrayOfTouchInfo[k];
            paramzzsm.zza((zzsu)localObject2);
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.previousTouches;
          k = localObject1.length;
        }
        Object localObject2 = new com/google/ads/afma/nano/NanoAfmaSignals$AFMASignals$TouchInfo;
        ((NanoAfmaSignals.AFMASignals.TouchInfo)localObject2).<init>();
        arrayOfTouchInfo[k] = localObject2;
        localObject1 = arrayOfTouchInfo[k];
        paramzzsm.zza((zzsu)localObject1);
        this.previousTouches = arrayOfTouchInfo;
        break;
      case 1610: 
        localObject1 = this.rawAdAttestationSignal;
        if (localObject1 == null)
        {
          localObject1 = new com/google/ads/afma/nano/NanoAfmaSignals$RawAdAttestationSignal;
          ((NanoAfmaSignals.RawAdAttestationSignal)localObject1).<init>();
          this.rawAdAttestationSignal = ((NanoAfmaSignals.RawAdAttestationSignal)localObject1);
        }
        localObject1 = this.rawAdAttestationSignal;
        paramzzsm.zza((zzsu)localObject1);
      }
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.osVersion;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.osVersion;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.afmaVersion;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.afmaVersion;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.atvSignal;
    long l;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.atvSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.attSignal;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.attSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.btsSignal;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = this.btsSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.btlSignal;
    if (localObject1 != null)
    {
      i = 6;
      localObject2 = this.btlSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.acxSignal;
    if (localObject1 != null)
    {
      i = 7;
      localObject2 = this.acxSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.acySignal;
    if (localObject1 != null)
    {
      i = 8;
      localObject2 = this.acySignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.aczSignal;
    if (localObject1 != null)
    {
      i = 9;
      localObject2 = this.aczSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.actSignal;
    if (localObject1 != null)
    {
      i = 10;
      localObject2 = this.actSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.netSignal;
    if (localObject1 != null)
    {
      i = 11;
      localObject2 = this.netSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.ornSignal;
    if (localObject1 != null)
    {
      i = 12;
      localObject2 = this.ornSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.stkSignal;
    if (localObject1 != null)
    {
      i = 13;
      localObject2 = this.stkSignal;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.tcxSignal;
    if (localObject1 != null)
    {
      i = 14;
      localObject2 = this.tcxSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.tcySignal;
    if (localObject1 != null)
    {
      i = 15;
      localObject2 = this.tcySignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.tctSignal;
    if (localObject1 != null)
    {
      i = 16;
      localObject2 = this.tctSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.uptSignal;
    if (localObject1 != null)
    {
      i = 17;
      localObject2 = this.uptSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.visSignal;
    if (localObject1 != null)
    {
      i = 18;
      localObject2 = this.visSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.swzSignal;
    if (localObject1 != null)
    {
      i = 19;
      localObject2 = this.swzSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.psnSignal;
    if (localObject1 != null)
    {
      i = 20;
      localObject2 = this.psnSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.reqType;
    if (localObject1 != null)
    {
      i = 21;
      localObject2 = this.reqType;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.jbkSignal;
    if (localObject1 != null)
    {
      i = 22;
      localObject2 = this.jbkSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.usgSignal;
    if (localObject1 != null)
    {
      i = 23;
      localObject2 = this.usgSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.didSignal;
    if (localObject1 != null)
    {
      i = 24;
      localObject2 = this.didSignal;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.evtTime;
    if (localObject1 != null)
    {
      i = 25;
      localObject2 = this.evtTime;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.didSignalType;
    if (localObject1 != null)
    {
      i = 26;
      localObject2 = this.didSignalType;
      int j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.intSignal;
    if (localObject1 != null)
    {
      i = 27;
      localObject2 = this.intSignal;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.didOptOut;
    if (localObject1 != null)
    {
      i = 28;
      localObject2 = this.didOptOut;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    localObject1 = this.cerSignal;
    if (localObject1 != null)
    {
      i = 29;
      localObject2 = this.cerSignal;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.didSignalAndroidAdId;
    if (localObject1 != null)
    {
      i = 30;
      localObject2 = this.didSignalAndroidAdId;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.uwSignal;
    if (localObject1 != null)
    {
      i = 31;
      localObject2 = this.uwSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.uhSignal;
    if (localObject1 != null)
    {
      i = 32;
      localObject2 = this.uhSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.utzSignal;
    if (localObject1 != null)
    {
      i = 33;
      localObject2 = this.utzSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.vnmSignal;
    if (localObject1 != null)
    {
      i = 34;
      localObject2 = this.vnmSignal;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.vcdSignal;
    if (localObject1 != null)
    {
      i = 35;
      localObject2 = this.vcdSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.tcpSignal;
    if (localObject1 != null)
    {
      i = 36;
      localObject2 = this.tcpSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.tcdSignal;
    if (localObject1 != null)
    {
      i = 37;
      localObject2 = this.tcdSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.adAttestationSignal;
    if (localObject1 != null)
    {
      i = 38;
      localObject2 = this.adAttestationSignal;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    localObject1 = this.tcuSignal;
    if (localObject1 != null)
    {
      i = 39;
      localObject2 = this.tcuSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.tcmSignal;
    if (localObject1 != null)
    {
      i = 40;
      localObject2 = this.tcmSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.tcdnSignal;
    if (localObject1 != null)
    {
      i = 41;
      localObject2 = this.tcdnSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.tccSignal;
    if (localObject1 != null)
    {
      i = 42;
      localObject2 = this.tccSignal;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.previousTouches;
    if (localObject1 != null)
    {
      localObject1 = this.previousTouches;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.previousTouches;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          localObject2 = this.previousTouches[i];
          if (localObject2 != null)
          {
            int m = 43;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          i += 1;
        }
      }
    }
    localObject1 = this.rawAdAttestationSignal;
    if (localObject1 != null)
    {
      i = 201;
      localObject2 = this.rawAdAttestationSignal;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.osVersion;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = this.osVersion;
      j = zzsn.zzo(1, (String)localObject2);
      i += j;
    }
    localObject1 = this.afmaVersion;
    if (localObject1 != null)
    {
      localObject2 = this.afmaVersion;
      j = zzsn.zzo(2, (String)localObject2);
      i += j;
    }
    localObject1 = this.atvSignal;
    long l;
    if (localObject1 != null)
    {
      localObject2 = this.atvSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(3, l);
      i += j;
    }
    localObject1 = this.attSignal;
    if (localObject1 != null)
    {
      localObject2 = this.attSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(4, l);
      i += j;
    }
    localObject1 = this.btsSignal;
    if (localObject1 != null)
    {
      localObject2 = this.btsSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(5, l);
      i += j;
    }
    localObject1 = this.btlSignal;
    if (localObject1 != null)
    {
      localObject2 = this.btlSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(6, l);
      i += j;
    }
    localObject1 = this.acxSignal;
    if (localObject1 != null)
    {
      localObject2 = this.acxSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(7, l);
      i += j;
    }
    localObject1 = this.acySignal;
    if (localObject1 != null)
    {
      localObject2 = this.acySignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(8, l);
      i += j;
    }
    localObject1 = this.aczSignal;
    if (localObject1 != null)
    {
      localObject2 = this.aczSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(9, l);
      i += j;
    }
    localObject1 = this.actSignal;
    if (localObject1 != null)
    {
      localObject2 = this.actSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(10, l);
      i += j;
    }
    localObject1 = this.netSignal;
    if (localObject1 != null)
    {
      localObject2 = this.netSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(11, l);
      i += j;
    }
    localObject1 = this.ornSignal;
    if (localObject1 != null)
    {
      localObject2 = this.ornSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(12, l);
      i += j;
    }
    localObject1 = this.stkSignal;
    if (localObject1 != null)
    {
      localObject2 = this.stkSignal;
      j = zzsn.zzo(13, (String)localObject2);
      i += j;
    }
    localObject1 = this.tcxSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tcxSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(14, l);
      i += j;
    }
    localObject1 = this.tcySignal;
    if (localObject1 != null)
    {
      localObject2 = this.tcySignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(15, l);
      i += j;
    }
    localObject1 = this.tctSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tctSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(16, l);
      i += j;
    }
    localObject1 = this.uptSignal;
    if (localObject1 != null)
    {
      localObject2 = this.uptSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(17, l);
      i += j;
    }
    localObject1 = this.visSignal;
    if (localObject1 != null)
    {
      localObject2 = this.visSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(18, l);
      i += j;
    }
    localObject1 = this.swzSignal;
    if (localObject1 != null)
    {
      localObject2 = this.swzSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(19, l);
      i += j;
    }
    localObject1 = this.psnSignal;
    if (localObject1 != null)
    {
      localObject2 = this.psnSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(20, l);
      i += j;
    }
    localObject1 = this.reqType;
    if (localObject1 != null)
    {
      localObject2 = this.reqType;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(21, l);
      i += j;
    }
    localObject1 = this.jbkSignal;
    if (localObject1 != null)
    {
      localObject2 = this.jbkSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(22, l);
      i += j;
    }
    localObject1 = this.usgSignal;
    if (localObject1 != null)
    {
      localObject2 = this.usgSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(23, l);
      i += j;
    }
    localObject1 = this.didSignal;
    if (localObject1 != null)
    {
      localObject2 = this.didSignal;
      j = zzsn.zzo(24, (String)localObject2);
      i += j;
    }
    localObject1 = this.evtTime;
    if (localObject1 != null)
    {
      localObject2 = this.evtTime;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(25, l);
      i += j;
    }
    localObject1 = this.didSignalType;
    if (localObject1 != null)
    {
      localObject2 = this.didSignalType;
      int k = ((Integer)localObject2).intValue();
      j = zzsn.zzC(26, k);
      i += j;
    }
    localObject1 = this.intSignal;
    if (localObject1 != null)
    {
      localObject2 = this.intSignal;
      j = zzsn.zzo(27, (String)localObject2);
      i += j;
    }
    localObject1 = this.didOptOut;
    if (localObject1 != null)
    {
      localObject2 = this.didOptOut;
      boolean bool = ((Boolean)localObject2).booleanValue();
      j = zzsn.zzf(28, bool);
      i += j;
    }
    localObject1 = this.cerSignal;
    if (localObject1 != null)
    {
      localObject2 = this.cerSignal;
      j = zzsn.zzo(29, (String)localObject2);
      i += j;
    }
    localObject1 = this.didSignalAndroidAdId;
    if (localObject1 != null)
    {
      localObject2 = this.didSignalAndroidAdId;
      j = zzsn.zzo(30, (String)localObject2);
      i += j;
    }
    localObject1 = this.uwSignal;
    if (localObject1 != null)
    {
      localObject2 = this.uwSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(31, l);
      i += j;
    }
    localObject1 = this.uhSignal;
    if (localObject1 != null)
    {
      localObject2 = this.uhSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(32, l);
      i += j;
    }
    localObject1 = this.utzSignal;
    if (localObject1 != null)
    {
      localObject2 = this.utzSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(33, l);
      i += j;
    }
    localObject1 = this.vnmSignal;
    if (localObject1 != null)
    {
      localObject2 = this.vnmSignal;
      j = zzsn.zzo(34, (String)localObject2);
      i += j;
    }
    localObject1 = this.vcdSignal;
    if (localObject1 != null)
    {
      localObject2 = this.vcdSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(35, l);
      i += j;
    }
    localObject1 = this.tcpSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tcpSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(36, l);
      i += j;
    }
    localObject1 = this.tcdSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tcdSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(37, l);
      i += j;
    }
    localObject1 = this.adAttestationSignal;
    if (localObject1 != null)
    {
      localObject2 = this.adAttestationSignal;
      j = zzsn.zzc(38, (zzsu)localObject2);
      i += j;
    }
    localObject1 = this.tcuSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tcuSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(39, l);
      i += j;
    }
    localObject1 = this.tcmSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tcmSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(40, l);
      i += j;
    }
    localObject1 = this.tcdnSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tcdnSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(41, l);
      i += j;
    }
    localObject1 = this.tccSignal;
    if (localObject1 != null)
    {
      localObject2 = this.tccSignal;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(42, l);
      i += j;
    }
    localObject1 = this.previousTouches;
    if (localObject1 != null)
    {
      localObject1 = this.previousTouches;
      j = localObject1.length;
      if (j > 0)
      {
        localObject1 = null;
        j = i;
        i = 0;
        for (;;)
        {
          localObject2 = this.previousTouches;
          int m = localObject2.length;
          if (i >= m) {
            break;
          }
          localObject2 = this.previousTouches[i];
          if (localObject2 != null)
          {
            int n = 43;
            m = zzsn.zzc(n, (zzsu)localObject2);
            j += m;
          }
          i += 1;
        }
        i = j;
      }
    }
    localObject1 = this.rawAdAttestationSignal;
    if (localObject1 != null)
    {
      localObject2 = this.rawAdAttestationSignal;
      j = zzsn.zzc(201, (zzsu)localObject2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\afma\nano\NanoAfmaSignals$AFMASignals.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */