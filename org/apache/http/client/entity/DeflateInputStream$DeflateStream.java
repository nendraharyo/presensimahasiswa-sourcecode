package org.apache.http.client.entity;

import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

class DeflateInputStream$DeflateStream
  extends InflaterInputStream
{
  private boolean closed = false;
  
  public DeflateInputStream$DeflateStream(InputStream paramInputStream, Inflater paramInflater)
  {
    super(paramInputStream, paramInflater);
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
      Inflater localInflater = this.inf;
      localInflater.end();
      super.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\DeflateInputStream$DeflateStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */