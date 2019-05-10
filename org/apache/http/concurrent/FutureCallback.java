package org.apache.http.concurrent;

public abstract interface FutureCallback
{
  public abstract void cancelled();
  
  public abstract void completed(Object paramObject);
  
  public abstract void failed(Exception paramException);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\concurrent\FutureCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */