package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StandardGifDecoder
  implements GifDecoder
{
  private static final int BYTES_PER_INTEGER = 4;
  private static final int COLOR_TRANSPARENT_BLACK = 0;
  private static final int INITIAL_FRAME_POINTER = 255;
  private static final int MASK_INT_LOWEST_BYTE = 255;
  private static final int MAX_STACK_SIZE = 4096;
  private static final int NULL_CODE = 255;
  private static final String TAG = StandardGifDecoder.class.getSimpleName();
  private int[] act;
  private Bitmap.Config bitmapConfig;
  private final GifDecoder.BitmapProvider bitmapProvider;
  private byte[] block;
  private int downsampledHeight;
  private int downsampledWidth;
  private int framePointer;
  private GifHeader header;
  private Boolean isFirstFrameTransparent;
  private byte[] mainPixels;
  private int[] mainScratch;
  private GifHeaderParser parser;
  private final int[] pct;
  private byte[] pixelStack;
  private short[] prefix;
  private Bitmap previousImage;
  private ByteBuffer rawData;
  private int sampleSize;
  private boolean savePrevious;
  private int status;
  private byte[] suffix;
  
  public StandardGifDecoder(GifDecoder.BitmapProvider paramBitmapProvider)
  {
    Object localObject = new int['Ā'];
    this.pct = ((int[])localObject);
    localObject = Bitmap.Config.ARGB_8888;
    this.bitmapConfig = ((Bitmap.Config)localObject);
    this.bitmapProvider = paramBitmapProvider;
    localObject = new com/bumptech/glide/gifdecoder/GifHeader;
    ((GifHeader)localObject).<init>();
    this.header = ((GifHeader)localObject);
  }
  
  public StandardGifDecoder(GifDecoder.BitmapProvider paramBitmapProvider, GifHeader paramGifHeader, ByteBuffer paramByteBuffer)
  {
    this(paramBitmapProvider, paramGifHeader, paramByteBuffer, 1);
  }
  
  public StandardGifDecoder(GifDecoder.BitmapProvider paramBitmapProvider, GifHeader paramGifHeader, ByteBuffer paramByteBuffer, int paramInt)
  {
    this(paramBitmapProvider);
    setData(paramGifHeader, paramByteBuffer, paramInt);
  }
  
  private int averageColorsNear(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = paramInt1;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3;
    byte[] arrayOfByte;
    int[] arrayOfInt;
    int i4;
    for (;;)
    {
      i3 = this.sampleSize + paramInt1;
      if (j >= i3) {
        break;
      }
      arrayOfByte = this.mainPixels;
      i3 = arrayOfByte.length;
      if ((j >= i3) || (j >= paramInt2)) {
        break;
      }
      arrayOfByte = this.mainPixels;
      i3 = arrayOfByte[j] & 0xFF;
      arrayOfInt = this.act;
      i3 = arrayOfInt[i3];
      if (i3 != 0)
      {
        i4 = i3 >> 24 & 0xFF;
        i2 += i4;
        i4 = i3 >> 16 & 0xFF;
        i1 += i4;
        i4 = i3 >> 8 & 0xFF;
        n += i4;
        i3 &= 0xFF;
        m += i3;
        k += 1;
      }
      j += 1;
    }
    j = paramInt1 + paramInt3;
    for (;;)
    {
      i3 = paramInt1 + paramInt3;
      i4 = this.sampleSize;
      i3 += i4;
      if (j >= i3) {
        break;
      }
      arrayOfByte = this.mainPixels;
      i3 = arrayOfByte.length;
      if ((j >= i3) || (j >= paramInt2)) {
        break;
      }
      arrayOfByte = this.mainPixels;
      i3 = arrayOfByte[j] & 0xFF;
      arrayOfInt = this.act;
      i3 = arrayOfInt[i3];
      if (i3 != 0)
      {
        i4 = i3 >> 24 & 0xFF;
        i2 += i4;
        i4 = i3 >> 16 & 0xFF;
        i1 += i4;
        i4 = i3 >> 8 & 0xFF;
        n += i4;
        i3 &= 0xFF;
        m += i3;
        k += 1;
      }
      j += 1;
    }
    if (k == 0) {}
    for (;;)
    {
      return i;
      j = i2 / k << 24;
      i = i1 / k << 16;
      j |= i;
      i = n / k << 8;
      j |= i;
      k = m / k;
      i = j | k;
    }
  }
  
  private void copyCopyIntoScratchRobust(GifFrame paramGifFrame)
  {
    int[] arrayOfInt1 = this.mainScratch;
    int i = paramGifFrame.ih;
    int j = this.sampleSize;
    int i2 = i / j;
    i = paramGifFrame.iy;
    int k = this.sampleSize;
    int i3 = i / k;
    i = paramGifFrame.iw;
    int m = this.sampleSize;
    int i4 = i / m;
    i = paramGifFrame.ix;
    int n = this.sampleSize;
    int i5 = i / n;
    int i6 = 1;
    int i7 = 8;
    float f1 = 1.1E-44F;
    int i1 = 0;
    i = this.framePointer;
    int i9;
    int i10;
    int i11;
    int i13;
    byte[] arrayOfByte;
    int[] arrayOfInt2;
    Object localObject1;
    int i14;
    label141:
    label200:
    int i15;
    int i16;
    int i17;
    float f2;
    int i18;
    if (i == 0)
    {
      i = 1;
      i9 = this.sampleSize;
      i10 = this.downsampledWidth;
      i11 = this.downsampledHeight;
      i13 = i11;
      arrayOfByte = this.mainPixels;
      arrayOfInt2 = this.act;
      localObject1 = this.isFirstFrameTransparent;
      i14 = 0;
      if (i14 >= i2) {
        break label616;
      }
      boolean bool2 = paramGifFrame.interlace;
      if (!bool2) {
        break label659;
      }
      if (i1 >= i2) {
        i6 += 1;
      }
      switch (i6)
      {
      default: 
        i15 = i1 + i7;
        i16 = i15;
        i17 = i7;
        f2 = f1;
        i18 = i6;
      }
    }
    for (;;)
    {
      i7 = i1 + i3;
      i1 = 1;
      i11 = i9;
      label251:
      int i19;
      if (i9 == i1)
      {
        i1 = 1;
        i15 = i1;
        i11 = i13;
        if (i7 >= i13) {
          break label583;
        }
        i7 *= i10;
        i6 = i7 + i5;
        i1 = i6 + i4;
        i19 = i7 + i10;
        i11 = i19;
        if (i19 < i1) {
          i1 = i7 + i10;
        }
        i7 = i14 * i9;
        i11 = paramGifFrame.iw;
        i19 = i11;
        i7 *= i11;
        if (i15 == 0) {
          break label476;
        }
        localObject2 = localObject1;
        i20 = i6;
        i6 = i7;
        label349:
        if (i20 >= i1) {
          break label587;
        }
        i15 = arrayOfByte[i6] & 0xFF;
        i15 = arrayOfInt2[i15];
        if (i15 == 0) {
          break label450;
        }
        arrayOfInt1[i20] = i15;
      }
      for (;;)
      {
        i6 += i9;
        i20 += 1;
        break label349;
        i = 0;
        localBoolean = null;
        break;
        i1 = 4;
        break label200;
        i1 = 2;
        i7 = 4;
        f1 = 5.6E-45F;
        break label200;
        i1 = 1;
        i7 = 2;
        f1 = 2.8E-45F;
        break label200;
        i1 = 0;
        i15 = 0;
        break label251;
        label450:
        if ((i != 0) && (localObject2 == null))
        {
          i7 = 1;
          f1 = Float.MIN_VALUE;
          localObject2 = Boolean.valueOf(i7);
        }
      }
      label476:
      i15 = (i1 - i6) * i9 + i7;
      Object localObject2 = localObject1;
      int i20 = i6;
      i6 = i7;
      if (i20 < i1)
      {
        int i12 = paramGifFrame.iw;
        i19 = i12;
        i19 = averageColorsNear(i6, i15, i12);
        if (i19 != 0) {
          arrayOfInt1[i20] = i19;
        }
        for (;;)
        {
          i6 += i9;
          i20 += 1;
          break;
          if ((i != 0) && (localObject2 == null))
          {
            i8 = 1;
            f1 = Float.MIN_VALUE;
            localObject2 = Boolean.valueOf(i8);
          }
        }
        label583:
        localObject2 = localObject1;
      }
      label587:
      i14 += 1;
      localObject1 = localObject2;
      i1 = i16;
      i6 = i18;
      int i8 = i17;
      f1 = f2;
      break label141;
      label616:
      Boolean localBoolean = this.isFirstFrameTransparent;
      if (localBoolean == null)
      {
        if (localObject1 != null) {
          break label650;
        }
        i = 0;
        localBoolean = null;
      }
      for (;;)
      {
        localBoolean = Boolean.valueOf(i);
        this.isFirstFrameTransparent = localBoolean;
        return;
        label650:
        boolean bool1 = ((Boolean)localObject1).booleanValue();
      }
      label659:
      i16 = i1;
      i17 = i8;
      f2 = f1;
      i18 = i6;
      i1 = i14;
    }
  }
  
  private void copyIntoScratchFast(GifFrame paramGifFrame)
  {
    int[] arrayOfInt1 = this.mainScratch;
    int i = paramGifFrame.ih;
    int j = paramGifFrame.iy;
    int k = paramGifFrame.iw;
    int m = paramGifFrame.ix;
    int n = this.framePointer;
    int i2;
    byte[] arrayOfByte;
    int[] arrayOfInt2;
    int i3;
    int i4;
    int i5;
    if (n == 0)
    {
      n = 1;
      i2 = this.downsampledWidth;
      arrayOfByte = this.mainPixels;
      arrayOfInt2 = this.act;
      i3 = -1;
      i4 = 0;
      localBoolean1 = null;
      i5 = 0;
    }
    label148:
    Boolean localBoolean2;
    for (;;)
    {
      if (i5 >= i) {
        break label251;
      }
      int i6 = (i5 + j) * i2;
      int i7 = i6 + m;
      i4 = i7 + k;
      int i8 = i6 + i2;
      if (i8 < i4) {
        i4 = i6 + i2;
      }
      i6 = paramGifFrame.iw * i5;
      i8 = i7;
      int i9 = i6;
      i6 = i3;
      i3 = i9;
      if (i8 < i4)
      {
        i7 = arrayOfByte[i3];
        int i10 = i7 & 0xFF;
        int i11 = i10;
        if (i10 != i6)
        {
          i11 = arrayOfInt2[i10];
          if (i11 == 0) {
            break label227;
          }
          arrayOfInt1[i8] = i11;
        }
        for (;;)
        {
          i7 = i3 + 1;
          i8 += 1;
          i3 = i7;
          break label148;
          n = 0;
          localBoolean2 = null;
          break;
          label227:
          i6 = i7;
        }
      }
      i4 = i5 + 1;
      i5 = i4;
      i3 = i6;
    }
    label251:
    Boolean localBoolean1 = this.isFirstFrameTransparent;
    if ((localBoolean1 == null) && (n != 0))
    {
      n = -1;
      if (i3 != n) {
        n = 1;
      }
    }
    for (;;)
    {
      localBoolean2 = Boolean.valueOf(n);
      this.isFirstFrameTransparent = localBoolean2;
      return;
      int i1 = 0;
      localBoolean2 = null;
    }
  }
  
  private void decodeBitmapData(GifFrame paramGifFrame)
  {
    Object localObject2;
    if (paramGifFrame != null)
    {
      localObject1 = this;
      localObject2 = this.rawData;
      localObject1 = paramGifFrame;
      i = paramGifFrame.bufferFrameStart;
      ((ByteBuffer)localObject2).position(i);
    }
    int j;
    if (paramGifFrame == null)
    {
      localObject1 = this;
      localObject2 = this.header;
      j = ((GifHeader)localObject2).width;
      localObject3 = this.header;
      i = ((GifHeader)localObject3).height;
      j *= i;
    }
    byte[] arrayOfByte1;
    short[] arrayOfShort;
    byte[] arrayOfByte2;
    Object localObject4;
    int k;
    int m;
    int n;
    for (;;)
    {
      localObject1 = this;
      localObject3 = this.mainPixels;
      if (localObject3 != null)
      {
        localObject3 = this.mainPixels;
        i = localObject3.length;
        if (i >= j) {}
      }
      else
      {
        localObject1 = this;
        localObject3 = this.bitmapProvider.obtainByteArray(j);
        this.mainPixels = ((byte[])localObject3);
      }
      localObject1 = this;
      arrayOfByte1 = this.mainPixels;
      localObject1 = this;
      localObject3 = this.prefix;
      if (localObject3 == null)
      {
        i = 4096;
        localObject3 = new short[i];
        this.prefix = ((short[])localObject3);
      }
      localObject1 = this;
      arrayOfShort = this.prefix;
      localObject1 = this;
      localObject3 = this.suffix;
      if (localObject3 == null)
      {
        i = 4096;
        localObject3 = new byte[i];
        this.suffix = ((byte[])localObject3);
      }
      localObject1 = this;
      arrayOfByte2 = this.suffix;
      localObject1 = this;
      localObject3 = this.pixelStack;
      if (localObject3 == null)
      {
        i = 4097;
        localObject3 = new byte[i];
        this.pixelStack = ((byte[])localObject3);
      }
      localObject1 = this;
      localObject1 = this.pixelStack;
      localObject4 = localObject1;
      k = readByte();
      m = 1 << k;
      n = m + 1;
      i1 = m + 2;
      i2 = -1;
      i = k + 1;
      i3 = (1 << i) + -1;
      i4 = 0;
      while (i4 < m)
      {
        arrayOfShort[i4] = 0;
        i5 = (byte)i4;
        arrayOfByte2[i4] = i5;
        i4 += 1;
      }
      localObject1 = paramGifFrame;
      j = paramGifFrame.iw;
      i = paramGifFrame.ih;
      j *= i;
    }
    Object localObject1 = this;
    localObject1 = this.block;
    Object localObject5 = localObject1;
    int i6 = 0;
    int i4 = 0;
    int i5 = 0;
    int i7 = 0;
    float f = 0.0F;
    int i8 = i2;
    int i9 = i;
    int i10 = i3;
    int i11 = i1;
    int i = 0;
    Object localObject3 = null;
    int i1 = 0;
    int i3 = 0;
    int i2 = 0;
    for (;;)
    {
      if (i6 < j)
      {
        if (i3 != 0) {
          break label451;
        }
        i3 = readBlock();
        if (i3 <= 0)
        {
          i = 3;
          localObject1 = this;
          this.status = i;
        }
      }
      else
      {
        localObject1 = arrayOfByte1;
        Arrays.fill(arrayOfByte1, i4, j, (byte)0);
        return;
      }
      i = 0;
      localObject3 = null;
      label451:
      int i12 = (localObject5[i] & 0xFF) << i2;
      i1 += i12;
      i2 += 8;
      i12 = i + 1;
      int i13 = i3 + -1;
      i = i9;
      i3 = i10;
      i10 = i6;
      i6 = i4;
      i4 = i7;
      int i14 = i8;
      i8 = i1;
      i1 = i11;
      i11 = i2;
      i2 = i14;
      for (;;)
      {
        if (i11 >= i)
        {
          i7 = i8 & i3;
          i9 = i8 >> i;
          i11 -= i;
          if (i7 == m)
          {
            i = k + 1;
            i3 = (1 << i) + -1;
            i1 = m + 2;
            i7 = -1;
            f = 0.0F / 0.0F;
            i8 = i9;
            i2 = i7;
          }
          else
          {
            if (i7 == n)
            {
              i7 = i4;
              i8 = i2;
              i4 = i6;
              i2 = i11;
              i6 = i10;
              i11 = i1;
              i1 = i9;
              i10 = i3;
              i9 = i;
              i3 = i13;
              i = i12;
              break;
            }
            i8 = -1;
            if (i2 == i8)
            {
              i4 = arrayOfByte2[i7];
              arrayOfByte1[i6] = i4;
              i4 = i6 + 1;
              i6 = i10 + 1;
              i8 = i9;
              i10 = i6;
              i2 = i7;
              i6 = i4;
              i4 = i7;
            }
            else
            {
              if (i7 >= i1)
              {
                i4 = (byte)i4;
                localObject4[i5] = i4;
                i5 += 1;
                i4 = i2;
              }
              for (;;)
              {
                if (i4 >= m)
                {
                  i8 = arrayOfByte2[i4];
                  localObject4[i5] = i8;
                  i5 += 1;
                  i4 = arrayOfShort[i4];
                }
                else
                {
                  i8 = arrayOfByte2[i4] & 0xFF;
                  i4 = (byte)i8;
                  arrayOfByte1[i6] = i4;
                  i4 = i6 + 1;
                  i6 = i10 + 1;
                  while (i5 > 0)
                  {
                    i5 += -1;
                    i10 = localObject4[i5];
                    arrayOfByte1[i4] = i10;
                    i4 += 1;
                    i6 += 1;
                  }
                  i10 = 4096;
                  if (i1 < i10)
                  {
                    i2 = (short)i2;
                    arrayOfShort[i1] = i2;
                    i2 = (byte)i8;
                    arrayOfByte2[i1] = i2;
                    i1 += 1;
                    i2 = i1 & i3;
                    if (i2 == 0)
                    {
                      i2 = 4096;
                      if (i1 < i2)
                      {
                        i += 1;
                        i3 += i1;
                      }
                    }
                  }
                  i10 = i6;
                  i2 = i7;
                  i6 = i4;
                  i4 = i8;
                  i8 = i9;
                  break;
                  i4 = i7;
                }
              }
            }
          }
        }
      }
      i7 = i4;
      i9 = i;
      i4 = i6;
      i = i12;
      i6 = i10;
      i10 = i3;
      i3 = i13;
      i14 = i2;
      i2 = i11;
      i11 = i1;
      i1 = i8;
      i8 = i14;
    }
  }
  
  private GifHeaderParser getHeaderParser()
  {
    GifHeaderParser localGifHeaderParser = this.parser;
    if (localGifHeaderParser == null)
    {
      localGifHeaderParser = new com/bumptech/glide/gifdecoder/GifHeaderParser;
      localGifHeaderParser.<init>();
      this.parser = localGifHeaderParser;
    }
    return this.parser;
  }
  
  private Bitmap getNextBitmap()
  {
    Object localObject = this.isFirstFrameTransparent;
    if (localObject != null)
    {
      localObject = this.isFirstFrameTransparent;
      boolean bool = ((Boolean)localObject).booleanValue();
      if (!bool) {
        break label63;
      }
    }
    label63:
    for (localObject = Bitmap.Config.ARGB_8888;; localObject = this.bitmapConfig)
    {
      GifDecoder.BitmapProvider localBitmapProvider = this.bitmapProvider;
      int i = this.downsampledWidth;
      int j = this.downsampledHeight;
      localObject = localBitmapProvider.obtain(i, j, (Bitmap.Config)localObject);
      ((Bitmap)localObject).setHasAlpha(true);
      return (Bitmap)localObject;
    }
  }
  
  private int readBlock()
  {
    int i = readByte();
    if (i <= 0) {}
    for (;;)
    {
      return i;
      ByteBuffer localByteBuffer1 = this.rawData;
      byte[] arrayOfByte = this.block;
      ByteBuffer localByteBuffer2 = this.rawData;
      int j = localByteBuffer2.remaining();
      j = Math.min(i, j);
      localByteBuffer1.get(arrayOfByte, 0, j);
    }
  }
  
  private int readByte()
  {
    return this.rawData.get() & 0xFF;
  }
  
  private Bitmap setPixels(GifFrame paramGifFrame1, GifFrame paramGifFrame2)
  {
    int i = 3;
    int j = 1;
    int[] arrayOfInt = this.mainScratch;
    Object localObject1;
    Object localObject2;
    int k;
    if (paramGifFrame2 == null)
    {
      localObject1 = this.previousImage;
      if (localObject1 != null)
      {
        localObject1 = this.bitmapProvider;
        localObject2 = this.previousImage;
        ((GifDecoder.BitmapProvider)localObject1).release((Bitmap)localObject2);
      }
      k = 0;
      localObject1 = null;
      this.previousImage = null;
      Arrays.fill(arrayOfInt, 0);
    }
    if (paramGifFrame2 != null)
    {
      k = paramGifFrame2.dispose;
      if (k == i)
      {
        localObject1 = this.previousImage;
        if (localObject1 == null) {
          Arrays.fill(arrayOfInt, 0);
        }
      }
    }
    int i2;
    int i3;
    int i4;
    int i5;
    if (paramGifFrame2 != null)
    {
      k = paramGifFrame2.dispose;
      if (k > 0)
      {
        k = paramGifFrame2.dispose;
        i2 = 2;
        if (k == i2)
        {
          boolean bool1 = paramGifFrame1.transparency;
          if (!bool1)
          {
            localObject1 = this.header;
            m = ((GifHeader)localObject1).bgColor;
            localObject2 = paramGifFrame1.lct;
            if (localObject2 != null)
            {
              localObject2 = this.header;
              i2 = ((GifHeader)localObject2).bgIndex;
              i = paramGifFrame1.transIndex;
              if (i2 == i)
              {
                m = 0;
                localObject1 = null;
              }
            }
            i2 = paramGifFrame2.ih;
            i = this.sampleSize;
            i2 /= i;
            i = paramGifFrame2.iy;
            i3 = this.sampleSize;
            i /= i3;
            i3 = paramGifFrame2.iw;
            i4 = this.sampleSize;
            i3 /= i4;
            i4 = paramGifFrame2.ix;
            i5 = this.sampleSize;
            i4 /= i5;
            i5 = this.downsampledWidth;
            i = i * i5 + i4;
            i4 = this.downsampledWidth;
            i2 *= i4;
            i4 = i + i2;
          }
          for (;;)
          {
            if (i >= i4) {
              break label450;
            }
            i5 = i + i3;
            i2 = i;
            for (;;)
            {
              if (i2 < i5)
              {
                arrayOfInt[i2] = m;
                i2 += 1;
                continue;
                m = this.framePointer;
                if (m == 0)
                {
                  localObject1 = Boolean.valueOf(j);
                  this.isFirstFrameTransparent = ((Boolean)localObject1);
                }
                m = 0;
                localObject1 = null;
                break;
              }
            }
            i2 = this.downsampledWidth;
            i += i2;
          }
        }
        int m = paramGifFrame2.dispose;
        if (m == i)
        {
          localObject1 = this.previousImage;
          if (localObject1 != null)
          {
            localObject1 = this.previousImage;
            i2 = this.downsampledWidth;
            i4 = this.downsampledWidth;
            i5 = this.downsampledHeight;
            i = 0;
            i3 = 0;
            ((Bitmap)localObject1).getPixels(arrayOfInt, 0, i2, 0, 0, i4, i5);
          }
        }
      }
    }
    label450:
    decodeBitmapData(paramGifFrame1);
    boolean bool2 = paramGifFrame1.interlace;
    if (!bool2)
    {
      int n = this.sampleSize;
      if (n == j) {}
    }
    else
    {
      copyCopyIntoScratchRobust(paramGifFrame1);
    }
    for (;;)
    {
      boolean bool3 = this.savePrevious;
      if (bool3)
      {
        int i1 = paramGifFrame1.dispose;
        if (i1 != 0)
        {
          i1 = paramGifFrame1.dispose;
          if (i1 != j) {}
        }
        else
        {
          localObject1 = this.previousImage;
          if (localObject1 == null)
          {
            localObject1 = getNextBitmap();
            this.previousImage = ((Bitmap)localObject1);
          }
          localObject1 = this.previousImage;
          i2 = this.downsampledWidth;
          i4 = this.downsampledWidth;
          i5 = this.downsampledHeight;
          i = 0;
          i3 = 0;
          ((Bitmap)localObject1).setPixels(arrayOfInt, 0, i2, 0, 0, i4, i5);
        }
      }
      localObject1 = getNextBitmap();
      i2 = this.downsampledWidth;
      i4 = this.downsampledWidth;
      i5 = this.downsampledHeight;
      ((Bitmap)localObject1).setPixels(arrayOfInt, 0, i2, 0, 0, i4, i5);
      return (Bitmap)localObject1;
      copyIntoScratchFast(paramGifFrame1);
    }
  }
  
  public void advance()
  {
    int i = this.framePointer + 1;
    int j = this.header.frameCount;
    i %= j;
    this.framePointer = i;
  }
  
  public void clear()
  {
    this.header = null;
    Object localObject1 = this.mainPixels;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.bitmapProvider;
      localObject2 = this.mainPixels;
      ((GifDecoder.BitmapProvider)localObject1).release((byte[])localObject2);
    }
    localObject1 = this.mainScratch;
    if (localObject1 != null)
    {
      localObject1 = this.bitmapProvider;
      localObject2 = this.mainScratch;
      ((GifDecoder.BitmapProvider)localObject1).release((int[])localObject2);
    }
    localObject1 = this.previousImage;
    if (localObject1 != null)
    {
      localObject1 = this.bitmapProvider;
      localObject2 = this.previousImage;
      ((GifDecoder.BitmapProvider)localObject1).release((Bitmap)localObject2);
    }
    this.previousImage = null;
    this.rawData = null;
    this.isFirstFrameTransparent = null;
    localObject1 = this.block;
    if (localObject1 != null)
    {
      localObject1 = this.bitmapProvider;
      localObject2 = this.block;
      ((GifDecoder.BitmapProvider)localObject1).release((byte[])localObject2);
    }
  }
  
  public int getByteSize()
  {
    int i = this.rawData.limit();
    int j = this.mainPixels.length;
    i += j;
    j = this.mainScratch.length * 4;
    return i + j;
  }
  
  public int getCurrentFrameIndex()
  {
    return this.framePointer;
  }
  
  public ByteBuffer getData()
  {
    return this.rawData;
  }
  
  public int getDelay(int paramInt)
  {
    int i = -1;
    if (paramInt >= 0)
    {
      GifHeader localGifHeader = this.header;
      int j = localGifHeader.frameCount;
      if (paramInt < j)
      {
        GifFrame localGifFrame = (GifFrame)this.header.frames.get(paramInt);
        i = localGifFrame.delay;
      }
    }
    return i;
  }
  
  public int getFrameCount()
  {
    return this.header.frameCount;
  }
  
  public int getHeight()
  {
    return this.header.height;
  }
  
  public int getLoopCount()
  {
    GifHeader localGifHeader = this.header;
    int i = localGifHeader.loopCount;
    int j = -1;
    if (i == j) {}
    for (i = 1;; i = localGifHeader.loopCount)
    {
      return i;
      localGifHeader = this.header;
    }
  }
  
  public int getNetscapeLoopCount()
  {
    return this.header.loopCount;
  }
  
  public int getNextDelay()
  {
    GifHeader localGifHeader = this.header;
    int i = localGifHeader.frameCount;
    if (i > 0)
    {
      i = this.framePointer;
      if (i >= 0) {}
    }
    else
    {
      i = 0;
      localGifHeader = null;
    }
    for (;;)
    {
      return i;
      i = this.framePointer;
      i = getDelay(i);
    }
  }
  
  public Bitmap getNextFrame()
  {
    int i = 0;
    int j = 1;
    for (;;)
    {
      try
      {
        Object localObject1 = this.header;
        int k = ((GifHeader)localObject1).frameCount;
        Object localObject3;
        if (k > 0)
        {
          k = this.framePointer;
          if (k >= 0) {}
        }
        else
        {
          localObject1 = TAG;
          i2 = 3;
          int m = Log.isLoggable((String)localObject1, i2);
          if (m != 0)
          {
            localObject1 = TAG;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "Unable to decode frame, frameCount=";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            localObject4 = this.header;
            i3 = ((GifHeader)localObject4).frameCount;
            localObject3 = ((StringBuilder)localObject3).append(i3);
            localObject4 = ", framePointer=";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            i3 = this.framePointer;
            localObject3 = ((StringBuilder)localObject3).append(i3);
            localObject3 = ((StringBuilder)localObject3).toString();
            Log.d((String)localObject1, (String)localObject3);
          }
          m = 1;
          this.status = m;
        }
        int n = this.status;
        if (n != j)
        {
          n = this.status;
          i2 = 2;
          if (n != i2) {}
        }
        else
        {
          localObject1 = TAG;
          i2 = 3;
          i1 = Log.isLoggable((String)localObject1, i2);
          if (i1 != 0)
          {
            localObject1 = TAG;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "Unable to decode frame, status=";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            i3 = this.status;
            localObject3 = ((StringBuilder)localObject3).append(i3);
            localObject3 = ((StringBuilder)localObject3).toString();
            Log.d((String)localObject1, (String)localObject3);
          }
          i1 = 0;
          localObject1 = null;
          return (Bitmap)localObject1;
        }
        int i1 = 0;
        localObject1 = null;
        this.status = 0;
        localObject1 = this.block;
        if (localObject1 == null)
        {
          localObject1 = this.bitmapProvider;
          i2 = 255;
          localObject1 = ((GifDecoder.BitmapProvider)localObject1).obtainByteArray(i2);
          this.block = ((byte[])localObject1);
        }
        localObject1 = this.header;
        localObject1 = ((GifHeader)localObject1).frames;
        int i2 = this.framePointer;
        localObject1 = ((List)localObject1).get(i2);
        localObject1 = (GifFrame)localObject1;
        i2 = this.framePointer + -1;
        if (i2 >= 0)
        {
          localObject4 = this.header;
          localObject4 = ((GifHeader)localObject4).frames;
          localObject3 = ((List)localObject4).get(i2);
          localObject3 = (GifFrame)localObject3;
          localObject4 = localObject3;
          localObject3 = ((GifFrame)localObject1).lct;
          if (localObject3 != null)
          {
            localObject3 = ((GifFrame)localObject1).lct;
            this.act = ((int[])localObject3);
            localObject3 = this.act;
            if (localObject3 == null)
            {
              localObject1 = TAG;
              i2 = 3;
              i1 = Log.isLoggable((String)localObject1, i2);
              if (i1 != 0)
              {
                localObject1 = TAG;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject4 = "No valid color table found for frame #";
                localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                i3 = this.framePointer;
                localObject3 = ((StringBuilder)localObject3).append(i3);
                localObject3 = ((StringBuilder)localObject3).toString();
                Log.d((String)localObject1, (String)localObject3);
              }
              i1 = 1;
              this.status = i1;
              i1 = 0;
              localObject1 = null;
            }
          }
          else
          {
            localObject3 = this.header;
            localObject3 = ((GifHeader)localObject3).gct;
            continue;
          }
          boolean bool = ((GifFrame)localObject1).transparency;
          if (bool)
          {
            localObject3 = this.act;
            i = 0;
            int[] arrayOfInt1 = this.pct;
            int[] arrayOfInt2 = this.act;
            int i4 = arrayOfInt2.length;
            System.arraycopy(localObject3, 0, arrayOfInt1, 0, i4);
            localObject3 = this.pct;
            this.act = ((int[])localObject3);
            localObject3 = this.act;
            i = ((GifFrame)localObject1).transIndex;
            j = 0;
            arrayOfInt1 = null;
            localObject3[i] = 0;
          }
          localObject1 = setPixels((GifFrame)localObject1, (GifFrame)localObject4);
          continue;
        }
        int i3 = 0;
      }
      finally {}
      Object localObject4 = null;
    }
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public int getTotalIterationCount()
  {
    GifHeader localGifHeader = this.header;
    int i = localGifHeader.loopCount;
    int j = -1;
    if (i == j) {
      i = 1;
    }
    for (;;)
    {
      return i;
      localGifHeader = this.header;
      i = localGifHeader.loopCount;
      if (i == 0)
      {
        i = 0;
        localGifHeader = null;
      }
      else
      {
        localGifHeader = this.header;
        i = localGifHeader.loopCount + 1;
      }
    }
  }
  
  public int getWidth()
  {
    return this.header.width;
  }
  
  public int read(InputStream paramInputStream, int paramInt)
  {
    int i = 16384;
    Object localObject;
    String str;
    if (paramInputStream != null)
    {
      if (paramInt > 0) {
        i = paramInt + 4096;
      }
      try
      {
        localObject = new java/io/ByteArrayOutputStream;
        ((ByteArrayOutputStream)localObject).<init>(i);
        i = 16384;
        byte[] arrayOfByte1 = new byte[i];
        for (;;)
        {
          int j = 0;
          str = null;
          int k = arrayOfByte1.length;
          j = paramInputStream.read(arrayOfByte1, 0, k);
          k = -1;
          if (j == k) {
            break;
          }
          k = 0;
          ((ByteArrayOutputStream)localObject).write(arrayOfByte1, 0, j);
        }
        if (paramInputStream == null) {}
      }
      catch (IOException localIOException1)
      {
        localObject = TAG;
        str = "Error reading data from stream";
        Log.w((String)localObject, str, localIOException1);
      }
    }
    try
    {
      for (;;)
      {
        paramInputStream.close();
        return this.status;
        ((ByteArrayOutputStream)localObject).flush();
        byte[] arrayOfByte2 = ((ByteArrayOutputStream)localObject).toByteArray();
        read(arrayOfByte2);
      }
      i = 2;
      this.status = i;
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        localObject = TAG;
        str = "Error closing stream";
        Log.w((String)localObject, str, localIOException2);
      }
    }
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject1 = getHeaderParser();
      localObject1 = ((GifHeaderParser)localObject1).setData(paramArrayOfByte);
      localObject1 = ((GifHeaderParser)localObject1).parseHeader();
      this.header = ((GifHeader)localObject1);
      if (paramArrayOfByte != null)
      {
        localObject1 = this.header;
        setData((GifHeader)localObject1, paramArrayOfByte);
      }
      int i = this.status;
      return i;
    }
    finally {}
  }
  
  public void resetFrameIndex()
  {
    this.framePointer = -1;
  }
  
  public void setData(GifHeader paramGifHeader, ByteBuffer paramByteBuffer)
  {
    int i = 1;
    try
    {
      setData(paramGifHeader, paramByteBuffer, i);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setData(GifHeader paramGifHeader, ByteBuffer paramByteBuffer, int paramInt)
  {
    if (paramInt <= 0) {
      try
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "Sample size must be >=0, not: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).append(paramInt);
        localObject3 = ((StringBuilder)localObject3).toString();
        localIllegalArgumentException.<init>((String)localObject3);
        throw localIllegalArgumentException;
      }
      finally {}
    }
    int i = Integer.highestOneBit(paramInt);
    int j = 0;
    Object localObject2 = null;
    this.status = 0;
    this.header = paramGifHeader;
    j = -1;
    this.framePointer = j;
    localObject2 = paramByteBuffer.asReadOnlyBuffer();
    this.rawData = ((ByteBuffer)localObject2);
    localObject2 = this.rawData;
    int m = 0;
    Object localObject4 = null;
    ((ByteBuffer)localObject2).position(0);
    localObject2 = this.rawData;
    localObject4 = ByteOrder.LITTLE_ENDIAN;
    ((ByteBuffer)localObject2).order((ByteOrder)localObject4);
    j = 0;
    localObject2 = null;
    this.savePrevious = false;
    localObject2 = paramGifHeader.frames;
    localObject4 = ((List)localObject2).iterator();
    int n;
    do
    {
      boolean bool = ((Iterator)localObject4).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = ((Iterator)localObject4).next();
      localObject2 = (GifFrame)localObject2;
      k = ((GifFrame)localObject2).dispose;
      n = 3;
    } while (k != n);
    int k = 1;
    this.savePrevious = k;
    this.sampleSize = i;
    k = paramGifHeader.width;
    k /= i;
    this.downsampledWidth = k;
    k = paramGifHeader.height;
    k /= i;
    this.downsampledHeight = k;
    localObject2 = this.bitmapProvider;
    i = paramGifHeader.width;
    m = paramGifHeader.height;
    i *= m;
    localObject2 = ((GifDecoder.BitmapProvider)localObject2).obtainByteArray(i);
    this.mainPixels = ((byte[])localObject2);
    localObject2 = this.bitmapProvider;
    i = this.downsampledWidth;
    m = this.downsampledHeight;
    i *= m;
    localObject2 = ((GifDecoder.BitmapProvider)localObject2).obtainIntArray(i);
    this.mainScratch = ((int[])localObject2);
  }
  
  public void setData(GifHeader paramGifHeader, byte[] paramArrayOfByte)
  {
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      setData(paramGifHeader, localByteBuffer);
      return;
    }
    finally {}
  }
  
  public void setDefaultBitmapConfig(Bitmap.Config paramConfig)
  {
    Object localObject1 = Bitmap.Config.ARGB_8888;
    if (paramConfig != localObject1)
    {
      localObject1 = Bitmap.Config.RGB_565;
      if (paramConfig != localObject1)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unsupported format: ").append(paramConfig).append(", must be one of ");
        Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
        localObject2 = ((StringBuilder)localObject2).append(localConfig).append(" or ");
        localConfig = Bitmap.Config.RGB_565;
        localObject2 = localConfig;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    this.bitmapConfig = paramConfig;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\gifdecoder\StandardGifDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */