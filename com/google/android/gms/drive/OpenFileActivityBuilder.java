package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.zzam;
import com.google.android.gms.drive.internal.zzu;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.zzg;

public class OpenFileActivityBuilder
{
  public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
  private String zzapg;
  private String[] zzaph;
  private Filter zzapi;
  private DriveId zzapj;
  
  public IntentSender build(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool = paramGoogleApiClient.isConnected();
    localObject1 = "Client must be connected";
    zzx.zza(bool, localObject1);
    Object localObject2 = this.zzaph;
    if (localObject2 == null)
    {
      bool = false;
      localObject2 = new String[0];
      this.zzaph = ((String[])localObject2);
    }
    localObject2 = this.zzaph;
    int i = localObject2.length;
    if (i > 0)
    {
      localObject2 = this.zzapi;
      if (localObject2 != null)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("Cannot use a selection filter and set mimetypes simultaneously");
        throw ((Throwable)localObject2);
      }
    }
    localObject2 = this.zzapi;
    if (localObject2 == null)
    {
      i = 0;
      localObject2 = null;
    }
    for (localObject1 = null;; localObject1 = localObject2)
    {
      try
      {
        localObject2 = Drive.zzUI;
        localObject2 = paramGoogleApiClient.zza((Api.zzc)localObject2);
        localObject2 = (zzu)localObject2;
        localObject2 = ((zzu)localObject2).zzte();
        OpenFileIntentSenderRequest localOpenFileIntentSenderRequest = new com/google/android/gms/drive/internal/OpenFileIntentSenderRequest;
        String str = this.zzapg;
        String[] arrayOfString = this.zzaph;
        DriveId localDriveId = this.zzapj;
        localOpenFileIntentSenderRequest.<init>(str, arrayOfString, localDriveId, (FilterHolder)localObject1);
        return ((zzam)localObject2).zza(localOpenFileIntentSenderRequest);
      }
      catch (RemoteException localRemoteException)
      {
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("Unable to connect Drive Play Service", localRemoteException);
        throw ((Throwable)localObject1);
      }
      localObject2 = new com/google/android/gms/drive/query/internal/FilterHolder;
      localObject1 = this.zzapi;
      ((FilterHolder)localObject2).<init>((Filter)localObject1);
    }
  }
  
  public OpenFileActivityBuilder setActivityStartFolder(DriveId paramDriveId)
  {
    DriveId localDriveId = (DriveId)zzx.zzz(paramDriveId);
    this.zzapj = localDriveId;
    return this;
  }
  
  public OpenFileActivityBuilder setActivityTitle(String paramString)
  {
    String str = (String)zzx.zzz(paramString);
    this.zzapg = str;
    return this;
  }
  
  public OpenFileActivityBuilder setMimeType(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "mimeTypes may not be null");
      this.zzaph = paramArrayOfString;
      return this;
    }
  }
  
  public OpenFileActivityBuilder setSelectionFilter(Filter paramFilter)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramFilter != null)
    {
      bool2 = bool1;
      String str = "filter may not be null";
      zzx.zzb(bool2, str);
      bool2 = zzg.zza(paramFilter);
      if (bool2) {
        break label45;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "FullTextSearchFilter cannot be used as a selection filter");
      this.zzapi = paramFilter;
      return this;
      bool2 = false;
      break;
      label45:
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\OpenFileActivityBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */