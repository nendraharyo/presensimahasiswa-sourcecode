package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;

public final class NanoAfmaSignals$AdSignalsContainer
  extends zzsu
{
  private static volatile AdSignalsContainer[] zzaO;
  public byte[] encryptedDidSignal;
  public byte[] encryptedSpamSignals;
  
  public NanoAfmaSignals$AdSignalsContainer()
  {
    clear();
  }
  
  public static AdSignalsContainer[] emptyArray()
  {
    AdSignalsContainer[] arrayOfAdSignalsContainer = zzaO;
    if (arrayOfAdSignalsContainer == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfAdSignalsContainer = zzaO;
      if (arrayOfAdSignalsContainer == null)
      {
        arrayOfAdSignalsContainer = null;
        arrayOfAdSignalsContainer = new AdSignalsContainer[0];
        zzaO = arrayOfAdSignalsContainer;
      }
      return zzaO;
    }
  }
  
  public static AdSignalsContainer parseFrom(zzsm paramzzsm)
  {
    AdSignalsContainer localAdSignalsContainer = new com/google/ads/afma/nano/NanoAfmaSignals$AdSignalsContainer;
    localAdSignalsContainer.<init>();
    return localAdSignalsContainer.mergeFrom(paramzzsm);
  }
  
  public static AdSignalsContainer parseFrom(byte[] paramArrayOfByte)
  {
    AdSignalsContainer localAdSignalsContainer = new com/google/ads/afma/nano/NanoAfmaSignals$AdSignalsContainer;
    localAdSignalsContainer.<init>();
    return (AdSignalsContainer)zzsu.mergeFrom(localAdSignalsContainer, paramArrayOfByte);
  }
  
  public AdSignalsContainer clear()
  {
    this.encryptedSpamSignals = null;
    this.encryptedDidSignal = null;
    this.zzbuu = -1;
    return this;
  }
  
  public AdSignalsContainer mergeFrom(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      byte[] arrayOfByte;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        arrayOfByte = paramzzsm.readBytes();
        this.encryptedSpamSignals = arrayOfByte;
        break;
      case 18: 
        arrayOfByte = paramzzsm.readBytes();
        this.encryptedDidSignal = arrayOfByte;
      }
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    byte[] arrayOfByte1 = this.encryptedSpamSignals;
    int i;
    byte[] arrayOfByte2;
    if (arrayOfByte1 != null)
    {
      i = 1;
      arrayOfByte2 = this.encryptedSpamSignals;
      paramzzsn.zza(i, arrayOfByte2);
    }
    arrayOfByte1 = this.encryptedDidSignal;
    if (arrayOfByte1 != null)
    {
      i = 2;
      arrayOfByte2 = this.encryptedDidSignal;
      paramzzsn.zza(i, arrayOfByte2);
    }
    super.writeTo(paramzzsn);
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    byte[] arrayOfByte1 = this.encryptedSpamSignals;
    byte[] arrayOfByte2;
    int j;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = this.encryptedSpamSignals;
      j = zzsn.zzb(1, arrayOfByte2);
      i += j;
    }
    arrayOfByte1 = this.encryptedDidSignal;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = this.encryptedDidSignal;
      j = zzsn.zzb(2, arrayOfByte2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\afma\nano\NanoAfmaSignals$AdSignalsContainer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */