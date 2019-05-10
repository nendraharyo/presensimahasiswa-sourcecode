package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;

public class NotFilter
  extends AbstractFilter
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final FilterHolder zzauw;
  
  static
  {
    zzm localzzm = new com/google/android/gms/drive/query/internal/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  NotFilter(int paramInt, FilterHolder paramFilterHolder)
  {
    this.mVersionCode = paramInt;
    this.zzauw = paramFilterHolder;
  }
  
  public NotFilter(Filter paramFilter)
  {
    this(1, localFilterHolder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    Object localObject = this.zzauw.getFilter().zza(paramzzf);
    return paramzzf.zzB(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\NotFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */