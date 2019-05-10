package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class Downsampler
{
  public static final Option ALLOW_HARDWARE_CONFIG;
  public static final Option DECODE_FORMAT;
  public static final Option DOWNSAMPLE_STRATEGY;
  private static final Downsampler.DecodeCallbacks EMPTY_CALLBACKS;
  public static final Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;
  private static final String ICO_MIME_TYPE = "image/x-ico";
  private static final int MARK_POSITION = 10485760;
  private static final Set NO_DOWNSAMPLE_PRE_N_MIME_TYPES;
  private static final Queue OPTIONS_QUEUE = Util.createQueue(0);
  static final String TAG = "Downsampler";
  private static final Set TYPES_THAT_USE_POOL_PRE_KITKAT;
  private static final String WBMP_MIME_TYPE = "image/vnd.wap.wbmp";
  private final BitmapPool bitmapPool;
  private final ArrayPool byteArrayPool;
  private final DisplayMetrics displayMetrics;
  private final HardwareConfigState hardwareConfigState;
  private final List parsers;
  
  static
  {
    Object localObject1 = DecodeFormat.DEFAULT;
    DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", localObject1);
    DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;
    localObject1 = Boolean.valueOf(false);
    FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", localObject1);
    localObject1 = Boolean.valueOf(false);
    ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", localObject1);
    Object localObject2 = new java/util/HashSet;
    localObject1 = new String[2];
    localObject1[0] = "image/vnd.wap.wbmp";
    localObject1[1] = "image/x-ico";
    localObject1 = Arrays.asList((Object[])localObject1);
    ((HashSet)localObject2).<init>((Collection)localObject1);
    NO_DOWNSAMPLE_PRE_N_MIME_TYPES = Collections.unmodifiableSet((Set)localObject2);
    localObject2 = new com/bumptech/glide/load/resource/bitmap/Downsampler$1;
    ((Downsampler.1)localObject2).<init>();
    EMPTY_CALLBACKS = (Downsampler.DecodeCallbacks)localObject2;
    localObject2 = ImageHeaderParser.ImageType.JPEG;
    localObject1 = ImageHeaderParser.ImageType.PNG_A;
    ImageHeaderParser.ImageType localImageType = ImageHeaderParser.ImageType.PNG;
    TYPES_THAT_USE_POOL_PRE_KITKAT = Collections.unmodifiableSet(EnumSet.of((Enum)localObject2, (Enum)localObject1, localImageType));
  }
  
  public Downsampler(List paramList, DisplayMetrics paramDisplayMetrics, BitmapPool paramBitmapPool, ArrayPool paramArrayPool)
  {
    Object localObject = HardwareConfigState.getInstance();
    this.hardwareConfigState = ((HardwareConfigState)localObject);
    this.parsers = paramList;
    localObject = (DisplayMetrics)Preconditions.checkNotNull(paramDisplayMetrics);
    this.displayMetrics = ((DisplayMetrics)localObject);
    localObject = (BitmapPool)Preconditions.checkNotNull(paramBitmapPool);
    this.bitmapPool = ((BitmapPool)localObject);
    localObject = (ArrayPool)Preconditions.checkNotNull(paramArrayPool);
    this.byteArrayPool = ((ArrayPool)localObject);
  }
  
  private static int adjustTargetDensityForError(double paramDouble)
  {
    int i = getDensityMultiplier(paramDouble);
    int j = round(i * paramDouble);
    float f1 = j;
    float f2 = i;
    double d = f1 / f2;
    d = paramDouble / d;
    return round(j * d);
  }
  
  private void calculateConfig(InputStream paramInputStream, DecodeFormat paramDecodeFormat, boolean paramBoolean1, boolean paramBoolean2, BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    Object localObject1 = this.hardwareConfigState;
    int i = paramInt1;
    int j = paramInt2;
    localObject2 = paramOptions;
    localObject3 = paramDecodeFormat;
    boolean bool2 = ((HardwareConfigState)localObject1).setHardwareConfigIfAllowed(paramInt1, paramInt2, paramOptions, paramDecodeFormat, paramBoolean1, paramBoolean2);
    if (bool2) {}
    for (;;)
    {
      return;
      localObject1 = DecodeFormat.PREFER_ARGB_8888;
      if (paramDecodeFormat != localObject1)
      {
        int k = Build.VERSION.SDK_INT;
        i = 16;
        if (k != i) {}
      }
      else
      {
        localObject1 = Bitmap.Config.ARGB_8888;
        paramOptions.inPreferredConfig = ((Bitmap.Config)localObject1);
        continue;
      }
      i = 0;
      Bitmap.Config localConfig2 = null;
      try
      {
        localObject1 = this.parsers;
        localObject4 = this.byteArrayPool;
        localObject1 = ImageHeaderParserUtils.getType((List)localObject1, paramInputStream, (ArrayPool)localObject4);
        bool3 = ((ImageHeaderParser.ImageType)localObject1).hasAlpha();
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Object localObject4 = "Downsampler";
          int m = 3;
          boolean bool1 = Log.isLoggable((String)localObject4, m);
          if (bool1)
          {
            localObject4 = "Downsampler";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = "Cannot determine whether the image has alpha or not from header, format ";
            localObject2 = (String)localObject3 + paramDecodeFormat;
            Log.d((String)localObject4, (String)localObject2, localIOException);
          }
          boolean bool3 = false;
          Bitmap.Config localConfig1 = null;
          continue;
          localConfig1 = Bitmap.Config.RGB_565;
        }
      }
      if (!bool3) {
        break label246;
      }
      localObject1 = Bitmap.Config.ARGB_8888;
      paramOptions.inPreferredConfig = ((Bitmap.Config)localObject1);
      localObject1 = paramOptions.inPreferredConfig;
      localConfig2 = Bitmap.Config.RGB_565;
      if (localObject1 == localConfig2)
      {
        bool3 = true;
        paramOptions.inDither = bool3;
      }
    }
  }
  
  private static void calculateScaling(ImageHeaderParser.ImageType paramImageType, InputStream paramInputStream, Downsampler.DecodeCallbacks paramDecodeCallbacks, BitmapPool paramBitmapPool, DownsampleStrategy paramDownsampleStrategy, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, BitmapFactory.Options paramOptions)
  {
    Object localObject1;
    int i;
    float f1;
    Object localObject3;
    if ((paramInt2 <= 0) || (paramInt3 <= 0))
    {
      localObject1 = "Downsampler";
      i = 3;
      f1 = 4.2E-45F;
      boolean bool2 = Log.isLoggable((String)localObject1, i);
      if (bool2)
      {
        localObject1 = "Downsampler";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unable to determine dimensions for: ").append(paramImageType).append(" with target [").append(paramInt4).append("x").append(paramInt5);
        localObject3 = "]";
        localObject2 = (String)localObject3;
        Log.d((String)localObject1, (String)localObject2);
      }
      return;
    }
    int k = 90;
    float f2 = 1.26E-43F;
    if (paramInt1 != k)
    {
      k = 270;
      f2 = 3.78E-43F;
      if (paramInt1 != k) {}
    }
    else
    {
      f2 = paramDownsampleStrategy.getScaleFactor(paramInt3, paramInt2, paramInt4, paramInt5);
    }
    for (float f3 = f2;; f3 = f2)
    {
      f2 = 0.0F;
      localObject1 = null;
      boolean bool3 = f3 < 0.0F;
      if (bool3) {
        break;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Cannot scale with factor: " + f3 + " from: " + paramDownsampleStrategy + ", source: [" + paramInt2 + "x" + paramInt3 + "], target: [" + paramInt4 + "x" + paramInt5 + "]";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
      f2 = paramDownsampleStrategy.getScaleFactor(paramInt2, paramInt3, paramInt4, paramInt5);
    }
    Object localObject2 = paramDownsampleStrategy.getSampleSizeRounding(paramInt2, paramInt3, paramInt4, paramInt5);
    if (localObject2 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Cannot round with null rounding");
      throw ((Throwable)localObject1);
    }
    f2 = paramInt2 * f3;
    int m = round(f2);
    float f4 = paramInt3 * f3;
    double d = f4;
    int n = round(d);
    m = paramInt2 / m;
    n = paramInt3 / n;
    Object localObject4 = DownsampleStrategy.SampleSizeRounding.MEMORY;
    label406:
    int i2;
    float f5;
    label462:
    int i1;
    label571:
    int i4;
    boolean bool5;
    if (localObject2 == localObject4)
    {
      m = Math.max(m, n);
      n = Build.VERSION.SDK_INT;
      i2 = 23;
      f5 = 3.2E-44F;
      if (n > i2) {
        break label894;
      }
      localObject3 = NO_DOWNSAMPLE_PRE_N_MIME_TYPES;
      localObject4 = paramOptions.outMimeType;
      boolean bool4 = ((Set)localObject3).contains(localObject4);
      if (!bool4) {
        break label894;
      }
      m = 1;
      f2 = Float.MIN_VALUE;
      paramOptions.inSampleSize = m;
      localObject2 = ImageHeaderParser.ImageType.JPEG;
      if (paramImageType != localObject2) {
        break label968;
      }
      i = Math.min(m, 8);
      f4 = paramInt2;
      f5 = i;
      f4 /= f5;
      i1 = (int)Math.ceil(f4);
      f5 = paramInt3;
      f1 = i;
      f1 = f5 / f1;
      d = Math.ceil(f1);
      i = (int)d;
      i2 = m / 8;
      if (i2 > 0)
      {
        i1 /= i2;
        i /= i2;
      }
      f5 = paramDownsampleStrategy.getScaleFactor(i1, i, paramInt4, paramInt5);
      d = f5;
      int i3 = Build.VERSION.SDK_INT;
      i4 = 19;
      if (i3 >= i4)
      {
        i3 = adjustTargetDensityForError(d);
        paramOptions.inTargetDensity = i3;
        i3 = getDensityMultiplier(d);
        paramOptions.inDensity = i3;
      }
      bool5 = isScaling(paramOptions);
      if (!bool5) {
        break label1270;
      }
      bool5 = true;
      paramOptions.inScaled = bool5;
    }
    for (;;)
    {
      String str1 = "Downsampler";
      i4 = 2;
      bool5 = Log.isLoggable(str1, i4);
      if (!bool5) {
        break;
      }
      str1 = "Downsampler";
      Object localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = ((StringBuilder)localObject5).append("Calculate scaling, source: [").append(paramInt2).append("x").append(paramInt3).append("], target: [").append(paramInt4).append("x").append(paramInt5);
      String str2 = "], power of two scaled: [";
      localObject3 = ((StringBuilder)localObject5).append(str2).append(i1);
      localObject5 = "x";
      localObject2 = ((StringBuilder)localObject3).append((String)localObject5).append(i).append("], exact scale factor: ").append(f3);
      localObject3 = ", power of 2 sample size: ";
      localObject1 = ((StringBuilder)localObject2).append((String)localObject3).append(m).append(", adjusted scale factor: ").append(d).append(", target density: ");
      i = paramOptions.inTargetDensity;
      localObject1 = ((StringBuilder)localObject1).append(i);
      localObject2 = ", density: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      i = paramOptions.inDensity;
      localObject1 = i;
      Log.v(str1, (String)localObject1);
      break;
      m = Math.min(m, i1);
      break label406;
      label894:
      i1 = 1;
      f4 = Float.MIN_VALUE;
      m = Integer.highestOneBit(m);
      m = Math.max(i1, m);
      localObject3 = DownsampleStrategy.SampleSizeRounding.MEMORY;
      if (localObject2 != localObject3) {
        break label462;
      }
      f1 = m;
      i1 = 1065353216;
      f4 = 1.0F / f3;
      boolean bool1 = f1 < f4;
      if (!bool1) {
        break label462;
      }
      m <<= 1;
      break label462;
      label968:
      localObject2 = ImageHeaderParser.ImageType.PNG;
      if (paramImageType != localObject2)
      {
        localObject2 = ImageHeaderParser.ImageType.PNG_A;
        if (paramImageType != localObject2) {}
      }
      else
      {
        f1 = paramInt2;
        f4 = m;
        i1 = (int)Math.floor(f1 / f4);
        f1 = paramInt3;
        f5 = m;
        f1 /= f5;
        d = Math.floor(f1);
        j = (int)d;
        break label571;
      }
      localObject2 = ImageHeaderParser.ImageType.WEBP;
      if (paramImageType != localObject2)
      {
        localObject2 = ImageHeaderParser.ImageType.WEBP_A;
        if (paramImageType != localObject2) {}
      }
      else
      {
        j = Build.VERSION.SDK_INT;
        i1 = 24;
        f4 = 3.4E-44F;
        if (j >= i1)
        {
          f1 = paramInt2;
          f4 = m;
          i1 = Math.round(f1 / f4);
          f1 = paramInt3;
          f5 = m;
          f1 /= f5;
          j = Math.round(f1);
          break label571;
        }
        f1 = paramInt2;
        f4 = m;
        i1 = (int)Math.floor(f1 / f4);
        f1 = paramInt3;
        f5 = m;
        f1 /= f5;
        d = Math.floor(f1);
        j = (int)d;
        break label571;
      }
      int j = paramInt2 % m;
      if (j == 0)
      {
        j = paramInt3 % m;
        if (j == 0) {}
      }
      else
      {
        localObject2 = getDimensions(paramInputStream, paramOptions, paramDecodeCallbacks, paramBitmapPool);
        f4 = 0.0F;
        localObject3 = null;
        i1 = localObject2[0];
        i2 = 1;
        f5 = Float.MIN_VALUE;
        j = localObject2[i2];
        break label571;
      }
      i1 = paramInt2 / m;
      j = paramInt3 / m;
      break label571;
      label1270:
      bool5 = false;
      str1 = null;
      paramOptions.inTargetDensity = 0;
      paramOptions.inDensity = 0;
    }
  }
  
  private Bitmap decodeFromWrappedStreams(InputStream paramInputStream, BitmapFactory.Options paramOptions, DownsampleStrategy paramDownsampleStrategy, DecodeFormat paramDecodeFormat, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, Downsampler.DecodeCallbacks paramDecodeCallbacks)
  {
    long l = LogTime.getLogTime();
    Object localObject1 = this;
    Object localObject2 = this.bitmapPool;
    localObject1 = paramInputStream;
    localObject2 = getDimensions(paramInputStream, paramOptions, paramDecodeCallbacks, (BitmapPool)localObject2);
    Object localObject3 = null;
    int i = localObject2[0];
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int m = localObject2[j];
    localObject1 = paramOptions;
    localObject1 = paramOptions.outMimeType;
    Object localObject4 = localObject1;
    int n = -1;
    float f2 = 0.0F / 0.0F;
    if (i != n)
    {
      n = -1;
      f2 = 0.0F / 0.0F;
      if (m != n) {
        break label914;
      }
    }
    label179:
    label569:
    label576:
    label588:
    label914:
    for (boolean bool4 = false;; bool4 = paramBoolean1)
    {
      localObject1 = this;
      localObject2 = this.parsers;
      localObject3 = this.byteArrayPool;
      localObject1 = paramInputStream;
      int i3 = ImageHeaderParserUtils.getOrientation((List)localObject2, paramInputStream, (ArrayPool)localObject3);
      int i4 = TransformationUtils.getExifOrientationDegrees(i3);
      boolean bool5 = TransformationUtils.isExifOrientationRequired(i3);
      n = -1 << -1;
      f2 = -0.0F;
      int i5;
      int i6;
      Object localObject5;
      Object localObject6;
      Object localObject7;
      Object localObject8;
      int i7;
      float f3;
      if (paramInt1 == n)
      {
        i5 = i;
        n = -1 << -1;
        f2 = -0.0F;
        if (paramInt2 != n) {
          break label569;
        }
        i6 = m;
        localObject1 = this;
        localObject2 = this.parsers;
        localObject3 = this.byteArrayPool;
        localObject1 = paramInputStream;
        localObject2 = ImageHeaderParserUtils.getType((List)localObject2, paramInputStream, (ArrayPool)localObject3);
        localObject1 = this;
        localObject5 = this.bitmapPool;
        localObject3 = paramInputStream;
        localObject6 = paramDecodeCallbacks;
        localObject7 = paramDownsampleStrategy;
        localObject8 = paramOptions;
        calculateScaling((ImageHeaderParser.ImageType)localObject2, paramInputStream, paramDecodeCallbacks, (BitmapPool)localObject5, paramDownsampleStrategy, i4, i, m, i5, i6, paramOptions);
        localObject8 = this;
        calculateConfig(paramInputStream, paramDecodeFormat, bool4, bool5, paramOptions, i5, i6);
        j = Build.VERSION.SDK_INT;
        i7 = 19;
        f3 = 2.7E-44F;
        if (j < i7) {
          break label576;
        }
        j = 1;
        f1 = Float.MIN_VALUE;
      }
      int i8;
      float f4;
      for (;;)
      {
        localObject1 = paramOptions;
        i7 = paramOptions.inSampleSize;
        i8 = 1;
        f4 = Float.MIN_VALUE;
        if ((i7 == i8) || (j != 0))
        {
          localObject1 = this;
          bool2 = shouldUsePool((ImageHeaderParser.ImageType)localObject2);
          if (bool2)
          {
            if ((i < 0) || (m < 0) || (!paramBoolean2) || (j == 0)) {
              break label588;
            }
            if ((i5 > 0) && (i6 > 0))
            {
              localObject1 = this;
              localObject2 = this.bitmapPool;
              localObject1 = paramOptions;
              setInBitmap(paramOptions, (BitmapPool)localObject2, i5, i6);
            }
          }
        }
        localObject1 = this;
        localObject2 = this.bitmapPool;
        localObject1 = paramInputStream;
        localObject8 = decodeStream(paramInputStream, paramOptions, paramDecodeCallbacks, (BitmapPool)localObject2);
        localObject1 = this;
        localObject2 = this.bitmapPool;
        localObject1 = paramDecodeCallbacks;
        paramDecodeCallbacks.onDecodeComplete((BitmapPool)localObject2, (Bitmap)localObject8);
        localObject2 = "Downsampler";
        j = 2;
        f1 = 2.8E-45F;
        boolean bool2 = Log.isLoggable((String)localObject2, j);
        if (bool2) {
          logDecode(i, m, (String)localObject4, paramOptions, (Bitmap)localObject8, paramInt1, paramInt2, l);
        }
        bool2 = false;
        f2 = 0.0F;
        localObject2 = null;
        if (localObject8 != null)
        {
          localObject1 = this;
          int i1 = this.displayMetrics.densityDpi;
          ((Bitmap)localObject8).setDensity(i1);
          localObject2 = TransformationUtils.rotateImageExif(this.bitmapPool, (Bitmap)localObject8, i3);
          bool1 = localObject8.equals(localObject2);
          if (!bool1)
          {
            localObject3 = this.bitmapPool;
            ((BitmapPool)localObject3).put((Bitmap)localObject8);
          }
        }
        return (Bitmap)localObject2;
        i5 = paramInt1;
        break;
        i6 = paramInt2;
        break label179;
        boolean bool1 = false;
        f1 = 0.0F;
        localObject3 = null;
      }
      boolean bool3 = isScaling(paramOptions);
      int i2;
      int k;
      if (bool3)
      {
        localObject1 = paramOptions;
        i2 = paramOptions.inTargetDensity;
        f2 = i2;
        k = paramOptions.inDensity;
        f1 = k;
      }
      for (f2 /= f1;; f2 = 1.0F)
      {
        localObject1 = paramOptions;
        k = paramOptions.inSampleSize;
        f3 = i;
        f4 = k;
        double d1 = Math.ceil(f3 / f4);
        i7 = (int)d1;
        f4 = m;
        float f5 = k;
        double d2 = Math.ceil(f4 / f5);
        i8 = (int)d2;
        i5 = Math.round(i7 * f2);
        f3 = i8 * f2;
        i6 = Math.round(f3);
        localObject6 = "Downsampler";
        i8 = 2;
        f4 = 2.8E-45F;
        boolean bool6 = Log.isLoggable((String)localObject6, i8);
        if (!bool6) {
          break;
        }
        localObject6 = "Downsampler";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Calculated target [").append(i5).append("x").append(i6).append("] for source [").append(i).append("x").append(m);
        localObject7 = "], sampleSize: ";
        localObject3 = ((StringBuilder)localObject5).append((String)localObject7).append(k).append(", targetDensity: ");
        i8 = paramOptions.inTargetDensity;
        localObject3 = ((StringBuilder)localObject3).append(i8).append(", density: ");
        i8 = paramOptions.inDensity;
        localObject3 = ((StringBuilder)localObject3).append(i8);
        localObject5 = ", density multiplier: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        localObject2 = f2;
        Log.v((String)localObject6, (String)localObject2);
        break;
        i2 = 1065353216;
      }
    }
  }
  
  private static Bitmap decodeStream(InputStream paramInputStream, BitmapFactory.Options paramOptions, Downsampler.DecodeCallbacks paramDecodeCallbacks, BitmapPool paramBitmapPool)
  {
    boolean bool1 = paramOptions.inJustDecodeBounds;
    int i;
    if (bool1)
    {
      i = 10485760;
      paramInputStream.mark(i);
    }
    String str;
    for (;;)
    {
      i = paramOptions.outWidth;
      int j = paramOptions.outHeight;
      str = paramOptions.outMimeType;
      TransformationUtils.getBitmapDrawableLock().lock();
      Object localObject1 = null;
      try
      {
        localObject2 = BitmapFactory.decodeStream(paramInputStream, null, paramOptions);
        localObject4 = TransformationUtils.getBitmapDrawableLock();
        ((Lock)localObject4).unlock();
        k = paramOptions.inJustDecodeBounds;
        if (k != 0) {
          paramInputStream.reset();
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          int k;
          Object localObject2 = newIoExceptionForInBitmapAssertion(localIllegalArgumentException, i, k, str, paramOptions);
          Object localObject4 = "Downsampler";
          int m = 3;
          boolean bool2 = Log.isLoggable((String)localObject4, m);
          if (!bool2) {
            break label153;
          }
          localObject4 = "Downsampler";
          str = "Failed to decode with inBitmap, trying again without Bitmap re-use";
          Log.d((String)localObject4, str, (Throwable)localObject2);
          localObject4 = paramOptions.inBitmap;
          if (localObject4 == null) {
            break label235;
          }
          try
          {
            paramInputStream.reset();
            localObject4 = paramOptions.inBitmap;
            paramBitmapPool.put((Bitmap)localObject4);
            bool2 = false;
            localObject4 = null;
            paramOptions.inBitmap = null;
            localObject2 = decodeStream(paramInputStream, paramOptions, paramDecodeCallbacks, paramBitmapPool);
            localObject4 = TransformationUtils.getBitmapDrawableLock();
            ((Lock)localObject4).unlock();
          }
          catch (IOException localIOException)
          {
            throw ((Throwable)localObject2);
          }
        }
      }
      finally
      {
        TransformationUtils.getBitmapDrawableLock().unlock();
      }
      return (Bitmap)localObject2;
      paramDecodeCallbacks.onObtainBounds();
    }
    label153:
    label235:
    throw ((Throwable)localObject3);
  }
  
  private static String getBitmapString(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      i = 0;
      localObject1 = null;
      return (String)localObject1;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    Object localObject2;
    if (i >= j)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(" (");
      j = paramBitmap.getAllocationByteCount();
      localObject1 = ((StringBuilder)localObject1).append(j);
      localObject2 = ")";
    }
    for (Object localObject1 = (String)localObject2;; localObject1 = "")
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("[");
      int k = paramBitmap.getWidth();
      localObject2 = ((StringBuilder)localObject2).append(k).append("x");
      k = paramBitmap.getHeight();
      localObject2 = ((StringBuilder)localObject2).append(k).append("] ");
      Bitmap.Config localConfig = paramBitmap.getConfig();
      localObject2 = ((StringBuilder)localObject2).append(localConfig);
      localObject1 = (String)localObject1;
      break;
    }
  }
  
  private static BitmapFactory.Options getDefaultOptions()
  {
    synchronized (Downsampler.class)
    {
      synchronized (OPTIONS_QUEUE)
      {
        Object localObject1 = OPTIONS_QUEUE;
        localObject1 = ((Queue)localObject1).poll();
        localObject1 = (BitmapFactory.Options)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject1).<init>();
          resetOptions((BitmapFactory.Options)localObject1);
        }
        return (BitmapFactory.Options)localObject1;
      }
    }
  }
  
  private static int getDensityMultiplier(double paramDouble)
  {
    double d1 = 1.0D;
    double d2 = 2.147483647E9D;
    boolean bool = paramDouble < d1;
    if (!bool) {}
    for (;;)
    {
      return (int)Math.round(d2 * paramDouble);
      paramDouble = d1 / paramDouble;
    }
  }
  
  private static int[] getDimensions(InputStream paramInputStream, BitmapFactory.Options paramOptions, Downsampler.DecodeCallbacks paramDecodeCallbacks, BitmapPool paramBitmapPool)
  {
    boolean bool = true;
    paramOptions.inJustDecodeBounds = bool;
    decodeStream(paramInputStream, paramOptions, paramDecodeCallbacks, paramBitmapPool);
    paramOptions.inJustDecodeBounds = false;
    int[] arrayOfInt = new int[2];
    int i = paramOptions.outWidth;
    arrayOfInt[0] = i;
    i = paramOptions.outHeight;
    arrayOfInt[bool] = i;
    return arrayOfInt;
  }
  
  private static String getInBitmapString(BitmapFactory.Options paramOptions)
  {
    return getBitmapString(paramOptions.inBitmap);
  }
  
  private static boolean isScaling(BitmapFactory.Options paramOptions)
  {
    int i = paramOptions.inTargetDensity;
    if (i > 0)
    {
      i = paramOptions.inDensity;
      if (i > 0)
      {
        i = paramOptions.inTargetDensity;
        int k = paramOptions.inDensity;
        if (i == k) {}
      }
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  private static void logDecode(int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions, Bitmap paramBitmap, int paramInt3, int paramInt4, long paramLong)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Decoded ");
    String str = getBitmapString(paramBitmap);
    localObject = ((StringBuilder)localObject).append(str).append(" from [").append(paramInt1).append("x").append(paramInt2).append("] ").append(paramString).append(" with inBitmap ");
    str = getInBitmapString(paramOptions);
    localObject = ((StringBuilder)localObject).append(str).append(" for [").append(paramInt3).append("x").append(paramInt4).append("], sample size: ");
    int i = paramOptions.inSampleSize;
    localObject = ((StringBuilder)localObject).append(i).append(", density: ");
    i = paramOptions.inDensity;
    localObject = ((StringBuilder)localObject).append(i).append(", target density: ");
    i = paramOptions.inTargetDensity;
    localObject = ((StringBuilder)localObject).append(i).append(", thread: ");
    str = Thread.currentThread().getName();
    localObject = ((StringBuilder)localObject).append(str).append(", duration: ");
    double d = LogTime.getElapsedMillis(paramLong);
    localObject = d;
    Log.v("Downsampler", (String)localObject);
  }
  
  private static IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException paramIllegalArgumentException, int paramInt1, int paramInt2, String paramString, BitmapFactory.Options paramOptions)
  {
    IOException localIOException = new java/io/IOException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Exception decoding bitmap, outWidth: ").append(paramInt1).append(", outHeight: ").append(paramInt2).append(", outMimeType: ").append(paramString).append(", inBitmap: ");
    String str = getInBitmapString(paramOptions);
    localObject = str;
    localIOException.<init>((String)localObject, paramIllegalArgumentException);
    return localIOException;
  }
  
  private static void releaseOptions(BitmapFactory.Options paramOptions)
  {
    resetOptions(paramOptions);
    synchronized (OPTIONS_QUEUE)
    {
      Queue localQueue2 = OPTIONS_QUEUE;
      localQueue2.offer(paramOptions);
      return;
    }
  }
  
  private static void resetOptions(BitmapFactory.Options paramOptions)
  {
    int i = 1;
    paramOptions.inTempStorage = null;
    paramOptions.inDither = false;
    paramOptions.inScaled = false;
    paramOptions.inSampleSize = i;
    paramOptions.inPreferredConfig = null;
    paramOptions.inJustDecodeBounds = false;
    paramOptions.inDensity = 0;
    paramOptions.inTargetDensity = 0;
    paramOptions.outWidth = 0;
    paramOptions.outHeight = 0;
    paramOptions.outMimeType = null;
    paramOptions.inBitmap = null;
    paramOptions.inMutable = i;
  }
  
  private static int round(double paramDouble)
  {
    return (int)(0.5D + paramDouble);
  }
  
  private static void setInBitmap(BitmapFactory.Options paramOptions, BitmapPool paramBitmapPool, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i >= j)
    {
      localObject = paramOptions.inPreferredConfig;
      Bitmap.Config localConfig = Bitmap.Config.HARDWARE;
      if (localObject != localConfig) {}
    }
    for (;;)
    {
      return;
      localObject = paramOptions.outConfig;
      if (localObject == null) {
        localObject = paramOptions.inPreferredConfig;
      }
      localObject = paramBitmapPool.getDirty(paramInt1, paramInt2, (Bitmap.Config)localObject);
      paramOptions.inBitmap = ((Bitmap)localObject);
    }
  }
  
  private boolean shouldUsePool(ImageHeaderParser.ImageType paramImageType)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {}
    Set localSet;
    boolean bool;
    for (i = 1;; bool = localSet.contains(paramImageType))
    {
      return i;
      localSet = TYPES_THAT_USE_POOL_PRE_KITKAT;
    }
  }
  
  public Resource decode(InputStream paramInputStream, int paramInt1, int paramInt2, Options paramOptions)
  {
    Downsampler.DecodeCallbacks localDecodeCallbacks = EMPTY_CALLBACKS;
    return decode(paramInputStream, paramInt1, paramInt2, paramOptions, localDecodeCallbacks);
  }
  
  public Resource decode(InputStream paramInputStream, int paramInt1, int paramInt2, Options paramOptions, Downsampler.DecodeCallbacks paramDecodeCallbacks)
  {
    boolean bool1 = paramInputStream.markSupported();
    Object localObject1 = "You must provide an InputStream that supports mark()";
    Preconditions.checkArgument(bool1, (String)localObject1);
    Object localObject2 = this.byteArrayPool;
    int i = 65536;
    localObject2 = ((ArrayPool)localObject2).get(i, byte[].class);
    localObject4 = localObject2;
    localObject4 = (byte[])localObject2;
    localOptions = getDefaultOptions();
    localOptions.inTempStorage = ((byte[])localObject4);
    localObject2 = DECODE_FORMAT;
    DecodeFormat localDecodeFormat = (DecodeFormat)paramOptions.get((Option)localObject2);
    localObject2 = DownsampleStrategy.OPTION;
    DownsampleStrategy localDownsampleStrategy = (DownsampleStrategy)paramOptions.get((Option)localObject2);
    localObject2 = FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS;
    boolean bool2 = ((Boolean)paramOptions.get((Option)localObject2)).booleanValue();
    localObject2 = ALLOW_HARDWARE_CONFIG;
    localObject2 = paramOptions.get((Option)localObject2);
    if (localObject2 != null)
    {
      localObject2 = ALLOW_HARDWARE_CONFIG;
      localObject2 = (Boolean)paramOptions.get((Option)localObject2);
      bool1 = ((Boolean)localObject2).booleanValue();
      if (!bool1) {}
    }
    for (boolean bool3 = true;; bool3 = false)
    {
      localObject2 = this;
      localObject1 = paramInputStream;
      try
      {
        localObject2 = decodeFromWrappedStreams(paramInputStream, localOptions, localDownsampleStrategy, localDecodeFormat, bool3, paramInt1, paramInt2, bool2, paramDecodeCallbacks);
        localObject1 = this.bitmapPool;
        localObject2 = BitmapResource.obtain((Bitmap)localObject2, (BitmapPool)localObject1);
        return (Resource)localObject2;
      }
      finally
      {
        releaseOptions(localOptions);
        this.byteArrayPool.put(localObject4);
      }
    }
  }
  
  public boolean handles(InputStream paramInputStream)
  {
    return true;
  }
  
  public boolean handles(ByteBuffer paramByteBuffer)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\Downsampler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */