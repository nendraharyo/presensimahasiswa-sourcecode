package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzq.zza;

public class DriveServiceResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final IBinder zzarB;
  
  static
  {
    zzad localzzad = new com/google/android/gms/drive/internal/zzad;
    localzzad.<init>();
    CREATOR = localzzad;
  }
  
  DriveServiceResponse(int paramInt, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzarB = paramIBinder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzad.zza(this, paramParcel, paramInt);
  }
  
  public zzq zztj()
  {
    return zzq.zza.zzaQ(this.zzarB);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\DriveServiceResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */