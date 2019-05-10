package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zzqe.zza;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqf.zza;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;

public class EnableTargetRequest
  implements SafeParcelable
{
  public static final zze CREATOR;
  private final String description;
  private final String name;
  final int versionCode;
  private final byte zzbaR;
  private final zzqe zzbaT;
  private final zzqf zzbaU;
  private final zzqg zzbaV;
  
  static
  {
    zze localzze = new com/google/android/gms/nearby/bootstrap/request/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  EnableTargetRequest(int paramInt, String paramString1, String paramString2, byte paramByte, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3)
  {
    this.versionCode = paramInt;
    Object localObject = zzx.zzcM(paramString1);
    this.name = ((String)localObject);
    localObject = (String)zzx.zzz(paramString2);
    this.description = ((String)localObject);
    this.zzbaR = paramByte;
    zzx.zzz(paramIBinder1);
    localObject = zzqe.zza.zzdq(paramIBinder1);
    this.zzbaT = ((zzqe)localObject);
    zzx.zzz(paramIBinder2);
    localObject = zzqf.zza.zzdr(paramIBinder2);
    this.zzbaU = ((zzqf)localObject);
    zzx.zzz(paramIBinder3);
    localObject = zzqg.zza.zzds(paramIBinder3);
    this.zzbaV = ((zzqg)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzbaV;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbaV.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public byte zzEb()
  {
    return this.zzbaR;
  }
  
  public IBinder zzEg()
  {
    Object localObject = this.zzbaT;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbaT.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public IBinder zzEh()
  {
    Object localObject = this.zzbaU;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbaU.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\EnableTargetRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */