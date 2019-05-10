package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

public final class ImmutableHttpProcessor
  implements HttpProcessor
{
  private final HttpRequestInterceptor[] requestInterceptors;
  private final HttpResponseInterceptor[] responseInterceptors;
  
  public ImmutableHttpProcessor(List paramList1, List paramList2)
  {
    Object localObject;
    if (paramList1 != null)
    {
      int i = paramList1.size();
      localObject = new HttpRequestInterceptor[i];
      localObject = (HttpRequestInterceptor[])paramList1.toArray((Object[])localObject);
      this.requestInterceptors = ((HttpRequestInterceptor[])localObject);
      if (paramList2 == null) {
        break label92;
      }
      i = paramList2.size();
      localObject = new HttpResponseInterceptor[i];
      localObject = (HttpResponseInterceptor[])paramList2.toArray((Object[])localObject);
    }
    for (this.responseInterceptors = ((HttpResponseInterceptor[])localObject);; this.responseInterceptors = ((HttpResponseInterceptor[])localObject))
    {
      return;
      localObject = new HttpRequestInterceptor[0];
      this.requestInterceptors = ((HttpRequestInterceptor[])localObject);
      break;
      label92:
      localObject = new HttpResponseInterceptor[0];
    }
  }
  
  public ImmutableHttpProcessor(HttpRequestInterceptorList paramHttpRequestInterceptorList, HttpResponseInterceptorList paramHttpResponseInterceptorList)
  {
    int k;
    Object localObject;
    if (paramHttpRequestInterceptorList != null)
    {
      int j = paramHttpRequestInterceptorList.getRequestInterceptorCount();
      arrayOfHttpRequestInterceptor = new HttpRequestInterceptor[j];
      this.requestInterceptors = arrayOfHttpRequestInterceptor;
      k = 0;
      arrayOfHttpRequestInterceptor = null;
      while (k < j)
      {
        localObject = this.requestInterceptors;
        HttpRequestInterceptor localHttpRequestInterceptor = paramHttpRequestInterceptorList.getRequestInterceptor(k);
        localObject[k] = localHttpRequestInterceptor;
        k += 1;
      }
    }
    HttpRequestInterceptor[] arrayOfHttpRequestInterceptor = new HttpRequestInterceptor[0];
    this.requestInterceptors = arrayOfHttpRequestInterceptor;
    if (paramHttpResponseInterceptorList != null)
    {
      k = paramHttpResponseInterceptorList.getResponseInterceptorCount();
      HttpResponseInterceptor[] arrayOfHttpResponseInterceptor2 = new HttpResponseInterceptor[k];
      this.responseInterceptors = arrayOfHttpResponseInterceptor2;
      while (i < k)
      {
        arrayOfHttpResponseInterceptor2 = this.responseInterceptors;
        localObject = paramHttpResponseInterceptorList.getResponseInterceptor(i);
        arrayOfHttpResponseInterceptor2[i] = localObject;
        i += 1;
      }
    }
    arrayOfHttpResponseInterceptor1 = new HttpResponseInterceptor[0];
    this.responseInterceptors = arrayOfHttpResponseInterceptor1;
  }
  
  public ImmutableHttpProcessor(HttpRequestInterceptor... paramVarArgs)
  {
    this(paramVarArgs, null);
  }
  
  public ImmutableHttpProcessor(HttpRequestInterceptor[] paramArrayOfHttpRequestInterceptor, HttpResponseInterceptor[] paramArrayOfHttpResponseInterceptor)
  {
    if (paramArrayOfHttpRequestInterceptor != null)
    {
      int i = paramArrayOfHttpRequestInterceptor.length;
      Object localObject1 = new HttpRequestInterceptor[i];
      this.requestInterceptors = ((HttpRequestInterceptor[])localObject1);
      localObject1 = this.requestInterceptors;
      System.arraycopy(paramArrayOfHttpRequestInterceptor, 0, localObject1, 0, i);
      if (paramArrayOfHttpResponseInterceptor == null) {
        break label88;
      }
      i = paramArrayOfHttpResponseInterceptor.length;
      localObject1 = new HttpResponseInterceptor[i];
      this.responseInterceptors = ((HttpResponseInterceptor[])localObject1);
      localObject1 = this.responseInterceptors;
      System.arraycopy(paramArrayOfHttpResponseInterceptor, 0, localObject1, 0, i);
    }
    for (;;)
    {
      return;
      Object localObject2 = new HttpRequestInterceptor[0];
      this.requestInterceptors = ((HttpRequestInterceptor[])localObject2);
      break;
      label88:
      localObject2 = new HttpResponseInterceptor[0];
      this.responseInterceptors = ((HttpResponseInterceptor[])localObject2);
    }
  }
  
  public ImmutableHttpProcessor(HttpResponseInterceptor... paramVarArgs)
  {
    this(null, paramVarArgs);
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    HttpRequestInterceptor[] arrayOfHttpRequestInterceptor = this.requestInterceptors;
    int i = arrayOfHttpRequestInterceptor.length;
    int j = 0;
    while (j < i)
    {
      HttpRequestInterceptor localHttpRequestInterceptor = arrayOfHttpRequestInterceptor[j];
      localHttpRequestInterceptor.process(paramHttpRequest, paramHttpContext);
      j += 1;
    }
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    HttpResponseInterceptor[] arrayOfHttpResponseInterceptor = this.responseInterceptors;
    int i = arrayOfHttpResponseInterceptor.length;
    int j = 0;
    while (j < i)
    {
      HttpResponseInterceptor localHttpResponseInterceptor = arrayOfHttpResponseInterceptor[j];
      localHttpResponseInterceptor.process(paramHttpResponse, paramHttpContext);
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\ImmutableHttpProcessor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */