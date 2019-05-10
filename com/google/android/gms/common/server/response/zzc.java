package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzc
  implements Parcelable.Creator
{
  static void zza(FieldMappingDictionary paramFieldMappingDictionary, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFieldMappingDictionary.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramFieldMappingDictionary.zzrA();
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    localObject = paramFieldMappingDictionary.zzrB();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public FieldMappingDictionary zzaC(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
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
        localObject2 = FieldMappingDictionary.Entry.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 3: 
        localObject1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    FieldMappingDictionary localFieldMappingDictionary = new com/google/android/gms/common/server/response/FieldMappingDictionary;
    localFieldMappingDictionary.<init>(j, (ArrayList)localObject2, (String)localObject1);
    return localFieldMappingDictionary;
  }
  
  public FieldMappingDictionary[] zzci(int paramInt)
  {
    return new FieldMappingDictionary[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */