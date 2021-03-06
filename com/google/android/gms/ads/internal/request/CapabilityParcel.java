package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CapabilityParcel
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int versionCode;
  public final boolean zzIn;
  public final boolean zzIo;
  public final boolean zzIp;
  
  static
  {
    zzi localzzi = new com/google/android/gms/ads/internal/request/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  CapabilityParcel(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.versionCode = paramInt;
    this.zzIn = paramBoolean1;
    this.zzIo = paramBoolean2;
    this.zzIp = paramBoolean3;
  }
  
  public CapabilityParcel(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this(2, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bundle toBundle()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    boolean bool = this.zzIn;
    localBundle.putBoolean("iap_supported", bool);
    bool = this.zzIo;
    localBundle.putBoolean("default_iap_supported", bool);
    bool = this.zzIp;
    localBundle.putBoolean("app_streaming_supported", bool);
    return localBundle;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\CapabilityParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */