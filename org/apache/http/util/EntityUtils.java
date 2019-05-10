package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

public final class EntityUtils
{
  public static void consume(HttpEntity paramHttpEntity)
  {
    if (paramHttpEntity == null) {}
    for (;;)
    {
      return;
      boolean bool = paramHttpEntity.isStreaming();
      if (bool)
      {
        InputStream localInputStream = paramHttpEntity.getContent();
        if (localInputStream != null) {
          localInputStream.close();
        }
      }
    }
  }
  
  public static void consumeQuietly(HttpEntity paramHttpEntity)
  {
    try
    {
      consume(paramHttpEntity);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static String getContentCharSet(HttpEntity paramHttpEntity)
  {
    Args.notNull(paramHttpEntity, "Entity");
    String str1 = null;
    Object localObject = paramHttpEntity.getContentType();
    if (localObject != null)
    {
      localObject = paramHttpEntity.getContentType().getElements();
      int i = localObject.length;
      if (i > 0)
      {
        i = 0;
        localObject = localObject[0];
        String str2 = "charset";
        localObject = ((HeaderElement)localObject).getParameterByName(str2);
        if (localObject != null) {
          str1 = ((NameValuePair)localObject).getValue();
        }
      }
    }
    return str1;
  }
  
  public static String getContentMimeType(HttpEntity paramHttpEntity)
  {
    Args.notNull(paramHttpEntity, "Entity");
    String str = null;
    Object localObject = paramHttpEntity.getContentType();
    if (localObject != null)
    {
      localObject = paramHttpEntity.getContentType().getElements();
      int i = localObject.length;
      if (i > 0) {
        str = localObject[0].getName();
      }
    }
    return str;
  }
  
  public static byte[] toByteArray(HttpEntity paramHttpEntity)
  {
    int i = 4096;
    boolean bool1 = false;
    ByteArrayBuffer localByteArrayBuffer = null;
    Args.notNull(paramHttpEntity, "Entity");
    InputStream localInputStream = paramHttpEntity.getContent();
    byte[] arrayOfByte1;
    if (localInputStream == null)
    {
      i = 0;
      arrayOfByte1 = null;
      return arrayOfByte1;
    }
    for (;;)
    {
      int j;
      try
      {
        long l1 = paramHttpEntity.getContentLength();
        long l2 = 2147483647L;
        boolean bool2 = l1 < l2;
        if (!bool2) {
          bool1 = true;
        }
        String str = "HTTP entity too large to be buffered in memory";
        Args.check(bool1, str);
        l1 = paramHttpEntity.getContentLength();
        j = (int)l1;
        if (j >= 0) {
          break label165;
        }
        localByteArrayBuffer = new org/apache/http/util/ByteArrayBuffer;
        localByteArrayBuffer.<init>(i);
        i = 4096;
        arrayOfByte1 = new byte[i];
        int k = localInputStream.read(arrayOfByte1);
        int m = -1;
        if (k != m)
        {
          m = 0;
          localByteArrayBuffer.append(arrayOfByte1, 0, k);
          continue;
        }
        byte[] arrayOfByte2 = localByteArrayBuffer.toByteArray();
      }
      finally
      {
        localInputStream.close();
      }
      localInputStream.close();
      break;
      label165:
      i = j;
    }
  }
  
  public static String toString(HttpEntity paramHttpEntity)
  {
    ((Charset)null);
    return toString(paramHttpEntity, null);
  }
  
  public static String toString(HttpEntity paramHttpEntity, String paramString)
  {
    if (paramString != null) {}
    for (Charset localCharset = Charset.forName(paramString);; localCharset = null) {
      return toString(paramHttpEntity, localCharset);
    }
  }
  
  /* Error */
  public static String toString(HttpEntity paramHttpEntity, Charset paramCharset)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: aload_0
    //   8: ldc 31
    //   10: invokestatic 37	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   13: pop
    //   14: aload_0
    //   15: invokeinterface 18 1 0
    //   20: astore 5
    //   22: aload 5
    //   24: ifnonnull +5 -> 29
    //   27: aload_2
    //   28: areturn
    //   29: aload_0
    //   30: invokeinterface 69 1 0
    //   35: lstore 6
    //   37: ldc2_w 70
    //   40: lstore 8
    //   42: lload 6
    //   44: lload 8
    //   46: lcmp
    //   47: istore 10
    //   49: iload 10
    //   51: ifgt +5 -> 56
    //   54: iconst_1
    //   55: istore_3
    //   56: ldc 76
    //   58: astore 11
    //   60: iload_3
    //   61: aload 11
    //   63: invokestatic 80	org/apache/http/util/Args:check	(ZLjava/lang/String;)V
    //   66: aload_0
    //   67: invokeinterface 69 1 0
    //   72: lstore 6
    //   74: lload 6
    //   76: l2i
    //   77: istore_3
    //   78: iload_3
    //   79: ifge +7 -> 86
    //   82: sipush 4096
    //   85: istore_3
    //   86: aload_0
    //   87: invokestatic 113	org/apache/http/entity/ContentType:get	(Lorg/apache/http/HttpEntity;)Lorg/apache/http/entity/ContentType;
    //   90: astore 11
    //   92: aload 11
    //   94: ifnull +9 -> 103
    //   97: aload 11
    //   99: invokevirtual 117	org/apache/http/entity/ContentType:getCharset	()Ljava/nio/charset/Charset;
    //   102: astore_2
    //   103: aload_2
    //   104: ifnonnull +5 -> 109
    //   107: aload_1
    //   108: astore_2
    //   109: aload_2
    //   110: ifnonnull +7 -> 117
    //   113: getstatic 123	org/apache/http/protocol/HTTP:DEF_CONTENT_CHARSET	Ljava/nio/charset/Charset;
    //   116: astore_2
    //   117: new 125	java/io/InputStreamReader
    //   120: astore 11
    //   122: aload 11
    //   124: aload 5
    //   126: aload_2
    //   127: invokespecial 128	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   130: new 130	org/apache/http/util/CharArrayBuffer
    //   133: astore_2
    //   134: aload_2
    //   135: iload_3
    //   136: invokespecial 131	org/apache/http/util/CharArrayBuffer:<init>	(I)V
    //   139: sipush 1024
    //   142: istore_3
    //   143: iload_3
    //   144: newarray <illegal type>
    //   146: astore 4
    //   148: aload 11
    //   150: aload 4
    //   152: invokevirtual 137	java/io/Reader:read	([C)I
    //   155: istore 12
    //   157: iconst_m1
    //   158: istore 13
    //   160: iload 12
    //   162: iload 13
    //   164: if_icmpeq +49 -> 213
    //   167: iconst_0
    //   168: istore 13
    //   170: aload_2
    //   171: aload 4
    //   173: iconst_0
    //   174: iload 12
    //   176: invokevirtual 140	org/apache/http/util/CharArrayBuffer:append	([CII)V
    //   179: goto -31 -> 148
    //   182: astore 4
    //   184: aload 5
    //   186: invokevirtual 23	java/io/InputStream:close	()V
    //   189: aload 4
    //   191: athrow
    //   192: astore 4
    //   194: new 142	java/io/UnsupportedEncodingException
    //   197: astore_2
    //   198: aload 4
    //   200: invokevirtual 147	java/nio/charset/UnsupportedCharsetException:getMessage	()Ljava/lang/String;
    //   203: astore 4
    //   205: aload_2
    //   206: aload 4
    //   208: invokespecial 150	java/io/UnsupportedEncodingException:<init>	(Ljava/lang/String;)V
    //   211: aload_2
    //   212: athrow
    //   213: aload_2
    //   214: invokevirtual 152	org/apache/http/util/CharArrayBuffer:toString	()Ljava/lang/String;
    //   217: astore_2
    //   218: aload 5
    //   220: invokevirtual 23	java/io/InputStream:close	()V
    //   223: goto -196 -> 27
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	paramHttpEntity	HttpEntity
    //   0	226	1	paramCharset	Charset
    //   1	217	2	localObject1	Object
    //   3	58	3	bool1	boolean
    //   77	67	3	i	int
    //   5	167	4	arrayOfChar	char[]
    //   182	8	4	localObject2	Object
    //   192	7	4	localUnsupportedCharsetException	java.nio.charset.UnsupportedCharsetException
    //   203	4	4	str	String
    //   20	199	5	localInputStream	InputStream
    //   35	40	6	l1	long
    //   40	5	8	l2	long
    //   47	3	10	bool2	boolean
    //   58	91	11	localObject3	Object
    //   155	20	12	j	int
    //   158	11	13	k	int
    // Exception table:
    //   from	to	target	type
    //   29	35	182	finally
    //   61	66	182	finally
    //   66	72	182	finally
    //   86	90	182	finally
    //   97	102	182	finally
    //   113	116	182	finally
    //   117	120	182	finally
    //   126	130	182	finally
    //   130	133	182	finally
    //   135	139	182	finally
    //   143	146	182	finally
    //   150	155	182	finally
    //   174	179	182	finally
    //   194	197	182	finally
    //   198	203	182	finally
    //   206	211	182	finally
    //   211	213	182	finally
    //   213	217	182	finally
    //   86	90	192	java/nio/charset/UnsupportedCharsetException
    //   97	102	192	java/nio/charset/UnsupportedCharsetException
  }
  
  public static void updateEntity(HttpResponse paramHttpResponse, HttpEntity paramHttpEntity)
  {
    Args.notNull(paramHttpResponse, "Response");
    consume(paramHttpResponse.getEntity());
    paramHttpResponse.setEntity(paramHttpEntity);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\EntityUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */