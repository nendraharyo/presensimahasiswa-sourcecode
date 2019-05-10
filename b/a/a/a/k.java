package b.a.a.a;

import java.io.InputStream;
import java.io.OutputStream;

public abstract interface k
{
  public abstract void consumeContent();
  
  public abstract InputStream getContent();
  
  public abstract e getContentEncoding();
  
  public abstract long getContentLength();
  
  public abstract e getContentType();
  
  public abstract boolean isChunked();
  
  public abstract boolean isRepeatable();
  
  public abstract boolean isStreaming();
  
  public abstract void writeTo(OutputStream paramOutputStream);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */