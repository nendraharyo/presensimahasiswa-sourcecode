package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class DataSourceQueryParams
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final long zzUZ;
  public final int zzaAO;
  public final long zzaAT;
  public final int zzaAU;
  public final DataSource zzavU;
  public final long zzawk;
  
  static
  {
    zzg localzzg = new com/google/android/gms/fitness/request/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  DataSourceQueryParams(int paramInt1, DataSource paramDataSource, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzavU = paramDataSource;
    this.zzUZ = paramLong1;
    this.zzawk = paramLong2;
    this.zzaAT = paramLong3;
    this.zzaAO = paramInt2;
    this.zzaAU = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataSourceQueryParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */