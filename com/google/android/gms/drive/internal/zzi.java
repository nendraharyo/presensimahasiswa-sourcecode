package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class zzi
  implements Parcelable.Creator
{
  static void zza(CloseContentsRequest paramCloseContentsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCloseContentsRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCloseContentsRequest.zzaql;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramCloseContentsRequest.zzaqp;
    zzb.zza(paramParcel, 3, (Boolean)localObject, false);
    j = paramCloseContentsRequest.zzaqn;
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public CloseContentsRequest zzbg(Parcel paramParcel)
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
        n = zza.zzg(paramParcel, n);
        localObject2 = localObject1;
        localObject1 = localObject3;
        k = n;
        n = i;
        continue;
        localObject3 = Contents.CREATOR;
        localObject4 = (Contents)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        k = m;
        Object localObject5 = localObject1;
        localObject1 = localObject4;
        n = i;
        localObject2 = localObject5;
        continue;
        localObject4 = zza.zzd(paramParcel, n);
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
    Object localObject4 = new com/google/android/gms/drive/internal/CloseContentsRequest;
    ((CloseContentsRequest)localObject4).<init>(m, (Contents)localObject3, (Boolean)localObject1, i);
    return (CloseContentsRequest)localObject4;
  }
  
  public CloseContentsRequest[] zzcW(int paramInt)
  {
    return new CloseContentsRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */