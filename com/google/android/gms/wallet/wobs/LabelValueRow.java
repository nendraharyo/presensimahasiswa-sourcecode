package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmn;
import java.util.ArrayList;

public final class LabelValueRow
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String zzbqF;
  String zzbqG;
  ArrayList zzbqH;
  
  static
  {
    zzc localzzc = new com/google/android/gms/wallet/wobs/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  LabelValueRow()
  {
    this.mVersionCode = 1;
    ArrayList localArrayList = zzmn.zzsa();
    this.zzbqH = localArrayList;
  }
  
  LabelValueRow(int paramInt, String paramString1, String paramString2, ArrayList paramArrayList)
  {
    this.mVersionCode = paramInt;
    this.zzbqF = paramString1;
    this.zzbqG = paramString2;
    this.zzbqH = paramArrayList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\LabelValueRow.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */