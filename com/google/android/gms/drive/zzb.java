package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(Contents paramContents, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramContents.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramContents.zzajL;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    j = paramContents.zzaox;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 3, j);
    j = paramContents.zzaoy;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 4, j);
    localObject = paramContents.zzaoz;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    boolean bool = paramContents.zzaoA;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, bool);
    localObject = paramContents.zzsU;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, (String)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public Contents zzaI(Parcel paramParcel)
  {
    String str = null;
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    Object localObject3 = null;
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
      case 6: 
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject2 = ParcelFileDescriptor.CREATOR;
        localObject4 = (ParcelFileDescriptor)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
        break;
      case 4: 
        j = zza.zzg(paramParcel, n);
        break;
      case 5: 
        localObject1 = DriveId.CREATOR;
        localObject4 = (DriveId)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 7: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 8: 
        str = zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/Contents;
    ((Contents)localObject4).<init>(m, (ParcelFileDescriptor)localObject2, k, j, (DriveId)localObject1, bool, str);
    return (Contents)localObject4;
  }
  
  public Contents[] zzcr(int paramInt)
  {
    return new Contents[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */