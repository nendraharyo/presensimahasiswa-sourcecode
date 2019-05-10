package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(PlusSession paramPlusSession, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramPlusSession.getAccountName();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramPlusSession.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramPlusSession.zzFd();
    zzb.zza(paramParcel, 2, (String[])localObject, false);
    localObject = paramPlusSession.zzFe();
    zzb.zza(paramParcel, 3, (String[])localObject, false);
    localObject = paramPlusSession.zzFf();
    zzb.zza(paramParcel, 4, (String[])localObject, false);
    localObject = paramPlusSession.zzFg();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramPlusSession.zzFh();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramPlusSession.zznX();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramPlusSession.zzFi();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramPlusSession.zzFj();
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlusSession zzgB(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String[] arrayOfString1 = null;
    String[] arrayOfString2 = null;
    String[] arrayOfString3 = null;
    String str5 = null;
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
        str5 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        arrayOfString3 = zza.zzB(paramParcel, k);
        break;
      case 3: 
        arrayOfString2 = zza.zzB(paramParcel, k);
        break;
      case 4: 
        arrayOfString1 = zza.zzB(paramParcel, k);
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        localObject1 = PlusCommonExtras.CREATOR;
        localObject3 = (PlusCommonExtras)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/plus/internal/PlusSession;
    ((PlusSession)localObject3).<init>(j, str5, arrayOfString3, arrayOfString2, arrayOfString1, str4, str3, str2, str1, (PlusCommonExtras)localObject1);
    return (PlusSession)localObject3;
  }
  
  public PlusSession[] zzjI(int paramInt)
  {
    return new PlusSession[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */