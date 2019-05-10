package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.UUID;

final class TypeAdapters$24
  extends TypeAdapter
{
  public UUID read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken) {
      paramJsonReader.nextNull();
    }
    for (localObject = null;; localObject = UUID.fromString(paramJsonReader.nextString())) {
      return (UUID)localObject;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, UUID paramUUID)
  {
    if (paramUUID == null) {}
    for (String str = null;; str = paramUUID.toString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$24.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */