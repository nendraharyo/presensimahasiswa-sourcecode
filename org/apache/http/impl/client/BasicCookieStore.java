package org.apache.http.impl.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieIdentityComparator;

public class BasicCookieStore
  implements Serializable, CookieStore
{
  private static final long serialVersionUID = -7581093305228232025L;
  private final TreeSet cookies;
  
  public BasicCookieStore()
  {
    TreeSet localTreeSet = new java/util/TreeSet;
    CookieIdentityComparator localCookieIdentityComparator = new org/apache/http/cookie/CookieIdentityComparator;
    localCookieIdentityComparator.<init>();
    localTreeSet.<init>(localCookieIdentityComparator);
    this.cookies = localTreeSet;
  }
  
  public void addCookie(Cookie paramCookie)
  {
    if (paramCookie != null) {}
    try
    {
      Object localObject1 = this.cookies;
      ((TreeSet)localObject1).remove(paramCookie);
      localObject1 = new java/util/Date;
      ((Date)localObject1).<init>();
      boolean bool = paramCookie.isExpired((Date)localObject1);
      if (!bool)
      {
        localObject1 = this.cookies;
        ((TreeSet)localObject1).add(paramCookie);
      }
      return;
    }
    finally {}
  }
  
  public void addCookies(Cookie[] paramArrayOfCookie)
  {
    if (paramArrayOfCookie != null) {}
    try
    {
      int i = paramArrayOfCookie.length;
      int j = 0;
      Object localObject1 = null;
      while (j < i)
      {
        Cookie localCookie = paramArrayOfCookie[j];
        addCookie(localCookie);
        j += 1;
      }
      return;
    }
    finally {}
  }
  
  public void clear()
  {
    try
    {
      TreeSet localTreeSet = this.cookies;
      localTreeSet.clear();
      return;
    }
    finally {}
  }
  
  public boolean clearExpired(Date paramDate)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    if (paramDate == null) {}
    for (;;)
    {
      return bool1;
      try
      {
        TreeSet localTreeSet = this.cookies;
        Iterator localIterator = localTreeSet.iterator();
        boolean bool2 = false;
        localTreeSet = null;
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (Cookie)localObject1;
          bool1 = ((Cookie)localObject1).isExpired(paramDate);
          if (bool1)
          {
            localIterator.remove();
            bool2 = true;
          }
        }
        bool1 = bool2;
      }
      finally {}
    }
  }
  
  public List getCookies()
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      TreeSet localTreeSet = this.cookies;
      localArrayList.<init>(localTreeSet);
      return localArrayList;
    }
    finally {}
  }
  
  public String toString()
  {
    try
    {
      Object localObject1 = this.cookies;
      localObject1 = ((TreeSet)localObject1).toString();
      return (String)localObject1;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\BasicCookieStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */