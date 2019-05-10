package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.webkit.WebSettings;

public class zzis$zzd
  extends zzis.zzf
{
  public String getDefaultUserAgent(Context paramContext)
  {
    return WebSettings.getDefaultUserAgent(paramContext);
  }
  
  public Drawable zza(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    if (paramBoolean)
    {
      float f = 0.0F;
      localObject1 = null;
      boolean bool = paramFloat < 0.0F;
      if (bool)
      {
        f = 25.0F;
        bool = paramFloat < f;
        if (!bool) {
          break label59;
        }
      }
    }
    Object localObject1 = new android/graphics/drawable/BitmapDrawable;
    Object localObject2 = paramContext.getResources();
    ((BitmapDrawable)localObject1).<init>((Resources)localObject2, paramBitmap);
    for (;;)
    {
      return (Drawable)localObject1;
      try
      {
        label59:
        int i = paramBitmap.getWidth();
        int j = paramBitmap.getHeight();
        Object localObject3 = null;
        localObject1 = Bitmap.createScaledBitmap(paramBitmap, i, j, false);
        localObject2 = Bitmap.createBitmap((Bitmap)localObject1);
        localObject3 = RenderScript.create(paramContext);
        Object localObject4 = Element.U8_4((RenderScript)localObject3);
        localObject4 = ScriptIntrinsicBlur.create((RenderScript)localObject3, (Element)localObject4);
        localObject1 = Allocation.createFromBitmap((RenderScript)localObject3, (Bitmap)localObject1);
        localObject3 = Allocation.createFromBitmap((RenderScript)localObject3, (Bitmap)localObject2);
        ((ScriptIntrinsicBlur)localObject4).setRadius(paramFloat);
        ((ScriptIntrinsicBlur)localObject4).setInput((Allocation)localObject1);
        ((ScriptIntrinsicBlur)localObject4).forEach((Allocation)localObject3);
        ((Allocation)localObject3).copyTo((Bitmap)localObject2);
        localObject1 = new android/graphics/drawable/BitmapDrawable;
        localObject3 = paramContext.getResources();
        ((BitmapDrawable)localObject1).<init>((Resources)localObject3, (Bitmap)localObject2);
      }
      catch (RuntimeException localRuntimeException)
      {
        BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
        localObject2 = paramContext.getResources();
        localBitmapDrawable.<init>((Resources)localObject2, paramBitmap);
      }
    }
  }
  
  public boolean zza(Context paramContext, WebSettings paramWebSettings)
  {
    super.zza(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzis$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */