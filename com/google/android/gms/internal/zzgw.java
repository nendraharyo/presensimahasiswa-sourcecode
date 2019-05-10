package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzgw
  implements Callable
{
  private static final long zzGF = TimeUnit.SECONDS.toMillis(60);
  private final Context mContext;
  private final zziw zzGG;
  private final com.google.android.gms.ads.internal.zzp zzGH;
  private final zzee zzGI;
  private boolean zzGJ;
  private List zzGK;
  private JSONObject zzGL;
  private final zzif.zza zzGd;
  private int zzGu;
  private final Object zzpV;
  private final zzan zzyt;
  
  public zzgw(Context paramContext, com.google.android.gms.ads.internal.zzp paramzzp, zzee paramzzee, zziw paramzziw, zzan paramzzan, zzif.zza paramzza)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.mContext = paramContext;
    this.zzGH = paramzzp;
    this.zzGG = paramzziw;
    this.zzGI = paramzzee;
    this.zzGd = paramzza;
    this.zzyt = paramzzan;
    this.zzGJ = false;
    this.zzGu = -2;
    this.zzGK = null;
  }
  
  private zzh.zza zza(zzed paramzzed, zzgw.zza paramzza, JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    boolean bool = zzgn();
    if (bool) {}
    for (;;)
    {
      return (zzh.zza)localObject1;
      Object localObject2 = paramJSONObject.getJSONObject("tracking_urls_and_actions");
      Object localObject3 = zzc((JSONObject)localObject2, "impression_tracking_urls");
      if (localObject3 == null) {
        bool = false;
      }
      zzh.zza localzza;
      for (localObject3 = null;; localObject3 = Arrays.asList((Object[])localObject3))
      {
        this.zzGK = ((List)localObject3);
        localObject3 = ((JSONObject)localObject2).optJSONObject("active_view");
        this.zzGL = ((JSONObject)localObject3);
        localzza = paramzza.zza(this, paramJSONObject);
        if (localzza != null) {
          break label104;
        }
        localObject3 = "Failed to retrieve ad assets.";
        zzin.e((String)localObject3);
        break;
      }
      label104:
      localObject3 = new com/google/android/gms/ads/internal/formats/zzi;
      localObject1 = this.mContext;
      localObject2 = this.zzGH;
      zzan localzzan = this.zzyt;
      VersionInfoParcel localVersionInfoParcel = this.zzGd.zzLd.zzrl;
      ((zzi)localObject3).<init>((Context)localObject1, (com.google.android.gms.ads.internal.zzp)localObject2, paramzzed, localzzan, paramJSONObject, localzza, localVersionInfoParcel);
      localzza.zzb((zzh)localObject3);
      localObject1 = localzza;
    }
  }
  
  private zzif zza(zzh.zza paramzza)
  {
    Object localObject1 = this;
    for (;;)
    {
      synchronized (this.zzpV)
      {
        int i = this.zzGu;
        if (paramzza == null)
        {
          j = this.zzGu;
          int k = -2;
          if (j == k) {
            i = 0;
          }
        }
        int j = -2;
        if (i != j)
        {
          localzza = null;
          zzif localzzif = new com/google/android/gms/internal/zzif;
          localObject1 = this;
          ??? = this.zzGd.zzLd.zzHt;
          List localList1 = this.zzGd.zzLe.zzBQ;
          List localList2 = this.zzGd.zzLe.zzBR;
          List localList3 = this.zzGK;
          int m = this.zzGd.zzLe.orientation;
          long l1 = this.zzGd.zzLe.zzBU;
          String str = this.zzGd.zzLd.zzHw;
          localObject1 = this.zzGd;
          Object localObject4 = localObject1;
          localObject4 = ((zzif.zza)localObject1).zzrp;
          localObject1 = this;
          long l2 = this.zzGd.zzLe.zzHS;
          localObject1 = this;
          long l3 = this.zzGd.zzKY;
          localObject1 = this;
          long l4 = this.zzGd.zzKZ;
          localObject1 = this;
          localObject1 = this.zzGd;
          Object localObject5 = localObject1;
          localObject1 = ((zzif.zza)localObject1).zzLe;
          localObject5 = localObject1;
          localObject5 = ((AdResponseParcel)localObject1).zzHY;
          localObject1 = this;
          JSONObject localJSONObject = this.zzGL;
          localObject1 = this;
          boolean bool = this.zzGd.zzLe.zzIm;
          localzzif.<init>((AdRequestParcel)???, null, localList1, i, localList2, localList3, m, l1, str, false, null, null, null, null, null, 0L, (AdSizeParcel)localObject4, l2, l3, l4, (String)localObject5, localJSONObject, localzza, null, null, null, bool);
          return localzzif;
        }
      }
      zzh.zza localzza = paramzza;
    }
  }
  
  private zzjg zza(JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1;
    String str;
    double d2;
    if (paramBoolean1)
    {
      localObject1 = "url";
      str = paramJSONObject.getString((String)localObject1);
      localObject1 = "scale";
      double d1 = 1.0D;
      d2 = paramJSONObject.optDouble((String)localObject1, d1);
      boolean bool = TextUtils.isEmpty(str);
      if (!bool) {
        break label85;
      }
      bool = false;
      zza(0, paramBoolean1);
      localObject1 = new com/google/android/gms/internal/zzje;
      ((zzje)localObject1).<init>(null);
    }
    for (;;)
    {
      return (zzjg)localObject1;
      localObject1 = "url";
      str = paramJSONObject.optString((String)localObject1);
      break;
      label85:
      Object localObject2;
      Object localObject3;
      if (paramBoolean2)
      {
        localObject1 = new com/google/android/gms/internal/zzje;
        localObject2 = new com/google/android/gms/ads/internal/formats/zzc;
        localObject3 = Uri.parse(str);
        ((zzc)localObject2).<init>(null, (Uri)localObject3, d2);
        ((zzje)localObject1).<init>(localObject2);
      }
      else
      {
        localObject1 = this.zzGG;
        localObject2 = new com/google/android/gms/internal/zzgw$5;
        localObject3 = this;
        ((zzgw.5)localObject2).<init>(this, paramBoolean1, d2, str);
        localObject1 = ((zziw)localObject1).zza(str, (zziw.zza)localObject2);
      }
    }
  }
  
  private void zza(zzh.zza paramzza, zzed paramzzed)
  {
    boolean bool = paramzza instanceof zzf;
    if (!bool) {}
    for (;;)
    {
      return;
      paramzza = (zzf)paramzza;
      Object localObject = new com/google/android/gms/internal/zzgw$zzb;
      ((zzgw.zzb)localObject).<init>(this);
      zzgw.3 local3 = new com/google/android/gms/internal/zzgw$3;
      local3.<init>(this, paramzza);
      ((zzgw.zzb)localObject).zzHb = local3;
      localObject = "/nativeAdCustomClick";
      paramzzed.zza((String)localObject, local3);
    }
  }
  
  private Integer zzb(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      localObject1 = paramJSONObject.getJSONObject(paramString);
      String str1 = "r";
      int i = ((JSONObject)localObject1).getInt(str1);
      String str2 = "g";
      int j = ((JSONObject)localObject1).getInt(str2);
      String str3 = "b";
      k = ((JSONObject)localObject1).getInt(str3);
      k = Color.rgb(i, j, k);
      localObject1 = Integer.valueOf(k);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject1;
        int k = 0;
        Object localObject2 = null;
      }
    }
    return (Integer)localObject1;
  }
  
  private JSONObject zzb(zzed paramzzed)
  {
    boolean bool = zzgn();
    if (bool) {
      bool = false;
    }
    Object localObject2;
    long l;
    for (Object localObject1 = null;; localObject1 = (JSONObject)((zzjd)localObject1).get(l, (TimeUnit)localObject2))
    {
      return (JSONObject)localObject1;
      localObject1 = new com/google/android/gms/internal/zzjd;
      ((zzjd)localObject1).<init>();
      localObject2 = new com/google/android/gms/internal/zzgw$zzb;
      ((zzgw.zzb)localObject2).<init>(this);
      Object localObject3 = new com/google/android/gms/internal/zzgw$1;
      ((zzgw.1)localObject3).<init>(this, paramzzed, (zzgw.zzb)localObject2, (zzjd)localObject1);
      ((zzgw.zzb)localObject2).zzHb = ((zzdf)localObject3);
      paramzzed.zza("/nativeAdPreProcess", (zzdf)localObject3);
      localObject2 = new org/json/JSONObject;
      localObject3 = this.zzGd.zzLe.body;
      ((JSONObject)localObject2).<init>((String)localObject3);
      localObject3 = "google.afma.nativeAds.preProcessJsonGmsg";
      paramzzed.zza((String)localObject3, (JSONObject)localObject2);
      l = zzGF;
      localObject2 = TimeUnit.MILLISECONDS;
    }
  }
  
  private void zzb(zzcp paramzzcp, String paramString)
  {
    try
    {
      Object localObject1 = this.zzGH;
      localObject2 = paramzzcp.getCustomTemplateId();
      localObject1 = ((com.google.android.gms.ads.internal.zzp)localObject1).zzs((String)localObject2);
      if (localObject1 != null) {
        ((zzct)localObject1).zza(paramzzcp, paramString);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Failed to call onCustomClick for asset ").append(paramString);
        String str = ".";
        localObject2 = str;
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  private String[] zzc(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    int i;
    if (localJSONArray == null) {
      i = 0;
    }
    String[] arrayOfString;
    for (Object localObject = null;; localObject = arrayOfString)
    {
      return (String[])localObject;
      arrayOfString = new String[localJSONArray.length()];
      i = 0;
      localObject = null;
      for (;;)
      {
        int j = localJSONArray.length();
        if (i >= j) {
          break;
        }
        String str = localJSONArray.getString(i);
        arrayOfString[i] = str;
        i += 1;
      }
    }
  }
  
  private static List zzf(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Drawable localDrawable = (Drawable)zze.zzp(((zzc)localIterator.next()).zzdJ());
      localArrayList.add(localDrawable);
    }
    return localArrayList;
  }
  
  private zzed zzgm()
  {
    Object localObject1 = null;
    boolean bool = zzgn();
    if (bool) {
      return (zzed)localObject1;
    }
    Object localObject2 = (String)zzbt.zzwC.get();
    Object localObject3 = this.zzGd.zzLe.zzEF;
    Object localObject4 = "https";
    int i = ((String)localObject3).indexOf((String)localObject4);
    if (i == 0) {}
    for (localObject3 = "https:";; localObject3 = "http:")
    {
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject2 = (String)localObject3 + (String)localObject2;
      localObject3 = this.zzGI;
      localObject4 = this.mContext;
      Object localObject5 = this.zzGd.zzLd.zzrl;
      Object localObject6 = this.zzyt;
      localObject2 = ((zzee)localObject3).zza((Context)localObject4, (VersionInfoParcel)localObject5, (String)localObject2, (zzan)localObject6);
      long l = zzGF;
      localObject3 = TimeUnit.MILLISECONDS;
      localObject2 = (zzed)((Future)localObject2).get(l, (TimeUnit)localObject3);
      localObject3 = this.zzGH;
      localObject4 = this.zzGH;
      localObject5 = this.zzGH;
      localObject6 = this.zzGH;
      ((zzed)localObject2).zza((zza)localObject3, (zzg)localObject4, (zzdb)localObject5, (com.google.android.gms.ads.internal.overlay.zzp)localObject6, false, null, null, null, null);
      localObject1 = localObject2;
      break;
    }
  }
  
  public void zzF(int paramInt)
  {
    Object localObject1 = this.zzpV;
    boolean bool = true;
    try
    {
      this.zzGJ = bool;
      this.zzGu = paramInt;
      return;
    }
    finally {}
  }
  
  public zzjg zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    for (JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);; localJSONObject = paramJSONObject.optJSONObject(paramString))
    {
      if (localJSONObject == null)
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
      }
      return zza(localJSONObject, paramBoolean1, paramBoolean2);
    }
  }
  
  public List zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 0;
    Object localObject1 = null;
    ArrayList localArrayList;
    int j;
    if (paramBoolean1)
    {
      localObject2 = paramJSONObject.getJSONArray(paramString);
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (localObject2 != null)
      {
        j = ((JSONArray)localObject2).length();
        if (j != 0) {
          break label67;
        }
      }
      zza(0, paramBoolean1);
    }
    for (Object localObject2 = localArrayList;; localObject2 = localArrayList)
    {
      return (List)localObject2;
      localObject2 = paramJSONObject.optJSONArray(paramString);
      break;
      label67:
      if (paramBoolean3) {}
      for (j = ((JSONArray)localObject2).length();; j = 1) {
        for (int k = 0; k < j; k = i)
        {
          localObject1 = ((JSONArray)localObject2).getJSONObject(k);
          if (localObject1 == null)
          {
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>();
          }
          localObject1 = zza((JSONObject)localObject1, paramBoolean1, paramBoolean2);
          localArrayList.add(localObject1);
          i = k + 1;
        }
      }
    }
  }
  
  public Future zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
    String str = "require";
    boolean bool1 = true;
    boolean bool2 = localJSONObject.optBoolean(str, bool1);
    if (localJSONObject == null)
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
    }
    return zza(localJSONObject, bool2, paramBoolean);
  }
  
  public void zza(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      zzF(paramInt);
    }
  }
  
  protected zzgw.zza zze(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    boolean bool1 = zzgn();
    if (bool1)
    {
      bool1 = false;
      localObject2 = null;
    }
    for (;;)
    {
      return (zzgw.zza)localObject2;
      Object localObject3 = paramJSONObject.getString("template_id");
      localObject2 = this.zzGd.zzLd.zzrD;
      label63:
      Object localObject4;
      boolean bool2;
      if (localObject2 != null)
      {
        localObject2 = this.zzGd.zzLd.zzrD;
        bool1 = ((NativeAdOptionsParcel)localObject2).zzyA;
        localObject4 = this.zzGd.zzLd.zzrD;
        if (localObject4 == null) {
          break label143;
        }
        localObject4 = this.zzGd.zzLd.zzrD;
        bool2 = ((NativeAdOptionsParcel)localObject4).zzyC;
      }
      for (;;)
      {
        localObject5 = "2";
        bool3 = ((String)localObject5).equals(localObject3);
        if (!bool3) {
          break label152;
        }
        localObject1 = new com/google/android/gms/internal/zzgx;
        ((zzgx)localObject1).<init>(bool1, bool2);
        localObject2 = localObject1;
        break;
        bool1 = false;
        localObject2 = null;
        break label63;
        label143:
        bool2 = false;
        localObject4 = null;
      }
      label152:
      Object localObject5 = "1";
      boolean bool3 = ((String)localObject5).equals(localObject3);
      if (bool3)
      {
        localObject1 = new com/google/android/gms/internal/zzgy;
        ((zzgy)localObject1).<init>(bool1, bool2);
        localObject2 = localObject1;
      }
      else
      {
        localObject4 = "3";
        bool2 = ((String)localObject4).equals(localObject3);
        if (!bool2) {
          break label341;
        }
        localObject1 = paramJSONObject.getString("custom_template_id");
        localObject4 = new com/google/android/gms/internal/zzjd;
        ((zzjd)localObject4).<init>();
        localObject3 = zzir.zzMc;
        localObject5 = new com/google/android/gms/internal/zzgw$2;
        ((zzgw.2)localObject5).<init>(this, (zzjd)localObject4, (String)localObject1);
        ((Handler)localObject3).post((Runnable)localObject5);
        long l = zzGF;
        localObject1 = TimeUnit.MILLISECONDS;
        localObject1 = ((zzjd)localObject4).get(l, (TimeUnit)localObject1);
        if (localObject1 == null) {
          break;
        }
        localObject1 = new com/google/android/gms/internal/zzgz;
        ((zzgz)localObject1).<init>(bool1);
        localObject2 = localObject1;
      }
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("No handler for custom template: ");
    localObject1 = paramJSONObject.getString("custom_template_id");
    localObject2 = (String)localObject1;
    zzin.e((String)localObject2);
    for (;;)
    {
      bool1 = false;
      localObject2 = null;
      break;
      label341:
      zzF(0);
    }
  }
  
  public zzjg zzf(JSONObject paramJSONObject)
  {
    Object localObject1 = "attribution";
    Object localObject2 = paramJSONObject.optJSONObject((String)localObject1);
    if (localObject2 == null)
    {
      localObject1 = new com/google/android/gms/internal/zzje;
      localObject2 = null;
      ((zzje)localObject1).<init>(null);
      return (zzjg)localObject1;
    }
    String str = ((JSONObject)localObject2).optString("text");
    int i = ((JSONObject)localObject2).optInt("text_size", -1);
    Integer localInteger1 = zzb((JSONObject)localObject2, "text_color");
    Integer localInteger2 = zzb((JSONObject)localObject2, "bg_color");
    int j = ((JSONObject)localObject2).optInt("animation_ms", 1000);
    int k = 4000;
    int m = ((JSONObject)localObject2).optInt("presentation_ms", k);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject3 = ((JSONObject)localObject2).optJSONArray("images");
    boolean bool;
    if (localObject3 != null)
    {
      localObject3 = "images";
      bool = true;
      localObject1 = this;
      localObject1 = zza((JSONObject)localObject2, (String)localObject3, false, false, bool);
    }
    for (;;)
    {
      zzjg localzzjg = zzjf.zzl((List)localObject1);
      localObject1 = new com/google/android/gms/internal/zzgw$4;
      localObject2 = this;
      localObject3 = str;
      bool = i;
      ((zzgw.4)localObject1).<init>(this, str, localInteger2, localInteger1, i, m, j);
      localObject1 = zzjf.zza(localzzjg, (zzjf.zza)localObject1);
      break;
      localObject3 = "image";
      localObject2 = zza((JSONObject)localObject2, (String)localObject3, false, false);
      ((List)localObject1).add(localObject2);
    }
  }
  
  public zzif zzgl()
  {
    try
    {
      localObject1 = zzgm();
      localObject2 = zzb((zzed)localObject1);
      zzgw.zza localzza = zze((JSONObject)localObject2);
      localObject2 = zza((zzed)localObject1, localzza, (JSONObject)localObject2);
      zza((zzh.zza)localObject2, (zzed)localObject1);
      localObject1 = zza((zzh.zza)localObject2);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject1;
        localObject2 = "Malformed native JSON response.";
        zzin.zzd((String)localObject2, localJSONException);
        boolean bool = this.zzGJ;
        if (!bool)
        {
          bool = false;
          localzzif = null;
          zzF(0);
        }
        bool = false;
        zzif localzzif = zza(null);
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        Object localObject2 = "Timeout when loading native ad.";
        zzin.zzd((String)localObject2, localTimeoutException);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
    return (zzif)localObject1;
  }
  
  public boolean zzgn()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzGJ;
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */