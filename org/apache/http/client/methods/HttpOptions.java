package org.apache.http.client.methods;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.util.Args;

public class HttpOptions
  extends HttpRequestBase
{
  public static final String METHOD_NAME = "OPTIONS";
  
  public HttpOptions() {}
  
  public HttpOptions(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public HttpOptions(URI paramURI)
  {
    setURI(paramURI);
  }
  
  public Set getAllowedMethods(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    String str1 = "Allow";
    HeaderIterator localHeaderIterator = paramHttpResponse.headerIterator(str1);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    for (;;)
    {
      int i = localHeaderIterator.hasNext();
      if (i == 0) {
        break;
      }
      HeaderElement[] arrayOfHeaderElement = localHeaderIterator.nextHeader().getElements();
      int k = arrayOfHeaderElement.length;
      i = 0;
      str1 = null;
      while (i < k)
      {
        String str2 = arrayOfHeaderElement[i].getName();
        localHashSet.add(str2);
        int j;
        i += 1;
      }
    }
    return localHashSet;
  }
  
  public String getMethod()
  {
    return "OPTIONS";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\HttpOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */