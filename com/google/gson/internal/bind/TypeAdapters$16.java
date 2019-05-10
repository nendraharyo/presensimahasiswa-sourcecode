package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$16
  extends TypeAdapter
{
  public String read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    boolean bool;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (String)localObject;
      localJsonToken = JsonToken.BOOLEAN;
      if (localObject == localJsonToken)
      {
        bool = paramJsonReader.nextBoolean();
        localObject = Boolean.toString(bool);
      }
      else
      {
        localObject = paramJsonReader.nextString();
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, String paramString)
  {
    paramJsonWriter.value(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */