package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private int zzbhd;
  private Intent zzbhe;
  
  static
  {
    zza localzza = new com/google/android/gms/signin/internal/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public AuthAccountResult()
  {
    this(0, null);
  }
  
  AuthAccountResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.mVersionCode = paramInt1;
    this.zzbhd = paramInt2;
    this.zzbhe = paramIntent;
  }
  
  public AuthAccountResult(int paramInt, Intent paramIntent)
  {
    this(2, paramInt, paramIntent);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    int i = this.zzbhd;
    if (i == 0) {}
    for (Status localStatus = Status.zzagC;; localStatus = Status.zzagG) {
      return localStatus;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public int zzFK()
  {
    return this.zzbhd;
  }
  
  public Intent zzFL()
  {
    return this.zzbhe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\AuthAccountResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */