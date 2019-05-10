package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyGrpcRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final byte[] body;
  public final String hostname;
  public final String method;
  public final int port;
  public final long timeoutMillis;
  final int versionCode;
  
  static
  {
    zza localzza = new com/google/android/gms/auth/api/proxy/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ProxyGrpcRequest(int paramInt1, String paramString1, int paramInt2, long paramLong, byte[] paramArrayOfByte, String paramString2)
  {
    this.versionCode = paramInt1;
    this.hostname = paramString1;
    this.port = paramInt2;
    this.timeoutMillis = paramLong;
    this.body = paramArrayOfByte;
    this.method = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\proxy\ProxyGrpcRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */