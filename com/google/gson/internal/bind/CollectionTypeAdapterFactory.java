package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory
  implements TypeAdapterFactory
{
  private final ConstructorConstructor constructorConstructor;
  
  public CollectionTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor)
  {
    this.constructorConstructor = paramConstructorConstructor;
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = paramTypeToken.getType();
    Object localObject2 = paramTypeToken.getRawType();
    Object localObject3 = Collection.class;
    boolean bool = ((Class)localObject3).isAssignableFrom((Class)localObject2);
    if (!bool) {
      localObject1 = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject1;
      localObject2 = .Gson.Types.getCollectionElementType((Type)localObject1, (Class)localObject2);
      localObject1 = TypeToken.get((Type)localObject2);
      localObject3 = paramGson.getAdapter((TypeToken)localObject1);
      ObjectConstructor localObjectConstructor = this.constructorConstructor.get(paramTypeToken);
      localObject1 = new com/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;
      ((CollectionTypeAdapterFactory.Adapter)localObject1).<init>(paramGson, (Type)localObject2, (TypeAdapter)localObject3, localObjectConstructor);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\CollectionTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */