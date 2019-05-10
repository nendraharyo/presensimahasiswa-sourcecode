package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ConstructorConstructor$3
  implements ObjectConstructor
{
  ConstructorConstructor$3(ConstructorConstructor paramConstructorConstructor, Constructor paramConstructor) {}
  
  public Object construct()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = this.val$constructor;
      return ((Constructor)localObject2).newInstance(null);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Failed to invoke ");
      localConstructor = this.val$constructor;
      localObject3 = localConstructor + " with no args";
      ((RuntimeException)localObject2).<init>((String)localObject3, localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localObject2 = new java/lang/RuntimeException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Failed to invoke ");
      Constructor localConstructor = this.val$constructor;
      localObject3 = localConstructor + " with no args";
      Throwable localThrowable = localInvocationTargetException.getTargetException();
      ((RuntimeException)localObject2).<init>((String)localObject3, localThrowable);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/AssertionError;
      ((AssertionError)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\ConstructorConstructor$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */