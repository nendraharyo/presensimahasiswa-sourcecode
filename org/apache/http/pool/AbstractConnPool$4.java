package org.apache.http.pool;

class AbstractConnPool$4
  implements PoolEntryCallback
{
  AbstractConnPool$4(AbstractConnPool paramAbstractConnPool, long paramLong) {}
  
  public void process(PoolEntry paramPoolEntry)
  {
    long l = this.val$now;
    boolean bool = paramPoolEntry.isExpired(l);
    if (bool) {
      paramPoolEntry.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\AbstractConnPool$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */