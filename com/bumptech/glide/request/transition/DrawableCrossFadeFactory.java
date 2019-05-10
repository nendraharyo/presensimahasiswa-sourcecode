package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

public class DrawableCrossFadeFactory
  implements TransitionFactory
{
  private final int duration;
  private final boolean isCrossFadeEnabled;
  private DrawableCrossFadeTransition resourceTransition;
  
  protected DrawableCrossFadeFactory(int paramInt, boolean paramBoolean)
  {
    this.duration = paramInt;
    this.isCrossFadeEnabled = paramBoolean;
  }
  
  private Transition getResourceTransition()
  {
    DrawableCrossFadeTransition localDrawableCrossFadeTransition = this.resourceTransition;
    if (localDrawableCrossFadeTransition == null)
    {
      localDrawableCrossFadeTransition = new com/bumptech/glide/request/transition/DrawableCrossFadeTransition;
      int i = this.duration;
      boolean bool = this.isCrossFadeEnabled;
      localDrawableCrossFadeTransition.<init>(i, bool);
      this.resourceTransition = localDrawableCrossFadeTransition;
    }
    return this.resourceTransition;
  }
  
  public Transition build(DataSource paramDataSource, boolean paramBoolean)
  {
    Object localObject = DataSource.MEMORY_CACHE;
    if (paramDataSource == localObject) {}
    for (localObject = NoTransition.get();; localObject = getResourceTransition()) {
      return (Transition)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\DrawableCrossFadeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */