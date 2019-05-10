package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

public class ParcelableEventList
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DataHolder zzavf;
  final boolean zzavg;
  final List zzavh;
  final ParcelableChangeInfo zzavi;
  final List zzpH;
  
  static
  {
    zzd localzzd = new com/google/android/gms/drive/realtime/internal/event/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  ParcelableEventList(int paramInt, List paramList1, DataHolder paramDataHolder, boolean paramBoolean, List paramList2, ParcelableChangeInfo paramParcelableChangeInfo)
  {
    this.mVersionCode = paramInt;
    this.zzpH = paramList1;
    this.zzavf = paramDataHolder;
    this.zzavg = paramBoolean;
    this.zzavh = paramList2;
    this.zzavi = paramParcelableChangeInfo;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\ParcelableEventList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */