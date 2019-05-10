package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

public class StreamEncoder
  implements Encoder
{
  private static final String TAG = "StreamEncoder";
  private final ArrayPool byteArrayPool;
  
  public StreamEncoder(ArrayPool paramArrayPool)
  {
    this.byteArrayPool = paramArrayPool;
  }
  
  /* Error */
  public boolean encode(java.io.InputStream paramInputStream, java.io.File paramFile, com.bumptech.glide.load.Options paramOptions)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: getfield 19	com/bumptech/glide/load/model/StreamEncoder:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   10: astore 6
    //   12: ldc 20
    //   14: istore 7
    //   16: ldc 23
    //   18: astore 8
    //   20: aload 6
    //   22: iload 7
    //   24: aload 8
    //   26: invokeinterface 29 3 0
    //   31: checkcast 23	[B
    //   34: astore 6
    //   36: iconst_0
    //   37: istore 9
    //   39: aconst_null
    //   40: astore 10
    //   42: new 31	java/io/FileOutputStream
    //   45: astore 8
    //   47: aload 8
    //   49: aload_2
    //   50: invokespecial 34	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   53: aload_1
    //   54: aload 6
    //   56: invokevirtual 40	java/io/InputStream:read	([B)I
    //   59: istore 7
    //   61: iconst_m1
    //   62: istore 9
    //   64: iload 7
    //   66: iload 9
    //   68: if_icmpeq +97 -> 165
    //   71: iconst_0
    //   72: istore 9
    //   74: aconst_null
    //   75: astore 10
    //   77: aload 8
    //   79: aload 6
    //   81: iconst_0
    //   82: iload 7
    //   84: invokevirtual 46	java/io/OutputStream:write	([BII)V
    //   87: goto -34 -> 53
    //   90: astore 11
    //   92: ldc 11
    //   94: astore 10
    //   96: iconst_3
    //   97: istore 12
    //   99: aload 10
    //   101: iload 12
    //   103: invokestatic 53	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   106: istore 9
    //   108: iload 9
    //   110: ifeq +21 -> 131
    //   113: ldc 11
    //   115: astore 10
    //   117: ldc 55
    //   119: astore 13
    //   121: aload 10
    //   123: aload 13
    //   125: aload 11
    //   127: invokestatic 59	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   130: pop
    //   131: aload 8
    //   133: ifnull +8 -> 141
    //   136: aload 8
    //   138: invokevirtual 62	java/io/OutputStream:close	()V
    //   141: aload_0
    //   142: getfield 19	com/bumptech/glide/load/model/StreamEncoder:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   145: astore 11
    //   147: aload 11
    //   149: aload 6
    //   151: invokeinterface 66 2 0
    //   156: iconst_0
    //   157: istore 14
    //   159: aconst_null
    //   160: astore 6
    //   162: iload 14
    //   164: ireturn
    //   165: aload 8
    //   167: invokevirtual 62	java/io/OutputStream:close	()V
    //   170: iconst_1
    //   171: istore 4
    //   173: aload 8
    //   175: ifnull +8 -> 183
    //   178: aload 8
    //   180: invokevirtual 62	java/io/OutputStream:close	()V
    //   183: aload_0
    //   184: getfield 19	com/bumptech/glide/load/model/StreamEncoder:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   187: astore 11
    //   189: aload 11
    //   191: aload 6
    //   193: invokeinterface 66 2 0
    //   198: iload 4
    //   200: istore 14
    //   202: goto -40 -> 162
    //   205: astore 5
    //   207: aconst_null
    //   208: astore 8
    //   210: aload 8
    //   212: ifnull +8 -> 220
    //   215: aload 8
    //   217: invokevirtual 62	java/io/OutputStream:close	()V
    //   220: aload_0
    //   221: getfield 19	com/bumptech/glide/load/model/StreamEncoder:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   224: aload 6
    //   226: invokeinterface 66 2 0
    //   231: aload 5
    //   233: athrow
    //   234: astore 11
    //   236: goto -53 -> 183
    //   239: astore 11
    //   241: goto -100 -> 141
    //   244: astore 11
    //   246: goto -26 -> 220
    //   249: astore 5
    //   251: goto -41 -> 210
    //   254: astore 11
    //   256: aconst_null
    //   257: astore 8
    //   259: goto -167 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	StreamEncoder
    //   0	262	1	paramInputStream	java.io.InputStream
    //   0	262	2	paramFile	java.io.File
    //   0	262	3	paramOptions	com.bumptech.glide.load.Options
    //   1	198	4	bool1	boolean
    //   4	1	5	localObject1	Object
    //   205	27	5	localObject2	Object
    //   249	1	5	localObject3	Object
    //   10	215	6	localObject4	Object
    //   14	69	7	i	int
    //   18	240	8	localObject5	Object
    //   37	36	9	j	int
    //   106	3	9	bool2	boolean
    //   40	82	10	str1	String
    //   90	36	11	localIOException1	java.io.IOException
    //   145	45	11	localArrayPool	ArrayPool
    //   234	1	11	localIOException2	java.io.IOException
    //   239	1	11	localIOException3	java.io.IOException
    //   244	1	11	localIOException4	java.io.IOException
    //   254	1	11	localIOException5	java.io.IOException
    //   97	5	12	k	int
    //   119	5	13	str2	String
    //   157	44	14	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   54	59	90	java/io/IOException
    //   82	87	90	java/io/IOException
    //   165	170	90	java/io/IOException
    //   42	45	205	finally
    //   49	53	205	finally
    //   178	183	234	java/io/IOException
    //   136	141	239	java/io/IOException
    //   215	220	244	java/io/IOException
    //   54	59	249	finally
    //   82	87	249	finally
    //   101	106	249	finally
    //   125	131	249	finally
    //   165	170	249	finally
    //   42	45	254	java/io/IOException
    //   49	53	254	java/io/IOException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\StreamEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */