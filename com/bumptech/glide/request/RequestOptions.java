package com.bumptech.glide.request;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Map;

public class RequestOptions
  implements Cloneable
{
  private static final int DISK_CACHE_STRATEGY = 4;
  private static final int ERROR_ID = 32;
  private static final int ERROR_PLACEHOLDER = 16;
  private static final int FALLBACK = 8192;
  private static final int FALLBACK_ID = 16384;
  private static final int IS_CACHEABLE = 256;
  private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
  private static final int OVERRIDE = 512;
  private static final int PLACEHOLDER = 64;
  private static final int PLACEHOLDER_ID = 128;
  private static final int PRIORITY = 8;
  private static final int RESOURCE_CLASS = 4096;
  private static final int SIGNATURE = 1024;
  private static final int SIZE_MULTIPLIER = 2;
  private static final int THEME = 32768;
  private static final int TRANSFORMATION = 2048;
  private static final int TRANSFORMATION_ALLOWED = 65536;
  private static final int TRANSFORMATION_REQUIRED = 131072;
  private static final int UNSET = 255;
  private static final int USE_ANIMATION_POOL = 1048576;
  private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
  private static RequestOptions centerCropOptions;
  private static RequestOptions centerInsideOptions;
  private static RequestOptions circleCropOptions;
  private static RequestOptions fitCenterOptions;
  private static RequestOptions noAnimationOptions;
  private static RequestOptions noTransformOptions;
  private static RequestOptions skipMemoryCacheFalseOptions;
  private static RequestOptions skipMemoryCacheTrueOptions;
  private DiskCacheStrategy diskCacheStrategy;
  private int errorId;
  private Drawable errorPlaceholder;
  private Drawable fallbackDrawable;
  private int fallbackId;
  private int fields;
  private boolean isAutoCloneEnabled;
  private boolean isCacheable;
  private boolean isLocked;
  private boolean isScaleOnlyOrNoTransform;
  private boolean isTransformationAllowed;
  private boolean isTransformationRequired;
  private boolean onlyRetrieveFromCache;
  private Options options;
  private int overrideHeight;
  private int overrideWidth;
  private Drawable placeholderDrawable;
  private int placeholderId;
  private Priority priority;
  private Class resourceClass;
  private Key signature;
  private float sizeMultiplier = 1.0F;
  private Resources.Theme theme;
  private Map transformations;
  private boolean useAnimationPool;
  private boolean useUnlimitedSourceGeneratorsPool;
  
  public RequestOptions()
  {
    Object localObject = DiskCacheStrategy.AUTOMATIC;
    this.diskCacheStrategy = ((DiskCacheStrategy)localObject);
    localObject = Priority.NORMAL;
    this.priority = ((Priority)localObject);
    this.isCacheable = bool;
    this.overrideHeight = i;
    this.overrideWidth = i;
    localObject = EmptySignature.obtain();
    this.signature = ((Key)localObject);
    this.isTransformationAllowed = bool;
    localObject = new com/bumptech/glide/load/Options;
    ((Options)localObject).<init>();
    this.options = ((Options)localObject);
    localObject = new com/bumptech/glide/util/CachedHashCodeArrayMap;
    ((CachedHashCodeArrayMap)localObject).<init>();
    this.transformations = ((Map)localObject);
    this.resourceClass = Object.class;
    this.isScaleOnlyOrNoTransform = bool;
  }
  
  public static RequestOptions bitmapTransform(Transformation paramTransformation)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.transform(paramTransformation);
  }
  
  public static RequestOptions centerCropTransform()
  {
    RequestOptions localRequestOptions = centerCropOptions;
    if (localRequestOptions == null)
    {
      localRequestOptions = new com/bumptech/glide/request/RequestOptions;
      localRequestOptions.<init>();
      localRequestOptions = localRequestOptions.centerCrop().autoClone();
      centerCropOptions = localRequestOptions;
    }
    return centerCropOptions;
  }
  
  public static RequestOptions centerInsideTransform()
  {
    RequestOptions localRequestOptions = centerInsideOptions;
    if (localRequestOptions == null)
    {
      localRequestOptions = new com/bumptech/glide/request/RequestOptions;
      localRequestOptions.<init>();
      localRequestOptions = localRequestOptions.centerInside().autoClone();
      centerInsideOptions = localRequestOptions;
    }
    return centerInsideOptions;
  }
  
  public static RequestOptions circleCropTransform()
  {
    RequestOptions localRequestOptions = circleCropOptions;
    if (localRequestOptions == null)
    {
      localRequestOptions = new com/bumptech/glide/request/RequestOptions;
      localRequestOptions.<init>();
      localRequestOptions = localRequestOptions.circleCrop().autoClone();
      circleCropOptions = localRequestOptions;
    }
    return circleCropOptions;
  }
  
  public static RequestOptions decodeTypeOf(Class paramClass)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.decode(paramClass);
  }
  
  public static RequestOptions diskCacheStrategyOf(DiskCacheStrategy paramDiskCacheStrategy)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.diskCacheStrategy(paramDiskCacheStrategy);
  }
  
  public static RequestOptions downsampleOf(DownsampleStrategy paramDownsampleStrategy)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.downsample(paramDownsampleStrategy);
  }
  
  public static RequestOptions encodeFormatOf(Bitmap.CompressFormat paramCompressFormat)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.encodeFormat(paramCompressFormat);
  }
  
  public static RequestOptions encodeQualityOf(int paramInt)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.encodeQuality(paramInt);
  }
  
  public static RequestOptions errorOf(int paramInt)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.error(paramInt);
  }
  
  public static RequestOptions errorOf(Drawable paramDrawable)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.error(paramDrawable);
  }
  
  public static RequestOptions fitCenterTransform()
  {
    RequestOptions localRequestOptions = fitCenterOptions;
    if (localRequestOptions == null)
    {
      localRequestOptions = new com/bumptech/glide/request/RequestOptions;
      localRequestOptions.<init>();
      localRequestOptions = localRequestOptions.fitCenter().autoClone();
      fitCenterOptions = localRequestOptions;
    }
    return fitCenterOptions;
  }
  
  public static RequestOptions formatOf(DecodeFormat paramDecodeFormat)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.format(paramDecodeFormat);
  }
  
  public static RequestOptions frameOf(long paramLong)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.frame(paramLong);
  }
  
  private boolean isSet(int paramInt)
  {
    return isSet(this.fields, paramInt);
  }
  
  private static boolean isSet(int paramInt1, int paramInt2)
  {
    int i = paramInt1 & paramInt2;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static RequestOptions noAnimation()
  {
    RequestOptions localRequestOptions = noAnimationOptions;
    if (localRequestOptions == null)
    {
      localRequestOptions = new com/bumptech/glide/request/RequestOptions;
      localRequestOptions.<init>();
      localRequestOptions = localRequestOptions.dontAnimate().autoClone();
      noAnimationOptions = localRequestOptions;
    }
    return noAnimationOptions;
  }
  
  public static RequestOptions noTransformation()
  {
    RequestOptions localRequestOptions = noTransformOptions;
    if (localRequestOptions == null)
    {
      localRequestOptions = new com/bumptech/glide/request/RequestOptions;
      localRequestOptions.<init>();
      localRequestOptions = localRequestOptions.dontTransform().autoClone();
      noTransformOptions = localRequestOptions;
    }
    return noTransformOptions;
  }
  
  public static RequestOptions option(Option paramOption, Object paramObject)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.set(paramOption, paramObject);
  }
  
  private RequestOptions optionalScaleOnlyTransform(DownsampleStrategy paramDownsampleStrategy, Transformation paramTransformation)
  {
    return scaleOnlyTransform(paramDownsampleStrategy, paramTransformation, false);
  }
  
  public static RequestOptions overrideOf(int paramInt)
  {
    return overrideOf(paramInt, paramInt);
  }
  
  public static RequestOptions overrideOf(int paramInt1, int paramInt2)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.override(paramInt1, paramInt2);
  }
  
  public static RequestOptions placeholderOf(int paramInt)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.placeholder(paramInt);
  }
  
  public static RequestOptions placeholderOf(Drawable paramDrawable)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.placeholder(paramDrawable);
  }
  
  public static RequestOptions priorityOf(Priority paramPriority)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.priority(paramPriority);
  }
  
  private RequestOptions scaleOnlyTransform(DownsampleStrategy paramDownsampleStrategy, Transformation paramTransformation)
  {
    return scaleOnlyTransform(paramDownsampleStrategy, paramTransformation, true);
  }
  
  private RequestOptions scaleOnlyTransform(DownsampleStrategy paramDownsampleStrategy, Transformation paramTransformation, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (RequestOptions localRequestOptions = transform(paramDownsampleStrategy, paramTransformation);; localRequestOptions = optionalTransform(paramDownsampleStrategy, paramTransformation))
    {
      localRequestOptions.isScaleOnlyOrNoTransform = true;
      return localRequestOptions;
    }
  }
  
  private RequestOptions selfOrThrowIfLocked()
  {
    boolean bool = this.isLocked;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("You cannot modify locked RequestOptions, consider clone()");
      throw localIllegalStateException;
    }
    return this;
  }
  
  public static RequestOptions signatureOf(Key paramKey)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.signature(paramKey);
  }
  
  public static RequestOptions sizeMultiplierOf(float paramFloat)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.sizeMultiplier(paramFloat);
  }
  
  public static RequestOptions skipMemoryCacheOf(boolean paramBoolean)
  {
    boolean bool;
    if (paramBoolean)
    {
      localRequestOptions = skipMemoryCacheTrueOptions;
      if (localRequestOptions == null)
      {
        localRequestOptions = new com/bumptech/glide/request/RequestOptions;
        localRequestOptions.<init>();
        bool = true;
        localRequestOptions = localRequestOptions.skipMemoryCache(bool).autoClone();
        skipMemoryCacheTrueOptions = localRequestOptions;
      }
    }
    for (RequestOptions localRequestOptions = skipMemoryCacheTrueOptions;; localRequestOptions = skipMemoryCacheFalseOptions)
    {
      return localRequestOptions;
      localRequestOptions = skipMemoryCacheFalseOptions;
      if (localRequestOptions == null)
      {
        localRequestOptions = new com/bumptech/glide/request/RequestOptions;
        localRequestOptions.<init>();
        bool = false;
        localRequestOptions = localRequestOptions.skipMemoryCache(false).autoClone();
        skipMemoryCacheFalseOptions = localRequestOptions;
      }
    }
  }
  
  public static RequestOptions timeoutOf(int paramInt)
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    return localRequestOptions.timeout(paramInt);
  }
  
  private RequestOptions transform(Transformation paramTransformation, boolean paramBoolean)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (Object localObject = clone().transform(paramTransformation, paramBoolean);; localObject = selfOrThrowIfLocked())
    {
      return (RequestOptions)localObject;
      localObject = new com/bumptech/glide/load/resource/bitmap/DrawableTransformation;
      ((DrawableTransformation)localObject).<init>(paramTransformation, paramBoolean);
      transform(Bitmap.class, paramTransformation, paramBoolean);
      transform(Drawable.class, (Transformation)localObject, paramBoolean);
      localObject = ((DrawableTransformation)localObject).asBitmapDrawable();
      transform(BitmapDrawable.class, (Transformation)localObject, paramBoolean);
      GifDrawableTransformation localGifDrawableTransformation = new com/bumptech/glide/load/resource/gif/GifDrawableTransformation;
      localGifDrawableTransformation.<init>(paramTransformation);
      transform(GifDrawable.class, localGifDrawableTransformation, paramBoolean);
    }
  }
  
  private RequestOptions transform(Class paramClass, Transformation paramTransformation, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = this.isAutoCloneEnabled;
    if (bool2) {}
    for (RequestOptions localRequestOptions = clone().transform(paramClass, paramTransformation, paramBoolean);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      Preconditions.checkNotNull(paramClass);
      Preconditions.checkNotNull(paramTransformation);
      this.transformations.put(paramClass, paramTransformation);
      int i = this.fields | 0x800;
      this.fields = i;
      this.isTransformationAllowed = bool1;
      i = this.fields;
      int j = 65536;
      i |= j;
      this.fields = i;
      i = 0;
      localRequestOptions = null;
      this.isScaleOnlyOrNoTransform = false;
      if (paramBoolean)
      {
        i = this.fields;
        j = 131072;
        i |= j;
        this.fields = i;
        this.isTransformationRequired = bool1;
      }
    }
  }
  
  public RequestOptions apply(RequestOptions paramRequestOptions)
  {
    boolean bool1 = this.isAutoCloneEnabled;
    if (bool1) {}
    for (Object localObject1 = clone().apply(paramRequestOptions);; localObject1 = selfOrThrowIfLocked())
    {
      return (RequestOptions)localObject1;
      int i = paramRequestOptions.fields;
      int i17 = 2;
      boolean bool2 = isSet(i, i17);
      float f;
      if (bool2)
      {
        f = paramRequestOptions.sizeMultiplier;
        this.sizeMultiplier = f;
      }
      int j = paramRequestOptions.fields;
      i17 = 262144;
      boolean bool3 = isSet(j, i17);
      if (bool3)
      {
        bool3 = paramRequestOptions.useUnlimitedSourceGeneratorsPool;
        this.useUnlimitedSourceGeneratorsPool = bool3;
      }
      int k = paramRequestOptions.fields;
      i17 = 1048576;
      boolean bool4 = isSet(k, i17);
      if (bool4)
      {
        bool4 = paramRequestOptions.useAnimationPool;
        this.useAnimationPool = bool4;
      }
      int m = paramRequestOptions.fields;
      i17 = 4;
      boolean bool5 = isSet(m, i17);
      if (bool5)
      {
        localObject1 = paramRequestOptions.diskCacheStrategy;
        this.diskCacheStrategy = ((DiskCacheStrategy)localObject1);
      }
      int n = paramRequestOptions.fields;
      i17 = 8;
      boolean bool6 = isSet(n, i17);
      if (bool6)
      {
        localObject1 = paramRequestOptions.priority;
        this.priority = ((Priority)localObject1);
      }
      int i1 = paramRequestOptions.fields;
      i17 = 16;
      boolean bool7 = isSet(i1, i17);
      if (bool7)
      {
        localObject1 = paramRequestOptions.errorPlaceholder;
        this.errorPlaceholder = ((Drawable)localObject1);
        this.errorId = 0;
        i2 = this.fields & 0xFFFFFFDF;
        this.fields = i2;
      }
      int i2 = paramRequestOptions.fields;
      i17 = 32;
      boolean bool8 = isSet(i2, i17);
      if (bool8)
      {
        i3 = paramRequestOptions.errorId;
        this.errorId = i3;
        this.errorPlaceholder = null;
        i3 = this.fields & 0xFFFFFFEF;
        this.fields = i3;
      }
      int i3 = paramRequestOptions.fields;
      i17 = 64;
      boolean bool9 = isSet(i3, i17);
      if (bool9)
      {
        localObject1 = paramRequestOptions.placeholderDrawable;
        this.placeholderDrawable = ((Drawable)localObject1);
        this.placeholderId = 0;
        i4 = this.fields & 0xFF7F;
        this.fields = i4;
      }
      int i4 = paramRequestOptions.fields;
      i17 = 128;
      boolean bool10 = isSet(i4, i17);
      if (bool10)
      {
        i5 = paramRequestOptions.placeholderId;
        this.placeholderId = i5;
        this.placeholderDrawable = null;
        i5 = this.fields & 0xFFFFFFBF;
        this.fields = i5;
      }
      int i5 = paramRequestOptions.fields;
      i17 = 256;
      boolean bool11 = isSet(i5, i17);
      if (bool11)
      {
        bool11 = paramRequestOptions.isCacheable;
        this.isCacheable = bool11;
      }
      int i6 = paramRequestOptions.fields;
      i17 = 512;
      boolean bool12 = isSet(i6, i17);
      if (bool12)
      {
        i7 = paramRequestOptions.overrideWidth;
        this.overrideWidth = i7;
        i7 = paramRequestOptions.overrideHeight;
        this.overrideHeight = i7;
      }
      int i7 = paramRequestOptions.fields;
      i17 = 1024;
      boolean bool13 = isSet(i7, i17);
      if (bool13)
      {
        localObject1 = paramRequestOptions.signature;
        this.signature = ((Key)localObject1);
      }
      int i8 = paramRequestOptions.fields;
      i17 = 4096;
      boolean bool14 = isSet(i8, i17);
      if (bool14)
      {
        localObject1 = paramRequestOptions.resourceClass;
        this.resourceClass = ((Class)localObject1);
      }
      int i9 = paramRequestOptions.fields;
      i17 = 8192;
      boolean bool15 = isSet(i9, i17);
      if (bool15)
      {
        localObject1 = paramRequestOptions.fallbackDrawable;
        this.fallbackDrawable = ((Drawable)localObject1);
        this.fallbackId = 0;
        i10 = this.fields & 0xBFFF;
        this.fields = i10;
      }
      int i10 = paramRequestOptions.fields;
      i17 = 16384;
      boolean bool16 = isSet(i10, i17);
      if (bool16)
      {
        i11 = paramRequestOptions.fallbackId;
        this.fallbackId = i11;
        this.fallbackDrawable = null;
        i11 = this.fields & 0xDFFF;
        this.fields = i11;
      }
      int i11 = paramRequestOptions.fields;
      i17 = 32768;
      boolean bool17 = isSet(i11, i17);
      if (bool17)
      {
        localObject1 = paramRequestOptions.theme;
        this.theme = ((Resources.Theme)localObject1);
      }
      int i12 = paramRequestOptions.fields;
      i17 = 65536;
      boolean bool18 = isSet(i12, i17);
      if (bool18)
      {
        bool18 = paramRequestOptions.isTransformationAllowed;
        this.isTransformationAllowed = bool18;
      }
      int i13 = paramRequestOptions.fields;
      i17 = 131072;
      boolean bool19 = isSet(i13, i17);
      if (bool19)
      {
        bool19 = paramRequestOptions.isTransformationRequired;
        this.isTransformationRequired = bool19;
      }
      int i14 = paramRequestOptions.fields;
      i17 = 2048;
      boolean bool20 = isSet(i14, i17);
      if (bool20)
      {
        localObject1 = this.transformations;
        localObject2 = paramRequestOptions.transformations;
        ((Map)localObject1).putAll((Map)localObject2);
        bool20 = paramRequestOptions.isScaleOnlyOrNoTransform;
        this.isScaleOnlyOrNoTransform = bool20;
      }
      int i15 = paramRequestOptions.fields;
      i17 = 524288;
      boolean bool21 = isSet(i15, i17);
      if (bool21)
      {
        bool21 = paramRequestOptions.onlyRetrieveFromCache;
        this.onlyRetrieveFromCache = bool21;
      }
      bool21 = this.isTransformationAllowed;
      if (!bool21)
      {
        localObject1 = this.transformations;
        ((Map)localObject1).clear();
        i16 = this.fields & 0xF7FF;
        this.fields = i16;
        this.isTransformationRequired = false;
        i16 = this.fields;
        i17 = -131073;
        i16 &= i17;
        this.fields = i16;
        i16 = 1;
        f = Float.MIN_VALUE;
        this.isScaleOnlyOrNoTransform = i16;
      }
      int i16 = this.fields;
      i17 = paramRequestOptions.fields;
      i16 |= i17;
      this.fields = i16;
      localObject1 = this.options;
      Object localObject2 = paramRequestOptions.options;
      ((Options)localObject1).putAll((Options)localObject2);
    }
  }
  
  public RequestOptions autoClone()
  {
    boolean bool = this.isLocked;
    if (bool)
    {
      bool = this.isAutoCloneEnabled;
      if (!bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("You cannot auto lock an already locked options object, try clone() first");
        throw localIllegalStateException;
      }
    }
    this.isAutoCloneEnabled = true;
    return lock();
  }
  
  public RequestOptions centerCrop()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.CENTER_OUTSIDE;
    CenterCrop localCenterCrop = new com/bumptech/glide/load/resource/bitmap/CenterCrop;
    localCenterCrop.<init>();
    return transform(localDownsampleStrategy, localCenterCrop);
  }
  
  public RequestOptions centerInside()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.CENTER_INSIDE;
    CenterInside localCenterInside = new com/bumptech/glide/load/resource/bitmap/CenterInside;
    localCenterInside.<init>();
    return scaleOnlyTransform(localDownsampleStrategy, localCenterInside);
  }
  
  public RequestOptions circleCrop()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.CENTER_INSIDE;
    CircleCrop localCircleCrop = new com/bumptech/glide/load/resource/bitmap/CircleCrop;
    localCircleCrop.<init>();
    return transform(localDownsampleStrategy, localCircleCrop);
  }
  
  public RequestOptions clone()
  {
    try
    {
      Object localObject1 = super.clone();
      localObject1 = (RequestOptions)localObject1;
      localObject2 = new com/bumptech/glide/load/Options;
      ((Options)localObject2).<init>();
      ((RequestOptions)localObject1).options = ((Options)localObject2);
      localObject2 = ((RequestOptions)localObject1).options;
      Object localObject3 = this.options;
      ((Options)localObject2).putAll((Options)localObject3);
      localObject2 = new com/bumptech/glide/util/CachedHashCodeArrayMap;
      ((CachedHashCodeArrayMap)localObject2).<init>();
      ((RequestOptions)localObject1).transformations = ((Map)localObject2);
      localObject2 = ((RequestOptions)localObject1).transformations;
      localObject3 = this.transformations;
      ((Map)localObject2).putAll((Map)localObject3);
      localObject2 = null;
      ((RequestOptions)localObject1).isLocked = false;
      localObject2 = null;
      ((RequestOptions)localObject1).isAutoCloneEnabled = false;
      return (RequestOptions)localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localCloneNotSupportedException);
      throw ((Throwable)localObject2);
    }
  }
  
  public RequestOptions decode(Class paramClass)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (Object localObject = clone().decode(paramClass);; localObject = selfOrThrowIfLocked())
    {
      return (RequestOptions)localObject;
      localObject = (Class)Preconditions.checkNotNull(paramClass);
      this.resourceClass = ((Class)localObject);
      int i = this.fields | 0x1000;
      this.fields = i;
    }
  }
  
  public RequestOptions disallowHardwareConfig()
  {
    Option localOption = Downsampler.ALLOW_HARDWARE_CONFIG;
    Boolean localBoolean = Boolean.valueOf(false);
    return set(localOption, localBoolean);
  }
  
  public RequestOptions diskCacheStrategy(DiskCacheStrategy paramDiskCacheStrategy)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (Object localObject = clone().diskCacheStrategy(paramDiskCacheStrategy);; localObject = selfOrThrowIfLocked())
    {
      return (RequestOptions)localObject;
      localObject = (DiskCacheStrategy)Preconditions.checkNotNull(paramDiskCacheStrategy);
      this.diskCacheStrategy = ((DiskCacheStrategy)localObject);
      int i = this.fields | 0x4;
      this.fields = i;
    }
  }
  
  public RequestOptions dontAnimate()
  {
    Option localOption = GifOptions.DISABLE_ANIMATION;
    Boolean localBoolean = Boolean.valueOf(true);
    return set(localOption, localBoolean);
  }
  
  public RequestOptions dontTransform()
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().dontTransform();; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.transformations.clear();
      int i = this.fields & 0xF7FF;
      this.fields = i;
      this.isTransformationRequired = false;
      i = this.fields & 0xFFFDFFFF;
      this.fields = i;
      this.isTransformationAllowed = false;
      i = this.fields;
      int j = 65536;
      i |= j;
      this.fields = i;
      i = 1;
      this.isScaleOnlyOrNoTransform = i;
    }
  }
  
  public RequestOptions downsample(DownsampleStrategy paramDownsampleStrategy)
  {
    Option localOption = DownsampleStrategy.OPTION;
    Object localObject = Preconditions.checkNotNull(paramDownsampleStrategy);
    return set(localOption, localObject);
  }
  
  public RequestOptions encodeFormat(Bitmap.CompressFormat paramCompressFormat)
  {
    Option localOption = BitmapEncoder.COMPRESSION_FORMAT;
    Object localObject = Preconditions.checkNotNull(paramCompressFormat);
    return set(localOption, localObject);
  }
  
  public RequestOptions encodeQuality(int paramInt)
  {
    Option localOption = BitmapEncoder.COMPRESSION_QUALITY;
    Integer localInteger = Integer.valueOf(paramInt);
    return set(localOption, localInteger);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof RequestOptions;
    if (bool2)
    {
      paramObject = (RequestOptions)paramObject;
      float f1 = ((RequestOptions)paramObject).sizeMultiplier;
      float f2 = this.sizeMultiplier;
      int i = Float.compare(f1, f2);
      if (i == 0)
      {
        i = this.errorId;
        int n = ((RequestOptions)paramObject).errorId;
        if (i == n)
        {
          Object localObject1 = this.errorPlaceholder;
          Object localObject2 = ((RequestOptions)paramObject).errorPlaceholder;
          boolean bool3 = Util.bothNullOrEqual(localObject1, localObject2);
          if (bool3)
          {
            int j = this.placeholderId;
            n = ((RequestOptions)paramObject).placeholderId;
            if (j == n)
            {
              localObject1 = this.placeholderDrawable;
              localObject2 = ((RequestOptions)paramObject).placeholderDrawable;
              boolean bool4 = Util.bothNullOrEqual(localObject1, localObject2);
              if (bool4)
              {
                int k = this.fallbackId;
                n = ((RequestOptions)paramObject).fallbackId;
                if (k == n)
                {
                  localObject1 = this.fallbackDrawable;
                  localObject2 = ((RequestOptions)paramObject).fallbackDrawable;
                  boolean bool5 = Util.bothNullOrEqual(localObject1, localObject2);
                  if (bool5)
                  {
                    bool5 = this.isCacheable;
                    boolean bool7 = ((RequestOptions)paramObject).isCacheable;
                    if (bool5 == bool7)
                    {
                      int m = this.overrideHeight;
                      int i1 = ((RequestOptions)paramObject).overrideHeight;
                      if (m == i1)
                      {
                        m = this.overrideWidth;
                        i1 = ((RequestOptions)paramObject).overrideWidth;
                        if (m == i1)
                        {
                          boolean bool6 = this.isTransformationRequired;
                          boolean bool8 = ((RequestOptions)paramObject).isTransformationRequired;
                          if (bool6 == bool8)
                          {
                            bool6 = this.isTransformationAllowed;
                            bool8 = ((RequestOptions)paramObject).isTransformationAllowed;
                            if (bool6 == bool8)
                            {
                              bool6 = this.useUnlimitedSourceGeneratorsPool;
                              bool8 = ((RequestOptions)paramObject).useUnlimitedSourceGeneratorsPool;
                              if (bool6 == bool8)
                              {
                                bool6 = this.onlyRetrieveFromCache;
                                bool8 = ((RequestOptions)paramObject).onlyRetrieveFromCache;
                                if (bool6 == bool8)
                                {
                                  localObject1 = this.diskCacheStrategy;
                                  localObject2 = ((RequestOptions)paramObject).diskCacheStrategy;
                                  bool6 = localObject1.equals(localObject2);
                                  if (bool6)
                                  {
                                    localObject1 = this.priority;
                                    localObject2 = ((RequestOptions)paramObject).priority;
                                    if (localObject1 == localObject2)
                                    {
                                      localObject1 = this.options;
                                      localObject2 = ((RequestOptions)paramObject).options;
                                      bool6 = ((Options)localObject1).equals(localObject2);
                                      if (bool6)
                                      {
                                        localObject1 = this.transformations;
                                        localObject2 = ((RequestOptions)paramObject).transformations;
                                        bool6 = ((Map)localObject1).equals(localObject2);
                                        if (bool6)
                                        {
                                          localObject1 = this.resourceClass;
                                          localObject2 = ((RequestOptions)paramObject).resourceClass;
                                          bool6 = localObject1.equals(localObject2);
                                          if (bool6)
                                          {
                                            localObject1 = this.signature;
                                            localObject2 = ((RequestOptions)paramObject).signature;
                                            bool6 = Util.bothNullOrEqual(localObject1, localObject2);
                                            if (bool6)
                                            {
                                              localObject1 = this.theme;
                                              localObject2 = ((RequestOptions)paramObject).theme;
                                              bool6 = Util.bothNullOrEqual(localObject1, localObject2);
                                              if (bool6) {
                                                bool1 = true;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public RequestOptions error(int paramInt)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().error(paramInt);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.errorId = paramInt;
      int i = this.fields | 0x20;
      this.fields = i;
      this.errorPlaceholder = null;
      i = this.fields & 0xFFFFFFEF;
      this.fields = i;
    }
  }
  
  public RequestOptions error(Drawable paramDrawable)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().error(paramDrawable);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.errorPlaceholder = paramDrawable;
      int i = this.fields | 0x10;
      this.fields = i;
      this.errorId = 0;
      i = this.fields & 0xFFFFFFDF;
      this.fields = i;
    }
  }
  
  public RequestOptions fallback(int paramInt)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().fallback(paramInt);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.fallbackId = paramInt;
      int i = this.fields | 0x4000;
      this.fields = i;
      this.fallbackDrawable = null;
      i = this.fields & 0xDFFF;
      this.fields = i;
    }
  }
  
  public RequestOptions fallback(Drawable paramDrawable)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().fallback(paramDrawable);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.fallbackDrawable = paramDrawable;
      int i = this.fields | 0x2000;
      this.fields = i;
      this.fallbackId = 0;
      i = this.fields & 0xBFFF;
      this.fields = i;
    }
  }
  
  public RequestOptions fitCenter()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.FIT_CENTER;
    FitCenter localFitCenter = new com/bumptech/glide/load/resource/bitmap/FitCenter;
    localFitCenter.<init>();
    return scaleOnlyTransform(localDownsampleStrategy, localFitCenter);
  }
  
  public RequestOptions format(DecodeFormat paramDecodeFormat)
  {
    Preconditions.checkNotNull(paramDecodeFormat);
    Object localObject = Downsampler.DECODE_FORMAT;
    localObject = set((Option)localObject, paramDecodeFormat);
    Option localOption = GifOptions.DECODE_FORMAT;
    return ((RequestOptions)localObject).set(localOption, paramDecodeFormat);
  }
  
  public RequestOptions frame(long paramLong)
  {
    Option localOption = VideoDecoder.TARGET_FRAME;
    Long localLong = Long.valueOf(paramLong);
    return set(localOption, localLong);
  }
  
  public final DiskCacheStrategy getDiskCacheStrategy()
  {
    return this.diskCacheStrategy;
  }
  
  public final int getErrorId()
  {
    return this.errorId;
  }
  
  public final Drawable getErrorPlaceholder()
  {
    return this.errorPlaceholder;
  }
  
  public final Drawable getFallbackDrawable()
  {
    return this.fallbackDrawable;
  }
  
  public final int getFallbackId()
  {
    return this.fallbackId;
  }
  
  public final boolean getOnlyRetrieveFromCache()
  {
    return this.onlyRetrieveFromCache;
  }
  
  public final Options getOptions()
  {
    return this.options;
  }
  
  public final int getOverrideHeight()
  {
    return this.overrideHeight;
  }
  
  public final int getOverrideWidth()
  {
    return this.overrideWidth;
  }
  
  public final Drawable getPlaceholderDrawable()
  {
    return this.placeholderDrawable;
  }
  
  public final int getPlaceholderId()
  {
    return this.placeholderId;
  }
  
  public final Priority getPriority()
  {
    return this.priority;
  }
  
  public final Class getResourceClass()
  {
    return this.resourceClass;
  }
  
  public final Key getSignature()
  {
    return this.signature;
  }
  
  public final float getSizeMultiplier()
  {
    return this.sizeMultiplier;
  }
  
  public final Resources.Theme getTheme()
  {
    return this.theme;
  }
  
  public final Map getTransformations()
  {
    return this.transformations;
  }
  
  public final boolean getUseAnimationPool()
  {
    return this.useAnimationPool;
  }
  
  public final boolean getUseUnlimitedSourceGeneratorsPool()
  {
    return this.useUnlimitedSourceGeneratorsPool;
  }
  
  public int hashCode()
  {
    int i = Util.hashCode(this.sizeMultiplier);
    i = Util.hashCode(this.errorId, i);
    i = Util.hashCode(this.errorPlaceholder, i);
    i = Util.hashCode(this.placeholderId, i);
    i = Util.hashCode(this.placeholderDrawable, i);
    i = Util.hashCode(this.fallbackId, i);
    i = Util.hashCode(this.fallbackDrawable, i);
    i = Util.hashCode(this.isCacheable, i);
    i = Util.hashCode(this.overrideHeight, i);
    i = Util.hashCode(this.overrideWidth, i);
    i = Util.hashCode(this.isTransformationRequired, i);
    i = Util.hashCode(this.isTransformationAllowed, i);
    i = Util.hashCode(this.useUnlimitedSourceGeneratorsPool, i);
    i = Util.hashCode(this.onlyRetrieveFromCache, i);
    i = Util.hashCode(this.diskCacheStrategy, i);
    i = Util.hashCode(this.priority, i);
    i = Util.hashCode(this.options, i);
    i = Util.hashCode(this.transformations, i);
    i = Util.hashCode(this.resourceClass, i);
    i = Util.hashCode(this.signature, i);
    return Util.hashCode(this.theme, i);
  }
  
  protected boolean isAutoCloneEnabled()
  {
    return this.isAutoCloneEnabled;
  }
  
  public final boolean isDiskCacheStrategySet()
  {
    return isSet(4);
  }
  
  public final boolean isLocked()
  {
    return this.isLocked;
  }
  
  public final boolean isMemoryCacheable()
  {
    return this.isCacheable;
  }
  
  public final boolean isPrioritySet()
  {
    return isSet(8);
  }
  
  boolean isScaleOnlyOrNoTransform()
  {
    return this.isScaleOnlyOrNoTransform;
  }
  
  public final boolean isSkipMemoryCacheSet()
  {
    return isSet(256);
  }
  
  public final boolean isTransformationAllowed()
  {
    return this.isTransformationAllowed;
  }
  
  public final boolean isTransformationRequired()
  {
    return this.isTransformationRequired;
  }
  
  public final boolean isTransformationSet()
  {
    return isSet(2048);
  }
  
  public final boolean isValidOverride()
  {
    int i = this.overrideWidth;
    int j = this.overrideHeight;
    return Util.isValidDimensions(i, j);
  }
  
  public RequestOptions lock()
  {
    this.isLocked = true;
    return this;
  }
  
  public RequestOptions onlyRetrieveFromCache(boolean paramBoolean)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().onlyRetrieveFromCache(paramBoolean);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.onlyRetrieveFromCache = paramBoolean;
      int i = this.fields;
      int j = 524288;
      i |= j;
      this.fields = i;
    }
  }
  
  public RequestOptions optionalCenterCrop()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.CENTER_OUTSIDE;
    CenterCrop localCenterCrop = new com/bumptech/glide/load/resource/bitmap/CenterCrop;
    localCenterCrop.<init>();
    return optionalTransform(localDownsampleStrategy, localCenterCrop);
  }
  
  public RequestOptions optionalCenterInside()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.CENTER_INSIDE;
    CenterInside localCenterInside = new com/bumptech/glide/load/resource/bitmap/CenterInside;
    localCenterInside.<init>();
    return optionalScaleOnlyTransform(localDownsampleStrategy, localCenterInside);
  }
  
  public RequestOptions optionalCircleCrop()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.CENTER_OUTSIDE;
    CircleCrop localCircleCrop = new com/bumptech/glide/load/resource/bitmap/CircleCrop;
    localCircleCrop.<init>();
    return optionalTransform(localDownsampleStrategy, localCircleCrop);
  }
  
  public RequestOptions optionalFitCenter()
  {
    DownsampleStrategy localDownsampleStrategy = DownsampleStrategy.FIT_CENTER;
    FitCenter localFitCenter = new com/bumptech/glide/load/resource/bitmap/FitCenter;
    localFitCenter.<init>();
    return optionalScaleOnlyTransform(localDownsampleStrategy, localFitCenter);
  }
  
  public RequestOptions optionalTransform(Transformation paramTransformation)
  {
    return transform(paramTransformation, false);
  }
  
  final RequestOptions optionalTransform(DownsampleStrategy paramDownsampleStrategy, Transformation paramTransformation)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().optionalTransform(paramDownsampleStrategy, paramTransformation);; localRequestOptions = transform(paramTransformation, false))
    {
      return localRequestOptions;
      downsample(paramDownsampleStrategy);
      bool = false;
    }
  }
  
  public RequestOptions optionalTransform(Class paramClass, Transformation paramTransformation)
  {
    return transform(paramClass, paramTransformation, false);
  }
  
  public RequestOptions override(int paramInt)
  {
    return override(paramInt, paramInt);
  }
  
  public RequestOptions override(int paramInt1, int paramInt2)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().override(paramInt1, paramInt2);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.overrideWidth = paramInt1;
      this.overrideHeight = paramInt2;
      int i = this.fields | 0x200;
      this.fields = i;
    }
  }
  
  public RequestOptions placeholder(int paramInt)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().placeholder(paramInt);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.placeholderId = paramInt;
      int i = this.fields | 0x80;
      this.fields = i;
      this.placeholderDrawable = null;
      i = this.fields & 0xFFFFFFBF;
      this.fields = i;
    }
  }
  
  public RequestOptions placeholder(Drawable paramDrawable)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().placeholder(paramDrawable);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.placeholderDrawable = paramDrawable;
      int i = this.fields | 0x40;
      this.fields = i;
      this.placeholderId = 0;
      i = this.fields & 0xFF7F;
      this.fields = i;
    }
  }
  
  public RequestOptions priority(Priority paramPriority)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (Object localObject = clone().priority(paramPriority);; localObject = selfOrThrowIfLocked())
    {
      return (RequestOptions)localObject;
      localObject = (Priority)Preconditions.checkNotNull(paramPriority);
      this.priority = ((Priority)localObject);
      int i = this.fields | 0x8;
      this.fields = i;
    }
  }
  
  public RequestOptions set(Option paramOption, Object paramObject)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().set(paramOption, paramObject);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      Preconditions.checkNotNull(paramOption);
      Preconditions.checkNotNull(paramObject);
      this.options.set(paramOption, paramObject);
    }
  }
  
  public RequestOptions signature(Key paramKey)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (Object localObject = clone().signature(paramKey);; localObject = selfOrThrowIfLocked())
    {
      return (RequestOptions)localObject;
      localObject = (Key)Preconditions.checkNotNull(paramKey);
      this.signature = ((Key)localObject);
      int i = this.fields | 0x400;
      this.fields = i;
    }
  }
  
  public RequestOptions sizeMultiplier(float paramFloat)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (Object localObject = clone().sizeMultiplier(paramFloat);; localObject = selfOrThrowIfLocked())
    {
      return (RequestOptions)localObject;
      float f = 0.0F;
      localObject = null;
      bool = paramFloat < 0.0F;
      if (!bool)
      {
        f = 1.0F;
        bool = paramFloat < f;
        if (!bool) {}
      }
      else
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("sizeMultiplier must be between 0 and 1");
        throw ((Throwable)localObject);
      }
      this.sizeMultiplier = paramFloat;
      int i = this.fields | 0x2;
      this.fields = i;
    }
  }
  
  public RequestOptions skipMemoryCache(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = this.isAutoCloneEnabled;
    RequestOptions localRequestOptions2;
    if (bool2)
    {
      RequestOptions localRequestOptions1 = clone();
      localRequestOptions2 = localRequestOptions1.skipMemoryCache(bool1);
      return localRequestOptions2;
    }
    if (!paramBoolean) {}
    for (;;)
    {
      this.isCacheable = bool1;
      int i = this.fields | 0x100;
      this.fields = i;
      localRequestOptions2 = selfOrThrowIfLocked();
      break;
      i = 0;
      localRequestOptions2 = null;
    }
  }
  
  public RequestOptions theme(Resources.Theme paramTheme)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().theme(paramTheme);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.theme = paramTheme;
      int i = this.fields;
      int j = 32768;
      i |= j;
      this.fields = i;
    }
  }
  
  public RequestOptions timeout(int paramInt)
  {
    Option localOption = HttpGlideUrlLoader.TIMEOUT;
    Integer localInteger = Integer.valueOf(paramInt);
    return set(localOption, localInteger);
  }
  
  public RequestOptions transform(Transformation paramTransformation)
  {
    return transform(paramTransformation, true);
  }
  
  final RequestOptions transform(DownsampleStrategy paramDownsampleStrategy, Transformation paramTransformation)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().transform(paramDownsampleStrategy, paramTransformation);; localRequestOptions = transform(paramTransformation))
    {
      return localRequestOptions;
      downsample(paramDownsampleStrategy);
    }
  }
  
  public RequestOptions transform(Class paramClass, Transformation paramTransformation)
  {
    return transform(paramClass, paramTransformation, true);
  }
  
  public RequestOptions transforms(Transformation... paramVarArgs)
  {
    MultiTransformation localMultiTransformation = new com/bumptech/glide/load/MultiTransformation;
    localMultiTransformation.<init>(paramVarArgs);
    return transform(localMultiTransformation, true);
  }
  
  public RequestOptions useAnimationPool(boolean paramBoolean)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().useAnimationPool(paramBoolean);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.useAnimationPool = paramBoolean;
      int i = this.fields;
      int j = 1048576;
      i |= j;
      this.fields = i;
    }
  }
  
  public RequestOptions useUnlimitedSourceGeneratorsPool(boolean paramBoolean)
  {
    boolean bool = this.isAutoCloneEnabled;
    if (bool) {}
    for (RequestOptions localRequestOptions = clone().useUnlimitedSourceGeneratorsPool(paramBoolean);; localRequestOptions = selfOrThrowIfLocked())
    {
      return localRequestOptions;
      this.useUnlimitedSourceGeneratorsPool = paramBoolean;
      int i = this.fields;
      int j = 262144;
      i |= j;
      this.fields = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\RequestOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */