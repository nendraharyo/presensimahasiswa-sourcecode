package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(RecordConsentRequest paramRecordConsentRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramRecordConsentRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramRecordConsentRequest.getAccount();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramRecordConsentRequest.zzFM();
    zzb.zza(paramParcel, 3, (Parcelable[])localObject, paramInt, false);
    localObject = paramRecordConsentRequest.zzmR();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RecordConsentRequest zzgT(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
        break;
        m = zza.zzg(paramParcel, m);
        Object localObject5 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = m;
        localObject4 = localObject5;
        continue;
        localObject3 = Account.CREATOR;
        localObject4 = (Account)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        k = j;
        localObject5 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        localObject2 = Scope.CREATOR;
        localObject4 = (Scope[])zza.zzb(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        k = j;
        localObject5 = localObject1;
        localObject1 = localObject4;
        localObject4 = localObject5;
        continue;
        localObject4 = zza.zzp(paramParcel, m);
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/signin/internal/RecordConsentRequest;
    ((RecordConsentRequest)localObject4).<init>(j, (Account)localObject3, (Scope[])localObject2, (String)localObject1);
    return (RecordConsentRequest)localObject4;
  }
  
  public RecordConsentRequest[] zzkb(int paramInt)
  {
    return new RecordConsentRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */