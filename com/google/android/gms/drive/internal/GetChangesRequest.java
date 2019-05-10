package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import java.util.List;
import java.util.Set;

public class GetChangesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzapB;
  private final Set zzapC;
  final ChangeSequenceNumber zzarJ;
  final int zzarK;
  final boolean zzarL;
  
  static
  {
    zzah localzzah = new com/google/android/gms/drive/internal/zzah;
    localzzah.<init>();
    CREATOR = localzzah;
  }
  
  private GetChangesRequest(int paramInt1, ChangeSequenceNumber paramChangeSequenceNumber, int paramInt2, List paramList, Set paramSet, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzarJ = paramChangeSequenceNumber;
    this.zzarK = paramInt2;
    this.zzapB = paramList;
    this.zzapC = paramSet;
    this.zzarL = paramBoolean;
  }
  
  GetChangesRequest(int paramInt1, ChangeSequenceNumber paramChangeSequenceNumber, int paramInt2, List paramList, boolean paramBoolean) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzah.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\GetChangesRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */