package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(SharedContent paramSharedContent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSharedContent.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramSharedContent.getUri();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramSharedContent.zzEL();
    zzb.zza(paramParcel, 8, (Parcelable[])localObject, paramInt, false);
    localObject = paramSharedContent.zzEM();
    zzb.zza(paramParcel, 9, (Parcelable[])localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SharedContent zzgs(Parcel paramParcel)
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
        localObject4 = zza.zzp(paramParcel, m);
        k = j;
        localObject5 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        localObject2 = ViewableItem.CREATOR;
        localObject4 = (ViewableItem[])zza.zzb(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        k = j;
        localObject5 = localObject1;
        localObject1 = localObject4;
        localObject4 = localObject5;
        continue;
        localObject1 = LocalContent.CREATOR;
        localObject4 = (LocalContent[])zza.zzb(paramParcel, m, (Parcelable.Creator)localObject1);
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
    Object localObject4 = new com/google/android/gms/nearby/sharing/SharedContent;
    ((SharedContent)localObject4).<init>(j, (String)localObject3, (ViewableItem[])localObject2, (LocalContent[])localObject1);
    return (SharedContent)localObject4;
  }
  
  public SharedContent[] zzjy(int paramInt)
  {
    return new SharedContent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */