package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zze
  implements Parcelable.Creator
{
  static void zza(TokenData paramTokenData, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTokenData.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramTokenData.getToken();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramTokenData.zzmn();
    zzb.zza(paramParcel, 3, (Long)localObject, false);
    boolean bool = paramTokenData.zzmo();
    zzb.zza(paramParcel, 4, bool);
    bool = paramTokenData.zzmp();
    zzb.zza(paramParcel, 5, bool);
    localObject = paramTokenData.zzmq();
    zzb.zzb(paramParcel, 6, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public TokenData zzC(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    Long localLong = null;
    Object localObject1 = null;
    int j = 0;
    zza.zza localzza = null;
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
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localLong = zza.zzj(paramParcel, k);
        break;
      case 4: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 6: 
        localArrayList = zza.zzD(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/auth/TokenData;
    ((TokenData)localObject2).<init>(j, (String)localObject1, localLong, bool2, bool1, localArrayList);
    return (TokenData)localObject2;
  }
  
  public TokenData[] zzax(int paramInt)
  {
    return new TokenData[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */