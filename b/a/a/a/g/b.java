package b.a.a.a.g;

import java.io.InputStream;
import java.io.OutputStream;

public class b
  extends a
{
  private InputStream d;
  private long e = -1;
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  public void a(InputStream paramInputStream)
  {
    this.d = paramInputStream;
  }
  
  public InputStream getContent()
  {
    InputStream localInputStream = this.d;
    boolean bool;
    if (localInputStream != null) {
      bool = true;
    }
    for (;;)
    {
      b.a.a.a.o.b.a(bool, "Content has not been provided");
      return this.d;
      bool = false;
      localInputStream = null;
    }
  }
  
  public long getContentLength()
  {
    return this.e;
  }
  
  public boolean isRepeatable()
  {
    return false;
  }
  
  public boolean isStreaming()
  {
    InputStream localInputStream = this.d;
    boolean bool;
    if (localInputStream != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localInputStream = null;
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Object localObject1 = "Output stream";
    b.a.a.a.o.a.a(paramOutputStream, (String)localObject1);
    InputStream localInputStream = getContent();
    int i = 4096;
    try
    {
      localObject1 = new byte[i];
      for (;;)
      {
        int j = localInputStream.read((byte[])localObject1);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        paramOutputStream.write((byte[])localObject1, 0, j);
      }
    }
    finally
    {
      localInputStream.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\g\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */