package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(Asset paramAsset, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAsset.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAsset.getData();
    zzb.zza(paramParcel, 2, (byte[])localObject, false);
    localObject = paramAsset.getDigest();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAsset.zzbqV;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramAsset.uri;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Asset zzhX(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    String str = null;
    byte[] arrayOfByte = null;
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
        arrayOfByte = zza.zzs(paramParcel, k);
        break;
      case 3: 
        str = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject3 = ParcelFileDescriptor.CREATOR;
        localObject4 = (ParcelFileDescriptor)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 5: 
        localObject1 = Uri.CREATOR;
        localObject4 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
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
    Object localObject4 = new com/google/android/gms/wearable/Asset;
    ((Asset)localObject4).<init>(j, arrayOfByte, str, (ParcelFileDescriptor)localObject3, (Uri)localObject1);
    return (Asset)localObject4;
  }
  
  public Asset[] zzly(int paramInt)
  {
    return new Asset[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */