package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetRecentContextCall$Request
  implements SafeParcelable
{
  public static final zzf CREATOR;
  final int mVersionCode;
  public final Account zzTT;
  public final boolean zzTU;
  public final boolean zzTV;
  public final boolean zzTW;
  public final String zzTX;
  
  static
  {
    zzf localzzf = new com/google/android/gms/appdatasearch/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  public GetRecentContextCall$Request()
  {
    this(null, false, false, false, null);
  }
  
  GetRecentContextCall$Request(int paramInt, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzTT = paramAccount;
    this.zzTU = paramBoolean1;
    this.zzTV = paramBoolean2;
    this.zzTW = paramBoolean3;
    this.zzTX = paramString;
  }
  
  public GetRecentContextCall$Request(Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
  {
    this(1, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\GetRecentContextCall$Request.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */