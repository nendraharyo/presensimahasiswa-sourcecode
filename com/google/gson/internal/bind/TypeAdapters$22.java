package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.URI;
import java.net.URISyntaxException;

final class TypeAdapters$22
  extends TypeAdapter
{
  public URI read(JsonReader paramJsonReader)
  {
    URI localURI = null;
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    if (localObject1 == localObject2) {
      paramJsonReader.nextNull();
    }
    for (;;)
    {
      return localURI;
      try
      {
        localObject1 = paramJsonReader.nextString();
        localObject2 = "null";
        boolean bool = ((String)localObject2).equals(localObject1);
        if (bool) {
          continue;
        }
        localURI = new java/net/URI;
        localURI.<init>((String)localObject1);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        localObject1 = new com/google/gson/JsonIOException;
        ((JsonIOException)localObject1).<init>(localURISyntaxException);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, URI paramURI)
  {
    if (paramURI == null) {}
    for (String str = null;; str = paramURI.toASCIIString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$22.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */