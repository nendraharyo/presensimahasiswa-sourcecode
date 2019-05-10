package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class VersionInfoParcel
  implements SafeParcelable
{
  public static final zzc CREATOR;
  public String afmaVersion;
  public final int versionCode;
  public int zzMZ;
  public int zzNa;
  public boolean zzNb;
  
  static
  {
    zzc localzzc = new com/google/android/gms/ads/internal/util/client/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  public VersionInfoParcel(int paramInt1, int paramInt2, boolean paramBoolean) {}
  
  VersionInfoParcel(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.versionCode = paramInt1;
    this.afmaVersion = paramString;
    this.zzMZ = paramInt2;
    this.zzNa = paramInt3;
    this.zzNb = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\interna\\util\client\VersionInfoParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */