package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LoyaltyPoints
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  String label;
  private final int mVersionCode;
  String type;
  TimeInterval zzboY;
  LoyaltyPointsBalance zzbqI;
  
  static
  {
    zze localzze = new com/google/android/gms/wallet/wobs/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  LoyaltyPoints()
  {
    this.mVersionCode = 1;
  }
  
  LoyaltyPoints(int paramInt, String paramString1, LoyaltyPointsBalance paramLoyaltyPointsBalance, String paramString2, TimeInterval paramTimeInterval)
  {
    this.mVersionCode = paramInt;
    this.label = paramString1;
    this.zzbqI = paramLoyaltyPointsBalance;
    this.type = paramString2;
    this.zzboY = paramTimeInterval;
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
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\LoyaltyPoints.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */