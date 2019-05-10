package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;

final class TreeTypeAdapter
  extends TypeAdapter
{
  private TypeAdapter delegate;
  private final JsonDeserializer deserializer;
  private final Gson gson;
  private final JsonSerializer serializer;
  private final TypeAdapterFactory skipPast;
  private final TypeToken typeToken;
  
  TreeTypeAdapter(JsonSerializer paramJsonSerializer, JsonDeserializer paramJsonDeserializer, Gson paramGson, TypeToken paramTypeToken, TypeAdapterFactory paramTypeAdapterFactory)
  {
    this.serializer = paramJsonSerializer;
    this.deserializer = paramJsonDeserializer;
    this.gson = paramGson;
    this.typeToken = paramTypeToken;
    this.skipPast = paramTypeAdapterFactory;
  }
  
  private TypeAdapter delegate()
  {
    Object localObject = this.delegate;
    if (localObject != null) {}
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = this.gson;
      TypeAdapterFactory localTypeAdapterFactory = this.skipPast;
      TypeToken localTypeToken = this.typeToken;
      localObject = ((Gson)localObject).getDelegateAdapter(localTypeAdapterFactory, localTypeToken);
      this.delegate = ((TypeAdapter)localObject);
    }
  }
  
  public static TypeAdapterFactory newFactory(TypeToken paramTypeToken, Object paramObject)
  {
    TreeTypeAdapter.SingleTypeFactory localSingleTypeFactory = new com/google/gson/TreeTypeAdapter$SingleTypeFactory;
    localSingleTypeFactory.<init>(paramObject, paramTypeToken, false, null);
    return localSingleTypeFactory;
  }
  
  public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken paramTypeToken, Object paramObject)
  {
    Type localType = paramTypeToken.getType();
    Object localObject = paramTypeToken.getRawType();
    boolean bool;
    if (localType == localObject) {
      bool = true;
    }
    for (;;)
    {
      localObject = new com/google/gson/TreeTypeAdapter$SingleTypeFactory;
      ((TreeTypeAdapter.SingleTypeFactory)localObject).<init>(paramObject, paramTypeToken, bool, null);
      return (TypeAdapterFactory)localObject;
      bool = false;
      localType = null;
    }
  }
  
  public static TypeAdapterFactory newTypeHierarchyFactory(Class paramClass, Object paramObject)
  {
    TreeTypeAdapter.SingleTypeFactory localSingleTypeFactory = new com/google/gson/TreeTypeAdapter$SingleTypeFactory;
    localSingleTypeFactory.<init>(paramObject, null, false, paramClass);
    return localSingleTypeFactory;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject = this.deserializer;
    if (localObject == null) {
      localObject = delegate().read(paramJsonReader);
    }
    for (;;)
    {
      return localObject;
      localObject = Streams.parse(paramJsonReader);
      boolean bool = ((JsonElement)localObject).isJsonNull();
      if (bool)
      {
        localObject = null;
      }
      else
      {
        JsonDeserializer localJsonDeserializer = this.deserializer;
        Type localType = this.typeToken.getType();
        JsonDeserializationContext localJsonDeserializationContext = this.gson.deserializationContext;
        localObject = localJsonDeserializer.deserialize((JsonElement)localObject, localType, localJsonDeserializationContext);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    Object localObject = this.serializer;
    if (localObject == null)
    {
      localObject = delegate();
      ((TypeAdapter)localObject).write(paramJsonWriter, paramObject);
    }
    for (;;)
    {
      return;
      if (paramObject == null)
      {
        paramJsonWriter.nullValue();
      }
      else
      {
        localObject = this.serializer;
        Type localType = this.typeToken.getType();
        JsonSerializationContext localJsonSerializationContext = this.gson.serializationContext;
        localObject = ((JsonSerializer)localObject).serialize(paramObject, localType, localJsonSerializationContext);
        Streams.write((JsonElement)localObject, paramJsonWriter);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\TreeTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */