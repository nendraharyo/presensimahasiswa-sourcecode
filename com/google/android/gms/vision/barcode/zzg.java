package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(Barcode.Email paramEmail, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramEmail.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramEmail.type;
    zzb.zzc(paramParcel, 2, j);
    String str = paramEmail.address;
    zzb.zza(paramParcel, 3, str, false);
    str = paramEmail.subject;
    zzb.zza(paramParcel, 4, str, false);
    str = paramEmail.body;
    zzb.zza(paramParcel, 5, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.Email zzhc(Parcel paramParcel)
  {
    int i = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    String str2 = null;
    String str3 = null;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/vision/barcode/Barcode$Email;
    ((Barcode.Email)localObject).<init>(k, i, str3, str2, str1);
    return (Barcode.Email)localObject;
  }
  
  public Barcode.Email[] zzkz(int paramInt)
  {
    return new Barcode.Email[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */