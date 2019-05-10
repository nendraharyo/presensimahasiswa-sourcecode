package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableTransferPreferences
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzarG;
  final int zzarH;
  final boolean zzasA;
  
  static
  {
    zzbn localzzbn = new com/google/android/gms/drive/internal/zzbn;
    localzzbn.<init>();
    CREATOR = localzzbn;
  }
  
  ParcelableTransferPreferences(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzarG = paramInt2;
    this.zzarH = paramInt3;
    this.zzasA = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbn.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\ParcelableTransferPreferences.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */