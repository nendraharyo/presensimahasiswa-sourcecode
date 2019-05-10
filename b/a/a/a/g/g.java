package b.a.a.a.g;

import b.a.a.a.n.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class g
  extends a
  implements Cloneable
{
  protected final byte[] d;
  
  public g(String paramString, e parame)
  {
    localObject1 = "Source string";
    b.a.a.a.o.a.a(paramString, (String)localObject1);
    if (parame != null) {}
    for (localObject1 = parame.a();; localObject1 = null)
    {
      if (localObject1 == null) {
        localObject1 = d.a;
      }
      try
      {
        Object localObject2 = ((Charset)localObject1).name();
        localObject2 = paramString.getBytes((String)localObject2);
        this.d = ((byte[])localObject2);
        if (parame != null)
        {
          localObject1 = parame.toString();
          a((String)localObject1);
        }
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        UnsupportedCharsetException localUnsupportedCharsetException = new java/nio/charset/UnsupportedCharsetException;
        localObject1 = ((Charset)localObject1).name();
        localUnsupportedCharsetException.<init>((String)localObject1);
        throw localUnsupportedCharsetException;
      }
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public InputStream getContent()
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = this.d;
    localByteArrayInputStream.<init>(arrayOfByte);
    return localByteArrayInputStream;
  }
  
  public long getContentLength()
  {
    return this.d.length;
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    b.a.a.a.o.a.a(paramOutputStream, "Output stream");
    byte[] arrayOfByte = this.d;
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.flush();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\g\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */