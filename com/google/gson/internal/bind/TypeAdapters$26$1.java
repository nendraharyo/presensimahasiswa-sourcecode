package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26$1
  extends TypeAdapter
{
  TypeAdapters$26$1(TypeAdapters.26 param26, TypeAdapter paramTypeAdapter) {}
  
  public Timestamp read(JsonReader paramJsonReader)
  {
    Object localObject = (Date)this.val$dateTypeAdapter.read(paramJsonReader);
    Timestamp localTimestamp;
    if (localObject != null)
    {
      localTimestamp = new java/sql/Timestamp;
      long l = ((Date)localObject).getTime();
      localTimestamp.<init>(l);
    }
    for (localObject = localTimestamp;; localObject = null) {
      return (Timestamp)localObject;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Timestamp paramTimestamp)
  {
    this.val$dateTypeAdapter.write(paramJsonWriter, paramTimestamp);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$26$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */