package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(Address paramAddress, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAddress.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    String str = paramAddress.name;
    zzb.zza(paramParcel, 2, str, false);
    str = paramAddress.zzaMD;
    zzb.zza(paramParcel, 3, str, false);
    str = paramAddress.zzaME;
    zzb.zza(paramParcel, 4, str, false);
    str = paramAddress.zzaMF;
    zzb.zza(paramParcel, 5, str, false);
    str = paramAddress.zzJU;
    zzb.zza(paramParcel, 6, str, false);
    str = paramAddress.zzbof;
    zzb.zza(paramParcel, 7, str, false);
    str = paramAddress.zzbog;
    zzb.zza(paramParcel, 8, str, false);
    str = paramAddress.zzaMK;
    zzb.zza(paramParcel, 9, str, false);
    str = paramAddress.phoneNumber;
    zzb.zza(paramParcel, 10, str, false);
    boolean bool = paramAddress.zzaMM;
    zzb.zza(paramParcel, 11, bool);
    str = paramAddress.zzaMN;
    zzb.zza(paramParcel, 12, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Address zzho(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
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
    boolean bool = false;
    String str9 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 3: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 5: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 6: 
        str4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 7: 
        str5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 8: 
        str6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 9: 
        str7 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 10: 
        str8 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 11: 
        bool = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 12: 
        str9 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
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
    Object localObject2 = new com/google/android/gms/wallet/Address;
    ((Address)localObject2).<init>(j, (String)localObject1, str1, str2, str3, str4, str5, str6, str7, str8, bool, str9);
    return (Address)localObject2;
  }
  
  public Address[] zzkM(int paramInt)
  {
    return new Address[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */