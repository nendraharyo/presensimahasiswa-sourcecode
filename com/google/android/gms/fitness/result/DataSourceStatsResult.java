package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class DataSourceStatsResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final long zzUZ;
  public final boolean zzaBI;
  public final long zzaBJ;
  public final long zzaBK;
  public final DataSource zzavU;
  
  static
  {
    zzd localzzd = new com/google/android/gms/fitness/result/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  DataSourceStatsResult(int paramInt, DataSource paramDataSource, long paramLong1, boolean paramBoolean, long paramLong2, long paramLong3)
  {
    this.mVersionCode = paramInt;
    this.zzavU = paramDataSource;
    this.zzUZ = paramLong1;
    this.zzaBI = paramBoolean;
    this.zzaBJ = paramLong2;
    this.zzaBK = paramLong3;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\DataSourceStatsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */