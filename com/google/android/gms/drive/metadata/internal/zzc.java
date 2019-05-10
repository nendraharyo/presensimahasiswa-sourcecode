package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class zzc
  implements Parcelable.Creator
{
  static void zza(CustomProperty paramCustomProperty, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCustomProperty.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCustomProperty.zzasN;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramCustomProperty.mValue;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CustomProperty zzcf(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject3 = localObject1;
        localObject1 = localObject2;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        m = zza.zzg(paramParcel, m);
        Object localObject4 = localObject1;
        localObject1 = localObject2;
        k = m;
        localObject3 = localObject4;
        continue;
        localObject2 = CustomPropertyKey.CREATOR;
        localObject3 = (CustomPropertyKey)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        k = j;
        localObject4 = localObject3;
        localObject3 = localObject1;
        localObject1 = localObject4;
        continue;
        localObject3 = zza.zzp(paramParcel, m);
        localObject1 = localObject2;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/drive/metadata/internal/CustomProperty;
    ((CustomProperty)localObject3).<init>(j, (CustomPropertyKey)localObject2, (String)localObject1);
    return (CustomProperty)localObject3;
  }
  
  public CustomProperty[] zzea(int paramInt)
  {
    return new CustomProperty[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */