package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  String description;
  private final int mVersionCode;
  String zzboL;
  String zzboM;
  int zzboN;
  String zzboh;
  String zzboi;
  
  static
  {
    zzj localzzj = new com/google/android/gms/wallet/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  LineItem()
  {
    this.mVersionCode = 1;
    this.zzboN = 0;
  }
  
  LineItem(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, String paramString5)
  {
    this.mVersionCode = paramInt1;
    this.description = paramString1;
    this.zzboL = paramString2;
    this.zzboM = paramString3;
    this.zzboh = paramString4;
    this.zzboN = paramInt2;
    this.zzboi = paramString5;
  }
  
  public static LineItem.Builder newBuilder()
  {
    LineItem.Builder localBuilder = new com/google/android/gms/wallet/LineItem$Builder;
    LineItem localLineItem = new com/google/android/gms/wallet/LineItem;
    localLineItem.<init>();
    localLineItem.getClass();
    localBuilder.<init>(localLineItem, null);
    return localBuilder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCurrencyCode()
  {
    return this.zzboi;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public String getQuantity()
  {
    return this.zzboL;
  }
  
  public int getRole()
  {
    return this.zzboN;
  }
  
  public String getTotalPrice()
  {
    return this.zzboh;
  }
  
  public String getUnitPrice()
  {
    return this.zzboM;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\LineItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */