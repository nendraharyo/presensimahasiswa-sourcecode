package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public class OnDownloadProgressResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private static final List zzash = ;
  final int mVersionCode;
  final int zzBc;
  final long zzasi;
  final long zzasj;
  final List zzask;
  
  static
  {
    zzay localzzay = new com/google/android/gms/drive/internal/zzay;
    localzzay.<init>();
    CREATOR = localzzay;
  }
  
  OnDownloadProgressResponse(int paramInt1, long paramLong1, long paramLong2, int paramInt2, List paramList)
  {
    this.mVersionCode = paramInt1;
    this.zzasi = paramLong1;
    this.zzasj = paramLong2;
    this.zzBc = paramInt2;
    this.zzask = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzay.zza(this, paramParcel, paramInt);
  }
  
  public long zztq()
  {
    return this.zzasi;
  }
  
  public long zztr()
  {
    return this.zzasj;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnDownloadProgressResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */