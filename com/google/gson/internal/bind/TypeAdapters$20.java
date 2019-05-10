package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$20
  extends TypeAdapter
{
  public StringBuffer read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      localObject1 = null;
    }
    for (;;)
    {
      return (StringBuffer)localObject1;
      localObject1 = new java/lang/StringBuffer;
      localObject2 = paramJsonReader.nextString();
      ((StringBuffer)localObject1).<init>((String)localObject2);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, StringBuffer paramStringBuffer)
  {
    if (paramStringBuffer == null) {}
    for (String str = null;; str = paramStringBuffer.toString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$20.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */