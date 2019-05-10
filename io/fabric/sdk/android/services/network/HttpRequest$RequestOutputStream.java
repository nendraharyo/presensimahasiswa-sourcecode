package io.fabric.sdk.android.services.network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class HttpRequest$RequestOutputStream
  extends BufferedOutputStream
{
  private final CharsetEncoder encoder;
  
  public HttpRequest$RequestOutputStream(OutputStream paramOutputStream, String paramString, int paramInt)
  {
    super(paramOutputStream, paramInt);
    CharsetEncoder localCharsetEncoder = Charset.forName(HttpRequest.access$000(paramString)).newEncoder();
    this.encoder = localCharsetEncoder;
  }
  
  public RequestOutputStream write(String paramString)
  {
    Object localObject1 = this.encoder;
    Object localObject2 = CharBuffer.wrap(paramString);
    localObject1 = ((CharsetEncoder)localObject1).encode((CharBuffer)localObject2);
    localObject2 = ((ByteBuffer)localObject1).array();
    int i = ((ByteBuffer)localObject1).limit();
    super.write((byte[])localObject2, 0, i);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$RequestOutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */