package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzam
  implements Parcelable.Creator
{
  static void zza(SearchAdRequestParcel paramSearchAdRequestParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSearchAdRequestParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramSearchAdRequestParcel.zzvd;
    zzb.zzc(paramParcel, 2, j);
    j = paramSearchAdRequestParcel.backgroundColor;
    zzb.zzc(paramParcel, 3, j);
    j = paramSearchAdRequestParcel.zzve;
    zzb.zzc(paramParcel, 4, j);
    j = paramSearchAdRequestParcel.zzvf;
    zzb.zzc(paramParcel, 5, j);
    j = paramSearchAdRequestParcel.zzvg;
    zzb.zzc(paramParcel, 6, j);
    j = paramSearchAdRequestParcel.zzvh;
    zzb.zzc(paramParcel, 7, j);
    j = paramSearchAdRequestParcel.zzvi;
    zzb.zzc(paramParcel, 8, j);
    j = paramSearchAdRequestParcel.zzvj;
    zzb.zzc(paramParcel, 9, j);
    String str = paramSearchAdRequestParcel.zzvk;
    zzb.zza(paramParcel, 10, str, false);
    j = paramSearchAdRequestParcel.zzvl;
    zzb.zzc(paramParcel, 11, j);
    str = paramSearchAdRequestParcel.zzvm;
    zzb.zza(paramParcel, 12, str, false);
    j = paramSearchAdRequestParcel.zzvn;
    zzb.zzc(paramParcel, 13, j);
    j = paramSearchAdRequestParcel.zzvo;
    zzb.zzc(paramParcel, 14, j);
    str = paramSearchAdRequestParcel.zzvp;
    zzb.zza(paramParcel, 15, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SearchAdRequestParcel zzd(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    int k = 0;
    StringBuilder localStringBuilder = null;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    String str1 = null;
    int i6 = 0;
    String str2 = null;
    int i7 = 0;
    int i8 = 0;
    String str3 = null;
    for (;;)
    {
      i9 = paramParcel.dataPosition();
      if (i9 >= i) {
        break;
      }
      i9 = zza.zzat(paramParcel);
      int i10 = zza.zzca(i9);
      switch (i10)
      {
      default: 
        zza.zzb(paramParcel, i9);
        break;
      case 1: 
        j = zza.zzg(paramParcel, i9);
        break;
      case 2: 
        k = zza.zzg(paramParcel, i9);
        break;
      case 3: 
        m = zza.zzg(paramParcel, i9);
        break;
      case 4: 
        n = zza.zzg(paramParcel, i9);
        break;
      case 5: 
        i1 = zza.zzg(paramParcel, i9);
        break;
      case 6: 
        i2 = zza.zzg(paramParcel, i9);
        break;
      case 7: 
        i3 = zza.zzg(paramParcel, i9);
        break;
      case 8: 
        i4 = zza.zzg(paramParcel, i9);
        break;
      case 9: 
        i5 = zza.zzg(paramParcel, i9);
        break;
      case 10: 
        str1 = zza.zzp(paramParcel, i9);
        break;
      case 11: 
        i6 = zza.zzg(paramParcel, i9);
        break;
      case 12: 
        str2 = zza.zzp(paramParcel, i9);
        break;
      case 13: 
        i7 = zza.zzg(paramParcel, i9);
        break;
      case 14: 
        i8 = zza.zzg(paramParcel, i9);
        break;
      case 15: 
        str3 = zza.zzp(paramParcel, i9);
      }
    }
    int i9 = paramParcel.dataPosition();
    if (i9 != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/ads/internal/client/SearchAdRequestParcel;
    ((SearchAdRequestParcel)localObject).<init>(j, k, m, n, i1, i2, i3, i4, i5, str1, i6, str2, i7, i8, str3);
    return (SearchAdRequestParcel)localObject;
  }
  
  public SearchAdRequestParcel[] zzo(int paramInt)
  {
    return new SearchAdRequestParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzam.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */