package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$6
  extends TypeAdapter
{
  public Number read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    short s;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      s = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Number)localObject1;
      try
      {
        s = (short)paramJsonReader.nextInt();
        localObject1 = Short.valueOf(s);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject2 = new com/google/gson/JsonSyntaxException;
        ((JsonSyntaxException)localObject2).<init>(localNumberFormatException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber)
  {
    paramJsonWriter.value(paramNumber);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */