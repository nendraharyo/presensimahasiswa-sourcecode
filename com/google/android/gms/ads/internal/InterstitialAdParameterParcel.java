package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class InterstitialAdParameterParcel
  implements SafeParcelable
{
  public static final zzl CREATOR;
  public final int versionCode;
  public final boolean zzql;
  public final boolean zzqm;
  public final String zzqn;
  public final boolean zzqo;
  public final float zzqp;
  
  static
  {
    zzl localzzl = new com/google/android/gms/ads/internal/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  InterstitialAdParameterParcel(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat)
  {
    this.versionCode = paramInt;
    this.zzql = paramBoolean1;
    this.zzqm = paramBoolean2;
    this.zzqn = paramString;
    this.zzqo = paramBoolean3;
    this.zzqp = paramFloat;
  }
  
  public InterstitialAdParameterParcel(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat)
  {
    this(2, paramBoolean1, paramBoolean2, paramString, paramBoolean3, paramFloat);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\InterstitialAdParameterParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */