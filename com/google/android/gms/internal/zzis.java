package com.google.android.gms.internal;

import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class zzis
{
  public static zzis zzP(int paramInt)
  {
    int i = 19;
    Object localObject;
    if (paramInt >= i)
    {
      localObject = new com/google/android/gms/internal/zzis$zzg;
      ((zzis.zzg)localObject).<init>();
    }
    for (;;)
    {
      return (zzis)localObject;
      i = 18;
      if (paramInt >= i)
      {
        localObject = new com/google/android/gms/internal/zzis$zze;
        ((zzis.zze)localObject).<init>();
      }
      else
      {
        i = 17;
        if (paramInt >= i)
        {
          localObject = new com/google/android/gms/internal/zzis$zzd;
          ((zzis.zzd)localObject).<init>();
        }
        else
        {
          i = 16;
          if (paramInt >= i)
          {
            localObject = new com/google/android/gms/internal/zzis$zzf;
            ((zzis.zzf)localObject).<init>();
          }
          else
          {
            i = 14;
            if (paramInt >= i)
            {
              localObject = new com/google/android/gms/internal/zzis$zzc;
              ((zzis.zzc)localObject).<init>();
            }
            else
            {
              i = 11;
              if (paramInt >= i)
              {
                localObject = new com/google/android/gms/internal/zzis$zzb;
                ((zzis.zzb)localObject).<init>();
              }
              else
              {
                i = 9;
                if (paramInt >= i)
                {
                  localObject = new com/google/android/gms/internal/zzis$zza;
                  ((zzis.zza)localObject).<init>();
                }
                else
                {
                  localObject = new com/google/android/gms/internal/zzis;
                  ((zzis)localObject).<init>();
                }
              }
            }
          }
        }
      }
    }
  }
  
  public String getDefaultUserAgent(Context paramContext)
  {
    return "";
  }
  
  public boolean isAttachedToWindow(View paramView)
  {
    IBinder localIBinder = paramView.getWindowToken();
    int i;
    if (localIBinder == null)
    {
      i = paramView.getWindowVisibility();
      int k = 8;
      if (i == k) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localIBinder = null;
    }
  }
  
  public Drawable zza(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
    Resources localResources = paramContext.getResources();
    localBitmapDrawable.<init>(localResources, paramBitmap);
    return localBitmapDrawable;
  }
  
  public String zza(SslError paramSslError)
  {
    return "";
  }
  
  public void zza(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public void zza(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeGlobalOnLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public boolean zza(DownloadManager.Request paramRequest)
  {
    return false;
  }
  
  public boolean zza(Context paramContext, WebSettings paramWebSettings)
  {
    return false;
  }
  
  public boolean zza(Window paramWindow)
  {
    return false;
  }
  
  public zzjq zzb(zzjp paramzzjp, boolean paramBoolean)
  {
    zzjq localzzjq = new com/google/android/gms/internal/zzjq;
    localzzjq.<init>(paramzzjp, paramBoolean);
    return localzzjq;
  }
  
  public void zzb(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Object localObject1 = paramActivity.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = ((Window)localObject1).getDecorView();
      if (localObject2 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView().getViewTreeObserver();
        if (localObject2 != null)
        {
          localObject1 = ((Window)localObject1).getDecorView().getViewTreeObserver();
          zza((ViewTreeObserver)localObject1, paramOnGlobalLayoutListener);
        }
      }
    }
  }
  
  public Set zzf(Uri paramUri)
  {
    int i = -1;
    int j = paramUri.isOpaque();
    Object localObject;
    if (j != 0) {
      localObject = Collections.emptySet();
    }
    for (;;)
    {
      return (Set)localObject;
      String str = paramUri.getEncodedQuery();
      if (str == null)
      {
        localObject = Collections.emptySet();
      }
      else
      {
        LinkedHashSet localLinkedHashSet = new java/util/LinkedHashSet;
        localLinkedHashSet.<init>();
        j = 0;
        localObject = null;
        int m;
        int k;
        do
        {
          m = str.indexOf('&', j);
          if (m == i) {
            m = str.length();
          }
          int n = str.indexOf('=', j);
          if ((n > m) || (n == i)) {
            n = m;
          }
          localObject = Uri.decode(str.substring(j, n));
          localLinkedHashSet.add(localObject);
          k = m + 1;
          m = str.length();
        } while (k < m);
        localObject = Collections.unmodifiableSet(localLinkedHashSet);
      }
    }
  }
  
  public int zzhv()
  {
    return 0;
  }
  
  public int zzhw()
  {
    return 1;
  }
  
  public int zzhx()
  {
    return 5;
  }
  
  public ViewGroup.LayoutParams zzhy()
  {
    int i = -2;
    ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public boolean zzi(zzjp paramzzjp)
  {
    if (paramzzjp == null) {}
    for (boolean bool = false;; bool = true)
    {
      return bool;
      paramzzjp.onPause();
    }
  }
  
  public boolean zzj(zzjp paramzzjp)
  {
    if (paramzzjp == null) {}
    for (boolean bool = false;; bool = true)
    {
      return bool;
      paramzzjp.onResume();
    }
  }
  
  public WebChromeClient zzk(zzjp paramzzjp)
  {
    return null;
  }
  
  public boolean zzm(View paramView)
  {
    return false;
  }
  
  public boolean zzn(View paramView)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzis.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */