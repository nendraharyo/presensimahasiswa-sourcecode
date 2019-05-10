package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzne;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static HashSet zzajA;
  private static ImageManager zzajB;
  private static ImageManager zzajC;
  private static final Object zzajz;
  private final Context mContext;
  private final Handler mHandler;
  private final ExecutorService zzajD;
  private final ImageManager.zzb zzajE;
  private final zzmd zzajF;
  private final Map zzajG;
  private final Map zzajH;
  private final Map zzajI;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzajz = localObject;
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    zzajA = (HashSet)localObject;
  }
  
  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    Object localObject1 = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject1);
    localObject1 = new android/os/Handler;
    Object localObject2 = Looper.getMainLooper();
    ((Handler)localObject1).<init>((Looper)localObject2);
    this.mHandler = ((Handler)localObject1);
    int i = 4;
    localObject1 = Executors.newFixedThreadPool(i);
    this.zzajD = ((ExecutorService)localObject1);
    boolean bool;
    if (paramBoolean)
    {
      localObject1 = new com/google/android/gms/common/images/ImageManager$zzb;
      localObject2 = this.mContext;
      ((ImageManager.zzb)localObject1).<init>((Context)localObject2);
      this.zzajE = ((ImageManager.zzb)localObject1);
      bool = zzne.zzsg();
      if (bool) {
        zzqj();
      }
    }
    for (;;)
    {
      localObject1 = new com/google/android/gms/internal/zzmd;
      ((zzmd)localObject1).<init>();
      this.zzajF = ((zzmd)localObject1);
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.zzajG = ((Map)localObject1);
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.zzajH = ((Map)localObject1);
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.zzajI = ((Map)localObject1);
      return;
      bool = false;
      localObject1 = null;
      this.zzajE = null;
    }
  }
  
  public static ImageManager create(Context paramContext)
  {
    return zzc(paramContext, false);
  }
  
  private Bitmap zza(zza.zza paramzza)
  {
    Object localObject = this.zzajE;
    if (localObject == null) {}
    for (localObject = null;; localObject = (Bitmap)this.zzajE.get(paramzza)) {
      return (Bitmap)localObject;
    }
  }
  
  public static ImageManager zzc(Context paramContext, boolean paramBoolean)
  {
    boolean bool;
    if (paramBoolean)
    {
      localImageManager = zzajC;
      if (localImageManager == null)
      {
        localImageManager = new com/google/android/gms/common/images/ImageManager;
        bool = true;
        localImageManager.<init>(paramContext, bool);
        zzajC = localImageManager;
      }
    }
    for (ImageManager localImageManager = zzajC;; localImageManager = zzajB)
    {
      return localImageManager;
      localImageManager = zzajB;
      if (localImageManager == null)
      {
        localImageManager = new com/google/android/gms/common/images/ImageManager;
        bool = false;
        localImageManager.<init>(paramContext, false);
        zzajB = localImageManager;
      }
    }
  }
  
  private void zzqj()
  {
    Context localContext = this.mContext;
    ImageManager.zze localzze = new com/google/android/gms/common/images/ImageManager$zze;
    ImageManager.zzb localzzb = this.zzajE;
    localzze.<init>(localzzb);
    localContext.registerComponentCallbacks(localzze);
  }
  
  public void loadImage(ImageView paramImageView, int paramInt)
  {
    zza.zzb localzzb = new com/google/android/gms/common/images/zza$zzb;
    localzzb.<init>(paramImageView, paramInt);
    zza(localzzb);
  }
  
  public void loadImage(ImageView paramImageView, Uri paramUri)
  {
    zza.zzb localzzb = new com/google/android/gms/common/images/zza$zzb;
    localzzb.<init>(paramImageView, paramUri);
    zza(localzzb);
  }
  
  public void loadImage(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    zza.zzb localzzb = new com/google/android/gms/common/images/zza$zzb;
    localzzb.<init>(paramImageView, paramUri);
    localzzb.zzbM(paramInt);
    zza(localzzb);
  }
  
  public void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    zza.zzc localzzc = new com/google/android/gms/common/images/zza$zzc;
    localzzc.<init>(paramOnImageLoadedListener, paramUri);
    zza(localzzc);
  }
  
  public void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    zza.zzc localzzc = new com/google/android/gms/common/images/zza$zzc;
    localzzc.<init>(paramOnImageLoadedListener, paramUri);
    localzzc.zzbM(paramInt);
    zza(localzzc);
  }
  
  public void zza(zza paramzza)
  {
    zzb.zzcD("ImageManager.loadImage() must be called in the main thread");
    ImageManager.zzd localzzd = new com/google/android/gms/common/images/ImageManager$zzd;
    localzzd.<init>(this, paramzza);
    localzzd.run();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\ImageManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */