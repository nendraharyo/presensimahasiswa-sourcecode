package org.apache.http.pool;

class AbstractConnPool$1
  extends RouteSpecificPool
{
  AbstractConnPool$1(AbstractConnPool paramAbstractConnPool, Object paramObject1, Object paramObject2)
  {
    super(paramObject1);
  }
  
  protected PoolEntry createEntry(Object paramObject)
  {
    AbstractConnPool localAbstractConnPool = this.this$0;
    Object localObject = this.val$route;
    return localAbstractConnPool.createEntry(localObject, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\AbstractConnPool$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */