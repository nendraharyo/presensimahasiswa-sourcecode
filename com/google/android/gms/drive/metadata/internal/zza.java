package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.Collection;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(AppVisibleCustomProperties paramAppVisibleCustomProperties, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAppVisibleCustomProperties.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    List localList = paramAppVisibleCustomProperties.zzasL;
    zzb.zzc(paramParcel, 2, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AppVisibleCustomProperties zzce(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
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
        localObject2 = CustomProperty.CREATOR;
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    AppVisibleCustomProperties localAppVisibleCustomProperties = new com/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;
    localAppVisibleCustomProperties.<init>(j, (Collection)localObject2);
    return localAppVisibleCustomProperties;
  }
  
  public AppVisibleCustomProperties[] zzdZ(int paramInt)
  {
    return new AppVisibleCustomProperties[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */