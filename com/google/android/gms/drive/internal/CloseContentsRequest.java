package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final Contents zzaql;
  final int zzaqn;
  final Boolean zzaqp;
  
  static
  {
    zzi localzzi = new com/google/android/gms/drive/internal/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  CloseContentsRequest(int paramInt1, Contents paramContents, Boolean paramBoolean, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzaql = paramContents;
    this.zzaqp = paramBoolean;
    this.zzaqn = paramInt2;
  }
  
  public CloseContentsRequest(int paramInt, boolean paramBoolean)
  {
    this(1, null, localBoolean, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CloseContentsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */