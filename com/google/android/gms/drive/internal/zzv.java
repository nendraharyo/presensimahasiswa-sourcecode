package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.zzi;
import com.google.android.gms.drive.zzi.zza;
import com.google.android.gms.internal.zzna;
import java.io.InputStream;
import java.io.OutputStream;

public class zzv
  implements DriveContents
{
  private boolean mClosed = false;
  private final Contents zzara;
  private boolean zzarb = false;
  private boolean zzarc = false;
  
  public zzv(Contents paramContents)
  {
    Contents localContents = (Contents)zzx.zzz(paramContents);
    this.zzara = localContents;
  }
  
  public PendingResult commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    return zza(paramGoogleApiClient, paramMetadataChangeSet, null);
  }
  
  public PendingResult commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, ExecutionOptions paramExecutionOptions)
  {
    if (paramExecutionOptions == null) {}
    for (zzi localzzi = null;; localzzi = zzi.zzb(paramExecutionOptions)) {
      return zza(paramGoogleApiClient, paramMetadataChangeSet, localzzi);
    }
  }
  
  public void discard(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool = zzsz();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("DriveContents already closed.");
      throw ((Throwable)localObject);
    }
    zzsy();
    Object localObject = new com/google/android/gms/drive/internal/zzv$4;
    ((zzv.4)localObject).<init>(this, paramGoogleApiClient);
    localObject = (zzv.4)paramGoogleApiClient.zzb((zza.zza)localObject);
    zzv.3 local3 = new com/google/android/gms/drive/internal/zzv$3;
    local3.<init>(this);
    ((zzv.4)localObject).setResultCallback(local3);
  }
  
  public DriveId getDriveId()
  {
    return this.zzara.getDriveId();
  }
  
  public InputStream getInputStream()
  {
    boolean bool1 = zzsz();
    if (bool1)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Contents have been closed, cannot access the input stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.zzara;
    int i = ((Contents)localObject).getMode();
    int j = 268435456;
    if (i != j)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
      throw ((Throwable)localObject);
    }
    boolean bool2 = this.zzarb;
    if (bool2)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("getInputStream() can only be called once per Contents instance.");
      throw ((Throwable)localObject);
    }
    this.zzarb = true;
    return this.zzara.getInputStream();
  }
  
  public int getMode()
  {
    return this.zzara.getMode();
  }
  
  public OutputStream getOutputStream()
  {
    boolean bool1 = zzsz();
    if (bool1)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Contents have been closed, cannot access the output stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.zzara;
    int i = ((Contents)localObject).getMode();
    int j = 536870912;
    if (i != j)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
      throw ((Throwable)localObject);
    }
    boolean bool2 = this.zzarc;
    if (bool2)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("getOutputStream() can only be called once per Contents instance.");
      throw ((Throwable)localObject);
    }
    this.zzarc = true;
    return this.zzara.getOutputStream();
  }
  
  public ParcelFileDescriptor getParcelFileDescriptor()
  {
    boolean bool = zzsz();
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Contents have been closed, cannot access the output stream.");
      throw localIllegalStateException;
    }
    return this.zzara.getParcelFileDescriptor();
  }
  
  public PendingResult reopenForWrite(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool = zzsz();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("DriveContents already closed.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.zzara;
    int i = ((Contents)localObject).getMode();
    int j = 268435456;
    if (i != j)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
      throw ((Throwable)localObject);
    }
    zzsy();
    localObject = new com/google/android/gms/drive/internal/zzv$1;
    ((zzv.1)localObject).<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza((zza.zza)localObject);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, zzi paramzzi)
  {
    if (paramzzi == null)
    {
      localObject = new com/google/android/gms/drive/zzi$zza;
      ((zzi.zza)localObject).<init>();
      paramzzi = ((zzi.zza)localObject).zzsJ();
    }
    Object localObject = this.zzara;
    int i = ((Contents)localObject).getMode();
    int j = 268435456;
    if (i == j)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot commit contents opened with MODE_READ_ONLY");
      throw ((Throwable)localObject);
    }
    boolean bool = ExecutionOptions.zzcv(paramzzi.zzsD());
    if (bool)
    {
      localObject = this.zzara;
      bool = ((Contents)localObject).zzsv();
      if (!bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("DriveContents must be valid for conflict detection.");
        throw ((Throwable)localObject);
      }
    }
    paramzzi.zzg(paramGoogleApiClient);
    bool = zzsz();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("DriveContents already closed.");
      throw ((Throwable)localObject);
    }
    localObject = getDriveId();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Only DriveContents obtained through DriveFile.open can be committed.");
      throw ((Throwable)localObject);
    }
    if (paramMetadataChangeSet != null) {}
    for (;;)
    {
      zzsy();
      localObject = new com/google/android/gms/drive/internal/zzv$2;
      ((zzv.2)localObject).<init>(this, paramGoogleApiClient, paramMetadataChangeSet, paramzzi);
      return paramGoogleApiClient.zzb((zza.zza)localObject);
      paramMetadataChangeSet = MetadataChangeSet.zzapd;
    }
  }
  
  public Contents zzsx()
  {
    return this.zzara;
  }
  
  public void zzsy()
  {
    zzna.zza(this.zzara.getParcelFileDescriptor());
    this.mClosed = true;
  }
  
  public boolean zzsz()
  {
    return this.mClosed;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */