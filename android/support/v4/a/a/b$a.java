package android.support.v4.a.a;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class b$a
{
  public final void callbackFailAsync(int paramInt, Handler paramHandler)
  {
    if (paramHandler == null)
    {
      paramHandler = new android/os/Handler;
      localObject = Looper.getMainLooper();
      paramHandler.<init>((Looper)localObject);
    }
    Object localObject = new android/support/v4/a/a/b$a$2;
    ((b.a.2)localObject).<init>(this, paramInt);
    paramHandler.post((Runnable)localObject);
  }
  
  public final void callbackSuccessAsync(Typeface paramTypeface, Handler paramHandler)
  {
    if (paramHandler == null)
    {
      paramHandler = new android/os/Handler;
      localObject = Looper.getMainLooper();
      paramHandler.<init>((Looper)localObject);
    }
    Object localObject = new android/support/v4/a/a/b$a$1;
    ((b.a.1)localObject).<init>(this, paramTypeface);
    paramHandler.post((Runnable)localObject);
  }
  
  public abstract void onFontRetrievalFailed(int paramInt);
  
  public abstract void onFontRetrieved(Typeface paramTypeface);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\a\b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */