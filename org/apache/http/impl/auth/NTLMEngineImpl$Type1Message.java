package org.apache.http.impl.auth;

class NTLMEngineImpl$Type1Message
  extends NTLMEngineImpl.NTLMMessage
{
  protected byte[] domainBytes;
  protected byte[] hostBytes;
  
  /* Error */
  NTLMEngineImpl$Type1Message(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokespecial 11	org/apache/http/impl/auth/NTLMEngineImpl$NTLMMessage:<init>	()V
    //   6: aload_2
    //   7: invokestatic 17	org/apache/http/impl/auth/NTLMEngineImpl:access$1400	(Ljava/lang/String;)Ljava/lang/String;
    //   10: astore 4
    //   12: aload_1
    //   13: invokestatic 20	org/apache/http/impl/auth/NTLMEngineImpl:access$1500	(Ljava/lang/String;)Ljava/lang/String;
    //   16: astore 5
    //   18: aload 4
    //   20: ifnull +55 -> 75
    //   23: ldc 22
    //   25: astore 6
    //   27: aload 4
    //   29: aload 6
    //   31: invokevirtual 28	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   34: astore 4
    //   36: aload_0
    //   37: aload 4
    //   39: putfield 30	org/apache/http/impl/auth/NTLMEngineImpl$Type1Message:hostBytes	[B
    //   42: aload 5
    //   44: ifnull +25 -> 69
    //   47: getstatic 36	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   50: astore_3
    //   51: aload 5
    //   53: aload_3
    //   54: invokevirtual 40	java/lang/String:toUpperCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   57: astore_3
    //   58: ldc 22
    //   60: astore 4
    //   62: aload_3
    //   63: aload 4
    //   65: invokevirtual 28	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   68: astore_3
    //   69: aload_0
    //   70: aload_3
    //   71: putfield 42	org/apache/http/impl/auth/NTLMEngineImpl$Type1Message:domainBytes	[B
    //   74: return
    //   75: aconst_null
    //   76: astore 4
    //   78: goto -42 -> 36
    //   81: astore_3
    //   82: new 44	org/apache/http/impl/auth/NTLMEngineException
    //   85: astore 4
    //   87: new 46	java/lang/StringBuilder
    //   90: astore 5
    //   92: aload 5
    //   94: invokespecial 47	java/lang/StringBuilder:<init>	()V
    //   97: aload 5
    //   99: ldc 49
    //   101: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: astore 5
    //   106: aload_3
    //   107: invokevirtual 59	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   110: astore 6
    //   112: aload 5
    //   114: aload 6
    //   116: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: astore 5
    //   124: aload 4
    //   126: aload 5
    //   128: aload_3
    //   129: invokespecial 65	org/apache/http/impl/auth/NTLMEngineException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: aload 4
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	Type1Message
    //   0	135	1	paramString1	String
    //   0	135	2	paramString2	String
    //   1	70	3	localObject1	Object
    //   81	48	3	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   10	123	4	localObject2	Object
    //   16	111	5	localObject3	Object
    //   25	90	6	str	String
    // Exception table:
    //   from	to	target	type
    //   6	10	81	java/io/UnsupportedEncodingException
    //   12	16	81	java/io/UnsupportedEncodingException
    //   29	34	81	java/io/UnsupportedEncodingException
    //   37	42	81	java/io/UnsupportedEncodingException
    //   47	50	81	java/io/UnsupportedEncodingException
    //   53	57	81	java/io/UnsupportedEncodingException
    //   63	68	81	java/io/UnsupportedEncodingException
    //   70	74	81	java/io/UnsupportedEncodingException
  }
  
  String getResponse()
  {
    int i = 40;
    prepareResponse(i, 1);
    addULong(-1576500735);
    addUShort(0);
    addUShort(0);
    addULong(i);
    addUShort(0);
    addUShort(0);
    addULong(i);
    addUShort(261);
    addULong(2600);
    addUShort(3840);
    return super.getResponse();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMEngineImpl$Type1Message.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */