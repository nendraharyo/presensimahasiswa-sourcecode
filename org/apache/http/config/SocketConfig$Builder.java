package org.apache.http.config;

public class SocketConfig$Builder
{
  private boolean soKeepAlive;
  private int soLinger = -1;
  private boolean soReuseAddress;
  private int soTimeout;
  private boolean tcpNoDelay = true;
  
  public SocketConfig build()
  {
    SocketConfig localSocketConfig = new org/apache/http/config/SocketConfig;
    int i = this.soTimeout;
    boolean bool1 = this.soReuseAddress;
    int j = this.soLinger;
    boolean bool2 = this.soKeepAlive;
    boolean bool3 = this.tcpNoDelay;
    localSocketConfig.<init>(i, bool1, j, bool2, bool3);
    return localSocketConfig;
  }
  
  public Builder setSoKeepAlive(boolean paramBoolean)
  {
    this.soKeepAlive = paramBoolean;
    return this;
  }
  
  public Builder setSoLinger(int paramInt)
  {
    this.soLinger = paramInt;
    return this;
  }
  
  public Builder setSoReuseAddress(boolean paramBoolean)
  {
    this.soReuseAddress = paramBoolean;
    return this;
  }
  
  public Builder setSoTimeout(int paramInt)
  {
    this.soTimeout = paramInt;
    return this;
  }
  
  public Builder setTcpNoDelay(boolean paramBoolean)
  {
    this.tcpNoDelay = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\SocketConfig$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */