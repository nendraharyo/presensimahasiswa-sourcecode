package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;

public class CookieIdentityComparator
  implements Serializable, Comparator
{
  private static final long serialVersionUID = 4466565437490631532L;
  
  public int compare(Cookie paramCookie1, Cookie paramCookie2)
  {
    int i = 46;
    int j = -1;
    Object localObject1 = paramCookie1.getName();
    Object localObject2 = paramCookie2.getName();
    int k = ((String)localObject1).compareTo((String)localObject2);
    if (k == 0)
    {
      localObject1 = paramCookie1.getDomain();
      if (localObject1 != null) {
        break label130;
      }
      localObject1 = "";
      localObject2 = paramCookie2.getDomain();
      if (localObject2 != null) {
        break label183;
      }
      localObject2 = "";
    }
    for (;;)
    {
      k = ((String)localObject1).compareToIgnoreCase((String)localObject2);
      if (k == 0)
      {
        localObject1 = paramCookie1.getPath();
        if (localObject1 == null) {
          localObject1 = "/";
        }
        localObject2 = paramCookie2.getPath();
        if (localObject2 == null) {
          localObject2 = "/";
        }
        k = ((String)localObject1).compareTo((String)localObject2);
      }
      return k;
      label130:
      int m = ((String)localObject1).indexOf(i);
      if (m != j) {
        break;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ".local";
      localObject1 = (String)localObject2;
      break;
      label183:
      i = ((String)localObject2).indexOf(i);
      if (i == j)
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = ".local";
        localObject2 = (String)localObject3;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\cookie\CookieIdentityComparator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */