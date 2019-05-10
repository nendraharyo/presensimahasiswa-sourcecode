package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$15
  extends TypeAdapter
{
  public Character read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    char c;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      c = '\000';
    }
    for (localObject1 = null;; localObject1 = Character.valueOf(c))
    {
      return (Character)localObject1;
      localObject1 = paramJsonReader.nextString();
      int i = ((String)localObject1).length();
      int j = 1;
      if (i != j)
      {
        localObject2 = new com/google/gson/JsonSyntaxException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject1 = "Expecting character, got: " + (String)localObject1;
        ((JsonSyntaxException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      i = 0;
      localObject2 = null;
      c = ((String)localObject1).charAt(0);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Character paramCharacter)
  {
    if (paramCharacter == null) {}
    for (String str = null;; str = String.valueOf(paramCharacter))
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */