package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;

public class CookiePathComparator
  implements Serializable, Comparator
{
  private static final long serialVersionUID = 7523645369616405818L;
  
  private String normalizePath(Cookie paramCookie)
  {
    Object localObject1 = paramCookie.getPath();
    if (localObject1 == null) {
      localObject1 = "/";
    }
    Object localObject2 = "/";
    boolean bool = ((String)localObject1).endsWith((String)localObject2);
    if (!bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      char c = '/';
      localObject1 = c;
    }
    return (String)localObject1;
  }
  
  public int compare(Cookie paramCookie1, Cookie paramCookie2)
  {
    int i = 0;
    String str1 = normalizePath(paramCookie1);
    String str2 = normalizePath(paramCookie2);
    boolean bool1 = str1.equals(str2);
    if (bool1) {}
    for (;;)
    {
      return i;
      bool1 = str1.startsWith(str2);
      if (bool1)
      {
        i = -1;
      }
      else
      {
        boolean bool2 = str2.startsWith(str1);
        if (bool2) {
          i = 1;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\cookie\CookiePathComparator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */