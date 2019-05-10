package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FACLData
  implements SafeParcelable
{
  public static final zzb CREATOR;
  final int version;
  FACLConfig zzYs;
  String zzYt;
  boolean zzYu;
  String zzYv;
  
  static
  {
    zzb localzzb = new com/google/android/gms/auth/firstparty/shared/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  FACLData(int paramInt, FACLConfig paramFACLConfig, String paramString1, boolean paramBoolean, String paramString2)
  {
    this.version = paramInt;
    this.zzYs = paramFACLConfig;
    this.zzYt = paramString1;
    this.zzYu = paramBoolean;
    this.zzYv = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\firstparty\shared\FACLData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */