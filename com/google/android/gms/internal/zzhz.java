package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class zzhz
  extends zzim
  implements zzhy
{
  private final Context mContext;
  private final zzif.zza zzGd;
  private final ArrayList zzKL;
  private final ArrayList zzKM;
  private final HashSet zzKN;
  private final zzht zzKO;
  private final Object zzpV;
  private final String zzrG;
  
  public zzhz(Context paramContext, String paramString, zzif.zza paramzza, zzht paramzzht)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzKL = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzKM = ((ArrayList)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzKN = ((HashSet)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.mContext = paramContext;
    this.zzrG = paramString;
    this.zzGd = paramzza;
    this.zzKO = paramzzht;
  }
  
  private zzif zza(int paramInt, String paramString, zzen paramzzen)
  {
    zzif localzzif = new com/google/android/gms/internal/zzif;
    AdRequestParcel localAdRequestParcel = this.zzGd.zzLd.zzHt;
    List localList1 = this.zzGd.zzLe.zzBQ;
    List localList2 = this.zzGd.zzLe.zzBR;
    List localList3 = this.zzGd.zzLe.zzHV;
    int i = this.zzGd.zzLe.orientation;
    long l1 = this.zzGd.zzLe.zzBU;
    String str1 = this.zzGd.zzLd.zzHw;
    boolean bool1 = this.zzGd.zzLe.zzHT;
    zzeo localzzeo = this.zzGd.zzKV;
    long l2 = this.zzGd.zzLe.zzHU;
    AdSizeParcel localAdSizeParcel = this.zzGd.zzrp;
    long l3 = this.zzGd.zzLe.zzHS;
    long l4 = this.zzGd.zzKY;
    long l5 = this.zzGd.zzLe.zzHX;
    String str2 = this.zzGd.zzLe.zzHY;
    JSONObject localJSONObject = this.zzGd.zzKT;
    RewardItemParcel localRewardItemParcel = this.zzGd.zzLe.zzIj;
    List localList4 = this.zzGd.zzLe.zzIk;
    List localList5 = this.zzGd.zzLe.zzIl;
    boolean bool2 = this.zzGd.zzLe.zzIm;
    localzzif.<init>(localAdRequestParcel, null, localList1, paramInt, localList2, localList3, i, l1, str1, bool1, paramzzen, null, paramString, localzzeo, null, l2, localAdSizeParcel, l3, l4, l5, str2, localJSONObject, null, localRewardItemParcel, localList4, localList5, bool2);
    return localzzif;
  }
  
  private zzif zza(String paramString, zzen paramzzen)
  {
    return zza(-2, paramString, paramzzen);
  }
  
  private void zzd(String paramString1, String paramString2, String paramString3)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzKO;
      zzia localzzia = ((zzht)localObject2).zzaw(paramString1);
      if (localzzia != null)
      {
        localObject2 = localzzia.zzgQ();
        if (localObject2 != null)
        {
          localObject2 = localzzia.zzgP();
          if (localObject2 != null) {
            break label56;
          }
        }
      }
      return;
      label56:
      localObject2 = new com/google/android/gms/internal/zzhu;
      Object localObject4 = this.mContext;
      String str = this.zzrG;
      zzif.zza localzza = this.zzGd;
      ((zzhu)localObject2).<init>((Context)localObject4, paramString1, str, paramString2, paramString3, localzza, localzzia, this);
      localObject4 = this.zzKL;
      localObject2 = ((zzim)localObject2).zzhn();
      ((ArrayList)localObject4).add(localObject2);
      localObject2 = this.zzKM;
      ((ArrayList)localObject2).add(paramString1);
    }
  }
  
  private zzif zzgO()
  {
    return zza(3, null, null);
  }
  
  public void onStop() {}
  
  public void zza(String paramString, int paramInt) {}
  
  public void zzax(String paramString)
  {
    synchronized (this.zzpV)
    {
      HashSet localHashSet = this.zzKN;
      localHashSet.add(paramString);
      return;
    }
  }
  
  public void zzbr()
  {
    Object localObject1 = this.zzGd.zzKV.zzBO;
    ??? = ((List)localObject1).iterator();
    boolean bool1 = ((Iterator)???).hasNext();
    Object localObject4;
    if (bool1)
    {
      localObject1 = (zzen)((Iterator)???).next();
      localObject4 = ((zzen)localObject1).zzBG;
      localObject5 = ((zzen)localObject1).zzBB;
      Iterator localIterator = ((List)localObject5).iterator();
      for (;;)
      {
        k = localIterator.hasNext();
        if (k == 0) {
          break;
        }
        localObject5 = (String)localIterator.next();
        String str = ((zzen)localObject1).zzBz;
        zzd((String)localObject5, (String)localObject4, str);
      }
    }
    bool1 = false;
    localObject1 = null;
    int k = 0;
    localObject5 = null;
    for (;;)
    {
      localObject1 = this.zzKL;
      int i = ((ArrayList)localObject1).size();
      if (k < i) {
        for (;;)
        {
          try
          {
            localObject1 = this.zzKL;
            localObject1 = ((ArrayList)localObject1).get(k);
            localObject1 = (Future)localObject1;
            ((Future)localObject1).get();
          }
          catch (InterruptedException localInterruptedException)
          {
            boolean bool2;
            int j;
            zzif localzzif = zzgO();
            localObject5 = zza.zzMS;
            ??? = new com/google/android/gms/internal/zzhz$2;
            ((zzhz.2)???).<init>(this, localzzif);
            ((Handler)localObject5).post((Runnable)???);
            continue;
          }
          catch (Exception localException)
          {
            continue;
          }
          synchronized (this.zzpV)
          {
            localObject1 = this.zzKN;
            localObject4 = this.zzKM;
            localObject4 = ((ArrayList)localObject4).get(k);
            bool2 = ((HashSet)localObject1).contains(localObject4);
            if (bool2)
            {
              localObject1 = this.zzKM;
              localObject1 = ((ArrayList)localObject1).get(k);
              localObject1 = (String)localObject1;
              localObject4 = this.zzGd;
              localObject4 = ((zzif.zza)localObject4).zzKV;
              localObject4 = ((zzeo)localObject4).zzBO;
              localObject5 = ((List)localObject4).get(k);
              localObject5 = (zzen)localObject5;
              localObject1 = zza((String)localObject1, (zzen)localObject5);
              localObject5 = zza.zzMS;
              localObject4 = new com/google/android/gms/internal/zzhz$1;
              ((zzhz.1)localObject4).<init>(this, (zzif)localObject1);
              ((Handler)localObject5).post((Runnable)localObject4);
              return;
            }
            j = k + 1;
            k = j;
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */