package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser
  implements ImageHeaderParser
{
  private static final int[] BYTES_PER_FORMAT;
  static final int EXIF_MAGIC_NUMBER = 65496;
  static final int EXIF_SEGMENT_TYPE = 225;
  private static final int GIF_HEADER = 4671814;
  private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
  private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\000\000";
  static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
  private static final int MARKER_EOI = 217;
  private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
  private static final int ORIENTATION_TAG_TYPE = 274;
  private static final int PNG_HEADER = -1991225785;
  private static final int RIFF_HEADER = 1380533830;
  private static final int SEGMENT_SOS = 218;
  static final int SEGMENT_START_ID = 255;
  private static final String TAG = "DfltImageHeaderParser";
  private static final int VP8_HEADER = 1448097792;
  private static final int VP8_HEADER_MASK = 65280;
  private static final int VP8_HEADER_TYPE_EXTENDED = 88;
  private static final int VP8_HEADER_TYPE_LOSSLESS = 76;
  private static final int VP8_HEADER_TYPE_MASK = 255;
  private static final int WEBP_EXTENDED_ALPHA_FLAG = 16;
  private static final int WEBP_HEADER = 1464156752;
  private static final int WEBP_LOSSLESS_ALPHA_FLAG = 8;
  
  static
  {
    Charset localCharset = Charset.forName("UTF-8");
    JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = "Exif\000\000".getBytes(localCharset);
    int[] arrayOfInt = new int[13];
    int[] tmp21_20 = arrayOfInt;
    int[] tmp22_21 = tmp21_20;
    int[] tmp22_21 = tmp21_20;
    tmp22_21[0] = 0;
    tmp22_21[1] = 1;
    int[] tmp29_22 = tmp22_21;
    int[] tmp29_22 = tmp22_21;
    tmp29_22[2] = 1;
    tmp29_22[3] = 2;
    int[] tmp36_29 = tmp29_22;
    int[] tmp36_29 = tmp29_22;
    tmp36_29[4] = 4;
    tmp36_29[5] = 8;
    int[] tmp44_36 = tmp36_29;
    int[] tmp44_36 = tmp36_29;
    tmp44_36[6] = 1;
    tmp44_36[7] = 1;
    int[] tmp53_44 = tmp44_36;
    int[] tmp53_44 = tmp44_36;
    tmp53_44[8] = 2;
    tmp53_44[9] = 4;
    tmp53_44[10] = 8;
    int[] tmp67_53 = tmp53_44;
    tmp67_53[11] = 4;
    tmp67_53[12] = 8;
    BYTES_PER_FORMAT = arrayOfInt;
  }
  
  private static int calcTagOffset(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 2;
    int j = paramInt2 * 12;
    return i + j;
  }
  
  /* Error */
  private int getOrientation(DefaultImageHeaderParser.Reader paramReader, ArrayPool paramArrayPool)
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_3
    //   2: iconst_m1
    //   3: istore 4
    //   5: aload_1
    //   6: invokeinterface 86 1 0
    //   11: istore 5
    //   13: iload 5
    //   15: invokestatic 90	com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser:handles	(I)Z
    //   18: istore 6
    //   20: iload 6
    //   22: ifne +70 -> 92
    //   25: ldc 41
    //   27: astore 7
    //   29: aload 7
    //   31: iload_3
    //   32: invokestatic 96	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   35: istore 6
    //   37: iload 6
    //   39: ifeq +50 -> 89
    //   42: ldc 41
    //   44: astore 7
    //   46: new 98	java/lang/StringBuilder
    //   49: astore 8
    //   51: aload 8
    //   53: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   56: ldc 101
    //   58: astore 9
    //   60: aload 8
    //   62: aload 9
    //   64: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: astore 8
    //   69: aload 8
    //   71: iload 5
    //   73: invokevirtual 108	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   76: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: astore 10
    //   81: aload 7
    //   83: aload 10
    //   85: invokestatic 116	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   88: pop
    //   89: iload 4
    //   91: ireturn
    //   92: aload_0
    //   93: aload_1
    //   94: invokespecial 120	com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser:moveToExifSegmentAndGetLength	(Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader;)I
    //   97: istore 5
    //   99: iload 5
    //   101: iload 4
    //   103: if_icmpne +39 -> 142
    //   106: ldc 41
    //   108: astore 10
    //   110: aload 10
    //   112: iload_3
    //   113: invokestatic 96	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   116: istore 5
    //   118: iload 5
    //   120: ifeq -31 -> 89
    //   123: ldc 41
    //   125: astore 10
    //   127: ldc 122
    //   129: astore 7
    //   131: aload 10
    //   133: aload 7
    //   135: invokestatic 116	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   138: pop
    //   139: goto -50 -> 89
    //   142: aload_2
    //   143: iload 5
    //   145: ldc 123
    //   147: invokeinterface 129 3 0
    //   152: checkcast 123	[B
    //   155: astore 11
    //   157: aload_0
    //   158: aload_1
    //   159: aload 11
    //   161: iload 5
    //   163: invokespecial 133	com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser:parseExifSegment	(Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader;[BI)I
    //   166: istore 5
    //   168: aload_2
    //   169: aload 11
    //   171: invokeinterface 137 2 0
    //   176: iload 5
    //   178: istore 4
    //   180: goto -91 -> 89
    //   183: astore 10
    //   185: aload_2
    //   186: aload 11
    //   188: invokeinterface 137 2 0
    //   193: aload 10
    //   195: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	DefaultImageHeaderParser
    //   0	196	1	paramReader	DefaultImageHeaderParser.Reader
    //   0	196	2	paramArrayPool	ArrayPool
    //   1	112	3	i	int
    //   3	176	4	j	int
    //   11	93	5	k	int
    //   116	46	5	m	int
    //   166	11	5	n	int
    //   18	20	6	bool	boolean
    //   27	107	7	str1	String
    //   49	21	8	localStringBuilder	StringBuilder
    //   58	5	9	str2	String
    //   79	53	10	str3	String
    //   183	11	10	localObject	Object
    //   155	32	11	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   161	166	183	finally
  }
  
  private ImageHeaderParser.ImageType getType(DefaultImageHeaderParser.Reader paramReader)
  {
    long l1 = 4;
    int i = (char)-1;
    int j = -65536;
    int k = paramReader.getUInt16();
    int m = (char)-40;
    ImageHeaderParser.ImageType localImageType;
    if (k == m) {
      localImageType = ImageHeaderParser.ImageType.JPEG;
    }
    for (;;)
    {
      return localImageType;
      k = k << 16 & j;
      m = paramReader.getUInt16() & i;
      k |= m;
      m = -1991225785;
      if (k == m)
      {
        long l2 = 21;
        paramReader.skip(l2);
        k = paramReader.getByte();
        m = 3;
        if (k >= m) {
          localImageType = ImageHeaderParser.ImageType.PNG_A;
        } else {
          localImageType = ImageHeaderParser.ImageType.PNG;
        }
      }
      else
      {
        m = k >> 8;
        int n = 4671814;
        if (m == n)
        {
          localImageType = ImageHeaderParser.ImageType.GIF;
        }
        else
        {
          m = 1380533830;
          if (k != m)
          {
            localImageType = ImageHeaderParser.ImageType.UNKNOWN;
          }
          else
          {
            paramReader.skip(l1);
            k = paramReader.getUInt16() << 16 & j;
            m = paramReader.getUInt16() & i;
            k |= m;
            m = 1464156752;
            if (k != m)
            {
              localImageType = ImageHeaderParser.ImageType.UNKNOWN;
            }
            else
            {
              k = paramReader.getUInt16() << 16 & j;
              m = paramReader.getUInt16() & i;
              k |= m;
              m = k & 0xFF00;
              n = 1448097792;
              if (m != n)
              {
                localImageType = ImageHeaderParser.ImageType.UNKNOWN;
              }
              else
              {
                m = k & 0xFF;
                n = 88;
                if (m == n)
                {
                  paramReader.skip(l1);
                  k = paramReader.getByte() & 0x10;
                  if (k != 0) {
                    localImageType = ImageHeaderParser.ImageType.WEBP_A;
                  } else {
                    localImageType = ImageHeaderParser.ImageType.WEBP;
                  }
                }
                else
                {
                  k &= 0xFF;
                  m = 76;
                  if (k == m)
                  {
                    paramReader.skip(l1);
                    k = paramReader.getByte() & 0x8;
                    if (k != 0) {
                      localImageType = ImageHeaderParser.ImageType.WEBP_A;
                    } else {
                      localImageType = ImageHeaderParser.ImageType.WEBP;
                    }
                  }
                  else
                  {
                    localImageType = ImageHeaderParser.ImageType.WEBP;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private static boolean handles(int paramInt)
  {
    int i = (char)-40;
    int j = paramInt & i;
    if (j != i)
    {
      j = 19789;
      if (paramInt != j)
      {
        j = 18761;
        if (paramInt != j) {
          break label35;
        }
      }
    }
    label35:
    for (j = 1;; j = 0) {
      return j;
    }
  }
  
  private boolean hasJpegExifPreamble(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = false;
    int i;
    boolean bool2;
    if (paramArrayOfByte != null)
    {
      byte[] arrayOfByte1 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
      i = arrayOfByte1.length;
      if (paramInt > i)
      {
        bool2 = true;
        if (!bool2) {
          break label95;
        }
        i = 0;
        arrayOfByte1 = null;
        label36:
        byte[] arrayOfByte2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
        int j = arrayOfByte2.length;
        if (i >= j) {
          break label95;
        }
        j = paramArrayOfByte[i];
        byte[] arrayOfByte3 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
        int k = arrayOfByte3[i];
        if (j == k) {
          break label86;
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      break;
      label86:
      i += 1;
      break label36;
      label95:
      bool1 = bool2;
    }
  }
  
  private int moveToExifSegmentAndGetLength(DefaultImageHeaderParser.Reader paramReader)
  {
    int i = 3;
    int j = -1;
    int k = paramReader.getUInt8();
    int n = 255;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (k != n)
    {
      localObject1 = "DfltImageHeaderParser";
      boolean bool2 = Log.isLoggable((String)localObject1, i);
      if (bool2)
      {
        localObject1 = "DfltImageHeaderParser";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str1 = "Unknown segmentId=";
        localObject2 = ((StringBuilder)localObject2).append(str1);
        localObject3 = k;
        Log.d((String)localObject1, (String)localObject3);
      }
    }
    for (;;)
    {
      return j;
      int i1 = paramReader.getUInt8();
      k = 218;
      if (i1 != k)
      {
        k = 217;
        if (i1 == k)
        {
          localObject3 = "DfltImageHeaderParser";
          boolean bool1 = Log.isLoggable((String)localObject3, i);
          if (bool1)
          {
            localObject3 = "DfltImageHeaderParser";
            localObject1 = "Found MARKER_EOI in exif segment";
            Log.d((String)localObject3, (String)localObject1);
          }
        }
        else
        {
          int m = paramReader.getUInt16() + -2;
          int i2 = 225;
          if (i1 != i2)
          {
            long l1 = m;
            l1 = paramReader.skip(l1);
            long l2 = m;
            boolean bool3 = l1 < l2;
            if (!bool3) {
              break;
            }
            localObject2 = "DfltImageHeaderParser";
            bool3 = Log.isLoggable((String)localObject2, i);
            if (!bool3) {
              continue;
            }
            localObject2 = "DfltImageHeaderParser";
            Object localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            String str2 = "Unable to skip enough data, type: ";
            localObject1 = ((StringBuilder)localObject4).append(str2).append(i1);
            localObject4 = ", wanted to skip: ";
            localObject3 = ((StringBuilder)localObject1).append((String)localObject4).append(m);
            localObject1 = ", but actually skipped: ";
            localObject3 = (String)localObject1 + l1;
            Log.d((String)localObject2, (String)localObject3);
            continue;
          }
          j = m;
        }
      }
    }
  }
  
  private static int parseExifSegment(DefaultImageHeaderParser.RandomAccessReader paramRandomAccessReader)
  {
    int i = 3;
    Object localObject1 = "Exif\000\000";
    int j = ((String)localObject1).length();
    int k = paramRandomAccessReader.getInt16(j);
    Object localObject2;
    Object localObject3;
    label145:
    int n;
    int i3;
    int i4;
    switch (k)
    {
    default: 
      String str1 = "DfltImageHeaderParser";
      boolean bool1 = Log.isLoggable(str1, i);
      if (bool1)
      {
        str1 = "DfltImageHeaderParser";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Unknown endianness = ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject1 = k;
        Log.d(str1, (String)localObject1);
      }
      localObject1 = ByteOrder.BIG_ENDIAN;
      paramRandomAccessReader.order((ByteOrder)localObject1);
      k = j + 4;
      k = paramRandomAccessReader.getInt32(k);
      j += k;
      int m = paramRandomAccessReader.getInt16(j);
      k = 0;
      localObject1 = null;
      if (k >= m) {
        break label753;
      }
      n = calcTagOffset(j, k);
      i3 = paramRandomAccessReader.getInt16(n);
      i4 = 274;
      if (i3 == i4) {
        break;
      }
    }
    int i2;
    for (;;)
    {
      k += 1;
      break label145;
      localObject1 = ByteOrder.BIG_ENDIAN;
      break;
      localObject1 = ByteOrder.LITTLE_ENDIAN;
      break;
      i4 = n + 2;
      i4 = paramRandomAccessReader.getInt16(i4);
      int i6 = 1;
      boolean bool2;
      Object localObject4;
      if (i4 >= i6)
      {
        i6 = 12;
        if (i4 <= i6) {}
      }
      else
      {
        localObject2 = "DfltImageHeaderParser";
        bool2 = Log.isLoggable((String)localObject2, i);
        if (!bool2) {
          continue;
        }
        localObject2 = "DfltImageHeaderParser";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "Got invalid format code = ";
        localObject3 = (String)localObject4 + i4;
        Log.d((String)localObject2, (String)localObject3);
        continue;
      }
      i6 = bool2 + true;
      i6 = paramRandomAccessReader.getInt32(i6);
      if (i6 < 0)
      {
        localObject2 = "DfltImageHeaderParser";
        bool2 = Log.isLoggable((String)localObject2, i);
        if (bool2)
        {
          localObject2 = "DfltImageHeaderParser";
          localObject3 = "Negative tiff component count";
          Log.d((String)localObject2, (String)localObject3);
        }
      }
      else
      {
        Object localObject5 = "DfltImageHeaderParser";
        boolean bool4 = Log.isLoggable((String)localObject5, i);
        if (bool4)
        {
          localObject5 = "DfltImageHeaderParser";
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject6 = ((StringBuilder)localObject6).append("Got tagIndex=").append(k).append(" tagType=").append(i3).append(" formatCode=").append(i4);
          String str2 = " componentCount=";
          localObject6 = str2 + i6;
          Log.d((String)localObject5, (String)localObject6);
        }
        localObject5 = BYTES_PER_FORMAT;
        int i7 = localObject5[i4];
        i6 += i7;
        i7 = 4;
        if (i6 > i7)
        {
          localObject2 = "DfltImageHeaderParser";
          bool2 = Log.isLoggable((String)localObject2, i);
          if (bool2)
          {
            localObject2 = "DfltImageHeaderParser";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "Got byte count > 4, not orientation, continuing, formatCode=";
            localObject3 = (String)localObject4 + i4;
            Log.d((String)localObject2, (String)localObject3);
          }
        }
        else
        {
          int i1;
          bool2 += true;
          Object localObject7;
          if (i1 >= 0)
          {
            i4 = paramRandomAccessReader.length();
            if (i1 <= i4) {}
          }
          else
          {
            localObject7 = "DfltImageHeaderParser";
            boolean bool3 = Log.isLoggable((String)localObject7, i);
            if (!bool3) {
              continue;
            }
            localObject7 = "DfltImageHeaderParser";
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject5 = "Illegal tagValueOffset=";
            localObject2 = ((StringBuilder)localObject4).append((String)localObject5).append(i1);
            localObject4 = " tagType=";
            localObject2 = (String)localObject4 + i3;
            Log.d((String)localObject7, (String)localObject2);
            continue;
          }
          if (i6 >= 0)
          {
            int i5 = i1 + i6;
            i6 = paramRandomAccessReader.length();
            if (i5 <= i6) {
              break label742;
            }
          }
          localObject2 = "DfltImageHeaderParser";
          i2 = Log.isLoggable((String)localObject2, i);
          if (i2 != 0)
          {
            localObject2 = "DfltImageHeaderParser";
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            localObject4 = "Illegal number of bytes for TI tag data tagType=";
            localObject7 = ((StringBuilder)localObject7).append((String)localObject4);
            localObject3 = i3;
            Log.d((String)localObject2, (String)localObject3);
          }
        }
      }
    }
    label742:
    label753:
    for (k = paramRandomAccessReader.getInt16(i2);; k = -1) {
      return k;
    }
  }
  
  private int parseExifSegment(DefaultImageHeaderParser.Reader paramReader, byte[] paramArrayOfByte, int paramInt)
  {
    int i = 3;
    int j = -1;
    int k = paramReader.read(paramArrayOfByte, paramInt);
    String str1;
    String str3;
    if (k != paramInt)
    {
      str1 = "DfltImageHeaderParser";
      boolean bool2 = Log.isLoggable(str1, i);
      if (bool2)
      {
        str1 = "DfltImageHeaderParser";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Unable to read exif segment data, length: ").append(paramInt);
        String str2 = ", actually read: ";
        localStringBuilder = localStringBuilder.append(str2);
        str3 = k;
        Log.d(str1, str3);
      }
    }
    for (;;)
    {
      return j;
      boolean bool1 = hasJpegExifPreamble(paramArrayOfByte, paramInt);
      if (bool1)
      {
        DefaultImageHeaderParser.RandomAccessReader localRandomAccessReader = new com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$RandomAccessReader;
        localRandomAccessReader.<init>(paramArrayOfByte, paramInt);
        j = parseExifSegment(localRandomAccessReader);
      }
      else
      {
        str3 = "DfltImageHeaderParser";
        bool1 = Log.isLoggable(str3, i);
        if (bool1)
        {
          str3 = "DfltImageHeaderParser";
          str1 = "Missing jpeg exif preamble";
          Log.d(str3, str1);
        }
      }
    }
  }
  
  public int getOrientation(InputStream paramInputStream, ArrayPool paramArrayPool)
  {
    DefaultImageHeaderParser.StreamReader localStreamReader = new com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$StreamReader;
    Object localObject = (InputStream)Preconditions.checkNotNull(paramInputStream);
    localStreamReader.<init>((InputStream)localObject);
    localObject = (ArrayPool)Preconditions.checkNotNull(paramArrayPool);
    return getOrientation(localStreamReader, (ArrayPool)localObject);
  }
  
  public int getOrientation(ByteBuffer paramByteBuffer, ArrayPool paramArrayPool)
  {
    DefaultImageHeaderParser.ByteBufferReader localByteBufferReader = new com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$ByteBufferReader;
    Object localObject = (ByteBuffer)Preconditions.checkNotNull(paramByteBuffer);
    localByteBufferReader.<init>((ByteBuffer)localObject);
    localObject = (ArrayPool)Preconditions.checkNotNull(paramArrayPool);
    return getOrientation(localByteBufferReader, (ArrayPool)localObject);
  }
  
  public ImageHeaderParser.ImageType getType(InputStream paramInputStream)
  {
    DefaultImageHeaderParser.StreamReader localStreamReader = new com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$StreamReader;
    InputStream localInputStream = (InputStream)Preconditions.checkNotNull(paramInputStream);
    localStreamReader.<init>(localInputStream);
    return getType(localStreamReader);
  }
  
  public ImageHeaderParser.ImageType getType(ByteBuffer paramByteBuffer)
  {
    DefaultImageHeaderParser.ByteBufferReader localByteBufferReader = new com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$ByteBufferReader;
    ByteBuffer localByteBuffer = (ByteBuffer)Preconditions.checkNotNull(paramByteBuffer);
    localByteBufferReader.<init>(localByteBuffer);
    return getType(localByteBufferReader);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DefaultImageHeaderParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */