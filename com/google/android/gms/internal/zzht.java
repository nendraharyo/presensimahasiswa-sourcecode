package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.common.internal.zzx;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class zzht
  extends zzb
  implements zzhw
{
  private static final zzew zzKv;
  private final Map zzKw;
  private boolean zzKx;
  
  static
  {
    zzew localzzew = new com/google/android/gms/internal/zzew;
    localzzew.<init>();
    zzKv = localzzew;
  }
  
  public zzht(Context paramContext, zzd paramzzd, AdSizeParcel paramAdSizeParcel, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, null, paramzzex, paramVersionInfoParcel, paramzzd);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzKw = ((Map)localObject);
  }
  
  private zzif.zza zzc(zzif.zza paramzza)
  {
    Object localObject1 = "Creating mediation ad response for non-mediated rewarded ad.";
    zzin.v((String)localObject1);
    try
    {
      localObject1 = paramzza.zzLe;
      localObject1 = zzhe.zzc((AdResponseParcel)localObject1);
      localObject2 = ((JSONObject)localObject1).toString();
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      Object localObject3 = "pubid";
      Object localObject4 = paramzza.zzLd;
      localObject4 = ((AdRequestInfoParcel)localObject4).zzrj;
      ((JSONObject)localObject1).put((String)localObject3, localObject4);
      String str = ((JSONObject)localObject1).toString();
      localObject1 = new com/google/android/gms/internal/zzen;
      int i = 1;
      localObject4 = new String[i];
      localObject4[0] = "com.google.ads.mediation.admob.AdMobAdapter";
      localObject4 = Arrays.asList((Object[])localObject4);
      List localList1 = Collections.emptyList();
      Object localObject5 = Collections.emptyList();
      Object localObject6 = Collections.emptyList();
      List localList2 = Collections.emptyList();
      ((zzen)localObject1).<init>((String)localObject2, null, (List)localObject4, null, null, localList1, (List)localObject5, str, null, (List)localObject6, localList2, null, null, null, null, null);
      zzeo localzzeo = new com/google/android/gms/internal/zzeo;
      int j = 1;
      localObject2 = new zzen[j];
      localObject2[0] = localObject1;
      localObject2 = Arrays.asList((Object[])localObject2);
      long l1 = -1;
      Object localObject7 = Collections.emptyList();
      List localList3 = Collections.emptyList();
      localList1 = Collections.emptyList();
      localObject5 = "";
      int k = 1;
      int m = -1;
      long l2 = -1;
      localObject1 = localzzeo;
      localzzeo.<init>((List)localObject2, l1, (List)localObject7, localList3, localList1, (String)localObject5, -1, 0, k, null, 0, m, l2);
      localObject1 = new com/google/android/gms/internal/zzif$zza;
      localObject2 = paramzza.zzLd;
      localObject3 = paramzza.zzLe;
      localObject7 = paramzza.zzrp;
      int n = paramzza.errorCode;
      long l3 = paramzza.zzKY;
      long l4 = paramzza.zzKZ;
      localObject6 = paramzza.zzKT;
      localObject4 = localzzeo;
      ((zzif.zza)localObject1).<init>((AdRequestInfoParcel)localObject2, (AdResponseParcel)localObject3, localzzeo, (AdSizeParcel)localObject7, n, l3, l4, (JSONObject)localObject6);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = "Unable to generate ad state for non-mediated rewarded video.";
        zzin.zzb((String)localObject2, localJSONException);
        zzif.zza localzza = zzd(paramzza);
      }
    }
    return (zzif.zza)localObject1;
  }
  
  private zzif.zza zzd(zzif.zza paramzza)
  {
    zzif.zza localzza = new com/google/android/gms/internal/zzif$zza;
    AdRequestInfoParcel localAdRequestInfoParcel = paramzza.zzLd;
    AdResponseParcel localAdResponseParcel = paramzza.zzLe;
    AdSizeParcel localAdSizeParcel = paramzza.zzrp;
    long l1 = paramzza.zzKY;
    long l2 = paramzza.zzKZ;
    JSONObject localJSONObject = paramzza.zzKT;
    localzza.<init>(localAdRequestInfoParcel, localAdResponseParcel, null, localAdSizeParcel, 0, l1, l2, localJSONObject);
    return localzza;
  }
  
  public void destroy()
  {
    zzx.zzcD("destroy must be called on the main UI thread.");
    Object localObject1 = this.zzKw.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      try
      {
        Object localObject2 = this.zzKw;
        localObject2 = ((Map)localObject2).get(localObject1);
        localObject2 = (zzia)localObject2;
        if (localObject2 != null)
        {
          localObject3 = ((zzia)localObject2).zzgP();
          if (localObject3 != null)
          {
            localObject2 = ((zzia)localObject2).zzgP();
            ((zzey)localObject2).destroy();
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Object localObject3 = "Fail to destroy adapter: ";
        localStringBuilder = localStringBuilder.append((String)localObject3);
        localObject1 = (String)localObject1;
        zzin.zzaK((String)localObject1);
      }
    }
  }
  
  public boolean isLoaded()
  {
    zzx.zzcD("isLoaded must be called on the main UI thread.");
    Object localObject = this.zzpj.zzrn;
    boolean bool;
    if (localObject == null)
    {
      localObject = this.zzpj.zzro;
      if (localObject == null)
      {
        localObject = this.zzpj.zzrq;
        if (localObject != null)
        {
          bool = this.zzKx;
          if (!bool) {
            bool = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public void onRewardedVideoAdClosed()
  {
    zzaQ();
  }
  
  public void onRewardedVideoAdLeftApplication()
  {
    zzaR();
  }
  
  public void onRewardedVideoAdOpened()
  {
    zzif localzzif = this.zzpj.zzrq;
    zza(localzzif, false);
    zzaS();
  }
  
  public void onRewardedVideoStarted()
  {
    Object localObject = this.zzpj.zzrq;
    if (localObject != null)
    {
      localObject = this.zzpj.zzrq.zzCp;
      if (localObject != null)
      {
        localObject = zzr.zzbP();
        Context localContext = this.zzpj.context;
        String str1 = this.zzpj.zzrl.afmaVersion;
        zzif localzzif = this.zzpj.zzrq;
        String str2 = this.zzpj.zzrj;
        List localList = this.zzpj.zzrq.zzCp.zzBH;
        ((zzet)localObject).zza(localContext, str1, localzzif, str2, false, localList);
      }
    }
    zzaU();
  }
  
  public void pause()
  {
    zzx.zzcD("pause must be called on the main UI thread.");
    Object localObject1 = this.zzKw.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      try
      {
        Object localObject2 = this.zzKw;
        localObject2 = ((Map)localObject2).get(localObject1);
        localObject2 = (zzia)localObject2;
        if (localObject2 != null)
        {
          localObject3 = ((zzia)localObject2).zzgP();
          if (localObject3 != null)
          {
            localObject2 = ((zzia)localObject2).zzgP();
            ((zzey)localObject2).pause();
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Object localObject3 = "Fail to pause adapter: ";
        localStringBuilder = localStringBuilder.append((String)localObject3);
        localObject1 = (String)localObject1;
        zzin.zzaK((String)localObject1);
      }
    }
  }
  
  public void resume()
  {
    zzx.zzcD("resume must be called on the main UI thread.");
    Object localObject1 = this.zzKw.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      try
      {
        Object localObject2 = this.zzKw;
        localObject2 = ((Map)localObject2).get(localObject1);
        localObject2 = (zzia)localObject2;
        if (localObject2 != null)
        {
          localObject3 = ((zzia)localObject2).zzgP();
          if (localObject3 != null)
          {
            localObject2 = ((zzia)localObject2).zzgP();
            ((zzey)localObject2).resume();
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Object localObject3 = "Fail to resume adapter: ";
        localStringBuilder = localStringBuilder.append((String)localObject3);
        localObject1 = (String)localObject1;
        zzin.zzaK((String)localObject1);
      }
    }
  }
  
  public void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    zzx.zzcD("loadAd must be called on the main UI thread.");
    Object localObject = paramRewardedVideoAdRequestParcel.zzrj;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool)
    {
      localObject = "Invalid ad unit id. Aborting.";
      zzin.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      bool = false;
      this.zzKx = false;
      localObject = this.zzpj;
      String str = paramRewardedVideoAdRequestParcel.zzrj;
      ((zzs)localObject).zzrj = str;
      localObject = paramRewardedVideoAdRequestParcel.zzHt;
      super.zzb((AdRequestParcel)localObject);
    }
  }
  
  public void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    int i = paramzza.errorCode;
    int j = -2;
    Object localObject1;
    Object localObject2;
    if (i != j)
    {
      localObject1 = zzir.zzMc;
      localObject2 = new com/google/android/gms/internal/zzht$1;
      ((zzht.1)localObject2).<init>(this, paramzza);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      this.zzpj.zzrr = paramzza;
      localObject1 = paramzza.zzKV;
      if (localObject1 == null)
      {
        localObject1 = this.zzpj;
        localObject2 = zzc(paramzza);
        ((zzs)localObject1).zzrr = ((zzif.zza)localObject2);
      }
      localObject1 = this.zzpj;
      j = 0;
      ((zzs)localObject1).zzrL = 0;
      localObject1 = this.zzpj;
      localObject2 = zzr.zzbB();
      Context localContext = this.zzpj.context;
      String str = this.zzpj.getUserId();
      zzif.zza localzza = this.zzpj.zzrr;
      localObject2 = ((zzgr)localObject2).zza(localContext, str, localzza, this);
      ((zzs)localObject1).zzro = ((zzit)localObject2);
    }
  }
  
  public boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    return true;
  }
  
  public zzia zzaw(String paramString)
  {
    localObject1 = (zzia)this.zzKw.get(paramString);
    if (localObject1 == null) {}
    try
    {
      localObject2 = this.zzpn;
      localObject4 = "com.google.ads.mediation.admob.AdMobAdapter";
      boolean bool = ((String)localObject4).equals(paramString);
      if (!bool) {
        break label137;
      }
      localObject2 = zzKv;
      localObject4 = localObject2;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject3;
        try
        {
          Object localObject2;
          localObject1 = this.zzKw;
          ((Map)localObject1).put(paramString, localObject2);
          localObject1 = localObject2;
          return (zzia)localObject1;
        }
        catch (Exception localException2)
        {
          String str;
          localObject1 = localException1;
          localObject3 = localException2;
          continue;
        }
        localException1 = localException1;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        str = "Fail to instantiate adapter ";
        localObject4 = str + paramString;
        zzin.zzd((String)localObject4, localException1);
        continue;
        localObject4 = localObject3;
      }
    }
    localObject2 = new com/google/android/gms/internal/zzia;
    localObject4 = ((zzex)localObject4).zzaf(paramString);
    ((zzia)localObject2).<init>((zzey)localObject4, this);
  }
  
  public void zzc(RewardItemParcel paramRewardItemParcel)
  {
    Object localObject1 = this.zzpj.zzrq;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.zzpj.zzrq.zzCp;
      if (localObject1 != null)
      {
        localObject1 = zzr.zzbP();
        localObject2 = this.zzpj.context;
        String str1 = this.zzpj.zzrl.afmaVersion;
        zzif localzzif = this.zzpj.zzrq;
        String str2 = this.zzpj.zzrj;
        List localList = this.zzpj.zzrq.zzCp.zzBI;
        ((zzet)localObject1).zza((Context)localObject2, str1, localzzif, str2, false, localList);
      }
    }
    localObject1 = this.zzpj.zzrq;
    if (localObject1 != null)
    {
      localObject1 = this.zzpj.zzrq.zzKV;
      if (localObject1 != null)
      {
        localObject1 = this.zzpj.zzrq.zzKV.zzBV;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool)
        {
          paramRewardItemParcel = new com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
          localObject1 = this.zzpj.zzrq.zzKV.zzBV;
          localObject2 = this.zzpj.zzrq.zzKV;
          int i = ((zzeo)localObject2).zzBW;
          paramRewardItemParcel.<init>((String)localObject1, i);
        }
      }
    }
    zza(paramRewardItemParcel);
  }
  
  public void zzgL()
  {
    Object localObject1 = "showAd must be called on the main UI thread.";
    zzx.zzcD((String)localObject1);
    boolean bool = isLoaded();
    if (!bool)
    {
      localObject1 = "The reward video has not loaded.";
      zzin.zzaK((String)localObject1);
    }
    for (;;)
    {
      return;
      bool = true;
      this.zzKx = bool;
      localObject1 = this.zzpj.zzrq.zzCr;
      localObject1 = zzaw((String)localObject1);
      if (localObject1 != null)
      {
        Object localObject2 = ((zzia)localObject1).zzgP();
        if (localObject2 != null) {
          try
          {
            localObject1 = ((zzia)localObject1).zzgP();
            ((zzey)localObject1).showVideo();
          }
          catch (RemoteException localRemoteException)
          {
            localObject2 = "Could not call showVideo.";
            zzin.zzd((String)localObject2, localRemoteException);
          }
        }
      }
    }
  }
  
  public void zzgM()
  {
    onAdClicked();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzht.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */