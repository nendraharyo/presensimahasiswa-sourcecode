package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import java.lang.ref.WeakReference;

public final class zza$zzc
  extends zza
{
  private WeakReference zzajY;
  
  public zza$zzc(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    super(paramUri, 0);
    zzb.zzv(paramOnImageLoadedListener);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramOnImageLoadedListener);
    this.zzajY = localWeakReference;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    boolean bool3 = paramObject instanceof zzc;
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      if (this != paramObject) {
        break;
      }
      bool2 = bool1;
    }
    paramObject = (zzc)paramObject;
    Object localObject1 = (ImageManager.OnImageLoadedListener)this.zzajY.get();
    Object localObject2 = (ImageManager.OnImageLoadedListener)((zzc)paramObject).zzajY.get();
    if ((localObject2 != null) && (localObject1 != null))
    {
      bool3 = zzw.equal(localObject2, localObject1);
      if (bool3)
      {
        localObject1 = ((zzc)paramObject).zzajO;
        localObject2 = this.zzajO;
        bool3 = zzw.equal(localObject1, localObject2);
        if (bool3) {
          bool3 = bool1;
        }
      }
    }
    for (;;)
    {
      bool2 = bool3;
      break;
      bool3 = false;
      localObject1 = null;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    zza.zza localzza = this.zzajO;
    arrayOfObject[0] = localzza;
    return zzw.hashCode(arrayOfObject);
  }
  
  protected void zza(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (!paramBoolean2)
    {
      ImageManager.OnImageLoadedListener localOnImageLoadedListener = (ImageManager.OnImageLoadedListener)this.zzajY.get();
      if (localOnImageLoadedListener != null)
      {
        Uri localUri = this.zzajO.uri;
        localOnImageLoadedListener.onImageLoaded(localUri, paramDrawable, paramBoolean3);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\zza$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */