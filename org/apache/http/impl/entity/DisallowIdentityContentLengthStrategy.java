package org.apache.http.impl.entity;

import org.apache.http.HttpMessage;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;

public class DisallowIdentityContentLengthStrategy
  implements ContentLengthStrategy
{
  public static final DisallowIdentityContentLengthStrategy INSTANCE;
  private final ContentLengthStrategy contentLengthStrategy;
  
  static
  {
    DisallowIdentityContentLengthStrategy localDisallowIdentityContentLengthStrategy = new org/apache/http/impl/entity/DisallowIdentityContentLengthStrategy;
    LaxContentLengthStrategy localLaxContentLengthStrategy = new org/apache/http/impl/entity/LaxContentLengthStrategy;
    localLaxContentLengthStrategy.<init>(0);
    localDisallowIdentityContentLengthStrategy.<init>(localLaxContentLengthStrategy);
    INSTANCE = localDisallowIdentityContentLengthStrategy;
  }
  
  public DisallowIdentityContentLengthStrategy(ContentLengthStrategy paramContentLengthStrategy)
  {
    this.contentLengthStrategy = paramContentLengthStrategy;
  }
  
  public long determineLength(HttpMessage paramHttpMessage)
  {
    Object localObject = this.contentLengthStrategy;
    long l1 = ((ContentLengthStrategy)localObject).determineLength(paramHttpMessage);
    long l2 = -1;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = new org/apache/http/ProtocolException;
      ((ProtocolException)localObject).<init>("Identity transfer encoding cannot be used");
      throw ((Throwable)localObject);
    }
    return l1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\entity\DisallowIdentityContentLengthStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */