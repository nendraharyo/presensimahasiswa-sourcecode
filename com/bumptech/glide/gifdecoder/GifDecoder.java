package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract interface GifDecoder
{
  public static final int STATUS_FORMAT_ERROR = 1;
  public static final int STATUS_OK = 0;
  public static final int STATUS_OPEN_ERROR = 2;
  public static final int STATUS_PARTIAL_DECODE = 3;
  public static final int TOTAL_ITERATION_COUNT_FOREVER;
  
  public abstract void advance();
  
  public abstract void clear();
  
  public abstract int getByteSize();
  
  public abstract int getCurrentFrameIndex();
  
  public abstract ByteBuffer getData();
  
  public abstract int getDelay(int paramInt);
  
  public abstract int getFrameCount();
  
  public abstract int getHeight();
  
  public abstract int getLoopCount();
  
  public abstract int getNetscapeLoopCount();
  
  public abstract int getNextDelay();
  
  public abstract Bitmap getNextFrame();
  
  public abstract int getStatus();
  
  public abstract int getTotalIterationCount();
  
  public abstract int getWidth();
  
  public abstract int read(InputStream paramInputStream, int paramInt);
  
  public abstract int read(byte[] paramArrayOfByte);
  
  public abstract void resetFrameIndex();
  
  public abstract void setData(GifHeader paramGifHeader, ByteBuffer paramByteBuffer);
  
  public abstract void setData(GifHeader paramGifHeader, ByteBuffer paramByteBuffer, int paramInt);
  
  public abstract void setData(GifHeader paramGifHeader, byte[] paramArrayOfByte);
  
  public abstract void setDefaultBitmapConfig(Bitmap.Config paramConfig);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\gifdecoder\GifDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */