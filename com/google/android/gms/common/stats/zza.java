package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(ConnectionEvent paramConnectionEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramConnectionEvent.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramConnectionEvent.getTimeMillis();
    zzb.zza(paramParcel, 2, l);
    String str = paramConnectionEvent.zzrF();
    zzb.zza(paramParcel, 4, str, false);
    str = paramConnectionEvent.zzrG();
    zzb.zza(paramParcel, 5, str, false);
    str = paramConnectionEvent.zzrH();
    zzb.zza(paramParcel, 6, str, false);
    str = paramConnectionEvent.zzrI();
    zzb.zza(paramParcel, 7, str, false);
    str = paramConnectionEvent.zzrJ();
    zzb.zza(paramParcel, 8, str, false);
    l = paramConnectionEvent.zzrN();
    zzb.zza(paramParcel, 10, l);
    l = paramConnectionEvent.zzrM();
    zzb.zza(paramParcel, 11, l);
    j = paramConnectionEvent.getEventType();
    zzb.zzc(paramParcel, 12, j);
    str = paramConnectionEvent.zzrK();
    zzb.zza(paramParcel, 13, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ConnectionEvent zzaF(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    long l1 = 0L;
    int k = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    long l2 = 0L;
    long l3 = 0L;
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
      case 3: 
      case 9: 
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, m);
        break;
      case 4: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 5: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 6: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 7: 
        str4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 8: 
        str5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 10: 
        l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, m);
        break;
      case 11: 
        l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, m);
        break;
      case 12: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 13: 
        str6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str7 = "Overread allowed size end=" + i;
      ((zza.zza)localObject).<init>(str7, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/common/stats/ConnectionEvent;
    ((ConnectionEvent)localObject).<init>(j, l1, k, str1, str2, str3, str4, str5, str6, l2, l3);
    return (ConnectionEvent)localObject;
  }
  
  public ConnectionEvent[] zzcl(int paramInt)
  {
    return new ConnectionEvent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */