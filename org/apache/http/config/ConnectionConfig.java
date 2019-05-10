package org.apache.http.config;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.util.Args;

public class ConnectionConfig
  implements Cloneable
{
  public static final ConnectionConfig DEFAULT;
  private final int bufferSize;
  private final Charset charset;
  private final int fragmentSizeHint;
  private final CodingErrorAction malformedInputAction;
  private final MessageConstraints messageConstraints;
  private final CodingErrorAction unmappableInputAction;
  
  static
  {
    ConnectionConfig.Builder localBuilder = new org/apache/http/config/ConnectionConfig$Builder;
    localBuilder.<init>();
    DEFAULT = localBuilder.build();
  }
  
  ConnectionConfig(int paramInt1, int paramInt2, Charset paramCharset, CodingErrorAction paramCodingErrorAction1, CodingErrorAction paramCodingErrorAction2, MessageConstraints paramMessageConstraints)
  {
    this.bufferSize = paramInt1;
    this.fragmentSizeHint = paramInt2;
    this.charset = paramCharset;
    this.malformedInputAction = paramCodingErrorAction1;
    this.unmappableInputAction = paramCodingErrorAction2;
    this.messageConstraints = paramMessageConstraints;
  }
  
  public static ConnectionConfig.Builder copy(ConnectionConfig paramConnectionConfig)
  {
    Args.notNull(paramConnectionConfig, "Connection config");
    ConnectionConfig.Builder localBuilder = new org/apache/http/config/ConnectionConfig$Builder;
    localBuilder.<init>();
    Object localObject = paramConnectionConfig.getCharset();
    localBuilder = localBuilder.setCharset((Charset)localObject);
    localObject = paramConnectionConfig.getMalformedInputAction();
    localBuilder = localBuilder.setMalformedInputAction((CodingErrorAction)localObject);
    localObject = paramConnectionConfig.getUnmappableInputAction();
    localBuilder = localBuilder.setUnmappableInputAction((CodingErrorAction)localObject);
    localObject = paramConnectionConfig.getMessageConstraints();
    return localBuilder.setMessageConstraints((MessageConstraints)localObject);
  }
  
  public static ConnectionConfig.Builder custom()
  {
    ConnectionConfig.Builder localBuilder = new org/apache/http/config/ConnectionConfig$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  protected ConnectionConfig clone()
  {
    return (ConnectionConfig)super.clone();
  }
  
  public int getBufferSize()
  {
    return this.bufferSize;
  }
  
  public Charset getCharset()
  {
    return this.charset;
  }
  
  public int getFragmentSizeHint()
  {
    return this.fragmentSizeHint;
  }
  
  public CodingErrorAction getMalformedInputAction()
  {
    return this.malformedInputAction;
  }
  
  public MessageConstraints getMessageConstraints()
  {
    return this.messageConstraints;
  }
  
  public CodingErrorAction getUnmappableInputAction()
  {
    return this.unmappableInputAction;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[bufferSize=");
    int i = this.bufferSize;
    localStringBuilder2 = localStringBuilder2.append(i).append(", fragmentSizeHint=");
    i = this.fragmentSizeHint;
    localStringBuilder2 = localStringBuilder2.append(i).append(", charset=");
    Object localObject = this.charset;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", malformedInputAction=");
    localObject = this.malformedInputAction;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", unmappableInputAction=");
    localObject = this.unmappableInputAction;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", messageConstraints=");
    localObject = this.messageConstraints;
    localStringBuilder2.append(localObject).append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\ConnectionConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */