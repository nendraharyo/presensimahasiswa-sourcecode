package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent
  implements SafeParcelable, ResourceEvent
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DriveId zzaoz;
  final int zzapx;
  
  static
  {
    zza localzza = new com/google/android/gms/drive/events/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ChangeEvent(int paramInt1, DriveId paramDriveId, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzaoz = paramDriveId;
    this.zzapx = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DriveId getDriveId()
  {
    return this.zzaoz;
  }
  
  public int getType()
  {
    return 1;
  }
  
  public boolean hasBeenDeleted()
  {
    int i = this.zzapx & 0x4;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean hasContentChanged()
  {
    int i = this.zzapx & 0x2;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean hasMetadataChanged()
  {
    int i = this.zzapx & 0x1;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzaoz;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzapx);
    arrayOfObject[1] = localObject;
    return String.format(localLocale, "ChangeEvent [id=%s,changeFlags=%x]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\ChangeEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */