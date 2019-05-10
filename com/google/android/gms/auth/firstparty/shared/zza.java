package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(FACLConfig paramFACLConfig, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFACLConfig.version;
    zzb.zzc(paramParcel, 1, j);
    boolean bool = paramFACLConfig.zzYm;
    zzb.zza(paramParcel, 2, bool);
    String str = paramFACLConfig.zzYn;
    zzb.zza(paramParcel, 3, str, false);
    bool = paramFACLConfig.zzYo;
    zzb.zza(paramParcel, 4, bool);
    bool = paramFACLConfig.zzYp;
    zzb.zza(paramParcel, 5, bool);
    bool = paramFACLConfig.zzYq;
    zzb.zza(paramParcel, 6, bool);
    bool = paramFACLConfig.zzYr;
    zzb.zza(paramParcel, 7, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public FACLConfig zzW(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    String str = null;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    StringBuilder localStringBuilder = null;
    int j = 0;
    zza.zza localzza = null;
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
        bool5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 3: 
        str = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        bool4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 5: 
        bool3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 6: 
        bool2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 7: 
        bool1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/auth/firstparty/shared/FACLConfig;
    ((FACLConfig)localObject).<init>(j, bool5, str, bool4, bool3, bool2, bool1);
    return (FACLConfig)localObject;
  }
  
  public FACLConfig[] zzaT(int paramInt)
  {
    return new FACLConfig[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\firstparty\shared\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */