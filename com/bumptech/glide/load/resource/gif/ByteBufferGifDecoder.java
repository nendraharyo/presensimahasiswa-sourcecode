package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.nio.ByteBuffer;
import java.util.List;

public class ByteBufferGifDecoder
  implements ResourceDecoder
{
  private static final ByteBufferGifDecoder.GifDecoderFactory GIF_DECODER_FACTORY;
  private static final ByteBufferGifDecoder.GifHeaderParserPool PARSER_POOL;
  private static final String TAG = "BufferGifDecoder";
  private final Context context;
  private final ByteBufferGifDecoder.GifDecoderFactory gifDecoderFactory;
  private final ByteBufferGifDecoder.GifHeaderParserPool parserPool;
  private final List parsers;
  private final GifBitmapProvider provider;
  
  static
  {
    Object localObject = new com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder$GifDecoderFactory;
    ((ByteBufferGifDecoder.GifDecoderFactory)localObject).<init>();
    GIF_DECODER_FACTORY = (ByteBufferGifDecoder.GifDecoderFactory)localObject;
    localObject = new com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder$GifHeaderParserPool;
    ((ByteBufferGifDecoder.GifHeaderParserPool)localObject).<init>();
    PARSER_POOL = (ByteBufferGifDecoder.GifHeaderParserPool)localObject;
  }
  
  public ByteBufferGifDecoder(Context paramContext)
  {
    this(paramContext, localList, localBitmapPool, localArrayPool);
  }
  
  public ByteBufferGifDecoder(Context paramContext, List paramList, BitmapPool paramBitmapPool, ArrayPool paramArrayPool)
  {
    this(paramContext, paramList, paramBitmapPool, paramArrayPool, localGifHeaderParserPool, localGifDecoderFactory);
  }
  
  ByteBufferGifDecoder(Context paramContext, List paramList, BitmapPool paramBitmapPool, ArrayPool paramArrayPool, ByteBufferGifDecoder.GifHeaderParserPool paramGifHeaderParserPool, ByteBufferGifDecoder.GifDecoderFactory paramGifDecoderFactory)
  {
    Object localObject = paramContext.getApplicationContext();
    this.context = ((Context)localObject);
    this.parsers = paramList;
    this.gifDecoderFactory = paramGifDecoderFactory;
    localObject = new com/bumptech/glide/load/resource/gif/GifBitmapProvider;
    ((GifBitmapProvider)localObject).<init>(paramBitmapPool, paramArrayPool);
    this.provider = ((GifBitmapProvider)localObject);
    this.parserPool = paramGifHeaderParserPool;
  }
  
  /* Error */
  private GifDrawableResource decode(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, GifHeaderParser paramGifHeaderParser, Options paramOptions)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: iconst_2
    //   7: istore 8
    //   9: invokestatic 95	com/bumptech/glide/util/LogTime:getLogTime	()J
    //   12: lstore 9
    //   14: aload 4
    //   16: invokevirtual 101	com/bumptech/glide/gifdecoder/GifHeaderParser:parseHeader	()Lcom/bumptech/glide/gifdecoder/GifHeader;
    //   19: astore 11
    //   21: aload 11
    //   23: invokevirtual 107	com/bumptech/glide/gifdecoder/GifHeader:getNumFrames	()I
    //   26: istore 12
    //   28: iload 12
    //   30: ifle +15 -> 45
    //   33: aload 11
    //   35: invokevirtual 110	com/bumptech/glide/gifdecoder/GifHeader:getStatus	()I
    //   38: istore 12
    //   40: iload 12
    //   42: ifeq +78 -> 120
    //   45: ldc 15
    //   47: astore 13
    //   49: aload 13
    //   51: iload 8
    //   53: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   56: istore 12
    //   58: iload 12
    //   60: ifeq +57 -> 117
    //   63: ldc 15
    //   65: astore 13
    //   67: new 118	java/lang/StringBuilder
    //   70: astore 11
    //   72: aload 11
    //   74: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   77: ldc 121
    //   79: astore 14
    //   81: aload 11
    //   83: aload 14
    //   85: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: astore 11
    //   90: lload 9
    //   92: invokestatic 129	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   95: dstore 15
    //   97: aload 11
    //   99: dload 15
    //   101: invokevirtual 132	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   104: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: astore 11
    //   109: aload 13
    //   111: aload 11
    //   113: invokestatic 140	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   116: pop
    //   117: aload 7
    //   119: areturn
    //   120: getstatic 146	com/bumptech/glide/load/resource/gif/GifOptions:DECODE_FORMAT	Lcom/bumptech/glide/load/Option;
    //   123: astore 13
    //   125: aload 5
    //   127: aload 13
    //   129: invokevirtual 151	com/bumptech/glide/load/Options:get	(Lcom/bumptech/glide/load/Option;)Ljava/lang/Object;
    //   132: astore 13
    //   134: getstatic 157	com/bumptech/glide/load/DecodeFormat:PREFER_RGB_565	Lcom/bumptech/glide/load/DecodeFormat;
    //   137: astore 14
    //   139: aload 13
    //   141: aload 14
    //   143: if_acmpne +148 -> 291
    //   146: getstatic 163	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   149: astore 13
    //   151: aload 11
    //   153: iload_2
    //   154: iload_3
    //   155: invokestatic 167	com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder:getSampleSize	(Lcom/bumptech/glide/gifdecoder/GifHeader;II)I
    //   158: istore 17
    //   160: aload_0
    //   161: getfield 79	com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder:gifDecoderFactory	Lcom/bumptech/glide/load/resource/gif/ByteBufferGifDecoder$GifDecoderFactory;
    //   164: astore 18
    //   166: aload_0
    //   167: getfield 86	com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder:provider	Lcom/bumptech/glide/load/resource/gif/GifBitmapProvider;
    //   170: astore 19
    //   172: aload 18
    //   174: aload 19
    //   176: aload 11
    //   178: aload_1
    //   179: iload 17
    //   181: invokevirtual 171	com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder$GifDecoderFactory:build	(Lcom/bumptech/glide/gifdecoder/GifDecoder$BitmapProvider;Lcom/bumptech/glide/gifdecoder/GifHeader;Ljava/nio/ByteBuffer;I)Lcom/bumptech/glide/gifdecoder/GifDecoder;
    //   184: astore 11
    //   186: aload 11
    //   188: aload 13
    //   190: invokeinterface 177 2 0
    //   195: aload 11
    //   197: invokeinterface 180 1 0
    //   202: aload 11
    //   204: invokeinterface 184 1 0
    //   209: astore 20
    //   211: aload 20
    //   213: ifnonnull +86 -> 299
    //   216: ldc 15
    //   218: astore 13
    //   220: aload 13
    //   222: iload 8
    //   224: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   227: istore 12
    //   229: iload 12
    //   231: ifeq -114 -> 117
    //   234: ldc 15
    //   236: astore 13
    //   238: new 118	java/lang/StringBuilder
    //   241: astore 11
    //   243: aload 11
    //   245: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   248: ldc 121
    //   250: astore 14
    //   252: aload 11
    //   254: aload 14
    //   256: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: astore 11
    //   261: lload 9
    //   263: invokestatic 129	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   266: dstore 15
    //   268: aload 11
    //   270: dload 15
    //   272: invokevirtual 132	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   275: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   278: astore 11
    //   280: aload 13
    //   282: aload 11
    //   284: invokestatic 140	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   287: pop
    //   288: goto -171 -> 117
    //   291: getstatic 187	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   294: astore 13
    //   296: goto -145 -> 151
    //   299: invokestatic 192	com/bumptech/glide/load/resource/UnitTransformation:get	()Lcom/bumptech/glide/load/resource/UnitTransformation;
    //   302: astore 14
    //   304: new 194	com/bumptech/glide/load/resource/gif/GifDrawable
    //   307: astore 7
    //   309: aload_0
    //   310: getfield 75	com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder:context	Landroid/content/Context;
    //   313: astore 13
    //   315: aload 7
    //   317: aload 13
    //   319: aload 11
    //   321: aload 14
    //   323: iload_2
    //   324: iload_3
    //   325: aload 20
    //   327: invokespecial 197	com/bumptech/glide/load/resource/gif/GifDrawable:<init>	(Landroid/content/Context;Lcom/bumptech/glide/gifdecoder/GifDecoder;Lcom/bumptech/glide/load/Transformation;IILandroid/graphics/Bitmap;)V
    //   330: new 199	com/bumptech/glide/load/resource/gif/GifDrawableResource
    //   333: astore 13
    //   335: aload 13
    //   337: aload 7
    //   339: invokespecial 202	com/bumptech/glide/load/resource/gif/GifDrawableResource:<init>	(Lcom/bumptech/glide/load/resource/gif/GifDrawable;)V
    //   342: ldc 15
    //   344: astore 7
    //   346: aload 7
    //   348: iload 8
    //   350: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   353: istore 6
    //   355: iload 6
    //   357: ifeq +57 -> 414
    //   360: ldc 15
    //   362: astore 7
    //   364: new 118	java/lang/StringBuilder
    //   367: astore 11
    //   369: aload 11
    //   371: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   374: ldc 121
    //   376: astore 14
    //   378: aload 11
    //   380: aload 14
    //   382: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: astore 11
    //   387: lload 9
    //   389: invokestatic 129	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   392: dstore 15
    //   394: aload 11
    //   396: dload 15
    //   398: invokevirtual 132	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   401: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   404: astore 11
    //   406: aload 7
    //   408: aload 11
    //   410: invokestatic 140	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   413: pop
    //   414: aload 13
    //   416: astore 7
    //   418: goto -301 -> 117
    //   421: astore 7
    //   423: ldc 15
    //   425: astore 13
    //   427: aload 13
    //   429: iload 8
    //   431: invokestatic 116	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   434: istore 12
    //   436: iload 12
    //   438: ifeq +57 -> 495
    //   441: ldc 15
    //   443: astore 13
    //   445: new 118	java/lang/StringBuilder
    //   448: astore 11
    //   450: aload 11
    //   452: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   455: ldc 121
    //   457: astore 14
    //   459: aload 11
    //   461: aload 14
    //   463: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: astore 11
    //   468: lload 9
    //   470: invokestatic 129	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   473: dstore 15
    //   475: aload 11
    //   477: dload 15
    //   479: invokevirtual 132	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   482: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   485: astore 11
    //   487: aload 13
    //   489: aload 11
    //   491: invokestatic 140	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   494: pop
    //   495: aload 7
    //   497: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	498	0	this	ByteBufferGifDecoder
    //   0	498	1	paramByteBuffer	ByteBuffer
    //   0	498	2	paramInt1	int
    //   0	498	3	paramInt2	int
    //   0	498	4	paramGifHeaderParser	GifHeaderParser
    //   0	498	5	paramOptions	Options
    //   1	355	6	bool1	boolean
    //   4	413	7	localObject1	Object
    //   421	75	7	localObject2	Object
    //   7	423	8	i	int
    //   12	457	9	l	long
    //   19	471	11	localObject3	Object
    //   26	15	12	j	int
    //   56	381	12	bool2	boolean
    //   47	441	13	localObject4	Object
    //   79	383	14	localObject5	Object
    //   95	383	15	d	double
    //   158	22	17	k	int
    //   164	9	18	localGifDecoderFactory	ByteBufferGifDecoder.GifDecoderFactory
    //   170	5	19	localGifBitmapProvider	GifBitmapProvider
    //   209	117	20	localBitmap	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   14	19	421	finally
    //   21	26	421	finally
    //   33	38	421	finally
    //   120	123	421	finally
    //   127	132	421	finally
    //   134	137	421	finally
    //   146	149	421	finally
    //   154	158	421	finally
    //   160	164	421	finally
    //   166	170	421	finally
    //   179	184	421	finally
    //   188	195	421	finally
    //   195	202	421	finally
    //   202	209	421	finally
    //   291	294	421	finally
    //   299	302	421	finally
    //   304	307	421	finally
    //   309	313	421	finally
    //   325	330	421	finally
    //   330	333	421	finally
    //   337	342	421	finally
  }
  
  private static int getSampleSize(GifHeader paramGifHeader, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = paramGifHeader.getHeight() / paramInt2;
    int k = paramGifHeader.getWidth() / paramInt1;
    j = Math.min(j, k);
    if (j == 0) {}
    for (j = 0;; j = Integer.highestOneBit(j))
    {
      j = Math.max(i, j);
      String str1 = "BufferGifDecoder";
      int m = 2;
      boolean bool = Log.isLoggable(str1, m);
      if ((bool) && (j > i))
      {
        str1 = "BufferGifDecoder";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Downsampling GIF, sampleSize: ").append(j).append(", target dimens: [").append(paramInt1).append("x").append(paramInt2).append("], actual dimens: [");
        i = paramGifHeader.getWidth();
        localObject = ((StringBuilder)localObject).append(i).append("x");
        i = paramGifHeader.getHeight();
        localObject = ((StringBuilder)localObject).append(i);
        String str2 = "]";
        localObject = str2;
        Log.v(str1, (String)localObject);
      }
      return j;
    }
  }
  
  public GifDrawableResource decode(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, Options paramOptions)
  {
    GifHeaderParser localGifHeaderParser = this.parserPool.obtain(paramByteBuffer);
    Object localObject1 = this;
    try
    {
      localObject1 = decode(paramByteBuffer, paramInt1, paramInt2, localGifHeaderParser, paramOptions);
      return (GifDrawableResource)localObject1;
    }
    finally
    {
      this.parserPool.release(localGifHeaderParser);
    }
  }
  
  public boolean handles(ByteBuffer paramByteBuffer, Options paramOptions)
  {
    Object localObject = GifOptions.DISABLE_ANIMATION;
    localObject = (Boolean)paramOptions.get((Option)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    if (!bool)
    {
      localObject = ImageHeaderParserUtils.getType(this.parsers, paramByteBuffer);
      ImageHeaderParser.ImageType localImageType = ImageHeaderParser.ImageType.GIF;
      if (localObject == localImageType) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\ByteBufferGifDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */