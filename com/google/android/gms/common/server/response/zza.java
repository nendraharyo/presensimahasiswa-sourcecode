package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public class zza
  implements Parcelable.Creator
{
  static void zza(FastJsonResponse.Field paramField, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramField.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    j = paramField.zzrj();
    zzb.zzc(paramParcel, 2, j);
    boolean bool1 = paramField.zzrp();
    zzb.zza(paramParcel, 3, bool1);
    int k = paramField.zzrk();
    zzb.zzc(paramParcel, 4, k);
    boolean bool2 = paramField.zzrq();
    zzb.zza(paramParcel, 5, bool2);
    Object localObject = paramField.zzrr();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    int m = paramField.zzrs();
    zzb.zzc(paramParcel, 7, m);
    localObject = paramField.zzru();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramField.zzrw();
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public FastJsonResponse.Field zzaA(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    String str1 = null;
    String str2 = null;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    Object localObject2 = null;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= j) {
        break;
      }
      i1 = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int i2 = com.google.android.gms.common.internal.safeparcel.zza.zzca(i1);
      switch (i2)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, i1);
        break;
      case 1: 
        n = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i1);
        break;
      case 2: 
        m = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i1);
        break;
      case 3: 
        bool2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i1);
        break;
      case 4: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i1);
        break;
      case 5: 
        bool1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i1);
        break;
      case 6: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i1);
        break;
      case 7: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i1);
        break;
      case 8: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i1);
        break;
      case 9: 
        localObject1 = ConverterWrapper.CREATOR;
        localObject3 = (ConverterWrapper)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/common/server/response/FastJsonResponse$Field;
    ((FastJsonResponse.Field)localObject3).<init>(n, m, bool2, k, bool1, str2, i, str1, (ConverterWrapper)localObject1);
    return (FastJsonResponse.Field)localObject3;
  }
  
  public FastJsonResponse.Field[] zzcg(int paramInt)
  {
    return new FastJsonResponse.Field[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */