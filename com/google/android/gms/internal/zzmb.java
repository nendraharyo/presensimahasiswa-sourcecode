package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class zzmb
{
  private static Bitmap zza(Drawable paramDrawable)
  {
    boolean bool;
    Bitmap localBitmap;
    if (paramDrawable == null)
    {
      bool = false;
      localBitmap = null;
    }
    for (;;)
    {
      return localBitmap;
      bool = paramDrawable instanceof BitmapDrawable;
      if (bool)
      {
        paramDrawable = (BitmapDrawable)paramDrawable;
        localBitmap = paramDrawable.getBitmap();
      }
      else
      {
        int i = paramDrawable.getIntrinsicWidth();
        int j = paramDrawable.getIntrinsicHeight();
        Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
        localBitmap = Bitmap.createBitmap(i, j, localConfig);
        Canvas localCanvas = new android/graphics/Canvas;
        localCanvas.<init>(localBitmap);
        int k = localCanvas.getWidth();
        int m = localCanvas.getHeight();
        paramDrawable.setBounds(0, 0, k, m);
        paramDrawable.draw(localCanvas);
      }
    }
  }
  
  public static Drawable zza(Resources paramResources, Drawable paramDrawable)
  {
    Bitmap localBitmap = zzb(zza(paramDrawable));
    BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
    localBitmapDrawable.<init>(paramResources, localBitmap);
    return localBitmapDrawable;
  }
  
  public static Bitmap zzb(Bitmap paramBitmap)
  {
    int i = 0;
    float f1;
    Object localObject1;
    if (paramBitmap == null)
    {
      j = 0;
      f1 = 0.0F;
      localObject1 = null;
      return (Bitmap)localObject1;
    }
    int k = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int m;
    float f2;
    if (k >= j)
    {
      k = (j - k) / 2;
      m = 0;
      i = k;
      k = 0;
      f2 = 0.0F;
    }
    for (;;)
    {
      Object localObject2 = Bitmap.Config.ARGB_8888;
      localObject2 = Bitmap.createBitmap(j, j, (Bitmap.Config)localObject2);
      Canvas localCanvas = new android/graphics/Canvas;
      localCanvas.<init>((Bitmap)localObject2);
      Paint localPaint = new android/graphics/Paint;
      localPaint.<init>(1);
      localPaint.setColor(-16777216);
      int n = j / 2;
      float f3 = n;
      int i1 = j / 2;
      float f4 = i1;
      j /= 2;
      f1 = j;
      localCanvas.drawCircle(f3, f4, f1, localPaint);
      localObject1 = new android/graphics/PorterDuffXfermode;
      PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
      ((PorterDuffXfermode)localObject1).<init>(localMode);
      localPaint.setXfermode((Xfermode)localObject1);
      f1 = i;
      f2 = k;
      localCanvas.drawBitmap(paramBitmap, f1, f2, localPaint);
      localObject1 = localObject2;
      break;
      j = (k - j) / 2;
      m = k;
      k = j;
      j = m;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */