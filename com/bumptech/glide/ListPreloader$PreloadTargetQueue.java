package com.bumptech.glide;

import com.bumptech.glide.util.Util;
import java.util.Queue;

final class ListPreloader$PreloadTargetQueue
{
  private final Queue queue;
  
  ListPreloader$PreloadTargetQueue(int paramInt)
  {
    Queue localQueue1 = Util.createQueue(paramInt);
    this.queue = localQueue1;
    int i = 0;
    localQueue1 = null;
    while (i < paramInt)
    {
      Queue localQueue2 = this.queue;
      ListPreloader.PreloadTarget localPreloadTarget = new com/bumptech/glide/ListPreloader$PreloadTarget;
      localPreloadTarget.<init>();
      localQueue2.offer(localPreloadTarget);
      i += 1;
    }
  }
  
  public ListPreloader.PreloadTarget next(int paramInt1, int paramInt2)
  {
    ListPreloader.PreloadTarget localPreloadTarget = (ListPreloader.PreloadTarget)this.queue.poll();
    this.queue.offer(localPreloadTarget);
    localPreloadTarget.photoWidth = paramInt1;
    localPreloadTarget.photoHeight = paramInt2;
    return localPreloadTarget;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\ListPreloader$PreloadTargetQueue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */