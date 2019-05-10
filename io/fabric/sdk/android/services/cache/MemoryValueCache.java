package io.fabric.sdk.android.services.cache;

import android.content.Context;

public class MemoryValueCache
  extends AbstractValueCache
{
  private Object value;
  
  public MemoryValueCache()
  {
    this(null);
  }
  
  public MemoryValueCache(ValueCache paramValueCache)
  {
    super(paramValueCache);
  }
  
  protected void cacheValue(Context paramContext, Object paramObject)
  {
    this.value = paramObject;
  }
  
  protected void doInvalidate(Context paramContext)
  {
    this.value = null;
  }
  
  protected Object getCached(Context paramContext)
  {
    return this.value;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\cache\MemoryValueCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */