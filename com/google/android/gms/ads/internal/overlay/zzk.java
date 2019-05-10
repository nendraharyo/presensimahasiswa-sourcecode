package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzjp;
import java.util.HashMap;

public class zzk
  extends FrameLayout
  implements zzh
{
  private final FrameLayout zzEN;
  private final zzu zzEO;
  private zzi zzEP;
  private boolean zzEQ;
  private boolean zzER;
  private TextView zzES;
  private long zzET;
  private long zzEU;
  private String zzEV;
  private final zzjp zzpD;
  private String zzzK;
  
  public zzk(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz)
  {
    super(paramContext);
    this.zzpD = paramzzjp;
    Object localObject1 = new android/widget/FrameLayout;
    ((FrameLayout)localObject1).<init>(paramContext);
    this.zzEN = ((FrameLayout)localObject1);
    localObject1 = this.zzEN;
    Object localObject2 = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject2).<init>(i, i);
    addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    zzb.zzv(paramzzjp.zzhR());
    localObject1 = paramzzjp.zzhR().zzpx;
    localObject2 = paramContext;
    Object localObject3 = paramzzjp;
    int j = paramInt;
    localObject1 = ((zzj)localObject1).zza(paramContext, paramzzjp, paramInt, paramzzcb, paramzzbz);
    this.zzEP = ((zzi)localObject1);
    localObject1 = this.zzEP;
    if (localObject1 != null)
    {
      localObject1 = this.zzEN;
      localObject2 = this.zzEP;
      localObject3 = new android/widget/FrameLayout$LayoutParams;
      j = 17;
      ((FrameLayout.LayoutParams)localObject3).<init>(i, i, j);
      ((FrameLayout)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
    }
    localObject1 = new android/widget/TextView;
    ((TextView)localObject1).<init>(paramContext);
    this.zzES = ((TextView)localObject1);
    localObject1 = this.zzES;
    int k = -16777216;
    ((TextView)localObject1).setBackgroundColor(k);
    zzfG();
    localObject1 = new com/google/android/gms/ads/internal/overlay/zzu;
    ((zzu)localObject1).<init>(this);
    this.zzEO = ((zzu)localObject1);
    this.zzEO.zzfQ();
    localObject1 = this.zzEP;
    if (localObject1 != null)
    {
      localObject1 = this.zzEP;
      ((zzi)localObject1).zza(this);
    }
    localObject1 = this.zzEP;
    if (localObject1 == null)
    {
      localObject1 = "AdVideoUnderlay Error";
      localObject2 = "Allocating player failed.";
      zzg((String)localObject1, (String)localObject2);
    }
  }
  
  private void zza(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", paramString);
    int i = paramVarArgs.length;
    String str1 = null;
    int j = 0;
    String str2 = null;
    if (j < i)
    {
      str1 = paramVarArgs[j];
      if (str2 == null) {}
      for (;;)
      {
        j += 1;
        str2 = str1;
        break;
        localHashMap.put(str2, str1);
        str1 = null;
      }
    }
    this.zzpD.zza("onVideoEvent", localHashMap);
  }
  
  private void zzfG()
  {
    int i = -1;
    boolean bool = zzfI();
    if (!bool)
    {
      FrameLayout localFrameLayout = this.zzEN;
      TextView localTextView = this.zzES;
      FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
      localLayoutParams.<init>(i, i);
      localFrameLayout.addView(localTextView, localLayoutParams);
      localFrameLayout = this.zzEN;
      localTextView = this.zzES;
      localFrameLayout.bringChildToFront(localTextView);
    }
  }
  
  private void zzfH()
  {
    boolean bool = zzfI();
    if (bool)
    {
      FrameLayout localFrameLayout = this.zzEN;
      TextView localTextView = this.zzES;
      localFrameLayout.removeView(localTextView);
    }
  }
  
  private boolean zzfI()
  {
    ViewParent localViewParent = this.zzES.getParent();
    boolean bool;
    if (localViewParent != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewParent = null;
    }
  }
  
  private void zzfJ()
  {
    int i = 1;
    Object localObject = this.zzpD.zzhP();
    if (localObject == null) {}
    boolean bool1;
    do
    {
      return;
      bool1 = this.zzEQ;
    } while (bool1);
    localObject = this.zzpD.zzhP().getWindow().getAttributes();
    int j = ((WindowManager.LayoutParams)localObject).flags & 0x80;
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      this.zzER = j;
      boolean bool2 = this.zzER;
      if (bool2) {
        break;
      }
      localObject = this.zzpD.zzhP().getWindow();
      int k = 128;
      ((Window)localObject).addFlags(k);
      this.zzEQ = i;
      break;
      bool2 = false;
      localObject = null;
    }
  }
  
  private void zzfK()
  {
    Object localObject = this.zzpD.zzhP();
    if (localObject == null) {}
    for (;;)
    {
      return;
      boolean bool = this.zzEQ;
      if (bool)
      {
        bool = this.zzER;
        if (!bool)
        {
          localObject = this.zzpD.zzhP().getWindow();
          int i = 128;
          ((Window)localObject).clearFlags(i);
          bool = false;
          localObject = null;
          this.zzEQ = false;
        }
      }
    }
  }
  
  public static void zzg(zzjp paramzzjp)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "no_video_view");
    paramzzjp.zza("onVideoEvent", localHashMap);
  }
  
  public void destroy()
  {
    this.zzEO.cancel();
    zzi localzzi = this.zzEP;
    if (localzzi != null)
    {
      localzzi = this.zzEP;
      localzzi.stop();
    }
    zzfK();
  }
  
  public void onPaused()
  {
    String[] arrayOfString = new String[0];
    zza("pause", arrayOfString);
    zzfK();
  }
  
  public void pause()
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      localzzi.pause();
    }
  }
  
  public void play()
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      localzzi.play();
    }
  }
  
  public void seekTo(int paramInt)
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      localzzi.seekTo(paramInt);
    }
  }
  
  public void setMimeType(String paramString)
  {
    this.zzEV = paramString;
  }
  
  public void zza(float paramFloat)
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      localzzi.zza(paramFloat);
    }
  }
  
  public void zzap(String paramString)
  {
    this.zzzK = paramString;
  }
  
  public void zzd(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {}
    for (;;)
    {
      return;
      FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
      int i = paramInt3 + 2;
      int j = paramInt4 + 2;
      localLayoutParams.<init>(i, j);
      i = paramInt1 + -1;
      j = paramInt2 + -1;
      localLayoutParams.setMargins(i, j, 0, 0);
      FrameLayout localFrameLayout = this.zzEN;
      localFrameLayout.setLayoutParams(localLayoutParams);
      requestLayout();
    }
  }
  
  public void zzd(MotionEvent paramMotionEvent)
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      localzzi.dispatchTouchEvent(paramMotionEvent);
    }
  }
  
  public void zzfA()
  {
    zzfJ();
  }
  
  public void zzfB()
  {
    String[] arrayOfString = new String[0];
    zza("ended", arrayOfString);
    zzfK();
  }
  
  public void zzfC()
  {
    zzfG();
    long l = this.zzET;
    this.zzEU = l;
  }
  
  public void zzfD()
  {
    Object localObject1 = this.zzEP;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.zzzK;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      Object localObject2;
      if (!bool)
      {
        localObject1 = this.zzEP;
        localObject2 = this.zzEV;
        ((zzi)localObject1).setMimeType((String)localObject2);
        localObject1 = this.zzEP;
        localObject2 = this.zzzK;
        ((zzi)localObject1).setVideoPath((String)localObject2);
      }
      else
      {
        localObject1 = "no_src";
        localObject2 = new String[0];
        zza((String)localObject1, (String[])localObject2);
      }
    }
  }
  
  public void zzfE()
  {
    int i = -2;
    Object localObject1 = this.zzEP;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.zzEP.getContext();
      TextView localTextView = new android/widget/TextView;
      localTextView.<init>((Context)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("AdMob - ");
      Object localObject2 = this.zzEP.zzeZ();
      localObject1 = (String)localObject2;
      localTextView.setText((CharSequence)localObject1);
      localTextView.setTextColor(-65536);
      int j = 65280;
      localTextView.setBackgroundColor(j);
      localObject1 = this.zzEN;
      localObject2 = new android/widget/FrameLayout$LayoutParams;
      int k = 17;
      ((FrameLayout.LayoutParams)localObject2).<init>(i, i, k);
      ((FrameLayout)localObject1).addView(localTextView, (ViewGroup.LayoutParams)localObject2);
      localObject1 = this.zzEN;
      ((FrameLayout)localObject1).bringChildToFront(localTextView);
    }
  }
  
  void zzfF()
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      int i = localzzi.getCurrentPosition();
      long l1 = i;
      long l2 = this.zzET;
      boolean bool = l2 < l1;
      if (bool)
      {
        l2 = 0L;
        bool = l1 < l2;
        if (bool)
        {
          zzfH();
          float f1 = (float)l1;
          float f2 = 1000.0F;
          f1 /= f2;
          String str1 = "timeupdate";
          int j = 2;
          String[] arrayOfString = new String[j];
          String str2 = "time";
          arrayOfString[0] = str2;
          int k = 1;
          String str3 = String.valueOf(f1);
          arrayOfString[k] = str3;
          zza(str1, arrayOfString);
          this.zzET = l1;
        }
      }
    }
  }
  
  public void zzff()
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      localzzi.zzff();
    }
  }
  
  public void zzfg()
  {
    zzi localzzi = this.zzEP;
    if (localzzi == null) {}
    for (;;)
    {
      return;
      localzzi = this.zzEP;
      localzzi.zzfg();
    }
  }
  
  public void zzfy() {}
  
  public void zzfz()
  {
    Object localObject = this.zzEP;
    if (localObject == null) {}
    for (;;)
    {
      return;
      long l1 = this.zzEU;
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (!bool)
      {
        float f1 = this.zzEP.getDuration();
        float f2 = 1000.0F;
        f1 /= f2;
        int j = this.zzEP.getVideoWidth();
        zzi localzzi = this.zzEP;
        int k = localzzi.getVideoHeight();
        String str1 = "canplaythrough";
        int m = 6;
        String[] arrayOfString = new String[m];
        String str2 = "duration";
        arrayOfString[0] = str2;
        int n = 1;
        localObject = String.valueOf(f1);
        arrayOfString[n] = localObject;
        String str3 = "videoWidth";
        arrayOfString[2] = str3;
        String str4 = String.valueOf(j);
        arrayOfString[3] = str4;
        arrayOfString[4] = "videoHeight";
        int i = 5;
        f1 = 7.0E-45F;
        str4 = String.valueOf(k);
        arrayOfString[i] = str4;
        zza(str1, arrayOfString);
      }
    }
  }
  
  public void zzg(String paramString1, String paramString2)
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "what";
    arrayOfString[1] = paramString1;
    arrayOfString[2] = "extra";
    arrayOfString[3] = paramString2;
    zza("error", arrayOfString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */