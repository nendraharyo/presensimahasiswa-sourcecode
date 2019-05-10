package b.a.a.a.g;

import b.a.a.a.e;
import b.a.a.a.k;
import b.a.a.a.o.a;
import java.io.InputStream;
import java.io.OutputStream;

public class f
  implements k
{
  protected k wrappedEntity;
  
  public f(k paramk)
  {
    k localk = (k)a.a(paramk, "Wrapped entity");
    this.wrappedEntity = localk;
  }
  
  public void consumeContent()
  {
    this.wrappedEntity.consumeContent();
  }
  
  public InputStream getContent()
  {
    return this.wrappedEntity.getContent();
  }
  
  public e getContentEncoding()
  {
    return this.wrappedEntity.getContentEncoding();
  }
  
  public long getContentLength()
  {
    return this.wrappedEntity.getContentLength();
  }
  
  public e getContentType()
  {
    return this.wrappedEntity.getContentType();
  }
  
  public boolean isChunked()
  {
    return this.wrappedEntity.isChunked();
  }
  
  public boolean isRepeatable()
  {
    return this.wrappedEntity.isRepeatable();
  }
  
  public boolean isStreaming()
  {
    return this.wrappedEntity.isStreaming();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.wrappedEntity.writeTo(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\g\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */