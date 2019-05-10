package io.fabric.sdk.android.services.network;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

class HttpRequest$6
  extends HttpRequest.CloseOperation
{
  HttpRequest$6(HttpRequest paramHttpRequest, Closeable paramCloseable, boolean paramBoolean, InputStream paramInputStream, OutputStream paramOutputStream)
  {
    super(paramCloseable, paramBoolean);
  }
  
  public HttpRequest run()
  {
    int i = HttpRequest.access$100(this.this$0);
    byte[] arrayOfByte = new byte[i];
    for (;;)
    {
      InputStream localInputStream = this.val$input;
      int j = localInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        break;
      }
      OutputStream localOutputStream = this.val$output;
      localOutputStream.write(arrayOfByte, 0, j);
    }
    return this.this$0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */