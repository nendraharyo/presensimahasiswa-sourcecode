package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.zzx;
import java.util.LinkedList;

class zzea
{
  private final LinkedList zzAB;
  private final int zzAC;
  private final String zzpS;
  private AdRequestParcel zzqH;
  
  zzea(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    zzx.zzz(paramAdRequestParcel);
    zzx.zzz(paramString);
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    this.zzAB = localLinkedList;
    this.zzqH = paramAdRequestParcel;
    this.zzpS = paramString;
    this.zzAC = paramInt;
  }
  
  String getAdUnitId()
  {
    return this.zzpS;
  }
  
  int getNetworkType()
  {
    return this.zzAC;
  }
  
  int size()
  {
    return this.zzAB.size();
  }
  
  void zzb(zzdv paramzzdv)
  {
    zzea.zza localzza = new com/google/android/gms/internal/zzea$zza;
    localzza.<init>(this, paramzzdv);
    this.zzAB.add(localzza);
    AdRequestParcel localAdRequestParcel = this.zzqH;
    localzza.zzh(localAdRequestParcel);
  }
  
  AdRequestParcel zzei()
  {
    return this.zzqH;
  }
  
  zzea.zza zzej()
  {
    return (zzea.zza)this.zzAB.remove();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzea.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */