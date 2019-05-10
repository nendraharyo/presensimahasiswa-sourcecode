package com.bumptech.glide.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class ByteBufferUtil
{
  private static final AtomicReference BUFFER_REF;
  private static final int BUFFER_SIZE = 16384;
  
  static
  {
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    BUFFER_REF = localAtomicReference;
  }
  
  /* Error */
  public static ByteBuffer fromFile(java.io.File paramFile)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_1
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual 25	java/io/File:length	()J
    //   8: lstore 4
    //   10: ldc2_w 26
    //   13: lstore 6
    //   15: lload 4
    //   17: lload 6
    //   19: lcmp
    //   20: istore 8
    //   22: iload 8
    //   24: ifle +48 -> 72
    //   27: new 31	java/io/IOException
    //   30: astore 9
    //   32: ldc 33
    //   34: astore 10
    //   36: aload 9
    //   38: aload 10
    //   40: invokespecial 36	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   43: aload 9
    //   45: athrow
    //   46: astore 9
    //   48: aconst_null
    //   49: astore 10
    //   51: aload_3
    //   52: ifnull +7 -> 59
    //   55: aload_3
    //   56: invokevirtual 41	java/nio/channels/FileChannel:close	()V
    //   59: aload 10
    //   61: ifnull +8 -> 69
    //   64: aload 10
    //   66: invokevirtual 44	java/io/RandomAccessFile:close	()V
    //   69: aload 9
    //   71: athrow
    //   72: lload 4
    //   74: lload_1
    //   75: lcmp
    //   76: istore 8
    //   78: iload 8
    //   80: ifne +22 -> 102
    //   83: new 31	java/io/IOException
    //   86: astore 9
    //   88: ldc 46
    //   90: astore 10
    //   92: aload 9
    //   94: aload 10
    //   96: invokespecial 36	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   99: aload 9
    //   101: athrow
    //   102: new 43	java/io/RandomAccessFile
    //   105: astore 11
    //   107: ldc 48
    //   109: astore 9
    //   111: aload 11
    //   113: aload_0
    //   114: aload 9
    //   116: invokespecial 51	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   119: aload 11
    //   121: invokevirtual 55	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   124: astore 9
    //   126: getstatic 61	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   129: astore_3
    //   130: lconst_0
    //   131: lstore 6
    //   133: aload 9
    //   135: aload_3
    //   136: lload 6
    //   138: lload 4
    //   140: invokevirtual 65	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   143: astore_3
    //   144: aload_3
    //   145: invokevirtual 71	java/nio/MappedByteBuffer:load	()Ljava/nio/MappedByteBuffer;
    //   148: astore_3
    //   149: aload 9
    //   151: ifnull +8 -> 159
    //   154: aload 9
    //   156: invokevirtual 41	java/nio/channels/FileChannel:close	()V
    //   159: aload 11
    //   161: ifnull +8 -> 169
    //   164: aload 11
    //   166: invokevirtual 44	java/io/RandomAccessFile:close	()V
    //   169: aload_3
    //   170: areturn
    //   171: astore 9
    //   173: goto -14 -> 159
    //   176: astore 9
    //   178: goto -9 -> 169
    //   181: astore_3
    //   182: goto -123 -> 59
    //   185: astore_3
    //   186: goto -117 -> 69
    //   189: astore 9
    //   191: aload 11
    //   193: astore 10
    //   195: goto -144 -> 51
    //   198: astore_3
    //   199: aload 11
    //   201: astore 10
    //   203: aload 9
    //   205: astore 12
    //   207: aload_3
    //   208: astore 9
    //   210: aload 12
    //   212: astore_3
    //   213: goto -162 -> 51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramFile	java.io.File
    //   1	74	1	l1	long
    //   3	167	3	localObject1	Object
    //   181	1	3	localIOException1	java.io.IOException
    //   185	1	3	localIOException2	java.io.IOException
    //   198	10	3	localObject2	Object
    //   212	1	3	localObject3	Object
    //   8	131	4	l2	long
    //   13	124	6	l3	long
    //   20	59	8	bool	boolean
    //   30	14	9	localIOException3	java.io.IOException
    //   46	24	9	localObject4	Object
    //   86	69	9	localObject5	Object
    //   171	1	9	localIOException4	java.io.IOException
    //   176	1	9	localIOException5	java.io.IOException
    //   189	15	9	localObject6	Object
    //   208	1	9	localObject7	Object
    //   34	168	10	localObject8	Object
    //   105	95	11	localRandomAccessFile	java.io.RandomAccessFile
    //   205	6	12	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   4	8	46	finally
    //   27	30	46	finally
    //   38	43	46	finally
    //   43	46	46	finally
    //   83	86	46	finally
    //   94	99	46	finally
    //   99	102	46	finally
    //   102	105	46	finally
    //   114	119	46	finally
    //   154	159	171	java/io/IOException
    //   164	169	176	java/io/IOException
    //   55	59	181	java/io/IOException
    //   64	69	185	java/io/IOException
    //   119	124	189	finally
    //   126	129	198	finally
    //   138	143	198	finally
    //   144	148	198	finally
  }
  
  public static ByteBuffer fromStream(InputStream paramInputStream)
  {
    int i = 16384;
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>(i);
    Object localObject = BUFFER_REF;
    int j = 0;
    localObject = (byte[])((AtomicReference)localObject).getAndSet(null);
    if (localObject == null) {
      localObject = new byte[i];
    }
    for (;;)
    {
      j = paramInputStream.read((byte[])localObject);
      if (j < 0) {
        break;
      }
      localByteArrayOutputStream.write((byte[])localObject, 0, j);
    }
    BUFFER_REF.set(localObject);
    localObject = localByteArrayOutputStream.toByteArray();
    return (ByteBuffer)ByteBuffer.allocateDirect(localObject.length).put((byte[])localObject).position(0);
  }
  
  private static ByteBufferUtil.SafeArray getSafeArray(ByteBuffer paramByteBuffer)
  {
    boolean bool = paramByteBuffer.isReadOnly();
    ByteBufferUtil.SafeArray localSafeArray;
    if (!bool)
    {
      bool = paramByteBuffer.hasArray();
      if (bool)
      {
        localSafeArray = new com/bumptech/glide/util/ByteBufferUtil$SafeArray;
        byte[] arrayOfByte = paramByteBuffer.array();
        int i = paramByteBuffer.arrayOffset();
        int j = paramByteBuffer.limit();
        localSafeArray.<init>(arrayOfByte, i, j);
      }
    }
    for (;;)
    {
      return localSafeArray;
      bool = false;
      localSafeArray = null;
    }
  }
  
  public static byte[] toBytes(ByteBuffer paramByteBuffer)
  {
    Object localObject = getSafeArray(paramByteBuffer);
    int j;
    if (localObject != null)
    {
      int i = ((ByteBufferUtil.SafeArray)localObject).offset;
      if (i == 0)
      {
        i = ((ByteBufferUtil.SafeArray)localObject).limit;
        localObject = ((ByteBufferUtil.SafeArray)localObject).data;
        j = localObject.length;
        if (i == j) {
          localObject = paramByteBuffer.array();
        }
      }
    }
    for (;;)
    {
      return (byte[])localObject;
      ByteBuffer localByteBuffer = paramByteBuffer.asReadOnlyBuffer();
      j = localByteBuffer.limit();
      localObject = new byte[j];
      localByteBuffer.position(0);
      localByteBuffer.get((byte[])localObject);
    }
  }
  
  /* Error */
  public static void toFile(ByteBuffer paramByteBuffer, java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: iconst_0
    //   6: invokevirtual 115	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   9: pop
    //   10: new 43	java/io/RandomAccessFile
    //   13: astore 4
    //   15: ldc -99
    //   17: astore_3
    //   18: aload 4
    //   20: aload_1
    //   21: aload_3
    //   22: invokespecial 51	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   25: aload 4
    //   27: invokevirtual 55	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   30: astore_2
    //   31: aload_2
    //   32: aload_0
    //   33: invokevirtual 160	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   36: pop
    //   37: aconst_null
    //   38: astore_3
    //   39: aload_2
    //   40: iconst_0
    //   41: invokevirtual 164	java/nio/channels/FileChannel:force	(Z)V
    //   44: aload_2
    //   45: invokevirtual 41	java/nio/channels/FileChannel:close	()V
    //   48: aload 4
    //   50: invokevirtual 44	java/io/RandomAccessFile:close	()V
    //   53: aload_2
    //   54: ifnull +7 -> 61
    //   57: aload_2
    //   58: invokevirtual 41	java/nio/channels/FileChannel:close	()V
    //   61: aload 4
    //   63: ifnull +8 -> 71
    //   66: aload 4
    //   68: invokevirtual 44	java/io/RandomAccessFile:close	()V
    //   71: return
    //   72: astore_3
    //   73: aconst_null
    //   74: astore 4
    //   76: aload_2
    //   77: ifnull +7 -> 84
    //   80: aload_2
    //   81: invokevirtual 41	java/nio/channels/FileChannel:close	()V
    //   84: aload 4
    //   86: ifnull +8 -> 94
    //   89: aload 4
    //   91: invokevirtual 44	java/io/RandomAccessFile:close	()V
    //   94: aload_3
    //   95: athrow
    //   96: astore_3
    //   97: goto -36 -> 61
    //   100: astore_3
    //   101: goto -30 -> 71
    //   104: astore_2
    //   105: goto -21 -> 84
    //   108: astore_2
    //   109: goto -15 -> 94
    //   112: astore_3
    //   113: goto -37 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	paramByteBuffer	ByteBuffer
    //   0	116	1	paramFile	java.io.File
    //   1	80	2	localFileChannel	java.nio.channels.FileChannel
    //   104	1	2	localIOException1	java.io.IOException
    //   108	1	2	localIOException2	java.io.IOException
    //   3	36	3	str	String
    //   72	23	3	localObject1	Object
    //   96	1	3	localIOException3	java.io.IOException
    //   100	1	3	localIOException4	java.io.IOException
    //   112	1	3	localObject2	Object
    //   13	77	4	localRandomAccessFile	java.io.RandomAccessFile
    // Exception table:
    //   from	to	target	type
    //   10	13	72	finally
    //   21	25	72	finally
    //   57	61	96	java/io/IOException
    //   66	71	100	java/io/IOException
    //   80	84	104	java/io/IOException
    //   89	94	108	java/io/IOException
    //   25	30	112	finally
    //   32	37	112	finally
    //   40	44	112	finally
    //   44	48	112	finally
    //   48	53	112	finally
  }
  
  public static InputStream toStream(ByteBuffer paramByteBuffer)
  {
    ByteBufferUtil.ByteBufferStream localByteBufferStream = new com/bumptech/glide/util/ByteBufferUtil$ByteBufferStream;
    localByteBufferStream.<init>(paramByteBuffer);
    return localByteBufferStream;
  }
  
  public static void toStream(ByteBuffer paramByteBuffer, OutputStream paramOutputStream)
  {
    int i = 0;
    Object localObject1 = getSafeArray(paramByteBuffer);
    Object localObject2;
    int j;
    int k;
    if (localObject1 != null)
    {
      localObject2 = ((ByteBufferUtil.SafeArray)localObject1).data;
      j = ((ByteBufferUtil.SafeArray)localObject1).offset;
      i = ((ByteBufferUtil.SafeArray)localObject1).offset;
      k = ((ByteBufferUtil.SafeArray)localObject1).limit + i;
      paramOutputStream.write((byte[])localObject2, j, k);
    }
    for (;;)
    {
      return;
      localObject1 = BUFFER_REF;
      int m = 0;
      localObject2 = null;
      localObject1 = (byte[])((AtomicReference)localObject1).getAndSet(null);
      if (localObject1 == null)
      {
        k = 16384;
        localObject1 = new byte[k];
      }
      for (;;)
      {
        m = paramByteBuffer.remaining();
        if (m <= 0) {
          break;
        }
        m = paramByteBuffer.remaining();
        j = localObject1.length;
        m = Math.min(m, j);
        paramByteBuffer.get((byte[])localObject1, 0, m);
        paramOutputStream.write((byte[])localObject1, 0, m);
      }
      localObject2 = BUFFER_REF;
      ((AtomicReference)localObject2).set(localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\ByteBufferUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */