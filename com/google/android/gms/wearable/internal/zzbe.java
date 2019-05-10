package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbe
  implements Parcelable.Creator
{
  static void zza(PackageStorageInfo paramPackageStorageInfo, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPackageStorageInfo.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramPackageStorageInfo.packageName;
    zzb.zza(paramParcel, 2, str, false);
    str = paramPackageStorageInfo.label;
    zzb.zza(paramParcel, 3, str, false);
    long l = paramPackageStorageInfo.zzbta;
    zzb.zza(paramParcel, 4, l);
    zzb.zzI(paramParcel, i);
  }
  
  public PackageStorageInfo zziD(Parcel paramParcel)
  {
    String str = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    long l = 0L;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 4: 
        l = zza.zzi(paramParcel, k);
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
    Object localObject2 = new com/google/android/gms/wearable/internal/PackageStorageInfo;
    ((PackageStorageInfo)localObject2).<init>(j, (String)localObject1, str, l);
    return (PackageStorageInfo)localObject2;
  }
  
  public PackageStorageInfo[] zzmh(int paramInt)
  {
    return new PackageStorageInfo[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */