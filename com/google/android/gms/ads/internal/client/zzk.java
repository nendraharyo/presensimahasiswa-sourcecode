package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.ads.AdSize;

public final class zzk
{
  private final String zzpS;
  private final AdSize[] zzuo;
  
  public zzk(Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject1 = paramContext.getResources();
    Object localObject2 = R.styleable.AdsAttrs;
    localObject2 = ((Resources)localObject1).obtainAttributes(paramAttributeSet, (int[])localObject2);
    int i = R.styleable.AdsAttrs_adSize;
    String str1 = ((TypedArray)localObject2).getString(i);
    i = R.styleable.AdsAttrs_adSizes;
    String str2 = ((TypedArray)localObject2).getString(i);
    boolean bool2 = TextUtils.isEmpty(str1);
    if (!bool2)
    {
      bool2 = bool1;
      boolean bool4 = TextUtils.isEmpty(str2);
      if (bool4) {
        break label166;
      }
      label82:
      if ((!bool2) || (bool1)) {
        break label171;
      }
      localObject1 = zzz(str1);
    }
    boolean bool3;
    for (this.zzuo = ((AdSize[])localObject1);; this.zzuo = ((AdSize[])localObject1))
    {
      int j = R.styleable.AdsAttrs_adUnitId;
      localObject1 = ((TypedArray)localObject2).getString(j);
      this.zzpS = ((String)localObject1);
      localObject1 = this.zzpS;
      bool3 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool3) {
        return;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Required XML attribute \"adUnitId\" was missing.");
      throw ((Throwable)localObject1);
      bool3 = false;
      localObject1 = null;
      break;
      label166:
      bool1 = false;
      break label82;
      label171:
      if ((bool3) || (!bool1)) {
        break label196;
      }
      localObject1 = zzz(str2);
    }
    label196:
    if ((bool3) && (bool1))
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
      throw ((Throwable)localObject1);
    }
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("Required XML attribute \"adSize\" was missing.");
    throw ((Throwable)localObject1);
  }
  
  private static AdSize[] zzz(String paramString)
  {
    int i = 1;
    Object localObject1 = null;
    String[] arrayOfString1 = paramString.split("\\s*,\\s*");
    AdSize[] arrayOfAdSize = new AdSize[arrayOfString1.length];
    int j = 0;
    Object localObject2 = null;
    int k = arrayOfString1.length;
    IllegalArgumentException localIllegalArgumentException;
    if (j < k)
    {
      Object localObject3 = arrayOfString1[j].trim();
      Object localObject4 = "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$";
      boolean bool1 = ((String)localObject3).matches((String)localObject4);
      String[] arrayOfString2;
      int i1;
      String str1;
      if (bool1)
      {
        arrayOfString2 = ((String)localObject3).split("[xX]");
        localObject4 = arrayOfString2[0].trim();
        arrayOfString2[0] = localObject4;
        localObject4 = arrayOfString2[i].trim();
        arrayOfString2[i] = localObject4;
        localObject4 = "FULL_WIDTH";
        i1 = 0;
        str1 = null;
      }
      for (;;)
      {
        try
        {
          str1 = arrayOfString2[0];
          bool1 = ((String)localObject4).equals(str1);
          if (bool1)
          {
            int m = -1;
            i1 = m;
            localObject4 = "AUTO_HEIGHT";
            int i2 = 1;
            String str2 = arrayOfString2[i2];
            boolean bool2 = ((String)localObject4).equals(str2);
            if (!bool2) {
              continue;
            }
            n = -2;
            localObject3 = new com/google/android/gms/ads/AdSize;
            ((AdSize)localObject3).<init>(i1, n);
            arrayOfAdSize[j] = localObject3;
            j += 1;
            break;
          }
          int n = 0;
          localObject4 = null;
          localObject4 = arrayOfString2[0];
          n = Integer.parseInt((String)localObject4);
          i1 = n;
          continue;
          n = 1;
          localObject4 = arrayOfString2[n];
          n = Integer.parseInt((String)localObject4);
          continue;
          localObject4 = "BANNER";
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = "Could not parse XML attribute \"adSize\": " + (String)localObject3;
          localIllegalArgumentException.<init>((String)localObject1);
          throw localIllegalArgumentException;
        }
        boolean bool3 = ((String)localObject4).equals(localObject3);
        if (bool3)
        {
          localObject4 = AdSize.BANNER;
          arrayOfAdSize[j] = localObject4;
        }
        else
        {
          localObject4 = "LARGE_BANNER";
          bool3 = ((String)localObject4).equals(localObject3);
          if (bool3)
          {
            localObject4 = AdSize.LARGE_BANNER;
            arrayOfAdSize[j] = localObject4;
          }
          else
          {
            localObject4 = "FULL_BANNER";
            bool3 = ((String)localObject4).equals(localObject3);
            if (bool3)
            {
              localObject4 = AdSize.FULL_BANNER;
              arrayOfAdSize[j] = localObject4;
            }
            else
            {
              localObject4 = "LEADERBOARD";
              bool3 = ((String)localObject4).equals(localObject3);
              if (bool3)
              {
                localObject4 = AdSize.LEADERBOARD;
                arrayOfAdSize[j] = localObject4;
              }
              else
              {
                localObject4 = "MEDIUM_RECTANGLE";
                bool3 = ((String)localObject4).equals(localObject3);
                if (bool3)
                {
                  localObject4 = AdSize.MEDIUM_RECTANGLE;
                  arrayOfAdSize[j] = localObject4;
                }
                else
                {
                  localObject4 = "SMART_BANNER";
                  bool3 = ((String)localObject4).equals(localObject3);
                  if (bool3)
                  {
                    localObject4 = AdSize.SMART_BANNER;
                    arrayOfAdSize[j] = localObject4;
                  }
                  else
                  {
                    localObject4 = "WIDE_SKYSCRAPER";
                    bool3 = ((String)localObject4).equals(localObject3);
                    if (bool3)
                    {
                      localObject4 = AdSize.WIDE_SKYSCRAPER;
                      arrayOfAdSize[j] = localObject4;
                    }
                    else
                    {
                      localObject4 = "FLUID";
                      bool3 = ((String)localObject4).equals(localObject3);
                      if (!bool3) {
                        break label549;
                      }
                      localObject4 = AdSize.FLUID;
                      arrayOfAdSize[j] = localObject4;
                    }
                  }
                }
              }
            }
          }
        }
      }
      label549:
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Could not parse XML attribute \"adSize\": " + (String)localObject3;
      localIllegalArgumentException.<init>((String)localObject1);
      throw localIllegalArgumentException;
    }
    j = arrayOfAdSize.length;
    if (j == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Could not parse XML attribute \"adSize\": " + paramString;
      localIllegalArgumentException.<init>((String)localObject1);
      throw localIllegalArgumentException;
    }
    return arrayOfAdSize;
  }
  
  public String getAdUnitId()
  {
    return this.zzpS;
  }
  
  public AdSize[] zzj(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      Object localObject = this.zzuo;
      int i = localObject.length;
      int j = 1;
      if (i != j)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("The adSizes XML attribute is only allowed on PublisherAdViews.");
        throw ((Throwable)localObject);
      }
    }
    return this.zzuo;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */