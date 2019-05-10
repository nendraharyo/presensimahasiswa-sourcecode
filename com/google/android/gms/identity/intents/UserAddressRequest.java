package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class UserAddressRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  List zzaMA;
  
  static
  {
    zza localzza = new com/google/android/gms/identity/intents/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  UserAddressRequest()
  {
    this.mVersionCode = 1;
  }
  
  UserAddressRequest(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaMA = paramList;
  }
  
  public static UserAddressRequest.Builder newBuilder()
  {
    UserAddressRequest.Builder localBuilder = new com/google/android/gms/identity/intents/UserAddressRequest$Builder;
    UserAddressRequest localUserAddressRequest = new com/google/android/gms/identity/intents/UserAddressRequest;
    localUserAddressRequest.<init>();
    localUserAddressRequest.getClass();
    localBuilder.<init>(localUserAddressRequest, null);
    return localBuilder;
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
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\identity\intents\UserAddressRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */