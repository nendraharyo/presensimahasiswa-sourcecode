package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveFileRange;
import java.util.List;

public class zzay
  implements Parcelable.Creator
{
  static void zza(OnDownloadProgressResponse paramOnDownloadProgressResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnDownloadProgressResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramOnDownloadProgressResponse.zzasi;
    zzb.zza(paramParcel, 2, l);
    l = paramOnDownloadProgressResponse.zzasj;
    zzb.zza(paramParcel, 3, l);
    j = paramOnDownloadProgressResponse.zzBc;
    zzb.zzc(paramParcel, 4, j);
    List localList = paramOnDownloadProgressResponse.zzask;
    zzb.zzc(paramParcel, 5, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OnDownloadProgressResponse zzbB(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    long l2 = l1;
    int k = 0;
    zza.zza localzza = null;
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
        l2 = zza.zzi(paramParcel, m);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 4: 
        i = zza.zzg(paramParcel, m);
        break;
      case 5: 
        localObject1 = DriveFileRange.CREATOR;
        localObject1 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/drive/internal/OnDownloadProgressResponse;
    ((OnDownloadProgressResponse)localObject2).<init>(k, l2, l1, i, (List)localObject1);
    return (OnDownloadProgressResponse)localObject2;
  }
  
  public OnDownloadProgressResponse[] zzdw(int paramInt)
  {
    return new OnDownloadProgressResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzay.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */