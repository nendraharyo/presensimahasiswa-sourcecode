package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper
  extends TypeAdapter
{
  private final Gson context;
  private final TypeAdapter delegate;
  private final Type type;
  
  TypeAdapterRuntimeTypeWrapper(Gson paramGson, TypeAdapter paramTypeAdapter, Type paramType)
  {
    this.context = paramGson;
    this.delegate = paramTypeAdapter;
    this.type = paramType;
  }
  
  private Type getRuntimeTypeIfMoreSpecific(Type paramType, Object paramObject)
  {
    if (paramObject != null)
    {
      Class localClass = Object.class;
      if (paramType != localClass)
      {
        boolean bool = paramType instanceof TypeVariable;
        if (!bool)
        {
          bool = paramType instanceof Class;
          if (!bool) {
            return paramType;
          }
        }
      }
      paramType = paramObject.getClass();
    }
    return paramType;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    return this.delegate.read(paramJsonReader);
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    Object localObject1 = this.delegate;
    Object localObject2 = this.type;
    localObject2 = getRuntimeTypeIfMoreSpecific((Type)localObject2, paramObject);
    Type localType = this.type;
    boolean bool;
    if (localObject2 != localType)
    {
      localObject1 = this.context;
      localObject2 = TypeToken.get((Type)localObject2);
      localObject1 = ((Gson)localObject1).getAdapter((TypeToken)localObject2);
      bool = localObject1 instanceof ReflectiveTypeAdapterFactory.Adapter;
      if (bool) {
        break label73;
      }
    }
    for (;;)
    {
      ((TypeAdapter)localObject1).write(paramJsonWriter, paramObject);
      return;
      label73:
      localObject2 = this.delegate;
      bool = localObject2 instanceof ReflectiveTypeAdapterFactory.Adapter;
      if (!bool) {
        localObject1 = this.delegate;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapterRuntimeTypeWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */