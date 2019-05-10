package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class MapTypeAdapterFactory$Adapter
  extends TypeAdapter
{
  private final ObjectConstructor constructor;
  private final TypeAdapter keyTypeAdapter;
  private final TypeAdapter valueTypeAdapter;
  
  public MapTypeAdapterFactory$Adapter(MapTypeAdapterFactory paramMapTypeAdapterFactory, Gson paramGson, Type paramType1, TypeAdapter paramTypeAdapter1, Type paramType2, TypeAdapter paramTypeAdapter2, ObjectConstructor paramObjectConstructor)
  {
    TypeAdapterRuntimeTypeWrapper localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter1, paramType1);
    this.keyTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    localTypeAdapterRuntimeTypeWrapper.<init>(paramGson, paramTypeAdapter2, paramType2);
    this.valueTypeAdapter = localTypeAdapterRuntimeTypeWrapper;
    this.constructor = paramObjectConstructor;
  }
  
  private String keyToString(JsonElement paramJsonElement)
  {
    boolean bool1 = paramJsonElement.isJsonPrimitive();
    boolean bool2;
    if (bool1)
    {
      localObject = paramJsonElement.getAsJsonPrimitive();
      bool2 = ((JsonPrimitive)localObject).isNumber();
      if (bool2) {
        localObject = String.valueOf(((JsonPrimitive)localObject).getAsNumber());
      }
    }
    for (;;)
    {
      return (String)localObject;
      bool2 = ((JsonPrimitive)localObject).isBoolean();
      if (bool2)
      {
        bool1 = ((JsonPrimitive)localObject).getAsBoolean();
        localObject = Boolean.toString(bool1);
      }
      else
      {
        bool2 = ((JsonPrimitive)localObject).isString();
        if (bool2)
        {
          localObject = ((JsonPrimitive)localObject).getAsString();
        }
        else
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>();
          throw ((Throwable)localObject);
          bool1 = paramJsonElement.isJsonNull();
          if (!bool1) {
            break;
          }
          localObject = "null";
        }
      }
    }
    Object localObject = new java/lang/AssertionError;
    ((AssertionError)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public Map read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      localObject2 = null;
    }
    for (;;)
    {
      return (Map)localObject2;
      localObject2 = (Map)this.constructor.construct();
      Object localObject3 = JsonToken.BEGIN_ARRAY;
      boolean bool;
      if (localObject1 == localObject3)
      {
        paramJsonReader.beginArray();
        for (;;)
        {
          bool = paramJsonReader.hasNext();
          if (!bool) {
            break;
          }
          paramJsonReader.beginArray();
          localObject1 = this.keyTypeAdapter.read(paramJsonReader);
          localObject3 = this.valueTypeAdapter.read(paramJsonReader);
          localObject3 = ((Map)localObject2).put(localObject1, localObject3);
          if (localObject3 != null)
          {
            localObject2 = new com/google/gson/JsonSyntaxException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject1 = "duplicate key: " + localObject1;
            ((JsonSyntaxException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
          paramJsonReader.endArray();
        }
        paramJsonReader.endArray();
      }
      else
      {
        paramJsonReader.beginObject();
        do
        {
          bool = paramJsonReader.hasNext();
          if (!bool) {
            break;
          }
          JsonReaderInternalAccess.INSTANCE.promoteNameToValue(paramJsonReader);
          localObject1 = this.keyTypeAdapter.read(paramJsonReader);
          localObject3 = this.valueTypeAdapter.read(paramJsonReader);
          localObject3 = ((Map)localObject2).put(localObject1, localObject3);
        } while (localObject3 == null);
        localObject2 = new com/google/gson/JsonSyntaxException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = "duplicate key: " + localObject1;
        ((JsonSyntaxException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
        paramJsonReader.endObject();
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Map paramMap)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramMap == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      Object localObject2 = this.this$0;
      boolean bool1 = ((MapTypeAdapterFactory)localObject2).complexMapKeySerialization;
      Object localObject3;
      if (!bool1)
      {
        paramJsonWriter.beginObject();
        localObject2 = paramMap.entrySet();
        localObject3 = ((Set)localObject2).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = (Map.Entry)((Iterator)localObject3).next();
          localObject1 = String.valueOf(((Map.Entry)localObject2).getKey());
          paramJsonWriter.name((String)localObject1);
          localObject1 = this.valueTypeAdapter;
          localObject2 = ((Map.Entry)localObject2).getValue();
          ((TypeAdapter)localObject1).write(paramJsonWriter, localObject2);
        }
        paramJsonWriter.endObject();
      }
      else
      {
        ArrayList localArrayList1 = new java/util/ArrayList;
        int j = paramMap.size();
        localArrayList1.<init>(j);
        ArrayList localArrayList2 = new java/util/ArrayList;
        j = paramMap.size();
        localArrayList2.<init>(j);
        localObject2 = paramMap.entrySet();
        Iterator localIterator = ((Set)localObject2).iterator();
        boolean bool3 = false;
        localObject3 = null;
        boolean bool2 = localIterator.hasNext();
        if (bool2)
        {
          localObject2 = (Map.Entry)localIterator.next();
          Object localObject4 = this.keyTypeAdapter;
          Object localObject5 = ((Map.Entry)localObject2).getKey();
          localObject4 = ((TypeAdapter)localObject4).toJsonTree(localObject5);
          localArrayList1.add(localObject4);
          localObject2 = ((Map.Entry)localObject2).getValue();
          localArrayList2.add(localObject2);
          bool2 = ((JsonElement)localObject4).isJsonArray();
          if (!bool2)
          {
            bool2 = ((JsonElement)localObject4).isJsonObject();
            if (!bool2) {}
          }
          else
          {
            bool2 = true;
          }
          for (;;)
          {
            bool2 |= bool3;
            bool3 = bool2;
            break;
            bool2 = false;
            localObject2 = null;
          }
        }
        int k;
        if (bool3)
        {
          paramJsonWriter.beginArray();
          for (;;)
          {
            k = localArrayList1.size();
            if (i >= k) {
              break;
            }
            paramJsonWriter.beginArray();
            Streams.write((JsonElement)localArrayList1.get(i), paramJsonWriter);
            localObject2 = this.valueTypeAdapter;
            localObject3 = localArrayList2.get(i);
            ((TypeAdapter)localObject2).write(paramJsonWriter, localObject3);
            paramJsonWriter.endArray();
            i += 1;
          }
          paramJsonWriter.endArray();
        }
        else
        {
          paramJsonWriter.beginObject();
          for (;;)
          {
            k = localArrayList1.size();
            if (i >= k) {
              break;
            }
            localObject2 = (JsonElement)localArrayList1.get(i);
            localObject2 = keyToString((JsonElement)localObject2);
            paramJsonWriter.name((String)localObject2);
            localObject2 = this.valueTypeAdapter;
            localObject3 = localArrayList2.get(i);
            ((TypeAdapter)localObject2).write(paramJsonWriter, localObject3);
            i += 1;
          }
          paramJsonWriter.endObject();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\MapTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */