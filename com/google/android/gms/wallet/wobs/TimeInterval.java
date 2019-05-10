package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TimeInterval
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  long zzbqP;
  long zzbqQ;
  
  static
  {
    zzg localzzg = new com/google/android/gms/wallet/wobs/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  TimeInterval()
  {
    this.mVersionCode = 1;
  }
  
  TimeInterval(int paramInt, long paramLong1, long paramLong2)
  {
    this.mVersionCode = paramInt;
    this.zzbqP = paramLong1;
    this.zzbqQ = paramLong2;
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\TimeInterval.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */