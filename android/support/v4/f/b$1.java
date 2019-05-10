package android.support.v4.f;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.h.g;
import java.util.concurrent.Callable;

final class b$1
  implements Callable
{
  b$1(Context paramContext, a parama, int paramInt, String paramString) {}
  
  public b.c a()
  {
    Object localObject1 = this.a;
    Object localObject2 = this.b;
    int i = this.c;
    localObject1 = b.a((Context)localObject1, (a)localObject2, i);
    localObject2 = ((b.c)localObject1).a;
    if (localObject2 != null)
    {
      localObject2 = b.a();
      String str = this.d;
      Typeface localTypeface = ((b.c)localObject1).a;
      ((g)localObject2).put(str, localTypeface);
    }
    return (b.c)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\b$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */