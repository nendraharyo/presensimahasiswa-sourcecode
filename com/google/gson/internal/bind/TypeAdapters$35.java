package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class TypeAdapters$35
  implements TypeAdapterFactory
{
  TypeAdapters$35(Class paramClass, TypeAdapter paramTypeAdapter) {}
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Class localClass = paramTypeToken.getRawType();
    Object localObject = this.val$clazz;
    boolean bool = ((Class)localObject).isAssignableFrom(localClass);
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/internal/bind/TypeAdapters$35$1;
      ((TypeAdapters.35.1)localObject).<init>(this, localClass);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Factory[typeHierarchy=");
    Object localObject = this.val$clazz.getName();
    localStringBuilder = localStringBuilder.append((String)localObject).append(",adapter=");
    localObject = this.val$typeAdapter;
    return localObject + "]";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$35.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */