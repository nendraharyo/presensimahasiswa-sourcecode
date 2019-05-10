package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class ArrayTypeAdapter$1
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = paramTypeToken.getType();
    boolean bool = localObject1 instanceof GenericArrayType;
    Object localObject2;
    if (!bool)
    {
      bool = localObject1 instanceof Class;
      if (bool)
      {
        localObject2 = localObject1;
        localObject2 = (Class)localObject1;
        bool = ((Class)localObject2).isArray();
        if (bool) {}
      }
      else
      {
        bool = false;
        localObject2 = null;
      }
    }
    for (;;)
    {
      return (TypeAdapter)localObject2;
      localObject1 = .Gson.Types.getArrayComponentType((Type)localObject1);
      localObject2 = TypeToken.get((Type)localObject1);
      TypeAdapter localTypeAdapter = paramGson.getAdapter((TypeToken)localObject2);
      localObject2 = new com/google/gson/internal/bind/ArrayTypeAdapter;
      localObject1 = .Gson.Types.getRawType((Type)localObject1);
      ((ArrayTypeAdapter)localObject2).<init>(paramGson, localTypeAdapter, (Class)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\ArrayTypeAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */