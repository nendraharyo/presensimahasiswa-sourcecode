package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListParentsResponse
  extends WriteAwareParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DataHolder zzast;
  
  static
  {
    zzbd localzzbd = new com/google/android/gms/drive/internal/zzbd;
    localzzbd.<init>();
    CREATOR = localzzbd;
  }
  
  OnListParentsResponse(int paramInt, DataHolder paramDataHolder)
  {
    this.mVersionCode = paramInt;
    this.zzast = paramDataHolder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  protected void zzJ(Parcel paramParcel, int paramInt)
  {
    zzbd.zza(this, paramParcel, paramInt);
  }
  
  public DataHolder zztv()
  {
    return this.zzast;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnListParentsResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */