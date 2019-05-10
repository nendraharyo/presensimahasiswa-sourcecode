package com.google.ads.afma.nano;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsx;

public final class NanoAdshieldEvent$AdShieldEvent
  extends zzsu
{
  private static volatile AdShieldEvent[] zzaK;
  public String appId;
  
  public NanoAdshieldEvent$AdShieldEvent()
  {
    clear();
  }
  
  public static AdShieldEvent[] emptyArray()
  {
    AdShieldEvent[] arrayOfAdShieldEvent = zzaK;
    if (arrayOfAdShieldEvent == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfAdShieldEvent = zzaK;
      if (arrayOfAdShieldEvent == null)
      {
        arrayOfAdShieldEvent = null;
        arrayOfAdShieldEvent = new AdShieldEvent[0];
        zzaK = arrayOfAdShieldEvent;
      }
      return zzaK;
    }
  }
  
  public static AdShieldEvent parseFrom(zzsm paramzzsm)
  {
    AdShieldEvent localAdShieldEvent = new com/google/ads/afma/nano/NanoAdshieldEvent$AdShieldEvent;
    localAdShieldEvent.<init>();
    return localAdShieldEvent.mergeFrom(paramzzsm);
  }
  
  public static AdShieldEvent parseFrom(byte[] paramArrayOfByte)
  {
    AdShieldEvent localAdShieldEvent = new com/google/ads/afma/nano/NanoAdshieldEvent$AdShieldEvent;
    localAdShieldEvent.<init>();
    return (AdShieldEvent)zzsu.mergeFrom(localAdShieldEvent, paramArrayOfByte);
  }
  
  public AdShieldEvent clear()
  {
    this.appId = "";
    this.zzbuu = -1;
    return this;
  }
  
  public AdShieldEvent mergeFrom(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        String str = paramzzsm.readString();
        this.appId = str;
      }
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    String str1 = this.appId;
    String str2 = "";
    int i = str1.equals(str2);
    if (i == 0)
    {
      i = 1;
      str2 = this.appId;
      paramzzsn.zzn(i, str2);
    }
    super.writeTo(paramzzsn);
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    String str1 = this.appId;
    String str2 = "";
    boolean bool = str1.equals(str2);
    if (!bool)
    {
      str2 = this.appId;
      int j = zzsn.zzo(1, str2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\afma\nano\NanoAdshieldEvent$AdShieldEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */