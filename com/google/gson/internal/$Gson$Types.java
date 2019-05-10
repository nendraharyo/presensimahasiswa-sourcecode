package com.google.gson.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class $Gson$Types
{
  static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
  
  private $Gson$Types()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static GenericArrayType arrayOf(Type paramType)
  {
    .Gson.Types.GenericArrayTypeImpl localGenericArrayTypeImpl = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
    localGenericArrayTypeImpl.<init>(paramType);
    return localGenericArrayTypeImpl;
  }
  
  public static Type canonicalize(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      paramType = (Class)paramType;
      bool = paramType.isArray();
      if (bool)
      {
        localObject1 = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
        localObject2 = canonicalize(paramType.getComponentType());
        ((.Gson.Types.GenericArrayTypeImpl)localObject1).<init>((Type)localObject2);
        localObject1 = (Type)localObject1;
      }
    }
    for (;;)
    {
      return (Type)localObject1;
      localObject1 = paramType;
      break;
      bool = paramType instanceof ParameterizedType;
      Object localObject3;
      if (bool)
      {
        paramType = (ParameterizedType)paramType;
        localObject1 = new com/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
        localObject2 = paramType.getOwnerType();
        localObject3 = paramType.getRawType();
        Type[] arrayOfType = paramType.getActualTypeArguments();
        ((.Gson.Types.ParameterizedTypeImpl)localObject1).<init>((Type)localObject2, (Type)localObject3, arrayOfType);
      }
      else
      {
        bool = paramType instanceof GenericArrayType;
        if (bool)
        {
          paramType = (GenericArrayType)paramType;
          localObject1 = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
          localObject2 = paramType.getGenericComponentType();
          ((.Gson.Types.GenericArrayTypeImpl)localObject1).<init>((Type)localObject2);
        }
        else
        {
          bool = paramType instanceof WildcardType;
          if (bool)
          {
            paramType = (WildcardType)paramType;
            localObject1 = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
            localObject2 = paramType.getUpperBounds();
            localObject3 = paramType.getLowerBounds();
            ((.Gson.Types.WildcardTypeImpl)localObject1).<init>((Type[])localObject2, (Type[])localObject3);
          }
          else
          {
            localObject1 = paramType;
          }
        }
      }
    }
  }
  
  static void checkNotPrimitive(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    if (bool)
    {
      paramType = (Class)paramType;
      bool = paramType.isPrimitive();
      if (bool) {
        break label30;
      }
    }
    label30:
    for (bool = true;; bool = false)
    {
      .Gson.Preconditions.checkArgument(bool);
      return;
    }
  }
  
  private static Class declaringClassOf(TypeVariable paramTypeVariable)
  {
    Object localObject = paramTypeVariable.getGenericDeclaration();
    boolean bool = localObject instanceof Class;
    if (bool) {}
    for (localObject = (Class)localObject;; localObject = null) {
      return (Class)localObject;
    }
  }
  
  static boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean equals(Type paramType1, Type paramType2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Type localType1 = null;
    if (paramType1 == paramType2) {
      bool2 = bool1;
    }
    boolean bool3;
    Type localType2;
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            return bool2;
            bool3 = paramType1 instanceof Class;
            if (bool3)
            {
              bool2 = paramType1.equals(paramType2);
            }
            else
            {
              bool3 = paramType1 instanceof ParameterizedType;
              if (bool3)
              {
                bool3 = paramType2 instanceof ParameterizedType;
                if (bool3)
                {
                  paramType1 = (ParameterizedType)paramType1;
                  paramType2 = (ParameterizedType)paramType2;
                  localObject1 = paramType1.getOwnerType();
                  localObject2 = paramType2.getOwnerType();
                  bool3 = equal(localObject1, localObject2);
                  if (bool3)
                  {
                    localObject1 = paramType1.getRawType();
                    localObject2 = paramType2.getRawType();
                    bool3 = localObject1.equals(localObject2);
                    if (bool3)
                    {
                      localObject1 = paramType1.getActualTypeArguments();
                      localObject2 = paramType2.getActualTypeArguments();
                      bool3 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
                      if (!bool3) {}
                    }
                  }
                  for (;;)
                  {
                    bool2 = bool1;
                    break;
                    bool1 = false;
                    localType2 = null;
                  }
                }
              }
              else
              {
                bool3 = paramType1 instanceof GenericArrayType;
                if (!bool3) {
                  break;
                }
                bool1 = paramType2 instanceof GenericArrayType;
                if (bool1)
                {
                  paramType1 = (GenericArrayType)paramType1;
                  paramType2 = (GenericArrayType)paramType2;
                  localType2 = paramType1.getGenericComponentType();
                  localType1 = paramType2.getGenericComponentType();
                  bool2 = equals(localType2, localType1);
                }
              }
            }
          }
          bool3 = paramType1 instanceof WildcardType;
          if (!bool3) {
            break;
          }
          bool3 = paramType2 instanceof WildcardType;
        } while (!bool3);
        paramType1 = (WildcardType)paramType1;
        paramType2 = (WildcardType)paramType2;
        localObject1 = paramType1.getUpperBounds();
        localObject2 = paramType2.getUpperBounds();
        bool3 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
        if (bool3)
        {
          localObject1 = paramType1.getLowerBounds();
          localObject2 = paramType2.getLowerBounds();
          bool3 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
          if (!bool3) {}
        }
        for (;;)
        {
          bool2 = bool1;
          break;
          bool1 = false;
          localType2 = null;
        }
        bool3 = paramType1 instanceof TypeVariable;
      } while (!bool3);
      bool3 = paramType2 instanceof TypeVariable;
    } while (!bool3);
    paramType1 = (TypeVariable)paramType1;
    paramType2 = (TypeVariable)paramType2;
    Object localObject1 = paramType1.getGenericDeclaration();
    Object localObject2 = paramType2.getGenericDeclaration();
    if (localObject1 == localObject2)
    {
      localObject1 = paramType1.getName();
      localObject2 = paramType2.getName();
      bool3 = ((String)localObject1).equals(localObject2);
      if (!bool3) {}
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      bool1 = false;
      localType2 = null;
    }
  }
  
  public static Type getArrayComponentType(Type paramType)
  {
    boolean bool = paramType instanceof GenericArrayType;
    if (bool) {
      paramType = (GenericArrayType)paramType;
    }
    for (Object localObject = paramType.getGenericComponentType();; localObject = paramType.getComponentType())
    {
      return (Type)localObject;
      paramType = (Class)paramType;
    }
  }
  
  public static Type getCollectionElementType(Type paramType, Class paramClass)
  {
    Object localObject = getSupertype(paramType, paramClass, Collection.class);
    boolean bool = localObject instanceof WildcardType;
    if (bool) {
      localObject = ((WildcardType)localObject).getUpperBounds()[0];
    }
    bool = localObject instanceof ParameterizedType;
    if (bool) {}
    for (localObject = ((ParameterizedType)localObject).getActualTypeArguments()[0];; localObject = Object.class) {
      return (Type)localObject;
    }
  }
  
  static Type getGenericSupertype(Type paramType, Class paramClass1, Class paramClass2)
  {
    if (paramClass2 == paramClass1) {}
    for (;;)
    {
      return paramType;
      int i = paramClass2.isInterface();
      Object localObject;
      Class localClass1;
      if (i != 0)
      {
        localObject = paramClass1.getInterfaces();
        i = 0;
        localClass1 = null;
        int k = localObject.length;
        for (;;)
        {
          if (i >= k) {
            break label116;
          }
          Class localClass2 = localObject[i];
          if (localClass2 == paramClass2)
          {
            localObject = paramClass1.getGenericInterfaces();
            paramType = localObject[i];
            break;
          }
          localClass2 = localObject[i];
          boolean bool2 = paramClass2.isAssignableFrom(localClass2);
          if (bool2)
          {
            Type localType = paramClass1.getGenericInterfaces()[i];
            localClass1 = localObject[i];
            paramType = getGenericSupertype(localType, localClass1, paramClass2);
            break;
          }
          int j;
          i += 1;
        }
      }
      label116:
      boolean bool1 = paramClass1.isInterface();
      if (!bool1) {
        for (;;)
        {
          localClass1 = Object.class;
          if (paramClass1 == localClass1) {
            break label192;
          }
          localClass1 = paramClass1.getSuperclass();
          if (localClass1 == paramClass2)
          {
            paramType = paramClass1.getGenericSuperclass();
            break;
          }
          boolean bool3 = paramClass2.isAssignableFrom(localClass1);
          if (bool3)
          {
            localObject = paramClass1.getGenericSuperclass();
            paramType = getGenericSupertype((Type)localObject, localClass1, paramClass2);
            break;
          }
          paramClass1 = localClass1;
        }
      }
      label192:
      paramType = paramClass2;
    }
  }
  
  public static Type[] getMapKeyAndValueTypes(Type paramType, Class paramClass)
  {
    int i = 2;
    int j = 1;
    Object localObject = Properties.class;
    Class localClass;
    if (paramType == localObject)
    {
      localObject = new Type[i];
      localObject[0] = String.class;
      localClass = String.class;
      localObject[j] = localClass;
    }
    for (;;)
    {
      return (Type[])localObject;
      localObject = getSupertype(paramType, paramClass, Map.class);
      boolean bool = localObject instanceof ParameterizedType;
      if (bool)
      {
        localObject = ((ParameterizedType)localObject).getActualTypeArguments();
      }
      else
      {
        localObject = new Type[i];
        localObject[0] = Object.class;
        localClass = Object.class;
        localObject[j] = localClass;
      }
    }
  }
  
  public static Class getRawType(Type paramType)
  {
    boolean bool1 = false;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool2 = paramType instanceof Class;
    if (bool2) {
      paramType = (Class)paramType;
    }
    for (;;)
    {
      return paramType;
      bool2 = paramType instanceof ParameterizedType;
      if (bool2)
      {
        localObject = ((ParameterizedType)paramType).getRawType();
        bool1 = localObject instanceof Class;
        .Gson.Preconditions.checkArgument(bool1);
        localObject = (Class)localObject;
        paramType = (Type)localObject;
      }
      else
      {
        bool2 = paramType instanceof GenericArrayType;
        if (bool2)
        {
          localObject = Array.newInstance(getRawType(((GenericArrayType)paramType).getGenericComponentType()), 0);
          paramType = localObject.getClass();
        }
        else
        {
          bool2 = paramType instanceof TypeVariable;
          if (bool2)
          {
            paramType = Object.class;
          }
          else
          {
            bool2 = paramType instanceof WildcardType;
            if (!bool2) {
              break;
            }
            localObject = ((WildcardType)paramType).getUpperBounds()[0];
            paramType = getRawType((Type)localObject);
          }
        }
      }
    }
    if (paramType == null) {}
    for (Object localObject = "null";; localObject = paramType.getClass().getName())
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Expected a Class, ParameterizedType, or GenericArrayType, but <" + paramType + "> is of type " + (String)localObject;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  static Type getSupertype(Type paramType, Class paramClass1, Class paramClass2)
  {
    .Gson.Preconditions.checkArgument(paramClass2.isAssignableFrom(paramClass1));
    Type localType = getGenericSupertype(paramType, paramClass1, paramClass2);
    return resolve(paramType, paramClass1, localType);
  }
  
  static int hashCodeOrZero(Object paramObject)
  {
    if (paramObject != null) {}
    for (int i = paramObject.hashCode();; i = 0) {
      return i;
    }
  }
  
  private static int indexOf(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = 0;
    NoSuchElementException localNoSuchElementException = null;
    for (;;)
    {
      int j = paramArrayOfObject.length;
      if (i >= j) {
        break;
      }
      Object localObject = paramArrayOfObject[i];
      boolean bool = paramObject.equals(localObject);
      if (bool) {
        return i;
      }
      i += 1;
    }
    localNoSuchElementException = new java/util/NoSuchElementException;
    localNoSuchElementException.<init>();
    throw localNoSuchElementException;
  }
  
  public static ParameterizedType newParameterizedTypeWithOwner(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    .Gson.Types.ParameterizedTypeImpl localParameterizedTypeImpl = new com/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
    localParameterizedTypeImpl.<init>(paramType1, paramType2, paramVarArgs);
    return localParameterizedTypeImpl;
  }
  
  public static Type resolve(Type paramType1, Class paramClass, Type paramType2)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 0;
    Object localObject1 = paramType2;
    boolean bool = localObject1 instanceof TypeVariable;
    if (bool)
    {
      localObject1 = (TypeVariable)localObject1;
      paramType2 = resolveTypeVariable(paramType1, paramClass, (TypeVariable)localObject1);
      if (paramType2 == localObject1) {
        localObject1 = paramType2;
      }
    }
    for (;;)
    {
      return (Type)localObject1;
      localObject1 = paramType2;
      break;
      bool = localObject1 instanceof Class;
      Object localObject2;
      Type localType1;
      if (bool)
      {
        localObject2 = localObject1;
        localObject2 = (Class)localObject1;
        bool = ((Class)localObject2).isArray();
        if (bool)
        {
          localObject1 = (Class)localObject1;
          localObject2 = ((Class)localObject1).getComponentType();
          localType1 = resolve(paramType1, paramClass, (Type)localObject2);
          if (localObject2 == localType1) {
            continue;
          }
          localObject1 = arrayOf(localType1);
          continue;
        }
      }
      bool = localObject1 instanceof GenericArrayType;
      if (bool)
      {
        localObject1 = (GenericArrayType)localObject1;
        localObject2 = ((GenericArrayType)localObject1).getGenericComponentType();
        localType1 = resolve(paramType1, paramClass, (Type)localObject2);
        if (localObject2 != localType1) {
          localObject1 = arrayOf(localType1);
        }
      }
      else
      {
        bool = localObject1 instanceof ParameterizedType;
        Type[] arrayOfType;
        if (bool)
        {
          localObject1 = (ParameterizedType)localObject1;
          localObject2 = ((ParameterizedType)localObject1).getOwnerType();
          Type localType2 = resolve(paramType1, paramClass, (Type)localObject2);
          if (localType2 != localObject2) {
            bool = i;
          }
          for (;;)
          {
            arrayOfType = ((ParameterizedType)localObject1).getActualTypeArguments();
            int m = arrayOfType.length;
            j = bool;
            localObject2 = arrayOfType;
            int n = 0;
            arrayOfType = null;
            while (n < m)
            {
              Type localType3 = localObject2[n];
              localType3 = resolve(paramType1, paramClass, localType3);
              Object localObject3 = localObject2[n];
              if (localType3 != localObject3)
              {
                if (j == 0)
                {
                  localObject2 = (Type[])((Type[])localObject2).clone();
                  j = i;
                }
                localObject2[n] = localType3;
              }
              n += 1;
            }
            bool = false;
            localObject2 = null;
          }
          if (j != 0)
          {
            localObject1 = ((ParameterizedType)localObject1).getRawType();
            localObject1 = newParameterizedTypeWithOwner(localType2, (Type)localObject1, (Type[])localObject2);
          }
        }
        else
        {
          bool = localObject1 instanceof WildcardType;
          if (bool)
          {
            localObject1 = (WildcardType)localObject1;
            localObject2 = ((WildcardType)localObject1).getLowerBounds();
            arrayOfType = ((WildcardType)localObject1).getUpperBounds();
            int i1 = localObject2.length;
            if (i1 == i)
            {
              localType1 = localObject2[0];
              localType1 = resolve(paramType1, paramClass, localType1);
              localObject2 = localObject2[0];
              if (localType1 != localObject2) {
                localObject1 = supertypeOf(localType1);
              }
            }
            else
            {
              int k = arrayOfType.length;
              if (k == i)
              {
                localObject2 = arrayOfType[0];
                localObject2 = resolve(paramType1, paramClass, (Type)localObject2);
                localType1 = arrayOfType[0];
                if (localObject2 != localType1) {
                  localObject1 = subtypeOf((Type)localObject2);
                }
              }
            }
          }
        }
      }
    }
  }
  
  static Type resolveTypeVariable(Type paramType, Class paramClass, TypeVariable paramTypeVariable)
  {
    Object localObject1 = declaringClassOf(paramTypeVariable);
    if (localObject1 == null) {}
    for (;;)
    {
      return paramTypeVariable;
      Object localObject2 = getGenericSupertype(paramType, paramClass, (Class)localObject1);
      boolean bool = localObject2 instanceof ParameterizedType;
      if (bool)
      {
        localObject1 = ((Class)localObject1).getTypeParameters();
        int i = indexOf((Object[])localObject1, paramTypeVariable);
        localObject2 = ((ParameterizedType)localObject2).getActualTypeArguments();
        paramTypeVariable = localObject2[i];
      }
    }
  }
  
  public static WildcardType subtypeOf(Type paramType)
  {
    .Gson.Types.WildcardTypeImpl localWildcardTypeImpl = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
    Type[] arrayOfType1 = new Type[1];
    arrayOfType1[0] = paramType;
    Type[] arrayOfType2 = EMPTY_TYPE_ARRAY;
    localWildcardTypeImpl.<init>(arrayOfType1, arrayOfType2);
    return localWildcardTypeImpl;
  }
  
  public static WildcardType supertypeOf(Type paramType)
  {
    int i = 1;
    .Gson.Types.WildcardTypeImpl localWildcardTypeImpl = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
    Type[] arrayOfType1 = new Type[i];
    arrayOfType1[0] = Object.class;
    Type[] arrayOfType2 = new Type[i];
    arrayOfType2[0] = paramType;
    localWildcardTypeImpl.<init>(arrayOfType1, arrayOfType2);
    return localWildcardTypeImpl;
  }
  
  public static String typeToString(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    if (bool) {
      paramType = (Class)paramType;
    }
    for (String str = paramType.getName();; str = paramType.toString()) {
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\$Gson$Types.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */