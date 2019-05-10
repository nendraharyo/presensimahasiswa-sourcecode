package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory
  implements TypeAdapterFactory
{
  private final ConstructorConstructor constructorConstructor;
  
  public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor)
  {
    this.constructorConstructor = paramConstructorConstructor;
  }
  
  static TypeAdapter getTypeAdapter(ConstructorConstructor paramConstructorConstructor, Gson paramGson, TypeToken paramTypeToken, JsonAdapter paramJsonAdapter)
  {
    Object localObject = paramJsonAdapter.value();
    Class localClass = TypeAdapter.class;
    boolean bool = localClass.isAssignableFrom((Class)localObject);
    if (bool) {
      localObject = TypeToken.get((Class)localObject);
    }
    for (localObject = (TypeAdapter)paramConstructorConstructor.get((TypeToken)localObject).construct();; localObject = ((TypeAdapterFactory)paramConstructorConstructor.get((TypeToken)localObject).construct()).create(paramGson, paramTypeToken))
    {
      if (localObject != null) {
        localObject = ((TypeAdapter)localObject).nullSafe();
      }
      return (TypeAdapter)localObject;
      localClass = TypeAdapterFactory.class;
      bool = localClass.isAssignableFrom((Class)localObject);
      if (!bool) {
        break;
      }
      localObject = TypeToken.get((Class)localObject);
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
    throw ((Throwable)localObject);
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = paramTypeToken.getRawType();
    Object localObject2 = JsonAdapter.class;
    localObject1 = (JsonAdapter)((Class)localObject1).getAnnotation((Class)localObject2);
    if (localObject1 == null) {}
    for (localObject1 = null;; localObject1 = getTypeAdapter((ConstructorConstructor)localObject2, paramGson, paramTypeToken, (JsonAdapter)localObject1))
    {
      return (TypeAdapter)localObject1;
      localObject2 = this.constructorConstructor;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\JsonAdapterAnnotationTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */