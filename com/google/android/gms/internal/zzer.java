package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzer
  implements zzes.zza
{
  private final Context mContext;
  private final String zzCd;
  private final long zzCe;
  private final zzeo zzCf;
  private final zzen zzCg;
  private final AdSizeParcel zzCh;
  private zzey zzCi;
  private int zzCj;
  private zzfa zzCk;
  private final NativeAdOptionsParcel zzpP;
  private final List zzpQ;
  private final VersionInfoParcel zzpT;
  private final Object zzpV;
  private final zzex zzpn;
  private final AdRequestParcel zzqH;
  private final boolean zzsA;
  private final boolean zzuS;
  
  public zzer(Context paramContext, String paramString, zzex paramzzex, zzeo paramzzeo, zzen paramzzen, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, VersionInfoParcel paramVersionInfoParcel, boolean paramBoolean1, boolean paramBoolean2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzCj = -2;
    this.mContext = paramContext;
    this.zzpn = paramzzex;
    this.zzCg = paramzzen;
    localObject = "com.google.ads.mediation.customevent.CustomEventAdapter";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = zzey();
      this.zzCd = ((String)localObject);
      this.zzCf = paramzzeo;
      l1 = paramzzeo.zzBP;
      long l2 = -1;
      bool = l1 < l2;
      if (!bool) {
        break label164;
      }
    }
    label164:
    for (long l1 = paramzzeo.zzBP;; l1 = 10000L)
    {
      this.zzCe = l1;
      this.zzqH = paramAdRequestParcel;
      this.zzCh = paramAdSizeParcel;
      this.zzpT = paramVersionInfoParcel;
      this.zzsA = paramBoolean1;
      this.zzuS = paramBoolean2;
      this.zzpP = paramNativeAdOptionsParcel;
      this.zzpQ = paramList;
      return;
      this.zzCd = paramString;
      break;
    }
  }
  
  private void zza(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    for (;;)
    {
      int i = this.zzCj;
      int j = -2;
      if (i != j) {
        return;
      }
      zzb(paramLong1, paramLong2, paramLong3, paramLong4);
    }
  }
  
  private void zza(zzeq paramzzeq)
  {
    Object localObject1 = "com.google.ads.mediation.AdUrlAdapter";
    localObject3 = this.zzCd;
    boolean bool1 = ((String)localObject1).equals(localObject3);
    if (bool1)
    {
      localObject1 = this.zzqH.zztM;
      localObject3 = this.zzCd;
      localObject1 = ((Bundle)localObject1).getBundle((String)localObject3);
      if (localObject1 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
      }
      localObject4 = this.zzCg.zzBA;
      ((Bundle)localObject1).putString("sdk_less_network_id", (String)localObject4);
      localObject3 = this.zzqH.zztM;
      localObject4 = this.zzCd;
      ((Bundle)localObject3).putBundle((String)localObject4, (Bundle)localObject1);
    }
    localObject1 = this.zzCg.zzBG;
    str = zzac((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = this.zzpT;
        int i = ((VersionInfoParcel)localObject1).zzNa;
        int k = 4100000;
        if (i >= k) {
          continue;
        }
        localObject1 = this.zzCh;
        boolean bool2 = ((AdSizeParcel)localObject1).zzui;
        if (bool2)
        {
          localObject1 = this.zzCi;
          localObject3 = this.mContext;
          localObject3 = zze.zzC(localObject3);
          localObject4 = this.zzqH;
          ((zzey)localObject1).zza((zzd)localObject3, (AdRequestParcel)localObject4, str, paramzzeq);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "Could not request ad from mediation adapter.";
        zzin.zzd((String)localObject3, localRemoteException);
        int j = 5;
        zzr(j);
        continue;
        boolean bool3 = this.zzsA;
        if (!bool3) {
          continue;
        }
        localObject3 = this.zzCi;
        Object localObject2 = this.mContext;
        localObject4 = zze.zzC(localObject2);
        AdRequestParcel localAdRequestParcel = this.zzqH;
        localObject2 = this.zzCg;
        Object localObject5 = ((zzen)localObject2).zzBz;
        NativeAdOptionsParcel localNativeAdOptionsParcel = this.zzpP;
        List localList = this.zzpQ;
        ((zzey)localObject3).zza((zzd)localObject4, localAdRequestParcel, str, (String)localObject5, paramzzeq, localNativeAdOptionsParcel, localList);
        continue;
        localObject2 = this.zzCh;
        bool3 = ((AdSizeParcel)localObject2).zzui;
        if (!bool3) {
          continue;
        }
        localObject3 = this.zzCi;
        localObject2 = this.mContext;
        localObject4 = zze.zzC(localObject2);
        localAdRequestParcel = this.zzqH;
        localObject2 = this.zzCg;
        localObject5 = ((zzen)localObject2).zzBz;
        ((zzey)localObject3).zza((zzd)localObject4, localAdRequestParcel, str, (String)localObject5, paramzzeq);
        continue;
        bool3 = this.zzuS;
        if (!bool3) {
          continue;
        }
        localObject2 = this.zzCg;
        localObject2 = ((zzen)localObject2).zzBJ;
        if (localObject2 == null) {
          continue;
        }
        localObject3 = this.zzCi;
        localObject2 = this.mContext;
        localObject4 = zze.zzC(localObject2);
        localAdRequestParcel = this.zzqH;
        localObject2 = this.zzCg;
        localObject5 = ((zzen)localObject2).zzBz;
        localNativeAdOptionsParcel = new com/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;
        localObject2 = this.zzCg;
        localObject2 = ((zzen)localObject2).zzBN;
        localObject2 = zzad((String)localObject2);
        localNativeAdOptionsParcel.<init>((NativeAdOptions)localObject2);
        localObject2 = this.zzCg;
        localList = ((zzen)localObject2).zzBM;
        ((zzey)localObject3).zza((zzd)localObject4, localAdRequestParcel, str, (String)localObject5, paramzzeq, localNativeAdOptionsParcel, localList);
        continue;
        localObject2 = this.zzCi;
        localObject3 = this.mContext;
        localObject3 = zze.zzC(localObject3);
        localObject4 = this.zzCh;
        localAdRequestParcel = this.zzqH;
        localObject5 = this.zzCg;
        localObject5 = ((zzen)localObject5).zzBz;
        ((zzey)localObject2).zza((zzd)localObject3, (AdSizeParcel)localObject4, localAdRequestParcel, str, (String)localObject5, paramzzeq);
        continue;
        localObject2 = this.zzCi;
        localObject3 = this.mContext;
        localObject3 = zze.zzC(localObject3);
        localObject4 = this.zzCh;
        localAdRequestParcel = this.zzqH;
        localObject5 = this.zzCg;
        localObject5 = ((zzen)localObject5).zzBz;
        ((zzey)localObject2).zza((zzd)localObject3, (AdSizeParcel)localObject4, localAdRequestParcel, str, (String)localObject5, paramzzeq);
        continue;
      }
      localObject1 = this.zzCi;
      localObject3 = this.mContext;
      localObject3 = zze.zzC(localObject3);
      localObject4 = this.zzCh;
      localAdRequestParcel = this.zzqH;
      localObject5 = paramzzeq;
      ((zzey)localObject1).zza((zzd)localObject3, (AdSizeParcel)localObject4, localAdRequestParcel, str, paramzzeq);
    }
  }
  
  private String zzac(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = zzeB();
      if (bool)
      {
        bool = zzs(2);
        if (!bool) {
          break label25;
        }
      }
    }
    for (;;)
    {
      return paramString;
      try
      {
        label25:
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str2 = "cpm_floor_cents";
        localJSONObject.remove(str2);
        paramString = localJSONObject.toString();
      }
      catch (JSONException localJSONException)
      {
        String str1 = "Could not remove field. Returning the original value";
        zzin.zzaK(str1);
      }
    }
  }
  
  private static NativeAdOptions zzad(String paramString)
  {
    NativeAdOptions.Builder localBuilder = new com/google/android/gms/ads/formats/NativeAdOptions$Builder;
    localBuilder.<init>();
    if (paramString == null) {}
    for (Object localObject = localBuilder.build();; localObject = localBuilder.build())
    {
      return (NativeAdOptions)localObject;
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        str1 = "multiple_images";
        String str2 = null;
        boolean bool = ((JSONObject)localObject).optBoolean(str1, false);
        localBuilder.setRequestMultipleImages(bool);
        str1 = "only_urls";
        str2 = null;
        bool = ((JSONObject)localObject).optBoolean(str1, false);
        localBuilder.setReturnUrlsForImageAssets(bool);
        str1 = "native_image_orientation";
        str2 = "any";
        localObject = ((JSONObject)localObject).optString(str1, str2);
        int i = zzae((String)localObject);
        localBuilder.setImageOrientation(i);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          String str1 = "Exception occurred when creating native ad options";
          zzin.zzd(str1, localJSONException);
        }
      }
    }
  }
  
  private static int zzae(String paramString)
  {
    String str = "landscape";
    boolean bool1 = str.equals(paramString);
    int i;
    if (bool1) {
      i = 2;
    }
    for (;;)
    {
      return i;
      str = "portrait";
      boolean bool2 = str.equals(paramString);
      if (bool2)
      {
        bool2 = true;
      }
      else
      {
        bool2 = false;
        str = null;
      }
    }
  }
  
  private void zzb(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = l1 - paramLong1;
    l2 = paramLong2 - l2;
    l1 -= paramLong3;
    l1 = paramLong4 - l1;
    long l3 = 0L;
    boolean bool = l2 < l3;
    int i;
    if (bool)
    {
      l3 = 0L;
      bool = l1 < l3;
      if (bool) {}
    }
    else
    {
      String str = "Timed out waiting for adapter.";
      zzin.zzaJ(str);
      i = 3;
      this.zzCj = i;
    }
    for (;;)
    {
      return;
      try
      {
        Object localObject = this.zzpV;
        l1 = Math.min(l2, l1);
        localObject.wait(l1);
      }
      catch (InterruptedException localInterruptedException)
      {
        i = -1;
        this.zzCj = i;
      }
    }
  }
  
  private zzey zzeA()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Instantiating mediation adapter: ");
    Object localObject3 = this.zzCd;
    zzin.zzaJ((String)localObject3);
    localObject1 = (Boolean)zzbt.zzwV.get();
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (bool)
    {
      localObject1 = "com.google.ads.mediation.admob.AdMobAdapter";
      localObject3 = this.zzCd;
      bool = ((String)localObject1).equals(localObject3);
      if (bool)
      {
        localObject1 = new com/google/android/gms/internal/zzfe;
        localObject3 = new com/google/ads/mediation/admob/AdMobAdapter;
        ((AdMobAdapter)localObject3).<init>();
        ((zzfe)localObject1).<init>((MediationAdapter)localObject3);
      }
    }
    for (;;)
    {
      return (zzey)localObject1;
      localObject1 = (Boolean)zzbt.zzwW.get();
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = "com.google.ads.mediation.AdUrlAdapter";
        localObject3 = this.zzCd;
        bool = ((String)localObject1).equals(localObject3);
        if (bool)
        {
          localObject1 = new com/google/android/gms/internal/zzfe;
          localObject3 = new com/google/ads/mediation/AdUrlAdapter;
          ((AdUrlAdapter)localObject3).<init>();
          ((zzfe)localObject1).<init>((MediationAdapter)localObject3);
          continue;
        }
      }
      try
      {
        localObject1 = this.zzpn;
        localObject3 = this.zzCd;
        localObject1 = ((zzex)localObject1).zzaf((String)localObject3);
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Could not instantiate mediation adapter: ");
        String str = this.zzCd;
        localObject3 = str;
        zzin.zza((String)localObject3, localRemoteException);
        bool = false;
        Object localObject2 = null;
      }
    }
  }
  
  private boolean zzeB()
  {
    zzeo localzzeo = this.zzCf;
    int i = localzzeo.zzBX;
    int k = -1;
    if (i != k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localzzeo = null;
    }
  }
  
  private int zzeC()
  {
    Object localObject = this.zzCg.zzBG;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    label86:
    label129:
    for (;;)
    {
      return i;
      JSONObject localJSONObject;
      String str1;
      try
      {
        localJSONObject = new org/json/JSONObject;
        localObject = this.zzCg;
        localObject = ((zzen)localObject).zzBG;
        localJSONObject.<init>((String)localObject);
        localObject = "com.google.ads.mediation.admob.AdMobAdapter";
        String str2 = this.zzCd;
        boolean bool1 = ((String)localObject).equals(str2);
        if (!bool1) {
          break label86;
        }
        localObject = "cpm_cents";
        j = localJSONObject.optInt((String)localObject, 0);
      }
      catch (JSONException localJSONException)
      {
        zzin.zzaK("Could not convert to json. Returning 0");
        int j = 0;
        str1 = null;
      }
      continue;
      boolean bool2 = zzs(2);
      int k;
      if (bool2)
      {
        str1 = "cpm_floor_cents";
        k = localJSONObject.optInt(str1, 0);
      }
      for (;;)
      {
        if (k != 0) {
          break label129;
        }
        str1 = "penalized_average_cpm_cents";
        k = localJSONObject.optInt(str1, 0);
        break;
        k = 0;
        str1 = null;
      }
    }
  }
  
  private String zzey()
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzCg;
        localObject1 = ((zzen)localObject1).zzBD;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool) {
          continue;
        }
        localObject1 = this.zzpn;
        Object localObject2 = this.zzCg;
        localObject2 = ((zzen)localObject2).zzBD;
        bool = ((zzex)localObject1).zzag((String)localObject2);
        if (!bool) {
          continue;
        }
        localObject1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        String str = "Fail to determine the custom event's version, assuming the old one.";
        zzin.zzaK(str);
        str = "com.google.ads.mediation.customevent.CustomEventAdapter";
        continue;
      }
      return (String)localObject1;
      localObject1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
    }
  }
  
  private zzfa zzez()
  {
    int i = this.zzCj;
    boolean bool1;
    zzfa localzzfa;
    if (i == 0)
    {
      bool1 = zzeB();
      if (bool1) {}
    }
    else
    {
      bool1 = false;
      localzzfa = null;
    }
    for (;;)
    {
      return localzzfa;
      int j = 4;
      try
      {
        boolean bool2 = zzs(j);
        if (bool2)
        {
          localzzfa = this.zzCk;
          if (localzzfa != null)
          {
            localzzfa = this.zzCk;
            k = localzzfa.zzeD();
            if (k != 0) {
              localzzfa = this.zzCk;
            }
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = "Could not get cpm value from MediationResponseMetadata";
        zzin.zzaK((String)localObject);
        int k = zzeC();
        localObject = zzt(k);
      }
    }
  }
  
  private boolean zzs(int paramInt)
  {
    boolean bool1 = false;
    for (;;)
    {
      try
      {
        boolean bool2 = this.zzsA;
        if (!bool2) {
          continue;
        }
        localObject = this.zzCi;
        localObject = ((zzey)localObject).zzeI();
        if (localObject == null) {
          continue;
        }
        String str2 = "capabilities";
        i = ((Bundle)localObject).getInt(str2, 0) & paramInt;
        if (i != paramInt) {
          continue;
        }
        i = 1;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject;
        int i;
        String str1 = "Could not get adapter info. Returning false";
        zzin.zzaK(str1);
        continue;
        boolean bool3 = false;
        str1 = null;
        continue;
      }
      bool1 = i;
      return bool1;
      localObject = this.zzCh;
      bool3 = ((AdSizeParcel)localObject).zzui;
      if (bool3)
      {
        localObject = this.zzCi;
        localObject = ((zzey)localObject).getInterstitialAdapterInfo();
      }
      else
      {
        localObject = this.zzCi;
        localObject = ((zzey)localObject).zzeH();
      }
    }
  }
  
  private static zzfa zzt(int paramInt)
  {
    zzer.2 local2 = new com/google/android/gms/internal/zzer$2;
    local2.<init>(paramInt);
    return local2;
  }
  
  public void cancel()
  {
    synchronized (this.zzpV)
    {
      try
      {
        localObject2 = this.zzCi;
        if (localObject2 != null)
        {
          localObject2 = this.zzCi;
          ((zzey)localObject2).destroy();
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject2;
          int i;
          String str = "Could not destroy mediation adapter.";
          zzin.zzd(str, localRemoteException);
        }
      }
      i = -1;
      this.zzCj = i;
      localObject2 = this.zzpV;
      localObject2.notify();
      return;
    }
  }
  
  public zzes zza(long paramLong1, long paramLong2)
  {
    synchronized (this.zzpV)
    {
      long l1 = SystemClock.elapsedRealtime();
      zzeq localzzeq = new com/google/android/gms/internal/zzeq;
      localzzeq.<init>();
      Object localObject2 = zzir.zzMc;
      Object localObject4 = new com/google/android/gms/internal/zzer$1;
      ((zzer.1)localObject4).<init>(this, localzzeq);
      ((Handler)localObject2).post((Runnable)localObject4);
      long l2 = this.zzCe;
      localObject4 = this;
      zza(l1, l2, paramLong1, paramLong2);
      localObject2 = new com/google/android/gms/internal/zzes;
      localObject4 = this.zzCg;
      zzey localzzey = this.zzCi;
      String str = this.zzCd;
      int i = this.zzCj;
      zzfa localzzfa = zzez();
      ((zzes)localObject2).<init>((zzen)localObject4, localzzey, str, localzzeq, i, localzzfa);
      return (zzes)localObject2;
    }
  }
  
  public void zza(int paramInt, zzfa paramzzfa)
  {
    synchronized (this.zzpV)
    {
      this.zzCj = paramInt;
      this.zzCk = paramzzfa;
      Object localObject2 = this.zzpV;
      localObject2.notify();
      return;
    }
  }
  
  public void zzr(int paramInt)
  {
    synchronized (this.zzpV)
    {
      this.zzCj = paramInt;
      Object localObject2 = this.zzpV;
      localObject2.notify();
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */