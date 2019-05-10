package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzg
  implements Parcelable.Creator
{
  static void zza(GetRecentContextCall.Response paramResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramResponse.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramResponse.zzTY;
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    localObject = paramResponse.zzTZ;
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    localObject = paramResponse.zzUa;
    zzb.zza(paramParcel, 3, (String[])localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetRecentContextCall.Response[] zzan(int paramInt)
  {
    return new GetRecentContextCall.Response[paramInt];
  }
  
  public GetRecentContextCall.Response zzw(Parcel paramParcel)
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
        localObject3 = Status.CREATOR;
        localObject4 = (Status)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        k = j;
        localObject5 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        localObject2 = UsageInfo.CREATOR;
        localObject4 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        k = j;
        localObject5 = localObject1;
        localObject1 = localObject4;
        localObject4 = localObject5;
        continue;
        localObject4 = zza.zzB(paramParcel, m);
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
    Object localObject4 = new com/google/android/gms/appdatasearch/GetRecentContextCall$Response;
    ((GetRecentContextCall.Response)localObject4).<init>(j, (Status)localObject3, (List)localObject2, (String[])localObject1);
    return (GetRecentContextCall.Response)localObject4;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */