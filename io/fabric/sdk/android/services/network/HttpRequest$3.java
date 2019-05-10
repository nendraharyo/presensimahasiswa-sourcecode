package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.OutputStream;

class HttpRequest$3
  extends HttpRequest.CloseOperation
{
  HttpRequest$3(HttpRequest paramHttpRequest, Closeable paramCloseable, boolean paramBoolean, OutputStream paramOutputStream)
  {
    super(paramCloseable, paramBoolean);
  }
  
  protected HttpRequest run()
  {
    HttpRequest localHttpRequest = this.this$0;
    OutputStream localOutputStream = this.val$output;
    return localHttpRequest.receive(localOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */