package com.bumptech.glide.load.model;

import com.bumptech.glide.util.Util;
import java.util.Queue;

final class ModelCache$ModelKey
{
  private static final Queue KEY_QUEUE = Util.createQueue(0);
  private int height;
  private Object model;
  private int width;
  
  static ModelKey get(Object paramObject, int paramInt1, int paramInt2)
  {
    synchronized (KEY_QUEUE)
    {
      Object localObject1 = KEY_QUEUE;
      localObject1 = ((Queue)localObject1).poll();
      localObject1 = (ModelKey)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/load/model/ModelCache$ModelKey;
        ((ModelKey)localObject1).<init>();
      }
      ((ModelKey)localObject1).init(paramObject, paramInt1, paramInt2);
      return (ModelKey)localObject1;
    }
  }
  
  private void init(Object paramObject, int paramInt1, int paramInt2)
  {
    this.model = paramObject;
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof ModelKey;
    if (bool2)
    {
      paramObject = (ModelKey)paramObject;
      int i = this.width;
      int j = ((ModelKey)paramObject).width;
      if (i == j)
      {
        i = this.height;
        j = ((ModelKey)paramObject).height;
        if (i == j)
        {
          Object localObject1 = this.model;
          Object localObject2 = ((ModelKey)paramObject).model;
          boolean bool3 = localObject1.equals(localObject2);
          if (bool3) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    int i = this.height * 31;
    int j = this.width;
    i = (i + j) * 31;
    j = this.model.hashCode();
    return i + j;
  }
  
  public void release()
  {
    synchronized (KEY_QUEUE)
    {
      Queue localQueue2 = KEY_QUEUE;
      localQueue2.offer(this);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelCache$ModelKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */