package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.BitmapTransitionFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder;
import com.bumptech.glide.request.transition.TransitionFactory;

public final class BitmapTransitionOptions
  extends TransitionOptions
{
  public static BitmapTransitionOptions with(TransitionFactory paramTransitionFactory)
  {
    BitmapTransitionOptions localBitmapTransitionOptions = new com/bumptech/glide/load/resource/bitmap/BitmapTransitionOptions;
    localBitmapTransitionOptions.<init>();
    return (BitmapTransitionOptions)localBitmapTransitionOptions.transition(paramTransitionFactory);
  }
  
  public static BitmapTransitionOptions withCrossFade()
  {
    BitmapTransitionOptions localBitmapTransitionOptions = new com/bumptech/glide/load/resource/bitmap/BitmapTransitionOptions;
    localBitmapTransitionOptions.<init>();
    return localBitmapTransitionOptions.crossFade();
  }
  
  public static BitmapTransitionOptions withCrossFade(int paramInt)
  {
    BitmapTransitionOptions localBitmapTransitionOptions = new com/bumptech/glide/load/resource/bitmap/BitmapTransitionOptions;
    localBitmapTransitionOptions.<init>();
    return localBitmapTransitionOptions.crossFade(paramInt);
  }
  
  public static BitmapTransitionOptions withCrossFade(DrawableCrossFadeFactory.Builder paramBuilder)
  {
    BitmapTransitionOptions localBitmapTransitionOptions = new com/bumptech/glide/load/resource/bitmap/BitmapTransitionOptions;
    localBitmapTransitionOptions.<init>();
    return localBitmapTransitionOptions.crossFade(paramBuilder);
  }
  
  public static BitmapTransitionOptions withCrossFade(DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    BitmapTransitionOptions localBitmapTransitionOptions = new com/bumptech/glide/load/resource/bitmap/BitmapTransitionOptions;
    localBitmapTransitionOptions.<init>();
    return localBitmapTransitionOptions.crossFade(paramDrawableCrossFadeFactory);
  }
  
  public static BitmapTransitionOptions withWrapped(TransitionFactory paramTransitionFactory)
  {
    BitmapTransitionOptions localBitmapTransitionOptions = new com/bumptech/glide/load/resource/bitmap/BitmapTransitionOptions;
    localBitmapTransitionOptions.<init>();
    return localBitmapTransitionOptions.transitionUsing(paramTransitionFactory);
  }
  
  public BitmapTransitionOptions crossFade()
  {
    DrawableCrossFadeFactory.Builder localBuilder = new com/bumptech/glide/request/transition/DrawableCrossFadeFactory$Builder;
    localBuilder.<init>();
    return crossFade(localBuilder);
  }
  
  public BitmapTransitionOptions crossFade(int paramInt)
  {
    DrawableCrossFadeFactory.Builder localBuilder = new com/bumptech/glide/request/transition/DrawableCrossFadeFactory$Builder;
    localBuilder.<init>(paramInt);
    return crossFade(localBuilder);
  }
  
  public BitmapTransitionOptions crossFade(DrawableCrossFadeFactory.Builder paramBuilder)
  {
    DrawableCrossFadeFactory localDrawableCrossFadeFactory = paramBuilder.build();
    return transitionUsing(localDrawableCrossFadeFactory);
  }
  
  public BitmapTransitionOptions crossFade(DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    return transitionUsing(paramDrawableCrossFadeFactory);
  }
  
  public BitmapTransitionOptions transitionUsing(TransitionFactory paramTransitionFactory)
  {
    BitmapTransitionFactory localBitmapTransitionFactory = new com/bumptech/glide/request/transition/BitmapTransitionFactory;
    localBitmapTransitionFactory.<init>(paramTransitionFactory);
    return (BitmapTransitionOptions)transition(localBitmapTransitionFactory);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapTransitionOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */