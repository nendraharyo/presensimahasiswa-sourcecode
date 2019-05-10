package com.bumptech.glide.disklrucache;

import java.util.concurrent.Callable;

class DiskLruCache$1
  implements Callable
{
  DiskLruCache$1(DiskLruCache paramDiskLruCache) {}
  
  public Void call()
  {
    synchronized (this.this$0)
    {
      Object localObject1 = this.this$0;
      localObject1 = DiskLruCache.access$100((DiskLruCache)localObject1);
      if (localObject1 == null) {
        return null;
      }
      localObject1 = this.this$0;
      DiskLruCache.access$200((DiskLruCache)localObject1);
      localObject1 = this.this$0;
      boolean bool = DiskLruCache.access$300((DiskLruCache)localObject1);
      if (bool)
      {
        localObject1 = this.this$0;
        DiskLruCache.access$400((DiskLruCache)localObject1);
        localObject1 = this.this$0;
        DiskLruCache.access$502((DiskLruCache)localObject1, 0);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\DiskLruCache$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */