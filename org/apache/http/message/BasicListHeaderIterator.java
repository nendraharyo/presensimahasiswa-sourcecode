package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class BasicListHeaderIterator
  implements HeaderIterator
{
  protected final List allHeaders;
  protected int currentIndex;
  protected String headerName;
  protected int lastIndex;
  
  public BasicListHeaderIterator(List paramList, String paramString)
  {
    List localList = (List)Args.notNull(paramList, "Header list");
    this.allHeaders = localList;
    this.headerName = paramString;
    int j = findNext(i);
    this.currentIndex = j;
    this.lastIndex = i;
  }
  
  protected boolean filterHeader(int paramInt)
  {
    String str1 = this.headerName;
    if (str1 == null) {}
    String str2;
    for (boolean bool = true;; bool = str2.equalsIgnoreCase(str1))
    {
      return bool;
      str1 = ((Header)this.allHeaders.get(paramInt)).getName();
      str2 = this.headerName;
    }
  }
  
  protected int findNext(int paramInt)
  {
    int i = -1;
    if (paramInt < i) {
      return i;
    }
    int j = this.allHeaders.size() + -1;
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
    this.lastIndex = i;
    int j = findNext(i);
    this.currentIndex = j;
    return (Header)this.allHeaders.get(i);
  }
  
  public void remove()
  {
    int i = this.lastIndex;
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      Asserts.check(i, "No header to remove");
      List localList = this.allHeaders;
      int k = this.lastIndex;
      localList.remove(k);
      this.lastIndex = -1;
      int j = this.currentIndex + -1;
      this.currentIndex = j;
      return;
      j = 0;
      localList = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicListHeaderIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */