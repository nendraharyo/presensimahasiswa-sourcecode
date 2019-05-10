package io.fabric.sdk.android.services.network;

import java.io.Flushable;
import java.io.Reader;
import java.io.Writer;

class HttpRequest$8
  extends HttpRequest.FlushOperation
{
  HttpRequest$8(HttpRequest paramHttpRequest, Flushable paramFlushable, Reader paramReader, Writer paramWriter)
  {
    super(paramFlushable);
  }
  
  protected HttpRequest run()
  {
    HttpRequest localHttpRequest = this.this$0;
    Reader localReader = this.val$input;
    Writer localWriter = this.val$writer;
    return localHttpRequest.copy(localReader, localWriter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */