package org.apache.http.impl;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.util.Args;

public class DefaultHttpRequestFactory
  implements HttpRequestFactory
{
  public static final DefaultHttpRequestFactory INSTANCE;
  private static final String[] RFC2616_COMMON_METHODS;
  private static final String[] RFC2616_ENTITY_ENC_METHODS;
  private static final String[] RFC2616_SPECIAL_METHODS;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new org/apache/http/impl/DefaultHttpRequestFactory;
    ((DefaultHttpRequestFactory)localObject).<init>();
    INSTANCE = (DefaultHttpRequestFactory)localObject;
    localObject = new String[j];
    localObject[0] = "GET";
    RFC2616_COMMON_METHODS = (String[])localObject;
    localObject = new String[i];
    localObject[0] = "POST";
    localObject[j] = "PUT";
    RFC2616_ENTITY_ENC_METHODS = (String[])localObject;
    localObject = new String[5];
    localObject[0] = "HEAD";
    localObject[j] = "OPTIONS";
    localObject[i] = "DELETE";
    localObject[3] = "TRACE";
    localObject[4] = "CONNECT";
    RFC2616_SPECIAL_METHODS = (String[])localObject;
  }
  
  private static boolean isOneOf(String[] paramArrayOfString, String paramString)
  {
    boolean bool1 = false;
    int i = paramArrayOfString.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        String str = paramArrayOfString[j];
        boolean bool2 = str.equalsIgnoreCase(paramString);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
  
  public HttpRequest newHttpRequest(String paramString1, String paramString2)
  {
    Object localObject1 = RFC2616_COMMON_METHODS;
    boolean bool = isOneOf((String[])localObject1, paramString1);
    if (bool)
    {
      localObject1 = new org/apache/http/message/BasicHttpRequest;
      ((BasicHttpRequest)localObject1).<init>(paramString1, paramString2);
    }
    for (;;)
    {
      return (HttpRequest)localObject1;
      localObject1 = RFC2616_ENTITY_ENC_METHODS;
      bool = isOneOf((String[])localObject1, paramString1);
      if (bool)
      {
        localObject1 = new org/apache/http/message/BasicHttpEntityEnclosingRequest;
        ((BasicHttpEntityEnclosingRequest)localObject1).<init>(paramString1, paramString2);
      }
      else
      {
        localObject1 = RFC2616_SPECIAL_METHODS;
        bool = isOneOf((String[])localObject1, paramString1);
        if (!bool) {
          break;
        }
        localObject1 = new org/apache/http/message/BasicHttpRequest;
        ((BasicHttpRequest)localObject1).<init>(paramString1, paramString2);
      }
    }
    localObject1 = new org/apache/http/MethodNotSupportedException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = paramString1 + " method not supported";
    ((MethodNotSupportedException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public HttpRequest newHttpRequest(RequestLine paramRequestLine)
  {
    Args.notNull(paramRequestLine, "Request line");
    Object localObject1 = paramRequestLine.getMethod();
    Object localObject2 = RFC2616_COMMON_METHODS;
    boolean bool = isOneOf((String[])localObject2, (String)localObject1);
    if (bool)
    {
      localObject1 = new org/apache/http/message/BasicHttpRequest;
      ((BasicHttpRequest)localObject1).<init>(paramRequestLine);
    }
    for (;;)
    {
      return (HttpRequest)localObject1;
      localObject2 = RFC2616_ENTITY_ENC_METHODS;
      bool = isOneOf((String[])localObject2, (String)localObject1);
      if (bool)
      {
        localObject1 = new org/apache/http/message/BasicHttpEntityEnclosingRequest;
        ((BasicHttpEntityEnclosingRequest)localObject1).<init>(paramRequestLine);
      }
      else
      {
        localObject2 = RFC2616_SPECIAL_METHODS;
        bool = isOneOf((String[])localObject2, (String)localObject1);
        if (!bool) {
          break;
        }
        localObject1 = new org/apache/http/message/BasicHttpRequest;
        ((BasicHttpRequest)localObject1).<init>(paramRequestLine);
      }
    }
    localObject2 = new org/apache/http/MethodNotSupportedException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject1 = (String)localObject1 + " method not supported";
    ((MethodNotSupportedException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultHttpRequestFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */