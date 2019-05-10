package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.IOException;

public final class Cast$CastApi$zza
  implements Cast.CastApi
{
  public int getActiveInputState(GoogleApiClient paramGoogleApiClient)
  {
    Api.zzc localzzc = zzk.zzUI;
    return ((zze)paramGoogleApiClient.zza(localzzc)).zzol();
  }
  
  public ApplicationMetadata getApplicationMetadata(GoogleApiClient paramGoogleApiClient)
  {
    Api.zzc localzzc = zzk.zzUI;
    return ((zze)paramGoogleApiClient.zza(localzzc)).getApplicationMetadata();
  }
  
  public String getApplicationStatus(GoogleApiClient paramGoogleApiClient)
  {
    Api.zzc localzzc = zzk.zzUI;
    return ((zze)paramGoogleApiClient.zza(localzzc)).getApplicationStatus();
  }
  
  public int getStandbyState(GoogleApiClient paramGoogleApiClient)
  {
    Api.zzc localzzc = zzk.zzUI;
    return ((zze)paramGoogleApiClient.zza(localzzc)).zzom();
  }
  
  public double getVolume(GoogleApiClient paramGoogleApiClient)
  {
    Api.zzc localzzc = zzk.zzUI;
    return ((zze)paramGoogleApiClient.zza(localzzc)).zzok();
  }
  
  public boolean isMute(GoogleApiClient paramGoogleApiClient)
  {
    Api.zzc localzzc = zzk.zzUI;
    return ((zze)paramGoogleApiClient.zza(localzzc)).isMute();
  }
  
  public PendingResult joinApplication(GoogleApiClient paramGoogleApiClient)
  {
    return zza(paramGoogleApiClient, null, null, null);
  }
  
  public PendingResult joinApplication(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return zza(paramGoogleApiClient, paramString, null, null);
  }
  
  public PendingResult joinApplication(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return zza(paramGoogleApiClient, paramString1, paramString2, null);
  }
  
  public PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    Cast.CastApi.zza.2 local2 = new com/google/android/gms/cast/Cast$CastApi$zza$2;
    local2.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, LaunchOptions paramLaunchOptions)
  {
    Cast.CastApi.zza.3 local3 = new com/google/android/gms/cast/Cast$CastApi$zza$3;
    local3.<init>(this, paramGoogleApiClient, paramString, paramLaunchOptions);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    Object localObject = new com/google/android/gms/cast/LaunchOptions$Builder;
    ((LaunchOptions.Builder)localObject).<init>();
    localObject = ((LaunchOptions.Builder)localObject).setRelaunchIfRunning(paramBoolean).build();
    return launchApplication(paramGoogleApiClient, paramString, (LaunchOptions)localObject);
  }
  
  public PendingResult leaveApplication(GoogleApiClient paramGoogleApiClient)
  {
    Cast.CastApi.zza.5 local5 = new com/google/android/gms/cast/Cast$CastApi$zza$5;
    local5.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public void removeMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    try
    {
      Object localObject = zzk.zzUI;
      localObject = paramGoogleApiClient.zza((Api.zzc)localObject);
      localObject = (zze)localObject;
      ((zze)localObject).zzcg(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("service error");
      throw localIOException;
    }
  }
  
  public void requestStatus(GoogleApiClient paramGoogleApiClient)
  {
    try
    {
      Object localObject = zzk.zzUI;
      localObject = paramGoogleApiClient.zza((Api.zzc)localObject);
      localObject = (zze)localObject;
      ((zze)localObject).zzoj();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("service error");
      throw localIOException;
    }
  }
  
  public PendingResult sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    Cast.CastApi.zza.1 local1 = new com/google/android/gms/cast/Cast$CastApi$zza$1;
    local1.<init>(this, paramGoogleApiClient, paramString1, paramString2);
    return paramGoogleApiClient.zzb(local1);
  }
  
  public void setMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
  {
    try
    {
      Object localObject = zzk.zzUI;
      localObject = paramGoogleApiClient.zza((Api.zzc)localObject);
      localObject = (zze)localObject;
      ((zze)localObject).zza(paramString, paramMessageReceivedCallback);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("service error");
      throw localIOException;
    }
  }
  
  public void setMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    try
    {
      Object localObject = zzk.zzUI;
      localObject = paramGoogleApiClient.zza((Api.zzc)localObject);
      localObject = (zze)localObject;
      ((zze)localObject).zzX(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("service error");
      throw localIOException;
    }
  }
  
  public void setVolume(GoogleApiClient paramGoogleApiClient, double paramDouble)
  {
    try
    {
      Object localObject = zzk.zzUI;
      localObject = paramGoogleApiClient.zza((Api.zzc)localObject);
      localObject = (zze)localObject;
      ((zze)localObject).zzf(paramDouble);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("service error");
      throw localIOException;
    }
  }
  
  public PendingResult stopApplication(GoogleApiClient paramGoogleApiClient)
  {
    Cast.CastApi.zza.6 local6 = new com/google/android/gms/cast/Cast$CastApi$zza$6;
    local6.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult stopApplication(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    Cast.CastApi.zza.7 local7 = new com/google/android/gms/cast/Cast$CastApi$zza$7;
    local7.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local7);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, JoinOptions paramJoinOptions)
  {
    Cast.CastApi.zza.4 local4 = new com/google/android/gms/cast/Cast$CastApi$zza$4;
    local4.<init>(this, paramGoogleApiClient, paramString1, paramString2, paramJoinOptions);
    return paramGoogleApiClient.zzb(local4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastApi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */