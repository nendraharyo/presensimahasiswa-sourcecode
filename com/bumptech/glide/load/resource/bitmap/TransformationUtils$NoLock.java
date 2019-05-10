package com.bumptech.glide.load.resource.bitmap;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class TransformationUtils$NoLock
  implements Lock
{
  public void lock() {}
  
  public void lockInterruptibly() {}
  
  public Condition newCondition()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Should not be called");
    throw localUnsupportedOperationException;
  }
  
  public boolean tryLock()
  {
    return true;
  }
  
  public boolean tryLock(long paramLong, TimeUnit paramTimeUnit)
  {
    return true;
  }
  
  public void unlock() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\TransformationUtils$NoLock.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */