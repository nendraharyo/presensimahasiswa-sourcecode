package org.apache.http.protocol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.util.Args;

public final class BasicHttpProcessor
  implements Cloneable, HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList
{
  protected final List requestInterceptors;
  protected final List responseInterceptors;
  
  public BasicHttpProcessor()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.requestInterceptors = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.responseInterceptors = localArrayList;
  }
  
  public final void addInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    addRequestInterceptor(paramHttpRequestInterceptor);
  }
  
  public final void addInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt)
  {
    addRequestInterceptor(paramHttpRequestInterceptor, paramInt);
  }
  
  public final void addInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    addResponseInterceptor(paramHttpResponseInterceptor);
  }
  
  public final void addInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt)
  {
    addResponseInterceptor(paramHttpResponseInterceptor, paramInt);
  }
  
  public void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    if (paramHttpRequestInterceptor == null) {}
    for (;;)
    {
      return;
      List localList = this.requestInterceptors;
      localList.add(paramHttpRequestInterceptor);
    }
  }
  
  public void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt)
  {
    if (paramHttpRequestInterceptor == null) {}
    for (;;)
    {
      return;
      List localList = this.requestInterceptors;
      localList.add(paramInt, paramHttpRequestInterceptor);
    }
  }
  
  public void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    if (paramHttpResponseInterceptor == null) {}
    for (;;)
    {
      return;
      List localList = this.responseInterceptors;
      localList.add(paramHttpResponseInterceptor);
    }
  }
  
  public void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt)
  {
    if (paramHttpResponseInterceptor == null) {}
    for (;;)
    {
      return;
      List localList = this.responseInterceptors;
      localList.add(paramInt, paramHttpResponseInterceptor);
    }
  }
  
  public void clearInterceptors()
  {
    clearRequestInterceptors();
    clearResponseInterceptors();
  }
  
  public void clearRequestInterceptors()
  {
    this.requestInterceptors.clear();
  }
  
  public void clearResponseInterceptors()
  {
    this.responseInterceptors.clear();
  }
  
  public Object clone()
  {
    BasicHttpProcessor localBasicHttpProcessor = (BasicHttpProcessor)super.clone();
    copyInterceptors(localBasicHttpProcessor);
    return localBasicHttpProcessor;
  }
  
  public BasicHttpProcessor copy()
  {
    BasicHttpProcessor localBasicHttpProcessor = new org/apache/http/protocol/BasicHttpProcessor;
    localBasicHttpProcessor.<init>();
    copyInterceptors(localBasicHttpProcessor);
    return localBasicHttpProcessor;
  }
  
  protected void copyInterceptors(BasicHttpProcessor paramBasicHttpProcessor)
  {
    paramBasicHttpProcessor.requestInterceptors.clear();
    List localList1 = paramBasicHttpProcessor.requestInterceptors;
    List localList2 = this.requestInterceptors;
    localList1.addAll(localList2);
    paramBasicHttpProcessor.responseInterceptors.clear();
    localList1 = paramBasicHttpProcessor.responseInterceptors;
    localList2 = this.responseInterceptors;
    localList1.addAll(localList2);
  }
  
  public HttpRequestInterceptor getRequestInterceptor(int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      localObject = this.requestInterceptors;
      i = ((List)localObject).size();
      if (paramInt < i) {}
    }
    else
    {
      i = 0;
    }
    for (Object localObject = null;; localObject = (HttpRequestInterceptor)this.requestInterceptors.get(paramInt)) {
      return (HttpRequestInterceptor)localObject;
    }
  }
  
  public int getRequestInterceptorCount()
  {
    return this.requestInterceptors.size();
  }
  
  public HttpResponseInterceptor getResponseInterceptor(int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      localObject = this.responseInterceptors;
      i = ((List)localObject).size();
      if (paramInt < i) {}
    }
    else
    {
      i = 0;
    }
    for (Object localObject = null;; localObject = (HttpResponseInterceptor)this.responseInterceptors.get(paramInt)) {
      return (HttpResponseInterceptor)localObject;
    }
  }
  
  public int getResponseInterceptorCount()
  {
    return this.responseInterceptors.size();
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Object localObject = this.requestInterceptors;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (HttpRequestInterceptor)localIterator.next();
      ((HttpRequestInterceptor)localObject).process(paramHttpRequest, paramHttpContext);
    }
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Object localObject = this.responseInterceptors;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (HttpResponseInterceptor)localIterator.next();
      ((HttpResponseInterceptor)localObject).process(paramHttpResponse, paramHttpContext);
    }
  }
  
  public void removeRequestInterceptorByClass(Class paramClass)
  {
    Iterator localIterator = this.requestInterceptors.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Class localClass = localIterator.next().getClass();
      bool = localClass.equals(paramClass);
      if (bool) {
        localIterator.remove();
      }
    }
  }
  
  public void removeResponseInterceptorByClass(Class paramClass)
  {
    Iterator localIterator = this.responseInterceptors.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Class localClass = localIterator.next().getClass();
      bool = localClass.equals(paramClass);
      if (bool) {
        localIterator.remove();
      }
    }
  }
  
  public void setInterceptors(List paramList)
  {
    Args.notNull(paramList, "Inteceptor list");
    this.requestInterceptors.clear();
    Object localObject1 = this.responseInterceptors;
    ((List)localObject1).clear();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject2 = localIterator.next();
      bool = localObject2 instanceof HttpRequestInterceptor;
      if (bool)
      {
        localObject1 = localObject2;
        localObject1 = (HttpRequestInterceptor)localObject2;
        addInterceptor((HttpRequestInterceptor)localObject1);
      }
      bool = localObject2 instanceof HttpResponseInterceptor;
      if (bool)
      {
        localObject2 = (HttpResponseInterceptor)localObject2;
        addInterceptor((HttpResponseInterceptor)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\BasicHttpProcessor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */