package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicBoolean;

final class TypeAdapters$9
  extends TypeAdapter
{
  public AtomicBoolean read(JsonReader paramJsonReader)
  {
    AtomicBoolean localAtomicBoolean = new java/util/concurrent/atomic/AtomicBoolean;
    boolean bool = paramJsonReader.nextBoolean();
    localAtomicBoolean.<init>(bool);
    return localAtomicBoolean;
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicBoolean paramAtomicBoolean)
  {
    boolean bool = paramAtomicBoolean.get();
    paramJsonWriter.value(bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */