package com.google.android.gms.vision.barcode.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public class zzd
{
  private final Context mContext;
  private final BarcodeDetectorOptions zzbnv;
  private zzb zzbnx;
  private final Object zzpV;
  
  public zzd(Context paramContext, BarcodeDetectorOptions paramBarcodeDetectorOptions)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzbnx = null;
    this.mContext = paramContext;
    this.zzbnv = paramBarcodeDetectorOptions;
    zzIg();
  }
  
  private zzb zzIg()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzbnx;
      if (localObject2 == null)
      {
        localObject2 = this.mContext;
        BarcodeDetectorOptions localBarcodeDetectorOptions = this.zzbnv;
        localObject2 = zzd.zza.zza((Context)localObject2, localBarcodeDetectorOptions);
        this.zzbnx = ((zzb)localObject2);
      }
      localObject2 = this.zzbnx;
      return (zzb)localObject2;
    }
  }
  
  public boolean isOperational()
  {
    zzb localzzb = zzIg();
    boolean bool;
    if (localzzb != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzb = null;
    }
  }
  
  public Barcode[] zza(Bitmap paramBitmap, FrameMetadataParcel paramFrameMetadataParcel)
  {
    Object localObject1 = zzIg();
    if (localObject1 == null) {
      localObject1 = new Barcode[0];
    }
    for (;;)
    {
      return (Barcode[])localObject1;
      try
      {
        localObject2 = zze.zzC(paramBitmap);
        localObject1 = ((zzb)localObject1).zzb((com.google.android.gms.dynamic.zzd)localObject2, paramFrameMetadataParcel);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "NativeBarcodeDetectorHandle";
        String str = "Error calling native barcode detector";
        Log.e((String)localObject2, str, localRemoteException);
        Barcode[] arrayOfBarcode = new Barcode[0];
      }
    }
  }
  
  public Barcode[] zza(ByteBuffer paramByteBuffer, FrameMetadataParcel paramFrameMetadataParcel)
  {
    Object localObject1 = zzIg();
    if (localObject1 == null) {
      localObject1 = new Barcode[0];
    }
    for (;;)
    {
      return (Barcode[])localObject1;
      try
      {
        localObject2 = zze.zzC(paramByteBuffer);
        localObject1 = ((zzb)localObject1).zza((com.google.android.gms.dynamic.zzd)localObject2, paramFrameMetadataParcel);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "NativeBarcodeDetectorHandle";
        String str = "Error calling native barcode detector";
        Log.e((String)localObject2, str, localRemoteException);
        Barcode[] arrayOfBarcode = new Barcode[0];
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\internal\client\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */