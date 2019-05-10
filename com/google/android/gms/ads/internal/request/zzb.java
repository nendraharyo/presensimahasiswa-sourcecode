package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzeo;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziq;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzmq;
import org.json.JSONException;
import org.json.JSONObject;

public class zzb
  extends zzim
  implements zzc.zza
{
  private final Context mContext;
  zzeo zzCf;
  private AdRequestInfoParcel zzCu;
  AdResponseParcel zzGe;
  private Runnable zzGf;
  private final Object zzGg;
  private final zza.zza zzHg;
  private final AdRequestInfoParcel.zza zzHh;
  zzit zzHi;
  private final zzan zzyt;
  
  public zzb(Context paramContext, AdRequestInfoParcel.zza paramzza, zzan paramzzan, zza.zza paramzza1)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzGg = localObject;
    this.zzHg = paramzza1;
    this.mContext = paramContext;
    this.zzHh = paramzza;
    this.zzyt = paramzzan;
  }
  
  private void zzc(int paramInt, String paramString)
  {
    long l1 = -1;
    int i = 3;
    Object localObject1;
    label53:
    Object localObject2;
    if (paramInt != i)
    {
      i = -1;
      if (paramInt != i) {}
    }
    else
    {
      zzin.zzaJ(paramString);
      localObject1 = this.zzGe;
      if (localObject1 != null) {
        break label132;
      }
      localObject1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
      ((AdResponseParcel)localObject1).<init>(paramInt);
      this.zzGe = ((AdResponseParcel)localObject1);
      localObject1 = this.zzCu;
      if (localObject1 == null) {
        break label167;
      }
      localObject2 = this.zzCu;
    }
    for (;;)
    {
      localObject1 = new com/google/android/gms/internal/zzif$zza;
      AdResponseParcel localAdResponseParcel = this.zzGe;
      zzeo localzzeo = this.zzCf;
      long l2 = this.zzGe.zzHX;
      ((zzif.zza)localObject1).<init>((AdRequestInfoParcel)localObject2, localAdResponseParcel, localzzeo, null, paramInt, l1, l2, null);
      this.zzHg.zza((zzif.zza)localObject1);
      return;
      zzin.zzaK(paramString);
      break;
      label132:
      localObject1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
      localObject2 = this.zzGe;
      long l3 = ((AdResponseParcel)localObject2).zzBU;
      ((AdResponseParcel)localObject1).<init>(paramInt, l3);
      this.zzGe = ((AdResponseParcel)localObject1);
      break label53;
      label167:
      localObject2 = new com/google/android/gms/ads/internal/request/AdRequestInfoParcel;
      localObject1 = this.zzHh;
      ((AdRequestInfoParcel)localObject2).<init>((AdRequestInfoParcel.zza)localObject1, null, l1);
    }
  }
  
  public void onStop()
  {
    synchronized (this.zzGg)
    {
      zzit localzzit = this.zzHi;
      if (localzzit != null)
      {
        localzzit = this.zzHi;
        localzzit.cancel();
      }
      return;
    }
  }
  
  zzit zza(VersionInfoParcel paramVersionInfoParcel, zzji paramzzji)
  {
    return zzc.zza(this.mContext, paramVersionInfoParcel, paramzzji, this);
  }
  
  protected AdSizeParcel zzb(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    Object localObject1 = this.zzGe.zzHW;
    if (localObject1 == null)
    {
      localObject1 = new com/google/android/gms/ads/internal/request/zzb$zza;
      ((zzb.zza)localObject1).<init>("The ad response must specify one of the supported ad sizes.", 0);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.zzGe.zzHW;
    Object localObject2 = "x";
    localObject1 = ((String)localObject1).split((String)localObject2);
    int i = localObject1.length;
    int j = 2;
    if (i != j)
    {
      localObject1 = new com/google/android/gms/ads/internal/request/zzb$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid ad size format from the ad response: ");
      str = this.zzGe.zzHW;
      localObject2 = str;
      ((zzb.zza)localObject1).<init>((String)localObject2, 0);
      throw ((Throwable)localObject1);
    }
    i = 0;
    float f1 = 0.0F;
    localObject2 = null;
    for (;;)
    {
      AdSizeParcel localAdSizeParcel;
      try
      {
        localObject2 = localObject1[0];
        int k = Integer.parseInt((String)localObject2);
        i = 1;
        f1 = Float.MIN_VALUE;
        localObject1 = localObject1[i];
        int m = Integer.parseInt((String)localObject1);
        localObject1 = paramAdRequestInfoParcel.zzrp;
        AdSizeParcel[] arrayOfAdSizeParcel = ((AdSizeParcel)localObject1).zzuj;
        int n = arrayOfAdSizeParcel.length;
        j = 0;
        str = null;
        if (j >= n) {
          break;
        }
        localAdSizeParcel = arrayOfAdSizeParcel[j];
        localObject1 = this.mContext.getResources().getDisplayMetrics();
        f1 = ((DisplayMetrics)localObject1).density;
        i1 = localAdSizeParcel.width;
        int i2 = -1;
        float f2 = 0.0F / 0.0F;
        if (i1 == i2)
        {
          float f3 = localAdSizeParcel.widthPixels / f1;
          i1 = (int)f3;
          i2 = localAdSizeParcel.height;
          int i3 = -2;
          if (i2 != i3) {
            break label363;
          }
          i2 = localAdSizeParcel.heightPixels;
          f2 = i2;
          f1 = f2 / f1;
          i = (int)f1;
          if ((k != i1) || (m != i)) {
            break label373;
          }
          localObject1 = new com/google/android/gms/ads/internal/client/AdSizeParcel;
          localObject2 = paramAdRequestInfoParcel.zzrp.zzuj;
          ((AdSizeParcel)localObject1).<init>(localAdSizeParcel, (AdSizeParcel[])localObject2);
          return (AdSizeParcel)localObject1;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localzza = new com/google/android/gms/ads/internal/request/zzb$zza;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Invalid ad size number from the ad response: ");
        str = this.zzGe.zzHW;
        localObject2 = str;
        localzza.<init>((String)localObject2, 0);
        throw localzza;
      }
      int i1 = localAdSizeParcel.width;
      continue;
      label363:
      i = localAdSizeParcel.height;
      continue;
      label373:
      i1 = j + 1;
      j = i1;
    }
    zzb.zza localzza = new com/google/android/gms/ads/internal/request/zzb$zza;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("The ad size from the ad response was not one of the requested sizes: ");
    String str = this.zzGe.zzHW;
    localObject2 = str;
    localzza.<init>((String)localObject2, 0);
    throw localzza;
  }
  
  public void zzb(AdResponseParcel paramAdResponseParcel)
  {
    int i = -2;
    zzb.zza localzza1 = null;
    zzin.zzaI("Received ad response.");
    this.zzGe = paramAdResponseParcel;
    long l1 = zzr.zzbG().elapsedRealtime();
    Object localObject4 = this.zzGg;
    int j = 0;
    Object localObject5 = null;
    try
    {
      this.zzHi = null;
      try
      {
        localObject4 = this.zzGe;
        k = ((AdResponseParcel)localObject4).errorCode;
        if (k == i) {
          break label212;
        }
        localObject4 = this.zzGe;
        k = ((AdResponseParcel)localObject4).errorCode;
        j = -3;
        if (k == j) {
          break label212;
        }
        localzza1 = new com/google/android/gms/ads/internal/request/zzb$zza;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "There was a problem getting an ad response. ErrorCode: ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = this.zzGe;
        j = ((AdResponseParcel)localObject5).errorCode;
        localObject4 = ((StringBuilder)localObject4).append(j);
        localObject4 = ((StringBuilder)localObject4).toString();
        localObject5 = this.zzGe;
        j = ((AdResponseParcel)localObject5).errorCode;
        localzza1.<init>((String)localObject4, j);
        throw localzza1;
      }
      catch (zzb.zza localzza2)
      {
        int k = localzza2.getErrorCode();
        Object localObject1 = localzza2.getMessage();
        zzc(k, (String)localObject1);
        localObject1 = zzir.zzMc;
        localObject4 = this.zzGf;
        ((Handler)localObject1).removeCallbacks((Runnable)localObject4);
      }
      return;
    }
    finally {}
    label212:
    zzgq();
    localObject4 = this.zzCu;
    localObject4 = ((AdRequestInfoParcel)localObject4).zzrp;
    localObject4 = ((AdSizeParcel)localObject4).zzuj;
    if (localObject4 != null) {
      localObject4 = this.zzCu;
    }
    for (AdSizeParcel localAdSizeParcel = zzb((AdRequestInfoParcel)localObject4);; localAdSizeParcel = null)
    {
      localObject4 = zzr.zzbF();
      localObject5 = this.zzGe;
      boolean bool1 = ((AdResponseParcel)localObject5).zzId;
      ((zzih)localObject4).zzB(bool1);
      localObject4 = this.zzGe.zzIb;
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject4);
      if (!bool2) {}
      for (;;)
      {
        try
        {
          localJSONObject = new org/json/JSONObject;
          localObject4 = this.zzGe;
          localObject4 = ((AdResponseParcel)localObject4).zzIb;
          localJSONObject.<init>((String)localObject4);
          Object localObject3 = new com/google/android/gms/internal/zzif$zza;
          localObject4 = this.zzCu;
          localObject5 = this.zzGe;
          zzeo localzzeo = this.zzCf;
          AdResponseParcel localAdResponseParcel = this.zzGe;
          long l2 = localAdResponseParcel.zzHX;
          ((zzif.zza)localObject3).<init>((AdRequestInfoParcel)localObject4, (AdResponseParcel)localObject5, localzzeo, localAdSizeParcel, i, l1, l2, localJSONObject);
          this.zzHg.zza((zzif.zza)localObject3);
          localObject3 = zzir.zzMc;
          localObject4 = this.zzGf;
          ((Handler)localObject3).removeCallbacks((Runnable)localObject4);
        }
        catch (Exception localException)
        {
          localObject5 = "Error parsing the JSON for Active View.";
          zzin.zzb((String)localObject5, localException);
        }
        JSONObject localJSONObject = null;
      }
    }
  }
  
  public void zzbr()
  {
    zzin.zzaI("AdLoaderBackgroundTask started.");
    Object localObject1 = new com/google/android/gms/ads/internal/request/zzb$1;
    ((zzb.1)localObject1).<init>(this);
    this.zzGf = ((Runnable)localObject1);
    Object localObject2 = zzir.zzMc;
    Runnable localRunnable = this.zzGf;
    long l1 = ((Long)zzbt.zzwX.get()).longValue();
    ((Handler)localObject2).postDelayed(localRunnable, l1);
    localObject1 = new com/google/android/gms/internal/zzjj;
    ((zzjj)localObject1).<init>();
    long l2 = zzr.zzbG().elapsedRealtime();
    localObject2 = new com/google/android/gms/ads/internal/request/zzb$2;
    ((zzb.2)localObject2).<init>(this, (zzji)localObject1);
    zziq.zza((Runnable)localObject2);
    localObject2 = this.zzyt.zzab();
    Object localObject3 = this.mContext;
    localObject2 = ((zzaj)localObject2).zzb((Context)localObject3);
    localObject3 = new com/google/android/gms/ads/internal/request/AdRequestInfoParcel;
    AdRequestInfoParcel.zza localzza = this.zzHh;
    ((AdRequestInfoParcel)localObject3).<init>(localzza, (String)localObject2, l2);
    this.zzCu = ((AdRequestInfoParcel)localObject3);
    localObject2 = this.zzCu;
    ((zzji)localObject1).zzh(localObject2);
  }
  
  protected void zzgq()
  {
    Object localObject1 = this.zzGe;
    int i = ((AdResponseParcel)localObject1).errorCode;
    int j = -3;
    if (i == j) {}
    for (;;)
    {
      return;
      localObject1 = this.zzGe.body;
      boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool1)
      {
        localObject1 = new com/google/android/gms/ads/internal/request/zzb$zza;
        ((zzb.zza)localObject1).<init>("No fill from ad server.", 3);
        throw ((Throwable)localObject1);
      }
      localObject1 = zzr.zzbF();
      Object localObject2 = this.mContext;
      Object localObject3 = this.zzGe;
      boolean bool2 = ((AdResponseParcel)localObject3).zzHB;
      ((zzih)localObject1).zza((Context)localObject2, bool2);
      localObject1 = this.zzGe;
      bool1 = ((AdResponseParcel)localObject1).zzHT;
      if (!bool1) {
        continue;
      }
      try
      {
        localObject1 = new com/google/android/gms/internal/zzeo;
        localObject2 = this.zzGe;
        localObject2 = ((AdResponseParcel)localObject2).body;
        ((zzeo)localObject1).<init>((String)localObject2);
        this.zzCf = ((zzeo)localObject1);
      }
      catch (JSONException localJSONException)
      {
        zzb.zza localzza = new com/google/android/gms/ads/internal/request/zzb$zza;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Could not parse mediation config: ");
        localObject3 = this.zzGe.body;
        localObject2 = (String)localObject3;
        localzza.<init>((String)localObject2, 0);
        throw localzza;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */