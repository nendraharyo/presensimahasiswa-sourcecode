package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(UserMetadata paramUserMetadata, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramUserMetadata.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramUserMetadata.zzaps;
    zzb.zza(paramParcel, 2, str, false);
    str = paramUserMetadata.zzWQ;
    zzb.zza(paramParcel, 3, str, false);
    str = paramUserMetadata.zzapt;
    zzb.zza(paramParcel, 4, str, false);
    boolean bool = paramUserMetadata.zzapu;
    zzb.zza(paramParcel, 5, bool);
    str = paramUserMetadata.zzapv;
    zzb.zza(paramParcel, 6, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public UserMetadata zzaO(Parcel paramParcel)
  {
    boolean bool = false;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    String str2 = null;
    String str3 = null;
    Object localObject1 = null;
    int j = 0;
    zza.zza localzza = null;
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
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/drive/UserMetadata;
    ((UserMetadata)localObject2).<init>(j, (String)localObject1, str3, str2, bool, str1);
    return (UserMetadata)localObject2;
  }
  
  public UserMetadata[] zzcD(int paramInt)
  {
    return new UserMetadata[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */