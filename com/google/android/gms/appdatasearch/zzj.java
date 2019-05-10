package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(UsageInfo paramUsageInfo, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramUsageInfo.zzUs;
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramUsageInfo.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    long l = paramUsageInfo.zzUt;
    zzb.zza(paramParcel, 2, l);
    j = paramUsageInfo.zzUu;
    zzb.zzc(paramParcel, 3, j);
    localObject = paramUsageInfo.zzvp;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramUsageInfo.zzUv;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    boolean bool = paramUsageInfo.zzUw;
    zzb.zza(paramParcel, 6, bool);
    int k = paramUsageInfo.zzUx;
    zzb.zzc(paramParcel, 7, k);
    k = paramUsageInfo.zzUy;
    zzb.zzc(paramParcel, 8, k);
    zzb.zzI(paramParcel, i);
  }
  
  public UsageInfo[] zzat(int paramInt)
  {
    return new UsageInfo[paramInt];
  }
  
  public UsageInfo zzy(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    long l = 0L;
    int k = -1;
    boolean bool = false;
    String str = null;
    int m = 0;
    Object localObject2 = null;
    int n = 0;
    StringBuilder localStringBuilder = null;
    Object localObject3;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= j) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        localObject2 = DocumentId.CREATOR;
        localObject3 = (DocumentId)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 1000: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        l = zza.zzi(paramParcel, i1);
        break;
      case 3: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        str = zza.zzp(paramParcel, i1);
        break;
      case 5: 
        localObject1 = DocumentContents.CREATOR;
        localObject3 = (DocumentContents)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 6: 
        bool = zza.zzc(paramParcel, i1);
        break;
      case 7: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 8: 
        i = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject4 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject4 = new com/google/android/gms/appdatasearch/UsageInfo;
    ((UsageInfo)localObject4).<init>(n, (DocumentId)localObject2, l, m, str, (DocumentContents)localObject1, bool, k, i);
    return (UsageInfo)localObject4;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */