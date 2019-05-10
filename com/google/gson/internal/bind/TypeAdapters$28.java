package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Locale;
import java.util.StringTokenizer;

final class TypeAdapters$28
  extends TypeAdapter
{
  public Locale read(JsonReader paramJsonReader)
  {
    Object localObject1 = null;
    Object localObject2 = paramJsonReader.peek();
    Object localObject3 = JsonToken.NULL;
    if (localObject2 == localObject3)
    {
      paramJsonReader.nextNull();
      return (Locale)localObject1;
    }
    localObject2 = paramJsonReader.nextString();
    Object localObject4 = new java/util/StringTokenizer;
    localObject3 = "_";
    ((StringTokenizer)localObject4).<init>((String)localObject2, (String)localObject3);
    boolean bool1 = ((StringTokenizer)localObject4).hasMoreElements();
    if (bool1) {}
    for (localObject2 = ((StringTokenizer)localObject4).nextToken();; localObject2 = null)
    {
      boolean bool2 = ((StringTokenizer)localObject4).hasMoreElements();
      if (bool2) {}
      for (localObject3 = ((StringTokenizer)localObject4).nextToken();; localObject3 = null)
      {
        boolean bool3 = ((StringTokenizer)localObject4).hasMoreElements();
        if (bool3) {
          localObject1 = ((StringTokenizer)localObject4).nextToken();
        }
        for (localObject4 = localObject1;; localObject4 = null)
        {
          if ((localObject3 == null) && (localObject4 == null))
          {
            localObject1 = new java/util/Locale;
            ((Locale)localObject1).<init>((String)localObject2);
            break;
          }
          if (localObject4 == null)
          {
            localObject1 = new java/util/Locale;
            ((Locale)localObject1).<init>((String)localObject2, (String)localObject3);
            break;
          }
          localObject1 = new java/util/Locale;
          ((Locale)localObject1).<init>((String)localObject2, (String)localObject3, (String)localObject4);
          break;
        }
        bool2 = false;
      }
      bool1 = false;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Locale paramLocale)
  {
    if (paramLocale == null) {}
    for (String str = null;; str = paramLocale.toString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$28.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */