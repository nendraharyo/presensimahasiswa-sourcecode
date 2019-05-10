package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzis;
import java.util.Iterator;
import java.util.List;

class zzb
  extends RelativeLayout
{
  private static final float[] zzxR;
  private final RelativeLayout zzxS;
  private AnimationDrawable zzxT;
  
  static
  {
    float[] arrayOfFloat = new float[8];
    arrayOfFloat[0] = 5.0F;
    arrayOfFloat[1] = 5.0F;
    arrayOfFloat[2] = 5.0F;
    arrayOfFloat[3] = 5.0F;
    arrayOfFloat[4] = 5.0F;
    arrayOfFloat[5] = 5.0F;
    arrayOfFloat[6] = 5.0F;
    arrayOfFloat[7] = 5.0F;
    zzxR = arrayOfFloat;
  }
  
  public zzb(Context paramContext, zza paramzza)
  {
    super(paramContext);
    zzx.zzz(paramzza);
    Object localObject1 = new android/widget/RelativeLayout$LayoutParams;
    ((RelativeLayout.LayoutParams)localObject1).<init>(k, k);
    ((RelativeLayout.LayoutParams)localObject1).addRule(10);
    float f = 1.5E-44F;
    ((RelativeLayout.LayoutParams)localObject1).addRule(11);
    Object localObject2 = new android/graphics/drawable/ShapeDrawable;
    Object localObject3 = new android/graphics/drawable/shapes/RoundRectShape;
    Object localObject4 = zzxR;
    ((RoundRectShape)localObject3).<init>((float[])localObject4, null, null);
    ((ShapeDrawable)localObject2).<init>((Shape)localObject3);
    localObject3 = ((ShapeDrawable)localObject2).getPaint();
    int m = paramzza.getBackgroundColor();
    ((Paint)localObject3).setColor(m);
    localObject3 = new android/widget/RelativeLayout;
    ((RelativeLayout)localObject3).<init>(paramContext);
    this.zzxS = ((RelativeLayout)localObject3);
    this.zzxS.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localObject1 = zzr.zzbE();
    localObject3 = this.zzxS;
    ((zzis)localObject1).zza((View)localObject3, (Drawable)localObject2);
    localObject1 = new android/widget/RelativeLayout$LayoutParams;
    ((RelativeLayout.LayoutParams)localObject1).<init>(k, k);
    localObject2 = paramzza.getText();
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool1)
    {
      localObject2 = new android/widget/RelativeLayout$LayoutParams;
      ((RelativeLayout.LayoutParams)localObject2).<init>(k, k);
      localObject3 = new android/widget/TextView;
      ((TextView)localObject3).<init>(paramContext);
      ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((TextView)localObject3).setId(1195835393);
      localObject2 = Typeface.DEFAULT;
      ((TextView)localObject3).setTypeface((Typeface)localObject2);
      localObject2 = paramzza.getText();
      ((TextView)localObject3).setText((CharSequence)localObject2);
      int n = paramzza.getTextColor();
      ((TextView)localObject3).setTextColor(n);
      f = paramzza.getTextSize();
      ((TextView)localObject3).setTextSize(f);
      n = zzn.zzcS().zzb(paramContext, i);
      localObject4 = zzn.zzcS();
      m = ((com.google.android.gms.ads.internal.util.client.zza)localObject4).zzb(paramContext, i);
      ((TextView)localObject3).setPadding(n, 0, m, 0);
      localObject2 = this.zzxS;
      ((RelativeLayout)localObject2).addView((View)localObject3);
      n = ((TextView)localObject3).getId();
      ((RelativeLayout.LayoutParams)localObject1).addRule(j, n);
    }
    localObject2 = new android/widget/ImageView;
    ((ImageView)localObject2).<init>(paramContext);
    ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    int i1 = 1195835394;
    ((ImageView)localObject2).setId(i1);
    localObject1 = paramzza.zzdG();
    int i2 = ((List)localObject1).size();
    if (i2 > j)
    {
      localObject3 = new android/graphics/drawable/AnimationDrawable;
      ((AnimationDrawable)localObject3).<init>();
      this.zzxT = ((AnimationDrawable)localObject3);
      localObject3 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (Drawable)((Iterator)localObject3).next();
        localObject4 = this.zzxT;
        k = paramzza.zzdH();
        ((AnimationDrawable)localObject4).addFrame((Drawable)localObject1, k);
      }
      localObject1 = zzr.zzbE();
      localObject3 = this.zzxT;
      ((zzis)localObject1).zza((View)localObject2, (Drawable)localObject3);
    }
    for (;;)
    {
      this.zzxS.addView((View)localObject2);
      localObject1 = this.zzxS;
      addView((View)localObject1);
      return;
      i2 = ((List)localObject1).size();
      if (i2 == j)
      {
        localObject1 = (Drawable)((List)localObject1).get(0);
        ((ImageView)localObject2).setImageDrawable((Drawable)localObject1);
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    AnimationDrawable localAnimationDrawable = this.zzxT;
    if (localAnimationDrawable != null)
    {
      localAnimationDrawable = this.zzxT;
      localAnimationDrawable.start();
    }
    super.onAttachedToWindow();
  }
  
  public ViewGroup zzdI()
  {
    return this.zzxS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */