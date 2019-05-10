package org.apache.http.protocol;

import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;

public class HttpProcessorBuilder
{
  private ChainBuilder requestChainBuilder;
  private ChainBuilder responseChainBuilder;
  
  public static HttpProcessorBuilder create()
  {
    HttpProcessorBuilder localHttpProcessorBuilder = new org/apache/http/protocol/HttpProcessorBuilder;
    localHttpProcessorBuilder.<init>();
    return localHttpProcessorBuilder;
  }
  
  private ChainBuilder getRequestChainBuilder()
  {
    ChainBuilder localChainBuilder = this.requestChainBuilder;
    if (localChainBuilder == null)
    {
      localChainBuilder = new org/apache/http/protocol/ChainBuilder;
      localChainBuilder.<init>();
      this.requestChainBuilder = localChainBuilder;
    }
    return this.requestChainBuilder;
  }
  
  private ChainBuilder getResponseChainBuilder()
  {
    ChainBuilder localChainBuilder = this.responseChainBuilder;
    if (localChainBuilder == null)
    {
      localChainBuilder = new org/apache/http/protocol/ChainBuilder;
      localChainBuilder.<init>();
      this.responseChainBuilder = localChainBuilder;
    }
    return this.responseChainBuilder;
  }
  
  public HttpProcessorBuilder add(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    return addLast(paramHttpRequestInterceptor);
  }
  
  public HttpProcessorBuilder add(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    return addLast(paramHttpResponseInterceptor);
  }
  
  public HttpProcessorBuilder addAll(HttpRequestInterceptor... paramVarArgs)
  {
    return addAllLast(paramVarArgs);
  }
  
  public HttpProcessorBuilder addAll(HttpResponseInterceptor... paramVarArgs)
  {
    return addAllLast(paramVarArgs);
  }
  
  public HttpProcessorBuilder addAllFirst(HttpRequestInterceptor... paramVarArgs)
  {
    if (paramVarArgs == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getRequestChainBuilder();
      localChainBuilder.addAllFirst(paramVarArgs);
    }
  }
  
  public HttpProcessorBuilder addAllFirst(HttpResponseInterceptor... paramVarArgs)
  {
    if (paramVarArgs == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getResponseChainBuilder();
      localChainBuilder.addAllFirst(paramVarArgs);
    }
  }
  
  public HttpProcessorBuilder addAllLast(HttpRequestInterceptor... paramVarArgs)
  {
    if (paramVarArgs == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getRequestChainBuilder();
      localChainBuilder.addAllLast(paramVarArgs);
    }
  }
  
  public HttpProcessorBuilder addAllLast(HttpResponseInterceptor... paramVarArgs)
  {
    if (paramVarArgs == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getResponseChainBuilder();
      localChainBuilder.addAllLast(paramVarArgs);
    }
  }
  
  public HttpProcessorBuilder addFirst(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    if (paramHttpRequestInterceptor == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getRequestChainBuilder();
      localChainBuilder.addFirst(paramHttpRequestInterceptor);
    }
  }
  
  public HttpProcessorBuilder addFirst(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    if (paramHttpResponseInterceptor == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getResponseChainBuilder();
      localChainBuilder.addFirst(paramHttpResponseInterceptor);
    }
  }
  
  public HttpProcessorBuilder addLast(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    if (paramHttpRequestInterceptor == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getRequestChainBuilder();
      localChainBuilder.addLast(paramHttpRequestInterceptor);
    }
  }
  
  public HttpProcessorBuilder addLast(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    if (paramHttpResponseInterceptor == null) {}
    for (;;)
    {
      return this;
      ChainBuilder localChainBuilder = getResponseChainBuilder();
      localChainBuilder.addLast(paramHttpResponseInterceptor);
    }
  }
  
  public HttpProcessor build()
  {
    LinkedList localLinkedList = null;
    ImmutableHttpProcessor localImmutableHttpProcessor = new org/apache/http/protocol/ImmutableHttpProcessor;
    Object localObject = this.requestChainBuilder;
    if (localObject != null) {}
    for (localObject = this.requestChainBuilder.build();; localObject = null)
    {
      ChainBuilder localChainBuilder = this.responseChainBuilder;
      if (localChainBuilder != null) {
        localLinkedList = this.responseChainBuilder.build();
      }
      localImmutableHttpProcessor.<init>((List)localObject, localLinkedList);
      return localImmutableHttpProcessor;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpProcessorBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */