package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class zzah
  implements Parcelable.Creator
{
  static void zza(GetChangesRequest paramGetChangesRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetChangesRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramGetChangesRequest.zzarJ;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    j = paramGetChangesRequest.zzarK;
    zzb.zzc(paramParcel, 3, j);
    localObject = paramGetChangesRequest.zzapB;
    zzb.zzc(paramParcel, 4, (List)localObject, false);
    boolean bool = paramGetChangesRequest.zzarL;
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public GetChangesRequest zzbr(Parcel paramParcel)
  {
    Object localObject1 = null;
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
        localObject2 = ChangeSequenceNumber.CREATOR;
        localObject4 = (ChangeSequenceNumber)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        j = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localObject1 = DriveSpace.CREATOR;
        localObject1 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/GetChangesRequest;
    ((GetChangesRequest)localObject4).<init>(k, (ChangeSequenceNumber)localObject2, j, (List)localObject1, bool);
    return (GetChangesRequest)localObject4;
  }
  
  public GetChangesRequest[] zzdm(int paramInt)
  {
    return new GetChangesRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */