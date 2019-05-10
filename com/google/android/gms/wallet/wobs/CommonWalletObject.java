package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmn;
import java.util.ArrayList;

public class CommonWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String name;
  int state;
  String zzboQ;
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
  String zzio;
  
  static
  {
    zza localzza = new com/google/android/gms/wallet/wobs/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  CommonWalletObject()
  {
    this.mVersionCode = 1;
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
  
  CommonWalletObject(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt2, ArrayList paramArrayList1, TimeInterval paramTimeInterval, ArrayList paramArrayList2, String paramString9, String paramString10, ArrayList paramArrayList3, boolean paramBoolean, ArrayList paramArrayList4, ArrayList paramArrayList5, ArrayList paramArrayList6)
  {
    this.mVersionCode = paramInt1;
    this.zzio = paramString1;
    this.zzboW = paramString2;
    this.name = paramString3;
    this.zzboQ = paramString4;
    this.zzboS = paramString5;
    this.zzboT = paramString6;
    this.zzboU = paramString7;
    this.zzboV = paramString8;
    this.state = paramInt2;
    this.zzboX = paramArrayList1;
    this.zzboY = paramTimeInterval;
    this.zzboZ = paramArrayList2;
    this.zzbpa = paramString9;
    this.zzbpb = paramString10;
    this.zzbpc = paramArrayList3;
    this.zzbpd = paramBoolean;
    this.zzbpe = paramArrayList4;
    this.zzbpf = paramArrayList5;
    this.zzbpg = paramArrayList6;
  }
  
  public static CommonWalletObject.zza zzIr()
  {
    CommonWalletObject.zza localzza = new com/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    CommonWalletObject localCommonWalletObject = new com/google/android/gms/wallet/wobs/CommonWalletObject;
    localCommonWalletObject.<init>();
    localCommonWalletObject.getClass();
    localzza.<init>(localCommonWalletObject, null);
    return localzza;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getId()
  {
    return this.zzio;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\CommonWalletObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */