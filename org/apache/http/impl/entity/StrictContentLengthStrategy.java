package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.util.Args;

public class StrictContentLengthStrategy
  implements ContentLengthStrategy
{
  public static final StrictContentLengthStrategy INSTANCE;
  private final int implicitLen;
  
  static
  {
    StrictContentLengthStrategy localStrictContentLengthStrategy = new org/apache/http/impl/entity/StrictContentLengthStrategy;
    localStrictContentLengthStrategy.<init>();
    INSTANCE = localStrictContentLengthStrategy;
  }
  
  public StrictContentLengthStrategy()
  {
    this(-1);
  }
  
  public StrictContentLengthStrategy(int paramInt)
  {
    this.implicitLen = paramInt;
  }
  
  public long determineLength(HttpMessage paramHttpMessage)
  {
    Args.notNull(paramHttpMessage, "HTTP message");
    Object localObject1 = paramHttpMessage.getFirstHeader("Transfer-Encoding");
    Object localObject2;
    boolean bool1;
    Object localObject3;
    long l1;
    if (localObject1 != null)
    {
      localObject1 = ((Header)localObject1).getValue();
      localObject2 = "chunked";
      bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (bool1)
      {
        localObject1 = paramHttpMessage.getProtocolVersion();
        localObject2 = HttpVersion.HTTP_1_0;
        boolean bool2 = ((ProtocolVersion)localObject1).lessEquals((ProtocolVersion)localObject2);
        if (bool2)
        {
          localObject1 = new org/apache/http/ProtocolException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Chunked transfer encoding not allowed for ");
          localObject3 = paramHttpMessage.getProtocolVersion();
          localObject2 = localObject3;
          ((ProtocolException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        l1 = -2;
      }
    }
    for (;;)
    {
      return l1;
      localObject2 = "identity";
      bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (bool1)
      {
        l1 = -1;
      }
      else
      {
        localObject2 = new org/apache/http/ProtocolException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = "Unsupported transfer encoding: " + (String)localObject1;
        ((ProtocolException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
        localObject1 = paramHttpMessage.getFirstHeader("Content-Length");
        if (localObject1 != null)
        {
          localObject3 = ((Header)localObject1).getValue();
          try
          {
            l1 = Long.parseLong((String)localObject3);
            long l2 = 0L;
            boolean bool3 = l1 < l2;
            if (!bool3) {
              continue;
            }
            localObject1 = new org/apache/http/ProtocolException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            String str = "Negative content length: ";
            localObject2 = ((StringBuilder)localObject2).append(str);
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            localObject2 = ((StringBuilder)localObject2).toString();
            ((ProtocolException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            ProtocolException localProtocolException = new org/apache/http/ProtocolException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = "Invalid content length: " + (String)localObject3;
            localProtocolException.<init>((String)localObject2);
            throw localProtocolException;
          }
        }
        else
        {
          int i = this.implicitLen;
          l1 = i;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\entity\StrictContentLengthStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */