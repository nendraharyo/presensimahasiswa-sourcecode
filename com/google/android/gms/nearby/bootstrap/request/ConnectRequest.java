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
import com.google.android.gms.nearby.bootstrap.Device;

public class ConnectRequest
  implements SafeParcelable
{
  public static final zza CREATOR;
  private final String description;
  private final String name;
  private final long timeoutMillis;
  final int versionCode;
  private final byte zzbaR;
  private final Device zzbaS;
  private final zzqe zzbaT;
  private final zzqf zzbaU;
  private final zzqg zzbaV;
  private final String zzbaW;
  private final byte zzbaX;
  
  static
  {
    zza localzza = new com/google/android/gms/nearby/bootstrap/request/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ConnectRequest(int paramInt, Device paramDevice, String paramString1, String paramString2, byte paramByte1, long paramLong, String paramString3, byte paramByte2, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3)
  {
    this.versionCode = paramInt;
    Object localObject = (Device)zzx.zzz(paramDevice);
    this.zzbaS = ((Device)localObject);
    localObject = zzx.zzcM(paramString1);
    this.name = ((String)localObject);
    localObject = (String)zzx.zzz(paramString2);
    this.description = ((String)localObject);
    this.zzbaR = paramByte1;
    this.timeoutMillis = paramLong;
    this.zzbaX = paramByte2;
    this.zzbaW = paramString3;
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
  
  public String getToken()
  {
    return this.zzbaW;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public byte zzEb()
  {
    return this.zzbaR;
  }
  
  public Device zzEd()
  {
    return this.zzbaS;
  }
  
  public long zzEe()
  {
    return this.timeoutMillis;
  }
  
  public byte zzEf()
  {
    return this.zzbaX;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\ConnectRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */