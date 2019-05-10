package com.google.gson;

import com.google.gson.internal.bind.util.ISO8601Utils;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;

final class DefaultDateTypeAdapter
  implements JsonDeserializer, JsonSerializer
{
  private final DateFormat enUsFormat;
  private final DateFormat localFormat;
  
  DefaultDateTypeAdapter()
  {
    this((DateFormat)localObject, localDateFormat);
  }
  
  DefaultDateTypeAdapter(int paramInt)
  {
    this((DateFormat)localObject, localDateFormat);
  }
  
  public DefaultDateTypeAdapter(int paramInt1, int paramInt2)
  {
    this((DateFormat)localObject, localDateFormat);
  }
  
  DefaultDateTypeAdapter(String paramString)
  {
    this(localSimpleDateFormat, (DateFormat)localObject);
  }
  
  DefaultDateTypeAdapter(DateFormat paramDateFormat1, DateFormat paramDateFormat2)
  {
    this.enUsFormat = paramDateFormat1;
    this.localFormat = paramDateFormat2;
  }
  
  private java.util.Date deserializeToDate(JsonElement paramJsonElement)
  {
    for (;;)
    {
      Object localObject5;
      synchronized (this.localFormat)
      {
        try
        {
          Object localObject1 = this.localFormat;
          localObject5 = paramJsonElement.getAsString();
          localObject1 = ((DateFormat)localObject1).parse((String)localObject5);
          return (java.util.Date)localObject1;
        }
        catch (ParseException localParseException1) {}
      }
      try
      {
        Object localObject2 = this.enUsFormat;
        localObject5 = paramJsonElement.getAsString();
        localObject2 = ((DateFormat)localObject2).parse((String)localObject5);
        continue;
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (ParseException localParseException2)
      {
        try
        {
          Object localObject4 = paramJsonElement.getAsString();
          localObject5 = new java/text/ParsePosition;
          str = null;
          ((ParsePosition)localObject5).<init>(0);
          localObject4 = ISO8601Utils.parse((String)localObject4, (ParsePosition)localObject5);
        }
        catch (ParseException localParseException3)
        {
          localObject5 = new com/google/gson/JsonSyntaxException;
          String str = paramJsonElement.getAsString();
          ((JsonSyntaxException)localObject5).<init>(str, localParseException3);
          throw ((Throwable)localObject5);
        }
      }
    }
  }
  
  public java.util.Date deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
  {
    boolean bool = paramJsonElement instanceof JsonPrimitive;
    if (!bool)
    {
      localObject1 = new com/google/gson/JsonParseException;
      ((JsonParseException)localObject1).<init>("The date should be a string value");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = deserializeToDate((JsonElement)paramJsonElement);
    Object localObject2 = java.util.Date.class;
    if (paramType == localObject2) {}
    for (;;)
    {
      return (java.util.Date)localObject1;
      localObject2 = Timestamp.class;
      long l;
      if (paramType == localObject2)
      {
        localObject2 = new java/sql/Timestamp;
        l = ((java.util.Date)localObject1).getTime();
        ((Timestamp)localObject2).<init>(l);
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = java.sql.Date.class;
        if (paramType != localObject2) {
          break;
        }
        localObject2 = new java/sql/Date;
        l = ((java.util.Date)localObject1).getTime();
        ((java.sql.Date)localObject2).<init>(l);
        localObject1 = localObject2;
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Class localClass = getClass();
    localObject2 = localClass + " cannot deserialize to " + paramType;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonElement serialize(java.util.Date paramDate, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    synchronized (this.localFormat)
    {
      Object localObject1 = this.enUsFormat;
      localObject1 = ((DateFormat)localObject1).format(paramDate);
      JsonPrimitive localJsonPrimitive = new com/google/gson/JsonPrimitive;
      localJsonPrimitive.<init>((String)localObject1);
      return localJsonPrimitive;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = DefaultDateTypeAdapter.class.getSimpleName();
    localStringBuilder.append((String)localObject);
    localObject = localStringBuilder.append('(');
    String str = this.localFormat.getClass().getSimpleName();
    ((StringBuilder)localObject).append(str).append(')');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\DefaultDateTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */