package org.apache.http;

import java.io.Serializable;

public final class HttpVersion
  extends ProtocolVersion
  implements Serializable
{
  public static final String HTTP = "HTTP";
  public static final HttpVersion HTTP_0_9;
  public static final HttpVersion HTTP_1_0;
  public static final HttpVersion HTTP_1_1;
  private static final long serialVersionUID = -5856653513894415344L;
  
  static
  {
    int i = 1;
    HttpVersion localHttpVersion = new org/apache/http/HttpVersion;
    localHttpVersion.<init>(0, 9);
    HTTP_0_9 = localHttpVersion;
    localHttpVersion = new org/apache/http/HttpVersion;
    localHttpVersion.<init>(i, 0);
    HTTP_1_0 = localHttpVersion;
    localHttpVersion = new org/apache/http/HttpVersion;
    localHttpVersion.<init>(i, i);
    HTTP_1_1 = localHttpVersion;
  }
  
  public HttpVersion(int paramInt1, int paramInt2)
  {
    super("HTTP", paramInt1, paramInt2);
  }
  
  public ProtocolVersion forVersion(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = this.major;
    if (paramInt1 == j)
    {
      j = this.minor;
      if (paramInt2 != j) {}
    }
    for (;;)
    {
      return this;
      if (paramInt1 == i)
      {
        if (paramInt2 == 0)
        {
          this = HTTP_1_0;
          continue;
        }
        if (paramInt2 == i)
        {
          this = HTTP_1_1;
          continue;
        }
      }
      if (paramInt1 == 0)
      {
        j = 9;
        if (paramInt2 == j)
        {
          this = HTTP_0_9;
          continue;
        }
      }
      this = new org/apache/http/HttpVersion;
      this(paramInt1, paramInt2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\HttpVersion.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */