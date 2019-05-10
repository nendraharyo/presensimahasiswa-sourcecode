package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(Barcode.PersonName paramPersonName, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPersonName.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramPersonName.formattedName;
    zzb.zza(paramParcel, 2, str, false);
    str = paramPersonName.pronunciation;
    zzb.zza(paramParcel, 3, str, false);
    str = paramPersonName.prefix;
    zzb.zza(paramParcel, 4, str, false);
    str = paramPersonName.first;
    zzb.zza(paramParcel, 5, str, false);
    str = paramPersonName.middle;
    zzb.zza(paramParcel, 6, str, false);
    str = paramPersonName.last;
    zzb.zza(paramParcel, 7, str, false);
    str = paramPersonName.suffix;
    zzb.zza(paramParcel, 8, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.PersonName zzhe(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    Object localObject1 = null;
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
        str6 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, k);
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
    Object localObject2 = new com/google/android/gms/vision/barcode/Barcode$PersonName;
    ((Barcode.PersonName)localObject2).<init>(j, (String)localObject1, str6, str5, str4, str3, str2, str1);
    return (Barcode.PersonName)localObject2;
  }
  
  public Barcode.PersonName[] zzkB(int paramInt)
  {
    return new Barcode.PersonName[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */