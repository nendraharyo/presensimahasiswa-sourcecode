package com.google.android.gms.vision.barcode;

import android.content.Context;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.android.gms.vision.barcode.internal.client.zzd;

public class BarcodeDetector$Builder
{
  private Context mContext;
  private BarcodeDetectorOptions zzbnv;
  
  public BarcodeDetector$Builder(Context paramContext)
  {
    this.mContext = paramContext;
    BarcodeDetectorOptions localBarcodeDetectorOptions = new com/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;
    localBarcodeDetectorOptions.<init>();
    this.zzbnv = localBarcodeDetectorOptions;
  }
  
  public BarcodeDetector build()
  {
    zzd localzzd = new com/google/android/gms/vision/barcode/internal/client/zzd;
    Object localObject = this.mContext;
    BarcodeDetectorOptions localBarcodeDetectorOptions = this.zzbnv;
    localzzd.<init>((Context)localObject, localBarcodeDetectorOptions);
    localObject = new com/google/android/gms/vision/barcode/BarcodeDetector;
    ((BarcodeDetector)localObject).<init>(localzzd, null);
    return (BarcodeDetector)localObject;
  }
  
  public Builder setBarcodeFormats(int paramInt)
  {
    this.zzbnv.zzbnw = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\BarcodeDetector$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */