package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$19
  extends TypeAdapter
{
  public StringBuilder read(JsonReader paramJsonReader)
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
      return (StringBuilder)localObject1;
      localObject1 = new java/lang/StringBuilder;
      localObject2 = paramJsonReader.nextString();
      ((StringBuilder)localObject1).<init>((String)localObject2);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, StringBuilder paramStringBuilder)
  {
    if (paramStringBuilder == null) {}
    for (String str = null;; str = paramStringBuilder.toString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$19.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */