package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.a.a.a.a;
import android.support.v4.a.a.a.b;
import android.support.v4.a.a.a.d;
import android.support.v4.a.a.b.a;
import android.support.v4.f.a;
import android.support.v4.f.b;
import android.support.v4.f.b.b;

public class c
{
  private static final c.a a;
  private static final android.support.v4.h.g b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int k = 26;
    Object localObject;
    if (i >= k)
    {
      localObject = new android/support/v4/b/f;
      ((f)localObject).<init>();
      a = (c.a)localObject;
    }
    for (;;)
    {
      localObject = new android/support/v4/h/g;
      ((android.support.v4.h.g)localObject).<init>(16);
      b = (android.support.v4.h.g)localObject;
      return;
      i = Build.VERSION.SDK_INT;
      k = 24;
      if (i >= k)
      {
        boolean bool = e.a();
        if (bool)
        {
          localObject = new android/support/v4/b/e;
          ((e)localObject).<init>();
          a = (c.a)localObject;
          continue;
        }
      }
      int j = Build.VERSION.SDK_INT;
      k = 21;
      if (j >= k)
      {
        localObject = new android/support/v4/b/d;
        ((d)localObject).<init>();
        a = (c.a)localObject;
      }
      else
      {
        localObject = new android/support/v4/b/g;
        ((g)localObject).<init>();
        a = (c.a)localObject;
      }
    }
  }
  
  public static Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    Object localObject1 = a;
    Object localObject2 = paramContext;
    Object localObject3 = paramResources;
    localObject1 = ((c.a)localObject1).a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (localObject1 != null)
    {
      localObject2 = b(paramResources, paramInt1, paramInt2);
      localObject3 = b;
      ((android.support.v4.h.g)localObject3).put(localObject2, localObject1);
    }
    return (Typeface)localObject1;
  }
  
  public static Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.b[] paramArrayOfb, int paramInt)
  {
    return a.a(paramContext, paramCancellationSignal, paramArrayOfb, paramInt);
  }
  
  public static Typeface a(Context paramContext, a.a parama, Resources paramResources, int paramInt1, int paramInt2, b.a parama1, Handler paramHandler, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    boolean bool2 = parama instanceof a.d;
    int i;
    int j;
    label49:
    Object localObject2;
    Object localObject3;
    if (bool2)
    {
      parama = (a.d)parama;
      if (paramBoolean)
      {
        i = parama.b();
        if (i == 0)
        {
          if (!paramBoolean) {
            break label129;
          }
          j = parama.c();
          localObject2 = parama.a();
          localObject1 = paramContext;
          localObject3 = parama1;
          localObject1 = b.a(paramContext, (a)localObject2, parama1, paramHandler, bool1, j, paramInt2);
        }
      }
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = b;
        localObject3 = b(paramResources, paramInt1, paramInt2);
        ((android.support.v4.h.g)localObject2).put(localObject3, localObject1);
      }
      return (Typeface)localObject1;
      bool1 = false;
      break;
      if (parama1 == null) {
        break;
      }
      bool1 = false;
      break;
      label129:
      j = -1;
      break label49;
      localObject1 = a;
      parama = (a.b)parama;
      localObject1 = ((c.a)localObject1).a(paramContext, parama, paramResources, paramInt2);
      if (parama1 != null) {
        if (localObject1 != null)
        {
          parama1.callbackSuccessAsync((Typeface)localObject1, paramHandler);
        }
        else
        {
          i = -3;
          parama1.callbackFailAsync(i, paramHandler);
        }
      }
    }
  }
  
  public static Typeface a(Resources paramResources, int paramInt1, int paramInt2)
  {
    android.support.v4.h.g localg = b;
    String str = b(paramResources, paramInt1, paramInt2);
    return (Typeface)localg.get(str);
  }
  
  private static String b(Resources paramResources, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = paramResources.getResourcePackageName(paramInt1);
    return str + "-" + paramInt1 + "-" + paramInt2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */