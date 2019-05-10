package org.apache.http.pool;

public abstract interface ConnPoolControl
{
  public abstract int getDefaultMaxPerRoute();
  
  public abstract int getMaxPerRoute(Object paramObject);
  
  public abstract int getMaxTotal();
  
  public abstract PoolStats getStats(Object paramObject);
  
  public abstract PoolStats getTotalStats();
  
  public abstract void setDefaultMaxPerRoute(int paramInt);
  
  public abstract void setMaxPerRoute(Object paramObject, int paramInt);
  
  public abstract void setMaxTotal(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\ConnPoolControl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */