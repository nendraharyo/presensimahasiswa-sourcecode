package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class zzax
  implements zzay
{
  private final VersionInfoParcel zzpT;
  private final Object zzpV;
  private final WeakHashMap zzsB;
  private final ArrayList zzsC;
  private final zzeg zzsD;
  private final Context zzsa;
  
  public zzax(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzeg paramzzeg)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    this.zzsB = ((WeakHashMap)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzsC = ((ArrayList)localObject);
    localObject = paramContext.getApplicationContext();
    this.zzsa = ((Context)localObject);
    this.zzpT = paramVersionInfoParcel;
    this.zzsD = paramzzeg;
  }
  
  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif)
  {
    View localView = paramzzif.zzED.getView();
    return zza(paramAdSizeParcel, paramzzif, localView);
  }
  
  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, View paramView)
  {
    zzau.zzd localzzd = new com/google/android/gms/internal/zzau$zzd;
    localzzd.<init>(paramView, paramzzif);
    return zza(paramAdSizeParcel, paramzzif, localzzd, null);
  }
  
  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, View paramView, zzeh paramzzeh)
  {
    zzau.zzd localzzd = new com/google/android/gms/internal/zzau$zzd;
    localzzd.<init>(paramView, paramzzif);
    return zza(paramAdSizeParcel, paramzzif, localzzd, paramzzeh);
  }
  
  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, zzh paramzzh)
  {
    zzau.zza localzza = new com/google/android/gms/internal/zzau$zza;
    localzza.<init>(paramzzh);
    return zza(paramAdSizeParcel, paramzzif, localzza, null);
  }
  
  public zzau zza(AdSizeParcel paramAdSizeParcel, zzif paramzzif, zzbb paramzzbb, zzeh paramzzeh)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        boolean bool = zzh(paramzzif);
        Object localObject2;
        if (bool)
        {
          localObject2 = this.zzsB;
          localObject2 = ((WeakHashMap)localObject2).get(paramzzif);
          localObject2 = (zzau)localObject2;
          return (zzau)localObject2;
        }
        if (paramzzeh != null)
        {
          localObject2 = new com/google/android/gms/internal/zzaz;
          localObject4 = this.zzsa;
          localVersionInfoParcel = this.zzpT;
          localObject5 = paramzzeh;
          ((zzaz)localObject2).<init>((Context)localObject4, paramAdSizeParcel, paramzzif, localVersionInfoParcel, paramzzbb, paramzzeh);
          ((zzau)localObject2).zza(this);
          localObject4 = this.zzsB;
          ((WeakHashMap)localObject4).put(paramzzif, localObject2);
          localObject4 = this.zzsC;
          ((ArrayList)localObject4).add(localObject2);
        }
      }
      zzba localzzba = new com/google/android/gms/internal/zzba;
      Object localObject4 = this.zzsa;
      VersionInfoParcel localVersionInfoParcel = this.zzpT;
      Object localObject5 = this.zzsD;
      localzzba.<init>((Context)localObject4, paramAdSizeParcel, paramzzif, localVersionInfoParcel, paramzzbb, (zzeg)localObject5);
    }
  }
  
  public void zza(zzau paramzzau)
  {
    synchronized (this.zzpV)
    {
      boolean bool = paramzzau.zzch();
      if (!bool)
      {
        Object localObject2 = this.zzsC;
        ((ArrayList)localObject2).remove(paramzzau);
        localObject2 = this.zzsB;
        localObject2 = ((WeakHashMap)localObject2).entrySet();
        Iterator localIterator = ((Set)localObject2).iterator();
        do
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (Map.Entry)localObject2;
          localObject2 = ((Map.Entry)localObject2).getValue();
        } while (localObject2 != paramzzau);
        localIterator.remove();
      }
    }
  }
  
  public boolean zzh(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsB;
      localObject2 = ((WeakHashMap)localObject2).get(paramzzif);
      localObject2 = (zzau)localObject2;
      if (localObject2 != null)
      {
        bool = ((zzau)localObject2).zzch();
        if (bool)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
      localObject2 = null;
    }
  }
  
  public void zzi(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsB;
      localObject2 = ((WeakHashMap)localObject2).get(paramzzif);
      localObject2 = (zzau)localObject2;
      if (localObject2 != null) {
        ((zzau)localObject2).zzcf();
      }
      return;
    }
  }
  
  public void zzj(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsB;
      localObject2 = ((WeakHashMap)localObject2).get(paramzzif);
      localObject2 = (zzau)localObject2;
      if (localObject2 != null) {
        ((zzau)localObject2).stop();
      }
      return;
    }
  }
  
  public void zzk(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsB;
      localObject2 = ((WeakHashMap)localObject2).get(paramzzif);
      localObject2 = (zzau)localObject2;
      if (localObject2 != null) {
        ((zzau)localObject2).pause();
      }
      return;
    }
  }
  
  public void zzl(zzif paramzzif)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsB;
      localObject2 = ((WeakHashMap)localObject2).get(paramzzif);
      localObject2 = (zzau)localObject2;
      if (localObject2 != null) {
        ((zzau)localObject2).resume();
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzax.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */