package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class $Gson$Types$GenericArrayTypeImpl
  implements Serializable, GenericArrayType
{
  private static final long serialVersionUID;
  private final Type componentType;
  
  public $Gson$Types$GenericArrayTypeImpl(Type paramType)
  {
    Type localType = .Gson.Types.canonicalize(paramType);
    this.componentType = localType;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof GenericArrayType;
    if (bool)
    {
      paramObject = (GenericArrayType)paramObject;
      bool = .Gson.Types.equals(this, (Type)paramObject);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Type getGenericComponentType()
  {
    return this.componentType;
  }
  
  public int hashCode()
  {
    return this.componentType.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = .Gson.Types.typeToString(this.componentType);
    return str + "[]";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\$Gson$Types$GenericArrayTypeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */