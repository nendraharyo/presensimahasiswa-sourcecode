package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.math.BigDecimal;

final class TypeAdapters$17
  extends TypeAdapter
{
  public BigDecimal read(JsonReader paramJsonReader)
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
      return (BigDecimal)localObject1;
      try
      {
        localObject1 = new java/math/BigDecimal;
        localObject2 = paramJsonReader.nextString();
        ((BigDecimal)localObject1).<init>((String)localObject2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject2 = new com/google/gson/JsonSyntaxException;
        ((JsonSyntaxException)localObject2).<init>(localNumberFormatException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, BigDecimal paramBigDecimal)
  {
    paramJsonWriter.value(paramBigDecimal);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$17.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */