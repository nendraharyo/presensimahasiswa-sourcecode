package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetServiceRequest.version;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetServiceRequest.zzall;
    zzb.zzc(paramParcel, 2, j);
    j = paramGetServiceRequest.zzalm;
    zzb.zzc(paramParcel, 3, j);
    Object localObject = paramGetServiceRequest.zzaln;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramGetServiceRequest.zzalo;
    zzb.zza(paramParcel, 5, (IBinder)localObject, false);
    localObject = paramGetServiceRequest.zzalp;
    zzb.zza(paramParcel, 6, (Parcelable[])localObject, paramInt, false);
    localObject = paramGetServiceRequest.zzalq;
    zzb.zza(paramParcel, 7, (Bundle)localObject, false);
    localObject = paramGetServiceRequest.zzalr;
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetServiceRequest zzao(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Bundle localBundle = null;
    Object localObject2 = null;
    IBinder localIBinder = null;
    String str = null;
    int k = 0;
    int m = 0;
    Object localObject3 = null;
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
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
        break;
      case 4: 
        str = zza.zzp(paramParcel, n);
        break;
      case 5: 
        localIBinder = zza.zzq(paramParcel, n);
        break;
      case 6: 
        localObject2 = Scope.CREATOR;
        localObject4 = (Scope[])zza.zzb(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 7: 
        localBundle = zza.zzr(paramParcel, n);
        break;
      case 8: 
        localObject1 = Account.CREATOR;
        localObject4 = (Account)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/common/internal/GetServiceRequest;
    ((GetServiceRequest)localObject4).<init>(m, k, i, str, localIBinder, (Scope[])localObject2, localBundle, (Account)localObject1);
    return (GetServiceRequest)localObject4;
  }
  
  public GetServiceRequest[] zzbR(int paramInt)
  {
    return new GetServiceRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */