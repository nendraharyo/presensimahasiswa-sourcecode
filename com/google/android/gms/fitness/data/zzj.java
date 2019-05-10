package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(Field paramField, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramField.getName();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramField.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    j = paramField.getFormat();
    zzb.zzc(paramParcel, 2, j);
    localObject = paramField.isOptional();
    zzb.zza(paramParcel, 3, (Boolean)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Field zzcW(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    int j = zza.zzau(paramParcel);
    String str = null;
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
        str = zza.zzp(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localObject1 = zza.zzd(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    Field localField = new com/google/android/gms/fitness/data/Field;
    localField.<init>(k, str, i, (Boolean)localObject1);
    return localField;
  }
  
  public Field[] zzeV(int paramInt)
  {
    return new Field[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */