package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListEntriesResponse
  extends WriteAwareParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final boolean zzaqJ;
  final DataHolder zzass;
  
  static
  {
    zzbc localzzbc = new com/google/android/gms/drive/internal/zzbc;
    localzzbc.<init>();
    CREATOR = localzzbc;
  }
  
  OnListEntriesResponse(int paramInt, DataHolder paramDataHolder, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzass = paramDataHolder;
    this.zzaqJ = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  protected void zzJ(Parcel paramParcel, int paramInt)
  {
    zzbc.zza(this, paramParcel, paramInt);
  }
  
  public DataHolder zztt()
  {
    return this.zzass;
  }
  
  public boolean zztu()
  {
    return this.zzaqJ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnListEntriesResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */