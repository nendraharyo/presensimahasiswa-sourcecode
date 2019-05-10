package org.apache.http.pool;

class AbstractConnPool$3
  implements PoolEntryCallback
{
  AbstractConnPool$3(AbstractConnPool paramAbstractConnPool, long paramLong) {}
  
  public void process(PoolEntry paramPoolEntry)
  {
    long l1 = paramPoolEntry.getUpdated();
    long l2 = this.val$deadline;
    boolean bool = l1 < l2;
    if (!bool) {
      paramPoolEntry.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\AbstractConnPool$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */