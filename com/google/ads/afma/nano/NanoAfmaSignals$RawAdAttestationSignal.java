package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;

public final class NanoAfmaSignals$RawAdAttestationSignal
  extends zzsu
{
  private static volatile RawAdAttestationSignal[] zzaP;
  public byte[] encryptedAdAttestationStatemement;
  public String keyIdentifier;
  public Long timestampMs;
  
  public NanoAfmaSignals$RawAdAttestationSignal()
  {
    clear();
  }
  
  public static RawAdAttestationSignal[] emptyArray()
  {
    RawAdAttestationSignal[] arrayOfRawAdAttestationSignal = zzaP;
    if (arrayOfRawAdAttestationSignal == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfRawAdAttestationSignal = zzaP;
      if (arrayOfRawAdAttestationSignal == null)
      {
        arrayOfRawAdAttestationSignal = null;
        arrayOfRawAdAttestationSignal = new RawAdAttestationSignal[0];
        zzaP = arrayOfRawAdAttestationSignal;
      }
      return zzaP;
    }
  }
  
  public static RawAdAttestationSignal parseFrom(zzsm paramzzsm)
  {
    RawAdAttestationSignal localRawAdAttestationSignal = new com/google/ads/afma/nano/NanoAfmaSignals$RawAdAttestationSignal;
    localRawAdAttestationSignal.<init>();
    return localRawAdAttestationSignal.mergeFrom(paramzzsm);
  }
  
  public static RawAdAttestationSignal parseFrom(byte[] paramArrayOfByte)
  {
    RawAdAttestationSignal localRawAdAttestationSignal = new com/google/ads/afma/nano/NanoAfmaSignals$RawAdAttestationSignal;
    localRawAdAttestationSignal.<init>();
    return (RawAdAttestationSignal)zzsu.mergeFrom(localRawAdAttestationSignal, paramArrayOfByte);
  }
  
  public RawAdAttestationSignal clear()
  {
    this.timestampMs = null;
    this.keyIdentifier = null;
    this.encryptedAdAttestationStatemement = null;
    this.zzbuu = -1;
    return this;
  }
  
  public RawAdAttestationSignal mergeFrom(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        long l = paramzzsm.zzJa();
        localObject = Long.valueOf(l);
        this.timestampMs = ((Long)localObject);
        break;
      case 26: 
        localObject = paramzzsm.readString();
        this.keyIdentifier = ((String)localObject);
        break;
      case 34: 
        localObject = paramzzsm.readBytes();
        this.encryptedAdAttestationStatemement = ((byte[])localObject);
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
    localObject1 = this.keyIdentifier;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.keyIdentifier;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.encryptedAdAttestationStatemement;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.encryptedAdAttestationStatemement;
      paramzzsn.zza(i, (byte[])localObject2);
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
    localObject1 = this.keyIdentifier;
    if (localObject1 != null)
    {
      localObject2 = this.keyIdentifier;
      j = zzsn.zzo(3, (String)localObject2);
      i += j;
    }
    localObject1 = this.encryptedAdAttestationStatemement;
    if (localObject1 != null)
    {
      localObject2 = this.encryptedAdAttestationStatemement;
      j = zzsn.zzb(4, (byte[])localObject2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\afma\nano\NanoAfmaSignals$RawAdAttestationSignal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */