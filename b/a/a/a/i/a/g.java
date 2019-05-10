package b.a.a.a.i.a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

class g
  extends OutputStream
{
  private final MessageDigest a;
  private boolean b;
  private byte[] c;
  
  g(MessageDigest paramMessageDigest)
  {
    this.a = paramMessageDigest;
    this.a.reset();
  }
  
  public byte[] a()
  {
    return this.c;
  }
  
  public void close()
  {
    boolean bool = this.b;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.b = bool;
      byte[] arrayOfByte = this.a.digest();
      this.c = arrayOfByte;
      super.close();
    }
  }
  
  public void write(int paramInt)
  {
    boolean bool = this.b;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Stream has been already closed");
      throw ((Throwable)localObject);
    }
    Object localObject = this.a;
    byte b1 = (byte)paramInt;
    ((MessageDigest)localObject).update(b1);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = this.b;
    if (bool)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Stream has been already closed");
      throw localIOException;
    }
    this.a.update(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */