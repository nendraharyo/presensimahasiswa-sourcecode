package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class ImageHeaderParserUtils
{
  private static final int MARK_POSITION = 5242880;
  
  /* Error */
  public static int getOrientation(List paramList, InputStream paramInputStream, ArrayPool paramArrayPool)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_3
    //   2: aload_1
    //   3: ifnonnull +9 -> 12
    //   6: iload_3
    //   7: istore 4
    //   9: iload 4
    //   11: ireturn
    //   12: aload_1
    //   13: invokevirtual 18	java/io/InputStream:markSupported	()Z
    //   16: istore 4
    //   18: iload 4
    //   20: ifne +18 -> 38
    //   23: new 20	com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream
    //   26: astore 5
    //   28: aload 5
    //   30: aload_1
    //   31: aload_2
    //   32: invokespecial 23	com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream:<init>	(Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;)V
    //   35: aload 5
    //   37: astore_1
    //   38: aload_1
    //   39: ldc 8
    //   41: invokevirtual 28	java/io/InputStream:mark	(I)V
    //   44: iconst_0
    //   45: istore 4
    //   47: aconst_null
    //   48: astore 5
    //   50: aload_0
    //   51: invokeinterface 34 1 0
    //   56: istore 6
    //   58: iconst_0
    //   59: istore 7
    //   61: iload 7
    //   63: iload 6
    //   65: if_icmpge +66 -> 131
    //   68: aload_0
    //   69: iload 7
    //   71: invokeinterface 38 2 0
    //   76: checkcast 40	com/bumptech/glide/load/ImageHeaderParser
    //   79: astore 5
    //   81: aload 5
    //   83: aload_1
    //   84: aload_2
    //   85: invokeinterface 44 3 0
    //   90: istore 4
    //   92: iload 4
    //   94: iload_3
    //   95: if_icmpeq +10 -> 105
    //   98: aload_1
    //   99: invokevirtual 47	java/io/InputStream:reset	()V
    //   102: goto -93 -> 9
    //   105: aload_1
    //   106: invokevirtual 47	java/io/InputStream:reset	()V
    //   109: iload 7
    //   111: iconst_1
    //   112: iadd
    //   113: istore 4
    //   115: iload 4
    //   117: istore 7
    //   119: goto -58 -> 61
    //   122: astore 5
    //   124: aload_1
    //   125: invokevirtual 47	java/io/InputStream:reset	()V
    //   128: aload 5
    //   130: athrow
    //   131: iload_3
    //   132: istore 4
    //   134: goto -125 -> 9
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	paramList	List
    //   0	137	1	paramInputStream	InputStream
    //   0	137	2	paramArrayPool	ArrayPool
    //   1	131	3	i	int
    //   7	3	4	j	int
    //   16	30	4	bool	boolean
    //   90	43	4	k	int
    //   26	56	5	localObject1	Object
    //   122	7	5	localObject2	Object
    //   56	10	6	m	int
    //   59	59	7	n	int
    // Exception table:
    //   from	to	target	type
    //   84	90	122	finally
  }
  
  public static ImageHeaderParser.ImageType getType(List paramList, InputStream paramInputStream, ArrayPool paramArrayPool)
  {
    if (paramInputStream == null) {}
    label55:
    ImageHeaderParser.ImageType localImageType1;
    for (Object localObject1 = ImageHeaderParser.ImageType.UNKNOWN;; localImageType1 = ImageHeaderParser.ImageType.UNKNOWN) {
      for (;;)
      {
        return (ImageHeaderParser.ImageType)localObject1;
        boolean bool = paramInputStream.markSupported();
        if (!bool)
        {
          localObject1 = new com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream;
          ((RecyclableBufferedInputStream)localObject1).<init>(paramInputStream, paramArrayPool);
          paramInputStream = (InputStream)localObject1;
        }
        paramInputStream.mark(5242880);
        bool = false;
        localObject1 = null;
        int j = paramList.size();
        int k = 0;
        if (k < j)
        {
          localObject1 = (ImageHeaderParser)paramList.get(k);
          try
          {
            localObject1 = ((ImageHeaderParser)localObject1).getType(paramInputStream);
            ImageHeaderParser.ImageType localImageType2 = ImageHeaderParser.ImageType.UNKNOWN;
            if (localObject1 != localImageType2)
            {
              paramInputStream.reset();
            }
            else
            {
              paramInputStream.reset();
              int i = k + 1;
              k = i;
              break label55;
            }
          }
          finally
          {
            paramInputStream.reset();
          }
        }
      }
    }
  }
  
  public static ImageHeaderParser.ImageType getType(List paramList, ByteBuffer paramByteBuffer)
  {
    ImageHeaderParser.ImageType localImageType1;
    if (paramByteBuffer == null) {
      localImageType1 = ImageHeaderParser.ImageType.UNKNOWN;
    }
    for (;;)
    {
      return localImageType1;
      int i = 0;
      localImageType1 = null;
      int j = paramList.size();
      for (int k = 0;; k = i)
      {
        if (k >= j) {
          break label72;
        }
        localImageType1 = ((ImageHeaderParser)paramList.get(k)).getType(paramByteBuffer);
        ImageHeaderParser.ImageType localImageType2 = ImageHeaderParser.ImageType.UNKNOWN;
        if (localImageType1 != localImageType2) {
          break;
        }
        i = k + 1;
      }
      label72:
      localImageType1 = ImageHeaderParser.ImageType.UNKNOWN;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\ImageHeaderParserUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */