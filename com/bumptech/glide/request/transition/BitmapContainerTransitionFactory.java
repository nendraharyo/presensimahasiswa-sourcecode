package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DataSource;

public abstract class BitmapContainerTransitionFactory
  implements TransitionFactory
{
  private final TransitionFactory realFactory;
  
  public BitmapContainerTransitionFactory(TransitionFactory paramTransitionFactory)
  {
    this.realFactory = paramTransitionFactory;
  }
  
  public Transition build(DataSource paramDataSource, boolean paramBoolean)
  {
    Transition localTransition = this.realFactory.build(paramDataSource, paramBoolean);
    BitmapContainerTransitionFactory.BitmapGlideAnimation localBitmapGlideAnimation = new com/bumptech/glide/request/transition/BitmapContainerTransitionFactory$BitmapGlideAnimation;
    localBitmapGlideAnimation.<init>(this, localTransition);
    return localBitmapGlideAnimation;
  }
  
  protected abstract Bitmap getBitmap(Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\BitmapContainerTransitionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */