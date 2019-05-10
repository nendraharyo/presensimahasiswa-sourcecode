package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(Barcode.DriverLicense paramDriverLicense, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramDriverLicense.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramDriverLicense.documentType;
    zzb.zza(paramParcel, 2, str, false);
    str = paramDriverLicense.firstName;
    zzb.zza(paramParcel, 3, str, false);
    str = paramDriverLicense.middleName;
    zzb.zza(paramParcel, 4, str, false);
    str = paramDriverLicense.lastName;
    zzb.zza(paramParcel, 5, str, false);
    str = paramDriverLicense.gender;
    zzb.zza(paramParcel, 6, str, false);
    str = paramDriverLicense.addressStreet;
    zzb.zza(paramParcel, 7, str, false);
    str = paramDriverLicense.addressCity;
    zzb.zza(paramParcel, 8, str, false);
    str = paramDriverLicense.addressState;
    zzb.zza(paramParcel, 9, str, false);
    str = paramDriverLicense.addressZip;
    zzb.zza(paramParcel, 10, str, false);
    str = paramDriverLicense.licenseNumber;
    zzb.zza(paramParcel, 11, str, false);
    str = paramDriverLicense.issueDate;
    zzb.zza(paramParcel, 12, str, false);
    str = paramDriverLicense.expiryDate;
    zzb.zza(paramParcel, 13, str, false);
    str = paramDriverLicense.birthDate;
    zzb.zza(paramParcel, 14, str, false);
    str = paramDriverLicense.issuingCountry;
    zzb.zza(paramParcel, 15, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.DriverLicense zzhb(Parcel paramParcel)
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
        str12 = zza.zzp(paramParcel, k);
        break;
      case 15: 
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
    Object localObject2 = new com/google/android/gms/vision/barcode/Barcode$DriverLicense;
    ((Barcode.DriverLicense)localObject2).<init>(j, (String)localObject1, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    return (Barcode.DriverLicense)localObject2;
  }
  
  public Barcode.DriverLicense[] zzky(int paramInt)
  {
    return new Barcode.DriverLicense[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */