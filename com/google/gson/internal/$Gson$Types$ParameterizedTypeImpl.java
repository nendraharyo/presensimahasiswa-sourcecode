package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class $Gson$Types$ParameterizedTypeImpl
  implements Serializable, ParameterizedType
{
  private static final long serialVersionUID;
  private final Type ownerType;
  private final Type rawType;
  private final Type[] typeArguments;
  
  public $Gson$Types$ParameterizedTypeImpl(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    boolean bool2 = paramType2 instanceof Class;
    if (bool2)
    {
      localObject = paramType2;
      localObject = (Class)paramType2;
      boolean bool3 = Modifier.isStatic(((Class)localObject).getModifiers());
      if (!bool3)
      {
        localObject = ((Class)localObject).getEnclosingClass();
        if (localObject != null) {}
      }
      else
      {
        bool2 = bool1;
        if ((paramType1 == null) && (!bool2)) {
          break label207;
        }
        bool2 = bool1;
        label74:
        .Gson.Preconditions.checkArgument(bool2);
      }
    }
    else
    {
      if (paramType1 != null) {
        break label216;
      }
      bool2 = false;
    }
    label207:
    label216:
    for (Object localObject = null;; localObject = .Gson.Types.canonicalize(paramType1))
    {
      this.ownerType = ((Type)localObject);
      localObject = .Gson.Types.canonicalize((Type)paramType2);
      this.rawType = ((Type)localObject);
      localObject = (Type[])paramVarArgs.clone();
      this.typeArguments = ((Type[])localObject);
      for (;;)
      {
        localObject = this.typeArguments;
        j = localObject.length;
        if (i >= j) {
          break;
        }
        .Gson.Preconditions.checkNotNull(this.typeArguments[i]);
        .Gson.Types.checkNotPrimitive(this.typeArguments[i]);
        localObject = this.typeArguments;
        Type localType = .Gson.Types.canonicalize(this.typeArguments[i]);
        localObject[i] = localType;
        i += 1;
      }
      int j = 0;
      localObject = null;
      break;
      j = 0;
      localObject = null;
      break label74;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof ParameterizedType;
    if (bool)
    {
      paramObject = (ParameterizedType)paramObject;
      bool = .Gson.Types.equals(this, (Type)paramObject);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Type[] getActualTypeArguments()
  {
    return (Type[])this.typeArguments.clone();
  }
  
  public Type getOwnerType()
  {
    return this.ownerType;
  }
  
  public Type getRawType()
  {
    return this.rawType;
  }
  
  public int hashCode()
  {
    int i = Arrays.hashCode(this.typeArguments);
    int j = this.rawType.hashCode();
    i ^= j;
    j = .Gson.Types.hashCodeOrZero(this.ownerType);
    return i ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = (this.typeArguments.length + 1) * 30;
    localStringBuilder.<init>(i);
    Object localObject1 = .Gson.Types.typeToString(this.rawType);
    localStringBuilder.append((String)localObject1);
    localObject1 = this.typeArguments;
    i = localObject1.length;
    if (i == 0) {}
    for (localObject1 = localStringBuilder.toString();; localObject1 = ">")
    {
      return (String)localObject1;
      localObject1 = localStringBuilder.append("<");
      Object localObject2 = this.typeArguments;
      String str = null;
      localObject2 = .Gson.Types.typeToString(localObject2[0]);
      ((StringBuilder)localObject1).append((String)localObject2);
      i = 1;
      for (;;)
      {
        localObject2 = this.typeArguments;
        int j = localObject2.length;
        if (i >= j) {
          break;
        }
        localObject2 = localStringBuilder.append(", ");
        str = .Gson.Types.typeToString(this.typeArguments[i]);
        ((StringBuilder)localObject2).append(str);
        i += 1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\$Gson$Types$ParameterizedTypeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */