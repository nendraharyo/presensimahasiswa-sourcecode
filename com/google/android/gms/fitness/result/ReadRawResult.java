package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public class ReadRawResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzaBN;
  private final DataHolder zzahi;
  
  static
  {
    zzi localzzi = new com/google/android/gms/fitness/result/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  ReadRawResult(int paramInt, DataHolder paramDataHolder, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzahi = paramDataHolder;
    if (paramList == null) {
      paramList = Collections.singletonList(paramDataHolder);
    }
    this.zzaBN = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    int i = this.zzahi.getStatusCode();
    localStatus.<init>(i);
    return localStatus;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  DataHolder zzsX()
  {
    return this.zzahi;
  }
  
  public List zzvo()
  {
    return this.zzaBN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\ReadRawResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */