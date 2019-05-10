package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzab;

public final class SearchAdView
  extends ViewGroup
{
  private final zzab zzoJ;
  
  public SearchAdView(Context paramContext)
  {
    super(paramContext);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    localzzab.<init>(this);
    this.zzoJ = localzzab;
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    localzzab.<init>(this, paramAttributeSet, false);
    this.zzoJ = localzzab;
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zzab localzzab = new com/google/android/gms/ads/internal/client/zzab;
    localzzab.<init>(this, paramAttributeSet, false);
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
  
  public String getAdUnitId()
  {
    return this.zzoJ.getAdUnitId();
  }
  
  public void loadAd(SearchAdRequest paramSearchAdRequest)
  {
    zzab localzzab = this.zzoJ;
    zzaa localzzaa = paramSearchAdRequest.zzaE();
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
    this.zzoJ.setAdListener(paramAdListener);
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\search\SearchAdView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */