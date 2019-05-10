package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class TypeAdapter
{
  public final Object fromJson(Reader paramReader)
  {
    JsonReader localJsonReader = new com/google/gson/stream/JsonReader;
    localJsonReader.<init>(paramReader);
    return read(localJsonReader);
  }
  
  public final Object fromJson(String paramString)
  {
    StringReader localStringReader = new java/io/StringReader;
    localStringReader.<init>(paramString);
    return fromJson(localStringReader);
  }
  
  public final Object fromJsonTree(JsonElement paramJsonElement)
  {
    try
    {
      JsonTreeReader localJsonTreeReader = new com/google/gson/internal/bind/JsonTreeReader;
      localJsonTreeReader.<init>(paramJsonElement);
      return read(localJsonTreeReader);
    }
    catch (IOException localIOException)
    {
      JsonIOException localJsonIOException = new com/google/gson/JsonIOException;
      localJsonIOException.<init>(localIOException);
      throw localJsonIOException;
    }
  }
  
  public final TypeAdapter nullSafe()
  {
    TypeAdapter.1 local1 = new com/google/gson/TypeAdapter$1;
    local1.<init>(this);
    return local1;
  }
  
  public abstract Object read(JsonReader paramJsonReader);
  
  public final String toJson(Object paramObject)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    try
    {
      toJson(localStringWriter, paramObject);
      return localStringWriter.toString();
    }
    catch (IOException localIOException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localIOException);
      throw localAssertionError;
    }
  }
  
  public final void toJson(Writer paramWriter, Object paramObject)
  {
    JsonWriter localJsonWriter = new com/google/gson/stream/JsonWriter;
    localJsonWriter.<init>(paramWriter);
    write(localJsonWriter, paramObject);
  }
  
  public final JsonElement toJsonTree(Object paramObject)
  {
    try
    {
      JsonTreeWriter localJsonTreeWriter = new com/google/gson/internal/bind/JsonTreeWriter;
      localJsonTreeWriter.<init>();
      write(localJsonTreeWriter, paramObject);
      return localJsonTreeWriter.get();
    }
    catch (IOException localIOException)
    {
      JsonIOException localJsonIOException = new com/google/gson/JsonIOException;
      localJsonIOException.<init>(localIOException);
      throw localJsonIOException;
    }
  }
  
  public abstract void write(JsonWriter paramJsonWriter, Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\TypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */