package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicLong;

final class Gson$6
  extends TypeAdapter
{
  Gson$6(TypeAdapter paramTypeAdapter) {}
  
  public AtomicLong read(JsonReader paramJsonReader)
  {
    Number localNumber = (Number)this.val$longAdapter.read(paramJsonReader);
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    long l = localNumber.longValue();
    localAtomicLong.<init>(l);
    return localAtomicLong;
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicLong paramAtomicLong)
  {
    TypeAdapter localTypeAdapter = this.val$longAdapter;
    Long localLong = Long.valueOf(paramAtomicLong.get());
    localTypeAdapter.write(paramJsonWriter, localLong);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\Gson$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */