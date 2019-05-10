package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(ApplicationMetadata paramApplicationMetadata, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramApplicationMetadata.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramApplicationMetadata.getApplicationId();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramApplicationMetadata.getName();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramApplicationMetadata.getImages();
    zzb.zzc(paramParcel, 4, (List)localObject, false);
    localObject = paramApplicationMetadata.getSupportedNamespaces();
    zzb.zzb(paramParcel, 5, (List)localObject, false);
    localObject = paramApplicationMetadata.getSenderAppIdentifier();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramApplicationMetadata.zznx();
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ApplicationMetadata zzZ(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str1 = null;
    ArrayList localArrayList = null;
    Object localObject3 = null;
    String str2 = null;
    String str3 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject3 = WebImage.CREATOR;
        localObject3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, (Parcelable.Creator)localObject3);
        break;
      case 5: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.zza.zzD(paramParcel, k);
        break;
      case 6: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 7: 
        localObject1 = Uri.CREATOR;
        localObject4 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
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
    Object localObject4 = new com/google/android/gms/cast/ApplicationMetadata;
    ((ApplicationMetadata)localObject4).<init>(j, str3, str2, (List)localObject3, localArrayList, str1, (Uri)localObject1);
    return (ApplicationMetadata)localObject4;
  }
  
  public ApplicationMetadata[] zzaW(int paramInt)
  {
    return new ApplicationMetadata[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */