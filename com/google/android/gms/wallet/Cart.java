package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class Cart
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String zzboh;
  String zzboi;
  ArrayList zzboj;
  
  static
  {
    zzb localzzb = new com/google/android/gms/wallet/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  Cart()
  {
    this.mVersionCode = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzboj = localArrayList;
  }
  
  Cart(int paramInt, String paramString1, String paramString2, ArrayList paramArrayList)
  {
    this.mVersionCode = paramInt;
    this.zzboh = paramString1;
    this.zzboi = paramString2;
    this.zzboj = paramArrayList;
  }
  
  public static Cart.Builder newBuilder()
  {
    Cart.Builder localBuilder = new com/google/android/gms/wallet/Cart$Builder;
    Cart localCart = new com/google/android/gms/wallet/Cart;
    localCart.<init>();
    localCart.getClass();
    localBuilder.<init>(localCart, null);
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
  
  public ArrayList getLineItems()
  {
    return this.zzboj;
  }
  
  public String getTotalPrice()
  {
    return this.zzboh;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\Cart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */