package org.apache.http;

import java.util.Iterator;

public abstract interface HeaderElementIterator
  extends Iterator
{
  public abstract boolean hasNext();
  
  public abstract HeaderElement nextElement();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\HeaderElementIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */