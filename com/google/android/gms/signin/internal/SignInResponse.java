package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final ConnectionResult zzams;
  private final ResolveAccountResponse zzbhk;
  
  static
  {
    zzj localzzj = new com/google/android/gms/signin/internal/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  public SignInResponse(int paramInt)
  {
    this(localConnectionResult, null);
  }
  
  SignInResponse(int paramInt, ConnectionResult paramConnectionResult, ResolveAccountResponse paramResolveAccountResponse)
  {
    this.mVersionCode = paramInt;
    this.zzams = paramConnectionResult;
    this.zzbhk = paramResolveAccountResponse;
  }
  
  public SignInResponse(ConnectionResult paramConnectionResult, ResolveAccountResponse paramResolveAccountResponse)
  {
    this(1, paramConnectionResult, paramResolveAccountResponse);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public ResolveAccountResponse zzFP()
  {
    return this.zzbhk;
  }
  
  public ConnectionResult zzqY()
  {
    return this.zzams;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\SignInResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */