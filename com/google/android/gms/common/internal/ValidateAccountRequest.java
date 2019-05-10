package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValidateAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final String zzVO;
  private final Scope[] zzafT;
  final IBinder zzakA;
  private final int zzamy;
  private final Bundle zzamz;
  
  static
  {
    zzae localzzae = new com/google/android/gms/common/internal/zzae;
    localzzae.<init>();
    CREATOR = localzzae;
  }
  
  ValidateAccountRequest(int paramInt1, int paramInt2, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, String paramString)
  {
    this.mVersionCode = paramInt1;
    this.zzamy = paramInt2;
    this.zzakA = paramIBinder;
    this.zzafT = paramArrayOfScope;
    this.zzamz = paramBundle;
    this.zzVO = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCallingPackage()
  {
    return this.zzVO;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzae.zza(this, paramParcel, paramInt);
  }
  
  public Scope[] zzrd()
  {
    return this.zzafT;
  }
  
  public int zzre()
  {
    return this.zzamy;
  }
  
  public Bundle zzrf()
  {
    return this.zzamz;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\ValidateAccountRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */