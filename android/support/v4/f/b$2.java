package android.support.v4.f;

import android.graphics.Typeface;
import android.os.Handler;
import android.support.v4.a.a.b.a;

final class b$2
  implements c.a
{
  b$2(b.a parama, Handler paramHandler) {}
  
  public void a(b.c paramc)
  {
    b.a locala;
    int i;
    Handler localHandler;
    if (paramc == null)
    {
      locala = this.a;
      i = 1;
      localHandler = this.b;
      locala.callbackFailAsync(i, localHandler);
    }
    for (;;)
    {
      return;
      int j = paramc.b;
      if (j == 0)
      {
        locala = this.a;
        Typeface localTypeface = paramc.a;
        localHandler = this.b;
        locala.callbackSuccessAsync(localTypeface, localHandler);
      }
      else
      {
        locala = this.a;
        i = paramc.b;
        localHandler = this.b;
        locala.callbackFailAsync(i, localHandler);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\b$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */