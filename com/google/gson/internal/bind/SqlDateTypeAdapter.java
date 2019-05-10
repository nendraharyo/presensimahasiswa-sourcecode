package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class SqlDateTypeAdapter
  extends TypeAdapter
{
  public static final TypeAdapterFactory FACTORY;
  private final DateFormat format;
  
  static
  {
    SqlDateTypeAdapter.1 local1 = new com/google/gson/internal/bind/SqlDateTypeAdapter$1;
    local1.<init>();
    FACTORY = local1;
  }
  
  public SqlDateTypeAdapter()
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("MMM d, yyyy");
    this.format = localSimpleDateFormat;
  }
  
  /* Error */
  public Date read(com.google.gson.stream.JsonReader paramJsonReader)
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
    //   27: getfield 26	com/google/gson/internal/bind/SqlDateTypeAdapter:format	Ljava/text/DateFormat;
    //   30: astore_2
    //   31: aload_1
    //   32: invokevirtual 49	com/google/gson/stream/JsonReader:nextString	()Ljava/lang/String;
    //   35: astore_3
    //   36: aload_2
    //   37: aload_3
    //   38: invokevirtual 55	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   41: astore_2
    //   42: aload_2
    //   43: invokevirtual 61	java/util/Date:getTime	()J
    //   46: lstore 4
    //   48: new 63	java/sql/Date
    //   51: astore_2
    //   52: aload_2
    //   53: lload 4
    //   55: invokespecial 66	java/sql/Date:<init>	(J)V
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
    //   0	78	0	this	SqlDateTypeAdapter
    //   0	78	1	paramJsonReader	com.google.gson.stream.JsonReader
    //   6	47	2	localObject1	Object
    //   61	7	2	localParseException	java.text.ParseException
    //   73	4	2	localObject2	Object
    //   10	62	3	localObject3	Object
    //   46	8	4	l	long
    // Exception table:
    //   from	to	target	type
    //   26	30	61	java/text/ParseException
    //   31	35	61	java/text/ParseException
    //   37	41	61	java/text/ParseException
    //   42	46	61	java/text/ParseException
    //   48	51	61	java/text/ParseException
    //   53	58	61	java/text/ParseException
    //   2	6	73	finally
    //   7	10	73	finally
    //   16	20	73	finally
    //   26	30	73	finally
    //   31	35	73	finally
    //   37	41	73	finally
    //   42	46	73	finally
    //   48	51	73	finally
    //   53	58	73	finally
    //   62	65	73	finally
    //   67	71	73	finally
    //   71	73	73	finally
  }
  
  public void write(JsonWriter paramJsonWriter, Date paramDate)
  {
    if (paramDate == null) {}
    for (Object localObject1 = null;; localObject1 = ((DateFormat)localObject1).format(paramDate))
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\SqlDateTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */