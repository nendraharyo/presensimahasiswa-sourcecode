package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class NearbyDeviceFilter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzbci;
  final byte[] zzbcj;
  final boolean zzbck;
  
  static
  {
    zzg localzzg = new com/google/android/gms/nearby/messages/devices/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  NearbyDeviceFilter(int paramInt1, int paramInt2, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzbci = paramInt2;
    this.zzbcj = paramArrayOfByte;
    this.zzbck = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\NearbyDeviceFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */