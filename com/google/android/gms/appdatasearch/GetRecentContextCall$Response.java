package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetRecentContextCall$Response
  implements Result, SafeParcelable
{
  public static final zzg CREATOR;
  final int mVersionCode;
  public Status zzTY;
  public List zzTZ;
  public String[] zzUa;
  
  static
  {
    zzg localzzg = new com/google/android/gms/appdatasearch/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  public GetRecentContextCall$Response()
  {
    this.mVersionCode = 1;
  }
  
  GetRecentContextCall$Response(int paramInt, Status paramStatus, List paramList, String[] paramArrayOfString)
  {
    this.mVersionCode = paramInt;
    this.zzTY = paramStatus;
    this.zzTZ = paramList;
    this.zzUa = paramArrayOfString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return this.zzTY;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\GetRecentContextCall$Response.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */