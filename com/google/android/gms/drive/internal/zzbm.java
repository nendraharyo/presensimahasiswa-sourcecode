package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class zzbm
  implements Parcelable.Creator
{
  static void zza(OpenFileIntentSenderRequest paramOpenFileIntentSenderRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOpenFileIntentSenderRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramOpenFileIntentSenderRequest.zzapg;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramOpenFileIntentSenderRequest.zzaph;
    zzb.zza(paramParcel, 3, (String[])localObject, false);
    localObject = paramOpenFileIntentSenderRequest.zzapj;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramOpenFileIntentSenderRequest.zzasz;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OpenFileIntentSenderRequest zzbO(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    String[] arrayOfString = null;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        arrayOfString = zza.zzB(paramParcel, k);
        break;
      case 4: 
        localObject3 = DriveId.CREATOR;
        localObject4 = (DriveId)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 5: 
        localObject1 = FilterHolder.CREATOR;
        localObject4 = (FilterHolder)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/OpenFileIntentSenderRequest;
    ((OpenFileIntentSenderRequest)localObject4).<init>(j, str, arrayOfString, (DriveId)localObject3, (FilterHolder)localObject1);
    return (OpenFileIntentSenderRequest)localObject4;
  }
  
  public OpenFileIntentSenderRequest[] zzdJ(int paramInt)
  {
    return new OpenFileIntentSenderRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */