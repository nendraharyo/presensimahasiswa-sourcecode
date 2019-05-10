package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zziu
{
  private final Context mContext;
  private int mState = 0;
  private final float zzDB;
  private String zzMh;
  private float zzMi;
  private float zzMj;
  private float zzMk;
  
  public zziu(Context paramContext)
  {
    this.mContext = paramContext;
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.zzDB = f;
  }
  
  public zziu(Context paramContext, String paramString)
  {
    this(paramContext);
    this.zzMh = paramString;
  }
  
  private void showDialog()
  {
    Object localObject1 = this.mContext;
    boolean bool = localObject1 instanceof Activity;
    if (!bool)
    {
      localObject1 = "Can not create dialog without Activity Context";
      zzin.zzaJ((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = zzaG(this.zzMh);
      AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
      Object localObject2 = this.mContext;
      localBuilder.<init>((Context)localObject2);
      localBuilder.setMessage((CharSequence)localObject1);
      localBuilder.setTitle("Ad Information");
      zziu.1 local1 = new com/google/android/gms/internal/zziu$1;
      local1.<init>(this, (String)localObject1);
      localBuilder.setPositiveButton("Share", local1);
      localObject2 = new com/google/android/gms/internal/zziu$2;
      ((zziu.2)localObject2).<init>(this);
      localBuilder.setNegativeButton("Close", (DialogInterface.OnClickListener)localObject2);
      localObject1 = localBuilder.create();
      ((AlertDialog)localObject1).show();
    }
  }
  
  static String zzaG(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    Object localObject1;
    if (bool1) {
      localObject1 = "No debug information";
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = paramString.replaceAll("\\+", "%20");
      Object localObject2 = new android/net/Uri$Builder;
      ((Uri.Builder)localObject2).<init>();
      localObject1 = ((Uri.Builder)localObject2).encodedQuery((String)localObject1).build();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Map localMap = zzr.zzbC().zze((Uri)localObject1);
      localObject1 = localMap.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)localIterator.next();
        Object localObject3 = ((StringBuilder)localObject2).append((String)localObject1);
        String str = " = ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject1 = (String)localMap.get(localObject1);
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = "\n\n";
        ((StringBuilder)localObject1).append((String)localObject3);
      }
      localObject1 = ((StringBuilder)localObject2).toString().trim();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool2) {
        localObject1 = "No debug information";
      }
    }
  }
  
  void zza(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = 3;
    int j = -1;
    int k = 2;
    int m = 1;
    int n;
    float f1;
    if (paramInt == 0)
    {
      n = 0;
      f1 = 0.0F;
      this.mState = 0;
      this.zzMi = paramFloat1;
      this.zzMj = paramFloat2;
      this.zzMk = paramFloat2;
    }
    for (;;)
    {
      return;
      n = this.mState;
      if (n != j)
      {
        float f2;
        int i6;
        if (paramInt == k)
        {
          f1 = this.zzMj;
          boolean bool1 = paramFloat2 < f1;
          if (bool1) {
            this.zzMj = paramFloat2;
          }
          float f3;
          for (;;)
          {
            f1 = this.zzMj;
            f2 = this.zzMk;
            f1 -= f2;
            i6 = 1106247680;
            f3 = this.zzDB;
            f2 = 30.0F * f3;
            bool1 = f1 < f2;
            if (!bool1) {
              break label166;
            }
            this.mState = j;
            break;
            f1 = this.zzMk;
            bool1 = paramFloat2 < f1;
            if (bool1) {
              this.zzMk = paramFloat2;
            }
          }
          label166:
          int i1 = this.mState;
          int i2;
          if (i1 != 0)
          {
            i1 = this.mState;
            if (i1 != k) {}
          }
          else
          {
            f1 = this.zzMi;
            f1 = paramFloat1 - f1;
            i6 = 1112014848;
            f3 = this.zzDB;
            f2 = 50.0F * f3;
            boolean bool2 = f1 < f2;
            if (!bool2)
            {
              this.zzMi = paramFloat1;
              i2 = this.mState + 1;
              this.mState = i2;
            }
          }
          for (;;)
          {
            i2 = this.mState;
            if (i2 != m)
            {
              i2 = this.mState;
              if (i2 != i) {
                break label390;
              }
            }
            f1 = this.zzMi;
            boolean bool3 = paramFloat1 < f1;
            if (!bool3) {
              break;
            }
            this.zzMi = paramFloat1;
            break;
            int i3 = this.mState;
            if (i3 != m)
            {
              i3 = this.mState;
              if (i3 != i) {}
            }
            else
            {
              f1 = this.zzMi;
              f1 = paramFloat1 - f1;
              i6 = -1035468800;
              f3 = this.zzDB;
              f2 = -50.0F * f3;
              boolean bool4 = f1 < f2;
              if (!bool4)
              {
                this.zzMi = paramFloat1;
                i4 = this.mState + 1;
                this.mState = i4;
              }
            }
          }
          label390:
          int i4 = this.mState;
          if (i4 == k)
          {
            f1 = this.zzMi;
            boolean bool5 = paramFloat1 < f1;
            if (bool5) {
              this.zzMi = paramFloat1;
            }
          }
        }
        else if (paramInt == m)
        {
          int i5 = this.mState;
          i6 = 4;
          f2 = 5.6E-45F;
          if (i5 == i6) {
            showDialog();
          }
        }
      }
    }
  }
  
  public void zzaF(String paramString)
  {
    this.zzMh = paramString;
  }
  
  public void zze(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    int i = paramMotionEvent.getHistorySize();
    int j = 0;
    while (j < i)
    {
      int k = paramMotionEvent.getActionMasked();
      float f2 = paramMotionEvent.getHistoricalX(0, j);
      float f3 = paramMotionEvent.getHistoricalY(0, j);
      zza(k, f2, f3);
      j += 1;
    }
    j = paramMotionEvent.getActionMasked();
    f1 = paramMotionEvent.getX();
    float f4 = paramMotionEvent.getY();
    zza(j, f1, f4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */