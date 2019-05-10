package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzma;
import com.google.android.gms.internal.zzmc;
import java.lang.ref.WeakReference;

public final class zza$zzb
  extends zza
{
  private WeakReference zzajX;
  
  public zza$zzb(ImageView paramImageView, int paramInt)
  {
    super(null, paramInt);
    zzb.zzv(paramImageView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramImageView);
    this.zzajX = localWeakReference;
  }
  
  public zza$zzb(ImageView paramImageView, Uri paramUri)
  {
    super(paramUri, 0);
    zzb.zzv(paramImageView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramImageView);
    this.zzajX = localWeakReference;
  }
  
  private void zza(ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool1;
    if ((!paramBoolean2) && (!paramBoolean3)) {
      bool1 = true;
    }
    for (boolean bool3 = bool1; bool3; bool3 = false)
    {
      bool1 = paramImageView instanceof zzmc;
      if (!bool1) {
        break;
      }
      localObject1 = paramImageView;
      localObject1 = (zzmc)paramImageView;
      int i = ((zzmc)localObject1).zzqp();
      int j = this.zzajQ;
      if (j == 0) {
        break;
      }
      j = this.zzajQ;
      if (i != j) {
        break;
      }
      return;
    }
    boolean bool5 = zzb(paramBoolean1, paramBoolean2);
    boolean bool2 = this.zzajR;
    if ((bool2) && (paramDrawable != null)) {
      paramDrawable = paramDrawable.getConstantState().newDrawable();
    }
    for (Object localObject1 = paramDrawable;; localObject1 = paramDrawable)
    {
      Object localObject2;
      if (bool5)
      {
        localObject2 = ((ImageView)paramImageView).getDrawable();
        localObject1 = zza((Drawable)localObject2, (Drawable)localObject1);
      }
      ((ImageView)paramImageView).setImageDrawable((Drawable)localObject1);
      boolean bool4 = paramImageView instanceof zzmc;
      label178:
      int k;
      if (bool4)
      {
        paramImageView = (zzmc)paramImageView;
        if (!paramBoolean3) {
          break label228;
        }
        localObject2 = this.zzajO.uri;
        paramImageView.zzm((Uri)localObject2);
        if (!bool3) {
          break label237;
        }
        k = this.zzajQ;
      }
      for (;;)
      {
        paramImageView.zzbO(k);
        if (!bool5) {
          break;
        }
        localObject1 = (zzma)localObject1;
        k = 250;
        ((zzma)localObject1).startTransition(k);
        break;
        label228:
        k = 0;
        localObject2 = null;
        break label178;
        label237:
        k = 0;
        localObject2 = null;
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    boolean bool3 = paramObject instanceof zzb;
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      if (this != paramObject) {
        break;
      }
      bool2 = bool1;
    }
    paramObject = (zzb)paramObject;
    ImageView localImageView1 = (ImageView)this.zzajX.get();
    ImageView localImageView2 = (ImageView)((zzb)paramObject).zzajX.get();
    if ((localImageView2 != null) && (localImageView1 != null))
    {
      bool3 = zzw.equal(localImageView2, localImageView1);
      if (bool3) {
        bool3 = bool1;
      }
    }
    for (;;)
    {
      bool2 = bool3;
      break;
      bool3 = false;
      localImageView1 = null;
    }
  }
  
  public int hashCode()
  {
    return 0;
  }
  
  protected void zza(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject = this.zzajX;
    ImageView localImageView = (ImageView)((WeakReference)localObject).get();
    if (localImageView != null)
    {
      localObject = this;
      zza(localImageView, paramDrawable, paramBoolean1, paramBoolean2, paramBoolean3);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\zza$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */