package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicInteger;

final class TypeAdapters$8
  extends TypeAdapter
{
  public AtomicInteger read(JsonReader paramJsonReader)
  {
    try
    {
      AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
      int i = paramJsonReader.nextInt();
      localAtomicInteger.<init>(i);
      return localAtomicInteger;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      JsonSyntaxException localJsonSyntaxException = new com/google/gson/JsonSyntaxException;
      localJsonSyntaxException.<init>(localNumberFormatException);
      throw localJsonSyntaxException;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicInteger paramAtomicInteger)
  {
    long l = paramAtomicInteger.get();
    paramJsonWriter.value(l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */