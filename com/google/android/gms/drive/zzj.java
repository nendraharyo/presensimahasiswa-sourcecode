package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(Permission paramPermission, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPermission.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramPermission.zzsO();
    zzb.zza(paramParcel, 2, str, false);
    j = paramPermission.zzsP();
    zzb.zzc(paramParcel, 3, j);
    str = paramPermission.zzsQ();
    zzb.zza(paramParcel, 4, str, false);
    str = paramPermission.zzsR();
    zzb.zza(paramParcel, 5, str, false);
    j = paramPermission.getRole();
    zzb.zzc(paramParcel, 6, j);
    boolean bool = paramPermission.zzsS();
    zzb.zza(paramParcel, 7, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public Permission zzaM(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    int j = 0;
    String str2 = null;
    int k = 0;
    Object localObject1 = null;
    int m = 0;
    zza.zza localzza = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 6: 
        j = zza.zzg(paramParcel, n);
        break;
      case 7: 
        bool = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/drive/Permission;
    ((Permission)localObject2).<init>(m, (String)localObject1, k, str2, str1, j, bool);
    return (Permission)localObject2;
  }
  
  public Permission[] zzcB(int paramInt)
  {
    return new Permission[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */