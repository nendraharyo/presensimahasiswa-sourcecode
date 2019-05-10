package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzz
  implements Parcelable.Creator
{
  static void zza(ResolveAccountResponse paramResolveAccountResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramResolveAccountResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramResolveAccountResponse.zzakA;
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramResolveAccountResponse.zzqY();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    boolean bool = paramResolveAccountResponse.zzqZ();
    zzb.zza(paramParcel, 4, bool);
    bool = paramResolveAccountResponse.zzra();
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public ResolveAccountResponse zzaq(Parcel paramParcel)
  {
    Object localObject1 = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    IBinder localIBinder = null;
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
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localObject1 = ConnectionResult.CREATOR;
        localObject3 = (ConnectionResult)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 4: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, k);
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
    Object localObject3 = new com/google/android/gms/common/internal/ResolveAccountResponse;
    ((ResolveAccountResponse)localObject3).<init>(j, localIBinder, (ConnectionResult)localObject1, bool2, bool1);
    return (ResolveAccountResponse)localObject3;
  }
  
  public ResolveAccountResponse[] zzbX(int paramInt)
  {
    return new ResolveAccountResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */