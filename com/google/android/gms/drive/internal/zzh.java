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

public class zzh
  implements Parcelable.Creator
{
  static void zza(CloseContentsAndUpdateMetadataRequest paramCloseContentsAndUpdateMetadataRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCloseContentsAndUpdateMetadataRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCloseContentsAndUpdateMetadataRequest.zzaqj;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramCloseContentsAndUpdateMetadataRequest.zzaqk;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramCloseContentsAndUpdateMetadataRequest.zzaql;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    boolean bool1 = paramCloseContentsAndUpdateMetadataRequest.zzaoW;
    zzb.zza(paramParcel, 5, bool1);
    localObject = paramCloseContentsAndUpdateMetadataRequest.zzaoV;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    int k = paramCloseContentsAndUpdateMetadataRequest.zzaqm;
    zzb.zzc(paramParcel, 7, k);
    k = paramCloseContentsAndUpdateMetadataRequest.zzaqn;
    zzb.zzc(paramParcel, 8, k);
    boolean bool2 = paramCloseContentsAndUpdateMetadataRequest.zzaqo;
    zzb.zza(paramParcel, 9, bool2);
    bool2 = paramCloseContentsAndUpdateMetadataRequest.zzapa;
    zzb.zza(paramParcel, 10, bool2);
    zzb.zzI(paramParcel, i);
  }
  
  public CloseContentsAndUpdateMetadataRequest zzbf(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = true;
    int j = 0;
    int k = 0;
    boolean bool3 = false;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int m = 0;
    Object localObject4 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
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
        bool3 = zza.zzc(paramParcel, n);
        break;
      case 6: 
        str = zza.zzp(paramParcel, n);
        break;
      case 7: 
        k = zza.zzg(paramParcel, n);
        break;
      case 8: 
        j = zza.zzg(paramParcel, n);
        break;
      case 9: 
        bool1 = zza.zzc(paramParcel, n);
        break;
      case 10: 
        bool2 = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;
    ((CloseContentsAndUpdateMetadataRequest)localObject5).<init>(m, (DriveId)localObject3, (MetadataBundle)localObject2, (Contents)localObject1, bool3, str, k, j, bool1, bool2);
    return (CloseContentsAndUpdateMetadataRequest)localObject5;
  }
  
  public CloseContentsAndUpdateMetadataRequest[] zzcV(int paramInt)
  {
    return new CloseContentsAndUpdateMetadataRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */