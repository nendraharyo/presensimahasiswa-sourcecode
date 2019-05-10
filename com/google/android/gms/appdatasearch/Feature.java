package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Feature
  implements SafeParcelable
{
  public static final zze CREATOR;
  public final int id;
  final int mVersionCode;
  final Bundle zzTS;
  
  static
  {
    zze localzze = new com/google/android/gms/appdatasearch/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  Feature(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.mVersionCode = paramInt1;
    this.id = paramInt2;
    this.zzTS = paramBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\Feature.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */