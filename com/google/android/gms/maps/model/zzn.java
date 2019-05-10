package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator
{
  static void zza(Tile paramTile, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTile.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    j = paramTile.width;
    zzb.zzc(paramParcel, 2, j);
    j = paramTile.height;
    zzb.zzc(paramParcel, 3, j);
    byte[] arrayOfByte = paramTile.data;
    zzb.zza(paramParcel, 4, arrayOfByte, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Tile zzfI(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
    int m = 0;
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
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
        break;
      case 4: 
        localObject2 = zza.zzs(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    Tile localTile = new com/google/android/gms/maps/model/Tile;
    localTile.<init>(m, k, i, (byte[])localObject2);
    return localTile;
  }
  
  public Tile[] zziw(int paramInt)
  {
    return new Tile[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */