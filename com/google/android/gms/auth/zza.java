package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAccountChangeEvent.mVersion;
    zzb.zzc(paramParcel, 1, j);
    long l = paramAccountChangeEvent.zzUZ;
    zzb.zza(paramParcel, 2, l);
    String str = paramAccountChangeEvent.zzVa;
    zzb.zza(paramParcel, 3, str, false);
    j = paramAccountChangeEvent.zzVb;
    zzb.zzc(paramParcel, 4, j);
    j = paramAccountChangeEvent.zzVc;
    zzb.zzc(paramParcel, 5, j);
    str = paramAccountChangeEvent.zzVd;
    zzb.zza(paramParcel, 6, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AccountChangeEvent[] zzau(int paramInt)
  {
    return new AccountChangeEvent[paramInt];
  }
  
  public AccountChangeEvent zzz(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    long l = 0L;
    int k = 0;
    String str2 = null;
    int m = 0;
    zza.zza localzza = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
        break;
      }
      n = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzca(n);
      switch (i1)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        break;
      case 2: 
        l = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, n);
        break;
      case 3: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, n);
        break;
      case 4: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        break;
      case 5: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        break;
      case 6: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/auth/AccountChangeEvent;
    ((AccountChangeEvent)localObject).<init>(m, l, str2, k, i, str1);
    return (AccountChangeEvent)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */