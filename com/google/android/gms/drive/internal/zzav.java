package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class zzav
  implements Parcelable.Creator
{
  static void zza(OnChangesResponse paramOnChangesResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnChangesResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramOnChangesResponse.zzasb;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramOnChangesResponse.zzasc;
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    localObject = paramOnChangesResponse.zzasd;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    boolean bool = paramOnChangesResponse.zzase;
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public OnChangesResponse zzby(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    Object localObject2 = null;
    Object localObject3 = null;
    int j = 0;
    Object localObject4 = null;
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
        localObject3 = DataHolder.CREATOR;
        localObject5 = (DataHolder)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 3: 
        localObject2 = DriveId.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 4: 
        localObject1 = ChangeSequenceNumber.CREATOR;
        localObject5 = (ChangeSequenceNumber)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
        break;
      case 5: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/drive/internal/OnChangesResponse;
    ((OnChangesResponse)localObject5).<init>(j, (DataHolder)localObject3, (List)localObject2, (ChangeSequenceNumber)localObject1, bool);
    return (OnChangesResponse)localObject5;
  }
  
  public OnChangesResponse[] zzdt(int paramInt)
  {
    return new OnChangesResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzav.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */