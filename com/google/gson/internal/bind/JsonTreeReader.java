package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class JsonTreeReader
  extends JsonReader
{
  private static final Object SENTINEL_CLOSED;
  private static final Reader UNREADABLE_READER;
  private final List stack;
  
  static
  {
    Object localObject = new com/google/gson/internal/bind/JsonTreeReader$1;
    ((JsonTreeReader.1)localObject).<init>();
    UNREADABLE_READER = (Reader)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    SENTINEL_CLOSED = localObject;
  }
  
  public JsonTreeReader(JsonElement paramJsonElement)
  {
    super((Reader)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.stack = ((List)localObject);
    this.stack.add(paramJsonElement);
  }
  
  private void expect(JsonToken paramJsonToken)
  {
    Object localObject1 = peek();
    if (localObject1 != paramJsonToken)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Expected ").append(paramJsonToken).append(" but was ");
      JsonToken localJsonToken = peek();
      localObject2 = localJsonToken;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  private Object peekStack()
  {
    List localList = this.stack;
    int i = this.stack.size() + -1;
    return localList.get(i);
  }
  
  private Object popStack()
  {
    List localList = this.stack;
    int i = this.stack.size() + -1;
    return localList.remove(i);
  }
  
  public void beginArray()
  {
    Object localObject = JsonToken.BEGIN_ARRAY;
    expect((JsonToken)localObject);
    localObject = (JsonArray)peekStack();
    List localList = this.stack;
    localObject = ((JsonArray)localObject).iterator();
    localList.add(localObject);
  }
  
  public void beginObject()
  {
    Object localObject = JsonToken.BEGIN_OBJECT;
    expect((JsonToken)localObject);
    localObject = (JsonObject)peekStack();
    List localList = this.stack;
    localObject = ((JsonObject)localObject).entrySet().iterator();
    localList.add(localObject);
  }
  
  public void close()
  {
    this.stack.clear();
    List localList = this.stack;
    Object localObject = SENTINEL_CLOSED;
    localList.add(localObject);
  }
  
  public void endArray()
  {
    JsonToken localJsonToken = JsonToken.END_ARRAY;
    expect(localJsonToken);
    popStack();
    popStack();
  }
  
  public void endObject()
  {
    JsonToken localJsonToken = JsonToken.END_OBJECT;
    expect(localJsonToken);
    popStack();
    popStack();
  }
  
  public boolean hasNext()
  {
    JsonToken localJsonToken1 = peek();
    JsonToken localJsonToken2 = JsonToken.END_OBJECT;
    boolean bool;
    if (localJsonToken1 != localJsonToken2)
    {
      localJsonToken2 = JsonToken.END_ARRAY;
      if (localJsonToken1 != localJsonToken2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localJsonToken1 = null;
    }
  }
  
  public boolean nextBoolean()
  {
    JsonToken localJsonToken = JsonToken.BOOLEAN;
    expect(localJsonToken);
    return ((JsonPrimitive)popStack()).getAsBoolean();
  }
  
  public double nextDouble()
  {
    Object localObject1 = peek();
    Object localObject2 = JsonToken.NUMBER;
    Object localObject3;
    Object localObject4;
    if (localObject1 != localObject2)
    {
      localObject2 = JsonToken.STRING;
      if (localObject1 != localObject2)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Expected ");
        localObject4 = JsonToken.NUMBER;
        localObject1 = localObject4 + " but was " + localObject1;
        ((IllegalStateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    localObject1 = (JsonPrimitive)peekStack();
    double d = ((JsonPrimitive)localObject1).getAsDouble();
    boolean bool = isLenient();
    if (!bool)
    {
      bool = Double.isNaN(d);
      if (!bool)
      {
        bool = Double.isInfinite(d);
        if (!bool) {}
      }
      else
      {
        localObject3 = new java/lang/NumberFormatException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject1 = "JSON forbids NaN and infinities: " + d;
        ((NumberFormatException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
    }
    popStack();
    return d;
  }
  
  public int nextInt()
  {
    Object localObject1 = peek();
    Object localObject2 = JsonToken.NUMBER;
    if (localObject1 != localObject2)
    {
      localObject2 = JsonToken.STRING;
      if (localObject1 != localObject2)
      {
        localObject2 = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Expected ");
        JsonToken localJsonToken = JsonToken.NUMBER;
        localObject1 = localJsonToken + " but was " + localObject1;
        ((IllegalStateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    int i = ((JsonPrimitive)peekStack()).getAsInt();
    popStack();
    return i;
  }
  
  public long nextLong()
  {
    Object localObject1 = peek();
    Object localObject2 = JsonToken.NUMBER;
    if (localObject1 != localObject2)
    {
      localObject2 = JsonToken.STRING;
      if (localObject1 != localObject2)
      {
        localObject2 = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Expected ");
        JsonToken localJsonToken = JsonToken.NUMBER;
        localObject1 = localJsonToken + " but was " + localObject1;
        ((IllegalStateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    long l = ((JsonPrimitive)peekStack()).getAsLong();
    popStack();
    return l;
  }
  
  public String nextName()
  {
    Object localObject1 = JsonToken.NAME;
    expect((JsonToken)localObject1);
    localObject1 = (Map.Entry)((Iterator)peekStack()).next();
    List localList = this.stack;
    Object localObject2 = ((Map.Entry)localObject1).getValue();
    localList.add(localObject2);
    return (String)((Map.Entry)localObject1).getKey();
  }
  
  public void nextNull()
  {
    JsonToken localJsonToken = JsonToken.NULL;
    expect(localJsonToken);
    popStack();
  }
  
  public String nextString()
  {
    Object localObject1 = peek();
    Object localObject2 = JsonToken.STRING;
    if (localObject1 != localObject2)
    {
      localObject2 = JsonToken.NUMBER;
      if (localObject1 != localObject2)
      {
        localObject2 = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Expected ");
        JsonToken localJsonToken = JsonToken.STRING;
        localObject1 = localJsonToken + " but was " + localObject1;
        ((IllegalStateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    return ((JsonPrimitive)popStack()).getAsString();
  }
  
  public JsonToken peek()
  {
    Object localObject1 = this.stack;
    boolean bool1 = ((List)localObject1).isEmpty();
    if (bool1) {
      localObject1 = JsonToken.END_DOCUMENT;
    }
    for (;;)
    {
      return (JsonToken)localObject1;
      localObject1 = peekStack();
      boolean bool2 = localObject1 instanceof Iterator;
      if (bool2)
      {
        localObject2 = this.stack;
        List localList = this.stack;
        int i = localList.size() + -2;
        localObject2 = ((List)localObject2).get(i);
        bool2 = localObject2 instanceof JsonObject;
        localObject1 = (Iterator)localObject1;
        boolean bool3 = ((Iterator)localObject1).hasNext();
        if (bool3)
        {
          if (bool2)
          {
            localObject1 = JsonToken.NAME;
          }
          else
          {
            localObject2 = this.stack;
            localObject1 = ((Iterator)localObject1).next();
            ((List)localObject2).add(localObject1);
            localObject1 = peek();
          }
        }
        else if (bool2) {
          localObject1 = JsonToken.END_OBJECT;
        } else {
          localObject1 = JsonToken.END_ARRAY;
        }
      }
      else
      {
        bool2 = localObject1 instanceof JsonObject;
        if (bool2)
        {
          localObject1 = JsonToken.BEGIN_OBJECT;
        }
        else
        {
          bool2 = localObject1 instanceof JsonArray;
          if (bool2)
          {
            localObject1 = JsonToken.BEGIN_ARRAY;
          }
          else
          {
            bool2 = localObject1 instanceof JsonPrimitive;
            if (bool2)
            {
              localObject1 = (JsonPrimitive)localObject1;
              bool2 = ((JsonPrimitive)localObject1).isString();
              if (bool2)
              {
                localObject1 = JsonToken.STRING;
              }
              else
              {
                bool2 = ((JsonPrimitive)localObject1).isBoolean();
                if (bool2)
                {
                  localObject1 = JsonToken.BOOLEAN;
                }
                else
                {
                  bool1 = ((JsonPrimitive)localObject1).isNumber();
                  if (bool1)
                  {
                    localObject1 = JsonToken.NUMBER;
                  }
                  else
                  {
                    localObject1 = new java/lang/AssertionError;
                    ((AssertionError)localObject1).<init>();
                    throw ((Throwable)localObject1);
                  }
                }
              }
            }
            else
            {
              bool2 = localObject1 instanceof JsonNull;
              if (!bool2) {
                break;
              }
              localObject1 = JsonToken.NULL;
            }
          }
        }
      }
    }
    Object localObject2 = SENTINEL_CLOSED;
    if (localObject1 == localObject2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("JsonReader is closed");
      throw ((Throwable)localObject1);
    }
    localObject1 = new java/lang/AssertionError;
    ((AssertionError)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public void promoteNameToValue()
  {
    Object localObject1 = JsonToken.NAME;
    expect((JsonToken)localObject1);
    localObject1 = (Map.Entry)((Iterator)peekStack()).next();
    List localList = this.stack;
    Object localObject2 = ((Map.Entry)localObject1).getValue();
    localList.add(localObject2);
    localList = this.stack;
    localObject2 = new com/google/gson/JsonPrimitive;
    localObject1 = (String)((Map.Entry)localObject1).getKey();
    ((JsonPrimitive)localObject2).<init>((String)localObject1);
    localList.add(localObject2);
  }
  
  public void skipValue()
  {
    JsonToken localJsonToken1 = peek();
    JsonToken localJsonToken2 = JsonToken.NAME;
    if (localJsonToken1 == localJsonToken2) {
      nextName();
    }
    for (;;)
    {
      return;
      popStack();
    }
  }
  
  public String toString()
  {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\JsonTreeReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */