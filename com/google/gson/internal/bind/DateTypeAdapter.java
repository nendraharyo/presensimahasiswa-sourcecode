package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;

public final class DateTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final DateFormat enUsFormat;
  private final DateFormat localFormat;
  
  static
  {
    DateTypeAdapter.1 local1 = new com/google/gson/internal/bind/DateTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  public DateTypeAdapter()
  {
    Object localObject = Locale.US;
    localObject = DateFormat.getDateTimeInstance(i, i, (Locale)localObject);
    this.enUsFormat = ((DateFormat)localObject);
    localObject = DateFormat.getDateTimeInstance(i, i);
    this.localFormat = ((DateFormat)localObject);
  }
  
  private Date deserializeToDate(String paramString)
  {
    try
    {
      localObject1 = this.localFormat;
      localObject1 = ((DateFormat)localObject1).parse(paramString);
    }
    catch (ParseException localParseException1)
    {
      try
      {
        Object localObject1;
        Object localObject2 = this.enUsFormat;
        localObject2 = ((DateFormat)localObject2).parse(paramString);
      }
      catch (ParseException localParseException2)
      {
        try
        {
          Object localObject3 = new java/text/ParsePosition;
          localJsonSyntaxException = null;
          ((ParsePosition)localObject3).<init>(0);
          localObject3 = ISO8601Utils.parse(paramString, (ParsePosition)localObject3);
        }
        catch (ParseException localParseException3)
        {
          JsonSyntaxException localJsonSyntaxException = new com/google/gson/JsonSyntaxException;
          localJsonSyntaxException.<init>(paramString, localParseException3);
          throw localJsonSyntaxException;
        }
      }
    }
    finally {}
    return (Date)localObject1;
  }
  
  public Date read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    if (localObject == localJsonToken) {
      paramJsonReader.nextNull();
    }
    for (localObject = null;; localObject = deserializeToDate((String)localObject))
    {
      return (Date)localObject;
      localObject = paramJsonReader.nextString();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Date paramDate)
  {
    if (paramDate == null) {}
    for (;;)
    {
      try
      {
        paramJsonWriter.nullValue();
        return;
      }
      finally {}
      Object localObject1 = this.enUsFormat;
      localObject1 = ((DateFormat)localObject1).format(paramDate);
      paramJsonWriter.value((String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\DateTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */