package org.apache.http.config;

import org.apache.http.util.Args;

public class SocketConfig
  implements Cloneable
{
  public static final SocketConfig DEFAULT;
  private final boolean soKeepAlive;
  private final int soLinger;
  private final boolean soReuseAddress;
  private final int soTimeout;
  private final boolean tcpNoDelay;
  
  static
  {
    SocketConfig.Builder localBuilder = new org/apache/http/config/SocketConfig$Builder;
    localBuilder.<init>();
    DEFAULT = localBuilder.build();
  }
  
  SocketConfig(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.soTimeout = paramInt1;
    this.soReuseAddress = paramBoolean1;
    this.soLinger = paramInt2;
    this.soKeepAlive = paramBoolean2;
    this.tcpNoDelay = paramBoolean3;
  }
  
  public static SocketConfig.Builder copy(SocketConfig paramSocketConfig)
  {
    Args.notNull(paramSocketConfig, "Socket config");
    SocketConfig.Builder localBuilder = new org/apache/http/config/SocketConfig$Builder;
    localBuilder.<init>();
    int i = paramSocketConfig.getSoTimeout();
    localBuilder = localBuilder.setSoTimeout(i);
    boolean bool1 = paramSocketConfig.isSoReuseAddress();
    localBuilder = localBuilder.setSoReuseAddress(bool1);
    int j = paramSocketConfig.getSoLinger();
    localBuilder = localBuilder.setSoLinger(j);
    boolean bool2 = paramSocketConfig.isSoKeepAlive();
    localBuilder = localBuilder.setSoKeepAlive(bool2);
    bool2 = paramSocketConfig.isTcpNoDelay();
    return localBuilder.setTcpNoDelay(bool2);
  }
  
  public static SocketConfig.Builder custom()
  {
    SocketConfig.Builder localBuilder = new org/apache/http/config/SocketConfig$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  protected SocketConfig clone()
  {
    return (SocketConfig)super.clone();
  }
  
  public int getSoLinger()
  {
    return this.soLinger;
  }
  
  public int getSoTimeout()
  {
    return this.soTimeout;
  }
  
  public boolean isSoKeepAlive()
  {
    return this.soKeepAlive;
  }
  
  public boolean isSoReuseAddress()
  {
    return this.soReuseAddress;
  }
  
  public boolean isTcpNoDelay()
  {
    return this.tcpNoDelay;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[soTimeout=");
    int i = this.soTimeout;
    localStringBuilder2 = localStringBuilder2.append(i).append(", soReuseAddress=");
    boolean bool1 = this.soReuseAddress;
    localStringBuilder2 = localStringBuilder2.append(bool1).append(", soLinger=");
    int j = this.soLinger;
    localStringBuilder2 = localStringBuilder2.append(j).append(", soKeepAlive=");
    boolean bool2 = this.soKeepAlive;
    localStringBuilder2 = localStringBuilder2.append(bool2).append(", tcpNoDelay=");
    bool2 = this.tcpNoDelay;
    localStringBuilder2.append(bool2).append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\SocketConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */