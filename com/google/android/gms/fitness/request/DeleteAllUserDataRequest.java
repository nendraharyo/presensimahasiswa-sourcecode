package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DeleteAllUserDataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  
  static
  {
    zzn localzzn = new com/google/android/gms/fitness/request/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  DeleteAllUserDataRequest(int paramInt, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return this.zzaAD.asBinder();
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[0];
    return String.format("DisableFitRequest", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DeleteAllUserDataRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */