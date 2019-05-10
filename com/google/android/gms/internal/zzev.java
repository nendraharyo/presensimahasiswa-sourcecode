package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzev
  implements zzem
{
  private final Context mContext;
  private zzer zzCD;
  private final zzeo zzCf;
  private final AdRequestInfoParcel zzCu;
  private final long zzCv;
  private final long zzCw;
  private boolean zzCy;
  private final Object zzpV;
  private final zzcb zzpe;
  private final zzex zzpn;
  private final boolean zzsA;
  private final boolean zzuS;
  
  public zzev(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzex paramzzex, zzeo paramzzeo, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, zzcb paramzzcb)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzCy = false;
    this.mContext = paramContext;
    this.zzCu = paramAdRequestInfoParcel;
    this.zzpn = paramzzex;
    this.zzCf = paramzzeo;
    this.zzsA = paramBoolean1;
    this.zzuS = paramBoolean2;
    this.zzCv = paramLong1;
    this.zzCw = paramLong2;
    this.zzpe = paramzzcb;
  }
  
  public void cancel()
  {
    Object localObject1 = this.zzpV;
    boolean bool = true;
    try
    {
      this.zzCy = bool;
      zzer localzzer = this.zzCD;
      if (localzzer != null)
      {
        localzzer = this.zzCD;
        localzzer.cancel();
      }
      return;
    }
    finally {}
  }
  
  public zzes zzc(List paramList)
  {
    zzin.zzaI("Starting mediation.");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = this;
    Object localObject2 = this.zzpe;
    zzbz localzzbz1 = ((zzcb)localObject2).zzdB();
    Iterator localIterator1 = paramList.iterator();
    boolean bool1;
    zzen localzzen;
    Object localObject4;
    Iterator localIterator2;
    do
    {
      bool1 = localIterator1.hasNext();
      if (!bool1) {
        break;
      }
      localzzen = (zzen)localIterator1.next();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Trying mediation network: ");
      localObject4 = localzzen.zzBA;
      zzin.zzaJ((String)localObject4);
      localObject2 = localzzen.zzBB;
      localIterator2 = ((List)localObject2).iterator();
      bool1 = localIterator2.hasNext();
    } while (!bool1);
    Object localObject5 = (String)localIterator2.next();
    localObject1 = this;
    localObject2 = this.zzpe;
    zzbz localzzbz2 = ((zzcb)localObject2).zzdB();
    localObject1 = this.zzpV;
    Object localObject6 = localObject1;
    localObject1 = this;
    for (;;)
    {
      try
      {
        bool1 = this.zzCy;
        if (bool1)
        {
          localObject2 = new com/google/android/gms/internal/zzes;
          i = -1;
          ((zzes)localObject2).<init>(i);
          return (zzes)localObject2;
        }
        localObject2 = new com/google/android/gms/internal/zzer;
        localObject4 = this.mContext;
        localObject7 = this.zzpn;
        localObject8 = this.zzCf;
        Object localObject9 = this.zzCu;
        localObject9 = ((AdRequestInfoParcel)localObject9).zzHt;
        Object localObject10 = this.zzCu;
        localObject10 = ((AdRequestInfoParcel)localObject10).zzrp;
        Object localObject11 = this.zzCu;
        localObject11 = ((AdRequestInfoParcel)localObject11).zzrl;
        boolean bool2 = this.zzsA;
        boolean bool3 = this.zzuS;
        Object localObject12 = this.zzCu;
        localObject12 = ((AdRequestInfoParcel)localObject12).zzrD;
        Object localObject13 = this.zzCu;
        localObject13 = ((AdRequestInfoParcel)localObject13).zzrH;
        ((zzer)localObject2).<init>((Context)localObject4, (String)localObject5, (zzex)localObject7, (zzeo)localObject8, localzzen, (AdRequestParcel)localObject9, (AdSizeParcel)localObject10, (VersionInfoParcel)localObject11, bool2, bool3, (NativeAdOptionsParcel)localObject12, (List)localObject13);
        this.zzCD = ((zzer)localObject2);
        localObject2 = this.zzCD;
        long l1 = this.zzCv;
        long l2 = this.zzCw;
        localObject2 = ((zzer)localObject2).zza(l1, l2);
        int i = ((zzes)localObject2).zzCo;
        if (i == 0)
        {
          zzin.zzaI("Adapter succeeded.");
          localObject4 = this.zzpe;
          localObject7 = "mediation_network_succeed";
          ((zzcb)localObject4).zzc((String)localObject7, (String)localObject5);
          j = localArrayList.isEmpty();
          if (j == 0)
          {
            localObject4 = this.zzpe;
            localObject5 = "mediation_networks_fail";
            localObject7 = TextUtils.join(",", localArrayList);
            ((zzcb)localObject4).zzc((String)localObject5, (String)localObject7);
          }
          localObject1 = this;
          localObject4 = this.zzpe;
          localObject5 = new String[1];
          localObject5[0] = "mls";
          localObject1 = localzzbz2;
          ((zzcb)localObject4).zza(localzzbz2, (String[])localObject5);
          localObject1 = this;
          localObject4 = this.zzpe;
          k = 1;
          localObject5 = new String[k];
          localObject7 = null;
          localObject8 = "ttm";
          localObject5[0] = localObject8;
          localObject1 = localzzbz1;
          ((zzcb)localObject4).zza(localzzbz1, (String[])localObject5);
          continue;
        }
        localArrayList.add(localObject5);
      }
      finally {}
      localObject4 = this.zzpe;
      int k = 1;
      localObject5 = new String[k];
      Object localObject7 = null;
      Object localObject8 = "mlf";
      localObject5[0] = localObject8;
      localObject1 = localzzbz2;
      ((zzcb)localObject4).zza(localzzbz2, (String[])localObject5);
      localObject4 = localzzes.zzCq;
      if (localObject4 == null) {
        break;
      }
      localObject4 = zzir.zzMc;
      localObject5 = new com/google/android/gms/internal/zzev$1;
      localObject1 = this;
      ((zzev.1)localObject5).<init>(this, localzzes);
      ((Handler)localObject4).post((Runnable)localObject5);
      break;
      bool1 = localArrayList.isEmpty();
      if (!bool1)
      {
        localObject1 = this;
        localObject3 = this.zzpe;
        localObject4 = "mediation_networks_fail";
        localObject5 = TextUtils.join(",", localArrayList);
        ((zzcb)localObject3).zzc((String)localObject4, (String)localObject5);
      }
      Object localObject3 = new com/google/android/gms/internal/zzes;
      int j = 1;
      ((zzes)localObject3).<init>(j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzev.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */