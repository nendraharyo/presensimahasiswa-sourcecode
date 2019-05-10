package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.Reader;
import java.io.Writer;

class HttpRequest$7
  extends HttpRequest.CloseOperation
{
  HttpRequest$7(HttpRequest paramHttpRequest, Closeable paramCloseable, boolean paramBoolean, Reader paramReader, Writer paramWriter)
  {
    super(paramCloseable, paramBoolean);
  }
  
  public HttpRequest run()
  {
    int i = HttpRequest.access$100(this.this$0);
    char[] arrayOfChar = new char[i];
    for (;;)
    {
      Reader localReader = this.val$input;
      int j = localReader.read(arrayOfChar);
      int k = -1;
      if (j == k) {
        break;
      }
      Writer localWriter = this.val$output;
      localWriter.write(arrayOfChar, 0, j);
    }
    return this.this$0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */