package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class TypeAdapters$29
  extends TypeAdapter
{
  public JsonElement read(JsonReader paramJsonReader)
  {
    Object localObject1 = TypeAdapters.36.$SwitchMap$com$google$gson$stream$JsonToken;
    Object localObject2 = paramJsonReader.peek();
    int i = ((JsonToken)localObject2).ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 3: 
      localObject1 = new com/google/gson/JsonPrimitive;
      localObject2 = paramJsonReader.nextString();
      ((JsonPrimitive)localObject1).<init>((String)localObject2);
    }
    for (;;)
    {
      return (JsonElement)localObject1;
      localObject2 = paramJsonReader.nextString();
      localObject1 = new com/google/gson/JsonPrimitive;
      Object localObject3 = new com/google/gson/internal/LazilyParsedNumber;
      ((LazilyParsedNumber)localObject3).<init>((String)localObject2);
      ((JsonPrimitive)localObject1).<init>((Number)localObject3);
      continue;
      localObject1 = new com/google/gson/JsonPrimitive;
      boolean bool = paramJsonReader.nextBoolean();
      localObject2 = Boolean.valueOf(bool);
      ((JsonPrimitive)localObject1).<init>((Boolean)localObject2);
      continue;
      paramJsonReader.nextNull();
      localObject1 = JsonNull.INSTANCE;
      continue;
      localObject1 = new com/google/gson/JsonArray;
      ((JsonArray)localObject1).<init>();
      paramJsonReader.beginArray();
      for (;;)
      {
        bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject2 = read(paramJsonReader);
        ((JsonArray)localObject1).add((JsonElement)localObject2);
      }
      paramJsonReader.endArray();
      continue;
      localObject1 = new com/google/gson/JsonObject;
      ((JsonObject)localObject1).<init>();
      paramJsonReader.beginObject();
      for (;;)
      {
        bool = paramJsonReader.hasNext();
        if (!bool) {
          break;
        }
        localObject2 = paramJsonReader.nextName();
        localObject3 = read(paramJsonReader);
        ((JsonObject)localObject1).add((String)localObject2, (JsonElement)localObject3);
      }
      paramJsonReader.endObject();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, JsonElement paramJsonElement)
  {
    boolean bool1;
    if (paramJsonElement != null)
    {
      bool1 = paramJsonElement.isJsonNull();
      if (!bool1) {}
    }
    else
    {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      bool1 = paramJsonElement.isJsonPrimitive();
      if (bool1)
      {
        localObject1 = paramJsonElement.getAsJsonPrimitive();
        boolean bool2 = ((JsonPrimitive)localObject1).isNumber();
        if (bool2)
        {
          localObject1 = ((JsonPrimitive)localObject1).getAsNumber();
          paramJsonWriter.value((Number)localObject1);
        }
        else
        {
          bool2 = ((JsonPrimitive)localObject1).isBoolean();
          if (bool2)
          {
            bool1 = ((JsonPrimitive)localObject1).getAsBoolean();
            paramJsonWriter.value(bool1);
          }
          else
          {
            localObject1 = ((JsonPrimitive)localObject1).getAsString();
            paramJsonWriter.value((String)localObject1);
          }
        }
      }
      else
      {
        bool1 = paramJsonElement.isJsonArray();
        if (bool1)
        {
          paramJsonWriter.beginArray();
          localObject1 = paramJsonElement.getAsJsonArray();
          localObject2 = ((JsonArray)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (JsonElement)((Iterator)localObject2).next();
            write(paramJsonWriter, (JsonElement)localObject1);
          }
          paramJsonWriter.endArray();
        }
        else
        {
          bool1 = paramJsonElement.isJsonObject();
          if (!bool1) {
            break;
          }
          paramJsonWriter.beginObject();
          localObject1 = paramJsonElement.getAsJsonObject().entrySet();
          localObject3 = ((Set)localObject1).iterator();
          for (;;)
          {
            bool1 = ((Iterator)localObject3).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (Map.Entry)((Iterator)localObject3).next();
            localObject2 = (String)((Map.Entry)localObject1).getKey();
            paramJsonWriter.name((String)localObject2);
            localObject1 = (JsonElement)((Map.Entry)localObject1).getValue();
            write(paramJsonWriter, (JsonElement)localObject1);
          }
          paramJsonWriter.endObject();
        }
      }
    }
    Object localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Couldn't write ");
    Object localObject3 = paramJsonElement.getClass();
    localObject2 = localObject3;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$29.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */