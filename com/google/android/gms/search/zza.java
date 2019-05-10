package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(GoogleNowAuthState paramGoogleNowAuthState, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    String str = paramGoogleNowAuthState.getAuthCode();
    zzb.zza(paramParcel, 1, str, false);
    int j = paramGoogleNowAuthState.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    str = paramGoogleNowAuthState.getAccessToken();
    zzb.zza(paramParcel, 2, str, false);
    long l = paramGoogleNowAuthState.getNextAllowedTimeMillis();
    zzb.zza(paramParcel, 3, l);
    zzb.zzI(paramParcel, i);
  }
  
  public GoogleNowAuthState zzgQ(Parcel paramParcel)
  {
    String str = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    long l = 0L;
    Object localObject1 = null;
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
        localObject1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        str = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 3: 
        l = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
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
    Object localObject2 = new com/google/android/gms/search/GoogleNowAuthState;
    ((GoogleNowAuthState)localObject2).<init>(j, (String)localObject1, str, l);
    return (GoogleNowAuthState)localObject2;
  }
  
  public GoogleNowAuthState[] zzjX(int paramInt)
  {
    return new GoogleNowAuthState[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\search\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */