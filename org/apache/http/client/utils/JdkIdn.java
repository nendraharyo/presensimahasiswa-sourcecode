package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JdkIdn
  implements Idn
{
  private final Method toUnicode;
  
  public JdkIdn()
  {
    Object localObject1 = Class.forName("java.net.IDN");
    Object localObject2 = "toUnicode";
    int i = 1;
    try
    {
      localObject3 = new Class[i];
      Class localClass = String.class;
      localObject3[0] = localClass;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      this.toUnicode = ((Method)localObject1);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      localObject2 = new java/lang/IllegalStateException;
      localObject3 = localSecurityException.getMessage();
      ((IllegalStateException)localObject2).<init>((String)localObject3, localSecurityException);
      throw ((Throwable)localObject2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject2 = new java/lang/IllegalStateException;
      Object localObject3 = localNoSuchMethodException.getMessage();
      ((IllegalStateException)localObject2).<init>((String)localObject3, localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
  }
  
  public String toUnicode(String paramString)
  {
    try
    {
      Object localObject1 = this.toUnicode;
      localObject2 = null;
      int i = 1;
      localObject3 = new Object[i];
      localObject3[0] = paramString;
      localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject3);
      return (String)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new java/lang/IllegalStateException;
      localObject3 = localIllegalAccessException.getMessage();
      ((IllegalStateException)localObject2).<init>((String)localObject3, localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Throwable localThrowable = localInvocationTargetException.getCause();
      Object localObject2 = new java/lang/RuntimeException;
      Object localObject3 = localThrowable.getMessage();
      ((RuntimeException)localObject2).<init>((String)localObject3, localThrowable);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\JdkIdn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */