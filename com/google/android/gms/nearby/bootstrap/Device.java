package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class Device
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String description;
  private final String name;
  final int versionCode;
  private final String zzbaQ;
  private final byte zzbaR;
  
  static
  {
    zzb localzzb = new com/google/android/gms/nearby/bootstrap/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  Device(int paramInt, String paramString1, String paramString2, String paramString3, byte paramByte)
  {
    this.versionCode = paramInt;
    String str = zzx.zzcM(paramString1);
    this.name = str;
    str = (String)zzx.zzz(paramString2);
    this.description = str;
    str = (String)zzx.zzz(paramString3);
    this.zzbaQ = str;
    byte b = 4;
    if (paramByte <= b) {
      b = 1;
    }
    for (;;)
    {
      zzx.zzb(b, "Unknown device type");
      this.zzbaR = paramByte;
      return;
      b = 0;
      str = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public String getDeviceId()
  {
    return this.zzbaQ;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.name;
    localStringBuilder = localStringBuilder.append(str).append(": ");
    str = this.description;
    localStringBuilder = localStringBuilder.append(str).append("[");
    int i = this.zzbaR;
    return i + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public byte zzEb()
  {
    return this.zzbaR;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\Device.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */