package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final DateFormat format;
  
  static
  {
    TimeTypeAdapter.1 local1 = new com/google/gson/internal/bind/TimeTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  public TimeTypeAdapter()
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("hh:mm:ss a");
    this.format = localSimpleDateFormat;
  }
  
  /* Error */
  public Time read(com.google.gson.stream.JsonReader paramJsonReader)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual 36	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   6: astore_2
    //   7: getstatic 42	com/google/gson/stream/JsonToken:NULL	Lcom/google/gson/stream/JsonToken;
    //   10: astore_3
    //   11: aload_2
    //   12: aload_3
    //   13: if_acmpne +13 -> 26
    //   16: aload_1
    //   17: invokevirtual 45	com/google/gson/stream/JsonReader:nextNull	()V
    //   20: aconst_null
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: areturn
    //   26: aload_0
    //   27: getfield 26	com/google/gson/internal/bind/TimeTypeAdapter:format	Ljava/text/DateFormat;
    //   30: astore_2
    //   31: aload_1
    //   32: invokevirtual 49	com/google/gson/stream/JsonReader:nextString	()Ljava/lang/String;
    //   35: astore_3
    //   36: aload_2
    //   37: aload_3
    //   38: invokevirtual 55	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   41: astore_3
    //   42: new 57	java/sql/Time
    //   45: astore_2
    //   46: aload_3
    //   47: invokevirtual 63	java/util/Date:getTime	()J
    //   50: lstore 4
    //   52: aload_2
    //   53: lload 4
    //   55: invokespecial 66	java/sql/Time:<init>	(J)V
    //   58: goto -36 -> 22
    //   61: astore_2
    //   62: new 68	com/google/gson/JsonSyntaxException
    //   65: astore_3
    //   66: aload_3
    //   67: aload_2
    //   68: invokespecial 71	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   71: aload_3
    //   72: athrow
    //   73: astore_2
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_2
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	TimeTypeAdapter
    //   0	78	1	paramJsonReader	com.google.gson.stream.JsonReader
    //   6	47	2	localObject1	Object
    //   61	7	2	localParseException	java.text.ParseException
    //   73	4	2	localObject2	Object
    //   10	62	3	localObject3	Object
    //   50	4	4	l	long
    // Exception table:
    //   from	to	target	type
    //   26	30	61	java/text/ParseException
    //   31	35	61	java/text/ParseException
    //   37	41	61	java/text/ParseException
    //   42	45	61	java/text/ParseException
    //   46	50	61	java/text/ParseException
    //   53	58	61	java/text/ParseException
    //   2	6	73	finally
    //   7	10	73	finally
    //   16	20	73	finally
    //   26	30	73	finally
    //   31	35	73	finally
    //   37	41	73	finally
    //   42	45	73	finally
    //   46	50	73	finally
    //   53	58	73	finally
    //   62	65	73	finally
    //   67	71	73	finally
    //   71	73	73	finally
  }
  
  public void write(JsonWriter paramJsonWriter, Time paramTime)
  {
    if (paramTime == null) {}
    for (Object localObject1 = null;; localObject1 = ((DateFormat)localObject1).format(paramTime))
    {
      try
      {
        paramJsonWriter.value((String)localObject1);
        return;
      }
      finally {}
      localObject1 = this.format;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TimeTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */