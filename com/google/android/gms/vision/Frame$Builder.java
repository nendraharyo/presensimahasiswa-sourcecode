package com.google.android.gms.vision;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class Frame$Builder
{
  private Frame zzbnk;
  
  public Frame$Builder()
  {
    Frame localFrame = new com/google/android/gms/vision/Frame;
    localFrame.<init>(null);
    this.zzbnk = localFrame;
  }
  
  public Frame build()
  {
    Object localObject = Frame.zza(this.zzbnk);
    if (localObject == null)
    {
      localObject = Frame.zzb(this.zzbnk);
      if (localObject == null)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Missing image data.  Call either setBitmap or setImageData to specify the image");
        throw ((Throwable)localObject);
      }
    }
    return this.zzbnk;
  }
  
  public Builder setBitmap(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Frame.zza(this.zzbnk, paramBitmap);
    Frame.Metadata localMetadata = this.zzbnk.getMetadata();
    Frame.Metadata.zza(localMetadata, i);
    Frame.Metadata.zzb(localMetadata, j);
    return this;
  }
  
  public Builder setId(int paramInt)
  {
    Frame.Metadata.zzc(this.zzbnk.getMetadata(), paramInt);
    return this;
  }
  
  public Builder setImageData(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramByteBuffer == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Null image data supplied.");
      throw ((Throwable)localObject1);
    }
    int i = paramByteBuffer.capacity();
    int j = paramInt1 * paramInt2;
    if (i < j)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Invalid image data size.");
      throw ((Throwable)localObject1);
    }
    switch (paramInt3)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unsupported image format: " + paramInt3;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Frame.zza(this.zzbnk, paramByteBuffer);
    Object localObject1 = this.zzbnk.getMetadata();
    Frame.Metadata.zza((Frame.Metadata)localObject1, paramInt1);
    Frame.Metadata.zzb((Frame.Metadata)localObject1, paramInt2);
    return this;
  }
  
  public Builder setRotation(int paramInt)
  {
    Frame.Metadata.zzd(this.zzbnk.getMetadata(), paramInt);
    return this;
  }
  
  public Builder setTimestampMillis(long paramLong)
  {
    Frame.Metadata.zza(this.zzbnk.getMetadata(), paramLong);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\Frame$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */