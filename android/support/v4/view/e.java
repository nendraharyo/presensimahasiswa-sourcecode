package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

public final class e
{
  static final e.b a;
  private static Field b;
  private static boolean c;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/e$a;
      ((e.a)localObject).<init>();
    }
    for (a = (e.b)localObject;; a = (e.b)localObject)
    {
      return;
      localObject = new android/support/v4/view/e$b;
      ((e.b)localObject).<init>();
    }
  }
  
  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    boolean bool1 = true;
    boolean bool2 = c;
    if (!bool2)
    {
      localObject1 = LayoutInflater.class;
      str1 = "mFactory2";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str1);
      b = (Field)localObject1;
      localObject1 = b;
      boolean bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          localObject1 = b;
          ((Field)localObject1).set(paramLayoutInflater, paramFactory2);
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          str1 = "LayoutInflaterCompatHC";
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("forceSetFactory2 could not set the Factory2 on LayoutInflater ").append(paramLayoutInflater);
          String str2 = "; inflation may have unexpected results.";
          localObject2 = str2;
          Log.e(str1, (String)localObject2, localIllegalAccessException);
          continue;
        }
        localNoSuchFieldException = localNoSuchFieldException;
        str1 = "LayoutInflaterCompatHC";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("forceSetFactory2 Could not find field 'mFactory2' on class ");
        str2 = LayoutInflater.class.getName();
        localObject2 = ((StringBuilder)localObject2).append(str2);
        str2 = "; inflation may have unexpected results.";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localNoSuchFieldException);
      }
    }
    c = bool1;
    localObject1 = b;
    if (localObject1 == null) {}
  }
  
  public static void b(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    a.a(paramLayoutInflater, paramFactory2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */