package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.util.Args;

public class LaxContentLengthStrategy
  implements ContentLengthStrategy
{
  public static final LaxContentLengthStrategy INSTANCE;
  private final int implicitLen;
  
  static
  {
    LaxContentLengthStrategy localLaxContentLengthStrategy = new org/apache/http/impl/entity/LaxContentLengthStrategy;
    localLaxContentLengthStrategy.<init>();
    INSTANCE = localLaxContentLengthStrategy;
  }
  
  public LaxContentLengthStrategy()
  {
    this(-1);
  }
  
  public LaxContentLengthStrategy(int paramInt)
  {
    this.implicitLen = paramInt;
  }
  
  public long determineLength(HttpMessage paramHttpMessage)
  {
    long l1 = -1;
    Args.notNull(paramHttpMessage, "HTTP message");
    Object localObject1 = paramHttpMessage.getFirstHeader("Transfer-Encoding");
    Object localObject2;
    if (localObject1 != null) {
      for (;;)
      {
        int i;
        boolean bool2;
        try
        {
          localObject2 = ((Header)localObject1).getElements();
          i = localObject2.length;
          String str1 = "identity";
          localObject1 = ((Header)localObject1).getValue();
          bool2 = str1.equalsIgnoreCase((String)localObject1);
          if (bool2) {
            return l1;
          }
        }
        catch (ParseException localParseException)
        {
          ProtocolException localProtocolException = new org/apache/http/ProtocolException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = "Invalid Transfer-Encoding header value: " + localObject1;
          localProtocolException.<init>((String)localObject1, localParseException);
          throw localProtocolException;
        }
        if (i > 0)
        {
          localObject1 = "chunked";
          i += -1;
          localObject2 = localObject2[i].getName();
          bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
          if (bool2) {
            l1 = -2;
          }
        }
      }
    }
    localObject1 = paramHttpMessage.getFirstHeader("Content-Length");
    int j;
    label198:
    String str2;
    if (localObject1 != null)
    {
      localObject1 = "Content-Length";
      localObject2 = paramHttpMessage.getHeaders((String)localObject1);
      j = localObject2.length + -1;
      if (j < 0) {
        break label271;
      }
      str2 = localObject2[j];
    }
    for (;;)
    {
      try
      {
        str2 = str2.getValue();
        l2 = Long.parseLong(str2);
        long l3 = 0L;
        boolean bool1 = l2 < l3;
        if (bool1) {
          break;
        }
        l1 = l2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        j += -1;
      }
      break label198;
      int k = this.implicitLen;
      l1 = k;
      break;
      label271:
      long l2 = l1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\entity\LaxContentLengthStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */