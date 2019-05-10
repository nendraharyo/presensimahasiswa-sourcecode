package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzn
  implements Parcelable.Creator
{
  static void zza(CreateFileRequest paramCreateFileRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCreateFileRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCreateFileRequest.zzaqy;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramCreateFileRequest.zzaqw;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramCreateFileRequest.zzaql;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramCreateFileRequest.zzaqx;
    zzb.zza(paramParcel, 5, (Integer)localObject, false);
    boolean bool = paramCreateFileRequest.zzaqd;
    zzb.zza(paramParcel, 6, bool);
    localObject = paramCreateFileRequest.zzaoV;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    int k = paramCreateFileRequest.zzaqz;
    zzb.zzc(paramParcel, 8, k);
    k = paramCreateFileRequest.zzaqA;
    zzb.zzc(paramParcel, 9, k);
    localObject = paramCreateFileRequest.zzaoY;
    zzb.zza(paramParcel, 10, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CreateFileRequest zzbk(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    String str2 = null;
    boolean bool = false;
    Integer localInteger = null;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int m = 0;
    Object localObject4 = null;
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
        localObject3 = DriveId.CREATOR;
        localObject5 = (DriveId)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 3: 
        localObject2 = MetadataBundle.CREATOR;
        localObject5 = (MetadataBundle)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 4: 
        localObject1 = Contents.CREATOR;
        localObject5 = (Contents)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
        break;
      case 5: 
        localInteger = zza.zzh(paramParcel, n);
        break;
      case 6: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 8: 
        k = zza.zzg(paramParcel, n);
        break;
      case 9: 
        i = zza.zzg(paramParcel, n);
        break;
      case 10: 
        str1 = zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + j;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/drive/internal/CreateFileRequest;
    ((CreateFileRequest)localObject5).<init>(m, (DriveId)localObject3, (MetadataBundle)localObject2, (Contents)localObject1, localInteger, bool, str2, k, i, str1);
    return (CreateFileRequest)localObject5;
  }
  
  public CreateFileRequest[] zzdb(int paramInt)
  {
    return new CreateFileRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */