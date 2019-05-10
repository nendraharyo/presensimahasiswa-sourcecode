package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableIndexReference
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mIndex;
  final int mVersionCode;
  final String zzauL;
  final boolean zzauM;
  final int zzauN;
  
  static
  {
    zzr localzzr = new com/google/android/gms/drive/realtime/internal/zzr;
    localzzr.<init>();
    CREATOR = localzzr;
  }
  
  ParcelableIndexReference(int paramInt1, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzauL = paramString;
    this.mIndex = paramInt2;
    this.zzauM = paramBoolean;
    this.zzauN = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\ParcelableIndexReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */