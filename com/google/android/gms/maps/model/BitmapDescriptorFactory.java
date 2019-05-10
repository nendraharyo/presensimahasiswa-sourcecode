package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.internal.zza;

public final class BitmapDescriptorFactory
{
  public static final float HUE_AZURE = 210.0F;
  public static final float HUE_BLUE = 240.0F;
  public static final float HUE_CYAN = 180.0F;
  public static final float HUE_GREEN = 120.0F;
  public static final float HUE_MAGENTA = 300.0F;
  public static final float HUE_ORANGE = 30.0F;
  public static final float HUE_RED = 0.0F;
  public static final float HUE_ROSE = 330.0F;
  public static final float HUE_VIOLET = 270.0F;
  public static final float HUE_YELLOW = 60.0F;
  private static zza zzaSW;
  
  public static BitmapDescriptor defaultMarker()
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      localObject = zzAi();
      localObject = ((zza)localObject).zzAn();
      localBitmapDescriptor.<init>((zzd)localObject);
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static BitmapDescriptor defaultMarker(float paramFloat)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      localObject = zzAi();
      localObject = ((zza)localObject).zzh(paramFloat);
      localBitmapDescriptor.<init>((zzd)localObject);
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static BitmapDescriptor fromAsset(String paramString)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      localObject = zzAi();
      localObject = ((zza)localObject).zzer(paramString);
      localBitmapDescriptor.<init>((zzd)localObject);
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static BitmapDescriptor fromBitmap(Bitmap paramBitmap)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      localObject = zzAi();
      localObject = ((zza)localObject).zzc(paramBitmap);
      localBitmapDescriptor.<init>((zzd)localObject);
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static BitmapDescriptor fromFile(String paramString)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      localObject = zzAi();
      localObject = ((zza)localObject).zzes(paramString);
      localBitmapDescriptor.<init>((zzd)localObject);
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static BitmapDescriptor fromPath(String paramString)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      localObject = zzAi();
      localObject = ((zza)localObject).zzet(paramString);
      localBitmapDescriptor.<init>((zzd)localObject);
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public static BitmapDescriptor fromResource(int paramInt)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new com/google/android/gms/maps/model/BitmapDescriptor;
      localObject = zzAi();
      localObject = ((zza)localObject).zziz(paramInt);
      localBitmapDescriptor.<init>((zzd)localObject);
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  private static zza zzAi()
  {
    return (zza)zzx.zzb(zzaSW, "IBitmapDescriptorFactory is not initialized");
  }
  
  public static void zza(zza paramzza)
  {
    zza localzza = zzaSW;
    if (localzza != null) {}
    for (;;)
    {
      return;
      localzza = (zza)zzx.zzz(paramzza);
      zzaSW = localzza;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\BitmapDescriptorFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */