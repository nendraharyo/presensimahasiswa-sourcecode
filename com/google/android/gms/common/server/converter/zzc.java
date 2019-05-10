package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(StringToIntConverter.Entry paramEntry, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramEntry.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramEntry.zzamJ;
    zzb.zza(paramParcel, 2, str, false);
    j = paramEntry.zzamK;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public StringToIntConverter.Entry zzaz(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    Object localObject = null;
    int k = 0;
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
        localObject = zza.zzp(paramParcel, m);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    StringToIntConverter.Entry localEntry = new com/google/android/gms/common/server/converter/StringToIntConverter$Entry;
    localEntry.<init>(k, (String)localObject, i);
    return localEntry;
  }
  
  public StringToIntConverter.Entry[] zzcf(int paramInt)
  {
    return new StringToIntConverter.Entry[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\converter\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */