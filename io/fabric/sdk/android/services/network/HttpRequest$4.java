package io.fabric.sdk.android.services.network;

import java.io.BufferedReader;
import java.io.Closeable;
import java.nio.CharBuffer;

class HttpRequest$4
  extends HttpRequest.CloseOperation
{
  HttpRequest$4(HttpRequest paramHttpRequest, Closeable paramCloseable, boolean paramBoolean, BufferedReader paramBufferedReader, Appendable paramAppendable)
  {
    super(paramCloseable, paramBoolean);
  }
  
  public HttpRequest run()
  {
    int i = HttpRequest.access$100(this.this$0);
    CharBuffer localCharBuffer = CharBuffer.allocate(i);
    for (;;)
    {
      BufferedReader localBufferedReader = this.val$reader;
      int j = localBufferedReader.read(localCharBuffer);
      int k = -1;
      if (j == k) {
        break;
      }
      localCharBuffer.rewind();
      Appendable localAppendable = this.val$appendable;
      localAppendable.append(localCharBuffer, 0, j);
      localCharBuffer.rewind();
    }
    return this.this$0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */