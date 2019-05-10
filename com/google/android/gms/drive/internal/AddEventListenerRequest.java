package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;

public class AddEventListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzanf;
  final DriveId zzaoz;
  final TransferStateOptions zzapY;
  final TransferProgressOptions zzapZ;
  final ChangesAvailableOptions zzapy;
  
  static
  {
    zza localzza = new com/google/android/gms/drive/internal/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public AddEventListenerRequest(int paramInt, DriveId paramDriveId)
  {
    this(1, localDriveId, paramInt, null, null, null);
  }
  
  AddEventListenerRequest(int paramInt1, DriveId paramDriveId, int paramInt2, ChangesAvailableOptions paramChangesAvailableOptions, TransferStateOptions paramTransferStateOptions, TransferProgressOptions paramTransferProgressOptions)
  {
    this.mVersionCode = paramInt1;
    this.zzaoz = paramDriveId;
    this.zzanf = paramInt2;
    this.zzapy = paramChangesAvailableOptions;
    this.zzapY = paramTransferStateOptions;
    this.zzapZ = paramTransferProgressOptions;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DriveId getDriveId()
  {
    return this.zzaoz;
  }
  
  public int getEventType()
  {
    return this.zzanf;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\AddEventListenerRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */