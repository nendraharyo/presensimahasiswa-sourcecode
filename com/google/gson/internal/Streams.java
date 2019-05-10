package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams
{
  private Streams()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static JsonElement parse(JsonReader paramJsonReader)
  {
    i = 1;
    try
    {
      paramJsonReader.peek();
      i = 0;
      localObject1 = null;
      localObject2 = TypeAdapters.JSON_ELEMENT;
      localObject2 = ((TypeAdapter)localObject2).read(paramJsonReader);
      localObject2 = (JsonElement)localObject2;
    }
    catch (EOFException localEOFException)
    {
      Object localObject2;
      JsonNull localJsonNull;
      while (i != 0) {
        localJsonNull = JsonNull.INSTANCE;
      }
      localObject1 = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject1).<init>(localJsonNull);
      throw ((Throwable)localObject1);
    }
    catch (MalformedJsonException localMalformedJsonException)
    {
      localObject1 = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject1).<init>(localMalformedJsonException);
      throw ((Throwable)localObject1);
    }
    catch (IOException localIOException)
    {
      localObject1 = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject1).<init>(localIOException);
      throw ((Throwable)localObject1);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Object localObject1 = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject1).<init>(localNumberFormatException);
      throw ((Throwable)localObject1);
    }
    return (JsonElement)localObject2;
  }
  
  public static void write(JsonElement paramJsonElement, JsonWriter paramJsonWriter)
  {
    TypeAdapters.JSON_ELEMENT.write(paramJsonWriter, paramJsonElement);
  }
  
  public static Writer writerForAppendable(Appendable paramAppendable)
  {
    boolean bool = paramAppendable instanceof Writer;
    if (bool) {}
    Streams.AppendableWriter localAppendableWriter;
    for (paramAppendable = (Writer)paramAppendable;; paramAppendable = localAppendableWriter)
    {
      return paramAppendable;
      localAppendableWriter = new com/google/gson/internal/Streams$AppendableWriter;
      localAppendableWriter.<init>(paramAppendable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\Streams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */