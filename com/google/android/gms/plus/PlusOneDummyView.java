package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class PlusOneDummyView
  extends FrameLayout
{
  public static final String TAG = "PlusOneDummyView";
  
  public PlusOneDummyView(Context paramContext, int paramInt)
  {
    super(paramContext);
    Button localButton = new android/widget/Button;
    localButton.<init>(paramContext);
    localButton.setEnabled(false);
    Object localObject = zzEX().getDrawable(paramInt);
    localButton.setBackgroundDrawable((Drawable)localObject);
    localObject = zzjG(paramInt);
    FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
    int i = ((Point)localObject).x;
    int j = ((Point)localObject).y;
    localLayoutParams.<init>(i, j, 17);
    addView(localButton, localLayoutParams);
  }
  
  private PlusOneDummyView.zzd zzEX()
  {
    Object localObject = new com/google/android/gms/plus/PlusOneDummyView$zzb;
    Context localContext = getContext();
    ((PlusOneDummyView.zzb)localObject).<init>(localContext, null);
    boolean bool = ((PlusOneDummyView.zzd)localObject).isValid();
    if (!bool)
    {
      localObject = new com/google/android/gms/plus/PlusOneDummyView$zzc;
      localContext = getContext();
      ((PlusOneDummyView.zzc)localObject).<init>(localContext, null);
    }
    bool = ((PlusOneDummyView.zzd)localObject).isValid();
    if (!bool)
    {
      localObject = new com/google/android/gms/plus/PlusOneDummyView$zza;
      localContext = getContext();
      ((PlusOneDummyView.zza)localObject).<init>(localContext, null);
    }
    return (PlusOneDummyView.zzd)localObject;
  }
  
  private Point zzjG(int paramInt)
  {
    int i = 24;
    float f1 = 3.4E-44F;
    int j = 20;
    float f2 = 2.8E-44F;
    int k = 1;
    double d = 0.5D;
    Point localPoint = new android/graphics/Point;
    localPoint.<init>();
    switch (paramInt)
    {
    default: 
      int m = i;
      float f3 = f1;
      i = 38;
      f1 = 5.3E-44F;
      j = m;
      f2 = f3;
    }
    for (;;)
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      f1 = i;
      f1 = TypedValue.applyDimension(k, f1, localDisplayMetrics);
      f2 = j;
      f2 = TypedValue.applyDimension(k, f2, localDisplayMetrics);
      i = (int)(f1 + d);
      localPoint.x = i;
      j = (int)(f2 + d);
      localPoint.y = j;
      return localPoint;
      i = 32;
      f1 = 4.5E-44F;
      continue;
      j = 14;
      f2 = 2.0E-44F;
      continue;
      i = 50;
      f1 = 7.0E-44F;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\PlusOneDummyView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */