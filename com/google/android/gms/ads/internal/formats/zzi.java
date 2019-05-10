package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class zzi
  implements zzh
{
  private final Context mContext;
  private zzjp zzpD;
  private final VersionInfoParcel zzpT;
  private final Object zzpV;
  private final zzp zzyn;
  private final JSONObject zzyq;
  private final zzed zzyr;
  private final zzh.zza zzys;
  private final zzan zzyt;
  private boolean zzyu;
  private String zzyv;
  private WeakReference zzyw;
  
  public zzi(Context paramContext, zzp paramzzp, zzed paramzzed, zzan paramzzan, JSONObject paramJSONObject, zzh.zza paramzza, VersionInfoParcel paramVersionInfoParcel)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzyw = null;
    this.mContext = paramContext;
    this.zzyn = paramzzp;
    this.zzyr = paramzzed;
    this.zzyt = paramzzan;
    this.zzyq = paramJSONObject;
    this.zzys = paramzza;
    this.zzpT = paramVersionInfoParcel;
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public void recordImpression()
  {
    Object localObject1 = "recordImpression must be called on the main UI thread.";
    zzx.zzcD((String)localObject1);
    boolean bool = true;
    zzn(bool);
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      localObject2 = "ad";
      Object localObject3 = this.zzyq;
      ((JSONObject)localObject1).put((String)localObject2, localObject3);
      localObject2 = this.zzyr;
      localObject3 = "google.afma.nativeAds.handleImpressionPing";
      ((zzed)localObject2).zza((String)localObject3, (JSONObject)localObject1);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = "Unable to create impression JSON.";
        zzin.zzb((String)localObject2, localJSONException);
      }
    }
    this.zzyn.zza(this);
  }
  
  public zzb zza(View.OnClickListener paramOnClickListener)
  {
    int i = -1;
    Object localObject1 = this.zzys;
    Object localObject2 = ((zzh.zza)localObject1).zzdN();
    if (localObject2 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (zzb)localObject1;
      localObject1 = new com/google/android/gms/ads/internal/formats/zzb;
      Object localObject3 = this.mContext;
      ((zzb)localObject1).<init>((Context)localObject3, (zza)localObject2);
      localObject2 = new android/widget/FrameLayout$LayoutParams;
      ((FrameLayout.LayoutParams)localObject2).<init>(i, i);
      ((zzb)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((zzb)localObject1).zzdI().setOnClickListener(paramOnClickListener);
      localObject2 = ((zzb)localObject1).zzdI();
      localObject3 = "Ad attribution icon";
      ((ViewGroup)localObject2).setContentDescription((CharSequence)localObject3);
    }
  }
  
  public void zza(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    zzx.zzcD("performClick must be called on the main UI thread.");
    Object localObject = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    boolean bool2;
    do
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      View localView = (View)((WeakReference)((Map.Entry)localObject).getValue()).get();
      bool2 = paramView.equals(localView);
    } while (!bool2);
    localObject = (String)((Map.Entry)localObject).getKey();
    zza((String)localObject, paramJSONObject1, paramJSONObject2, paramJSONObject3);
  }
  
  public void zza(String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    Object localObject1 = "performClick must be called on the main UI thread.";
    zzx.zzcD((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>();
        localObject2 = "asset";
        ((JSONObject)localObject1).put((String)localObject2, paramString);
        localObject2 = "template";
        Object localObject3 = this.zzys;
        localObject3 = ((zzh.zza)localObject3).zzdM();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        localObject3 = "ad";
        Object localObject4 = this.zzyq;
        ((JSONObject)localObject2).put((String)localObject3, localObject4);
        localObject3 = "click";
        ((JSONObject)localObject2).put((String)localObject3, localObject1);
        localObject3 = "has_custom_click_handler";
        localObject1 = this.zzyn;
        localObject4 = this.zzys;
        localObject4 = ((zzh.zza)localObject4).getCustomTemplateId();
        localObject1 = ((zzp)localObject1).zzs((String)localObject4);
        if (localObject1 != null)
        {
          bool = true;
          ((JSONObject)localObject2).put((String)localObject3, bool);
          if (paramJSONObject1 != null)
          {
            localObject1 = "view_rectangles";
            ((JSONObject)localObject2).put((String)localObject1, paramJSONObject1);
          }
          if (paramJSONObject2 != null)
          {
            localObject1 = "click_point";
            ((JSONObject)localObject2).put((String)localObject1, paramJSONObject2);
          }
          if (paramJSONObject3 != null)
          {
            localObject1 = "native_view_rectangle";
            ((JSONObject)localObject2).put((String)localObject1, paramJSONObject3);
          }
          localObject1 = this.zzyr;
          localObject3 = "google.afma.nativeAds.handleClickGmsg";
          ((zzed)localObject1).zza((String)localObject3, (JSONObject)localObject2);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        boolean bool;
        Object localObject2 = "Unable to create click JSON.";
        zzin.zzb((String)localObject2, localJSONException);
        continue;
      }
      bool = false;
      localObject1 = null;
    }
  }
  
  public void zzb(MotionEvent paramMotionEvent)
  {
    this.zzyt.zza(paramMotionEvent);
  }
  
  public zzjp zzdR()
  {
    Object localObject1 = zzdT();
    this.zzpD = ((zzjp)localObject1);
    this.zzpD.getView().setVisibility(8);
    localObject1 = this.zzyr;
    Object localObject2 = new com/google/android/gms/ads/internal/formats/zzi$1;
    ((zzi.1)localObject2).<init>(this);
    ((zzed)localObject1).zza("/loadHtml", (zzdf)localObject2);
    localObject1 = this.zzyr;
    localObject2 = new com/google/android/gms/ads/internal/formats/zzi$2;
    ((zzi.2)localObject2).<init>(this);
    ((zzed)localObject1).zza("/showOverlay", (zzdf)localObject2);
    localObject1 = this.zzyr;
    localObject2 = new com/google/android/gms/ads/internal/formats/zzi$3;
    ((zzi.3)localObject2).<init>(this);
    ((zzed)localObject1).zza("/hideOverlay", (zzdf)localObject2);
    localObject1 = this.zzpD.zzhU();
    localObject2 = new com/google/android/gms/ads/internal/formats/zzi$4;
    ((zzi.4)localObject2).<init>(this);
    ((zzjq)localObject1).zza("/hideOverlay", (zzdf)localObject2);
    localObject1 = this.zzpD.zzhU();
    localObject2 = new com/google/android/gms/ads/internal/formats/zzi$5;
    ((zzi.5)localObject2).<init>(this);
    ((zzjq)localObject1).zza("/sendMessageToSdk", (zzdf)localObject2);
    return this.zzpD;
  }
  
  public View zzdS()
  {
    Object localObject = this.zzyw;
    if (localObject != null) {}
    for (localObject = (View)this.zzyw.get();; localObject = null) {
      return (View)localObject;
    }
  }
  
  zzjp zzdT()
  {
    zzjr localzzjr = zzr.zzbD();
    Context localContext = this.mContext;
    AdSizeParcel localAdSizeParcel = AdSizeParcel.zzt(this.mContext);
    zzan localzzan = this.zzyt;
    VersionInfoParcel localVersionInfoParcel = this.zzpT;
    return localzzjr.zza(localContext, localAdSizeParcel, false, false, localzzan, localVersionInfoParcel);
  }
  
  public void zzg(View paramView) {}
  
  public void zzh(View paramView)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        bool = this.zzyu;
        if (bool) {
          return;
        }
        bool = paramView.isShown();
        if (bool) {}
      }
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      boolean bool = paramView.getGlobalVisibleRect(localRect, null);
      if (!bool) {}
      recordImpression();
    }
  }
  
  public void zzi(View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.zzyw = localWeakReference;
  }
  
  protected void zzn(boolean paramBoolean)
  {
    this.zzyu = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */