package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(AuthAccountRequest paramAuthAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAuthAccountRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAuthAccountRequest.zzakA;
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramAuthAccountRequest.zzafT;
    zzb.zza(paramParcel, 3, (Parcelable[])localObject, paramInt, false);
    localObject = paramAuthAccountRequest.zzakB;
    zzb.zza(paramParcel, 4, (Integer)localObject, false);
    localObject = paramAuthAccountRequest.zzakC;
    zzb.zza(paramParcel, 5, (Integer)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AuthAccountRequest zzam(Parcel paramParcel)
  {
    Integer localInteger1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Integer localInteger2 = null;
    Object localObject2 = null;
    IBinder localIBinder = null;
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
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localObject2 = Scope.CREATOR;
        localObject3 = (Scope[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 4: 
        localInteger2 = zza.zzh(paramParcel, k);
        break;
      case 5: 
        localInteger1 = zza.zzh(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/common/internal/AuthAccountRequest;
    ((AuthAccountRequest)localObject3).<init>(j, localIBinder, (Scope[])localObject2, localInteger2, localInteger1);
    return (AuthAccountRequest)localObject3;
  }
  
  public AuthAccountRequest[] zzbP(int paramInt)
  {
    return new AuthAccountRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */