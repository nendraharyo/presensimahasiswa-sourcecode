package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Option.CacheKeyUpdater;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;

public class VideoDecoder
  implements ResourceDecoder
{
  private static final VideoDecoder.MediaMetadataRetrieverFactory DEFAULT_FACTORY;
  public static final long DEFAULT_FRAME = 255L;
  static final int DEFAULT_FRAME_OPTION = 2;
  public static final Option FRAME_OPTION;
  private static final String TAG = "VideoDecoder";
  public static final Option TARGET_FRAME;
  private final BitmapPool bitmapPool;
  private final VideoDecoder.MediaMetadataRetrieverFactory factory;
  private final VideoDecoder.MediaMetadataRetrieverInitializer initializer;
  
  static
  {
    Object localObject1 = Long.valueOf(-1);
    Object localObject2 = new com/bumptech/glide/load/resource/bitmap/VideoDecoder$1;
    ((VideoDecoder.1)localObject2).<init>();
    TARGET_FRAME = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", localObject1, (Option.CacheKeyUpdater)localObject2);
    localObject1 = Integer.valueOf(2);
    localObject2 = new com/bumptech/glide/load/resource/bitmap/VideoDecoder$2;
    ((VideoDecoder.2)localObject2).<init>();
    FRAME_OPTION = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", localObject1, (Option.CacheKeyUpdater)localObject2);
    VideoDecoder.MediaMetadataRetrieverFactory localMediaMetadataRetrieverFactory = new com/bumptech/glide/load/resource/bitmap/VideoDecoder$MediaMetadataRetrieverFactory;
    localMediaMetadataRetrieverFactory.<init>();
    DEFAULT_FACTORY = localMediaMetadataRetrieverFactory;
  }
  
  VideoDecoder(BitmapPool paramBitmapPool, VideoDecoder.MediaMetadataRetrieverInitializer paramMediaMetadataRetrieverInitializer)
  {
    this(paramBitmapPool, paramMediaMetadataRetrieverInitializer, localMediaMetadataRetrieverFactory);
  }
  
  VideoDecoder(BitmapPool paramBitmapPool, VideoDecoder.MediaMetadataRetrieverInitializer paramMediaMetadataRetrieverInitializer, VideoDecoder.MediaMetadataRetrieverFactory paramMediaMetadataRetrieverFactory)
  {
    this.bitmapPool = paramBitmapPool;
    this.initializer = paramMediaMetadataRetrieverInitializer;
    this.factory = paramMediaMetadataRetrieverFactory;
  }
  
  public static ResourceDecoder asset(BitmapPool paramBitmapPool)
  {
    VideoDecoder localVideoDecoder = new com/bumptech/glide/load/resource/bitmap/VideoDecoder;
    VideoDecoder.AssetFileDescriptorInitializer localAssetFileDescriptorInitializer = new com/bumptech/glide/load/resource/bitmap/VideoDecoder$AssetFileDescriptorInitializer;
    localAssetFileDescriptorInitializer.<init>(null);
    localVideoDecoder.<init>(paramBitmapPool, localAssetFileDescriptorInitializer);
    return localVideoDecoder;
  }
  
  private static Bitmap decodeFrame(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3, DownsampleStrategy paramDownsampleStrategy)
  {
    int i = -1 << -1;
    Bitmap localBitmap = null;
    int j = Build.VERSION.SDK_INT;
    int k = 27;
    if ((j >= k) && (paramInt2 != i) && (paramInt3 != i))
    {
      DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.NONE;
      if (paramDownsampleStrategy != localDownsampleStrategy) {
        localBitmap = decodeScaledFrame(paramMediaMetadataRetriever, paramLong, paramInt1, paramInt2, paramInt3, paramDownsampleStrategy);
      }
    }
    if (localBitmap == null) {
      localBitmap = decodeOriginalFrame(paramMediaMetadataRetriever, paramLong, paramInt1);
    }
    return localBitmap;
  }
  
  private static Bitmap decodeOriginalFrame(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt)
  {
    return paramMediaMetadataRetriever.getFrameAtTime(paramLong, paramInt);
  }
  
  private static Bitmap decodeScaledFrame(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3, DownsampleStrategy paramDownsampleStrategy)
  {
    i = 18;
    f1 = 2.5E-44F;
    try
    {
      localObject1 = paramMediaMetadataRetriever.extractMetadata(i);
      int j = Integer.parseInt((String)localObject1);
      i = 19;
      f1 = 2.7E-44F;
      localObject1 = paramMediaMetadataRetriever.extractMetadata(i);
      i = Integer.parseInt((String)localObject1);
      k = 24;
      f2 = 3.4E-44F;
      str = paramMediaMetadataRetriever.extractMetadata(k);
      k = Integer.parseInt(str);
      int m = 90;
      if (k != m)
      {
        m = 270;
        if (k != m) {}
      }
      else
      {
        int n = j;
        j = i;
        i = n;
      }
      f2 = paramDownsampleStrategy.getScaleFactor(j, i, paramInt2, paramInt3);
      float f3 = j * f2;
      int i1 = Math.round(f3);
      f1 = i * f2;
      int i2 = Math.round(f1);
      localObject3 = paramMediaMetadataRetriever;
      localObject1 = paramMediaMetadataRetriever.getScaledFrameAtTime(paramLong, paramInt1, i1, i2);
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        String str;
        Object localObject3 = "VideoDecoder";
        int k = 3;
        float f2 = 4.2E-45F;
        boolean bool = Log.isLoggable((String)localObject3, k);
        if (bool)
        {
          localObject3 = "VideoDecoder";
          str = "Exception trying to decode frame on oreo+";
          Log.d((String)localObject3, str, localThrowable);
        }
        i = 0;
        f1 = 0.0F;
        Object localObject2 = null;
      }
    }
    return (Bitmap)localObject1;
  }
  
  public static ResourceDecoder parcel(BitmapPool paramBitmapPool)
  {
    VideoDecoder localVideoDecoder = new com/bumptech/glide/load/resource/bitmap/VideoDecoder;
    VideoDecoder.ParcelFileDescriptorInitializer localParcelFileDescriptorInitializer = new com/bumptech/glide/load/resource/bitmap/VideoDecoder$ParcelFileDescriptorInitializer;
    localParcelFileDescriptorInitializer.<init>();
    localVideoDecoder.<init>(paramBitmapPool, localParcelFileDescriptorInitializer);
    return localVideoDecoder;
  }
  
  public Resource decode(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    Object localObject1 = TARGET_FRAME;
    localObject1 = (Long)paramOptions.get((Option)localObject1);
    long l1 = ((Long)localObject1).longValue();
    long l2 = 0L;
    boolean bool = l1 < l2;
    Object localObject3;
    if (bool)
    {
      l2 = -1;
      bool = l1 < l2;
      if (bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: " + l1;
        ((IllegalArgumentException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = FRAME_OPTION;
    localObject1 = (Integer)paramOptions.get((Option)localObject1);
    if (localObject1 == null)
    {
      int i = 2;
      localObject1 = Integer.valueOf(i);
    }
    for (Object localObject4 = localObject1;; localObject4 = localObject2)
    {
      localObject1 = DownsampleStrategy.OPTION;
      localObject1 = (DownsampleStrategy)paramOptions.get((Option)localObject1);
      if (localObject1 == null) {}
      for (Object localObject5 = DownsampleStrategy.DEFAULT;; localObject5 = localObject2)
      {
        localObject1 = this.factory;
        localObject3 = ((VideoDecoder.MediaMetadataRetrieverFactory)localObject1).build();
        try
        {
          localObject1 = this.initializer;
          ((VideoDecoder.MediaMetadataRetrieverInitializer)localObject1).initialize((MediaMetadataRetriever)localObject3, paramObject);
          int j = ((Integer)localObject4).intValue();
          localObject1 = decodeFrame((MediaMetadataRetriever)localObject3, l1, j, paramInt1, paramInt2, (DownsampleStrategy)localObject5);
          ((MediaMetadataRetriever)localObject3).release();
          localObject3 = this.bitmapPool;
          return BitmapResource.obtain((Bitmap)localObject1, (BitmapPool)localObject3);
        }
        catch (RuntimeException localRuntimeException)
        {
          IOException localIOException = new java/io/IOException;
          localIOException.<init>(localRuntimeException);
          throw localIOException;
        }
        finally
        {
          ((MediaMetadataRetriever)localObject3).release();
        }
      }
    }
  }
  
  public boolean handles(Object paramObject, Options paramOptions)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\VideoDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */