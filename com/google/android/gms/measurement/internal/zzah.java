package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzah
  implements Parcelable.Creator
{
  static void zza(UserAttributeParcel paramUserAttributeParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramUserAttributeParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramUserAttributeParcel.name;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    long l = paramUserAttributeParcel.zzaZm;
    zzb.zza(paramParcel, 3, l);
    localObject = paramUserAttributeParcel.zzaZn;
    zzb.zza(paramParcel, 4, (Long)localObject, false);
    localObject = paramUserAttributeParcel.zzaZo;
    zzb.zza(paramParcel, 5, (Float)localObject, false);
    localObject = paramUserAttributeParcel.zzamJ;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramUserAttributeParcel.zzaVW;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public UserAttributeParcel zzfO(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    long l = 0L;
    String str2 = null;
    Float localFloat = null;
    Long localLong = null;
    String str3 = null;
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
        str3 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        l = zza.zzi(paramParcel, k);
        break;
      case 4: 
        localLong = zza.zzj(paramParcel, k);
        break;
      case 5: 
        localFloat = zza.zzm(paramParcel, k);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject).<init>(str4, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/measurement/internal/UserAttributeParcel;
    ((UserAttributeParcel)localObject).<init>(j, str3, l, localLong, localFloat, str2, str1);
    return (UserAttributeParcel)localObject;
  }
  
  public UserAttributeParcel[] zziK(int paramInt)
  {
    return new UserAttributeParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */