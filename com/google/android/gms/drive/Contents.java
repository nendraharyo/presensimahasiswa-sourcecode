package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Contents
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final ParcelFileDescriptor zzajL;
  final boolean zzaoA;
  final int zzaox;
  final int zzaoy;
  final DriveId zzaoz;
  final String zzsU;
  
  static
  {
    zzb localzzb = new com/google/android/gms/drive/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  Contents(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2, int paramInt3, DriveId paramDriveId, boolean paramBoolean, String paramString)
  {
    this.mVersionCode = paramInt1;
    this.zzajL = paramParcelFileDescriptor;
    this.zzaox = paramInt2;
    this.zzaoy = paramInt3;
    this.zzaoz = paramDriveId;
    this.zzaoA = paramBoolean;
    this.zzsU = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DriveId getDriveId()
  {
    return this.zzaoz;
  }
  
  public InputStream getInputStream()
  {
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    FileDescriptor localFileDescriptor = this.zzajL.getFileDescriptor();
    localFileInputStream.<init>(localFileDescriptor);
    return localFileInputStream;
  }
  
  public int getMode()
  {
    return this.zzaoy;
  }
  
  public OutputStream getOutputStream()
  {
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    FileDescriptor localFileDescriptor = this.zzajL.getFileDescriptor();
    localFileOutputStream.<init>(localFileDescriptor);
    return localFileOutputStream;
  }
  
  public ParcelFileDescriptor getParcelFileDescriptor()
  {
    return this.zzajL;
  }
  
  public int getRequestId()
  {
    return this.zzaox;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzsv()
  {
    return this.zzaoA;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\Contents.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */