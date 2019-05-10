package org.apache.http.impl.io;

import org.apache.http.io.HttpTransportMetrics;

public class HttpTransportMetricsImpl
  implements HttpTransportMetrics
{
  private long bytesTransferred = 0L;
  
  public long getBytesTransferred()
  {
    return this.bytesTransferred;
  }
  
  public void incrementBytesTransferred(long paramLong)
  {
    long l = this.bytesTransferred + paramLong;
    this.bytesTransferred = l;
  }
  
  public void reset()
  {
    this.bytesTransferred = 0L;
  }
  
  public void setBytesTransferred(long paramLong)
  {
    this.bytesTransferred = paramLong;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\HttpTransportMetricsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */