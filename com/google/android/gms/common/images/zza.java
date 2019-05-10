package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzma;
import com.google.android.gms.internal.zzmb;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzmd.zza;

public abstract class zza
{
  final zza.zza zzajO;
  protected int zzajP = 0;
  protected int zzajQ = 0;
  protected boolean zzajR = false;
  protected ImageManager.OnImageLoadedListener zzajS;
  private boolean zzajT;
  private boolean zzajU;
  private boolean zzajV;
  protected int zzajW;
  
  public zza(Uri paramUri, int paramInt)
  {
    this.zzajT = bool;
    this.zzajU = false;
    this.zzajV = bool;
    zza.zza localzza = new com/google/android/gms/common/images/zza$zza;
    localzza.<init>(paramUri);
    this.zzajO = localzza;
    this.zzajQ = paramInt;
  }
  
  private Drawable zza(Context paramContext, zzmd paramzzmd, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    int i = this.zzajW;
    Drawable localDrawable;
    if (i > 0)
    {
      zzmd.zza localzza = new com/google/android/gms/internal/zzmd$zza;
      i = this.zzajW;
      localzza.<init>(paramInt, i);
      localDrawable = (Drawable)paramzzmd.get(localzza);
      if (localDrawable == null)
      {
        localDrawable = localResources.getDrawable(paramInt);
        int j = this.zzajW & 0x1;
        if (j != 0) {
          localDrawable = zza(localResources, localDrawable);
        }
        paramzzmd.put(localzza, localDrawable);
      }
    }
    for (;;)
    {
      return localDrawable;
      localDrawable = localResources.getDrawable(paramInt);
    }
  }
  
  protected Drawable zza(Resources paramResources, Drawable paramDrawable)
  {
    return zzmb.zza(paramResources, paramDrawable);
  }
  
  protected zzma zza(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    boolean bool = false;
    zzma localzzma = null;
    if (paramDrawable1 != null)
    {
      bool = paramDrawable1 instanceof zzma;
      if (!bool) {}
    }
    for (paramDrawable1 = ((zzma)paramDrawable1).zzqn();; paramDrawable1 = null)
    {
      localzzma = new com/google/android/gms/internal/zzma;
      localzzma.<init>(paramDrawable1, paramDrawable2);
      return localzzma;
    }
  }
  
  void zza(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    boolean bool = true;
    zzb.zzv(paramBitmap);
    int i = this.zzajW & 0x1;
    if (i != 0) {
      paramBitmap = zzmb.zzb(paramBitmap);
    }
    BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
    Object localObject = paramContext.getResources();
    localBitmapDrawable.<init>((Resources)localObject, paramBitmap);
    localObject = this.zzajS;
    if (localObject != null)
    {
      localObject = this.zzajS;
      Uri localUri = this.zzajO.uri;
      ((ImageManager.OnImageLoadedListener)localObject).onImageLoaded(localUri, localBitmapDrawable, bool);
    }
    zza(localBitmapDrawable, paramBoolean, false, bool);
  }
  
  void zza(Context paramContext, zzmd paramzzmd)
  {
    boolean bool = this.zzajV;
    if (bool)
    {
      bool = false;
      Drawable localDrawable = null;
      int j = this.zzajP;
      if (j != 0)
      {
        int i = this.zzajP;
        localDrawable = zza(paramContext, paramzzmd, i);
      }
      j = 1;
      zza(localDrawable, false, j, false);
    }
  }
  
  void zza(Context paramContext, zzmd paramzzmd, boolean paramBoolean)
  {
    int i = 0;
    Drawable localDrawable = null;
    int j = this.zzajQ;
    if (j != 0)
    {
      i = this.zzajQ;
      localDrawable = zza(paramContext, paramzzmd, i);
    }
    ImageManager.OnImageLoadedListener localOnImageLoadedListener = this.zzajS;
    if (localOnImageLoadedListener != null)
    {
      localOnImageLoadedListener = this.zzajS;
      Uri localUri = this.zzajO.uri;
      localOnImageLoadedListener.onImageLoaded(localUri, localDrawable, false);
    }
    zza(localDrawable, paramBoolean, false, false);
  }
  
  protected abstract void zza(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  
  protected boolean zzb(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.zzajT;
    if ((bool) && (!paramBoolean2)) {
      if (paramBoolean1)
      {
        bool = this.zzajU;
        if (!bool) {
          break label30;
        }
      }
    }
    label30:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void zzbM(int paramInt)
  {
    this.zzajQ = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */