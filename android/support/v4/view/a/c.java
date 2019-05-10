package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class c
{
  private final Object a;
  
  public c()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/a/c$b;
      ((c.b)localObject).<init>(this);
      this.a = localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 16;
      if (i >= j)
      {
        localObject = new android/support/v4/view/a/c$a;
        ((c.a)localObject).<init>(this);
        this.a = localObject;
      }
      else
      {
        i = 0;
        localObject = null;
        this.a = null;
      }
    }
  }
  
  public c(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public b a(int paramInt)
  {
    return null;
  }
  
  public Object a()
  {
    return this.a;
  }
  
  public List a(String paramString, int paramInt)
  {
    return null;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
  
  public b b(int paramInt)
  {
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */