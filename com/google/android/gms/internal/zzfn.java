package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;
import java.util.Set;

public class zzfn
  extends zzfs
{
  static final Set zzDa;
  private AdSizeParcel zzCh;
  private String zzDb = "top-right";
  private boolean zzDc = true;
  private int zzDd = 0;
  private int zzDe = 0;
  private int zzDf;
  private int zzDg;
  private final Activity zzDh;
  private ImageView zzDi;
  private LinearLayout zzDj;
  private zzft zzDk;
  private PopupWindow zzDl;
  private RelativeLayout zzDm;
  private ViewGroup zzDn;
  private int zzoG;
  private int zzoH;
  private final zzjp zzpD;
  private final Object zzpV;
  
  static
  {
    String[] arrayOfString = new String[7];
    arrayOfString[0] = "top-left";
    arrayOfString[1] = "top-right";
    arrayOfString[2] = "top-center";
    arrayOfString[3] = "center";
    arrayOfString[4] = "bottom-left";
    arrayOfString[5] = "bottom-right";
    arrayOfString[6] = "bottom-center";
    zzDa = zzmr.zzc(arrayOfString);
  }
  
  public zzfn(zzjp paramzzjp, zzft paramzzft)
  {
    super(paramzzjp, "resize");
    this.zzoH = i;
    this.zzDf = 0;
    this.zzDg = 0;
    this.zzoG = i;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzpD = paramzzjp;
    localObject = paramzzjp.zzhP();
    this.zzDh = ((Activity)localObject);
    this.zzDk = paramzzft;
  }
  
  private int[] zzeM()
  {
    int i = 2;
    int j = 1;
    int k = 0;
    boolean bool = zzeO();
    if (!bool)
    {
      bool = false;
      localObject1 = null;
    }
    int i1;
    for (;;)
    {
      return (int[])localObject1;
      bool = this.zzDc;
      if (!bool) {
        break;
      }
      localObject1 = new int[i];
      n = this.zzDd;
      i1 = this.zzDf;
      n += i1;
      localObject1[0] = n;
      k = this.zzDe;
      n = this.zzDg;
      k += n;
      localObject1[j] = k;
    }
    Object localObject1 = zzr.zzbC();
    Object localObject2 = this.zzDh;
    localObject1 = ((zzir)localObject1).zzf((Activity)localObject2);
    localObject2 = zzr.zzbC();
    Object localObject3 = this.zzDh;
    localObject3 = ((zzir)localObject2).zzh((Activity)localObject3);
    int i2 = localObject1[0];
    int m = this.zzDd;
    int n = this.zzDf;
    m += n;
    n = this.zzDe;
    int i3 = this.zzDg;
    n += i3;
    if (m < 0)
    {
      m = 0;
      localObject1 = null;
      label186:
      i2 = localObject3[0];
      if (n >= i2) {
        break label261;
      }
      n = localObject3[0];
    }
    for (;;)
    {
      localObject3 = new int[i];
      localObject3[0] = m;
      localObject3[j] = n;
      localObject1 = localObject3;
      break;
      i3 = this.zzoG + m;
      if (i3 <= i2) {
        break label186;
      }
      m = this.zzoG;
      m = i2 - m;
      break label186;
      label261:
      i2 = this.zzoH + n;
      i3 = localObject3[j];
      if (i2 > i3)
      {
        n = localObject3[j];
        i1 = this.zzoH;
        n -= i1;
      }
    }
  }
  
  private void zzh(Map paramMap)
  {
    Object localObject = (CharSequence)paramMap.get("width");
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject);
    zzir localzzir;
    if (!bool1)
    {
      localzzir = zzr.zzbC();
      localObject = (String)paramMap.get("width");
      int i = localzzir.zzaD((String)localObject);
      this.zzoG = i;
    }
    localObject = (CharSequence)paramMap.get("height");
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool2)
    {
      localzzir = zzr.zzbC();
      localObject = (String)paramMap.get("height");
      int j = localzzir.zzaD((String)localObject);
      this.zzoH = j;
    }
    localObject = (CharSequence)paramMap.get("offsetX");
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool3)
    {
      localzzir = zzr.zzbC();
      localObject = (String)paramMap.get("offsetX");
      int k = localzzir.zzaD((String)localObject);
      this.zzDf = k;
    }
    localObject = (CharSequence)paramMap.get("offsetY");
    boolean bool4 = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool4)
    {
      localzzir = zzr.zzbC();
      localObject = (String)paramMap.get("offsetY");
      int m = localzzir.zzaD((String)localObject);
      this.zzDg = m;
    }
    localObject = (CharSequence)paramMap.get("allowOffscreen");
    boolean bool5 = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool5)
    {
      localObject = (String)paramMap.get("allowOffscreen");
      bool5 = Boolean.parseBoolean((String)localObject);
      this.zzDc = bool5;
    }
    localObject = (String)paramMap.get("customClosePosition");
    boolean bool6 = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool6) {
      this.zzDb = ((String)localObject);
    }
  }
  
  public void zza(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzDd = paramInt1;
      this.zzDe = paramInt2;
      Object localObject2 = this.zzDl;
      if ((localObject2 != null) && (paramBoolean))
      {
        localObject2 = zzeM();
        if (localObject2 != null)
        {
          PopupWindow localPopupWindow1 = this.zzDl;
          zza localzza = zzn.zzcS();
          Object localObject4 = this.zzDh;
          int i = 0;
          Object localObject5 = null;
          i = localObject2[0];
          int j = localzza.zzb((Context)localObject4, i);
          localObject4 = zzn.zzcS();
          localObject5 = this.zzDh;
          int k = 1;
          k = localObject2[k];
          int m = ((zza)localObject4).zzb((Context)localObject5, k);
          localObject5 = this.zzDl;
          i = ((PopupWindow)localObject5).getWidth();
          PopupWindow localPopupWindow2 = this.zzDl;
          k = localPopupWindow2.getHeight();
          localPopupWindow1.update(j, m, i, k);
          int n = 0;
          localPopupWindow1 = null;
          n = localObject2[0];
          j = 1;
          i1 = localObject2[j];
          zzd(n, i1);
        }
      }
      else
      {
        return;
      }
      int i1 = 1;
      zzp(i1);
    }
  }
  
  void zzc(int paramInt1, int paramInt2)
  {
    zzft localzzft = this.zzDk;
    if (localzzft != null)
    {
      localzzft = this.zzDk;
      int i = this.zzoG;
      int j = this.zzoH;
      localzzft.zza(paramInt1, paramInt2, i, j);
    }
  }
  
  void zzd(int paramInt1, int paramInt2)
  {
    zzir localzzir = zzr.zzbC();
    Activity localActivity = this.zzDh;
    int i = localzzir.zzh(localActivity)[0];
    i = paramInt2 - i;
    int j = this.zzoG;
    int k = this.zzoH;
    zzb(paramInt1, i, j, k);
  }
  
  public void zze(int paramInt1, int paramInt2)
  {
    this.zzDd = paramInt1;
    this.zzDe = paramInt2;
  }
  
  boolean zzeL()
  {
    int i = -1;
    int j = this.zzoG;
    if (j > i)
    {
      j = this.zzoH;
      if (j <= i) {}
    }
    int k;
    for (j = 1;; k = 0) {
      return j;
    }
  }
  
  public boolean zzeN()
  {
    synchronized (this.zzpV)
    {
      PopupWindow localPopupWindow = this.zzDl;
      if (localPopupWindow != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
      localPopupWindow = null;
    }
  }
  
  boolean zzeO()
  {
    int i = 50;
    int j = 1;
    boolean bool1 = false;
    Object localObject1 = zzr.zzbC();
    Object localObject2 = this.zzDh;
    localObject1 = ((zzir)localObject1).zzf((Activity)localObject2);
    localObject2 = zzr.zzbC();
    Object localObject3 = this.zzDh;
    localObject3 = ((zzir)localObject2).zzh((Activity)localObject3);
    int k = localObject1[0];
    int m = localObject1[j];
    int i1 = this.zzoG;
    String str1;
    if (i1 >= i)
    {
      i1 = this.zzoG;
      if (i1 <= k) {}
    }
    else
    {
      str1 = "Width is too small or too large.";
      zzin.zzaK(str1);
    }
    for (;;)
    {
      return bool1;
      i1 = this.zzoH;
      if (i1 >= i)
      {
        i1 = this.zzoH;
        if (i1 <= m) {}
      }
      else
      {
        str1 = "Height is too small or too large.";
        zzin.zzaK(str1);
        continue;
      }
      i1 = this.zzoH;
      if (i1 != m) {
        break;
      }
      m = this.zzoG;
      if (m != k) {
        break;
      }
      str1 = "Cannot resize to a full-screen ad.";
      zzin.zzaK(str1);
    }
    boolean bool2 = this.zzDc;
    int n;
    if (bool2)
    {
      localObject2 = this.zzDb;
      n = -1;
      i = ((String)localObject2).hashCode();
      switch (i)
      {
      default: 
        switch (n)
        {
        default: 
          label256:
          n = this.zzDd;
          i1 = this.zzDf;
          n += i1;
          i1 = this.zzoG;
          i1 = n + i1 + -50;
          n = this.zzDe;
          i = this.zzDg;
          n += i;
        }
        break;
      }
    }
    while (i1 >= 0)
    {
      i1 += 50;
      if (i1 > k) {
        break;
      }
      i1 = localObject3[0];
      if (n < i1) {
        break;
      }
      n += 50;
      i1 = localObject3[j];
      if (n > i1) {
        break;
      }
      bool1 = j;
      break;
      String str2 = "top-left";
      boolean bool3 = ((String)localObject2).equals(str2);
      if (!bool3) {
        break label256;
      }
      n = 0;
      localObject1 = null;
      break label256;
      str2 = "top-center";
      bool3 = ((String)localObject2).equals(str2);
      if (!bool3) {
        break label256;
      }
      n = j;
      break label256;
      str2 = "center";
      bool3 = ((String)localObject2).equals(str2);
      if (!bool3) {
        break label256;
      }
      n = 2;
      break label256;
      str2 = "bottom-left";
      bool3 = ((String)localObject2).equals(str2);
      if (!bool3) {
        break label256;
      }
      n = 3;
      break label256;
      str2 = "bottom-center";
      bool3 = ((String)localObject2).equals(str2);
      if (!bool3) {
        break label256;
      }
      n = 4;
      break label256;
      str2 = "bottom-right";
      bool3 = ((String)localObject2).equals(str2);
      if (!bool3) {
        break label256;
      }
      n = 5;
      break label256;
      n = this.zzDd;
      int i2 = this.zzDf + n;
      n = this.zzDe;
      i = this.zzDg;
      n += i;
      continue;
      n = this.zzDd;
      i2 = this.zzDf;
      n += i2;
      i2 = this.zzoG / 2;
      i2 = n + i2 + -25;
      n = this.zzDe;
      i = this.zzDg;
      n += i;
      continue;
      n = this.zzDd;
      i2 = this.zzDf;
      n += i2;
      i2 = this.zzoG / 2;
      i2 = n + i2 + -25;
      n = this.zzDe;
      i = this.zzDg;
      n += i;
      i = this.zzoH / 2;
      n = n + i + -25;
      continue;
      n = this.zzDd;
      i2 = this.zzDf + n;
      n = this.zzDe;
      i = this.zzDg;
      n += i;
      i = this.zzoH;
      n = n + i + -50;
      continue;
      n = this.zzDd;
      i2 = this.zzDf;
      n += i2;
      i2 = this.zzoG / 2;
      i2 = n + i2 + -25;
      n = this.zzDe;
      i = this.zzDg;
      n += i;
      i = this.zzoH;
      n = n + i + -50;
      continue;
      n = this.zzDd;
      i2 = this.zzDf;
      n += i2;
      i2 = this.zzoG;
      i2 = n + i2 + -50;
      n = this.zzDe;
      i = this.zzDg;
      n += i;
      i = this.zzoH;
      n = n + i + -50;
    }
  }
  
  public void zzi(Map paramMap)
  {
    int i = -1;
    int j = 1;
    Object localObject1 = null;
    Object localObject8;
    label534:
    label692:
    label900:
    label903:
    label1286:
    label1743:
    for (;;)
    {
      synchronized (this.zzpV)
      {
        Object localObject3 = this.zzDh;
        if (localObject3 == null)
        {
          localObject3 = "Not an activity context. Cannot resize.";
          zzam((String)localObject3);
          return;
        }
        localObject3 = this.zzpD;
        localObject3 = ((zzjp)localObject3).zzaN();
        if (localObject3 == null)
        {
          localObject3 = "Webview is not yet available, size is not set.";
          zzam((String)localObject3);
        }
      }
      Object localObject5 = this.zzpD;
      localObject5 = ((zzjp)localObject5).zzaN();
      boolean bool1 = ((AdSizeParcel)localObject5).zzui;
      if (bool1)
      {
        localObject5 = "Is interstitial. Cannot resize an interstitial.";
        zzam((String)localObject5);
      }
      else
      {
        localObject5 = this.zzpD;
        bool1 = ((zzjp)localObject5).zzhY();
        if (bool1)
        {
          localObject5 = "Cannot resize an expanded banner.";
          zzam((String)localObject5);
        }
        else
        {
          zzh(paramMap);
          bool1 = zzeL();
          if (!bool1)
          {
            localObject5 = "Invalid width and height options. Cannot resize.";
            zzam((String)localObject5);
          }
          else
          {
            localObject5 = this.zzDh;
            Object localObject7 = ((Activity)localObject5).getWindow();
            if (localObject7 != null)
            {
              localObject5 = ((Window)localObject7).getDecorView();
              if (localObject5 != null) {}
            }
            else
            {
              localObject5 = "Activity context is not ready, cannot get window or decor view.";
              zzam((String)localObject5);
              continue;
            }
            int[] arrayOfInt = zzeM();
            if (arrayOfInt == null)
            {
              localObject5 = "Resize location out of screen or close button is not visible.";
              zzam((String)localObject5);
            }
            else
            {
              localObject5 = zzn.zzcS();
              localObject8 = this.zzDh;
              int i3 = this.zzoG;
              i3 = ((zza)localObject5).zzb((Context)localObject8, i3);
              localObject5 = zzn.zzcS();
              localObject8 = this.zzDh;
              int i4 = this.zzoH;
              i4 = ((zza)localObject5).zzb((Context)localObject8, i4);
              localObject5 = this.zzpD;
              localObject5 = ((zzjp)localObject5).getView();
              localObject8 = ((View)localObject5).getParent();
              boolean bool6;
              int k;
              if (localObject8 != null)
              {
                bool1 = localObject8 instanceof ViewGroup;
                if (bool1)
                {
                  Object localObject9 = localObject8;
                  localObject9 = (ViewGroup)localObject8;
                  localObject5 = localObject9;
                  Object localObject10 = this.zzpD;
                  localObject10 = ((zzjp)localObject10).getView();
                  ((ViewGroup)localObject9).removeView((View)localObject10);
                  localObject5 = this.zzDl;
                  if (localObject5 == null)
                  {
                    localObject8 = (ViewGroup)localObject8;
                    this.zzDn = ((ViewGroup)localObject8);
                    localObject5 = zzr.zzbC();
                    localObject8 = this.zzpD;
                    localObject8 = ((zzjp)localObject8).getView();
                    localObject5 = ((zzir)localObject5).zzk((View)localObject8);
                    localObject8 = new android/widget/ImageView;
                    localObject10 = this.zzDh;
                    ((ImageView)localObject8).<init>((Context)localObject10);
                    this.zzDi = ((ImageView)localObject8);
                    localObject8 = this.zzDi;
                    ((ImageView)localObject8).setImageBitmap((Bitmap)localObject5);
                    localObject5 = this.zzpD;
                    localObject5 = ((zzjp)localObject5).zzaN();
                    this.zzCh = ((AdSizeParcel)localObject5);
                    localObject5 = this.zzDn;
                    localObject8 = this.zzDi;
                    ((ViewGroup)localObject5).addView((View)localObject8);
                    localObject5 = new android/widget/RelativeLayout;
                    localObject8 = this.zzDh;
                    ((RelativeLayout)localObject5).<init>((Context)localObject8);
                    this.zzDm = ((RelativeLayout)localObject5);
                    localObject5 = this.zzDm;
                    bool6 = false;
                    localObject8 = null;
                    ((RelativeLayout)localObject5).setBackgroundColor(0);
                    localObject5 = this.zzDm;
                    localObject8 = new android/view/ViewGroup$LayoutParams;
                    ((ViewGroup.LayoutParams)localObject8).<init>(i3, i4);
                    ((RelativeLayout)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject8);
                    localObject5 = zzr.zzbC();
                    localObject8 = this.zzDm;
                    int i6 = 0;
                    localObject10 = null;
                    localObject5 = ((zzir)localObject5).zza((View)localObject8, i3, i4, false);
                    this.zzDl = ((PopupWindow)localObject5);
                    localObject5 = this.zzDl;
                    bool6 = true;
                    ((PopupWindow)localObject5).setOutsideTouchable(bool6);
                    localObject5 = this.zzDl;
                    bool6 = true;
                    ((PopupWindow)localObject5).setTouchable(bool6);
                    localObject8 = this.zzDl;
                    bool1 = this.zzDc;
                    if (bool1) {
                      break label1286;
                    }
                    bool1 = j;
                    ((PopupWindow)localObject8).setClippingEnabled(bool1);
                    localObject5 = this.zzDm;
                    localObject8 = this.zzpD;
                    localObject8 = ((zzjp)localObject8).getView();
                    i3 = -1;
                    i4 = -1;
                    ((RelativeLayout)localObject5).addView((View)localObject8, i3, i4);
                    localObject5 = new android/widget/LinearLayout;
                    localObject8 = this.zzDh;
                    ((LinearLayout)localObject5).<init>((Context)localObject8);
                    this.zzDj = ((LinearLayout)localObject5);
                    localObject8 = new android/widget/RelativeLayout$LayoutParams;
                    localObject5 = zzn.zzcS();
                    Object localObject11 = this.zzDh;
                    i4 = 50;
                    k = ((zza)localObject5).zzb((Context)localObject11, i4);
                    localObject11 = zzn.zzcS();
                    Activity localActivity = this.zzDh;
                    i6 = 50;
                    i3 = ((zza)localObject11).zzb(localActivity, i6);
                    ((RelativeLayout.LayoutParams)localObject8).<init>(k, i3);
                    localObject5 = this.zzDb;
                    i3 = ((String)localObject5).hashCode();
                    switch (i3)
                    {
                    default: 
                      k = i;
                      switch (k)
                      {
                      default: 
                        k = 10;
                        ((RelativeLayout.LayoutParams)localObject8).addRule(k);
                        k = 11;
                        ((RelativeLayout.LayoutParams)localObject8).addRule(k);
                      }
                      break;
                    }
                  }
                }
              }
              for (;;)
              {
                localObject5 = this.zzDj;
                localObject1 = new com/google/android/gms/internal/zzfn$1;
                ((zzfn.1)localObject1).<init>(this);
                ((LinearLayout)localObject5).setOnClickListener((View.OnClickListener)localObject1);
                localObject5 = this.zzDj;
                localObject1 = "Close button";
                ((LinearLayout)localObject5).setContentDescription((CharSequence)localObject1);
                localObject5 = this.zzDm;
                localObject1 = this.zzDj;
                ((RelativeLayout)localObject5).addView((View)localObject1, (ViewGroup.LayoutParams)localObject8);
                try
                {
                  localObject5 = this.zzDl;
                  localObject8 = ((Window)localObject7).getDecorView();
                  localObject1 = null;
                  Object localObject12 = zzn.zzcS();
                  localObject13 = this.zzDh;
                  int i7 = 0;
                  localObject7 = null;
                  i7 = arrayOfInt[0];
                  i = ((zza)localObject12).zzb((Context)localObject13, i7);
                  localObject13 = zzn.zzcS();
                  localObject7 = this.zzDh;
                  i3 = 1;
                  i3 = arrayOfInt[i3];
                  j = ((zza)localObject13).zzb((Context)localObject7, i3);
                  ((PopupWindow)localObject5).showAtLocation((View)localObject8, 0, i, j);
                  k = 0;
                  localObject5 = null;
                  k = arrayOfInt[0];
                  bool6 = true;
                  int i5 = arrayOfInt[bool6];
                  zzc(k, i5);
                  localObject5 = this.zzpD;
                  localObject8 = new com/google/android/gms/ads/internal/client/AdSizeParcel;
                  localObject1 = this.zzDh;
                  localObject12 = new com/google/android/gms/ads/AdSize;
                  j = this.zzoG;
                  i7 = this.zzoH;
                  ((AdSize)localObject12).<init>(j, i7);
                  ((AdSizeParcel)localObject8).<init>((Context)localObject1, (AdSize)localObject12);
                  ((zzjp)localObject5).zza((AdSizeParcel)localObject8);
                  k = 0;
                  localObject5 = null;
                  k = arrayOfInt[0];
                  i5 = 1;
                  i5 = arrayOfInt[i5];
                  zzd(k, i5);
                  localObject5 = "resized";
                  zzao((String)localObject5);
                }
                catch (RuntimeException localRuntimeException)
                {
                  Object localObject13;
                  boolean bool2;
                  int m;
                  boolean bool3;
                  int n;
                  boolean bool4;
                  int i1;
                  boolean bool5;
                  int i2;
                  localObject8 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject8).<init>();
                  localObject1 = "Cannot show popup window: ";
                  localObject8 = ((StringBuilder)localObject8).append((String)localObject1);
                  Object localObject6 = localRuntimeException.getMessage();
                  localObject6 = ((StringBuilder)localObject8).append((String)localObject6);
                  localObject6 = ((StringBuilder)localObject6).toString();
                  zzam((String)localObject6);
                  localObject6 = this.zzDm;
                  localObject8 = this.zzpD;
                  localObject8 = ((zzjp)localObject8).getView();
                  ((RelativeLayout)localObject6).removeView((View)localObject8);
                  localObject6 = this.zzDn;
                  if (localObject6 == null) {
                    break label1743;
                  }
                  localObject6 = this.zzDn;
                  localObject8 = this.zzDi;
                  ((ViewGroup)localObject6).removeView((View)localObject8);
                  localObject6 = this.zzDn;
                  localObject8 = this.zzpD;
                  localObject8 = ((zzjp)localObject8).getView();
                  ((ViewGroup)localObject6).addView((View)localObject8);
                  localObject6 = this.zzpD;
                  localObject8 = this.zzCh;
                  ((zzjp)localObject6).zza((AdSizeParcel)localObject8);
                }
                localObject5 = this.zzDl;
                ((PopupWindow)localObject5).dismiss();
                break label534;
                localObject5 = "Webview is detached, probably in the middle of a resize or expand.";
                zzam((String)localObject5);
                break;
                k = 0;
                localObject5 = null;
                break label692;
                localObject13 = "top-left";
                bool2 = ((String)localObject5).equals(localObject13);
                if (!bool2) {
                  break label900;
                }
                bool2 = false;
                localObject5 = null;
                break label903;
                localObject1 = "top-center";
                bool2 = ((String)localObject5).equals(localObject1);
                if (!bool2) {
                  break label900;
                }
                bool2 = j;
                break label903;
                localObject1 = "center";
                bool2 = ((String)localObject5).equals(localObject1);
                if (!bool2) {
                  break label900;
                }
                m = 2;
                break label903;
                localObject1 = "bottom-left";
                bool3 = ((String)localObject5).equals(localObject1);
                if (!bool3) {
                  break label900;
                }
                n = 3;
                break label903;
                localObject1 = "bottom-center";
                bool4 = ((String)localObject5).equals(localObject1);
                if (!bool4) {
                  break label900;
                }
                i1 = 4;
                break label903;
                localObject1 = "bottom-right";
                bool5 = ((String)localObject5).equals(localObject1);
                if (!bool5) {
                  break label900;
                }
                i2 = 5;
                break label903;
                i2 = 10;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                i2 = 9;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                continue;
                i2 = 10;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                i2 = 14;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                continue;
                i2 = 13;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                continue;
                i2 = 12;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                i2 = 9;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                continue;
                i2 = 12;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                i2 = 14;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                continue;
                i2 = 12;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
                i2 = 11;
                ((RelativeLayout.LayoutParams)localObject8).addRule(i2);
              }
            }
          }
        }
      }
    }
  }
  
  public void zzp(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzDl;
      if (localObject2 != null)
      {
        localObject2 = this.zzDl;
        ((PopupWindow)localObject2).dismiss();
        localObject2 = this.zzDm;
        Object localObject4 = this.zzpD;
        localObject4 = ((zzjp)localObject4).getView();
        ((RelativeLayout)localObject2).removeView((View)localObject4);
        localObject2 = this.zzDn;
        if (localObject2 != null)
        {
          localObject2 = this.zzDn;
          localObject4 = this.zzDi;
          ((ViewGroup)localObject2).removeView((View)localObject4);
          localObject2 = this.zzDn;
          localObject4 = this.zzpD;
          localObject4 = ((zzjp)localObject4).getView();
          ((ViewGroup)localObject2).addView((View)localObject4);
          localObject2 = this.zzpD;
          localObject4 = this.zzCh;
          ((zzjp)localObject2).zza((AdSizeParcel)localObject4);
        }
        if (paramBoolean)
        {
          localObject2 = "default";
          zzao((String)localObject2);
          localObject2 = this.zzDk;
          if (localObject2 != null)
          {
            localObject2 = this.zzDk;
            ((zzft)localObject2).zzbf();
          }
        }
        localObject2 = null;
        this.zzDl = null;
        localObject2 = null;
        this.zzDm = null;
        localObject2 = null;
        this.zzDn = null;
        localObject2 = null;
        this.zzDj = null;
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */