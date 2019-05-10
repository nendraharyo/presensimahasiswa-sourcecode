package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzf
  implements Parcelable.Creator
{
  static void zza(PasswordSpecification paramPasswordSpecification, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramPasswordSpecification.zzWn;
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramPasswordSpecification.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramPasswordSpecification.zzWo;
    zzb.zzb(paramParcel, 2, (List)localObject, false);
    localObject = paramPasswordSpecification.zzWp;
    zzb.zza(paramParcel, 3, (List)localObject, false);
    j = paramPasswordSpecification.zzWq;
    zzb.zzc(paramParcel, 4, j);
    j = paramPasswordSpecification.zzWr;
    zzb.zzc(paramParcel, 5, j);
    zzb.zzI(paramParcel, i);
  }
  
  public PasswordSpecification zzJ(Parcel paramParcel)
  {
    ArrayList localArrayList1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    int k = 0;
    ArrayList localArrayList2 = null;
    Object localObject1 = null;
    int m = 0;
    zza.zza localzza = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
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
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localArrayList2 = zza.zzD(paramParcel, n);
        break;
      case 3: 
        localArrayList1 = zza.zzC(paramParcel, n);
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/auth/api/credentials/PasswordSpecification;
    ((PasswordSpecification)localObject2).<init>(m, (String)localObject1, localArrayList2, localArrayList1, k, i);
    return (PasswordSpecification)localObject2;
  }
  
  public PasswordSpecification[] zzaE(int paramInt)
  {
    return new PasswordSpecification[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */