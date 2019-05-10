package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

final class CollectionTypeAdapterFactory$Adapter
  extends TypeAdapter
{
  private final ObjectConstructor constructor;
  private final TypeAdapter elementTypeAdapter;
  
  public CollectionTypeAdapterFactory$Adapter(Gson paramGson, Type paramType, TypeAdapter paramTypeAdapter, ObjectConstructor paramObjectConstructor)
  {
    TypeAdapterRuntimeTypeWrapper localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter, paramType);
    this.elementTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    this.constructor = paramObjectConstructor;
  }
  
  public Collection read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      localObject1 = null;
    }
    for (;;)
    {
      return (Collection)localObject1;
      localObject1 = (Collection)this.constructor.construct();
      paramJsonReader.beginArray();
      for (;;)
      {
        boolean bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject2 = this.elementTypeAdapter.read(paramJsonReader);
        ((Collection)localObject1).add(localObject2);
      }
      paramJsonReader.endArray();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Collection paramCollection)
  {
    if (paramCollection == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginArray();
      Iterator localIterator = paramCollection.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject = localIterator.next();
        TypeAdapter localTypeAdapter = this.elementTypeAdapter;
        localTypeAdapter.write(paramJsonWriter, localObject);
      }
      paramJsonWriter.endArray();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\CollectionTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */