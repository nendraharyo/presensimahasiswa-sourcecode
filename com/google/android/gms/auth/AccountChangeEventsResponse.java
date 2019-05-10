package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class AccountChangeEventsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersion;
  final List zzpH;
  
  static
  {
    zzc localzzc = new com/google/android/gms/auth/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  AccountChangeEventsResponse(int paramInt, List paramList)
  {
    this.mVersion = paramInt;
    List localList = (List)zzx.zzz(paramList);
    this.zzpH = localList;
  }
  
  public AccountChangeEventsResponse(List paramList)
  {
    this.mVersion = 1;
    List localList = (List)zzx.zzz(paramList);
    this.zzpH = localList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getEvents()
  {
    return this.zzpH;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\AccountChangeEventsResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */