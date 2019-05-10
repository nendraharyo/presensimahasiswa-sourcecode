package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class ArrayTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final Class componentType;
  private final TypeAdapter componentTypeAdapter;
  
  static
  {
    ArrayTypeAdapter.1 local1 = new com/google/gson/internal/bind/ArrayTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  public ArrayTypeAdapter(Gson paramGson, TypeAdapter paramTypeAdapter, Class paramClass)
  {
    TypeAdapterRuntimeTypeWrapper localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter, paramClass);
    this.componentTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    this.componentType = paramClass;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    int i;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      i = 0;
    }
    for (localObject1 = null;; localObject1 = localObject2)
    {
      return localObject1;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      paramJsonReader.beginArray();
      for (;;)
      {
        i = paramJsonReader.hasNext();
        if (i == 0) {
          break;
        }
        localObject1 = this.componentTypeAdapter.read(paramJsonReader);
        localArrayList.add(localObject1);
      }
      paramJsonReader.endArray();
      localObject1 = this.componentType;
      int k = localArrayList.size();
      localObject2 = Array.newInstance((Class)localObject1, k);
      i = 0;
      localObject1 = null;
      for (;;)
      {
        int m = localArrayList.size();
        if (i >= m) {
          break;
        }
        Object localObject3 = localArrayList.get(i);
        Array.set(localObject2, i, localObject3);
        int j;
        i += 1;
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    if (paramObject == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginArray();
      int i = 0;
      int j = Array.getLength(paramObject);
      while (i < j)
      {
        Object localObject = Array.get(paramObject, i);
        TypeAdapter localTypeAdapter = this.componentTypeAdapter;
        localTypeAdapter.write(paramJsonWriter, localObject);
        i += 1;
      }
      paramJsonWriter.endArray();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\ArrayTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */