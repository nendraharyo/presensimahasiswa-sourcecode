package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FavaDiagnosticsEntity
  implements SafeParcelable
{
  public static final zza CREATOR;
  final int mVersionCode;
  public final String zzamD;
  public final int zzamE;
  
  static
  {
    zza localzza = new com/google/android/gms/common/server/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public FavaDiagnosticsEntity(int paramInt1, String paramString, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzamD = paramString;
    this.zzamE = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\FavaDiagnosticsEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */