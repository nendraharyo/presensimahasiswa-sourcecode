package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzoj.zza;

public class DataTypeReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  private final int mVersionCode;
  private final zzoj zzaBa;
  
  static
  {
    zzj localzzj = new com/google/android/gms/fitness/request/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  DataTypeReadRequest(int paramInt, String paramString, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.mName = paramString;
    zzoj localzzoj = zzoj.zza.zzbE(paramIBinder);
    this.zzaBa = localzzoj;
  }
  
  public DataTypeReadRequest(String paramString, zzoj paramzzoj)
  {
    this.mVersionCode = 3;
    this.mName = paramString;
    this.zzaBa = paramzzoj;
  }
  
  private boolean zzb(DataTypeReadRequest paramDataTypeReadRequest)
  {
    String str1 = this.mName;
    String str2 = paramDataTypeReadRequest.mName;
    return zzw.equal(str1, str2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataTypeReadRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataTypeReadRequest)paramObject;
      bool = zzb((DataTypeReadRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public IBinder getCallbackBinder()
  {
    return this.zzaBa.asBinder();
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    String str = this.mName;
    arrayOfObject[0] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    String str = this.mName;
    return localzza.zzg("name", str).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataTypeReadRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */