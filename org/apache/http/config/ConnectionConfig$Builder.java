package org.apache.http.config;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;

public class ConnectionConfig$Builder
{
  private int bufferSize;
  private Charset charset;
  private int fragmentSizeHint = -1;
  private CodingErrorAction malformedInputAction;
  private MessageConstraints messageConstraints;
  private CodingErrorAction unmappableInputAction;
  
  public ConnectionConfig build()
  {
    Charset localCharset = this.charset;
    Object localObject;
    if (localCharset == null)
    {
      localObject = this.malformedInputAction;
      if (localObject == null)
      {
        localObject = this.unmappableInputAction;
        if (localObject == null) {}
      }
      else
      {
        localCharset = Consts.ASCII;
      }
    }
    int i = this.bufferSize;
    int j;
    if (i > 0)
    {
      j = this.bufferSize;
      i = this.fragmentSizeHint;
      if (i < 0) {
        break label108;
      }
    }
    label108:
    for (int k = this.fragmentSizeHint;; k = j)
    {
      localObject = new org/apache/http/config/ConnectionConfig;
      CodingErrorAction localCodingErrorAction1 = this.malformedInputAction;
      CodingErrorAction localCodingErrorAction2 = this.unmappableInputAction;
      MessageConstraints localMessageConstraints = this.messageConstraints;
      ((ConnectionConfig)localObject).<init>(j, k, localCharset, localCodingErrorAction1, localCodingErrorAction2, localMessageConstraints);
      return (ConnectionConfig)localObject;
      j = 8192;
      break;
    }
  }
  
  public Builder setBufferSize(int paramInt)
  {
    this.bufferSize = paramInt;
    return this;
  }
  
  public Builder setCharset(Charset paramCharset)
  {
    this.charset = paramCharset;
    return this;
  }
  
  public Builder setFragmentSizeHint(int paramInt)
  {
    this.fragmentSizeHint = paramInt;
    return this;
  }
  
  public Builder setMalformedInputAction(CodingErrorAction paramCodingErrorAction)
  {
    this.malformedInputAction = paramCodingErrorAction;
    if (paramCodingErrorAction != null)
    {
      Charset localCharset = this.charset;
      if (localCharset == null)
      {
        localCharset = Consts.ASCII;
        this.charset = localCharset;
      }
    }
    return this;
  }
  
  public Builder setMessageConstraints(MessageConstraints paramMessageConstraints)
  {
    this.messageConstraints = paramMessageConstraints;
    return this;
  }
  
  public Builder setUnmappableInputAction(CodingErrorAction paramCodingErrorAction)
  {
    this.unmappableInputAction = paramCodingErrorAction;
    if (paramCodingErrorAction != null)
    {
      Charset localCharset = this.charset;
      if (localCharset == null)
      {
        localCharset = Consts.ASCII;
        this.charset = localCharset;
      }
    }
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\ConnectionConfig$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */