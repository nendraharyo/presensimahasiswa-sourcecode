package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(FaceParcel paramFaceParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFaceParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramFaceParcel.id;
    zzb.zzc(paramParcel, 2, j);
    float f = paramFaceParcel.centerX;
    zzb.zza(paramParcel, 3, f);
    f = paramFaceParcel.centerY;
    zzb.zza(paramParcel, 4, f);
    f = paramFaceParcel.width;
    zzb.zza(paramParcel, 5, f);
    f = paramFaceParcel.height;
    zzb.zza(paramParcel, 6, f);
    f = paramFaceParcel.zzbnP;
    zzb.zza(paramParcel, 7, f);
    f = paramFaceParcel.zzbnQ;
    zzb.zza(paramParcel, 8, f);
    LandmarkParcel[] arrayOfLandmarkParcel = paramFaceParcel.zzbnR;
    zzb.zza(paramParcel, 9, arrayOfLandmarkParcel, paramInt, false);
    f = paramFaceParcel.zzbnS;
    zzb.zza(paramParcel, 10, f);
    f = paramFaceParcel.zzbnT;
    zzb.zza(paramParcel, 11, f);
    f = paramFaceParcel.zzbnU;
    zzb.zza(paramParcel, 12, f);
    zzb.zzI(paramParcel, i);
  }
  
  public FaceParcel zzhk(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    Object localObject2 = null;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 3: 
        f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 4: 
        f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 5: 
        f3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 6: 
        f4 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 7: 
        f5 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 8: 
        f6 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 9: 
        localObject2 = LandmarkParcel.CREATOR;
        localObject3 = (LandmarkParcel[])com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 10: 
        f7 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 11: 
        f8 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
        break;
      case 12: 
        f9 = com.google.android.gms.common.internal.safeparcel.zza.zzl(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/vision/face/internal/client/FaceParcel;
    ((FaceParcel)localObject3).<init>(j, k, f1, f2, f3, f4, f5, f6, (LandmarkParcel[])localObject2, f7, f8, f9);
    return (FaceParcel)localObject3;
  }
  
  public FaceParcel[] zzkH(int paramInt)
  {
    return new FaceParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */