package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class NetscapeDraftSpecFactory
  implements CookieSpecFactory, CookieSpecProvider
{
  private final String[] datepatterns;
  
  public NetscapeDraftSpecFactory()
  {
    this(null);
  }
  
  public NetscapeDraftSpecFactory(String[] paramArrayOfString)
  {
    this.datepatterns = paramArrayOfString;
  }
  
  public CookieSpec create(HttpContext paramHttpContext)
  {
    NetscapeDraftSpec localNetscapeDraftSpec = new org/apache/http/impl/cookie/NetscapeDraftSpec;
    String[] arrayOfString = this.datepatterns;
    localNetscapeDraftSpec.<init>(arrayOfString);
    return localNetscapeDraftSpec;
  }
  
  public CookieSpec newInstance(HttpParams paramHttpParams)
  {
    Object localObject1;
    if (paramHttpParams != null)
    {
      int i = 0;
      localObject1 = null;
      localObject2 = (Collection)paramHttpParams.getParameter("http.protocol.cookie-datepatterns");
      if (localObject2 == null) {
        break label81;
      }
      i = ((Collection)localObject2).size();
      localObject1 = new String[i];
    }
    label81:
    for (Object localObject2 = (String[])((Collection)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      localObject1 = new org/apache/http/impl/cookie/NetscapeDraftSpec;
      ((NetscapeDraftSpec)localObject1).<init>((String[])localObject2);
      localObject2 = localObject1;
      for (;;)
      {
        return (CookieSpec)localObject2;
        localObject2 = new org/apache/http/impl/cookie/NetscapeDraftSpec;
        ((NetscapeDraftSpec)localObject2).<init>();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\NetscapeDraftSpecFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */