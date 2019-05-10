package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$12
  extends TypeAdapter
{
  public Number read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    float f;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      f = 0.0F;
    }
    for (localObject = null;; localObject = Float.valueOf(f))
    {
      return (Number)localObject;
      double d = paramJsonReader.nextDouble();
      f = (float)d;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber)
  {
    paramJsonWriter.value(paramNumber);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$12.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */