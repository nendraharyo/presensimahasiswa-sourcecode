package com.bumptech.glide.load.resource.drawable;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder;
import com.bumptech.glide.request.transition.TransitionFactory;

public final class DrawableTransitionOptions
  extends TransitionOptions
{
  public static DrawableTransitionOptions with(TransitionFactory paramTransitionFactory)
  {
    DrawableTransitionOptions localDrawableTransitionOptions = new com/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;
    localDrawableTransitionOptions.<init>();
    return (DrawableTransitionOptions)localDrawableTransitionOptions.transition(paramTransitionFactory);
  }
  
  public static DrawableTransitionOptions withCrossFade()
  {
    DrawableTransitionOptions localDrawableTransitionOptions = new com/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;
    localDrawableTransitionOptions.<init>();
    return localDrawableTransitionOptions.crossFade();
  }
  
  public static DrawableTransitionOptions withCrossFade(int paramInt)
  {
    DrawableTransitionOptions localDrawableTransitionOptions = new com/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;
    localDrawableTransitionOptions.<init>();
    return localDrawableTransitionOptions.crossFade(paramInt);
  }
  
  public static DrawableTransitionOptions withCrossFade(DrawableCrossFadeFactory.Builder paramBuilder)
  {
    DrawableTransitionOptions localDrawableTransitionOptions = new com/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;
    localDrawableTransitionOptions.<init>();
    return localDrawableTransitionOptions.crossFade(paramBuilder);
  }
  
  public static DrawableTransitionOptions withCrossFade(DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    DrawableTransitionOptions localDrawableTransitionOptions = new com/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;
    localDrawableTransitionOptions.<init>();
    return localDrawableTransitionOptions.crossFade(paramDrawableCrossFadeFactory);
  }
  
  public DrawableTransitionOptions crossFade()
  {
    DrawableCrossFadeFactory.Builder localBuilder = new com/bumptech/glide/request/transition/DrawableCrossFadeFactory$Builder;
    localBuilder.<init>();
    return crossFade(localBuilder);
  }
  
  public DrawableTransitionOptions crossFade(int paramInt)
  {
    DrawableCrossFadeFactory.Builder localBuilder = new com/bumptech/glide/request/transition/DrawableCrossFadeFactory$Builder;
    localBuilder.<init>(paramInt);
    return crossFade(localBuilder);
  }
  
  public DrawableTransitionOptions crossFade(DrawableCrossFadeFactory.Builder paramBuilder)
  {
    DrawableCrossFadeFactory localDrawableCrossFadeFactory = paramBuilder.build();
    return crossFade(localDrawableCrossFadeFactory);
  }
  
  public DrawableTransitionOptions crossFade(DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    return (DrawableTransitionOptions)transition(paramDrawableCrossFadeFactory);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\drawable\DrawableTransitionOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */