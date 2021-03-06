package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInButtonConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final Scope[] zzafT;
  private final int zzamu;
  private final int zzamv;
  
  static
  {
    zzaa localzzaa = new com/google/android/gms/common/internal/zzaa;
    localzzaa.<init>();
    CREATOR = localzzaa;
  }
  
  SignInButtonConfig(int paramInt1, int paramInt2, int paramInt3, Scope[] paramArrayOfScope)
  {
    this.mVersionCode = paramInt1;
    this.zzamu = paramInt2;
    this.zzamv = paramInt3;
    this.zzafT = paramArrayOfScope;
  }
  
  public SignInButtonConfig(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    this(1, paramInt1, paramInt2, paramArrayOfScope);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaa.zza(this, paramParcel, paramInt);
  }
  
  public int zzrb()
  {
    return this.zzamu;
  }
  
  public int zzrc()
  {
    return this.zzamv;
  }
  
  public Scope[] zzrd()
  {
    return this.zzafT;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\SignInButtonConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */