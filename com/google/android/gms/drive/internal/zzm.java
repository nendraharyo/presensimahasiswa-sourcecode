package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzm
  implements Parcelable.Creator
{
  static void zza(CreateFileIntentSenderRequest paramCreateFileIntentSenderRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCreateFileIntentSenderRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCreateFileIntentSenderRequest.zzaqw;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    j = paramCreateFileIntentSenderRequest.zzaox;
    zzb.zzc(paramParcel, 3, j);
    localObject = paramCreateFileIntentSenderRequest.zzapg;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramCreateFileIntentSenderRequest.zzapj;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramCreateFileIntentSenderRequest.zzaqx;
    zzb.zza(paramParcel, 6, (Integer)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CreateFileIntentSenderRequest zzbj(Parcel paramParcel)
  {
    int i = 0;
    Integer localInteger = null;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    String str = null;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
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
        localObject2 = MetadataBundle.CREATOR;
        localObject4 = (MetadataBundle)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        str = zza.zzp(paramParcel, m);
        break;
      case 5: 
        localObject1 = DriveId.CREATOR;
        localObject4 = (DriveId)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 6: 
        localInteger = zza.zzh(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/CreateFileIntentSenderRequest;
    ((CreateFileIntentSenderRequest)localObject4).<init>(k, (MetadataBundle)localObject2, i, str, (DriveId)localObject1, localInteger);
    return (CreateFileIntentSenderRequest)localObject4;
  }
  
  public CreateFileIntentSenderRequest[] zzda(int paramInt)
  {
    return new CreateFileIntentSenderRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */