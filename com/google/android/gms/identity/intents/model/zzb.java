package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(UserAddress paramUserAddress, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramUserAddress.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    String str = paramUserAddress.name;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, str, false);
    str = paramUserAddress.zzaMD;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, str, false);
    str = paramUserAddress.zzaME;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, str, false);
    str = paramUserAddress.zzaMF;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, str, false);
    str = paramUserAddress.zzaMG;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, str, false);
    str = paramUserAddress.zzaMH;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, str, false);
    str = paramUserAddress.zzaMI;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, str, false);
    str = paramUserAddress.zzaMJ;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, str, false);
    str = paramUserAddress.zzJU;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 10, str, false);
    str = paramUserAddress.zzaMK;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 11, str, false);
    str = paramUserAddress.zzaML;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 12, str, false);
    str = paramUserAddress.phoneNumber;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 13, str, false);
    boolean bool = paramUserAddress.zzaMM;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 14, bool);
    str = paramUserAddress.zzaMN;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 15, str, false);
    str = paramUserAddress.zzaMO;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 16, str, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public UserAddress zzeN(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    String str9 = null;
    String str10 = null;
    String str11 = null;
    boolean bool = false;
    String str12 = null;
    String str13 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str6 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        str7 = zza.zzp(paramParcel, k);
        break;
      case 10: 
        str8 = zza.zzp(paramParcel, k);
        break;
      case 11: 
        str9 = zza.zzp(paramParcel, k);
        break;
      case 12: 
        str10 = zza.zzp(paramParcel, k);
        break;
      case 13: 
        str11 = zza.zzp(paramParcel, k);
        break;
      case 14: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 15: 
        str12 = zza.zzp(paramParcel, k);
        break;
      case 16: 
        str13 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/identity/intents/model/UserAddress;
    ((UserAddress)localObject2).<init>(j, (String)localObject1, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, bool, str12, str13);
    return (UserAddress)localObject2;
  }
  
  public UserAddress[] zzhk(int paramInt)
  {
    return new UserAddress[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\identity\intents\model\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */