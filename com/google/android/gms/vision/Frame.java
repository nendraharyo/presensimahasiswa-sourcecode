package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

public class Frame
{
  public static final int ROTATION_0 = 0;
  public static final int ROTATION_180 = 2;
  public static final int ROTATION_270 = 3;
  public static final int ROTATION_90 = 1;
  private Bitmap mBitmap;
  private Frame.Metadata zzbni;
  private ByteBuffer zzbnj;
  
  private Frame()
  {
    Frame.Metadata localMetadata = new com/google/android/gms/vision/Frame$Metadata;
    localMetadata.<init>();
    this.zzbni = localMetadata;
    this.zzbnj = null;
    this.mBitmap = null;
  }
  
  private ByteBuffer zzIe()
  {
    int i = 0;
    int j = this.mBitmap.getWidth();
    int k = this.mBitmap.getHeight();
    int[] arrayOfInt = new int[j * k];
    Object localObject = this.mBitmap;
    int m = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    ((Bitmap)localObject).getPixels(arrayOfInt, 0, j, 0, 0, j, k);
    int n = j * k;
    localObject = new byte[n];
    for (;;)
    {
      j = arrayOfInt.length;
      if (i >= j) {
        break;
      }
      float f3 = Color.red(arrayOfInt[i]) * 0.299F;
      f1 = Color.green(arrayOfInt[i]) * 0.587F;
      f3 += f1;
      m = Color.blue(arrayOfInt[i]);
      f1 = m;
      f2 = 0.114F;
      f1 *= f2;
      f3 += f1;
      j = (byte)(int)f3;
      localObject[i] = j;
      i += 1;
    }
    return ByteBuffer.wrap((byte[])localObject);
  }
  
  public Bitmap getBitmap()
  {
    return this.mBitmap;
  }
  
  public ByteBuffer getGrayscaleImageData()
  {
    Object localObject = this.mBitmap;
    if (localObject != null) {}
    for (localObject = zzIe();; localObject = this.zzbnj) {
      return (ByteBuffer)localObject;
    }
  }
  
  public Frame.Metadata getMetadata()
  {
    return this.zzbni;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\Frame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */