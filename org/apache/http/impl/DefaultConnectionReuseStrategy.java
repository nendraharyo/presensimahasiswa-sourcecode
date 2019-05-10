package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.TokenIterator;
import org.apache.http.message.BasicTokenIterator;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultConnectionReuseStrategy
  implements ConnectionReuseStrategy
{
  public static final DefaultConnectionReuseStrategy INSTANCE;
  
  static
  {
    DefaultConnectionReuseStrategy localDefaultConnectionReuseStrategy = new org/apache/http/impl/DefaultConnectionReuseStrategy;
    localDefaultConnectionReuseStrategy.<init>();
    INSTANCE = localDefaultConnectionReuseStrategy;
  }
  
  private boolean canResponseHaveBody(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    int i = localStatusLine.getStatusCode();
    int k = 200;
    if (i >= k)
    {
      int m = 204;
      if (i != m)
      {
        int n = 304;
        if (i != n)
        {
          int i1 = 205;
          if (i != i1) {
            i = 1;
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localStatusLine = null;
    }
  }
  
  protected TokenIterator createTokenIterator(HeaderIterator paramHeaderIterator)
  {
    BasicTokenIterator localBasicTokenIterator = new org/apache/http/message/BasicTokenIterator;
    localBasicTokenIterator.<init>(paramHeaderIterator);
    return localBasicTokenIterator;
  }
  
  public boolean keepAlive(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    int i = 1;
    boolean bool1 = false;
    Args.notNull(paramHttpResponse, "HTTP response");
    Args.notNull(paramHttpContext, "HTTP context");
    ProtocolVersion localProtocolVersion = paramHttpResponse.getStatusLine().getProtocolVersion();
    Object localObject1 = paramHttpResponse.getFirstHeader("Transfer-Encoding");
    Object localObject2;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject2 = "chunked";
      localObject1 = ((Header)localObject1).getValue();
      bool2 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (bool2) {
        break label137;
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = canResponseHaveBody(paramHttpResponse);
      if (bool2)
      {
        localObject1 = paramHttpResponse.getHeaders("Content-Length");
        int k = localObject1.length;
        if (k != i) {
          continue;
        }
        localObject1 = localObject1[0];
      }
      try
      {
        localObject1 = ((Header)localObject1).getValue();
        int j = Integer.parseInt((String)localObject1);
        if (j < 0) {
          continue;
        }
        label137:
        localObject1 = paramHttpResponse.headerIterator("Connection");
        boolean bool4 = ((HeaderIterator)localObject1).hasNext();
        if (!bool4) {
          localObject1 = paramHttpResponse.headerIterator("Proxy-Connection");
        }
        bool4 = ((HeaderIterator)localObject1).hasNext();
        if (bool4) {}
        try
        {
          localObject2 = createTokenIterator((HeaderIterator)localObject1);
          j = 0;
          localObject1 = null;
          for (;;)
          {
            boolean bool5 = ((TokenIterator)localObject2).hasNext();
            if (!bool5) {
              break label264;
            }
            String str1 = ((TokenIterator)localObject2).nextToken();
            String str2 = "Close";
            boolean bool6 = str2.equalsIgnoreCase(str1);
            if (bool6) {
              break;
            }
            str2 = "Keep-Alive";
            bool5 = str2.equalsIgnoreCase(str1);
            if (bool5) {
              j = i;
            }
          }
          label264:
          if (j != 0)
          {
            bool1 = i;
            continue;
          }
          localObject1 = HttpVersion.HTTP_1_0;
          boolean bool3 = localProtocolVersion.lessEquals((ProtocolVersion)localObject1);
          if (!bool3) {}
          for (;;)
          {
            bool1 = i;
            break;
            i = 0;
          }
        }
        catch (ParseException localParseException) {}
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultConnectionReuseStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */