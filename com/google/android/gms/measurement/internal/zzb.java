package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(AppMetadata paramAppMetadata, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramAppMetadata.versionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    String str = paramAppMetadata.packageName;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, str, false);
    str = paramAppMetadata.zzaVt;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, str, false);
    str = paramAppMetadata.zzaMV;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, str, false);
    str = paramAppMetadata.zzaVu;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, str, false);
    long l = paramAppMetadata.zzaVv;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, l);
    l = paramAppMetadata.zzaVw;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, l);
    str = paramAppMetadata.zzaVx;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, str, false);
    boolean bool = paramAppMetadata.zzaVy;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, bool);
    bool = paramAppMetadata.zzaVz;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 10, bool);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public AppMetadata zzfL(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    long l1 = 0L;
    long l2 = 0L;
    String str4 = null;
    boolean bool1 = false;
    boolean bool2 = false;
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
        l1 = zza.zzi(paramParcel, k);
        break;
      case 7: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 8: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 10: 
        bool2 = zza.zzc(paramParcel, k);
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
    Object localObject2 = new com/google/android/gms/measurement/internal/AppMetadata;
    ((AppMetadata)localObject2).<init>(j, (String)localObject1, str1, str2, str3, l1, l2, str4, bool1, bool2);
    return (AppMetadata)localObject2;
  }
  
  public AppMetadata[] zziH(int paramInt)
  {
    return new AppMetadata[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */