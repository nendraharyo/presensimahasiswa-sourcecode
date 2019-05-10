package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RequestBuilder
  implements ModelTypes, Cloneable
{
  protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
  private final Context context;
  private final RequestOptions defaultRequestOptions;
  private RequestBuilder errorBuilder;
  private final Glide glide;
  private final GlideContext glideContext;
  private boolean isDefaultTransitionOptionsSet = true;
  private boolean isModelSet;
  private boolean isThumbnailBuilt;
  private Object model;
  private List requestListeners;
  private final RequestManager requestManager;
  protected RequestOptions requestOptions;
  private Float thumbSizeMultiplier;
  private RequestBuilder thumbnailBuilder;
  private final Class transcodeClass;
  private TransitionOptions transitionOptions;
  
  static
  {
    RequestOptions localRequestOptions = new com/bumptech/glide/request/RequestOptions;
    localRequestOptions.<init>();
    Object localObject = DiskCacheStrategy.DATA;
    localRequestOptions = localRequestOptions.diskCacheStrategy((DiskCacheStrategy)localObject);
    localObject = Priority.LOW;
    DOWNLOAD_ONLY_OPTIONS = localRequestOptions.priority((Priority)localObject).skipMemoryCache(true);
  }
  
  protected RequestBuilder(Glide paramGlide, RequestManager paramRequestManager, Class paramClass, Context paramContext)
  {
    this.glide = paramGlide;
    this.requestManager = paramRequestManager;
    this.transcodeClass = paramClass;
    Object localObject = paramRequestManager.getDefaultRequestOptions();
    this.defaultRequestOptions = ((RequestOptions)localObject);
    this.context = paramContext;
    localObject = paramRequestManager.getDefaultTransitionOptions(paramClass);
    this.transitionOptions = ((TransitionOptions)localObject);
    localObject = this.defaultRequestOptions;
    this.requestOptions = ((RequestOptions)localObject);
    localObject = paramGlide.getGlideContext();
    this.glideContext = ((GlideContext)localObject);
  }
  
  protected RequestBuilder(Class paramClass, RequestBuilder paramRequestBuilder)
  {
    this((Glide)localObject, localRequestManager, paramClass, localContext);
    localObject = paramRequestBuilder.model;
    this.model = localObject;
    boolean bool = paramRequestBuilder.isModelSet;
    this.isModelSet = bool;
    localObject = paramRequestBuilder.requestOptions;
    this.requestOptions = ((RequestOptions)localObject);
  }
  
  private Request buildRequest(Target paramTarget, RequestListener paramRequestListener, RequestOptions paramRequestOptions)
  {
    TransitionOptions localTransitionOptions = this.transitionOptions;
    Priority localPriority = paramRequestOptions.getPriority();
    int i = paramRequestOptions.getOverrideWidth();
    int j = paramRequestOptions.getOverrideHeight();
    return buildRequestRecursive(paramTarget, paramRequestListener, null, localTransitionOptions, localPriority, i, j, paramRequestOptions);
  }
  
  private Request buildRequestRecursive(Target paramTarget, RequestListener paramRequestListener, RequestCoordinator paramRequestCoordinator, TransitionOptions paramTransitionOptions, Priority paramPriority, int paramInt1, int paramInt2, RequestOptions paramRequestOptions)
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = this.errorBuilder;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject1 = new com/bumptech/glide/request/ErrorRequestCoordinator;
      ((ErrorRequestCoordinator)localObject1).<init>(paramRequestCoordinator);
      localObject3 = localObject1;
    }
    for (Object localObject4 = localObject1;; localObject4 = paramRequestCoordinator)
    {
      localObject1 = this;
      localObject2 = paramTarget;
      TransitionOptions localTransitionOptions = paramTransitionOptions;
      Priority localPriority = paramPriority;
      int i = paramInt1;
      int j = paramInt2;
      RequestOptions localRequestOptions = paramRequestOptions;
      Request localRequest = buildThumbnailRequestRecursive(paramTarget, paramRequestListener, (RequestCoordinator)localObject4, paramTransitionOptions, paramPriority, paramInt1, paramInt2, paramRequestOptions);
      if (localObject3 == null) {
        localObject3 = localRequest;
      }
      for (;;)
      {
        return (Request)localObject3;
        i = this.errorBuilder.requestOptions.getOverrideWidth();
        localObject1 = this.errorBuilder.requestOptions;
        j = ((RequestOptions)localObject1).getOverrideHeight();
        bool = Util.isValidDimensions(paramInt1, paramInt2);
        if (bool)
        {
          localObject1 = this.errorBuilder.requestOptions;
          bool = ((RequestOptions)localObject1).isValidOverride();
          if (!bool)
          {
            i = paramRequestOptions.getOverrideWidth();
            j = paramRequestOptions.getOverrideHeight();
          }
        }
        localObject1 = this.errorBuilder;
        localTransitionOptions = this.errorBuilder.transitionOptions;
        localPriority = this.errorBuilder.requestOptions.getPriority();
        localRequestOptions = this.errorBuilder.requestOptions;
        localObject2 = paramTarget;
        localObject4 = localObject3;
        localObject1 = ((RequestBuilder)localObject1).buildRequestRecursive(paramTarget, paramRequestListener, (RequestCoordinator)localObject3, localTransitionOptions, localPriority, i, j, localRequestOptions);
        ((ErrorRequestCoordinator)localObject3).setRequests(localRequest, (Request)localObject1);
      }
      localObject3 = null;
    }
  }
  
  private Request buildThumbnailRequestRecursive(Target paramTarget, RequestListener paramRequestListener, RequestCoordinator paramRequestCoordinator, TransitionOptions paramTransitionOptions, Priority paramPriority, int paramInt1, int paramInt2, RequestOptions paramRequestOptions)
  {
    Object localObject1 = this.thumbnailBuilder;
    boolean bool1;
    Object localObject2;
    if (localObject1 != null)
    {
      bool1 = this.isThumbnailBuilt;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        throw ((Throwable)localObject1);
      }
      localObject1 = this.thumbnailBuilder.transitionOptions;
      localObject2 = this.thumbnailBuilder;
      boolean bool2 = ((RequestBuilder)localObject2).isDefaultTransitionOptionsSet;
      if (!bool2) {
        break label518;
      }
    }
    label507:
    label518:
    for (Object localObject3 = paramTransitionOptions;; localObject3 = localObject1)
    {
      localObject1 = this.thumbnailBuilder.requestOptions;
      bool1 = ((RequestOptions)localObject1).isPrioritySet();
      Object localObject4;
      int j;
      int i;
      boolean bool3;
      Object localObject5;
      int k;
      if (bool1)
      {
        localObject1 = this.thumbnailBuilder.requestOptions.getPriority();
        localObject4 = localObject1;
        j = this.thumbnailBuilder.requestOptions.getOverrideWidth();
        localObject1 = this.thumbnailBuilder.requestOptions;
        i = ((RequestOptions)localObject1).getOverrideHeight();
        bool3 = Util.isValidDimensions(paramInt1, paramInt2);
        if (!bool3) {
          break label507;
        }
        localObject5 = this.thumbnailBuilder.requestOptions;
        bool3 = ((RequestOptions)localObject5).isValidOverride();
        if (bool3) {
          break label507;
        }
        j = paramRequestOptions.getOverrideWidth();
        i = paramRequestOptions.getOverrideHeight();
        k = i;
      }
      for (int m = j;; m = j)
      {
        Object localObject6 = new com/bumptech/glide/request/ThumbnailRequestCoordinator;
        ((ThumbnailRequestCoordinator)localObject6).<init>(paramRequestCoordinator);
        localObject1 = this;
        localObject2 = paramTarget;
        localObject5 = paramRequestListener;
        Object localObject7 = paramRequestOptions;
        Object localObject8 = paramPriority;
        localObject1 = obtainRequest(paramTarget, paramRequestListener, paramRequestOptions, (RequestCoordinator)localObject6, paramTransitionOptions, paramPriority, paramInt1, paramInt2);
        j = 1;
        float f = Float.MIN_VALUE;
        this.isThumbnailBuilt = j;
        localObject2 = this.thumbnailBuilder;
        Object localObject9 = this.thumbnailBuilder.requestOptions;
        localObject5 = paramTarget;
        localObject7 = paramRequestListener;
        localObject8 = localObject4;
        localObject2 = ((RequestBuilder)localObject2).buildRequestRecursive(paramTarget, paramRequestListener, (RequestCoordinator)localObject6, (TransitionOptions)localObject3, (Priority)localObject4, m, k, (RequestOptions)localObject9);
        bool3 = false;
        localObject5 = null;
        this.isThumbnailBuilt = false;
        ((ThumbnailRequestCoordinator)localObject6).setRequests((Request)localObject1, (Request)localObject2);
        for (;;)
        {
          return (Request)localObject6;
          localObject1 = getThumbnailPriority(paramPriority);
          localObject4 = localObject1;
          break;
          localObject1 = this.thumbSizeMultiplier;
          if (localObject1 != null)
          {
            localObject6 = new com/bumptech/glide/request/ThumbnailRequestCoordinator;
            ((ThumbnailRequestCoordinator)localObject6).<init>(paramRequestCoordinator);
            localObject1 = this;
            localObject2 = paramTarget;
            localObject5 = paramRequestListener;
            localObject7 = paramRequestOptions;
            localObject8 = paramPriority;
            localObject9 = obtainRequest(paramTarget, paramRequestListener, paramRequestOptions, (RequestCoordinator)localObject6, paramTransitionOptions, paramPriority, paramInt1, paramInt2);
            localObject1 = paramRequestOptions.clone();
            f = this.thumbSizeMultiplier.floatValue();
            localObject7 = ((RequestOptions)localObject1).sizeMultiplier(f);
            localObject8 = getThumbnailPriority(paramPriority);
            localObject1 = this;
            localObject2 = paramTarget;
            localObject1 = obtainRequest(paramTarget, paramRequestListener, (RequestOptions)localObject7, (RequestCoordinator)localObject6, paramTransitionOptions, (Priority)localObject8, paramInt1, paramInt2);
            ((ThumbnailRequestCoordinator)localObject6).setRequests((Request)localObject9, (Request)localObject1);
          }
          else
          {
            localObject1 = this;
            localObject2 = paramTarget;
            localObject5 = paramRequestListener;
            localObject7 = paramRequestOptions;
            localObject6 = paramRequestCoordinator;
            localObject8 = paramPriority;
            localObject6 = obtainRequest(paramTarget, paramRequestListener, paramRequestOptions, paramRequestCoordinator, paramTransitionOptions, paramPriority, paramInt1, paramInt2);
          }
        }
        k = i;
      }
    }
  }
  
  private Priority getThumbnailPriority(Priority paramPriority)
  {
    Object localObject1 = RequestBuilder.2.$SwitchMap$com$bumptech$glide$Priority;
    int i = paramPriority.ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("unknown priority: ");
      Priority localPriority = this.requestOptions.getPriority();
      localObject2 = localPriority;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = Priority.NORMAL;
    }
    for (;;)
    {
      return (Priority)localObject1;
      localObject1 = Priority.HIGH;
      continue;
      localObject1 = Priority.IMMEDIATE;
    }
  }
  
  private Target into(Target paramTarget, RequestListener paramRequestListener, RequestOptions paramRequestOptions)
  {
    Util.assertMainThread();
    Preconditions.checkNotNull(paramTarget);
    boolean bool1 = this.isModelSet;
    if (!bool1)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("You must call #load() before calling #into()");
      throw ((Throwable)localObject);
    }
    Object localObject = paramRequestOptions.autoClone();
    Request localRequest1 = buildRequest(paramTarget, paramRequestListener, (RequestOptions)localObject);
    Request localRequest2 = paramTarget.getRequest();
    boolean bool2 = localRequest1.isEquivalentTo(localRequest2);
    if (bool2)
    {
      bool1 = isSkipMemoryCacheWithCompletePreviousRequest((RequestOptions)localObject, localRequest2);
      if (!bool1)
      {
        localRequest1.recycle();
        localObject = (Request)Preconditions.checkNotNull(localRequest2);
        bool1 = ((Request)localObject).isRunning();
        if (!bool1) {
          localRequest2.begin();
        }
      }
    }
    for (;;)
    {
      return paramTarget;
      this.requestManager.clear(paramTarget);
      paramTarget.setRequest(localRequest1);
      localObject = this.requestManager;
      ((RequestManager)localObject).track(paramTarget, localRequest1);
    }
  }
  
  private boolean isSkipMemoryCacheWithCompletePreviousRequest(RequestOptions paramRequestOptions, Request paramRequest)
  {
    boolean bool = paramRequestOptions.isMemoryCacheable();
    if (!bool)
    {
      bool = paramRequest.isComplete();
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private RequestBuilder loadGeneric(Object paramObject)
  {
    this.model = paramObject;
    this.isModelSet = true;
    return this;
  }
  
  private Request obtainRequest(Target paramTarget, RequestListener paramRequestListener, RequestOptions paramRequestOptions, RequestCoordinator paramRequestCoordinator, TransitionOptions paramTransitionOptions, Priority paramPriority, int paramInt1, int paramInt2)
  {
    Context localContext = this.context;
    GlideContext localGlideContext = this.glideContext;
    Object localObject = this.model;
    Class localClass = this.transcodeClass;
    List localList = this.requestListeners;
    Engine localEngine = this.glideContext.getEngine();
    TransitionFactory localTransitionFactory = paramTransitionOptions.getTransitionFactory();
    return SingleRequest.obtain(localContext, localGlideContext, localObject, localClass, paramRequestOptions, paramInt1, paramInt2, paramPriority, paramTarget, paramRequestListener, localList, paramRequestCoordinator, localEngine, localTransitionFactory);
  }
  
  public RequestBuilder addListener(RequestListener paramRequestListener)
  {
    if (paramRequestListener != null)
    {
      Object localObject = this.requestListeners;
      if (localObject == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.requestListeners = ((List)localObject);
      }
      localObject = this.requestListeners;
      ((List)localObject).add(paramRequestListener);
    }
    return this;
  }
  
  public RequestBuilder apply(RequestOptions paramRequestOptions)
  {
    Preconditions.checkNotNull(paramRequestOptions);
    RequestOptions localRequestOptions = getMutableOptions().apply(paramRequestOptions);
    this.requestOptions = localRequestOptions;
    return this;
  }
  
  public RequestBuilder clone()
  {
    try
    {
      Object localObject1 = super.clone();
      localObject1 = (RequestBuilder)localObject1;
      localObject2 = ((RequestBuilder)localObject1).requestOptions;
      localObject2 = ((RequestOptions)localObject2).clone();
      ((RequestBuilder)localObject1).requestOptions = ((RequestOptions)localObject2);
      localObject2 = ((RequestBuilder)localObject1).transitionOptions;
      localObject2 = ((TransitionOptions)localObject2).clone();
      ((RequestBuilder)localObject1).transitionOptions = ((TransitionOptions)localObject2);
      return (RequestBuilder)localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localCloneNotSupportedException);
      throw ((Throwable)localObject2);
    }
  }
  
  public FutureTarget downloadOnly(int paramInt1, int paramInt2)
  {
    return getDownloadOnlyRequest().submit(paramInt1, paramInt2);
  }
  
  public Target downloadOnly(Target paramTarget)
  {
    return getDownloadOnlyRequest().into(paramTarget);
  }
  
  public RequestBuilder error(RequestBuilder paramRequestBuilder)
  {
    this.errorBuilder = paramRequestBuilder;
    return this;
  }
  
  protected RequestBuilder getDownloadOnlyRequest()
  {
    RequestBuilder localRequestBuilder = new com/bumptech/glide/RequestBuilder;
    localRequestBuilder.<init>(File.class, this);
    RequestOptions localRequestOptions = DOWNLOAD_ONLY_OPTIONS;
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  protected RequestOptions getMutableOptions()
  {
    RequestOptions localRequestOptions1 = this.defaultRequestOptions;
    RequestOptions localRequestOptions2 = this.requestOptions;
    if (localRequestOptions1 == localRequestOptions2) {}
    for (localRequestOptions1 = this.requestOptions.clone();; localRequestOptions1 = this.requestOptions) {
      return localRequestOptions1;
    }
  }
  
  public FutureTarget into(int paramInt1, int paramInt2)
  {
    return submit(paramInt1, paramInt2);
  }
  
  public Target into(Target paramTarget)
  {
    return into(paramTarget, null);
  }
  
  Target into(Target paramTarget, RequestListener paramRequestListener)
  {
    RequestOptions localRequestOptions = getMutableOptions();
    return into(paramTarget, paramRequestListener, localRequestOptions);
  }
  
  public ViewTarget into(ImageView paramImageView)
  {
    Util.assertMainThread();
    Preconditions.checkNotNull(paramImageView);
    RequestOptions localRequestOptions = this.requestOptions;
    boolean bool = localRequestOptions.isTransformationSet();
    Object localObject1;
    Object localObject2;
    if (!bool)
    {
      bool = localRequestOptions.isTransformationAllowed();
      if (bool)
      {
        localObject1 = paramImageView.getScaleType();
        if (localObject1 != null)
        {
          localObject1 = RequestBuilder.2.$SwitchMap$android$widget$ImageView$ScaleType;
          localObject2 = paramImageView.getScaleType();
          int j = ((ImageView.ScaleType)localObject2).ordinal();
          int i = localObject1[j];
          switch (i)
          {
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = this.glideContext;
      localObject2 = this.transcodeClass;
      localObject1 = ((GlideContext)localObject1).buildImageViewTarget(paramImageView, (Class)localObject2);
      return (ViewTarget)into((Target)localObject1, null, localRequestOptions);
      localRequestOptions = localRequestOptions.clone().optionalCenterCrop();
      continue;
      localRequestOptions = localRequestOptions.clone().optionalCenterInside();
      continue;
      localRequestOptions = localRequestOptions.clone().optionalFitCenter();
      continue;
      localRequestOptions = localRequestOptions.clone().optionalCenterInside();
    }
  }
  
  public RequestBuilder listener(RequestListener paramRequestListener)
  {
    this.requestListeners = null;
    return addListener(paramRequestListener);
  }
  
  public RequestBuilder load(Bitmap paramBitmap)
  {
    RequestBuilder localRequestBuilder = loadGeneric(paramBitmap);
    RequestOptions localRequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE);
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  public RequestBuilder load(Drawable paramDrawable)
  {
    RequestBuilder localRequestBuilder = loadGeneric(paramDrawable);
    RequestOptions localRequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE);
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  public RequestBuilder load(Uri paramUri)
  {
    return loadGeneric(paramUri);
  }
  
  public RequestBuilder load(File paramFile)
  {
    return loadGeneric(paramFile);
  }
  
  public RequestBuilder load(Integer paramInteger)
  {
    RequestBuilder localRequestBuilder = loadGeneric(paramInteger);
    RequestOptions localRequestOptions = RequestOptions.signatureOf(ApplicationVersionSignature.obtain(this.context));
    return localRequestBuilder.apply(localRequestOptions);
  }
  
  public RequestBuilder load(Object paramObject)
  {
    return loadGeneric(paramObject);
  }
  
  public RequestBuilder load(String paramString)
  {
    return loadGeneric(paramString);
  }
  
  public RequestBuilder load(URL paramURL)
  {
    return loadGeneric(paramURL);
  }
  
  public RequestBuilder load(byte[] paramArrayOfByte)
  {
    RequestBuilder localRequestBuilder = loadGeneric(paramArrayOfByte);
    RequestOptions localRequestOptions = localRequestBuilder.requestOptions;
    boolean bool = localRequestOptions.isDiskCacheStrategySet();
    if (!bool)
    {
      localRequestOptions = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE);
      localRequestBuilder = localRequestBuilder.apply(localRequestOptions);
    }
    localRequestOptions = localRequestBuilder.requestOptions;
    bool = localRequestOptions.isSkipMemoryCacheSet();
    if (!bool)
    {
      bool = true;
      localRequestOptions = RequestOptions.skipMemoryCacheOf(bool);
      localRequestBuilder = localRequestBuilder.apply(localRequestOptions);
    }
    return localRequestBuilder;
  }
  
  public Target preload()
  {
    int i = -1 << -1;
    return preload(i, i);
  }
  
  public Target preload(int paramInt1, int paramInt2)
  {
    PreloadTarget localPreloadTarget = PreloadTarget.obtain(this.requestManager, paramInt1, paramInt2);
    return into(localPreloadTarget);
  }
  
  public FutureTarget submit()
  {
    int i = -1 << -1;
    return submit(i, i);
  }
  
  public FutureTarget submit(int paramInt1, int paramInt2)
  {
    RequestFutureTarget localRequestFutureTarget = new com/bumptech/glide/request/RequestFutureTarget;
    Handler localHandler = this.glideContext.getMainHandler();
    localRequestFutureTarget.<init>(localHandler, paramInt1, paramInt2);
    boolean bool = Util.isOnBackgroundThread();
    if (bool)
    {
      localHandler = this.glideContext.getMainHandler();
      RequestBuilder.1 local1 = new com/bumptech/glide/RequestBuilder$1;
      local1.<init>(this, localRequestFutureTarget);
      localHandler.post(local1);
    }
    for (;;)
    {
      return localRequestFutureTarget;
      into(localRequestFutureTarget, localRequestFutureTarget);
    }
  }
  
  public RequestBuilder thumbnail(float paramFloat)
  {
    float f = 0.0F;
    Object localObject = null;
    boolean bool = paramFloat < 0.0F;
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
    localObject = Float.valueOf(paramFloat);
    this.thumbSizeMultiplier = ((Float)localObject);
    return this;
  }
  
  public RequestBuilder thumbnail(RequestBuilder paramRequestBuilder)
  {
    this.thumbnailBuilder = paramRequestBuilder;
    return this;
  }
  
  public RequestBuilder thumbnail(RequestBuilder... paramVarArgs)
  {
    Object localObject = null;
    int i;
    if (paramVarArgs != null)
    {
      i = paramVarArgs.length;
      if (i != 0) {}
    }
    else
    {
      localObject = (RequestBuilder)null;
    }
    for (localObject = thumbnail(null);; localObject = thumbnail((RequestBuilder)localObject))
    {
      return (RequestBuilder)localObject;
      i = paramVarArgs.length + -1;
      int j = i;
      if (j >= 0)
      {
        RequestBuilder localRequestBuilder = paramVarArgs[j];
        if (localRequestBuilder == null) {}
        for (;;)
        {
          i = j + -1;
          j = i;
          break;
          if (localObject == null) {
            localObject = localRequestBuilder;
          } else {
            localObject = localRequestBuilder.thumbnail((RequestBuilder)localObject);
          }
        }
      }
    }
  }
  
  public RequestBuilder transition(TransitionOptions paramTransitionOptions)
  {
    TransitionOptions localTransitionOptions = (TransitionOptions)Preconditions.checkNotNull(paramTransitionOptions);
    this.transitionOptions = localTransitionOptions;
    this.isDefaultTransitionOptionsSet = false;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\RequestBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */