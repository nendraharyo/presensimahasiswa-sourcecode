package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class TypeAdapters$32
  implements TypeAdapterFactory
{
  TypeAdapters$32(Class paramClass, TypeAdapter paramTypeAdapter) {}
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject = paramTypeToken.getRawType();
    Class localClass = this.val$type;
    if (localObject == localClass) {}
    for (localObject = this.val$typeAdapter;; localObject = null) {
      return (TypeAdapter)localObject;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Factory[type=");
    Object localObject = this.val$type.getName();
    localStringBuilder = localStringBuilder.append((String)localObject).append(",adapter=");
    localObject = this.val$typeAdapter;
    return localObject + "]";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$32.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */