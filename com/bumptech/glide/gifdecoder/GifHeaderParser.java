package com.bumptech.glide.gifdecoder;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

public class GifHeaderParser
{
  static final int DEFAULT_FRAME_DELAY = 10;
  private static final int DESCRIPTOR_MASK_INTERLACE_FLAG = 64;
  private static final int DESCRIPTOR_MASK_LCT_FLAG = 128;
  private static final int DESCRIPTOR_MASK_LCT_SIZE = 7;
  private static final int EXTENSION_INTRODUCER = 33;
  private static final int GCE_DISPOSAL_METHOD_SHIFT = 2;
  private static final int GCE_MASK_DISPOSAL_METHOD = 28;
  private static final int GCE_MASK_TRANSPARENT_COLOR_FLAG = 1;
  private static final int IMAGE_SEPARATOR = 44;
  private static final int LABEL_APPLICATION_EXTENSION = 255;
  private static final int LABEL_COMMENT_EXTENSION = 254;
  private static final int LABEL_GRAPHIC_CONTROL_EXTENSION = 249;
  private static final int LABEL_PLAIN_TEXT_EXTENSION = 1;
  private static final int LSD_MASK_GCT_FLAG = 128;
  private static final int LSD_MASK_GCT_SIZE = 7;
  private static final int MASK_INT_LOWEST_BYTE = 255;
  private static final int MAX_BLOCK_SIZE = 256;
  static final int MIN_FRAME_DELAY = 2;
  private static final String TAG = "GifHeaderParser";
  private static final int TRAILER = 59;
  private final byte[] block;
  private int blockSize;
  private GifHeader header;
  private ByteBuffer rawData;
  
  public GifHeaderParser()
  {
    byte[] arrayOfByte = new byte['Ā'];
    this.block = arrayOfByte;
    this.blockSize = 0;
  }
  
  private boolean err()
  {
    GifHeader localGifHeader = this.header;
    int i = localGifHeader.status;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localGifHeader = null;
    }
  }
  
  private int read()
  {
    int i = 0;
    try
    {
      ByteBuffer localByteBuffer = this.rawData;
      i = localByteBuffer.get() & 0xFF;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        GifHeader localGifHeader = this.header;
        int j = 1;
        localGifHeader.status = j;
      }
    }
    return i;
  }
  
  private void readBitmap()
  {
    int i = 1;
    Object localObject1 = this.header.currentFrame;
    int j = readShort();
    ((GifFrame)localObject1).ix = j;
    localObject1 = this.header.currentFrame;
    j = readShort();
    ((GifFrame)localObject1).iy = j;
    localObject1 = this.header.currentFrame;
    j = readShort();
    ((GifFrame)localObject1).iw = j;
    localObject1 = this.header.currentFrame;
    j = readShort();
    ((GifFrame)localObject1).ih = j;
    j = read();
    int k = j & 0x80;
    label140:
    Object localObject2;
    label173:
    boolean bool;
    if (k != 0)
    {
      k = i;
      int m = (j & 0x7) + 1;
      double d1 = m;
      double d2 = Math.pow(2.0D, d1);
      int n = (int)d2;
      GifFrame localGifFrame = this.header.currentFrame;
      j &= 0x40;
      if (j == 0) {
        break label222;
      }
      localGifFrame.interlace = i;
      if (k == 0) {
        break label230;
      }
      localObject1 = this.header.currentFrame;
      localObject2 = readColorTable(n);
      ((GifFrame)localObject1).lct = ((int[])localObject2);
      localObject1 = this.header.currentFrame;
      localObject2 = this.rawData;
      i = ((ByteBuffer)localObject2).position();
      ((GifFrame)localObject1).bufferFrameStart = i;
      skipImageData();
      bool = err();
      if (!bool) {
        break label251;
      }
    }
    for (;;)
    {
      return;
      bool = false;
      localObject1 = null;
      break;
      label222:
      i = 0;
      localObject2 = null;
      break label140;
      label230:
      localObject1 = this.header.currentFrame;
      i = 0;
      localObject2 = null;
      ((GifFrame)localObject1).lct = null;
      break label173;
      label251:
      localObject1 = this.header;
      i = ((GifHeader)localObject1).frameCount + 1;
      ((GifHeader)localObject1).frameCount = i;
      localObject1 = this.header.frames;
      localObject2 = this.header.currentFrame;
      ((List)localObject1).add(localObject2);
    }
  }
  
  private void readBlock()
  {
    int i = 0;
    Object localObject1 = null;
    int j = read();
    this.blockSize = j;
    j = this.blockSize;
    if (j > 0)
    {
      int k = 0;
      Object localObject2 = null;
      try
      {
        Object localObject3;
        for (;;)
        {
          j = this.blockSize;
          if (k >= j) {
            break;
          }
          j = this.blockSize;
          i = j - k;
          ByteBuffer localByteBuffer = this.rawData;
          localObject3 = this.block;
          localByteBuffer.get((byte[])localObject3, k, i);
          j = k + i;
          k = j;
        }
        int m;
        boolean bool;
        Object localObject4;
        String str;
        GifHeader localGifHeader;
        return;
      }
      catch (Exception localException)
      {
        localObject3 = "GifHeaderParser";
        m = 3;
        bool = Log.isLoggable((String)localObject3, m);
        if (bool)
        {
          localObject3 = "GifHeaderParser";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = "Error Reading Block n: ";
          localObject2 = ((StringBuilder)localObject4).append(str).append(k);
          localObject4 = " count: ";
          localObject1 = ((StringBuilder)localObject2).append((String)localObject4).append(i);
          localObject2 = " blockSize: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          k = this.blockSize;
          localObject1 = k;
          Log.d((String)localObject3, (String)localObject1, localException);
        }
        localGifHeader = this.header;
        i = 1;
        localGifHeader.status = i;
      }
    }
  }
  
  /* Error */
  private int[] readColorTable(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iload_1
    //   5: iconst_3
    //   6: imul
    //   7: istore 4
    //   9: iconst_0
    //   10: istore 5
    //   12: aconst_null
    //   13: astore 6
    //   15: iload 4
    //   17: newarray <illegal type>
    //   19: astore 7
    //   21: aload_0
    //   22: getfield 69	com/bumptech/glide/gifdecoder/GifHeaderParser:rawData	Ljava/nio/ByteBuffer;
    //   25: astore 8
    //   27: aload 8
    //   29: aload 7
    //   31: invokevirtual 187	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   34: pop
    //   35: sipush 256
    //   38: istore 4
    //   40: iload 4
    //   42: newarray <illegal type>
    //   44: astore 8
    //   46: iconst_0
    //   47: istore 5
    //   49: aconst_null
    //   50: astore 6
    //   52: iload_2
    //   53: iload_1
    //   54: if_icmpge +165 -> 219
    //   57: iload 5
    //   59: iconst_1
    //   60: iadd
    //   61: istore 9
    //   63: aload 7
    //   65: iload 5
    //   67: baload
    //   68: istore 5
    //   70: iload 5
    //   72: sipush 255
    //   75: iand
    //   76: istore 10
    //   78: iload 9
    //   80: iconst_1
    //   81: iadd
    //   82: istore 11
    //   84: aload 7
    //   86: iload 9
    //   88: baload
    //   89: sipush 255
    //   92: iand
    //   93: istore 12
    //   95: iload 11
    //   97: iconst_1
    //   98: iadd
    //   99: istore 5
    //   101: aload 7
    //   103: iload 11
    //   105: baload
    //   106: sipush 255
    //   109: iand
    //   110: istore 11
    //   112: iload_2
    //   113: iconst_1
    //   114: iadd
    //   115: istore 9
    //   117: ldc -68
    //   119: istore 13
    //   121: iload 10
    //   123: bipush 16
    //   125: ishl
    //   126: iload 13
    //   128: ior
    //   129: istore 10
    //   131: iload 12
    //   133: bipush 8
    //   135: ishl
    //   136: istore 12
    //   138: iload 10
    //   140: iload 12
    //   142: ior
    //   143: iload 11
    //   145: ior
    //   146: istore 10
    //   148: aload 8
    //   150: iload_2
    //   151: iload 10
    //   153: iastore
    //   154: iload 9
    //   156: istore_2
    //   157: goto -105 -> 52
    //   160: astore 14
    //   162: iconst_0
    //   163: istore 4
    //   165: aconst_null
    //   166: astore 8
    //   168: aload 14
    //   170: astore 6
    //   172: ldc 41
    //   174: astore_3
    //   175: iconst_3
    //   176: istore 9
    //   178: aload_3
    //   179: iload 9
    //   181: invokestatic 160	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   184: istore_2
    //   185: iload_2
    //   186: ifeq +19 -> 205
    //   189: ldc 41
    //   191: astore_3
    //   192: ldc -65
    //   194: astore 15
    //   196: aload_3
    //   197: aload 15
    //   199: aload 6
    //   201: invokestatic 184	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   204: pop
    //   205: aload_0
    //   206: getfield 61	com/bumptech/glide/gifdecoder/GifHeaderParser:header	Lcom/bumptech/glide/gifdecoder/GifHeader;
    //   209: astore 6
    //   211: iconst_1
    //   212: istore_2
    //   213: aload 6
    //   215: iload_2
    //   216: putfield 66	com/bumptech/glide/gifdecoder/GifHeader:status	I
    //   219: aload 8
    //   221: areturn
    //   222: astore 6
    //   224: goto -52 -> 172
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	this	GifHeaderParser
    //   0	227	1	paramInt	int
    //   1	156	2	i	int
    //   184	32	2	j	int
    //   3	194	3	str1	String
    //   7	157	4	k	int
    //   10	90	5	m	int
    //   13	201	6	localObject1	Object
    //   222	1	6	localBufferUnderflowException1	java.nio.BufferUnderflowException
    //   19	83	7	arrayOfByte	byte[]
    //   25	195	8	localObject2	Object
    //   61	119	9	n	int
    //   76	76	10	i1	int
    //   82	64	11	i2	int
    //   93	50	12	i3	int
    //   119	10	13	i4	int
    //   160	9	14	localBufferUnderflowException2	java.nio.BufferUnderflowException
    //   194	4	15	str2	String
    // Exception table:
    //   from	to	target	type
    //   21	25	160	java/nio/BufferUnderflowException
    //   29	35	160	java/nio/BufferUnderflowException
    //   40	44	160	java/nio/BufferUnderflowException
    //   65	68	222	java/nio/BufferUnderflowException
    //   86	89	222	java/nio/BufferUnderflowException
    //   103	106	222	java/nio/BufferUnderflowException
    //   151	154	222	java/nio/BufferUnderflowException
  }
  
  private void readContents()
  {
    readContents(-1 >>> 1);
  }
  
  private void readContents(int paramInt)
  {
    int i = 1;
    int j = 0;
    while (j == 0)
    {
      boolean bool1 = err();
      if (bool1) {
        break;
      }
      Object localObject1 = this.header;
      int k = ((GifHeader)localObject1).frameCount;
      if (k > paramInt) {
        break;
      }
      k = read();
      Object localObject2;
      switch (k)
      {
      default: 
        localObject1 = this.header;
        ((GifHeader)localObject1).status = i;
        break;
      case 44: 
        localObject1 = this.header.currentFrame;
        if (localObject1 == null)
        {
          localObject1 = this.header;
          localObject2 = new com/bumptech/glide/gifdecoder/GifFrame;
          ((GifFrame)localObject2).<init>();
          ((GifHeader)localObject1).currentFrame = ((GifFrame)localObject2);
        }
        readBitmap();
        break;
      case 33: 
        k = read();
        switch (k)
        {
        default: 
          skip();
          break;
        case 249: 
          localObject1 = this.header;
          localObject2 = new com/bumptech/glide/gifdecoder/GifFrame;
          ((GifFrame)localObject2).<init>();
          ((GifHeader)localObject1).currentFrame = ((GifFrame)localObject2);
          readGraphicControlExt();
          break;
        case 255: 
          readBlock();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          k = 0;
          localObject1 = null;
          for (;;)
          {
            int m = 11;
            if (k >= m) {
              break;
            }
            byte[] arrayOfByte = this.block;
            m = (char)arrayOfByte[k];
            ((StringBuilder)localObject2).append(m);
            k += 1;
          }
          localObject1 = ((StringBuilder)localObject2).toString();
          localObject2 = "NETSCAPE2.0";
          boolean bool2 = ((String)localObject1).equals(localObject2);
          if (bool2) {
            readNetscapeExt();
          } else {
            skip();
          }
          break;
        case 254: 
          skip();
          break;
        case 1: 
          skip();
        }
        break;
      case 59: 
        j = i;
      }
    }
  }
  
  private void readGraphicControlExt()
  {
    int i = 1;
    read();
    int j = read();
    GifFrame localGifFrame1 = this.header.currentFrame;
    int k = (j & 0x1C) >> 2;
    localGifFrame1.dispose = k;
    localGifFrame1 = this.header.currentFrame;
    int m = localGifFrame1.dispose;
    if (m == 0)
    {
      localGifFrame1 = this.header.currentFrame;
      localGifFrame1.dispose = i;
    }
    localGifFrame1 = this.header.currentFrame;
    j &= 0x1;
    if (j != 0) {}
    for (;;)
    {
      localGifFrame1.transparency = i;
      i = readShort();
      j = 2;
      if (i < j) {
        i = 10;
      }
      GifFrame localGifFrame2 = this.header.currentFrame;
      i *= 10;
      localGifFrame2.delay = i;
      GifFrame localGifFrame3 = this.header.currentFrame;
      j = read();
      localGifFrame3.transIndex = j;
      read();
      return;
      i = 0;
      localGifFrame3 = null;
    }
  }
  
  private void readHeader()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    int i = 0;
    Object localObject2 = null;
    for (;;)
    {
      int j = 6;
      if (i >= j) {
        break;
      }
      j = (char)read();
      ((StringBuilder)localObject1).append(j);
      i += 1;
    }
    localObject2 = ((StringBuilder)localObject1).toString();
    localObject1 = "GIF";
    boolean bool = ((String)localObject2).startsWith((String)localObject1);
    int m;
    if (!bool)
    {
      localObject2 = this.header;
      m = 1;
      ((GifHeader)localObject2).status = m;
    }
    for (;;)
    {
      return;
      readLSD();
      localObject2 = this.header;
      bool = ((GifHeader)localObject2).gctFlag;
      if (bool)
      {
        bool = err();
        if (!bool)
        {
          localObject2 = this.header;
          m = this.header.gctSize;
          localObject1 = readColorTable(m);
          ((GifHeader)localObject2).gct = ((int[])localObject1);
          localObject2 = this.header;
          localObject1 = this.header.gct;
          GifHeader localGifHeader = this.header;
          int k = localGifHeader.bgIndex;
          m = localObject1[k];
          ((GifHeader)localObject2).bgColor = m;
        }
      }
    }
  }
  
  private void readLSD()
  {
    GifHeader localGifHeader1 = this.header;
    int i = readShort();
    localGifHeader1.width = i;
    localGifHeader1 = this.header;
    i = readShort();
    localGifHeader1.height = i;
    i = read();
    GifHeader localGifHeader2 = this.header;
    int j = i & 0x80;
    if (j != 0) {
      j = 1;
    }
    for (;;)
    {
      localGifHeader2.gctFlag = j;
      localGifHeader1 = this.header;
      double d = (i & 0x7) + 1;
      i = (int)Math.pow(2.0D, d);
      localGifHeader1.gctSize = i;
      localGifHeader1 = this.header;
      i = read();
      localGifHeader1.bgIndex = i;
      localGifHeader1 = this.header;
      i = read();
      localGifHeader1.pixelAspect = i;
      return;
      j = 0;
      localGifHeader1 = null;
    }
  }
  
  private void readNetscapeExt()
  {
    int i = 1;
    boolean bool;
    do
    {
      readBlock();
      byte[] arrayOfByte1 = this.block;
      int j = 0;
      byte[] arrayOfByte2 = null;
      int k = arrayOfByte1[0];
      if (k == i)
      {
        arrayOfByte1 = this.block;
        k = arrayOfByte1[i] & 0xFF;
        arrayOfByte2 = this.block;
        int m = 2;
        j = arrayOfByte2[m] & 0xFF;
        GifHeader localGifHeader = this.header;
        j <<= 8;
        k |= j;
        localGifHeader.loopCount = k;
      }
      k = this.blockSize;
      if (k <= 0) {
        break;
      }
      bool = err();
    } while (!bool);
  }
  
  private int readShort()
  {
    return this.rawData.getShort();
  }
  
  private void reset()
  {
    this.rawData = null;
    Arrays.fill(this.block, (byte)0);
    GifHeader localGifHeader = new com/bumptech/glide/gifdecoder/GifHeader;
    localGifHeader.<init>();
    this.header = localGifHeader;
    this.blockSize = 0;
  }
  
  private void skip()
  {
    int i;
    do
    {
      i = read();
      ByteBuffer localByteBuffer1 = this.rawData;
      int j = localByteBuffer1.position() + i;
      int k = this.rawData.limit();
      j = Math.min(j, k);
      ByteBuffer localByteBuffer2 = this.rawData;
      localByteBuffer2.position(j);
    } while (i > 0);
  }
  
  private void skipImageData()
  {
    read();
    skip();
  }
  
  public void clear()
  {
    this.rawData = null;
    this.header = null;
  }
  
  public boolean isAnimated()
  {
    int i = 1;
    readHeader();
    boolean bool = err();
    if (!bool)
    {
      j = 2;
      readContents(j);
    }
    GifHeader localGifHeader = this.header;
    int j = localGifHeader.frameCount;
    if (j > i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public GifHeader parseHeader()
  {
    Object localObject = this.rawData;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("You must call setData() before parseHeader()");
      throw ((Throwable)localObject);
    }
    boolean bool = err();
    if (bool) {}
    for (localObject = this.header;; localObject = this.header)
    {
      return (GifHeader)localObject;
      readHeader();
      bool = err();
      if (!bool)
      {
        readContents();
        localObject = this.header;
        int i = ((GifHeader)localObject).frameCount;
        if (i < 0)
        {
          localObject = this.header;
          int j = 1;
          ((GifHeader)localObject).status = j;
        }
      }
    }
  }
  
  public GifHeaderParser setData(ByteBuffer paramByteBuffer)
  {
    reset();
    ByteBuffer localByteBuffer = paramByteBuffer.asReadOnlyBuffer();
    this.rawData = localByteBuffer;
    this.rawData.position(0);
    localByteBuffer = this.rawData;
    ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
    localByteBuffer.order(localByteOrder);
    return this;
  }
  
  public GifHeaderParser setData(byte[] paramArrayOfByte)
  {
    Object localObject;
    if (paramArrayOfByte != null)
    {
      localObject = ByteBuffer.wrap(paramArrayOfByte);
      setData((ByteBuffer)localObject);
    }
    for (;;)
    {
      return this;
      this.rawData = null;
      localObject = this.header;
      int i = 2;
      ((GifHeader)localObject).status = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\gifdecoder\GifHeaderParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */