package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzg;
import java.util.LinkedList;

public abstract class zza
{
  private final zzf zzavA;
  private LifecycleDelegate zzavx;
  private Bundle zzavy;
  private LinkedList zzavz;
  
  public zza()
  {
    zza.1 local1 = new com/google/android/gms/dynamic/zza$1;
    local1.<init>(this);
    this.zzavA = local1;
  }
  
  private void zza(Bundle paramBundle, zza.zza paramzza)
  {
    Object localObject = this.zzavx;
    if (localObject != null)
    {
      localObject = this.zzavx;
      paramzza.zzb((LifecycleDelegate)localObject);
      return;
    }
    localObject = this.zzavz;
    if (localObject == null)
    {
      localObject = new java/util/LinkedList;
      ((LinkedList)localObject).<init>();
      this.zzavz = ((LinkedList)localObject);
    }
    localObject = this.zzavz;
    ((LinkedList)localObject).add(paramzza);
    if (paramBundle != null)
    {
      localObject = this.zzavy;
      if (localObject != null) {
        break label94;
      }
      localObject = (Bundle)paramBundle.clone();
      this.zzavy = ((Bundle)localObject);
    }
    for (;;)
    {
      localObject = this.zzavA;
      zza((zzf)localObject);
      break;
      label94:
      localObject = this.zzavy;
      ((Bundle)localObject).putAll(paramBundle);
    }
  }
  
  public static void zzb(FrameLayout paramFrameLayout)
  {
    int i = -2;
    Context localContext = paramFrameLayout.getContext();
    int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(localContext);
    Object localObject1 = GooglePlayServicesUtil.zzao(localContext);
    localObject1 = zzg.zzc(localContext, j, (String)localObject1);
    Object localObject2 = zzg.zzh(localContext, j);
    LinearLayout localLinearLayout = new android/widget/LinearLayout;
    Object localObject3 = paramFrameLayout.getContext();
    localLinearLayout.<init>((Context)localObject3);
    int k = 1;
    localLinearLayout.setOrientation(k);
    localObject3 = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject3).<init>(i, i);
    localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    paramFrameLayout.addView(localLinearLayout);
    localObject3 = new android/widget/TextView;
    Object localObject4 = paramFrameLayout.getContext();
    ((TextView)localObject3).<init>((Context)localObject4);
    localObject4 = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject4).<init>(i, i);
    ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
    ((TextView)localObject3).setText((CharSequence)localObject1);
    localLinearLayout.addView((View)localObject3);
    if (localObject2 != null)
    {
      localObject1 = new android/widget/Button;
      ((Button)localObject1).<init>(localContext);
      localObject3 = new android/widget/FrameLayout$LayoutParams;
      ((FrameLayout.LayoutParams)localObject3).<init>(i, i);
      ((Button)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
      ((Button)localObject1).setText((CharSequence)localObject2);
      localLinearLayout.addView((View)localObject1);
      localObject2 = new com/google/android/gms/dynamic/zza$5;
      ((zza.5)localObject2).<init>(localContext, j);
      ((Button)localObject1).setOnClickListener((View.OnClickListener)localObject2);
    }
  }
  
  private void zzeJ(int paramInt)
  {
    for (;;)
    {
      Object localObject = this.zzavz;
      boolean bool = ((LinkedList)localObject).isEmpty();
      if (bool) {
        break;
      }
      localObject = (zza.zza)this.zzavz.getLast();
      int i = ((zza.zza)localObject).getState();
      if (i < paramInt) {
        break;
      }
      localObject = this.zzavz;
      ((LinkedList)localObject).removeLast();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    zza.3 local3 = new com/google/android/gms/dynamic/zza$3;
    local3.<init>(this, paramBundle);
    zza(paramBundle, local3);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new android/widget/FrameLayout;
    Object localObject = paramLayoutInflater.getContext();
    localFrameLayout.<init>((Context)localObject);
    localObject = new com/google/android/gms/dynamic/zza$4;
    ((zza.4)localObject).<init>(this, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle);
    zza(paramBundle, (zza.zza)localObject);
    localObject = this.zzavx;
    if (localObject == null) {
      zza(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  public void onDestroy()
  {
    LifecycleDelegate localLifecycleDelegate = this.zzavx;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate = this.zzavx;
      localLifecycleDelegate.onDestroy();
    }
    for (;;)
    {
      return;
      int i = 1;
      zzeJ(i);
    }
  }
  
  public void onDestroyView()
  {
    LifecycleDelegate localLifecycleDelegate = this.zzavx;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate = this.zzavx;
      localLifecycleDelegate.onDestroyView();
    }
    for (;;)
    {
      return;
      int i = 2;
      zzeJ(i);
    }
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    zza.2 local2 = new com/google/android/gms/dynamic/zza$2;
    local2.<init>(this, paramActivity, paramBundle1, paramBundle2);
    zza(paramBundle2, local2);
  }
  
  public void onLowMemory()
  {
    LifecycleDelegate localLifecycleDelegate = this.zzavx;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate = this.zzavx;
      localLifecycleDelegate.onLowMemory();
    }
  }
  
  public void onPause()
  {
    LifecycleDelegate localLifecycleDelegate = this.zzavx;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate = this.zzavx;
      localLifecycleDelegate.onPause();
    }
    for (;;)
    {
      return;
      int i = 5;
      zzeJ(i);
    }
  }
  
  public void onResume()
  {
    zza.7 local7 = new com/google/android/gms/dynamic/zza$7;
    local7.<init>(this);
    zza(null, local7);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Object localObject = this.zzavx;
    if (localObject != null)
    {
      localObject = this.zzavx;
      ((LifecycleDelegate)localObject).onSaveInstanceState(paramBundle);
    }
    for (;;)
    {
      return;
      localObject = this.zzavy;
      if (localObject != null)
      {
        localObject = this.zzavy;
        paramBundle.putAll((Bundle)localObject);
      }
    }
  }
  
  public void onStart()
  {
    zza.6 local6 = new com/google/android/gms/dynamic/zza$6;
    local6.<init>(this);
    zza(null, local6);
  }
  
  public void onStop()
  {
    LifecycleDelegate localLifecycleDelegate = this.zzavx;
    if (localLifecycleDelegate != null)
    {
      localLifecycleDelegate = this.zzavx;
      localLifecycleDelegate.onStop();
    }
    for (;;)
    {
      return;
      int i = 4;
      zzeJ(i);
    }
  }
  
  protected void zza(FrameLayout paramFrameLayout)
  {
    zzb(paramFrameLayout);
  }
  
  protected abstract void zza(zzf paramzzf);
  
  public LifecycleDelegate zztU()
  {
    return this.zzavx;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */