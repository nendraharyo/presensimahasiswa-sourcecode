package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$14
  extends TypeAdapter
{
  public Number read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = TypeAdapters.36.$SwitchMap$com$google$gson$stream$JsonToken;
    int i = ((JsonToken)localObject1).ordinal();
    int j = localObject2[i];
    switch (j)
    {
    default: 
      localObject2 = new com/google/gson/JsonSyntaxException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = "Expecting number, got: " + localObject1;
      ((JsonSyntaxException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    case 4: 
      paramJsonReader.nextNull();
      localObject1 = null;
    }
    for (;;)
    {
      return (Number)localObject1;
      localObject1 = new com/google/gson/internal/LazilyParsedNumber;
      localObject2 = paramJsonReader.nextString();
      ((LazilyParsedNumber)localObject1).<init>((String)localObject2);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber)
  {
    paramJsonWriter.value(paramNumber);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */