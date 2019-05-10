package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ScopeDetail
  implements SafeParcelable
{
  public static final zzc CREATOR;
  String description;
  final int version;
  List zzYA;
  public FACLData zzYB;
  String zzYw;
  String zzYx;
  String zzYy;
  String zzYz;
  
  static
  {
    zzc localzzc = new com/google/android/gms/auth/firstparty/shared/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  ScopeDetail(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, List paramList, FACLData paramFACLData)
  {
    this.version = paramInt;
    this.description = paramString1;
    this.zzYw = paramString2;
    this.zzYx = paramString3;
    this.zzYy = paramString4;
    this.zzYz = paramString5;
    this.zzYA = paramList;
    this.zzYB = paramFACLData;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\firstparty\shared\ScopeDetail.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */