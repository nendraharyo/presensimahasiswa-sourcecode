package b.a.a.a.g;

import b.a.a.a.k;
import b.a.a.a.o.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class c
  extends f
{
  private final byte[] a;
  
  public c(k paramk)
  {
    super(paramk);
    boolean bool = paramk.isRepeatable();
    byte[] arrayOfByte;
    if (bool)
    {
      long l1 = paramk.getContentLength();
      long l2 = 0L;
      bool = l1 < l2;
      if (!bool) {}
    }
    else
    {
      arrayOfByte = b.a.a.a.o.f.b(paramk);
    }
    for (this.a = arrayOfByte;; this.a = null)
    {
      return;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public InputStream getContent()
  {
    Object localObject = this.a;
    if (localObject != null)
    {
      localObject = new java/io/ByteArrayInputStream;
      byte[] arrayOfByte = this.a;
      ((ByteArrayInputStream)localObject).<init>(arrayOfByte);
    }
    for (;;)
    {
      return (InputStream)localObject;
      localObject = super.getContent();
    }
  }
  
  public long getContentLength()
  {
    byte[] arrayOfByte = this.a;
    int i;
    if (arrayOfByte != null)
    {
      arrayOfByte = this.a;
      i = arrayOfByte.length;
    }
    for (long l = i;; l = super.getContentLength()) {
      return l;
    }
  }
  
  public boolean isChunked()
  {
    byte[] arrayOfByte = this.a;
    boolean bool;
    if (arrayOfByte == null)
    {
      bool = super.isChunked();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    byte[] arrayOfByte = this.a;
    boolean bool;
    if (arrayOfByte == null)
    {
      bool = super.isStreaming();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    a.a(paramOutputStream, "Output stream");
    byte[] arrayOfByte = this.a;
    if (arrayOfByte != null)
    {
      arrayOfByte = this.a;
      paramOutputStream.write(arrayOfByte);
    }
    for (;;)
    {
      return;
      super.writeTo(paramOutputStream);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\g\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */