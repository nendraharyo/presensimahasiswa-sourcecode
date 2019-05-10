package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;
import java.util.List;

public class zzs
  implements DriveApi
{
  public PendingResult cancelPendingActions(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    Api.zzc localzzc = Drive.zzUI;
    return ((zzu)paramGoogleApiClient.zza(localzzc)).cancelPendingActions(paramGoogleApiClient, paramList);
  }
  
  public PendingResult fetchDriveId(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzs.3 local3 = new com/google/android/gms/drive/internal/zzs$3;
    local3.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local3);
  }
  
  public DriveFolder getAppFolder(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = Drive.zzUI;
    localObject = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject);
    boolean bool = ((zzu)localObject).zzth();
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Client is not yet connected");
      throw ((Throwable)localObject);
    }
    DriveId localDriveId = ((zzu)localObject).zztg();
    if (localDriveId != null)
    {
      localObject = new com/google/android/gms/drive/internal/zzy;
      ((zzy)localObject).<init>(localDriveId);
    }
    for (;;)
    {
      return (DriveFolder)localObject;
      localObject = null;
    }
  }
  
  public DriveFile getFile(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId)
  {
    if (paramDriveId == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Id must be provided.");
      throw ((Throwable)localObject);
    }
    boolean bool = paramGoogleApiClient.isConnected();
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Client must be connected");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/drive/internal/zzw;
    ((zzw)localObject).<init>(paramDriveId);
    return (DriveFile)localObject;
  }
  
  public DriveFolder getFolder(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId)
  {
    if (paramDriveId == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Id must be provided.");
      throw ((Throwable)localObject);
    }
    boolean bool = paramGoogleApiClient.isConnected();
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Client must be connected");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/drive/internal/zzy;
    ((zzy)localObject).<init>(paramDriveId);
    return (DriveFolder)localObject;
  }
  
  public DriveFolder getRootFolder(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = Drive.zzUI;
    localObject = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject);
    boolean bool = ((zzu)localObject).zzth();
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Client is not yet connected");
      throw ((Throwable)localObject);
    }
    DriveId localDriveId = ((zzu)localObject).zztf();
    if (localDriveId != null)
    {
      localObject = new com/google/android/gms/drive/internal/zzy;
      ((zzy)localObject).<init>(localDriveId);
    }
    for (;;)
    {
      return (DriveFolder)localObject;
      localObject = null;
    }
  }
  
  public PendingResult isAutobackupEnabled(GoogleApiClient paramGoogleApiClient)
  {
    zzs.5 local5 = new com/google/android/gms/drive/internal/zzs$5;
    local5.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local5);
  }
  
  public CreateFileActivityBuilder newCreateFileActivityBuilder()
  {
    CreateFileActivityBuilder localCreateFileActivityBuilder = new com/google/android/gms/drive/CreateFileActivityBuilder;
    localCreateFileActivityBuilder.<init>();
    return localCreateFileActivityBuilder;
  }
  
  public PendingResult newDriveContents(GoogleApiClient paramGoogleApiClient)
  {
    return zza(paramGoogleApiClient, 536870912);
  }
  
  public OpenFileActivityBuilder newOpenFileActivityBuilder()
  {
    OpenFileActivityBuilder localOpenFileActivityBuilder = new com/google/android/gms/drive/OpenFileActivityBuilder;
    localOpenFileActivityBuilder.<init>();
    return localOpenFileActivityBuilder;
  }
  
  public PendingResult query(GoogleApiClient paramGoogleApiClient, Query paramQuery)
  {
    if (paramQuery == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Query must be provided.");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/drive/internal/zzs$1;
    ((zzs.1)localObject).<init>(this, paramGoogleApiClient, paramQuery);
    return paramGoogleApiClient.zza((zza.zza)localObject);
  }
  
  public PendingResult requestSync(GoogleApiClient paramGoogleApiClient)
  {
    zzs.4 local4 = new com/google/android/gms/drive/internal/zzs$4;
    local4.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    zzs.2 local2 = new com/google/android/gms/drive/internal/zzs$2;
    local2.<init>(this, paramGoogleApiClient, paramInt);
    return paramGoogleApiClient.zza(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */