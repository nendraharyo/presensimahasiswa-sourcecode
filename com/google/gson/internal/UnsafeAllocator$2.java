package com.google.gson.internal;

import java.lang.reflect.Method;

final class UnsafeAllocator$2
  extends UnsafeAllocator
{
  UnsafeAllocator$2(Method paramMethod, int paramInt) {}
  
  public Object newInstance(Class paramClass)
  {
    Method localMethod = this.val$newInstance;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramClass;
    Integer localInteger = Integer.valueOf(this.val$constructorId);
    arrayOfObject[1] = localInteger;
    return localMethod.invoke(null, arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\UnsafeAllocator$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */