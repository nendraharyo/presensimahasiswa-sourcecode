package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;

public class BasicHeaderIterator
  implements HeaderIterator
{
  protected final Header[] allHeaders;
  protected int currentIndex;
  protected String headerName;
  
  public BasicHeaderIterator(Header[] paramArrayOfHeader, String paramString)
  {
    Header[] arrayOfHeader = (Header[])Args.notNull(paramArrayOfHeader, "Header array");
    this.allHeaders = arrayOfHeader;
    this.headerName = paramString;
    int i = findNext(-1);
    this.currentIndex = i;
  }
  
  protected boolean filterHeader(int paramInt)
  {
    String str1 = this.headerName;
    boolean bool;
    if (str1 != null)
    {
      str1 = this.headerName;
      String str2 = this.allHeaders[paramInt].getName();
      bool = str1.equalsIgnoreCase(str2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  protected int findNext(int paramInt)
  {
    int i = -1;
    if (paramInt < i) {
      return i;
    }
    int j = this.allHeaders.length + -1;
    boolean bool = false;
    for (int k = paramInt; (!bool) && (k < j); k = paramInt)
    {
      paramInt = k + 1;
      bool = filterHeader(paramInt);
    }
    if (bool) {}
    for (;;)
    {
      i = k;
      break;
      k = i;
    }
  }
  
  public boolean hasNext()
  {
    int i = this.currentIndex;
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final Object next()
  {
    return nextHeader();
  }
  
  public Header nextHeader()
  {
    int i = this.currentIndex;
    if (i < 0)
    {
      NoSuchElementException localNoSuchElementException = new java/util/NoSuchElementException;
      localNoSuchElementException.<init>("Iteration already finished.");
      throw localNoSuchElementException;
    }
    int j = findNext(i);
    this.currentIndex = j;
    return this.allHeaders[i];
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Removing headers is not supported.");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHeaderIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */