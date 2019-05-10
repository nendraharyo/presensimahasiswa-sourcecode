package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;

public final class MapTypeAdapterFactory
  implements TypeAdapterFactory
{
  final boolean complexMapKeySerialization;
  private final ConstructorConstructor constructorConstructor;
  
  public MapTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, boolean paramBoolean)
  {
    this.constructorConstructor = paramConstructorConstructor;
    this.complexMapKeySerialization = paramBoolean;
  }
  
  private TypeAdapter getKeyAdapter(Gson paramGson, Type paramType)
  {
    Object localObject = Boolean.TYPE;
    if (paramType != localObject)
    {
      localObject = Boolean.class;
      if (paramType != localObject) {
        break label23;
      }
    }
    for (localObject = TypeAdapters.BOOLEAN_AS_STRING;; localObject = paramGson.getAdapter((TypeToken)localObject))
    {
      return (TypeAdapter)localObject;
      label23:
      localObject = TypeToken.get(paramType);
    }
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    int i = 1;
    Type localType1 = null;
    Object localObject1 = paramTypeToken.getType();
    Object localObject2 = paramTypeToken.getRawType();
    Object localObject3 = Map.class;
    boolean bool = ((Class)localObject3).isAssignableFrom((Class)localObject2);
    if (!bool) {
      localObject1 = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject1;
      localObject2 = .Gson.Types.getRawType((Type)localObject1);
      localObject2 = .Gson.Types.getMapKeyAndValueTypes((Type)localObject1, (Class)localObject2);
      localObject1 = localObject2[0];
      TypeAdapter localTypeAdapter1 = getKeyAdapter(paramGson, (Type)localObject1);
      localObject1 = TypeToken.get(localObject2[i]);
      TypeAdapter localTypeAdapter2 = paramGson.getAdapter((TypeToken)localObject1);
      ObjectConstructor localObjectConstructor = this.constructorConstructor.get(paramTypeToken);
      localObject1 = new com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;
      localType1 = localObject2[0];
      Type localType2 = localObject2[i];
      localObject2 = this;
      localObject3 = paramGson;
      ((MapTypeAdapterFactory.Adapter)localObject1).<init>(this, paramGson, localType1, localTypeAdapter1, localType2, localTypeAdapter2, localObjectConstructor);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\MapTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */