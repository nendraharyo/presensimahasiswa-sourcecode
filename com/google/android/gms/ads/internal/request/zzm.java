package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzeg.zzd;
import com.google.android.gms.internal.zzhe;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzmq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class zzm
  extends zzim
{
  private static zzdk zzIA = null;
  private static zzdf zzIB = null;
  static final long zzIw = TimeUnit.SECONDS.toMillis(10);
  private static boolean zzIx;
  private static zzeg zzIy;
  private static zzdg zzIz;
  private static final Object zzqy;
  private final Context mContext;
  private final Object zzGg;
  private final zza.zza zzHg;
  private final AdRequestInfoParcel.zza zzHh;
  private zzeg.zzd zzIC;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
    zzIx = false;
    zzIy = null;
    zzIz = null;
  }
  
  public zzm(Context paramContext, AdRequestInfoParcel.zza paramzza, zza.zza paramzza1)
  {
    super(bool);
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    this.zzGg = localObject1;
    this.zzHg = paramzza1;
    this.mContext = paramContext;
    this.zzHh = paramzza;
    synchronized (zzqy)
    {
      bool = zzIx;
      if (!bool)
      {
        localObject1 = new com/google/android/gms/internal/zzdk;
        ((zzdk)localObject1).<init>();
        zzIA = (zzdk)localObject1;
        localObject1 = new com/google/android/gms/internal/zzdg;
        Context localContext = paramContext.getApplicationContext();
        Object localObject4 = paramzza.zzrl;
        ((zzdg)localObject1).<init>(localContext, (VersionInfoParcel)localObject4);
        zzIz = (zzdg)localObject1;
        localObject1 = new com/google/android/gms/ads/internal/request/zzm$zzc;
        ((zzm.zzc)localObject1).<init>();
        zzIB = (zzdf)localObject1;
        localObject1 = new com/google/android/gms/internal/zzeg;
        localContext = this.mContext;
        localContext = localContext.getApplicationContext();
        localObject4 = this.zzHh;
        localObject4 = ((AdRequestInfoParcel.zza)localObject4).zzrl;
        Object localObject5 = zzbt.zzvB;
        localObject5 = ((zzbp)localObject5).get();
        localObject5 = (String)localObject5;
        zzm.zzb localzzb = new com/google/android/gms/ads/internal/request/zzm$zzb;
        localzzb.<init>();
        zzm.zza localzza = new com/google/android/gms/ads/internal/request/zzm$zza;
        localzza.<init>();
        ((zzeg)localObject1).<init>(localContext, (VersionInfoParcel)localObject4, (String)localObject5, localzzb, localzza);
        zzIy = (zzeg)localObject1;
        bool = true;
        zzIx = bool;
      }
      return;
    }
  }
  
  private JSONObject zza(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    JSONObject localJSONObject = null;
    Bundle localBundle = paramAdRequestInfoParcel.zzHt.extras.getBundle("sdk_less_server_data");
    Object localObject1 = paramAdRequestInfoParcel.zzHt.extras;
    Object localObject3 = "sdk_less_network_id";
    String str1 = ((Bundle)localObject1).getString((String)localObject3);
    if (localBundle == null) {}
    for (;;)
    {
      return localJSONObject;
      localObject1 = this.mContext;
      localObject3 = zzr.zzbI();
      Object localObject4 = this.mContext;
      localObject4 = ((zzhk)localObject3).zzE((Context)localObject4);
      zzbm localzzbm = new com/google/android/gms/internal/zzbm;
      localObject3 = (String)zzbt.zzvB.get();
      localzzbm.<init>((String)localObject3);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject3 = paramAdRequestInfoParcel;
      String str2 = null;
      localObject3 = zzhe.zza((Context)localObject1, paramAdRequestInfoParcel, (zzhj)localObject4, null, null, localzzbm, null, null, localArrayList, null);
      if (localObject3 == null) {
        continue;
      }
      try
      {
        localObject1 = this.mContext;
        localObject1 = AdvertisingIdClient.getAdvertisingIdInfo((Context)localObject1);
        localObject4 = new java/util/HashMap;
        ((HashMap)localObject4).<init>();
        ((HashMap)localObject4).put("request_id", paramString);
        ((HashMap)localObject4).put("network_id", str1);
        str2 = "request_param";
        ((HashMap)localObject4).put(str2, localObject3);
        localObject3 = "data";
        ((HashMap)localObject4).put(localObject3, localBundle);
        if (localObject1 != null)
        {
          str2 = ((AdvertisingIdClient.Info)localObject1).getId();
          ((HashMap)localObject4).put("adid", str2);
          localObject3 = "lat";
          int i = ((AdvertisingIdClient.Info)localObject1).isLimitAdTrackingEnabled();
          if (i == 0) {
            break label300;
          }
          i = 1;
          localObject1 = Integer.valueOf(i);
          ((HashMap)localObject4).put(localObject3, localObject1);
        }
      }
      catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
      {
        for (;;)
        {
          try
          {
            localObject1 = zzr.zzbC();
            localJSONObject = ((zzir)localObject1).zzG((Map)localObject4);
          }
          catch (JSONException localJSONException) {}
          localGooglePlayServicesRepairableException = localGooglePlayServicesRepairableException;
          localObject4 = "Cannot get advertising id info";
          zzin.zzd((String)localObject4, localGooglePlayServicesRepairableException);
          int j = 0;
          Object localObject2 = null;
          continue;
          j = 0;
          localObject2 = null;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;) {}
      }
      catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
      {
        for (;;) {}
      }
      catch (IOException localIOException)
      {
        label300:
        for (;;) {}
      }
    }
  }
  
  protected static void zzc(zzed paramzzed)
  {
    Object localObject = zzIA;
    paramzzed.zza("/loadAd", (zzdf)localObject);
    localObject = zzIz;
    paramzzed.zza("/fetchHttpRequest", (zzdf)localObject);
    localObject = zzIB;
    paramzzed.zza("/invalidRequest", (zzdf)localObject);
  }
  
  protected static void zzd(zzed paramzzed)
  {
    Object localObject = zzIA;
    paramzzed.zzb("/loadAd", (zzdf)localObject);
    localObject = zzIz;
    paramzzed.zzb("/fetchHttpRequest", (zzdf)localObject);
    localObject = zzIB;
    paramzzed.zzb("/invalidRequest", (zzdf)localObject);
  }
  
  private AdResponseParcel zze(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    int i = -1;
    Object localObject1 = UUID.randomUUID().toString();
    Object localObject3 = zza(paramAdRequestInfoParcel, (String)localObject1);
    if (localObject3 == null)
    {
      localObject1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
      ((AdResponseParcel)localObject1).<init>(0);
    }
    for (;;)
    {
      return (AdResponseParcel)localObject1;
      Object localObject4 = zzr.zzbG();
      long l1 = ((zzmq)localObject4).elapsedRealtime();
      Future localFuture = zzIA.zzR((String)localObject1);
      Object localObject5 = zza.zzMS;
      zzm.2 local2 = new com/google/android/gms/ads/internal/request/zzm$2;
      local2.<init>(this, (JSONObject)localObject3, (String)localObject1);
      ((Handler)localObject5).post(local2);
      long l2 = zzIw;
      localObject5 = zzr.zzbG();
      long l3 = ((zzmq)localObject5).elapsedRealtime();
      l1 = l3 - l1;
      l2 -= l1;
      try
      {
        localObject4 = TimeUnit.MILLISECONDS;
        localObject1 = localFuture.get(l2, (TimeUnit)localObject4);
        localObject1 = (JSONObject)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
          ((AdResponseParcel)localObject1).<init>(i);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        AdResponseParcel localAdResponseParcel1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        localAdResponseParcel1.<init>(i);
      }
      catch (TimeoutException localTimeoutException)
      {
        AdResponseParcel localAdResponseParcel2 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        j = 2;
        localAdResponseParcel2.<init>(j);
      }
      catch (ExecutionException localExecutionException)
      {
        Object localObject2 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        ((AdResponseParcel)localObject2).<init>(0);
        continue;
        localObject3 = this.mContext;
        localObject2 = ((JSONObject)localObject2).toString();
        localObject2 = zzhe.zza((Context)localObject3, paramAdRequestInfoParcel, (String)localObject2);
        int j = ((AdResponseParcel)localObject2).errorCode;
        int m = -3;
        if (j == m) {
          continue;
        }
        localObject3 = ((AdResponseParcel)localObject2).body;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject3);
        if (!bool) {
          continue;
        }
        localObject2 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        int k = 3;
        ((AdResponseParcel)localObject2).<init>(k);
      }
      catch (CancellationException localCancellationException)
      {
        for (;;) {}
      }
    }
  }
  
  public void onStop()
  {
    synchronized (this.zzGg)
    {
      Handler localHandler = zza.zzMS;
      zzm.3 local3 = new com/google/android/gms/ads/internal/request/zzm$3;
      local3.<init>(this);
      localHandler.post(local3);
      return;
    }
  }
  
  public void zzbr()
  {
    zzin.zzaI("SdkLessAdLoaderBackgroundTask started.");
    Object localObject1 = new com/google/android/gms/ads/internal/request/AdRequestInfoParcel;
    Object localObject2 = this.zzHh;
    ((AdRequestInfoParcel)localObject1).<init>((AdRequestInfoParcel.zza)localObject2, null, -1);
    Object localObject3 = zze((AdRequestInfoParcel)localObject1);
    long l1 = zzr.zzbG().elapsedRealtime();
    localObject2 = new com/google/android/gms/internal/zzif$zza;
    int i = ((AdResponseParcel)localObject3).errorCode;
    long l2 = ((AdResponseParcel)localObject3).zzHX;
    ((zzif.zza)localObject2).<init>((AdRequestInfoParcel)localObject1, (AdResponseParcel)localObject3, null, null, i, l1, l2, null);
    localObject1 = zza.zzMS;
    localObject3 = new com/google/android/gms/ads/internal/request/zzm$1;
    ((zzm.1)localObject3).<init>(this, (zzif.zza)localObject2);
    ((Handler)localObject1).post((Runnable)localObject3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */