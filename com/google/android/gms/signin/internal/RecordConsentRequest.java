package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RecordConsentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final Account zzTI;
  private final String zzXd;
  private final Scope[] zzbhh;
  
  static
  {
    zzf localzzf = new com/google/android/gms/signin/internal/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  RecordConsentRequest(int paramInt, Account paramAccount, Scope[] paramArrayOfScope, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzTI = paramAccount;
    this.zzbhh = paramArrayOfScope;
    this.zzXd = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Account getAccount()
  {
    return this.zzTI;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public Scope[] zzFM()
  {
    return this.zzbhh;
  }
  
  public String zzmR()
  {
    return this.zzXd;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\RecordConsentRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */