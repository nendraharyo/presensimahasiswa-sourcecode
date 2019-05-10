package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class ProvideContentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  public IBinder zzbdk;
  public zzb zzbdl;
  public List zzbdm;
  public long zzbdn;
  public zzc zzbdo;
  
  static
  {
    zzf localzzf = new com/google/android/gms/nearby/sharing/internal/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  ProvideContentRequest()
  {
    this.versionCode = 1;
  }
  
  ProvideContentRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, List paramList, long paramLong, IBinder paramIBinder3)
  {
    this.versionCode = paramInt;
    this.zzbdk = paramIBinder1;
    Object localObject = zzb.zza.zzdG(paramIBinder2);
    this.zzbdl = ((zzb)localObject);
    this.zzbdm = paramList;
    this.zzbdn = paramLong;
    localObject = zzc.zza.zzdH(paramIBinder3);
    this.zzbdo = ((zzc)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbdo.asBinder();
  }
  
  IBinder zzEP()
  {
    Object localObject = this.zzbdl;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbdl.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\ProvideContentRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */