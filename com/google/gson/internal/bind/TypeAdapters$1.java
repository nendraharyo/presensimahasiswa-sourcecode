package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$1
  extends TypeAdapter
{
  public Class read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      return null;
    }
    localObject = new java/lang/UnsupportedOperationException;
    ((UnsupportedOperationException)localObject).<init>("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    throw ((Throwable)localObject);
  }
  
  public void write(JsonWriter paramJsonWriter, Class paramClass)
  {
    if (paramClass == null)
    {
      paramJsonWriter.nullValue();
      return;
    }
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Attempted to serialize java.lang.Class: ");
    String str = paramClass.getName();
    localObject = str + ". Forgot to register a type adapter?";
    localUnsupportedOperationException.<init>((String)localObject);
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */