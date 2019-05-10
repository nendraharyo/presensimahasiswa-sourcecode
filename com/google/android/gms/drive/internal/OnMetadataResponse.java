package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final MetadataBundle zzaqw;
  
  static
  {
    zzbe localzzbe = new com/google/android/gms/drive/internal/zzbe;
    localzzbe.<init>();
    CREATOR = localzzbe;
  }
  
  OnMetadataResponse(int paramInt, MetadataBundle paramMetadataBundle)
  {
    this.mVersionCode = paramInt;
    this.zzaqw = paramMetadataBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbe.zza(this, paramParcel, paramInt);
  }
  
  public MetadataBundle zztw()
  {
    return this.zzaqw;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnMetadataResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */