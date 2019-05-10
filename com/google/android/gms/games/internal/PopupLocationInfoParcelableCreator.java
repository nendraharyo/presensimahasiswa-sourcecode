package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class PopupLocationInfoParcelableCreator
  implements Parcelable.Creator
{
  static void zza(PopupLocationInfoParcelable paramPopupLocationInfoParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramPopupLocationInfoParcelable.zzxg();
    zzb.zza(paramParcel, 1, (Bundle)localObject, false);
    int j = paramPopupLocationInfoParcelable.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramPopupLocationInfoParcelable.getWindowToken();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PopupLocationInfoParcelable zzem(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
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
        localObject2 = zza.zzr(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    PopupLocationInfoParcelable localPopupLocationInfoParcelable = new com/google/android/gms/games/internal/PopupLocationInfoParcelable;
    localPopupLocationInfoParcelable.<init>(j, (Bundle)localObject2, (IBinder)localObject1);
    return localPopupLocationInfoParcelable;
  }
  
  public PopupLocationInfoParcelable[] zzgu(int paramInt)
  {
    return new PopupLocationInfoParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\PopupLocationInfoParcelableCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */