package com.google.android.gms.vision.barcode;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.internal.client.zzd;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public final class BarcodeDetector
  extends Detector
{
  private final zzd zzbnu;
  
  private BarcodeDetector()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Default constructor called");
    throw localIllegalStateException;
  }
  
  private BarcodeDetector(zzd paramzzd)
  {
    this.zzbnu = paramzzd;
  }
  
  public SparseArray detect(Frame paramFrame)
  {
    if (paramFrame == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("No frame supplied.");
      throw ((Throwable)localObject1);
    }
    paramFrame.getMetadata();
    Object localObject1 = FrameMetadataParcel.zzc(paramFrame);
    Object localObject2 = paramFrame.getBitmap();
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = this.zzbnu;
      localObject3 = paramFrame.getBitmap();
    }
    for (localObject1 = ((zzd)localObject2).zza((Bitmap)localObject3, (FrameMetadataParcel)localObject1);; localObject1 = ((zzd)localObject3).zza((ByteBuffer)localObject2, (FrameMetadataParcel)localObject1))
    {
      localObject3 = new android/util/SparseArray;
      int i = localObject1.length;
      ((SparseArray)localObject3).<init>(i);
      int j = localObject1.length;
      i = 0;
      localObject2 = null;
      while (i < j)
      {
        Object localObject4 = localObject1[i];
        String str = ((Barcode)localObject4).rawValue;
        int k = str.hashCode();
        ((SparseArray)localObject3).append(k, localObject4);
        i += 1;
      }
      localObject2 = paramFrame.getGrayscaleImageData();
      localObject3 = this.zzbnu;
    }
    return (SparseArray)localObject3;
  }
  
  public boolean isOperational()
  {
    return this.zzbnu.isOperational();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\BarcodeDetector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */