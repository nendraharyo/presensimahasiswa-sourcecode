package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public class zzg
{
  private final Context mContext;
  private final FaceSettingsParcel zzbob;
  private zzc zzboc;
  private boolean zzbod;
  private final Object zzpV;
  
  public zzg(Context paramContext, FaceSettingsParcel paramFaceSettingsParcel)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzboc = null;
    this.zzbod = false;
    this.mContext = paramContext;
    this.zzbob = paramFaceSettingsParcel;
    zzIi();
  }
  
  private zzc zzIi()
  {
    for (;;)
    {
      Object localObject5;
      synchronized (this.zzpV)
      {
        Object localObject2 = this.zzboc;
        if (localObject2 != null)
        {
          localObject2 = this.zzboc;
          return (zzc)localObject2;
        }
        localObject2 = this.mContext;
        localObject5 = this.zzbob;
        localObject2 = zzf.zza((Context)localObject2, (FaceSettingsParcel)localObject5);
        this.zzboc = ((zzc)localObject2);
        bool = this.zzbod;
        if (!bool)
        {
          localObject2 = this.zzboc;
          if (localObject2 == null)
          {
            localObject2 = "FaceDetectorHandle";
            localObject5 = "Native face detector not yet available.  Reverting to no-op detection.";
            Log.w((String)localObject2, (String)localObject5);
            bool = true;
            this.zzbod = bool;
            localObject2 = this.zzboc;
          }
        }
      }
      boolean bool = this.zzbod;
      if (bool)
      {
        Object localObject4 = this.zzboc;
        if (localObject4 != null)
        {
          localObject4 = "FaceDetectorHandle";
          localObject5 = "Native face detector is now available.";
          Log.w((String)localObject4, (String)localObject5);
        }
      }
    }
  }
  
  private Face zza(FaceParcel paramFaceParcel)
  {
    Face localFace = new com/google/android/gms/vision/face/Face;
    int i = paramFaceParcel.id;
    PointF localPointF = new android/graphics/PointF;
    float f1 = paramFaceParcel.centerX;
    float f2 = paramFaceParcel.centerY;
    localPointF.<init>(f1, f2);
    f1 = paramFaceParcel.width;
    f2 = paramFaceParcel.height;
    float f3 = paramFaceParcel.zzbnP;
    float f4 = paramFaceParcel.zzbnQ;
    Landmark[] arrayOfLandmark = zzb(paramFaceParcel);
    float f5 = paramFaceParcel.zzbnS;
    float f6 = paramFaceParcel.zzbnT;
    float f7 = paramFaceParcel.zzbnU;
    localFace.<init>(i, localPointF, f1, f2, f3, f4, arrayOfLandmark, f5, f6, f7);
    return localFace;
  }
  
  private Landmark zza(LandmarkParcel paramLandmarkParcel)
  {
    Landmark localLandmark = new com/google/android/gms/vision/face/Landmark;
    PointF localPointF = new android/graphics/PointF;
    float f1 = paramLandmarkParcel.x;
    float f2 = paramLandmarkParcel.y;
    localPointF.<init>(f1, f2);
    int i = paramLandmarkParcel.type;
    localLandmark.<init>(localPointF, i);
    return localLandmark;
  }
  
  private Landmark[] zzb(FaceParcel paramFaceParcel)
  {
    int i = 0;
    Object localObject1 = null;
    LandmarkParcel[] arrayOfLandmarkParcel = paramFaceParcel.zzbnR;
    if (arrayOfLandmarkParcel == null) {}
    Landmark[] arrayOfLandmark;
    for (localObject1 = new Landmark[0];; localObject1 = arrayOfLandmark)
    {
      return (Landmark[])localObject1;
      int j = arrayOfLandmarkParcel.length;
      arrayOfLandmark = new Landmark[j];
      for (;;)
      {
        int k = arrayOfLandmarkParcel.length;
        if (i >= k) {
          break;
        }
        Object localObject2 = arrayOfLandmarkParcel[i];
        localObject2 = zza((LandmarkParcel)localObject2);
        arrayOfLandmark[i] = localObject2;
        i += 1;
      }
    }
  }
  
  public boolean isOperational()
  {
    zzc localzzc = zzIi();
    boolean bool;
    if (localzzc != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzc = null;
    }
  }
  
  public void zzIh()
  {
    synchronized (this.zzpV)
    {
      zzc localzzc = this.zzboc;
      if (localzzc == null) {
        return;
      }
      try
      {
        localzzc = this.zzboc;
        localzzc.zzIh();
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str1 = "FaceDetectorHandle";
          String str2 = "Could not finalize native face detector";
          Log.e(str1, str2, localRemoteException);
        }
      }
    }
  }
  
  public Face[] zzb(ByteBuffer paramByteBuffer, FrameMetadataParcel paramFrameMetadataParcel)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = zzIi();
    if (localObject2 == null) {}
    for (localObject1 = new Face[0];; localObject1 = localRemoteException) {
      for (;;)
      {
        return (Face[])localObject1;
        try
        {
          localObject3 = zze.zzC(paramByteBuffer);
          localObject3 = ((zzc)localObject2).zzc((zzd)localObject3, paramFrameMetadataParcel);
          int j = localObject3.length;
          localObject2 = new Face[j];
          for (;;)
          {
            int k = localObject3.length;
            if (i >= k) {
              break;
            }
            localObject4 = localObject3[i];
            localObject4 = zza((FaceParcel)localObject4);
            localObject2[i] = localObject4;
            i += 1;
          }
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject3 = "FaceDetectorHandle";
          Object localObject4 = "Could not call native face detector";
          Log.e((String)localObject3, (String)localObject4, localRemoteException);
          localObject1 = new Face[0];
        }
      }
    }
  }
  
  public boolean zzkJ(int paramInt)
  {
    boolean bool = false;
    zzc localzzc = zzIi();
    if (localzzc == null) {}
    for (;;)
    {
      return bool;
      try
      {
        bool = localzzc.zzkJ(paramInt);
      }
      catch (RemoteException localRemoteException)
      {
        String str1 = "FaceDetectorHandle";
        String str2 = "Could not call native face detector";
        Log.e(str1, str2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */