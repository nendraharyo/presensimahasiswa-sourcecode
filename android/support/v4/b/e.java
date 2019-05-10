package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.a.a.a.b;
import android.support.v4.a.a.a.c;
import android.support.v4.f.b.b;
import android.support.v4.h.m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class e
  extends g
{
  private static final Class a;
  private static final Constructor b;
  private static final Method c;
  private static final Method d;
  
  static
  {
    Object localObject1 = null;
    Object localObject2 = "android.graphics.FontFamily";
    try
    {
      Class localClass1 = Class.forName((String)localObject2);
      i = 0;
      localObject2 = null;
      localObject2 = new Class[0];
      localObject4 = localClass1.getConstructor((Class[])localObject2);
      localObject2 = "addFontWeightStyle";
      j = 5;
      localObject5 = new Class[j];
      int k = 0;
      Class localClass2 = null;
      Object localObject6 = ByteBuffer.class;
      localObject5[0] = localObject6;
      k = 1;
      localObject6 = Integer.TYPE;
      localObject5[k] = localObject6;
      k = 2;
      localObject6 = List.class;
      localObject5[k] = localObject6;
      k = 3;
      localObject6 = Integer.TYPE;
      localObject5[k] = localObject6;
      k = 4;
      localObject6 = Boolean.TYPE;
      localObject5[k] = localObject6;
      localObject5 = localClass1.getMethod((String)localObject2, (Class[])localObject5);
      i = 1;
      localObject2 = Array.newInstance(localClass1, i);
      localClass2 = Typeface.class;
      localObject6 = "createFromFamiliesWithDefault";
      int m = 1;
      Class[] arrayOfClass = new Class[m];
      localObject2 = localObject2.getClass();
      arrayOfClass[0] = localObject2;
      localObject2 = localClass2.getMethod((String)localObject6, arrayOfClass);
      localObject1 = localObject5;
      localObject5 = localObject4;
      localObject4 = localClass1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Object localObject4 = localClassNotFoundException.getClass().getName();
        Log.e("TypefaceCompatApi24Impl", (String)localObject4, localClassNotFoundException);
        int i = 0;
        Object localObject3 = null;
        int j = 0;
        Object localObject5 = null;
        localObject4 = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    b = (Constructor)localObject5;
    a = (Class)localObject4;
    c = (Method)localObject1;
    d = (Method)localObject2;
  }
  
  private static Typeface a(Object paramObject)
  {
    try
    {
      Object localObject1 = a;
      int i = 1;
      localObject1 = Array.newInstance((Class)localObject1, i);
      i = 0;
      localObject2 = null;
      Array.set(localObject1, 0, paramObject);
      localObject2 = d;
      int j = 1;
      Object[] arrayOfObject = new Object[j];
      arrayOfObject[0] = localObject1;
      localObject1 = ((Method)localObject2).invoke(null, arrayOfObject);
      return (Typeface)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  public static boolean a()
  {
    Object localObject = c;
    if (localObject == null)
    {
      localObject = "TypefaceCompatApi24Impl";
      String str = "Unable to collect necessary private methods.Fallback to legacy implementation.";
      Log.w((String)localObject, str);
    }
    localObject = c;
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = c;
      int i = 5;
      localObject2 = new Object[i];
      int j = 0;
      localObject2[0] = paramByteBuffer;
      j = 1;
      Object localObject3 = Integer.valueOf(paramInt1);
      localObject2[j] = localObject3;
      j = 2;
      localObject3 = null;
      localObject2[j] = null;
      j = 3;
      localObject3 = Integer.valueOf(paramInt2);
      localObject2[j] = localObject3;
      j = 4;
      localObject3 = Boolean.valueOf(paramBoolean);
      localObject2[j] = localObject3;
      localObject1 = ((Method)localObject1).invoke(paramObject, (Object[])localObject2);
      localObject1 = (Boolean)localObject1;
      return ((Boolean)localObject1).booleanValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  private static Object b()
  {
    try
    {
      Constructor localConstructor = b;
      localObject = null;
      localObject = new Object[0];
      return localConstructor.newInstance((Object[])localObject);
    }
    catch (InstantiationException localInstantiationException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localInstantiationException);
      throw ((Throwable)localObject);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  public Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.b[] paramArrayOfb, int paramInt)
  {
    Object localObject1 = b();
    m localm = new android/support/v4/h/m;
    localm.<init>();
    int i = paramArrayOfb.length;
    boolean bool1 = false;
    Object localObject2 = null;
    int k = 0;
    if (k < i)
    {
      b.b localb = paramArrayOfb[k];
      Uri localUri = localb.a();
      localObject2 = (ByteBuffer)localm.get(localUri);
      if (localObject2 == null)
      {
        localObject2 = h.a(paramContext, paramCancellationSignal, localUri);
        localm.put(localUri, localObject2);
      }
      int m = localb.b();
      int n = localb.c();
      boolean bool2 = localb.d();
      bool1 = a(localObject1, (ByteBuffer)localObject2, m, n, bool2);
      if (!bool1) {
        bool1 = false;
      }
    }
    for (localObject2 = null;; localObject2 = Typeface.create(a(localObject1), paramInt))
    {
      return (Typeface)localObject2;
      int j = k + 1;
      k = j;
      break;
    }
  }
  
  public Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    Typeface localTypeface = null;
    Object localObject = b();
    a.c[] arrayOfc = paramb.a();
    int i = arrayOfc.length;
    int j = 0;
    a.c localc;
    ByteBuffer localByteBuffer;
    if (j < i)
    {
      localc = arrayOfc[j];
      int k = localc.d();
      localByteBuffer = h.a(paramContext, paramResources, k);
      if (localByteBuffer != null) {}
    }
    for (;;)
    {
      return localTypeface;
      int m = localc.b();
      boolean bool = localc.c();
      bool = a(localObject, localByteBuffer, 0, m, bool);
      if (bool)
      {
        j += 1;
        break;
        localTypeface = a(localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */