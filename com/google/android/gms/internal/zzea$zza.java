package com.google.android.gms.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedList;

class zzea$zza
{
  zzk zzAD;
  zzdw zzAE;
  long zzAF;
  boolean zzAG;
  boolean zzAH;
  MutableContextWrapper zzAb;
  
  zzea$zza(zzea paramzzea, zzdv paramzzdv)
  {
    Object localObject1 = paramzzdv.zzec();
    Object localObject2 = paramzzdv.zzed();
    this.zzAb = ((MutableContextWrapper)localObject2);
    localObject2 = zzea.zza(paramzzea);
    localObject1 = ((zzdv)localObject1).zzX((String)localObject2);
    this.zzAD = ((zzk)localObject1);
    localObject1 = new com/google/android/gms/internal/zzdw;
    ((zzdw)localObject1).<init>();
    this.zzAE = ((zzdw)localObject1);
    localObject1 = this.zzAE;
    localObject2 = this.zzAD;
    ((zzdw)localObject1).zzc((zzk)localObject2);
  }
  
  private void zzek()
  {
    boolean bool = this.zzAG;
    if (!bool)
    {
      Object localObject = zzea.zzc(this.zzAI);
      if (localObject != null)
      {
        localObject = this.zzAD;
        AdRequestParcel localAdRequestParcel = zzea.zzc(this.zzAI);
        bool = ((zzk)localObject).zzb(localAdRequestParcel);
        this.zzAH = bool;
        bool = true;
        this.zzAG = bool;
        localObject = zzr.zzbG();
        long l = ((zzmq)localObject).currentTimeMillis();
        this.zzAF = l;
      }
    }
  }
  
  void zzc(zzdv paramzzdv)
  {
    Context localContext = paramzzdv.zzed().getBaseContext();
    this.zzAb.setBaseContext(localContext);
  }
  
  void zzh(AdRequestParcel paramAdRequestParcel)
  {
    if (paramAdRequestParcel != null)
    {
      localObject = this.zzAI;
      zzea.zza((zzea)localObject, paramAdRequestParcel);
    }
    zzek();
    Object localObject = zzea.zzb(this.zzAI);
    Iterator localIterator = ((LinkedList)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zza)localIterator.next();
      ((zza)localObject).zzek();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzea$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */