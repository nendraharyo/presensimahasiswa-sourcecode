package org.apache.http;

import java.util.Iterator;

public abstract interface TokenIterator
  extends Iterator
{
  public abstract boolean hasNext();
  
  public abstract String nextToken();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\TokenIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */