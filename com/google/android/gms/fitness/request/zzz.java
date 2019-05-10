package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzz
  implements Parcelable.Creator
{
  static void zza(SessionRegistrationRequest paramSessionRegistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSessionRegistrationRequest.getIntent();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramSessionRegistrationRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSessionRegistrationRequest.getCallbackBinder();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    j = paramSessionRegistrationRequest.zzvf();
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionRegistrationRequest zzdE(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject3 = null;
    int m = 0;
    int n = paramParcel.dataPosition();
    if (n < j)
    {
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        n = i;
        localObject2 = localObject1;
        localObject1 = localObject3;
        k = m;
      }
      for (;;)
      {
        m = k;
        localObject3 = localObject1;
        localObject1 = localObject2;
        i = n;
        break;
        localObject3 = PendingIntent.CREATOR;
        localObject4 = (PendingIntent)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        k = m;
        Object localObject5 = localObject1;
        localObject1 = localObject4;
        n = i;
        localObject2 = localObject5;
        continue;
        n = zza.zzg(paramParcel, n);
        localObject2 = localObject1;
        localObject1 = localObject3;
        k = n;
        n = i;
        continue;
        localObject4 = zza.zzq(paramParcel, n);
        localObject1 = localObject3;
        k = m;
        localObject2 = localObject4;
        n = i;
        continue;
        n = zza.zzg(paramParcel, n);
        localObject2 = localObject1;
        localObject1 = localObject3;
        k = m;
      }
    }
    n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/fitness/request/SessionRegistrationRequest;
    ((SessionRegistrationRequest)localObject4).<init>(m, (PendingIntent)localObject3, (IBinder)localObject1, i);
    return (SessionRegistrationRequest)localObject4;
  }
  
  public SessionRegistrationRequest[] zzfF(int paramInt)
  {
    return new SessionRegistrationRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */