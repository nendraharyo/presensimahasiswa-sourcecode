package com.google.android.gms.ads.internal.util.client;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzne;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.StringTokenizer;

public class zza
{
  public static final Handler zzMS;
  private static final String zzMT = AdView.class.getName();
  private static final String zzMU = InterstitialAd.class.getName();
  private static final String zzMV = PublisherAdView.class.getName();
  private static final String zzMW = PublisherInterstitialAd.class.getName();
  private static final String zzMX = SearchAdView.class.getName();
  private static final String zzMY = AdLoader.class.getName();
  
  static
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    zzMS = localHandler;
  }
  
  private void zza(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString, int paramInt1, int paramInt2)
  {
    int i = 17;
    int j = paramViewGroup.getChildCount();
    if (j != 0) {}
    for (;;)
    {
      return;
      Context localContext = paramViewGroup.getContext();
      TextView localTextView = new android/widget/TextView;
      localTextView.<init>(localContext);
      localTextView.setGravity(i);
      localTextView.setText(paramString);
      localTextView.setTextColor(paramInt1);
      localTextView.setBackgroundColor(paramInt2);
      FrameLayout localFrameLayout = new android/widget/FrameLayout;
      localFrameLayout.<init>(localContext);
      localFrameLayout.setBackgroundColor(paramInt1);
      int k = 3;
      j = zzb(localContext, k);
      FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
      int m = paramAdSizeParcel.widthPixels - j;
      int n = paramAdSizeParcel.heightPixels;
      j = n - j;
      localLayoutParams.<init>(m, j, i);
      localFrameLayout.addView(localTextView, localLayoutParams);
      j = paramAdSizeParcel.widthPixels;
      int i1 = paramAdSizeParcel.heightPixels;
      paramViewGroup.addView(localFrameLayout, j, i1);
    }
  }
  
  public String zzT(Context paramContext)
  {
    Object localObject = paramContext.getContentResolver();
    if (localObject == null) {}
    String str;
    for (localObject = null;; localObject = Settings.Secure.getString((ContentResolver)localObject, str))
    {
      if (localObject != null)
      {
        boolean bool = zzhI();
        if (!bool) {}
      }
      else
      {
        localObject = "emulator";
      }
      return zzaH((String)localObject);
      str = "android_id";
    }
  }
  
  public boolean zzU(Context paramContext)
  {
    int i = zze.isGooglePlayServicesAvailable(paramContext);
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean zzV(Context paramContext)
  {
    boolean bool = false;
    Object localObject = paramContext.getResources().getConfiguration();
    int i = ((Configuration)localObject).orientation;
    int j = 2;
    float f1 = 2.8E-45F;
    if (i != j) {}
    for (;;)
    {
      return bool;
      localObject = paramContext.getResources().getDisplayMetrics();
      f1 = ((DisplayMetrics)localObject).heightPixels;
      float f2 = ((DisplayMetrics)localObject).density;
      f2 = f1 / f2;
      i = (int)f2;
      j = 600;
      f1 = 8.41E-43F;
      if (i < j) {
        bool = true;
      }
    }
  }
  
  public boolean zzW(Context paramContext)
  {
    boolean bool1 = false;
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Object localObject1 = (WindowManager)paramContext.getSystemService("window");
    Display localDisplay = ((WindowManager)localObject1).getDefaultDisplay();
    boolean bool2 = zzne.zzsi();
    int j;
    int i;
    if (bool2)
    {
      localDisplay.getRealMetrics(localDisplayMetrics);
      j = localDisplayMetrics.heightPixels;
      i = localDisplayMetrics.widthPixels;
      localDisplay.getMetrics(localDisplayMetrics);
      int k = localDisplayMetrics.heightPixels;
      int m = localDisplayMetrics.widthPixels;
      if ((k != j) || (m != i)) {
        break label228;
      }
      i = 1;
      label93:
      bool1 = i;
    }
    for (;;)
    {
      return bool1;
      localObject1 = Display.class;
      Object localObject2 = "getRawHeight";
      Object localObject3 = null;
      label228:
      try
      {
        localObject3 = new Class[0];
        localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
        j = 0;
        localObject2 = null;
        localObject2 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(localDisplay, (Object[])localObject2);
        localObject1 = (Integer)localObject1;
        j = ((Integer)localObject1).intValue();
        localObject1 = Display.class;
        localObject3 = "getRawWidth";
        Class[] arrayOfClass = null;
        arrayOfClass = new Class[0];
        localObject1 = ((Class)localObject1).getMethod((String)localObject3, arrayOfClass);
        localObject3 = null;
        localObject3 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(localDisplay, (Object[])localObject3);
        localObject1 = (Integer)localObject1;
        i = ((Integer)localObject1).intValue();
      }
      catch (Exception localException) {}
      i = 0;
      localObject1 = null;
      break label93;
    }
  }
  
  public int zzX(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    Object localObject = "navigation_bar_width";
    String str1 = "dimen";
    String str2 = "android";
    int i = localResources.getIdentifier((String)localObject, str1, str2);
    if (i > 0)
    {
      localObject = paramContext.getResources();
      i = ((Resources)localObject).getDimensionPixelSize(i);
    }
    for (;;)
    {
      return i;
      i = 0;
      localResources = null;
    }
  }
  
  public int zza(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    float f = paramInt;
    return (int)TypedValue.applyDimension(1, f, paramDisplayMetrics);
  }
  
  public String zza(StackTraceElement[] paramArrayOfStackTraceElement, String paramString)
  {
    int i = 0;
    String str1 = null;
    int j = i + 1;
    int k = paramArrayOfStackTraceElement.length;
    Object localObject;
    boolean bool;
    if (j < k)
    {
      localObject = paramArrayOfStackTraceElement[i];
      String str2 = ((StackTraceElement)localObject).getClassName();
      localObject = ((StackTraceElement)localObject).getMethodName();
      String str3 = "loadAd";
      bool = str3.equalsIgnoreCase((String)localObject);
      if (bool)
      {
        localObject = zzMT;
        bool = ((String)localObject).equalsIgnoreCase(str2);
        if (!bool)
        {
          localObject = zzMU;
          bool = ((String)localObject).equalsIgnoreCase(str2);
          if (!bool)
          {
            localObject = zzMV;
            bool = ((String)localObject).equalsIgnoreCase(str2);
            if (!bool)
            {
              localObject = zzMW;
              bool = ((String)localObject).equalsIgnoreCase(str2);
              if (!bool)
              {
                localObject = zzMX;
                bool = ((String)localObject).equalsIgnoreCase(str2);
                if (!bool)
                {
                  localObject = zzMY;
                  bool = ((String)localObject).equalsIgnoreCase(str2);
                  if (!bool) {
                    break label226;
                  }
                }
              }
            }
          }
        }
        i += 1;
      }
    }
    for (str1 = paramArrayOfStackTraceElement[i].getClassName();; str1 = null)
    {
      if (paramString != null)
      {
        k = 3;
        localObject = zzb(paramString, ".", k);
        if (str1 != null)
        {
          bool = str1.contains((CharSequence)localObject);
          if (bool) {}
        }
      }
      for (;;)
      {
        return str1;
        label226:
        i += 1;
        break;
        i = 0;
        str1 = null;
      }
      i = 0;
    }
  }
  
  public void zza(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString)
  {
    zza(paramViewGroup, paramAdSizeParcel, paramString, -16777216, -1);
  }
  
  public void zza(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString1, String paramString2)
  {
    zzb.zzaK(paramString2);
    zza(paramViewGroup, paramAdSizeParcel, paramString1, -65536, -16777216);
  }
  
  public String zzaH(String paramString)
  {
    int i = 0;
    String str1 = null;
    int j = 2;
    Object localObject1;
    if (i < j) {
      localObject1 = "MD5";
    }
    for (;;)
    {
      try
      {
        localObject1 = MessageDigest.getInstance((String)localObject1);
        Object localObject2 = paramString.getBytes();
        ((MessageDigest)localObject1).update((byte[])localObject2);
        localObject2 = Locale.US;
        String str2 = "%032X";
        int k = 1;
        Object[] arrayOfObject = new Object[k];
        BigInteger localBigInteger = new java/math/BigInteger;
        int m = 1;
        localObject1 = ((MessageDigest)localObject1).digest();
        localBigInteger.<init>(m, (byte[])localObject1);
        arrayOfObject[0] = localBigInteger;
        str1 = String.format((Locale)localObject2, str2, arrayOfObject);
        return str1;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i += 1;
      }
      break;
      i = 0;
      str1 = null;
    }
  }
  
  public int zzb(Context paramContext, int paramInt)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return zza(localDisplayMetrics, paramInt);
  }
  
  public int zzb(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    float f1 = paramInt;
    float f2 = paramDisplayMetrics.density;
    return Math.round(f1 / f2);
  }
  
  String zzb(String paramString1, String paramString2, int paramInt)
  {
    StringTokenizer localStringTokenizer = new java/util/StringTokenizer;
    localStringTokenizer.<init>(paramString1, paramString2);
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    int i = paramInt + -1;
    if (paramInt > 0)
    {
      boolean bool2 = localStringTokenizer.hasMoreElements();
      if (bool2)
      {
        String str1 = localStringTokenizer.nextToken();
        localStringBuilder1.append(str1);
        for (;;)
        {
          int j = i + -1;
          if (i <= 0) {
            break;
          }
          boolean bool1 = localStringTokenizer.hasMoreElements();
          if (!bool1) {
            break;
          }
          StringBuilder localStringBuilder2 = localStringBuilder1.append(".");
          String str2 = localStringTokenizer.nextToken();
          localStringBuilder2.append(str2);
          bool1 = j;
        }
        paramString1 = localStringBuilder1.toString();
      }
    }
    return paramString1;
  }
  
  public int zzc(Context paramContext, int paramInt)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
    localDisplayMetrics.<init>();
    localDisplay.getMetrics(localDisplayMetrics);
    return zzb(localDisplayMetrics, paramInt);
  }
  
  public boolean zzhI()
  {
    return Build.DEVICE.startsWith("generic");
  }
  
  public boolean zzhJ()
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = Looper.getMainLooper();
    boolean bool;
    if (localLooper1 == localLooper2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLooper1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\interna\\util\client\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */