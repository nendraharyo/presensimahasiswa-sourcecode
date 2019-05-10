package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GoogleNowAuthState
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  String zzXI;
  String zzbgG;
  long zzbgH;
  
  static
  {
    zza localzza = new com/google/android/gms/search/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  GoogleNowAuthState(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    this.mVersionCode = paramInt;
    this.zzbgG = paramString1;
    this.zzXI = paramString2;
    this.zzbgH = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAccessToken()
  {
    return this.zzXI;
  }
  
  public String getAuthCode()
  {
    return this.zzbgG;
  }
  
  public long getNextAllowedTimeMillis()
  {
    return this.zzbgH;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("mAuthCode = ");
    String str = this.zzbgG;
    localStringBuilder = localStringBuilder.append(str).append("\nmAccessToken = ");
    str = this.zzXI;
    localStringBuilder = localStringBuilder.append(str).append("\nmNextAllowedTimeMillis = ");
    long l = this.zzbgH;
    return l;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\search\GoogleNowAuthState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */