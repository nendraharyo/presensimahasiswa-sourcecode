package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

class BaseAdView
  extends ViewGroup
{
  private final zzab zzoJ;
  
  public BaseAdView(Context paramContext, int paramInt)
  {
    super(paramContext);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    boolean bool = zze(paramInt);
    localzzab.<init>(this, bool);
    this.zzoJ = localzzab;
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    boolean bool = zze(paramInt);
    localzzab.<init>(this, paramAttributeSet, false, bool);
    this.zzoJ = localzzab;
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    boolean bool = zze(paramInt2);
    localzzab.<init>(this, paramAttributeSet, false, bool);
    this.zzoJ = localzzab;
  }
  
  private static boolean zze(int paramInt)
  {
    int i = 2;
    if (paramInt == i) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public void destroy()
  {
    this.zzoJ.destroy();
  }
  
  public AdListener getAdListener()
  {
    return this.zzoJ.getAdListener();
  }
  
  public AdSize getAdSize()
  {
    return this.zzoJ.getAdSize();
  }
  
  public String getAdUnitId()
  {
    return this.zzoJ.getAdUnitId();
  }
  
  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.zzoJ.getInAppPurchaseListener();
  }
  
  public String getMediationAdapterClassName()
  {
    return this.zzoJ.getMediationAdapterClassName();
  }
  
  public boolean isLoading()
  {
    return this.zzoJ.isLoading();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    zzab localzzab = this.zzoJ;
    zzaa localzzaa = paramAdRequest.zzaE();
    localzzab.zza(localzzaa);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if (localView != null)
    {
      int i = localView.getVisibility();
      int j = 8;
      if (i != j)
      {
        i = localView.getMeasuredWidth();
        j = localView.getMeasuredHeight();
        int k = (paramInt3 - paramInt1 - i) / 2;
        int m = (paramInt4 - paramInt2 - j) / 2;
        i += k;
        j += m;
        localView.layout(k, m, i, j);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Context localContext = null;
    Object localObject = getChildAt(0);
    int j;
    if (localObject != null)
    {
      j = ((View)localObject).getVisibility();
      int k = 8;
      if (j != k)
      {
        measureChild((View)localObject, paramInt1, paramInt2);
        j = ((View)localObject).getMeasuredWidth();
        i = ((View)localObject).getMeasuredHeight();
      }
    }
    for (;;)
    {
      int m = getSuggestedMinimumWidth();
      j = Math.max(j, m);
      m = getSuggestedMinimumHeight();
      i = Math.max(i, m);
      j = View.resolveSize(j, paramInt1);
      i = View.resolveSize(i, paramInt2);
      setMeasuredDimension(j, i);
      return;
      localObject = getAdSize();
      if (localObject != null)
      {
        localContext = getContext();
        j = ((AdSize)localObject).getWidthInPixels(localContext);
        i = ((AdSize)localObject).getHeightInPixels(localContext);
      }
      else
      {
        j = 0;
      }
    }
  }
  
  public void pause()
  {
    this.zzoJ.pause();
  }
  
  public void resume()
  {
    this.zzoJ.resume();
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    zzab localzzab = this.zzoJ;
    localzzab.setAdListener(paramAdListener);
    if (paramAdListener != null)
    {
      boolean bool = paramAdListener instanceof zza;
      if (bool)
      {
        localzzab = this.zzoJ;
        paramAdListener = (zza)paramAdListener;
        localzzab.zza(paramAdListener);
      }
    }
    for (;;)
    {
      return;
      if (paramAdListener == null)
      {
        localzzab = this.zzoJ;
        localzzab.zza(null);
      }
    }
  }
  
  public void setAdSize(AdSize paramAdSize)
  {
    zzab localzzab = this.zzoJ;
    AdSize[] arrayOfAdSize = new AdSize[1];
    arrayOfAdSize[0] = paramAdSize;
    localzzab.setAdSizes(arrayOfAdSize);
  }
  
  public void setAdUnitId(String paramString)
  {
    this.zzoJ.setAdUnitId(paramString);
  }
  
  public void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.zzoJ.setInAppPurchaseListener(paramInAppPurchaseListener);
  }
  
  public void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    this.zzoJ.setPlayStorePurchaseParams(paramPlayStorePurchaseListener, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\BaseAdView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */