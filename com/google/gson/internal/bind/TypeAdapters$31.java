package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class TypeAdapters$31
  implements TypeAdapterFactory
{
  TypeAdapters$31(TypeToken paramTypeToken, TypeAdapter paramTypeAdapter) {}
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject = this.val$type;
    boolean bool = paramTypeToken.equals(localObject);
    if (bool) {}
    for (localObject = this.val$typeAdapter;; localObject = null)
    {
      return (TypeAdapter)localObject;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$31.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */