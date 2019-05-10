package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

final class TypeAdapters$30
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = paramTypeToken.getRawType();
    Object localObject2 = Enum.class;
    boolean bool = ((Class)localObject2).isAssignableFrom((Class)localObject1);
    if (bool)
    {
      localObject2 = Enum.class;
      if (localObject1 != localObject2) {
        break label36;
      }
    }
    for (localObject1 = null;; localObject1 = localObject2)
    {
      return (TypeAdapter)localObject1;
      label36:
      bool = ((Class)localObject1).isEnum();
      if (!bool) {
        localObject1 = ((Class)localObject1).getSuperclass();
      }
      localObject2 = new com/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;
      ((TypeAdapters.EnumTypeAdapter)localObject2).<init>((Class)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$30.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */