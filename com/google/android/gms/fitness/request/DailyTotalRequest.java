package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzog;
import com.google.android.gms.internal.zzog.zza;

public class DailyTotalRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzog zzaAE;
  private DataType zzavT;
  
  static
  {
    zzc localzzc = new com/google/android/gms/fitness/request/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  DailyTotalRequest(int paramInt, IBinder paramIBinder, DataType paramDataType)
  {
    this.mVersionCode = paramInt;
    zzog localzzog = zzog.zza.zzbB(paramIBinder);
    this.zzaAE = localzzog;
    this.zzavT = paramDataType;
  }
  
  public DailyTotalRequest(zzog paramzzog, DataType paramDataType)
  {
    this.mVersionCode = 2;
    this.zzaAE = paramzzog;
    this.zzavT = paramDataType;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return this.zzaAE.asBinder();
  }
  
  public DataType getDataType()
  {
    return this.zzavT;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    String str = this.zzavT.zzuo();
    arrayOfObject[0] = str;
    return String.format("DailyTotalRequest{%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DailyTotalRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */