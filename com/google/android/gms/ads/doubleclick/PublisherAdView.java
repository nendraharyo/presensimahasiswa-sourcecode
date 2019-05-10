package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzab;

public final class PublisherAdView
  extends ViewGroup
{
  private final zzab zzoJ;
  
  public PublisherAdView(Context paramContext)
  {
    super(paramContext);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    localzzab.<init>(this);
    this.zzoJ = localzzab;
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    localzzab.<init>(this, paramAttributeSet, true);
    this.zzoJ = localzzab;
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    localzzab.<init>(this, paramAttributeSet, true);
    this.zzoJ = localzzab;
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
  
  public AdSize[] getAdSizes()
  {
    return this.zzoJ.getAdSizes();
  }
  
  public String getAdUnitId()
  {
    return this.zzoJ.getAdUnitId();
  }
  
  public AppEventListener getAppEventListener()
  {
    return this.zzoJ.getAppEventListener();
  }
  
  public String getMediationAdapterClassName()
  {
    return this.zzoJ.getMediationAdapterClassName();
  }
  
  public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return this.zzoJ.getOnCustomRenderedAdLoadedListener();
  }
  
  public boolean isLoading()
  {
    return this.zzoJ.isLoading();
  }
  
  public void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    zzab localzzab = this.zzoJ;
    zzaa localzzaa = paramPublisherAdRequest.zzaE();
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
  
  public void recordManualImpression()
  {
    this.zzoJ.recordManualImpression();
  }
  
  public void resume()
  {
    this.zzoJ.resume();
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.zzoJ.setAdListener(paramAdListener);
  }
  
  public void setAdSizes(AdSize... paramVarArgs)
  {
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.length;
      int j = 1;
      if (i >= j) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The supported ad sizes must contain at least one valid ad size.");
      throw localIllegalArgumentException;
    }
    this.zzoJ.zza(paramVarArgs);
  }
  
  public void setAdUnitId(String paramString)
  {
    this.zzoJ.setAdUnitId(paramString);
  }
  
  public void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.zzoJ.setAppEventListener(paramAppEventListener);
  }
  
  public void setCorrelator(Correlator paramCorrelator)
  {
    this.zzoJ.setCorrelator(paramCorrelator);
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.zzoJ.setManualImpressionsEnabled(paramBoolean);
  }
  
  public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.zzoJ.setOnCustomRenderedAdLoadedListener(paramOnCustomRenderedAdLoadedListener);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\doubleclick\PublisherAdView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */