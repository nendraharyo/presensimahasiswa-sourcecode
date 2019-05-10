package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzot.zza;
import java.util.List;

public class ReadStatsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzaAF;
  private final zzot zzaBg;
  
  static
  {
    zzu localzzu = new com/google/android/gms/fitness/request/zzu;
    localzzu.<init>();
    CREATOR = localzzu;
  }
  
  ReadStatsRequest(int paramInt, IBinder paramIBinder, List paramList)
  {
    this.mVersionCode = paramInt;
    zzot localzzot = zzot.zza.zzbO(paramIBinder);
    this.zzaBg = localzzot;
    this.zzaAF = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return this.zzaBg.asBinder();
  }
  
  public List getDataSources()
  {
    return this.zzaAF;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[0];
    return String.format("ReadStatsRequest", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\ReadStatsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */