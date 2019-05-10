package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class RFC2109SpecFactory
  implements CookieSpecFactory, CookieSpecProvider
{
  private final String[] datepatterns;
  private final boolean oneHeader;
  
  public RFC2109SpecFactory()
  {
    this(null, false);
  }
  
  public RFC2109SpecFactory(String[] paramArrayOfString, boolean paramBoolean)
  {
    this.datepatterns = paramArrayOfString;
    this.oneHeader = paramBoolean;
  }
  
  public CookieSpec create(HttpContext paramHttpContext)
  {
    RFC2109Spec localRFC2109Spec = new org/apache/http/impl/cookie/RFC2109Spec;
    String[] arrayOfString = this.datepatterns;
    boolean bool = this.oneHeader;
    localRFC2109Spec.<init>(arrayOfString, bool);
    return localRFC2109Spec;
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
        break label94;
      }
      i = ((Collection)localObject2).size();
      localObject1 = new String[i];
    }
    label94:
    for (Object localObject2 = (String[])((Collection)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      boolean bool = paramHttpParams.getBooleanParameter("http.protocol.single-cookie-header", false);
      localObject1 = new org/apache/http/impl/cookie/RFC2109Spec;
      ((RFC2109Spec)localObject1).<init>((String[])localObject2, bool);
      localObject2 = localObject1;
      for (;;)
      {
        return (CookieSpec)localObject2;
        localObject2 = new org/apache/http/impl/cookie/RFC2109Spec;
        ((RFC2109Spec)localObject2).<init>();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\RFC2109SpecFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */