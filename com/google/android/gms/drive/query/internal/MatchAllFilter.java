package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter
  extends AbstractFilter
{
  public static final zzl CREATOR;
  final int mVersionCode;
  
  static
  {
    zzl localzzl = new com/google/android/gms/drive/query/internal/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  public MatchAllFilter()
  {
    this(1);
  }
  
  MatchAllFilter(int paramInt)
  {
    this.mVersionCode = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zztQ();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\MatchAllFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */