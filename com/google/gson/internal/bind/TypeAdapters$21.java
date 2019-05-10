package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.URL;

final class TypeAdapters$21
  extends TypeAdapter
{
  public URL read(JsonReader paramJsonReader)
  {
    URL localURL = null;
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    if (localObject1 == localObject2) {
      paramJsonReader.nextNull();
    }
    for (;;)
    {
      return localURL;
      localObject1 = paramJsonReader.nextString();
      localObject2 = "null";
      boolean bool = ((String)localObject2).equals(localObject1);
      if (!bool)
      {
        localURL = new java/net/URL;
        localURL.<init>((String)localObject1);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, URL paramURL)
  {
    if (paramURL == null) {}
    for (String str = null;; str = paramURL.toExternalForm())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$21.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */