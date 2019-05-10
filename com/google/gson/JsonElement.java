package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonElement
{
  abstract JsonElement deepCopy();
  
  public BigDecimal getAsBigDecimal()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public BigInteger getAsBigInteger()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public boolean getAsBoolean()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  Boolean getAsBooleanWrapper()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public byte getAsByte()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public char getAsCharacter()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public double getAsDouble()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public float getAsFloat()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public int getAsInt()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public JsonArray getAsJsonArray()
  {
    boolean bool = isJsonArray();
    if (bool) {
      return (JsonArray)this;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("This is not a JSON Array.");
    throw localIllegalStateException;
  }
  
  public JsonNull getAsJsonNull()
  {
    boolean bool = isJsonNull();
    if (bool) {
      return (JsonNull)this;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("This is not a JSON Null.");
    throw localIllegalStateException;
  }
  
  public JsonObject getAsJsonObject()
  {
    boolean bool = isJsonObject();
    if (bool) {
      return (JsonObject)this;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Not a JSON Object: " + this;
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  public JsonPrimitive getAsJsonPrimitive()
  {
    boolean bool = isJsonPrimitive();
    if (bool) {
      return (JsonPrimitive)this;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("This is not a JSON Primitive.");
    throw localIllegalStateException;
  }
  
  public long getAsLong()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public Number getAsNumber()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public short getAsShort()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public String getAsString()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public boolean isJsonArray()
  {
    return this instanceof JsonArray;
  }
  
  public boolean isJsonNull()
  {
    return this instanceof JsonNull;
  }
  
  public boolean isJsonObject()
  {
    return this instanceof JsonObject;
  }
  
  public boolean isJsonPrimitive()
  {
    return this instanceof JsonPrimitive;
  }
  
  public String toString()
  {
    try
    {
      StringWriter localStringWriter = new java/io/StringWriter;
      localStringWriter.<init>();
      localObject = new com/google/gson/stream/JsonWriter;
      ((JsonWriter)localObject).<init>(localStringWriter);
      boolean bool = true;
      ((JsonWriter)localObject).setLenient(bool);
      Streams.write(this, (JsonWriter)localObject);
      return localStringWriter.toString();
    }
    catch (IOException localIOException)
    {
      Object localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\JsonElement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */