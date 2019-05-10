package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class zzk
  extends zzcj.zza
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private FrameLayout zzoQ;
  private final Object zzpV;
  private final FrameLayout zzyD;
  private Map zzyE;
  private zzb zzyF;
  boolean zzyG;
  int zzyH;
  int zzyI;
  private zzh zzyf;
  
  public zzk(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzyE = ((Map)localObject);
    this.zzyG = false;
    this.zzyD = paramFrameLayout1;
    this.zzoQ = paramFrameLayout2;
    zzjk.zza(this.zzyD, this);
    zzjk.zza(this.zzyD, this);
    this.zzyD.setOnTouchListener(this);
  }
  
  public void destroy()
  {
    this.zzoQ.removeAllViews();
    this.zzoQ = null;
    this.zzyE = null;
    this.zzyF = null;
    this.zzyf = null;
  }
  
  int getMeasuredHeight()
  {
    return this.zzyD.getMeasuredHeight();
  }
  
  int getMeasuredWidth()
  {
    return this.zzyD.getMeasuredWidth();
  }
  
  public void onClick(View paramView)
  {
    for (;;)
    {
      int j;
      synchronized (this.zzpV)
      {
        Object localObject2 = this.zzyf;
        if (localObject2 == null) {
          return;
        }
        localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localObject2 = this.zzyE;
        localObject2 = ((Map)localObject2).entrySet();
        localObject6 = ((Set)localObject2).iterator();
        bool = ((Iterator)localObject6).hasNext();
        if (bool)
        {
          localObject2 = ((Iterator)localObject6).next();
          localObject2 = (Map.Entry)localObject2;
          Object localObject7 = ((Map.Entry)localObject2).getValue();
          localObject7 = (WeakReference)localObject7;
          localObject7 = ((WeakReference)localObject7).get();
          localObject7 = (View)localObject7;
          localObject9 = zzj((View)localObject7);
          localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>();
          String str2 = "width";
          try
          {
            int i = ((View)localObject7).getWidth();
            i = zzq(i);
            localJSONObject2.put(str2, i);
            str2 = "height";
            j = ((View)localObject7).getHeight();
            j = zzq(j);
            localJSONObject2.put(str2, j);
            localObject7 = "x";
            int k = ((Point)localObject9).x;
            k = zzq(k);
            localJSONObject2.put((String)localObject7, k);
            localObject7 = "y";
            int m = ((Point)localObject9).y;
            m = zzq(m);
            localJSONObject2.put((String)localObject7, m);
            localObject7 = ((Map.Entry)localObject2).getKey();
            localObject7 = (String)localObject7;
            localJSONObject1.put((String)localObject7, localJSONObject2);
          }
          catch (JSONException localJSONException3)
          {
            localObject8 = new java/lang/StringBuilder;
            ((StringBuilder)localObject8).<init>();
            localObject9 = "Unable to get view rectangle for view ";
            localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
            localObject2 = ((Map.Entry)localObject2).getKey();
            localObject2 = (String)localObject2;
            localObject2 = ((StringBuilder)localObject8).append((String)localObject2);
            localObject2 = ((StringBuilder)localObject2).toString();
            zzin.zzaK((String)localObject2);
          }
        }
      }
      localObject9 = new org/json/JSONObject;
      ((JSONObject)localObject9).<init>();
      Object localObject4 = "x";
      try
      {
        j = this.zzyH;
        j = zzq(j);
        ((JSONObject)localObject9).put((String)localObject4, j);
        localObject4 = "y";
        j = this.zzyI;
        j = zzq(j);
        ((JSONObject)localObject9).put((String)localObject4, j);
      }
      catch (JSONException localJSONException1)
      {
        for (;;)
        {
          str1 = "Unable to get click location";
          zzin.zzaK(str1);
        }
      }
      localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>();
      localObject4 = "width";
      try
      {
        j = getMeasuredWidth();
        j = zzq(j);
        localJSONObject2.put((String)localObject4, j);
        localObject4 = "height";
        j = getMeasuredHeight();
        j = zzq(j);
        localJSONObject2.put((String)localObject4, j);
      }
      catch (JSONException localJSONException2)
      {
        for (;;)
        {
          String str1;
          Object localObject5 = "Unable to get native ad view bounding box";
          zzin.zzaK((String)localObject5);
          continue;
          localObject5 = this.zzyf;
          localObject6 = this.zzyE;
          localObject8 = paramView;
          ((zzh)localObject5).zza(paramView, (Map)localObject6, localJSONObject1, (JSONObject)localObject9, localJSONObject2);
        }
      }
      localObject4 = this.zzyF;
      if (localObject4 == null) {
        break label533;
      }
      localObject4 = this.zzyF;
      localObject4 = ((zzb)localObject4).zzdI();
      boolean bool = localObject4.equals(paramView);
      if (!bool) {
        break label533;
      }
      localObject4 = this.zzyf;
      localObject8 = "1007";
      ((zzh)localObject4).zza((String)localObject8, localJSONObject1, (JSONObject)localObject9, localJSONObject2);
    }
  }
  
  public void onGlobalLayout()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzyG;
      if (bool)
      {
        int i = getMeasuredWidth();
        int j = getMeasuredHeight();
        if ((i != 0) && (j != 0))
        {
          FrameLayout localFrameLayout1 = this.zzoQ;
          FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
          localLayoutParams.<init>(i, j);
          localFrameLayout1.setLayoutParams(localLayoutParams);
          i = 0;
          localzzh = null;
          this.zzyG = false;
        }
      }
      zzh localzzh = this.zzyf;
      if (localzzh != null)
      {
        localzzh = this.zzyf;
        FrameLayout localFrameLayout2 = this.zzyD;
        localzzh.zzh(localFrameLayout2);
      }
      return;
    }
  }
  
  public void onScrollChanged()
  {
    synchronized (this.zzpV)
    {
      zzh localzzh = this.zzyf;
      if (localzzh != null)
      {
        localzzh = this.zzyf;
        FrameLayout localFrameLayout = this.zzyD;
        localzzh.zzh(localFrameLayout);
      }
      return;
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzyf;
      if (localObject2 == null) {
        return false;
      }
      localObject2 = zzc(paramMotionEvent);
      int i = ((Point)localObject2).x;
      this.zzyH = i;
      i = ((Point)localObject2).y;
      this.zzyI = i;
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      int j = ((Point)localObject2).x;
      float f1 = j;
      int k = ((Point)localObject2).y;
      float f2 = k;
      localMotionEvent.setLocation(f1, f2);
      localObject2 = this.zzyf;
      ((zzh)localObject2).zzb(localMotionEvent);
      localMotionEvent.recycle();
    }
  }
  
  public zzd zzK(String paramString)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzyE;
      localObject2 = ((Map)localObject2).get(paramString);
      localObject2 = (WeakReference)localObject2;
      if (localObject2 == null)
      {
        localObject2 = null;
        localObject2 = zze.zzC(localObject2);
        return (zzd)localObject2;
      }
      localObject2 = ((WeakReference)localObject2).get();
      localObject2 = (View)localObject2;
    }
  }
  
  public void zza(zzd paramzzd)
  {
    Object localObject1 = this.zzpV;
    boolean bool1 = true;
    for (;;)
    {
      Object localObject4;
      try
      {
        this.zzyG = bool1;
        bool1 = false;
        Object localObject2 = null;
        zzi(null);
        localObject2 = zze.zzp(paramzzd);
        bool2 = localObject2 instanceof zzi;
        if (!bool2)
        {
          localObject2 = "Not an instance of native engine. This is most likely a transient error";
          zzin.zzaK((String)localObject2);
          return;
        }
        localObject2 = (zzi)localObject2;
        localObject3 = this.zzyf;
        bool2 = localObject3 instanceof zzg;
        if (bool2)
        {
          localObject3 = this.zzyf;
          localObject3 = (zzg)localObject3;
          bool2 = ((zzg)localObject3).zzdP();
          if (bool2)
          {
            localObject3 = this.zzyf;
            localObject3 = (zzg)localObject3;
            ((zzg)localObject3).zzc((zzh)localObject2);
            localObject3 = this.zzoQ;
            ((FrameLayout)localObject3).removeAllViews();
            localObject3 = zzd((zzi)localObject2);
            this.zzyF = ((zzb)localObject3);
            localObject3 = this.zzyF;
            if (localObject3 != null)
            {
              localObject3 = this.zzyE;
              localObject4 = "1007";
              WeakReference localWeakReference = new java/lang/ref/WeakReference;
              Object localObject5 = this.zzyF;
              localObject5 = ((zzb)localObject5).zzdI();
              localWeakReference.<init>(localObject5);
              ((Map)localObject3).put(localObject4, localWeakReference);
              localObject3 = this.zzoQ;
              localObject4 = this.zzyF;
              ((FrameLayout)localObject3).addView((View)localObject4);
            }
            localObject3 = zzir.zzMc;
            localObject4 = new com/google/android/gms/ads/internal/formats/zzk$1;
            ((zzk.1)localObject4).<init>(this, (zzi)localObject2);
            ((Handler)localObject3).post((Runnable)localObject4);
            localObject3 = this.zzyD;
            ((zzi)localObject2).zzg((View)localObject3);
            localObject2 = this.zzyD;
            zzi((View)localObject2);
            continue;
          }
        }
        this.zzyf = localzzh;
      }
      finally {}
      Object localObject3 = this.zzyf;
      boolean bool2 = localObject3 instanceof zzg;
      if (bool2)
      {
        localObject3 = this.zzyf;
        localObject3 = (zzg)localObject3;
        localObject4 = null;
        ((zzg)localObject3).zzc(null);
      }
    }
  }
  
  public void zza(String paramString, zzd paramzzd)
  {
    Object localObject1 = (View)zze.zzp(paramzzd);
    localObject3 = this.zzpV;
    if (localObject1 == null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.zzyE;
        ((Map)localObject1).remove(paramString);
        return;
      }
      finally {}
      Map localMap = this.zzyE;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(localObject1);
      localMap.put(paramString, localWeakReference);
      ((View)localObject1).setOnTouchListener(this);
      ((View)localObject1).setOnClickListener(this);
    }
  }
  
  Point zzc(MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = new int[2];
    this.zzyD.getLocationOnScreen(arrayOfInt);
    float f1 = paramMotionEvent.getRawX();
    float f2 = arrayOfInt[0];
    f1 -= f2;
    f2 = paramMotionEvent.getRawY();
    float f3 = arrayOfInt[1];
    f3 = f2 - f3;
    Point localPoint = new android/graphics/Point;
    int i = (int)f1;
    int j = (int)f3;
    localPoint.<init>(i, j);
    return localPoint;
  }
  
  zzb zzd(zzi paramzzi)
  {
    return paramzzi.zza(this);
  }
  
  void zzi(View paramView)
  {
    zzh localzzh = this.zzyf;
    if (localzzh != null)
    {
      localzzh = this.zzyf;
      boolean bool = localzzh instanceof zzg;
      if (!bool) {
        break label46;
      }
    }
    label46:
    for (localzzh = ((zzg)this.zzyf).zzdQ();; localzzh = this.zzyf)
    {
      if (localzzh != null) {
        localzzh.zzi(paramView);
      }
      return;
    }
  }
  
  Point zzj(View paramView)
  {
    Object localObject1 = this.zzyF;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.zzyF.zzdI();
      boolean bool = localObject1.equals(paramView);
      if (bool)
      {
        localObject2 = new android/graphics/Point;
        ((Point)localObject2).<init>();
        localObject1 = this.zzyD;
        Object localObject3 = new android/graphics/Rect;
        ((Rect)localObject3).<init>();
        ((FrameLayout)localObject1).getGlobalVisibleRect((Rect)localObject3, (Point)localObject2);
        localObject3 = new android/graphics/Point;
        ((Point)localObject3).<init>();
        localObject1 = new android/graphics/Rect;
        ((Rect)localObject1).<init>();
        paramView.getGlobalVisibleRect((Rect)localObject1, (Point)localObject3);
        localObject1 = new android/graphics/Point;
        int i = ((Point)localObject3).x;
        int j = ((Point)localObject2).x;
        i -= j;
        int k = ((Point)localObject3).y;
        int m = ((Point)localObject2).y;
        m = k - m;
        ((Point)localObject1).<init>(i, m);
      }
    }
    for (;;)
    {
      return (Point)localObject1;
      localObject1 = new android/graphics/Point;
      ((Point)localObject1).<init>();
      localObject2 = new android/graphics/Rect;
      ((Rect)localObject2).<init>();
      paramView.getGlobalVisibleRect((Rect)localObject2, (Point)localObject1);
    }
  }
  
  int zzq(int paramInt)
  {
    zza localzza = zzn.zzcS();
    Context localContext = this.zzyf.getContext();
    return localzza.zzc(localContext, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */