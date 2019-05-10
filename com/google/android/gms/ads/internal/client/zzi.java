package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(AdSizeParcel paramAdSizeParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAdSizeParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAdSizeParcel.zzuh;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    j = paramAdSizeParcel.height;
    zzb.zzc(paramParcel, 3, j);
    j = paramAdSizeParcel.heightPixels;
    zzb.zzc(paramParcel, 4, j);
    boolean bool1 = paramAdSizeParcel.zzui;
    zzb.zza(paramParcel, 5, bool1);
    int k = paramAdSizeParcel.width;
    zzb.zzc(paramParcel, 6, k);
    k = paramAdSizeParcel.widthPixels;
    zzb.zzc(paramParcel, 7, k);
    localObject = paramAdSizeParcel.zzuj;
    zzb.zza(paramParcel, 8, (Parcelable[])localObject, paramInt, false);
    boolean bool2 = paramAdSizeParcel.zzuk;
    zzb.zza(paramParcel, 9, bool2);
    bool2 = paramAdSizeParcel.zzul;
    zzb.zza(paramParcel, 10, bool2);
    bool2 = paramAdSizeParcel.zzum;
    zzb.zza(paramParcel, 11, bool2);
    zzb.zzI(paramParcel, i);
  }
  
  public AdSizeParcel zzc(Parcel paramParcel)
  {
    Object localObject1 = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    int k = 0;
    boolean bool4 = false;
    int m = 0;
    int n = 0;
    String str = null;
    int i1 = 0;
    Object localObject2 = null;
    for (;;)
    {
      i2 = paramParcel.dataPosition();
      if (i2 >= i) {
        break;
      }
      i2 = zza.zzat(paramParcel);
      int i3 = zza.zzca(i2);
      switch (i3)
      {
      default: 
        zza.zzb(paramParcel, i2);
        break;
      case 1: 
        i1 = zza.zzg(paramParcel, i2);
        break;
      case 2: 
        str = zza.zzp(paramParcel, i2);
        break;
      case 3: 
        n = zza.zzg(paramParcel, i2);
        break;
      case 4: 
        m = zza.zzg(paramParcel, i2);
        break;
      case 5: 
        bool4 = zza.zzc(paramParcel, i2);
        break;
      case 6: 
        k = zza.zzg(paramParcel, i2);
        break;
      case 7: 
        j = zza.zzg(paramParcel, i2);
        break;
      case 8: 
        localObject1 = AdSizeParcel.CREATOR;
        localObject3 = (AdSizeParcel[])zza.zzb(paramParcel, i2, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 9: 
        bool3 = zza.zzc(paramParcel, i2);
        break;
      case 10: 
        bool2 = zza.zzc(paramParcel, i2);
        break;
      case 11: 
        bool1 = zza.zzc(paramParcel, i2);
      }
    }
    int i2 = paramParcel.dataPosition();
    if (i2 != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    ((AdSizeParcel)localObject3).<init>(i1, str, n, m, bool4, k, j, (AdSizeParcel[])localObject1, bool3, bool2, bool1);
    return (AdSizeParcel)localObject3;
  }
  
  public AdSizeParcel[] zzm(int paramInt)
  {
    return new AdSizeParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */