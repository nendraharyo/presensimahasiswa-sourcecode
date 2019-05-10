package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final Gson gson;
  
  static
  {
    ObjectTypeAdapter.1 local1 = new com/google/gson/internal/bind/ObjectTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  ObjectTypeAdapter(Gson paramGson)
  {
    this.gson = paramGson;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = ObjectTypeAdapter.2.$SwitchMap$com$google$gson$stream$JsonToken;
    int i = ((JsonToken)localObject1).ordinal();
    i = localObject2[i];
    boolean bool2;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      paramJsonReader.beginArray();
      for (;;)
      {
        bool2 = paramJsonReader.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = read(paramJsonReader);
        ((List)localObject1).add(localObject2);
      }
      paramJsonReader.endArray();
    }
    for (;;)
    {
      return localObject1;
      localObject1 = new com/google/gson/internal/LinkedTreeMap;
      ((LinkedTreeMap)localObject1).<init>();
      paramJsonReader.beginObject();
      for (;;)
      {
        bool2 = paramJsonReader.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = paramJsonReader.nextName();
        Object localObject3 = read(paramJsonReader);
        ((Map)localObject1).put(localObject2, localObject3);
      }
      paramJsonReader.endObject();
      continue;
      localObject1 = paramJsonReader.nextString();
      continue;
      double d = paramJsonReader.nextDouble();
      localObject1 = Double.valueOf(d);
      continue;
      boolean bool1 = paramJsonReader.nextBoolean();
      localObject1 = Boolean.valueOf(bool1);
      continue;
      paramJsonReader.nextNull();
      bool1 = false;
      localObject1 = null;
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
      Object localObject = this.gson;
      Class localClass = paramObject.getClass();
      localObject = ((Gson)localObject).getAdapter(localClass);
      boolean bool = localObject instanceof ObjectTypeAdapter;
      if (bool)
      {
        paramJsonWriter.beginObject();
        paramJsonWriter.endObject();
      }
      else
      {
        ((TypeAdapter)localObject).write(paramJsonWriter, paramObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\ObjectTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */