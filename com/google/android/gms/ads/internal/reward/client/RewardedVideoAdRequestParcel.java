package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class RewardedVideoAdRequestParcel
  implements SafeParcelable
{
  public static final zzh CREATOR;
  public final int versionCode;
  public final AdRequestParcel zzHt;
  public final String zzrj;
  
  static
  {
    zzh localzzh = new com/google/android/gms/ads/internal/reward/client/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  public RewardedVideoAdRequestParcel(int paramInt, AdRequestParcel paramAdRequestParcel, String paramString)
  {
    this.versionCode = paramInt;
    this.zzHt = paramAdRequestParcel;
    this.zzrj = paramString;
  }
  
  public RewardedVideoAdRequestParcel(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    this(1, paramAdRequestParcel, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\RewardedVideoAdRequestParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */