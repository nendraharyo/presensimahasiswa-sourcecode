package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzd
  implements Parcelable.Creator
{
  static void zza(FieldMappingDictionary.Entry paramEntry, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramEntry.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramEntry.className;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramEntry.zzamY;
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public FieldMappingDictionary.Entry zzaD(Parcel paramParcel)
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
        localObject2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject1 = FieldMappingDictionary.FieldMapPair.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
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
    FieldMappingDictionary.Entry localEntry = new com/google/android/gms/common/server/response/FieldMappingDictionary$Entry;
    localEntry.<init>(j, (String)localObject2, (ArrayList)localObject1);
    return localEntry;
  }
  
  public FieldMappingDictionary.Entry[] zzcj(int paramInt)
  {
    return new FieldMappingDictionary.Entry[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */