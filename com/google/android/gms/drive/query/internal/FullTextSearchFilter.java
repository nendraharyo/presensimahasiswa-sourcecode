package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class FullTextSearchFilter
  extends AbstractFilter
{
  public static final zzh CREATOR;
  final String mValue;
  final int mVersionCode;
  
  static
  {
    zzh localzzh = new com/google/android/gms/drive/query/internal/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  FullTextSearchFilter(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.mValue = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    String str = this.mValue;
    return paramzzf.zzdj(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\FullTextSearchFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */