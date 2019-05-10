package com.bumptech.glide.request;

class RequestFutureTarget$Waiter
{
  void notifyAll(Object paramObject)
  {
    paramObject.notifyAll();
  }
  
  void waitForTimeout(Object paramObject, long paramLong)
  {
    paramObject.wait(paramLong);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\RequestFutureTarget$Waiter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */