package org.apache.http.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

public class HeaderGroup
  implements Serializable, Cloneable
{
  private static final long serialVersionUID = 2608834160639271617L;
  private final List headers;
  
  public HeaderGroup()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(16);
    this.headers = localArrayList;
  }
  
  public void addHeader(Header paramHeader)
  {
    if (paramHeader == null) {}
    for (;;)
    {
      return;
      List localList = this.headers;
      localList.add(paramHeader);
    }
  }
  
  public void clear()
  {
    this.headers.clear();
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public boolean containsHeader(String paramString)
  {
    boolean bool1 = false;
    int k;
    for (int i = 0;; i = k)
    {
      Object localObject = this.headers;
      int j = ((List)localObject).size();
      if (i < j)
      {
        localObject = ((Header)this.headers.get(i)).getName();
        boolean bool2 = ((String)localObject).equalsIgnoreCase(paramString);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      k = i + 1;
    }
  }
  
  public HeaderGroup copy()
  {
    HeaderGroup localHeaderGroup = new org/apache/http/message/HeaderGroup;
    localHeaderGroup.<init>();
    List localList1 = localHeaderGroup.headers;
    List localList2 = this.headers;
    localList1.addAll(localList2);
    return localHeaderGroup;
  }
  
  public Header[] getAllHeaders()
  {
    List localList = this.headers;
    Header[] arrayOfHeader = new Header[this.headers.size()];
    return (Header[])localList.toArray(arrayOfHeader);
  }
  
  public Header getCondensedHeader(String paramString)
  {
    int i = 1;
    Object localObject1 = getHeaders(paramString);
    int j = localObject1.length;
    Object localObject2;
    if (j == 0)
    {
      i = 0;
      localObject2 = null;
    }
    for (;;)
    {
      return (Header)localObject2;
      j = localObject1.length;
      if (j == i)
      {
        localObject2 = localObject1[0];
      }
      else
      {
        Object localObject3 = new org/apache/http/util/CharArrayBuffer;
        int k = 128;
        ((CharArrayBuffer)localObject3).<init>(k);
        String str = localObject1[0].getValue();
        ((CharArrayBuffer)localObject3).append(str);
        for (;;)
        {
          k = localObject1.length;
          if (i >= k) {
            break;
          }
          ((CharArrayBuffer)localObject3).append(", ");
          str = localObject1[i].getValue();
          ((CharArrayBuffer)localObject3).append(str);
          i += 1;
        }
        localObject2 = new org/apache/http/message/BasicHeader;
        localObject1 = Locale.ENGLISH;
        localObject1 = paramString.toLowerCase((Locale)localObject1);
        localObject3 = ((CharArrayBuffer)localObject3).toString();
        ((BasicHeader)localObject2).<init>((String)localObject1, (String)localObject3);
      }
    }
  }
  
  public Header getFirstHeader(String paramString)
  {
    int i = 0;
    Object localObject = null;
    int j = 0;
    localObject = this.headers;
    i = ((List)localObject).size();
    if (j < i)
    {
      localObject = (Header)this.headers.get(j);
      String str = ((Header)localObject).getName();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return (Header)localObject;
      i = j + 1;
      j = i;
      break;
      i = 0;
      localObject = null;
    }
  }
  
  public Header[] getHeaders(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.headers;
      i = ((List)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = (Header)this.headers.get(j);
      String str = ((Header)localObject).getName();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (bool) {
        localArrayList.add(localObject);
      }
      i = j + 1;
    }
    localObject = new Header[localArrayList.size()];
    return (Header[])localArrayList.toArray((Object[])localObject);
  }
  
  public Header getLastHeader(String paramString)
  {
    Object localObject = this.headers;
    int i = ((List)localObject).size() + -1;
    int j = i;
    if (j >= 0)
    {
      localObject = (Header)this.headers.get(j);
      String str = ((Header)localObject).getName();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return (Header)localObject;
      i = j + -1;
      j = i;
      break;
      i = 0;
      localObject = null;
    }
  }
  
  public HeaderIterator iterator()
  {
    BasicListHeaderIterator localBasicListHeaderIterator = new org/apache/http/message/BasicListHeaderIterator;
    List localList = this.headers;
    localBasicListHeaderIterator.<init>(localList, null);
    return localBasicListHeaderIterator;
  }
  
  public HeaderIterator iterator(String paramString)
  {
    BasicListHeaderIterator localBasicListHeaderIterator = new org/apache/http/message/BasicListHeaderIterator;
    List localList = this.headers;
    localBasicListHeaderIterator.<init>(localList, paramString);
    return localBasicListHeaderIterator;
  }
  
  public void removeHeader(Header paramHeader)
  {
    if (paramHeader == null) {}
    for (;;)
    {
      return;
      List localList = this.headers;
      localList.remove(paramHeader);
    }
  }
  
  public void setHeaders(Header[] paramArrayOfHeader)
  {
    clear();
    if (paramArrayOfHeader == null) {}
    for (;;)
    {
      return;
      List localList = this.headers;
      Collections.addAll(localList, paramArrayOfHeader);
    }
  }
  
  public String toString()
  {
    return this.headers.toString();
  }
  
  public void updateHeader(Header paramHeader)
  {
    if (paramHeader == null) {}
    for (;;)
    {
      return;
      int i = 0;
      Object localObject = null;
      int j;
      for (int k = 0;; k = j)
      {
        localObject = this.headers;
        i = ((List)localObject).size();
        if (k >= i) {
          break label98;
        }
        localObject = ((Header)this.headers.get(k)).getName();
        String str = paramHeader.getName();
        boolean bool = ((String)localObject).equalsIgnoreCase(str);
        if (bool)
        {
          localObject = this.headers;
          ((List)localObject).set(k, paramHeader);
          break;
        }
        j = k + 1;
      }
      label98:
      localObject = this.headers;
      ((List)localObject).add(paramHeader);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\HeaderGroup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */