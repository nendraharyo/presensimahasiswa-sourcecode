package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class StringListResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzasD;
  
  static
  {
    zzbw localzzbw = new com/google/android/gms/drive/internal/zzbw;
    localzzbw.<init>();
    CREATOR = localzzbw;
  }
  
  StringListResponse(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzasD = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbw.zza(this, paramParcel, paramInt);
  }
  
  public List zztx()
  {
    return this.zzasD;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\StringListResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */