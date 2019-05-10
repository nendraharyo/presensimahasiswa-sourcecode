package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;

class LoggingInputStream
  extends InputStream
{
  private final InputStream in;
  private final Wire wire;
  
  public LoggingInputStream(InputStream paramInputStream, Wire paramWire)
  {
    this.in = paramInputStream;
    this.wire = paramWire;
  }
  
  public int available()
  {
    try
    {
      InputStream localInputStream = this.in;
      return localInputStream.available();
    }
    catch (IOException localIOException)
    {
      Wire localWire = this.wire;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("[available] I/O error : ");
      String str = localIOException.getMessage();
      localObject = str;
      localWire.input((String)localObject);
      throw localIOException;
    }
  }
  
  public void close()
  {
    try
    {
      InputStream localInputStream = this.in;
      localInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      Wire localWire = this.wire;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("[close] I/O error: ");
      String str = localIOException.getMessage();
      localObject = str;
      localWire.input((String)localObject);
      throw localIOException;
    }
  }
  
  public void mark(int paramInt)
  {
    super.mark(paramInt);
  }
  
  public boolean markSupported()
  {
    return false;
  }
  
  /* Error */
  public int read()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	org/apache/http/impl/conn/LoggingInputStream:in	Ljava/io/InputStream;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual 56	java/io/InputStream:read	()I
    //   9: istore_2
    //   10: iconst_m1
    //   11: istore_3
    //   12: iload_2
    //   13: iload_3
    //   14: if_icmpne +22 -> 36
    //   17: aload_0
    //   18: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   21: astore 4
    //   23: ldc 58
    //   25: astore 5
    //   27: aload 4
    //   29: aload 5
    //   31: invokevirtual 44	org/apache/http/impl/conn/Wire:input	(Ljava/lang/String;)V
    //   34: iload_2
    //   35: ireturn
    //   36: aload_0
    //   37: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   40: astore 4
    //   42: aload 4
    //   44: iload_2
    //   45: invokevirtual 60	org/apache/http/impl/conn/Wire:input	(I)V
    //   48: goto -14 -> 34
    //   51: astore_1
    //   52: aload_0
    //   53: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   56: astore 4
    //   58: new 22	java/lang/StringBuilder
    //   61: astore 5
    //   63: aload 5
    //   65: invokespecial 23	java/lang/StringBuilder:<init>	()V
    //   68: aload 5
    //   70: ldc 62
    //   72: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: astore 5
    //   77: aload_1
    //   78: invokevirtual 35	java/io/IOException:getMessage	()Ljava/lang/String;
    //   81: astore 6
    //   83: aload 5
    //   85: aload 6
    //   87: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: astore 5
    //   95: aload 4
    //   97: aload 5
    //   99: invokevirtual 44	org/apache/http/impl/conn/Wire:input	(Ljava/lang/String;)V
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	LoggingInputStream
    //   4	2	1	localInputStream	InputStream
    //   51	52	1	localIOException	IOException
    //   9	36	2	i	int
    //   11	4	3	j	int
    //   21	75	4	localWire	Wire
    //   25	73	5	localObject	Object
    //   81	5	6	str	String
    // Exception table:
    //   from	to	target	type
    //   0	4	51	java/io/IOException
    //   5	9	51	java/io/IOException
    //   17	21	51	java/io/IOException
    //   29	34	51	java/io/IOException
    //   36	40	51	java/io/IOException
    //   44	48	51	java/io/IOException
  }
  
  /* Error */
  public int read(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	org/apache/http/impl/conn/LoggingInputStream:in	Ljava/io/InputStream;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: invokevirtual 65	java/io/InputStream:read	([B)I
    //   10: istore_3
    //   11: iconst_m1
    //   12: istore 4
    //   14: iload_3
    //   15: iload 4
    //   17: if_icmpne +22 -> 39
    //   20: aload_0
    //   21: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   24: astore 5
    //   26: ldc 58
    //   28: astore 6
    //   30: aload 5
    //   32: aload 6
    //   34: invokevirtual 44	org/apache/http/impl/conn/Wire:input	(Ljava/lang/String;)V
    //   37: iload_3
    //   38: ireturn
    //   39: iload_3
    //   40: ifle -3 -> 37
    //   43: aload_0
    //   44: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   47: astore 5
    //   49: aconst_null
    //   50: astore 6
    //   52: aload 5
    //   54: aload_1
    //   55: iconst_0
    //   56: iload_3
    //   57: invokevirtual 68	org/apache/http/impl/conn/Wire:input	([BII)V
    //   60: goto -23 -> 37
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   68: astore 5
    //   70: new 22	java/lang/StringBuilder
    //   73: astore 6
    //   75: aload 6
    //   77: invokespecial 23	java/lang/StringBuilder:<init>	()V
    //   80: aload 6
    //   82: ldc 62
    //   84: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: astore 6
    //   89: aload_2
    //   90: invokevirtual 35	java/io/IOException:getMessage	()Ljava/lang/String;
    //   93: astore 7
    //   95: aload 6
    //   97: aload 7
    //   99: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore 6
    //   107: aload 5
    //   109: aload 6
    //   111: invokevirtual 44	org/apache/http/impl/conn/Wire:input	(Ljava/lang/String;)V
    //   114: aload_2
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	LoggingInputStream
    //   0	116	1	paramArrayOfByte	byte[]
    //   4	2	2	localInputStream	InputStream
    //   63	52	2	localIOException	IOException
    //   10	47	3	i	int
    //   12	6	4	j	int
    //   24	84	5	localWire	Wire
    //   28	82	6	localObject	Object
    //   93	5	7	str	String
    // Exception table:
    //   from	to	target	type
    //   0	4	63	java/io/IOException
    //   6	10	63	java/io/IOException
    //   20	24	63	java/io/IOException
    //   32	37	63	java/io/IOException
    //   43	47	63	java/io/IOException
    //   56	60	63	java/io/IOException
  }
  
  /* Error */
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	org/apache/http/impl/conn/LoggingInputStream:in	Ljava/io/InputStream;
    //   4: astore 4
    //   6: aload 4
    //   8: aload_1
    //   9: iload_2
    //   10: iload_3
    //   11: invokevirtual 71	java/io/InputStream:read	([BII)I
    //   14: istore 5
    //   16: iconst_m1
    //   17: istore 6
    //   19: iload 5
    //   21: iload 6
    //   23: if_icmpne +23 -> 46
    //   26: aload_0
    //   27: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   30: astore 7
    //   32: ldc 58
    //   34: astore 8
    //   36: aload 7
    //   38: aload 8
    //   40: invokevirtual 44	org/apache/http/impl/conn/Wire:input	(Ljava/lang/String;)V
    //   43: iload 5
    //   45: ireturn
    //   46: iload 5
    //   48: ifle -5 -> 43
    //   51: aload_0
    //   52: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   55: astore 7
    //   57: aload 7
    //   59: aload_1
    //   60: iload_2
    //   61: iload 5
    //   63: invokevirtual 68	org/apache/http/impl/conn/Wire:input	([BII)V
    //   66: goto -23 -> 43
    //   69: astore 4
    //   71: aload_0
    //   72: getfield 16	org/apache/http/impl/conn/LoggingInputStream:wire	Lorg/apache/http/impl/conn/Wire;
    //   75: astore 7
    //   77: new 22	java/lang/StringBuilder
    //   80: astore 8
    //   82: aload 8
    //   84: invokespecial 23	java/lang/StringBuilder:<init>	()V
    //   87: aload 8
    //   89: ldc 62
    //   91: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: astore 8
    //   96: aload 4
    //   98: invokevirtual 35	java/io/IOException:getMessage	()Ljava/lang/String;
    //   101: astore 9
    //   103: aload 8
    //   105: aload 9
    //   107: invokevirtual 29	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: astore 8
    //   115: aload 7
    //   117: aload 8
    //   119: invokevirtual 44	org/apache/http/impl/conn/Wire:input	(Ljava/lang/String;)V
    //   122: aload 4
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	LoggingInputStream
    //   0	125	1	paramArrayOfByte	byte[]
    //   0	125	2	paramInt1	int
    //   0	125	3	paramInt2	int
    //   4	3	4	localInputStream	InputStream
    //   69	54	4	localIOException	IOException
    //   14	48	5	i	int
    //   17	7	6	j	int
    //   30	86	7	localWire	Wire
    //   34	84	8	localObject	Object
    //   101	5	9	str	String
    // Exception table:
    //   from	to	target	type
    //   0	4	69	java/io/IOException
    //   10	14	69	java/io/IOException
    //   26	30	69	java/io/IOException
    //   38	43	69	java/io/IOException
    //   51	55	69	java/io/IOException
    //   61	66	69	java/io/IOException
  }
  
  public void reset()
  {
    super.reset();
  }
  
  public long skip(long paramLong)
  {
    try
    {
      return super.skip(paramLong);
    }
    catch (IOException localIOException)
    {
      Wire localWire = this.wire;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("[skip] I/O error: ");
      String str = localIOException.getMessage();
      localObject = str;
      localWire.input((String)localObject);
      throw localIOException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\LoggingInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */