package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzcv;

public abstract class NativeAdView
  extends FrameLayout
{
  private final FrameLayout zzoQ;
  private final zzcj zzoR;
  
  public NativeAdView(Context paramContext)
  {
    super(paramContext);
    Object localObject = zzn(paramContext);
    this.zzoQ = ((FrameLayout)localObject);
    localObject = zzaI();
    this.zzoR = ((zzcj)localObject);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = zzn(paramContext);
    this.zzoQ = ((FrameLayout)localObject);
    localObject = zzaI();
    this.zzoR = ((zzcj)localObject);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = zzn(paramContext);
    this.zzoQ = ((FrameLayout)localObject);
    localObject = zzaI();
    this.zzoR = ((zzcj)localObject);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    Object localObject = zzn(paramContext);
    this.zzoQ = ((FrameLayout)localObject);
    localObject = zzaI();
    this.zzoR = ((zzcj)localObject);
  }
  
  private zzcj zzaI()
  {
    zzx.zzb(this.zzoQ, "createDelegate must be called after mOverlayFrame has been created");
    zzcv localzzcv = zzn.zzcW();
    Context localContext = this.zzoQ.getContext();
    FrameLayout localFrameLayout = this.zzoQ;
    return localzzcv.zza(localContext, this, localFrameLayout);
  }
  
  private FrameLayout zzn(Context paramContext)
  {
    int i = -1;
    FrameLayout localFrameLayout = zzo(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
    localLayoutParams.<init>(i, i);
    localFrameLayout.setLayoutParams(localLayoutParams);
    addView(localFrameLayout);
    return localFrameLayout;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    FrameLayout localFrameLayout = this.zzoQ;
    super.bringChildToFront(localFrameLayout);
  }
  
  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    FrameLayout localFrameLayout = this.zzoQ;
    if (localFrameLayout != paramView)
    {
      localFrameLayout = this.zzoQ;
      super.bringChildToFront(localFrameLayout);
    }
  }
  
  public void destroy()
  {
    try
    {
      zzcj localzzcj = this.zzoR;
      localzzcj.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Unable to destroy native ad view";
        zzb.zzb(str, localRemoteException);
      }
    }
  }
  
  public void removeAllViews()
  {
    super.removeAllViews();
    FrameLayout localFrameLayout = this.zzoQ;
    super.addView(localFrameLayout);
  }
  
  public void removeView(View paramView)
  {
    FrameLayout localFrameLayout = this.zzoQ;
    if (localFrameLayout == paramView) {}
    for (;;)
    {
      return;
      super.removeView(paramView);
    }
  }
  
  public void setNativeAd(NativeAd paramNativeAd)
  {
    try
    {
      localObject1 = this.zzoR;
      Object localObject2 = paramNativeAd.zzaH();
      localObject2 = (zzd)localObject2;
      ((zzcj)localObject1).zza((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1 = "Unable to call setNativeAd on delegate";
        zzb.zzb((String)localObject1, localRemoteException);
      }
    }
  }
  
  protected void zza(String paramString, View paramView)
  {
    try
    {
      zzcj localzzcj = this.zzoR;
      localObject = zze.zzC(paramView);
      localzzcj.zza(paramString, (zzd)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Unable to call setAssetView on delegate";
        zzb.zzb((String)localObject, localRemoteException);
      }
    }
  }
  
  protected View zzn(String paramString)
  {
    try
    {
      localObject1 = this.zzoR;
      localObject1 = ((zzcj)localObject1).zzK(paramString);
      if (localObject1 == null) {
        break label38;
      }
      localObject1 = zze.zzp((zzd)localObject1);
      localObject1 = (View)localObject1;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Unable to call getAssetView on delegate";
        zzb.zzb(str, localRemoteException);
        label38:
        Object localObject2 = null;
      }
    }
    return (View)localObject1;
  }
  
  FrameLayout zzo(Context paramContext)
  {
    FrameLayout localFrameLayout = new android/widget/FrameLayout;
    localFrameLayout.<init>(paramContext);
    return localFrameLayout;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\formats\NativeAdView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */