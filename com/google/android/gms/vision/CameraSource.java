package com.google.android.gms.vision;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.ShutterCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.google.android.gms.common.images.Size;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CameraSource
{
  public static final int CAMERA_FACING_BACK = 0;
  public static final int CAMERA_FACING_FRONT = 1;
  private Context mContext;
  private int zzDE;
  private Camera zzbmA;
  private int zzbmB;
  private Size zzbmC;
  private float zzbmD;
  private int zzbmE;
  private int zzbmF;
  private boolean zzbmG;
  private SurfaceView zzbmH;
  private SurfaceTexture zzbmI;
  private boolean zzbmJ;
  private Thread zzbmK;
  private CameraSource.zzb zzbmL;
  private Map zzbmM;
  private final Object zzbmz;
  
  private CameraSource()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzbmz = localObject;
    this.zzbmB = 0;
    this.zzbmD = 30.0F;
    this.zzbmE = 1024;
    this.zzbmF = 768;
    this.zzbmG = false;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbmM = ((Map)localObject);
  }
  
  private Camera zzIb()
  {
    int i = zzkp(this.zzbmB);
    int j = -1;
    Object localObject1;
    if (i == j)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("Could not find requested camera.");
      throw ((Throwable)localObject1);
    }
    Camera localCamera = Camera.open(i);
    int k = this.zzbmE;
    int m = this.zzbmF;
    Object localObject2 = zza(localCamera, k, m);
    if (localObject2 == null)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("Could not find suitable preview size.");
      throw ((Throwable)localObject1);
    }
    Size localSize1 = ((CameraSource.zze)localObject2).zzId();
    localObject2 = ((CameraSource.zze)localObject2).zzIc();
    this.zzbmC = ((Size)localObject2);
    float f = this.zzbmD;
    localObject2 = zza(localCamera, f);
    if (localObject2 == null)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("Could not find suitable preview frames per second range.");
      throw ((Throwable)localObject1);
    }
    Camera.Parameters localParameters = localCamera.getParameters();
    int n = localSize1.getWidth();
    m = localSize1.getHeight();
    localParameters.setPictureSize(n, m);
    m = this.zzbmC.getWidth();
    Size localSize2 = this.zzbmC;
    n = localSize2.getHeight();
    localParameters.setPreviewSize(m, n);
    localSize1 = null;
    m = localObject2[0];
    n = 1;
    k = localObject2[n];
    localParameters.setPreviewFpsRange(m, k);
    k = 17;
    f = 2.4E-44F;
    localParameters.setPreviewFormat(k);
    zza(localCamera, localParameters, i);
    boolean bool = this.zzbmG;
    if (bool)
    {
      localObject1 = localParameters.getSupportedFocusModes();
      localObject2 = "continuous-video";
      bool = ((List)localObject1).contains(localObject2);
      if (!bool) {
        break label374;
      }
      localObject1 = "continuous-video";
      localParameters.setFocusMode((String)localObject1);
    }
    for (;;)
    {
      localCamera.setParameters(localParameters);
      localObject1 = new com/google/android/gms/vision/CameraSource$zza;
      ((CameraSource.zza)localObject1).<init>(this, null);
      localCamera.setPreviewCallbackWithBuffer((Camera.PreviewCallback)localObject1);
      localObject1 = this.zzbmC;
      localObject1 = zza((Size)localObject1);
      localCamera.addCallbackBuffer((byte[])localObject1);
      localObject1 = this.zzbmC;
      localObject1 = zza((Size)localObject1);
      localCamera.addCallbackBuffer((byte[])localObject1);
      localObject1 = this.zzbmC;
      localObject1 = zza((Size)localObject1);
      localCamera.addCallbackBuffer((byte[])localObject1);
      localObject1 = this.zzbmC;
      localObject1 = zza((Size)localObject1);
      localCamera.addCallbackBuffer((byte[])localObject1);
      return localCamera;
      label374:
      localObject1 = "CameraSource";
      localObject2 = "Camera auto focus is not supported on this device.";
      Log.i((String)localObject1, (String)localObject2);
    }
  }
  
  private static CameraSource.zze zza(Camera paramCamera, int paramInt1, int paramInt2)
  {
    Object localObject1 = zza(paramCamera);
    Object localObject2 = null;
    int i = -1 >>> 1;
    Iterator localIterator = ((List)localObject1).iterator();
    int j = localIterator.hasNext();
    Object localObject3;
    if (j != 0)
    {
      localObject1 = (CameraSource.zze)localIterator.next();
      localObject3 = ((CameraSource.zze)localObject1).zzIc();
      int k = Math.abs(((Size)localObject3).getWidth() - paramInt1);
      int m = Math.abs(((Size)localObject3).getHeight() - paramInt2) + k;
      if (m >= i) {
        break label107;
      }
      localObject3 = localObject1;
      j = m;
    }
    for (;;)
    {
      i = j;
      localObject2 = localObject3;
      break;
      return (CameraSource.zze)localObject2;
      label107:
      j = i;
      localObject3 = localObject2;
    }
  }
  
  private static List zza(Camera paramCamera)
  {
    Object localObject1 = paramCamera.getParameters();
    Object localObject2 = ((Camera.Parameters)localObject1).getSupportedPreviewSizes();
    List localList = ((Camera.Parameters)localObject1).getSupportedPictureSizes();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator1 = ((List)localObject2).iterator();
    Object localObject3;
    for (;;)
    {
      boolean bool1 = localIterator1.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Camera.Size)localIterator1.next();
      int j = ((Camera.Size)localObject1).width;
      float f1 = j;
      int k = ((Camera.Size)localObject1).height;
      float f2 = k;
      f2 = f1 / f2;
      Iterator localIterator2 = localList.iterator();
      boolean bool4;
      do
      {
        boolean bool3 = localIterator2.hasNext();
        if (!bool3) {
          break;
        }
        localObject3 = (Camera.Size)localIterator2.next();
        float f3 = ((Camera.Size)localObject3).width;
        float f4 = ((Camera.Size)localObject3).height;
        f3 /= f4;
        f3 = Math.abs(f2 - f3);
        f4 = 0.01F;
        bool4 = f3 < f4;
      } while (!bool4);
      CameraSource.zze localzze = new com/google/android/gms/vision/CameraSource$zze;
      localzze.<init>((Camera.Size)localObject1, (Camera.Size)localObject3);
      localArrayList.add(localzze);
    }
    int i = localArrayList.size();
    if (i == 0)
    {
      localObject1 = "CameraSource";
      Log.w((String)localObject1, "No preview sizes have a corresponding same-aspect-ratio picture size");
      localObject3 = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (Camera.Size)((Iterator)localObject3).next();
        localObject2 = new com/google/android/gms/vision/CameraSource$zze;
        localList = null;
        ((CameraSource.zze)localObject2).<init>((Camera.Size)localObject1, null);
        localArrayList.add(localObject2);
      }
    }
    return localArrayList;
  }
  
  private void zza(Camera paramCamera, Camera.Parameters paramParameters, int paramInt)
  {
    int i = 0;
    Camera.CameraInfo localCameraInfo = null;
    Object localObject = this.mContext;
    String str1 = "window";
    localObject = ((WindowManager)((Context)localObject).getSystemService(str1)).getDefaultDisplay();
    int j = ((Display)localObject).getRotation();
    int k;
    switch (j)
    {
    default: 
      str1 = "CameraSource";
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = "Bad rotation value: ";
      localStringBuilder = localStringBuilder.append(str2);
      localObject = j;
      Log.e(str1, (String)localObject);
      j = 0;
      localObject = null;
      localCameraInfo = new android/hardware/Camera$CameraInfo;
      localCameraInfo.<init>();
      Camera.getCameraInfo(paramInt, localCameraInfo);
      k = localCameraInfo.facing;
      int m = 1;
      if (k == m)
      {
        i = localCameraInfo.orientation;
        i = (j + i) % 360;
        j = (360 - i) % 360;
      }
      break;
    }
    for (;;)
    {
      k = i / 90;
      this.zzDE = k;
      paramCamera.setDisplayOrientation(j);
      paramParameters.setRotation(i);
      return;
      j = 0;
      localObject = null;
      break;
      j = 90;
      break;
      j = 180;
      break;
      j = 270;
      break;
      j = (localCameraInfo.orientation - j + 360) % 360;
      i = j;
    }
  }
  
  private byte[] zza(Size paramSize)
  {
    int i = ImageFormat.getBitsPerPixel(17);
    int j = paramSize.getHeight();
    int k = paramSize.getWidth();
    j *= k;
    long l = i * j;
    double d1 = l;
    double d2 = 8.0D;
    d1 = Math.ceil(d1 / d2);
    i = (int)d1 + 1;
    Object localObject = new byte[i];
    ByteBuffer localByteBuffer = ByteBuffer.wrap((byte[])localObject);
    boolean bool = localByteBuffer.hasArray();
    if (bool)
    {
      byte[] arrayOfByte = localByteBuffer.array();
      if (arrayOfByte == localObject) {}
    }
    else
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Failed to create valid buffer for camera source.");
      throw ((Throwable)localObject);
    }
    this.zzbmM.put(localObject, localByteBuffer);
    return (byte[])localObject;
  }
  
  private int[] zza(Camera paramCamera, float paramFloat)
  {
    int i = 1148846080;
    float f = 1000.0F * paramFloat;
    int k = (int)f;
    Object localObject1 = null;
    int m = -1 >>> 1;
    Object localObject2 = paramCamera.getParameters().getSupportedPreviewFpsRange();
    Iterator localIterator = ((List)localObject2).iterator();
    int j = localIterator.hasNext();
    Object localObject3;
    if (j != 0)
    {
      localObject2 = (int[])localIterator.next();
      localObject3 = null;
      int n = localObject2[0];
      n = k - n;
      int i1 = localObject2[1];
      i1 = k - i1;
      n = Math.abs(n);
      i1 = Math.abs(i1);
      n += i1;
      if (n >= m) {
        break label143;
      }
      localObject3 = localObject2;
      j = n;
    }
    for (;;)
    {
      m = j;
      localObject1 = localObject3;
      break;
      return (int[])localObject1;
      label143:
      j = m;
      localObject3 = localObject1;
    }
  }
  
  private static int zzkp(int paramInt)
  {
    Camera.CameraInfo localCameraInfo = new android/hardware/Camera$CameraInfo;
    localCameraInfo.<init>();
    int i = 0;
    int j = Camera.getNumberOfCameras();
    if (i < j)
    {
      Camera.getCameraInfo(i, localCameraInfo);
      j = localCameraInfo.facing;
      if (j != paramInt) {}
    }
    for (;;)
    {
      return i;
      i += 1;
      break;
      i = -1;
    }
  }
  
  public int getCameraFacing()
  {
    return this.zzbmB;
  }
  
  public Size getPreviewSize()
  {
    return this.zzbmC;
  }
  
  public void release()
  {
    synchronized (this.zzbmz)
    {
      stop();
      CameraSource.zzb localzzb = this.zzbmL;
      localzzb.release();
      return;
    }
  }
  
  public CameraSource start()
  {
    for (;;)
    {
      synchronized (this.zzbmz)
      {
        Object localObject2 = this.zzbmA;
        if (localObject2 != null) {
          return this;
        }
        localObject2 = zzIb();
        this.zzbmA = ((Camera)localObject2);
        i = Build.VERSION.SDK_INT;
        int j = 11;
        if (i >= j)
        {
          localObject2 = new android/graphics/SurfaceTexture;
          j = 100;
          ((SurfaceTexture)localObject2).<init>(j);
          this.zzbmI = ((SurfaceTexture)localObject2);
          localObject2 = this.zzbmA;
          localObject5 = this.zzbmI;
          ((Camera)localObject2).setPreviewTexture((SurfaceTexture)localObject5);
          i = 1;
          this.zzbmJ = i;
          localObject2 = this.zzbmA;
          ((Camera)localObject2).startPreview();
          localObject2 = new java/lang/Thread;
          localObject5 = this.zzbmL;
          ((Thread)localObject2).<init>((Runnable)localObject5);
          this.zzbmK = ((Thread)localObject2);
          localObject2 = this.zzbmL;
          j = 1;
          ((CameraSource.zzb)localObject2).setActive(j);
          localObject2 = this.zzbmK;
          ((Thread)localObject2).start();
        }
      }
      Object localObject4 = new android/view/SurfaceView;
      Object localObject5 = this.mContext;
      ((SurfaceView)localObject4).<init>((Context)localObject5);
      this.zzbmH = ((SurfaceView)localObject4);
      localObject4 = this.zzbmA;
      localObject5 = this.zzbmH;
      localObject5 = ((SurfaceView)localObject5).getHolder();
      ((Camera)localObject4).setPreviewDisplay((SurfaceHolder)localObject5);
      int i = 0;
      localObject4 = null;
      this.zzbmJ = false;
    }
  }
  
  public CameraSource start(SurfaceHolder paramSurfaceHolder)
  {
    synchronized (this.zzbmz)
    {
      Object localObject2 = this.zzbmA;
      if (localObject2 != null) {
        return this;
      }
      localObject2 = zzIb();
      this.zzbmA = ((Camera)localObject2);
      localObject2 = this.zzbmA;
      ((Camera)localObject2).setPreviewDisplay(paramSurfaceHolder);
      localObject2 = this.zzbmA;
      ((Camera)localObject2).startPreview();
      localObject2 = new java/lang/Thread;
      CameraSource.zzb localzzb = this.zzbmL;
      ((Thread)localObject2).<init>(localzzb);
      this.zzbmK = ((Thread)localObject2);
      localObject2 = this.zzbmL;
      boolean bool = true;
      ((CameraSource.zzb)localObject2).setActive(bool);
      localObject2 = this.zzbmK;
      ((Thread)localObject2).start();
      localObject2 = null;
      this.zzbmJ = false;
    }
  }
  
  public void stop()
  {
    for (;;)
    {
      synchronized (this.zzbmz)
      {
        Object localObject2 = this.zzbmL;
        str2 = null;
        ((CameraSource.zzb)localObject2).setActive(false);
        localObject2 = this.zzbmK;
        if (localObject2 != null) {}
        try
        {
          localObject2 = this.zzbmK;
          ((Thread)localObject2).join();
        }
        catch (InterruptedException localInterruptedException)
        {
          boolean bool;
          str1 = "CameraSource";
          str2 = "Frame processing thread interrupted on release.";
          Log.d(str1, str2);
          continue;
        }
        bool = false;
        localObject2 = null;
        this.zzbmK = null;
        localObject2 = this.zzbmA;
        if (localObject2 != null)
        {
          localObject2 = this.zzbmA;
          ((Camera)localObject2).stopPreview();
          localObject2 = this.zzbmA;
          str2 = null;
          ((Camera)localObject2).setPreviewCallbackWithBuffer(null);
        }
        try
        {
          bool = this.zzbmJ;
          if (!bool) {
            break label155;
          }
          localObject2 = this.zzbmA;
          str2 = null;
          ((Camera)localObject2).setPreviewTexture(null);
        }
        catch (Exception localException)
        {
          String str1;
          Camera localCamera;
          str2 = "CameraSource";
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str3 = "Failed to clear camera preview: ";
          localStringBuilder = localStringBuilder.append(str3);
          Object localObject4 = localStringBuilder.append(localException);
          localObject4 = ((StringBuilder)localObject4).toString();
          Log.e(str2, (String)localObject4);
          continue;
        }
        localObject2 = this.zzbmA;
        ((Camera)localObject2).release();
        bool = false;
        localObject2 = null;
        this.zzbmA = null;
        localObject2 = this.zzbmM;
        ((Map)localObject2).clear();
        return;
      }
      label155:
      localCamera = this.zzbmA;
      str2 = null;
      localCamera.setPreviewDisplay(null);
    }
  }
  
  public void takePicture(CameraSource.ShutterCallback paramShutterCallback, CameraSource.PictureCallback paramPictureCallback)
  {
    synchronized (this.zzbmz)
    {
      Object localObject2 = this.zzbmA;
      if (localObject2 != null)
      {
        localObject2 = new com/google/android/gms/vision/CameraSource$zzd;
        CameraSource.zzc localzzc = null;
        ((CameraSource.zzd)localObject2).<init>(this, null);
        CameraSource.zzd.zza((CameraSource.zzd)localObject2, paramShutterCallback);
        localzzc = new com/google/android/gms/vision/CameraSource$zzc;
        Camera localCamera = null;
        localzzc.<init>(this, null);
        CameraSource.zzc.zza(localzzc, paramPictureCallback);
        localCamera = this.zzbmA;
        localCamera.takePicture((Camera.ShutterCallback)localObject2, null, null, localzzc);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\CameraSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */