package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEventsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersion;
  Account zzTI;
  String zzVa;
  int zzVc;
  
  static
  {
    zzb localzzb = new com/google/android/gms/auth/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  public AccountChangeEventsRequest()
  {
    this.mVersion = 1;
  }
  
  AccountChangeEventsRequest(int paramInt1, int paramInt2, String paramString, Account paramAccount)
  {
    this.mVersion = paramInt1;
    this.zzVc = paramInt2;
    this.zzVa = paramString;
    Account localAccount;
    if (paramAccount == null)
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (!bool)
      {
        localAccount = new android/accounts/Account;
        String str = "com.google";
        localAccount.<init>(paramString, str);
      }
    }
    for (this.zzTI = localAccount;; this.zzTI = paramAccount) {
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Account getAccount()
  {
    return this.zzTI;
  }
  
  public String getAccountName()
  {
    return this.zzVa;
  }
  
  public int getEventIndex()
  {
    return this.zzVc;
  }
  
  public AccountChangeEventsRequest setAccount(Account paramAccount)
  {
    this.zzTI = paramAccount;
    return this;
  }
  
  public AccountChangeEventsRequest setAccountName(String paramString)
  {
    this.zzVa = paramString;
    return this;
  }
  
  public AccountChangeEventsRequest setEventIndex(int paramInt)
  {
    this.zzVc = paramInt;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\AccountChangeEventsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */