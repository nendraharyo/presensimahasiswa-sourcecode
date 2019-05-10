package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class CreateContentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzaoy;
  
  static
  {
    zzk localzzk = new com/google/android/gms/drive/internal/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  public CreateContentsRequest(int paramInt)
  {
    this(1, paramInt);
  }
  
  CreateContentsRequest(int paramInt1, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    int i = 536870912;
    if (paramInt2 != i)
    {
      i = 805306368;
      if (paramInt2 != i) {
        break label39;
      }
    }
    label39:
    for (i = 1;; i = 0)
    {
      zzx.zzb(i, "Cannot create a new read-only contents!");
      this.zzaoy = paramInt2;
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CreateContentsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */