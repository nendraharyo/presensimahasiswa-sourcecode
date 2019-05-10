package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbg
  implements Parcelable.Creator
{
  static void zza(OnLoadRealtimeResponse paramOnLoadRealtimeResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnLoadRealtimeResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    boolean bool = paramOnLoadRealtimeResponse.zzqA;
    zzb.zza(paramParcel, 2, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public OnLoadRealtimeResponse zzbJ(Parcel paramParcel)
  {
    boolean bool = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject = null;
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
        bool = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    OnLoadRealtimeResponse localOnLoadRealtimeResponse = new com/google/android/gms/drive/internal/OnLoadRealtimeResponse;
    localOnLoadRealtimeResponse.<init>(j, bool);
    return localOnLoadRealtimeResponse;
  }
  
  public OnLoadRealtimeResponse[] zzdE(int paramInt)
  {
    return new OnLoadRealtimeResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */