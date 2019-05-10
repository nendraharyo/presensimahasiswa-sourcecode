package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(AutocompletePredictionEntity paramAutocompletePredictionEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramAutocompletePredictionEntity.zzaQd;
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramAutocompletePredictionEntity.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramAutocompletePredictionEntity.zzaPH;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramAutocompletePredictionEntity.zzaPd;
    zzb.zza(paramParcel, 3, (List)localObject, false);
    localObject = paramAutocompletePredictionEntity.zzaQe;
    zzb.zzc(paramParcel, 4, (List)localObject, false);
    j = paramAutocompletePredictionEntity.zzaQf;
    zzb.zzc(paramParcel, 5, j);
    localObject = paramAutocompletePredictionEntity.zzaQg;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramAutocompletePredictionEntity.zzaQh;
    zzb.zzc(paramParcel, 7, (List)localObject, false);
    localObject = paramAutocompletePredictionEntity.zzaQi;
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramAutocompletePredictionEntity.zzaQj;
    zzb.zzc(paramParcel, 9, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AutocompletePredictionEntity zzfk(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    String str1 = null;
    Object localObject2 = null;
    String str2 = null;
    Object localObject3 = null;
    String str3 = null;
    ArrayList localArrayList = null;
    Object localObject4 = null;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 1000: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 3: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.zza.zzC(paramParcel, m);
        break;
      case 4: 
        localObject3 = AutocompletePredictionEntity.SubstringEntity.CREATOR;
        localObject3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject3);
        break;
      case 5: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 6: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 7: 
        localObject2 = AutocompletePredictionEntity.SubstringEntity.CREATOR;
        localObject2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject2);
        break;
      case 8: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 9: 
        localObject1 = AutocompletePredictionEntity.SubstringEntity.CREATOR;
        localObject1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject5 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject5, paramParcel);
      throw localzza;
    }
    Object localObject5 = new com/google/android/gms/location/places/internal/AutocompletePredictionEntity;
    ((AutocompletePredictionEntity)localObject5).<init>(k, (String)localObject4, localArrayList, i, str3, (List)localObject3, str2, (List)localObject2, str1, (List)localObject1);
    return (AutocompletePredictionEntity)localObject5;
  }
  
  public AutocompletePredictionEntity[] zzhW(int paramInt)
  {
    return new AutocompletePredictionEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */