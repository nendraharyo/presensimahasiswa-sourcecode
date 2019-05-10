package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Primitives
{
  private static final Map PRIMITIVE_TO_WRAPPER_TYPE;
  private static final Map WRAPPER_TO_PRIMITIVE_TYPE;
  
  static
  {
    int i = 16;
    HashMap localHashMap1 = new java/util/HashMap;
    localHashMap1.<init>(i);
    HashMap localHashMap2 = new java/util/HashMap;
    localHashMap2.<init>(i);
    Class localClass = Boolean.TYPE;
    add(localHashMap1, localHashMap2, localClass, Boolean.class);
    localClass = Byte.TYPE;
    add(localHashMap1, localHashMap2, localClass, Byte.class);
    localClass = Character.TYPE;
    add(localHashMap1, localHashMap2, localClass, Character.class);
    localClass = Double.TYPE;
    add(localHashMap1, localHashMap2, localClass, Double.class);
    localClass = Float.TYPE;
    add(localHashMap1, localHashMap2, localClass, Float.class);
    localClass = Integer.TYPE;
    add(localHashMap1, localHashMap2, localClass, Integer.class);
    localClass = Long.TYPE;
    add(localHashMap1, localHashMap2, localClass, Long.class);
    localClass = Short.TYPE;
    add(localHashMap1, localHashMap2, localClass, Short.class);
    localClass = Void.TYPE;
    add(localHashMap1, localHashMap2, localClass, Void.class);
    PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(localHashMap1);
    WRAPPER_TO_PRIMITIVE_TYPE = Collections.unmodifiableMap(localHashMap2);
  }
  
  private Primitives()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  private static void add(Map paramMap1, Map paramMap2, Class paramClass1, Class paramClass2)
  {
    paramMap1.put(paramClass1, paramClass2);
    paramMap2.put(paramClass2, paramClass1);
  }
  
  public static boolean isPrimitive(Type paramType)
  {
    return PRIMITIVE_TO_WRAPPER_TYPE.containsKey(paramType);
  }
  
  public static boolean isWrapperType(Type paramType)
  {
    Map localMap = WRAPPER_TO_PRIMITIVE_TYPE;
    Object localObject = .Gson.Preconditions.checkNotNull(paramType);
    return localMap.containsKey(localObject);
  }
  
  public static Class unwrap(Class paramClass)
  {
    Object localObject1 = WRAPPER_TO_PRIMITIVE_TYPE;
    Object localObject2 = .Gson.Preconditions.checkNotNull(paramClass);
    localObject1 = (Class)((Map)localObject1).get(localObject2);
    if (localObject1 == null) {}
    for (;;)
    {
      return paramClass;
      paramClass = (Class)localObject1;
    }
  }
  
  public static Class wrap(Class paramClass)
  {
    Object localObject1 = PRIMITIVE_TO_WRAPPER_TYPE;
    Object localObject2 = .Gson.Preconditions.checkNotNull(paramClass);
    localObject1 = (Class)((Map)localObject1).get(localObject2);
    if (localObject1 == null) {}
    for (;;)
    {
      return paramClass;
      paramClass = (Class)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\Primitives.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */