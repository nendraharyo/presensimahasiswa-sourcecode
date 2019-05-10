package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

public class OnChangesResponse
  extends WriteAwareParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DataHolder zzasb;
  final List zzasc;
  final ChangeSequenceNumber zzasd;
  final boolean zzase;
  
  static
  {
    zzav localzzav = new com/google/android/gms/drive/internal/zzav;
    localzzav.<init>();
    CREATOR = localzzav;
  }
  
  OnChangesResponse(int paramInt, DataHolder paramDataHolder, List paramList, ChangeSequenceNumber paramChangeSequenceNumber, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzasb = paramDataHolder;
    this.zzasc = paramList;
    this.zzasd = paramChangeSequenceNumber;
    this.zzase = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  protected void zzJ(Parcel paramParcel, int paramInt)
  {
    int i = paramInt | 0x1;
    zzav.zza(this, paramParcel, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnChangesResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */