package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

final class TypeAdapters$10
  extends TypeAdapter
{
  public AtomicIntegerArray read(JsonReader paramJsonReader)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramJsonReader.beginArray();
    for (;;)
    {
      boolean bool = paramJsonReader.hasNext();
      if (bool) {
        try
        {
          i = paramJsonReader.nextInt();
          Integer localInteger1 = Integer.valueOf(i);
          localArrayList.add(localInteger1);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          localJsonSyntaxException = new com/google/gson/JsonSyntaxException;
          localJsonSyntaxException.<init>(localNumberFormatException);
          throw localJsonSyntaxException;
        }
      }
    }
    paramJsonReader.endArray();
    int j = localArrayList.size();
    AtomicIntegerArray localAtomicIntegerArray = new java/util/concurrent/atomic/AtomicIntegerArray;
    localAtomicIntegerArray.<init>(j);
    int i = 0;
    Integer localInteger2 = null;
    int k = 0;
    JsonSyntaxException localJsonSyntaxException = null;
    while (k < j)
    {
      localInteger2 = (Integer)localArrayList.get(k);
      i = localInteger2.intValue();
      localAtomicIntegerArray.set(k, i);
      i = k + 1;
      k = i;
    }
    return localAtomicIntegerArray;
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicIntegerArray paramAtomicIntegerArray)
  {
    paramJsonWriter.beginArray();
    int i = 0;
    int j = paramAtomicIntegerArray.length();
    while (i < j)
    {
      int k = paramAtomicIntegerArray.get(i);
      long l = k;
      paramJsonWriter.value(l);
      i += 1;
    }
    paramJsonWriter.endArray();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */