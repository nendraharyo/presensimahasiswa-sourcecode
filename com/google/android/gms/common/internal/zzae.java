package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzae
  implements Parcelable.Creator
{
  static void zza(ValidateAccountRequest paramValidateAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramValidateAccountRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramValidateAccountRequest.zzre();
    zzb.zzc(paramParcel, 2, j);
    Object localObject = paramValidateAccountRequest.zzakA;
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramValidateAccountRequest.zzrd();
    zzb.zza(paramParcel, 4, (Parcelable[])localObject, paramInt, false);
    localObject = paramValidateAccountRequest.zzrf();
    zzb.zza(paramParcel, 5, (Bundle)localObject, false);
    localObject = paramValidateAccountRequest.getCallingPackage();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ValidateAccountRequest zzas(Parcel paramParcel)
  {
    int i = 0;
    String str = null;
    int j = zza.zzau(paramParcel);
    Bundle localBundle = null;
    Object localObject1 = null;
    IBinder localIBinder = null;
    int k = 0;
    Object localObject2 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localIBinder = zza.zzq(paramParcel, m);
        break;
      case 4: 
        localObject1 = Scope.CREATOR;
        localObject3 = (Scope[])zza.zzb(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 5: 
        localBundle = zza.zzr(paramParcel, m);
        break;
      case 6: 
        str = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/common/internal/ValidateAccountRequest;
    ((ValidateAccountRequest)localObject3).<init>(k, i, localIBinder, (Scope[])localObject1, localBundle, str);
    return (ValidateAccountRequest)localObject3;
  }
  
  public ValidateAccountRequest[] zzbZ(int paramInt)
  {
    return new ValidateAccountRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */