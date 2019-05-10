package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;

final class Gson$7
  extends TypeAdapter
{
  Gson$7(TypeAdapter paramTypeAdapter) {}
  
  public AtomicLongArray read(JsonReader paramJsonReader)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramJsonReader.beginArray();
    for (;;)
    {
      bool = paramJsonReader.hasNext();
      if (!bool) {
        break;
      }
      long l1 = ((Number)this.val$longAdapter.read(paramJsonReader)).longValue();
      localLong = Long.valueOf(l1);
      localArrayList.add(localLong);
    }
    paramJsonReader.endArray();
    int j = localArrayList.size();
    AtomicLongArray localAtomicLongArray = new java/util/concurrent/atomic/AtomicLongArray;
    localAtomicLongArray.<init>(j);
    boolean bool = false;
    Long localLong = null;
    int i;
    for (int k = 0; k < j; k = i)
    {
      localLong = (Long)localArrayList.get(k);
      long l2 = localLong.longValue();
      localAtomicLongArray.set(k, l2);
      i = k + 1;
    }
    return localAtomicLongArray;
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicLongArray paramAtomicLongArray)
  {
    paramJsonWriter.beginArray();
    int i = 0;
    int j = paramAtomicLongArray.length();
    while (i < j)
    {
      TypeAdapter localTypeAdapter = this.val$longAdapter;
      long l = paramAtomicLongArray.get(i);
      Long localLong = Long.valueOf(l);
      localTypeAdapter.write(paramJsonWriter, localLong);
      i += 1;
    }
    paramJsonWriter.endArray();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\Gson$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */