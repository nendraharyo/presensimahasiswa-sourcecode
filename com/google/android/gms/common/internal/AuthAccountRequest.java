package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final Scope[] zzafT;
  final IBinder zzakA;
  Integer zzakB;
  Integer zzakC;
  
  static
  {
    zzc localzzc = new com/google/android/gms/common/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  AuthAccountRequest(int paramInt, IBinder paramIBinder, Scope[] paramArrayOfScope, Integer paramInteger1, Integer paramInteger2)
  {
    this.mVersionCode = paramInt;
    this.zzakA = paramIBinder;
    this.zzafT = paramArrayOfScope;
    this.zzakB = paramInteger1;
    this.zzakC = paramInteger2;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\AuthAccountRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */