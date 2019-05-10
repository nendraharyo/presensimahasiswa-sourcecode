package com.google.gson.reflect;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal..Gson.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class TypeToken
{
  final int hashCode;
  final Class rawType;
  final Type type;
  
  protected TypeToken()
  {
    Object localObject = getSuperclassTypeParameter(getClass());
    this.type = ((Type)localObject);
    localObject = .Gson.Types.getRawType(this.type);
    this.rawType = ((Class)localObject);
    int i = this.type.hashCode();
    this.hashCode = i;
  }
  
  TypeToken(Type paramType)
  {
    Object localObject = .Gson.Types.canonicalize((Type).Gson.Preconditions.checkNotNull(paramType));
    this.type = ((Type)localObject);
    localObject = .Gson.Types.getRawType(this.type);
    this.rawType = ((Class)localObject);
    int i = this.type.hashCode();
    this.hashCode = i;
  }
  
  private static AssertionError buildUnexpectedTypeError(Type paramType, Class... paramVarArgs)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("Unexpected type. Expected one of: ");
    int i = paramVarArgs.length;
    int j = 0;
    Object localObject2 = null;
    while (j < i)
    {
      Object localObject3 = paramVarArgs[j].getName();
      localObject3 = ((StringBuilder)localObject1).append((String)localObject3);
      String str1 = ", ";
      ((StringBuilder)localObject3).append(str1);
      j += 1;
    }
    localObject2 = ((StringBuilder)localObject1).append("but got: ");
    String str2 = paramType.getClass().getName();
    localObject2 = ((StringBuilder)localObject2).append(str2).append(", for type token: ");
    str2 = paramType.toString();
    ((StringBuilder)localObject2).append(str2).append('.');
    localObject2 = new java/lang/AssertionError;
    localObject1 = ((StringBuilder)localObject1).toString();
    ((AssertionError)localObject2).<init>(localObject1);
    return (AssertionError)localObject2;
  }
  
  public static TypeToken get(Class paramClass)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    localTypeToken.<init>(paramClass);
    return localTypeToken;
  }
  
  public static TypeToken get(Type paramType)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    localTypeToken.<init>(paramType);
    return localTypeToken;
  }
  
  static Type getSuperclassTypeParameter(Class paramClass)
  {
    Object localObject = paramClass.getGenericSuperclass();
    boolean bool = localObject instanceof Class;
    if (bool)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Missing type parameter.");
      throw ((Throwable)localObject);
    }
    return .Gson.Types.canonicalize(((ParameterizedType)localObject).getActualTypeArguments()[0]);
  }
  
  private static boolean isAssignableFrom(Type paramType, GenericArrayType paramGenericArrayType)
  {
    Object localObject = paramGenericArrayType.getGenericComponentType();
    boolean bool1 = localObject instanceof ParameterizedType;
    HashMap localHashMap;
    if (bool1)
    {
      bool1 = paramType instanceof GenericArrayType;
      if (bool1)
      {
        paramType = ((GenericArrayType)paramType).getGenericComponentType();
        localObject = (ParameterizedType)localObject;
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
      }
    }
    for (boolean bool2 = isAssignableFrom(paramType, (ParameterizedType)localObject, localHashMap);; bool2 = true)
    {
      return bool2;
      bool1 = paramType instanceof Class;
      if (!bool1) {
        break;
      }
      for (paramType = (Class)paramType;; paramType = paramType.getComponentType())
      {
        bool1 = paramType.isArray();
        if (!bool1) {
          break;
        }
      }
    }
  }
  
  private static boolean isAssignableFrom(Type paramType, ParameterizedType paramParameterizedType, Map paramMap)
  {
    int i = 1;
    int j = 0;
    if (paramType == null) {}
    for (;;)
    {
      return j;
      bool2 = paramParameterizedType.equals(paramType);
      if (!bool2) {
        break;
      }
      j = i;
    }
    Class localClass = .Gson.Types.getRawType(paramType);
    boolean bool2 = false;
    Object localObject1 = null;
    int n = paramType instanceof ParameterizedType;
    if (n != 0) {}
    for (paramType = (ParameterizedType)paramType;; paramType = null)
    {
      Type[] arrayOfType;
      Object localObject2;
      if (paramType != null)
      {
        arrayOfType = paramType.getActualTypeArguments();
        localObject2 = localClass.getTypeParameters();
        n = 0;
        localHashMap = null;
        for (;;)
        {
          int m = arrayOfType.length;
          if (n >= m) {
            break;
          }
          localObject1 = arrayOfType[n];
          String str = localObject2[n];
          for (;;)
          {
            boolean bool4 = localObject1 instanceof TypeVariable;
            if (!bool4) {
              break;
            }
            localObject1 = ((TypeVariable)localObject1).getName();
            localObject1 = (Type)paramMap.get(localObject1);
          }
          str = str.getName();
          paramMap.put(str, localObject1);
          m = n + 1;
          n = m;
        }
        boolean bool3 = typeEquals(paramType, paramParameterizedType, paramMap);
        if (bool3)
        {
          j = i;
          break;
        }
      }
      localObject1 = localClass.getGenericInterfaces();
      int i1 = localObject1.length;
      for (;;)
      {
        if (j >= i1) {
          break label268;
        }
        arrayOfType = localObject1[j];
        localObject2 = new java/util/HashMap;
        ((HashMap)localObject2).<init>(paramMap);
        boolean bool5 = isAssignableFrom(arrayOfType, paramParameterizedType, (Map)localObject2);
        if (bool5)
        {
          j = i;
          break;
        }
        int k;
        j += 1;
      }
      label268:
      localObject1 = localClass.getGenericSuperclass();
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>(paramMap);
      boolean bool1 = isAssignableFrom((Type)localObject1, paramParameterizedType, localHashMap);
      break;
    }
  }
  
  private static boolean matches(Type paramType1, Type paramType2, Map paramMap)
  {
    boolean bool = paramType2.equals(paramType1);
    Object localObject;
    if (!bool)
    {
      bool = paramType1 instanceof TypeVariable;
      if (bool)
      {
        paramType1 = (TypeVariable)paramType1;
        localObject = paramType1.getName();
        localObject = paramMap.get(localObject);
        bool = paramType2.equals(localObject);
        if (!bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private static boolean typeEquals(ParameterizedType paramParameterizedType1, ParameterizedType paramParameterizedType2, Map paramMap)
  {
    boolean bool1 = false;
    Type localType1 = paramParameterizedType1.getRawType();
    Object localObject = paramParameterizedType2.getRawType();
    int i = localType1.equals(localObject);
    if (i != 0)
    {
      localObject = paramParameterizedType1.getActualTypeArguments();
      Type[] arrayOfType = paramParameterizedType2.getActualTypeArguments();
      i = 0;
      localType1 = null;
      int k = localObject.length;
      if (i >= k) {
        break label106;
      }
      Type localType2 = localObject[i];
      Type localType3 = arrayOfType[i];
      boolean bool2 = matches(localType2, localType3, paramMap);
      if (bool2) {
        break label97;
      }
    }
    for (;;)
    {
      return bool1;
      label97:
      int j;
      i += 1;
      break;
      label106:
      bool1 = true;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof TypeToken;
    Type localType1;
    if (bool)
    {
      localType1 = this.type;
      paramObject = (TypeToken)paramObject;
      Type localType2 = ((TypeToken)paramObject).type;
      bool = .Gson.Types.equals(localType1, localType2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localType1 = null;
    }
  }
  
  public final Class getRawType()
  {
    return this.rawType;
  }
  
  public final Type getType()
  {
    return this.type;
  }
  
  public final int hashCode()
  {
    return this.hashCode;
  }
  
  public boolean isAssignableFrom(TypeToken paramTypeToken)
  {
    Type localType = paramTypeToken.getType();
    return isAssignableFrom(localType);
  }
  
  public boolean isAssignableFrom(Class paramClass)
  {
    return isAssignableFrom(paramClass);
  }
  
  public boolean isAssignableFrom(Type paramType)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    if (paramType == null) {}
    for (;;)
    {
      return bool2;
      localObject1 = this.type;
      bool3 = localObject1.equals(paramType);
      if (bool3)
      {
        bool2 = bool1;
      }
      else
      {
        localObject1 = this.type;
        bool3 = localObject1 instanceof Class;
        Object localObject2;
        if (bool3)
        {
          localObject1 = this.rawType;
          localObject2 = .Gson.Types.getRawType(paramType);
          bool2 = ((Class)localObject1).isAssignableFrom((Class)localObject2);
        }
        else
        {
          localObject1 = this.type;
          bool3 = localObject1 instanceof ParameterizedType;
          if (!bool3) {
            break;
          }
          localObject1 = (ParameterizedType)this.type;
          localObject2 = new java/util/HashMap;
          ((HashMap)localObject2).<init>();
          bool2 = isAssignableFrom(paramType, (ParameterizedType)localObject1, (Map)localObject2);
        }
      }
    }
    Object localObject1 = this.type;
    boolean bool3 = localObject1 instanceof GenericArrayType;
    if (bool3)
    {
      localObject1 = this.rawType;
      localObject3 = .Gson.Types.getRawType(paramType);
      bool3 = ((Class)localObject1).isAssignableFrom((Class)localObject3);
      if (bool3)
      {
        localObject1 = (GenericArrayType)this.type;
        bool3 = isAssignableFrom(paramType, (GenericArrayType)localObject1);
        if (bool3) {
          bool3 = bool1;
        }
      }
      for (;;)
      {
        bool2 = bool3;
        break;
        bool3 = false;
        localObject1 = null;
      }
    }
    localObject1 = this.type;
    Object localObject3 = new Class[3];
    localObject3[0] = Class.class;
    localObject3[bool1] = ParameterizedType.class;
    localObject3[2] = GenericArrayType.class;
    throw buildUnexpectedTypeError((Type)localObject1, (Class[])localObject3);
  }
  
  public final String toString()
  {
    return .Gson.Types.typeToString(this.type);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\reflect\TypeToken.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */