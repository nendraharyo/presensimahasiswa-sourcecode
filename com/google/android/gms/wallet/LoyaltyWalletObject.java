package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

public final class LoyaltyWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  int state;
  String zzaQZ;
  String zzboP;
  String zzboQ;
  String zzboR;
  String zzboS;
  String zzboT;
  String zzboU;
  String zzboV;
  String zzboW;
  ArrayList zzboX;
  TimeInterval zzboY;
  ArrayList zzboZ;
  String zzbpa;
  String zzbpb;
  ArrayList zzbpc;
  boolean zzbpd;
  ArrayList zzbpe;
  ArrayList zzbpf;
  ArrayList zzbpg;
  LoyaltyPoints zzbph;
  String zzio;
  
  static
  {
    zzk localzzk = new com/google/android/gms/wallet/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  LoyaltyWalletObject()
  {
    this.mVersionCode = 4;
    ArrayList localArrayList = zzmn.zzsa();
    this.zzboX = localArrayList;
    localArrayList = zzmn.zzsa();
    this.zzboZ = localArrayList;
    localArrayList = zzmn.zzsa();
    this.zzbpc = localArrayList;
    localArrayList = zzmn.zzsa();
    this.zzbpe = localArrayList;
    localArrayList = zzmn.zzsa();
    this.zzbpf = localArrayList;
    localArrayList = zzmn.zzsa();
    this.zzbpg = localArrayList;
  }
  
  LoyaltyWalletObject(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, int paramInt2, ArrayList paramArrayList1, TimeInterval paramTimeInterval, ArrayList paramArrayList2, String paramString11, String paramString12, ArrayList paramArrayList3, boolean paramBoolean, ArrayList paramArrayList4, ArrayList paramArrayList5, ArrayList paramArrayList6, LoyaltyPoints paramLoyaltyPoints)
  {
    this.mVersionCode = paramInt1;
    this.zzio = paramString1;
    this.zzboP = paramString2;
    this.zzboQ = paramString3;
    this.zzboR = paramString4;
    this.zzaQZ = paramString5;
    this.zzboS = paramString6;
    this.zzboT = paramString7;
    this.zzboU = paramString8;
    this.zzboV = paramString9;
    this.zzboW = paramString10;
    this.state = paramInt2;
    this.zzboX = paramArrayList1;
    this.zzboY = paramTimeInterval;
    this.zzboZ = paramArrayList2;
    this.zzbpa = paramString11;
    this.zzbpb = paramString12;
    this.zzbpc = paramArrayList3;
    this.zzbpd = paramBoolean;
    this.zzbpe = paramArrayList4;
    this.zzbpf = paramArrayList5;
    this.zzbpg = paramArrayList6;
    this.zzbph = paramLoyaltyPoints;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAccountId()
  {
    return this.zzboP;
  }
  
  public String getAccountName()
  {
    return this.zzaQZ;
  }
  
  public String getBarcodeAlternateText()
  {
    return this.zzboS;
  }
  
  public String getBarcodeType()
  {
    return this.zzboT;
  }
  
  public String getBarcodeValue()
  {
    return this.zzboU;
  }
  
  public String getId()
  {
    return this.zzio;
  }
  
  public String getIssuerName()
  {
    return this.zzboQ;
  }
  
  public String getProgramName()
  {
    return this.zzboR;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\LoyaltyWalletObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */