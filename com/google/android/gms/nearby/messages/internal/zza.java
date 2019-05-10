package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(ClientAppContext paramClientAppContext, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramClientAppContext.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramClientAppContext.zzbco;
    zzb.zza(paramParcel, 2, str, false);
    str = paramClientAppContext.zzbcp;
    zzb.zza(paramParcel, 3, str, false);
    boolean bool = paramClientAppContext.zzbbH;
    zzb.zza(paramParcel, 4, bool);
    int k = paramClientAppContext.zzbcq;
    zzb.zzc(paramParcel, 5, k);
    zzb.zzI(paramParcel, i);
  }
  
  public ClientAppContext zzgg(Parcel paramParcel)
  {
    String str = null;
    int i = 0;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    boolean bool = false;
    Object localObject1 = null;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
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
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 3: 
        str = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 4: 
        bool = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m);
        break;
      case 5: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
    ((ClientAppContext)localObject2).<init>(k, (String)localObject1, str, bool, i);
    return (ClientAppContext)localObject2;
  }
  
  public ClientAppContext[] zzjl(int paramInt)
  {
    return new ClientAppContext[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */