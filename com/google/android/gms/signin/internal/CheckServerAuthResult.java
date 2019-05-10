package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CheckServerAuthResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final boolean zzbhf;
  final List zzbhg;
  
  static
  {
    zzc localzzc = new com/google/android/gms/signin/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  CheckServerAuthResult(int paramInt, boolean paramBoolean, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzbhf = paramBoolean;
    this.zzbhg = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\CheckServerAuthResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */