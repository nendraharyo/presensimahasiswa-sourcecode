package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class RealtimeDocumentSyncRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzapq;
  final List zzapr;
  
  static
  {
    zzk localzzk = new com/google/android/gms/drive/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  RealtimeDocumentSyncRequest(int paramInt, List paramList1, List paramList2)
  {
    this.mVersionCode = paramInt;
    List localList = (List)zzx.zzz(paramList1);
    this.zzapq = localList;
    localList = (List)zzx.zzz(paramList2);
    this.zzapr = localList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\RealtimeDocumentSyncRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */