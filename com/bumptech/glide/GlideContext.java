package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GlideContext
  extends ContextWrapper
{
  static final TransitionOptions DEFAULT_TRANSITION_OPTIONS;
  private final ArrayPool arrayPool;
  private final RequestOptions defaultRequestOptions;
  private final Map defaultTransitionOptions;
  private final Engine engine;
  private final ImageViewTargetFactory imageViewTargetFactory;
  private final int logLevel;
  private final Handler mainHandler;
  private final Registry registry;
  
  static
  {
    GenericTransitionOptions localGenericTransitionOptions = new com/bumptech/glide/GenericTransitionOptions;
    localGenericTransitionOptions.<init>();
    DEFAULT_TRANSITION_OPTIONS = localGenericTransitionOptions;
  }
  
  public GlideContext(Context paramContext, ArrayPool paramArrayPool, Registry paramRegistry, ImageViewTargetFactory paramImageViewTargetFactory, RequestOptions paramRequestOptions, Map paramMap, Engine paramEngine, int paramInt)
  {
    super((Context)localObject);
    this.arrayPool = paramArrayPool;
    this.registry = paramRegistry;
    this.imageViewTargetFactory = paramImageViewTargetFactory;
    this.defaultRequestOptions = paramRequestOptions;
    this.defaultTransitionOptions = paramMap;
    this.engine = paramEngine;
    this.logLevel = paramInt;
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    this.mainHandler = ((Handler)localObject);
  }
  
  public ViewTarget buildImageViewTarget(ImageView paramImageView, Class paramClass)
  {
    return this.imageViewTargetFactory.buildTarget(paramImageView, paramClass);
  }
  
  public ArrayPool getArrayPool()
  {
    return this.arrayPool;
  }
  
  public RequestOptions getDefaultRequestOptions()
  {
    return this.defaultRequestOptions;
  }
  
  public TransitionOptions getDefaultTransitionOptions(Class paramClass)
  {
    Object localObject1 = (TransitionOptions)this.defaultTransitionOptions.get(paramClass);
    Object localObject3;
    if (localObject1 == null)
    {
      Object localObject2 = this.defaultTransitionOptions.entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      localObject3 = localObject1;
      boolean bool1 = localIterator.hasNext();
      if (bool1)
      {
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = (Class)((Map.Entry)localObject1).getKey();
        boolean bool2 = ((Class)localObject2).isAssignableFrom(paramClass);
        if (!bool2) {
          break label115;
        }
      }
    }
    label115:
    for (localObject1 = (TransitionOptions)((Map.Entry)localObject1).getValue();; localObject1 = localObject3)
    {
      localObject3 = localObject1;
      break;
      localObject1 = localObject3;
      if (localObject1 == null) {
        localObject1 = DEFAULT_TRANSITION_OPTIONS;
      }
      return (TransitionOptions)localObject1;
    }
  }
  
  public Engine getEngine()
  {
    return this.engine;
  }
  
  public int getLogLevel()
  {
    return this.logLevel;
  }
  
  public Handler getMainHandler()
  {
    return this.mainHandler;
  }
  
  public Registry getRegistry()
  {
    return this.registry;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\GlideContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */