package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final Contents zzara;
  final boolean zzasf;
  
  static
  {
    zzaw localzzaw = new com/google/android/gms/drive/internal/zzaw;
    localzzaw.<init>();
    CREATOR = localzzaw;
  }
  
  OnContentsResponse(int paramInt, Contents paramContents, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzara = paramContents;
    this.zzasf = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaw.zza(this, paramParcel, paramInt);
  }
  
  public Contents zztn()
  {
    return this.zzara;
  }
  
  public boolean zzto()
  {
    return this.zzasf;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnContentsResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */