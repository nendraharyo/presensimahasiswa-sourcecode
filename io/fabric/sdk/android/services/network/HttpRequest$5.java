package io.fabric.sdk.android.services.network;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Writer;

class HttpRequest$5
  extends HttpRequest.CloseOperation
{
  HttpRequest$5(HttpRequest paramHttpRequest, Closeable paramCloseable, boolean paramBoolean, BufferedReader paramBufferedReader, Writer paramWriter)
  {
    super(paramCloseable, paramBoolean);
  }
  
  public HttpRequest run()
  {
    HttpRequest localHttpRequest = this.this$0;
    BufferedReader localBufferedReader = this.val$reader;
    Writer localWriter = this.val$writer;
    return localHttpRequest.copy(localBufferedReader, localWriter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */