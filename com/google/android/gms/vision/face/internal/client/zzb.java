package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(FaceSettingsParcel paramFaceSettingsParcel, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramFaceSettingsParcel.versionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    j = paramFaceSettingsParcel.mode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, j);
    j = paramFaceSettingsParcel.zzbnV;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 3, j);
    j = paramFaceSettingsParcel.zzbnW;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 4, j);
    boolean bool = paramFaceSettingsParcel.zzbnX;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, bool);
    bool = paramFaceSettingsParcel.zzbnY;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, bool);
    float f = paramFaceSettingsParcel.zzbnZ;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, f);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public FaceSettingsParcel zzhl(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    float f = -1.0F;
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    StringBuilder localStringBuilder = null;
    int n = 0;
    zza.zza localzza = null;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= i) {
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
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 3: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 5: 
        bool2 = zza.zzc(paramParcel, i1);
        break;
      case 6: 
        bool1 = zza.zzc(paramParcel, i1);
        break;
      case 7: 
        f = zza.zzl(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/vision/face/internal/client/FaceSettingsParcel;
    ((FaceSettingsParcel)localObject).<init>(n, m, k, j, bool2, bool1, f);
    return (FaceSettingsParcel)localObject;
  }
  
  public FaceSettingsParcel[] zzkI(int paramInt)
  {
    return new FaceSettingsParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */