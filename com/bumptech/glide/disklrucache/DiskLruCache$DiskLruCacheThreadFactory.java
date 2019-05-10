package com.bumptech.glide.disklrucache;

import java.util.concurrent.ThreadFactory;

final class DiskLruCache$DiskLruCacheThreadFactory
  implements ThreadFactory
{
  public Thread newThread(Runnable paramRunnable)
  {
    try
    {
      Thread localThread = new java/lang/Thread;
      String str = "glide-disk-lru-cache-thread";
      localThread.<init>(paramRunnable, str);
      int i = 1;
      localThread.setPriority(i);
      return localThread;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\DiskLruCache$DiskLruCacheThreadFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */