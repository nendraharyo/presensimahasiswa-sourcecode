package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.CameraPosition;

public class zza
  implements Parcelable.Creator
{
  static void zza(GoogleMapOptions paramGoogleMapOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGoogleMapOptions.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    j = paramGoogleMapOptions.zzzK();
    zzb.zza(paramParcel, 2, j);
    byte b1 = paramGoogleMapOptions.zzzL();
    zzb.zza(paramParcel, 3, b1);
    int k = paramGoogleMapOptions.getMapType();
    zzb.zzc(paramParcel, 4, k);
    CameraPosition localCameraPosition = paramGoogleMapOptions.getCamera();
    zzb.zza(paramParcel, 5, localCameraPosition, paramInt, false);
    k = paramGoogleMapOptions.zzzM();
    zzb.zza(paramParcel, 6, k);
    byte b2 = paramGoogleMapOptions.zzzN();
    zzb.zza(paramParcel, 7, b2);
    b2 = paramGoogleMapOptions.zzzO();
    zzb.zza(paramParcel, 8, b2);
    b2 = paramGoogleMapOptions.zzzP();
    zzb.zza(paramParcel, 9, b2);
    b2 = paramGoogleMapOptions.zzzQ();
    zzb.zza(paramParcel, 10, b2);
    b2 = paramGoogleMapOptions.zzzR();
    zzb.zza(paramParcel, 11, b2);
    b2 = paramGoogleMapOptions.zzzS();
    zzb.zza(paramParcel, 12, b2);
    b2 = paramGoogleMapOptions.zzzT();
    zzb.zza(paramParcel, 14, b2);
    b2 = paramGoogleMapOptions.zzzU();
    zzb.zza(paramParcel, 15, b2);
    zzb.zzI(paramParcel, i);
  }
  
  public GoogleMapOptions zzft(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    byte b1 = -1;
    byte b2 = -1;
    int k = 0;
    Object localObject2 = null;
    byte b3 = -1;
    byte b4 = -1;
    byte b5 = -1;
    byte b6 = -1;
    byte b7 = -1;
    byte b8 = -1;
    byte b9 = -1;
    byte b10 = -1;
    byte b11 = -1;
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
      case 13: 
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        b1 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 3: 
        b2 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 4: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 5: 
        localObject2 = CameraPosition.CREATOR;
        localObject3 = (CameraPosition)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 6: 
        b3 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 7: 
        b4 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 8: 
        b5 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 9: 
        b6 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 10: 
        b7 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 11: 
        b8 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 12: 
        b9 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 14: 
        b10 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
        break;
      case 15: 
        b11 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, m);
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
    Object localObject3 = new com/google/android/gms/maps/GoogleMapOptions;
    ((GoogleMapOptions)localObject3).<init>(j, b1, b2, k, (CameraPosition)localObject2, b3, b4, b5, b6, b7, b8, b9, b10, b11);
    return (GoogleMapOptions)localObject3;
  }
  
  public GoogleMapOptions[] zzih(int paramInt)
  {
    return new GoogleMapOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */