package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(LogEvent paramLogEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLogEvent.versionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramLogEvent.zzbdA;
    zzb.zza(paramParcel, 2, l);
    Object localObject = paramLogEvent.tag;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramLogEvent.zzbdC;
    zzb.zza(paramParcel, 4, (byte[])localObject, false);
    localObject = paramLogEvent.zzbdD;
    zzb.zza(paramParcel, 5, (Bundle)localObject, false);
    l = paramLogEvent.zzbdB;
    zzb.zza(paramParcel, 6, l);
    zzb.zzI(paramParcel, i);
  }
  
  public LogEvent zzgy(Parcel paramParcel)
  {
    long l1 = 0L;
    Bundle localBundle = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    byte[] arrayOfByte = null;
    String str = null;
    long l2 = l1;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        str = zza.zzp(paramParcel, k);
        break;
      case 4: 
        arrayOfByte = zza.zzs(paramParcel, k);
        break;
      case 5: 
        localBundle = zza.zzr(paramParcel, k);
        break;
      case 6: 
        l1 = zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/playlog/internal/LogEvent;
    ((LogEvent)localObject).<init>(j, l2, l1, str, arrayOfByte, localBundle);
    return (LogEvent)localObject;
  }
  
  public LogEvent[] zzjE(int paramInt)
  {
    return new LogEvent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */