package org.apache.http.impl.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

public class BasicResponseHandler
  implements ResponseHandler
{
  public String handleResponse(HttpResponse paramHttpResponse)
  {
    Object localObject1 = paramHttpResponse.getStatusLine();
    Object localObject2 = paramHttpResponse.getEntity();
    int i = ((StatusLine)localObject1).getStatusCode();
    int j = 300;
    if (i >= j)
    {
      EntityUtils.consume((HttpEntity)localObject2);
      localObject2 = new org/apache/http/client/HttpResponseException;
      i = ((StatusLine)localObject1).getStatusCode();
      localObject1 = ((StatusLine)localObject1).getReasonPhrase();
      ((HttpResponseException)localObject2).<init>(i, (String)localObject1);
      throw ((Throwable)localObject2);
    }
    if (localObject2 == null) {}
    for (localObject1 = null;; localObject1 = EntityUtils.toString((HttpEntity)localObject2)) {
      return (String)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\BasicResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */