package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonStreamParser
  implements Iterator
{
  private final Object lock;
  private final JsonReader parser;
  
  public JsonStreamParser(Reader paramReader)
  {
    Object localObject = new com/google/gson/stream/JsonReader;
    ((JsonReader)localObject).<init>(paramReader);
    this.parser = ((JsonReader)localObject);
    this.parser.setLenient(true);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.lock = localObject;
  }
  
  public JsonStreamParser(String paramString)
  {
    this(localStringReader);
  }
  
  /* Error */
  public boolean hasNext()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	com/google/gson/JsonStreamParser:lock	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 21	com/google/gson/JsonStreamParser:parser	Lcom/google/gson/stream/JsonReader;
    //   11: astore_2
    //   12: aload_2
    //   13: invokevirtual 38	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   16: astore_2
    //   17: getstatic 44	com/google/gson/stream/JsonToken:END_DOCUMENT	Lcom/google/gson/stream/JsonToken;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: if_acmpeq +11 -> 34
    //   26: iconst_1
    //   27: istore 4
    //   29: aload_1
    //   30: monitorexit
    //   31: iload 4
    //   33: ireturn
    //   34: iconst_0
    //   35: istore 4
    //   37: aconst_null
    //   38: astore_2
    //   39: goto -10 -> 29
    //   42: astore_2
    //   43: new 46	com/google/gson/JsonSyntaxException
    //   46: astore_3
    //   47: aload_3
    //   48: aload_2
    //   49: invokespecial 49	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   52: aload_3
    //   53: athrow
    //   54: astore_2
    //   55: aload_1
    //   56: monitorexit
    //   57: aload_2
    //   58: athrow
    //   59: astore_2
    //   60: new 51	com/google/gson/JsonIOException
    //   63: astore_3
    //   64: aload_3
    //   65: aload_2
    //   66: invokespecial 52	com/google/gson/JsonIOException:<init>	(Ljava/lang/Throwable;)V
    //   69: aload_3
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	JsonStreamParser
    //   11	28	2	localObject2	Object
    //   42	7	2	localMalformedJsonException	com.google.gson.stream.MalformedJsonException
    //   54	4	2	localObject3	Object
    //   59	7	2	localIOException	java.io.IOException
    //   20	50	3	localObject4	Object
    //   27	9	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   7	11	42	com/google/gson/stream/MalformedJsonException
    //   12	16	42	com/google/gson/stream/MalformedJsonException
    //   17	20	42	com/google/gson/stream/MalformedJsonException
    //   7	11	54	finally
    //   12	16	54	finally
    //   17	20	54	finally
    //   29	31	54	finally
    //   43	46	54	finally
    //   48	52	54	finally
    //   52	54	54	finally
    //   55	57	54	finally
    //   60	63	54	finally
    //   65	69	54	finally
    //   69	71	54	finally
    //   7	11	59	java/io/IOException
    //   12	16	59	java/io/IOException
    //   17	20	59	java/io/IOException
  }
  
  public JsonElement next()
  {
    boolean bool1 = hasNext();
    Object localObject1;
    if (!bool1)
    {
      localObject1 = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = this.parser;
      return Streams.parse((JsonReader)localObject1);
    }
    catch (StackOverflowError localStackOverflowError)
    {
      localObject2 = new com/google/gson/JsonParseException;
      ((JsonParseException)localObject2).<init>("Failed parsing JSON source to Json", localStackOverflowError);
      throw ((Throwable)localObject2);
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      localObject2 = new com/google/gson/JsonParseException;
      ((JsonParseException)localObject2).<init>("Failed parsing JSON source to Json", localOutOfMemoryError);
      throw ((Throwable)localObject2);
    }
    catch (JsonParseException localJsonParseException)
    {
      Object localObject2 = localJsonParseException.getCause();
      boolean bool2 = localObject2 instanceof EOFException;
      NoSuchElementException localNoSuchElementException;
      if (bool2)
      {
        localNoSuchElementException = new java/util/NoSuchElementException;
        localNoSuchElementException.<init>();
      }
      throw localNoSuchElementException;
    }
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\JsonStreamParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */