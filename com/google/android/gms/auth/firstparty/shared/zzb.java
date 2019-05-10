package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(FACLData paramFACLData, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramFACLData.version;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramFACLData.zzYs;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramFACLData.zzYt;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    boolean bool = paramFACLData.zzYu;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, bool);
    localObject = paramFACLData.zzYv;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (String)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public FACLData zzX(Parcel paramParcel)
  {
    boolean bool = false;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    String str2 = null;
    Object localObject1 = null;
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
        localObject1 = FACLConfig.CREATOR;
        localObject3 = (FACLConfig)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/auth/firstparty/shared/FACLData;
    ((FACLData)localObject3).<init>(j, (FACLConfig)localObject1, str2, bool, str1);
    return (FACLData)localObject3;
  }
  
  public FACLData[] zzaU(int paramInt)
  {
    return new FACLData[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\firstparty\shared\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */