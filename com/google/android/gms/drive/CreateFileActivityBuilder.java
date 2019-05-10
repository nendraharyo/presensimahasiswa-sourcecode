package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.zzl;
import com.google.android.gms.drive.internal.zzv;

public class CreateFileActivityBuilder
{
  public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
  private final zzl zzaoB;
  private DriveContents zzaoC;
  private boolean zzaoD;
  
  public CreateFileActivityBuilder()
  {
    zzl localzzl = new com/google/android/gms/drive/internal/zzl;
    localzzl.<init>(0);
    this.zzaoB = localzzl;
  }
  
  public IntentSender build(GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(Boolean.valueOf(this.zzaoD), "Must call setInitialDriveContents to CreateFileActivityBuilder.");
    boolean bool = paramGoogleApiClient.isConnected();
    String str = "Client must be connected";
    zzx.zza(bool, str);
    DriveContents localDriveContents = this.zzaoC;
    if (localDriveContents != null)
    {
      localDriveContents = this.zzaoC;
      localDriveContents.zzsy();
    }
    return this.zzaoB.build(paramGoogleApiClient);
  }
  
  public CreateFileActivityBuilder setActivityStartFolder(DriveId paramDriveId)
  {
    this.zzaoB.zza(paramDriveId);
    return this;
  }
  
  public CreateFileActivityBuilder setActivityTitle(String paramString)
  {
    this.zzaoB.zzdb(paramString);
    return this;
  }
  
  public CreateFileActivityBuilder setInitialDriveContents(DriveContents paramDriveContents)
  {
    int i = 1;
    Object localObject;
    if (paramDriveContents != null)
    {
      boolean bool = paramDriveContents instanceof zzv;
      if (!bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Only DriveContents obtained from the Drive API are accepted.");
        throw ((Throwable)localObject);
      }
      localObject = ((DriveContents)paramDriveContents).getDriveId();
      if (localObject != null)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        throw ((Throwable)localObject);
      }
      bool = ((DriveContents)paramDriveContents).zzsz();
      if (bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("DriveContents are already closed.");
        throw ((Throwable)localObject);
      }
      localObject = this.zzaoB;
      Contents localContents = ((DriveContents)paramDriveContents).zzsx();
      int j = localContents.getRequestId();
      ((zzl)localObject).zzcZ(j);
      this.zzaoC = ((DriveContents)paramDriveContents);
    }
    for (;;)
    {
      this.zzaoD = i;
      return this;
      localObject = this.zzaoB;
      ((zzl)localObject).zzcZ(i);
    }
  }
  
  public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet paramMetadataChangeSet)
  {
    this.zzaoB.zza(paramMetadataChangeSet);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\CreateFileActivityBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */