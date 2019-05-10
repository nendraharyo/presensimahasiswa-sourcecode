package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(WebImage paramWebImage, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramWebImage.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Uri localUri = paramWebImage.getUrl();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, localUri, paramInt, false);
    j = paramWebImage.getWidth();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 3, j);
    j = paramWebImage.getHeight();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 4, j);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public WebImage zzal(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    Object localObject3 = null;
    int n = 0;
    int i1 = paramParcel.dataPosition();
    if (i1 < j)
    {
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        i1 = i;
        i = m;
        localObject3 = localObject2;
        k = n;
      }
      for (;;)
      {
        n = k;
        localObject2 = localObject3;
        m = i;
        i = i1;
        break;
        i1 = zza.zzg(paramParcel, i1);
        int i3 = i;
        i = m;
        localObject3 = localObject2;
        k = i1;
        i1 = i3;
        continue;
        localObject2 = Uri.CREATOR;
        localObject4 = (Uri)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        k = n;
        i3 = m;
        localObject3 = localObject4;
        i1 = i;
        i = m;
        continue;
        i1 = zza.zzg(paramParcel, i1);
        localObject3 = localObject2;
        k = n;
        i3 = i;
        i = i1;
        i1 = i3;
        continue;
        i1 = zza.zzg(paramParcel, i1);
        i = m;
        localObject3 = localObject2;
        k = n;
      }
    }
    i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/common/images/WebImage;
    ((WebImage)localObject4).<init>(n, (Uri)localObject2, m, i);
    return (WebImage)localObject4;
  }
  
  public WebImage[] zzbN(int paramInt)
  {
    return new WebImage[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */