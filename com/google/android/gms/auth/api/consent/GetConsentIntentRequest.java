package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class GetConsentIntentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Account zzTI;
  private final String zzVO;
  private final int zzVP;
  private final String zzVQ;
  final ScopeDetail[] zzVR;
  private final boolean zzVS;
  private final int zzVT;
  private final String zzVU;
  
  static
  {
    zzb localzzb = new com/google/android/gms/auth/api/consent/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  GetConsentIntentRequest(int paramInt1, String paramString1, int paramInt2, String paramString2, Account paramAccount, ScopeDetail[] paramArrayOfScopeDetail, boolean paramBoolean, int paramInt3, String paramString3)
  {
    this.mVersionCode = paramInt1;
    this.zzVO = paramString1;
    this.zzVP = paramInt2;
    this.zzVQ = paramString2;
    Account localAccount = (Account)zzx.zzz(paramAccount);
    this.zzTI = localAccount;
    this.zzVR = paramArrayOfScopeDetail;
    this.zzVS = paramBoolean;
    this.zzVT = paramInt3;
    this.zzVU = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Account getAccount()
  {
    return this.zzTI;
  }
  
  public String getCallingPackage()
  {
    return this.zzVO;
  }
  
  public int getCallingUid()
  {
    return this.zzVP;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzmt()
  {
    return this.zzVQ;
  }
  
  public boolean zzmu()
  {
    return this.zzVS;
  }
  
  public int zzmv()
  {
    return this.zzVT;
  }
  
  public String zzmw()
  {
    return this.zzVU;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\consent\GetConsentIntentRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */