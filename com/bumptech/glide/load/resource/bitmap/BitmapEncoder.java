package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

public class BitmapEncoder
  implements ResourceEncoder
{
  public static final Option COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
  public static final Option COMPRESSION_QUALITY;
  private static final String TAG = "BitmapEncoder";
  private final ArrayPool arrayPool;
  
  static
  {
    Integer localInteger = Integer.valueOf(90);
    COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", localInteger);
  }
  
  public BitmapEncoder()
  {
    this.arrayPool = null;
  }
  
  public BitmapEncoder(ArrayPool paramArrayPool)
  {
    this.arrayPool = paramArrayPool;
  }
  
  private Bitmap.CompressFormat getFormat(Bitmap paramBitmap, Options paramOptions)
  {
    Object localObject = COMPRESSION_FORMAT;
    localObject = (Bitmap.CompressFormat)paramOptions.get((Option)localObject);
    if (localObject != null) {}
    for (;;)
    {
      return (Bitmap.CompressFormat)localObject;
      boolean bool = paramBitmap.hasAlpha();
      if (bool) {
        localObject = Bitmap.CompressFormat.PNG;
      } else {
        localObject = Bitmap.CompressFormat.JPEG;
      }
    }
  }
  
  /* Error */
  public boolean encode(com.bumptech.glide.load.engine.Resource paramResource, java.io.File paramFile, Options paramOptions)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 72 1 0
    //   6: checkcast 56	android/graphics/Bitmap
    //   9: astore 4
    //   11: aload_0
    //   12: aload 4
    //   14: aload_3
    //   15: invokespecial 76	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:getFormat	(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/Options;)Landroid/graphics/Bitmap$CompressFormat;
    //   18: astore 5
    //   20: ldc 78
    //   22: astore 6
    //   24: aload 4
    //   26: invokevirtual 82	android/graphics/Bitmap:getWidth	()I
    //   29: istore 7
    //   31: iload 7
    //   33: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: astore 8
    //   38: aload 4
    //   40: invokevirtual 85	android/graphics/Bitmap:getHeight	()I
    //   43: istore 9
    //   45: iload 9
    //   47: invokestatic 25	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: astore 10
    //   52: aload 6
    //   54: aload 8
    //   56: aload 10
    //   58: aload 5
    //   60: invokestatic 91	com/bumptech/glide/util/pool/GlideTrace:beginSectionFormat	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   63: invokestatic 97	com/bumptech/glide/util/LogTime:getLogTime	()J
    //   66: lstore 11
    //   68: getstatic 33	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:COMPRESSION_QUALITY	Lcom/bumptech/glide/load/Option;
    //   71: astore 6
    //   73: aload_3
    //   74: aload 6
    //   76: invokevirtual 52	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   79: astore 6
    //   81: aload 6
    //   83: checkcast 21	java/lang/Integer
    //   86: astore 6
    //   88: aload 6
    //   90: invokevirtual 100	java/lang/Integer:intValue	()I
    //   93: istore 13
    //   95: iconst_0
    //   96: istore 14
    //   98: aconst_null
    //   99: astore 15
    //   101: iconst_0
    //   102: istore 9
    //   104: aconst_null
    //   105: astore 10
    //   107: new 102	java/io/FileOutputStream
    //   110: astore 8
    //   112: aload 8
    //   114: aload_2
    //   115: invokespecial 105	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   118: aload_0
    //   119: getfield 46	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:arrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   122: astore 6
    //   124: aload 6
    //   126: ifnull +27 -> 153
    //   129: new 107	com/bumptech/glide/load/data/BufferedOutputStream
    //   132: astore 6
    //   134: aload_0
    //   135: getfield 46	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:arrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   138: astore 10
    //   140: aload 6
    //   142: aload 8
    //   144: aload 10
    //   146: invokespecial 110	com/bumptech/glide/load/data/BufferedOutputStream:<init>	(Ljava/io/OutputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;)V
    //   149: aload 6
    //   151: astore 8
    //   153: aload 4
    //   155: aload 5
    //   157: iload 13
    //   159: aload 8
    //   161: invokevirtual 114	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   164: pop
    //   165: aload 8
    //   167: invokevirtual 119	java/io/OutputStream:close	()V
    //   170: iconst_1
    //   171: istore 16
    //   173: aload 8
    //   175: ifnull +8 -> 183
    //   178: aload 8
    //   180: invokevirtual 119	java/io/OutputStream:close	()V
    //   183: ldc 14
    //   185: astore 8
    //   187: iconst_2
    //   188: istore 9
    //   190: aload 8
    //   192: iload 9
    //   194: invokestatic 127	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   197: istore 7
    //   199: iload 7
    //   201: ifeq +176 -> 377
    //   204: ldc 14
    //   206: astore 8
    //   208: new 129	java/lang/StringBuilder
    //   211: astore 10
    //   213: aload 10
    //   215: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   218: ldc -124
    //   220: astore 15
    //   222: aload 10
    //   224: aload 15
    //   226: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: astore 10
    //   231: aload 10
    //   233: aload 5
    //   235: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   238: astore 10
    //   240: ldc -115
    //   242: astore 15
    //   244: aload 10
    //   246: aload 15
    //   248: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: astore 10
    //   253: aload 4
    //   255: invokestatic 147	com/bumptech/glide/util/Util:getBitmapByteSize	(Landroid/graphics/Bitmap;)I
    //   258: istore 14
    //   260: aload 10
    //   262: iload 14
    //   264: invokevirtual 150	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   267: astore 10
    //   269: ldc -104
    //   271: astore 15
    //   273: aload 10
    //   275: aload 15
    //   277: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: astore 10
    //   282: lload 11
    //   284: invokestatic 156	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   287: dstore 17
    //   289: aload 10
    //   291: dload 17
    //   293: invokevirtual 159	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   296: astore 10
    //   298: ldc -95
    //   300: astore 15
    //   302: aload 10
    //   304: aload 15
    //   306: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: astore 10
    //   311: getstatic 40	com/bumptech/glide/load/resource/bitmap/BitmapEncoder:COMPRESSION_FORMAT	Lcom/bumptech/glide/load/Option;
    //   314: astore 15
    //   316: aload_3
    //   317: aload 15
    //   319: invokevirtual 52	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   322: astore 15
    //   324: aload 10
    //   326: aload 15
    //   328: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   331: astore 10
    //   333: ldc -93
    //   335: astore 15
    //   337: aload 10
    //   339: aload 15
    //   341: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: astore 10
    //   346: aload 4
    //   348: invokevirtual 60	android/graphics/Bitmap:hasAlpha	()Z
    //   351: istore 19
    //   353: aload 10
    //   355: iload 19
    //   357: invokevirtual 166	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   360: astore 4
    //   362: aload 4
    //   364: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   367: astore 4
    //   369: aload 8
    //   371: aload 4
    //   373: invokestatic 174	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   376: pop
    //   377: invokestatic 177	com/bumptech/glide/util/pool/GlideTrace:endSection	()V
    //   380: iload 16
    //   382: ireturn
    //   383: astore 6
    //   385: iconst_0
    //   386: istore 7
    //   388: aconst_null
    //   389: astore 8
    //   391: ldc 14
    //   393: astore 10
    //   395: iconst_3
    //   396: istore 13
    //   398: aload 10
    //   400: iload 13
    //   402: invokestatic 127	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   405: istore 9
    //   407: iload 9
    //   409: ifeq +21 -> 430
    //   412: ldc 14
    //   414: astore 10
    //   416: ldc -76
    //   418: astore 20
    //   420: aload 10
    //   422: aload 20
    //   424: aload 6
    //   426: invokestatic 184	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   429: pop
    //   430: aload 8
    //   432: ifnull +77 -> 509
    //   435: aload 8
    //   437: invokevirtual 119	java/io/OutputStream:close	()V
    //   440: iconst_0
    //   441: istore 16
    //   443: aconst_null
    //   444: astore 6
    //   446: goto -263 -> 183
    //   449: astore 6
    //   451: iconst_0
    //   452: istore 16
    //   454: aconst_null
    //   455: astore 6
    //   457: goto -274 -> 183
    //   460: astore 4
    //   462: iconst_0
    //   463: istore 7
    //   465: aconst_null
    //   466: astore 8
    //   468: aload 8
    //   470: ifnull +8 -> 478
    //   473: aload 8
    //   475: invokevirtual 119	java/io/OutputStream:close	()V
    //   478: aload 4
    //   480: athrow
    //   481: astore 4
    //   483: invokestatic 177	com/bumptech/glide/util/pool/GlideTrace:endSection	()V
    //   486: aload 4
    //   488: athrow
    //   489: astore 8
    //   491: goto -308 -> 183
    //   494: astore 6
    //   496: goto -18 -> 478
    //   499: astore 4
    //   501: goto -33 -> 468
    //   504: astore 6
    //   506: goto -115 -> 391
    //   509: iconst_0
    //   510: istore 16
    //   512: aconst_null
    //   513: astore 6
    //   515: goto -332 -> 183
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	518	0	this	BitmapEncoder
    //   0	518	1	paramResource	com.bumptech.glide.load.engine.Resource
    //   0	518	2	paramFile	java.io.File
    //   0	518	3	paramOptions	Options
    //   9	363	4	localObject1	Object
    //   460	19	4	localObject2	Object
    //   481	6	4	localObject3	Object
    //   499	1	4	localObject4	Object
    //   18	216	5	localCompressFormat	Bitmap.CompressFormat
    //   22	128	6	localObject5	Object
    //   383	42	6	localIOException1	java.io.IOException
    //   444	1	6	localObject6	Object
    //   449	1	6	localIOException2	java.io.IOException
    //   455	1	6	localObject7	Object
    //   494	1	6	localIOException3	java.io.IOException
    //   504	1	6	localIOException4	java.io.IOException
    //   513	1	6	localObject8	Object
    //   29	3	7	i	int
    //   197	267	7	bool1	boolean
    //   36	438	8	localObject9	Object
    //   489	1	8	localIOException5	java.io.IOException
    //   43	150	9	j	int
    //   405	3	9	bool2	boolean
    //   50	371	10	localObject10	Object
    //   66	217	11	l	long
    //   93	308	13	k	int
    //   96	167	14	m	int
    //   99	241	15	localObject11	Object
    //   171	340	16	bool3	boolean
    //   287	5	17	d	double
    //   351	5	19	bool4	boolean
    //   418	5	20	str	String
    // Exception table:
    //   from	to	target	type
    //   107	110	383	java/io/IOException
    //   114	118	383	java/io/IOException
    //   435	440	449	java/io/IOException
    //   107	110	460	finally
    //   114	118	460	finally
    //   63	66	481	finally
    //   68	71	481	finally
    //   74	79	481	finally
    //   81	86	481	finally
    //   88	93	481	finally
    //   178	183	481	finally
    //   192	197	481	finally
    //   208	211	481	finally
    //   213	218	481	finally
    //   224	229	481	finally
    //   233	238	481	finally
    //   246	251	481	finally
    //   253	258	481	finally
    //   262	267	481	finally
    //   275	280	481	finally
    //   282	287	481	finally
    //   291	296	481	finally
    //   304	309	481	finally
    //   311	314	481	finally
    //   317	322	481	finally
    //   326	331	481	finally
    //   339	344	481	finally
    //   346	351	481	finally
    //   355	360	481	finally
    //   362	367	481	finally
    //   371	377	481	finally
    //   435	440	481	finally
    //   473	478	481	finally
    //   478	481	481	finally
    //   178	183	489	java/io/IOException
    //   473	478	494	java/io/IOException
    //   118	122	499	finally
    //   129	132	499	finally
    //   134	138	499	finally
    //   144	149	499	finally
    //   159	165	499	finally
    //   165	170	499	finally
    //   400	405	499	finally
    //   424	430	499	finally
    //   118	122	504	java/io/IOException
    //   129	132	504	java/io/IOException
    //   134	138	504	java/io/IOException
    //   144	149	504	java/io/IOException
    //   159	165	504	java/io/IOException
    //   165	170	504	java/io/IOException
  }
  
  public EncodeStrategy getEncodeStrategy(Options paramOptions)
  {
    return EncodeStrategy.TRANSFORMED;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */