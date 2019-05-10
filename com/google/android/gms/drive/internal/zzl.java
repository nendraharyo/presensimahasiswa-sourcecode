package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzl
{
  private String zzapg;
  private DriveId zzapj;
  protected MetadataChangeSet zzaqt;
  private Integer zzaqu;
  private final int zzaqv;
  
  public zzl(int paramInt)
  {
    this.zzaqv = paramInt;
  }
  
  public IntentSender build(GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(this.zzaqt, "Must provide initial metadata to CreateFileActivityBuilder.");
    boolean bool = paramGoogleApiClient.isConnected();
    zzx.zza(bool, "Client must be connected");
    Object localObject1 = Drive.zzUI;
    localObject1 = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject1);
    localObject2 = this.zzaqt.zzsL();
    Context localContext = ((zzu)localObject1).getContext();
    ((MetadataBundle)localObject2).setContext(localContext);
    localObject2 = this.zzaqu;
    int i;
    if (localObject2 == null)
    {
      i = 0;
      localContext = null;
    }
    for (;;)
    {
      try
      {
        zzam localzzam = ((zzu)localObject1).zzte();
        localObject1 = new com/google/android/gms/drive/internal/CreateFileIntentSenderRequest;
        localObject2 = this.zzaqt;
        localObject2 = ((MetadataChangeSet)localObject2).zzsL();
        String str = this.zzapg;
        DriveId localDriveId = this.zzapj;
        int j = this.zzaqv;
        ((CreateFileIntentSenderRequest)localObject1).<init>((MetadataBundle)localObject2, i, str, localDriveId, j);
        return localzzam.zza((CreateFileIntentSenderRequest)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = new java/lang/RuntimeException;
        ((RuntimeException)localObject2).<init>("Unable to connect Drive Play Service", localRemoteException);
        throw ((Throwable)localObject2);
      }
      localObject2 = this.zzaqu;
      i = ((Integer)localObject2).intValue();
    }
  }
  
  public void zza(DriveId paramDriveId)
  {
    DriveId localDriveId = (DriveId)zzx.zzz(paramDriveId);
    this.zzapj = localDriveId;
  }
  
  public void zza(MetadataChangeSet paramMetadataChangeSet)
  {
    MetadataChangeSet localMetadataChangeSet = (MetadataChangeSet)zzx.zzz(paramMetadataChangeSet);
    this.zzaqt = localMetadataChangeSet;
  }
  
  public void zzcZ(int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    this.zzaqu = localInteger;
  }
  
  public void zzdb(String paramString)
  {
    String str = (String)zzx.zzz(paramString);
    this.zzapg = str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */