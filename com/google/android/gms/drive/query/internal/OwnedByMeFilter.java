package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class OwnedByMeFilter
  extends AbstractFilter
{
  public static final zzo CREATOR;
  final int mVersionCode;
  
  static
  {
    zzo localzzo = new com/google/android/gms/drive/query/internal/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  public OwnedByMeFilter()
  {
    this(1);
  }
  
  OwnedByMeFilter(int paramInt)
  {
    this.mVersionCode = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zztP();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\OwnedByMeFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */