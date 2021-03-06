package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CheckResourceIdsExistRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzaqi;
  
  static
  {
    zzg localzzg = new com/google/android/gms/drive/internal/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  CheckResourceIdsExistRequest(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaqi = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public List zztc()
  {
    return this.zzaqi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CheckResourceIdsExistRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */