package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class TypeAdapters$27
  extends TypeAdapter
{
  private static final String DAY_OF_MONTH = "dayOfMonth";
  private static final String HOUR_OF_DAY = "hourOfDay";
  private static final String MINUTE = "minute";
  private static final String MONTH = "month";
  private static final String SECOND = "second";
  private static final String YEAR = "year";
  
  public Calendar read(JsonReader paramJsonReader)
  {
    int i = 0;
    Object localObject1 = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    int j;
    if (localObject1 == localJsonToken)
    {
      paramJsonReader.nextNull();
      j = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Calendar)localObject1;
      paramJsonReader.beginObject();
      int k = 0;
      int m = 0;
      int n = 0;
      int i1 = 0;
      int i2 = 0;
      localJsonToken = null;
      for (;;)
      {
        localObject1 = paramJsonReader.peek();
        Object localObject2 = JsonToken.END_OBJECT;
        if (localObject1 == localObject2) {
          break;
        }
        localObject2 = paramJsonReader.nextName();
        j = paramJsonReader.nextInt();
        String str = "year";
        boolean bool1 = str.equals(localObject2);
        if (bool1)
        {
          i2 = j;
        }
        else
        {
          str = "month";
          bool1 = str.equals(localObject2);
          if (bool1)
          {
            i1 = j;
          }
          else
          {
            str = "dayOfMonth";
            bool1 = str.equals(localObject2);
            if (bool1)
            {
              n = j;
            }
            else
            {
              str = "hourOfDay";
              bool1 = str.equals(localObject2);
              if (bool1)
              {
                m = j;
              }
              else
              {
                str = "minute";
                bool1 = str.equals(localObject2);
                if (bool1)
                {
                  k = j;
                }
                else
                {
                  str = "second";
                  boolean bool2 = str.equals(localObject2);
                  if (bool2) {
                    i = j;
                  }
                }
              }
            }
          }
        }
      }
      paramJsonReader.endObject();
      localObject1 = new java/util/GregorianCalendar;
      ((GregorianCalendar)localObject1).<init>(i2, i1, n, m, k, i);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Calendar paramCalendar)
  {
    if (paramCalendar == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginObject();
      paramJsonWriter.name("year");
      long l = paramCalendar.get(1);
      paramJsonWriter.value(l);
      paramJsonWriter.name("month");
      l = paramCalendar.get(2);
      paramJsonWriter.value(l);
      paramJsonWriter.name("dayOfMonth");
      l = paramCalendar.get(5);
      paramJsonWriter.value(l);
      paramJsonWriter.name("hourOfDay");
      l = paramCalendar.get(11);
      paramJsonWriter.value(l);
      paramJsonWriter.name("minute");
      l = paramCalendar.get(12);
      paramJsonWriter.value(l);
      String str = "second";
      paramJsonWriter.name(str);
      int i = paramCalendar.get(13);
      l = i;
      paramJsonWriter.value(l);
      paramJsonWriter.endObject();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$27.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */