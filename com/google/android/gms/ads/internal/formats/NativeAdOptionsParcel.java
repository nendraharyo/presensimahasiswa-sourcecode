package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class NativeAdOptionsParcel
  implements SafeParcelable
{
  public static final zzj CREATOR;
  public final int versionCode;
  public final boolean zzyA;
  public final int zzyB;
  public final boolean zzyC;
  
  static
  {
    zzj localzzj = new com/google/android/gms/ads/internal/formats/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  public NativeAdOptionsParcel(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    this.versionCode = paramInt1;
    this.zzyA = paramBoolean1;
    this.zzyB = paramInt2;
    this.zzyC = paramBoolean2;
  }
  
  public NativeAdOptionsParcel(NativeAdOptions paramNativeAdOptions)
  {
    this(1, bool1, i, bool2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\NativeAdOptionsParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */