package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class JsonTreeWriter
  extends JsonWriter
{
  private static final JsonPrimitive SENTINEL_CLOSED;
  private static final Writer UNWRITABLE_WRITER;
  private String pendingName;
  private JsonElement product;
  private final List stack;
  
  static
  {
    Object localObject = new com/google/gson/internal/bind/JsonTreeWriter$1;
    ((JsonTreeWriter.1)localObject).<init>();
    UNWRITABLE_WRITER = (Writer)localObject;
    localObject = new com/google/gson/JsonPrimitive;
    ((JsonPrimitive)localObject).<init>("closed");
    SENTINEL_CLOSED = (JsonPrimitive)localObject;
  }
  
  public JsonTreeWriter()
  {
    super((Writer)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.stack = ((List)localObject);
    localObject = JsonNull.INSTANCE;
    this.product = ((JsonElement)localObject);
  }
  
  private JsonElement peek()
  {
    List localList = this.stack;
    int i = this.stack.size() + -1;
    return (JsonElement)localList.get(i);
  }
  
  private void put(JsonElement paramJsonElement)
  {
    Object localObject = this.pendingName;
    boolean bool1;
    if (localObject != null)
    {
      bool1 = paramJsonElement.isJsonNull();
      if (bool1)
      {
        bool1 = getSerializeNulls();
        if (!bool1) {}
      }
      else
      {
        localObject = (JsonObject)peek();
        String str = this.pendingName;
        ((JsonObject)localObject).add(str, paramJsonElement);
      }
      bool1 = false;
      localObject = null;
      this.pendingName = null;
    }
    for (;;)
    {
      return;
      localObject = this.stack;
      bool1 = ((List)localObject).isEmpty();
      if (bool1)
      {
        this.product = paramJsonElement;
      }
      else
      {
        localObject = peek();
        boolean bool2 = localObject instanceof JsonArray;
        if (!bool2) {
          break;
        }
        localObject = (JsonArray)localObject;
        ((JsonArray)localObject).add(paramJsonElement);
      }
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public JsonWriter beginArray()
  {
    JsonArray localJsonArray = new com/google/gson/JsonArray;
    localJsonArray.<init>();
    put(localJsonArray);
    this.stack.add(localJsonArray);
    return this;
  }
  
  public JsonWriter beginObject()
  {
    JsonObject localJsonObject = new com/google/gson/JsonObject;
    localJsonObject.<init>();
    put(localJsonObject);
    this.stack.add(localJsonObject);
    return this;
  }
  
  public void close()
  {
    Object localObject = this.stack;
    boolean bool = ((List)localObject).isEmpty();
    if (!bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Incomplete document");
      throw ((Throwable)localObject);
    }
    localObject = this.stack;
    JsonPrimitive localJsonPrimitive = SENTINEL_CLOSED;
    ((List)localObject).add(localJsonPrimitive);
  }
  
  public JsonWriter endArray()
  {
    Object localObject = this.stack;
    boolean bool = ((List)localObject).isEmpty();
    if (!bool)
    {
      localObject = this.pendingName;
      if (localObject == null) {}
    }
    else
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = peek();
    bool = localObject instanceof JsonArray;
    if (bool)
    {
      localObject = this.stack;
      int i = this.stack.size() + -1;
      ((List)localObject).remove(i);
      return this;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public JsonWriter endObject()
  {
    Object localObject = this.stack;
    boolean bool = ((List)localObject).isEmpty();
    if (!bool)
    {
      localObject = this.pendingName;
      if (localObject == null) {}
    }
    else
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = peek();
    bool = localObject instanceof JsonObject;
    if (bool)
    {
      localObject = this.stack;
      int i = this.stack.size() + -1;
      ((List)localObject).remove(i);
      return this;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public void flush() {}
  
  public JsonElement get()
  {
    Object localObject1 = this.stack;
    boolean bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Expected one JSON element but was ");
      List localList = this.stack;
      localObject2 = localList;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return this.product;
  }
  
  public JsonWriter name(String paramString)
  {
    Object localObject = this.stack;
    boolean bool = ((List)localObject).isEmpty();
    if (!bool)
    {
      localObject = this.pendingName;
      if (localObject == null) {}
    }
    else
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = peek();
    bool = localObject instanceof JsonObject;
    if (bool)
    {
      this.pendingName = paramString;
      return this;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public JsonWriter nullValue()
  {
    JsonNull localJsonNull = JsonNull.INSTANCE;
    put(localJsonNull);
    return this;
  }
  
  public JsonWriter value(double paramDouble)
  {
    boolean bool = isLenient();
    if (!bool)
    {
      bool = Double.isNaN(paramDouble);
      if (!bool)
      {
        bool = Double.isInfinite(paramDouble);
        if (!bool) {}
      }
      else
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "JSON forbids NaN and infinities: " + paramDouble;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = new com/google/gson/JsonPrimitive;
    Object localObject2 = Double.valueOf(paramDouble);
    ((JsonPrimitive)localObject1).<init>((Number)localObject2);
    put((JsonElement)localObject1);
    return this;
  }
  
  public JsonWriter value(long paramLong)
  {
    JsonPrimitive localJsonPrimitive = new com/google/gson/JsonPrimitive;
    Long localLong = Long.valueOf(paramLong);
    localJsonPrimitive.<init>(localLong);
    put(localJsonPrimitive);
    return this;
  }
  
  public JsonWriter value(Number paramNumber)
  {
    if (paramNumber == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      boolean bool1 = isLenient();
      if (!bool1)
      {
        double d = paramNumber.doubleValue();
        boolean bool2 = Double.isNaN(d);
        if (!bool2)
        {
          bool1 = Double.isInfinite(d);
          if (!bool1) {}
        }
        else
        {
          localObject1 = new java/lang/IllegalArgumentException;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "JSON forbids NaN and infinities: " + paramNumber;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      Object localObject1 = new com/google/gson/JsonPrimitive;
      ((JsonPrimitive)localObject1).<init>(paramNumber);
      put((JsonElement)localObject1);
    }
  }
  
  public JsonWriter value(String paramString)
  {
    if (paramString == null) {
      this = nullValue();
    }
    for (;;)
    {
      return this;
      JsonPrimitive localJsonPrimitive = new com/google/gson/JsonPrimitive;
      localJsonPrimitive.<init>(paramString);
      put(localJsonPrimitive);
    }
  }
  
  public JsonWriter value(boolean paramBoolean)
  {
    JsonPrimitive localJsonPrimitive = new com/google/gson/JsonPrimitive;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localJsonPrimitive.<init>(localBoolean);
    put(localJsonPrimitive);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\JsonTreeWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */