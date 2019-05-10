package org.apache.http.impl.auth;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

class HttpEntityDigester
  extends OutputStream
{
  private boolean closed;
  private byte[] digest;
  private final MessageDigest digester;
  
  HttpEntityDigester(MessageDigest paramMessageDigest)
  {
    this.digester = paramMessageDigest;
    this.digester.reset();
  }
  
  public void close()
  {
    boolean bool = this.closed;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.closed = bool;
      byte[] arrayOfByte = this.digester.digest();
      this.digest = arrayOfByte;
      super.close();
    }
  }
  
  public byte[] getDigest()
  {
    return this.digest;
  }
  
  public void write(int paramInt)
  {
    boolean bool = this.closed;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Stream has been already closed");
      throw ((Throwable)localObject);
    }
    Object localObject = this.digester;
    byte b = (byte)paramInt;
    ((MessageDigest)localObject).update(b);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = this.closed;
    if (bool)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Stream has been already closed");
      throw localIOException;
    }
    this.digester.update(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\HttpEntityDigester.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */