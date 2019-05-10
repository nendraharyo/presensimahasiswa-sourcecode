package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq
  implements Parcelable.Creator
{
  static void zza(Session paramSession, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    long l = paramSession.zzlO();
    zzb.zza(paramParcel, 1, l);
    int j = paramSession.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    l = paramSession.zzud();
    zzb.zza(paramParcel, 2, l);
    Object localObject = paramSession.getName();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramSession.getIdentifier();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramSession.getDescription();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    j = paramSession.zzub();
    zzb.zzc(paramParcel, 7, j);
    localObject = paramSession.zzum();
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    localObject = paramSession.zzuw();
    zzb.zza(paramParcel, 9, (Long)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Session zzdb(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    Long localLong = null;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    long l2 = l1;
    int k = 0;
    Object localObject2 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        l2 = zza.zzi(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 7: 
        i = zza.zzg(paramParcel, m);
        break;
      case 8: 
        localObject1 = Application.CREATOR;
        localObject3 = (Application)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 9: 
        localLong = zza.zzj(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/fitness/data/Session;
    ((Session)localObject3).<init>(k, l2, l1, str3, str2, str1, i, (Application)localObject1, localLong);
    return (Session)localObject3;
  }
  
  public Session[] zzfb(int paramInt)
  {
    return new Session[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */