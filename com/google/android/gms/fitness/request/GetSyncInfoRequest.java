package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzox;
import com.google.android.gms.internal.zzox.zza;

public class GetSyncInfoRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzox zzaBb;
  
  static
  {
    zzp localzzp = new com/google/android/gms/fitness/request/zzp;
    localzzp.<init>();
    CREATOR = localzzp;
  }
  
  GetSyncInfoRequest(int paramInt, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    zzox localzzox = zzox.zza.zzbS(paramIBinder);
    this.zzaBb = localzzox;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return this.zzaBb.asBinder();
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Integer.valueOf(this.mVersionCode);
    arrayOfObject[0] = localObject;
    localObject = this.zzaBb;
    arrayOfObject[1] = localObject;
    return String.format("GetSyncInfoRequest {%d, %s, %s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\GetSyncInfoRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */