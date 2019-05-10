package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class QueryResultEventParcelable
  extends WriteAwareParcelable
  implements DriveEvent
{
  public static final zzl CREATOR;
  final int mVersionCode;
  final DataHolder zzahi;
  final boolean zzapQ;
  final int zzapR;
  
  static
  {
    zzl localzzl = new com/google/android/gms/drive/events/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  QueryResultEventParcelable(int paramInt1, DataHolder paramDataHolder, boolean paramBoolean, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzahi = paramDataHolder;
    this.zzapQ = paramBoolean;
    this.zzapR = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getType()
  {
    return 3;
  }
  
  public void zzJ(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public DataHolder zzsX()
  {
    return this.zzahi;
  }
  
  public boolean zzsY()
  {
    return this.zzapQ;
  }
  
  public int zzsZ()
  {
    return this.zzapR;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\QueryResultEventParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */