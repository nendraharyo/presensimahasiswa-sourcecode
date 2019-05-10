package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzh
  implements Parcelable.Creator
{
  static void zza(WakeLockEvent paramWakeLockEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramWakeLockEvent.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramWakeLockEvent.getTimeMillis();
    zzb.zza(paramParcel, 2, l);
    Object localObject = paramWakeLockEvent.zzrR();
    zzb.zza(paramParcel, 4, (String)localObject, false);
    j = paramWakeLockEvent.zzrT();
    zzb.zzc(paramParcel, 5, j);
    localObject = paramWakeLockEvent.zzrU();
    zzb.zzb(paramParcel, 6, (List)localObject, false);
    l = paramWakeLockEvent.zzrN();
    zzb.zza(paramParcel, 8, l);
    localObject = paramWakeLockEvent.zzrS();
    zzb.zza(paramParcel, 10, (String)localObject, false);
    j = paramWakeLockEvent.getEventType();
    zzb.zzc(paramParcel, 11, j);
    localObject = paramWakeLockEvent.zzrK();
    zzb.zza(paramParcel, 12, (String)localObject, false);
    localObject = paramWakeLockEvent.zzrW();
    zzb.zza(paramParcel, 13, (String)localObject, false);
    j = paramWakeLockEvent.zzrV();
    zzb.zzc(paramParcel, 14, j);
    float f = paramWakeLockEvent.zzrX();
    zzb.zza(paramParcel, 15, f);
    l = paramWakeLockEvent.zzrY();
    zzb.zza(paramParcel, 16, l);
    zzb.zzI(paramParcel, i);
  }
  
  public WakeLockEvent zzaG(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    long l1 = 0L;
    int k = 0;
    String str1 = null;
    int m = 0;
    ArrayList localArrayList = null;
    String str2 = null;
    long l2 = 0L;
    int n = 0;
    String str3 = null;
    String str4 = null;
    float f = 0.0F;
    long l3 = 0L;
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
      case 3: 
      case 7: 
      case 9: 
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, i1);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, i1);
        break;
      case 5: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 6: 
        localArrayList = zza.zzD(paramParcel, i1);
        break;
      case 8: 
        l2 = zza.zzi(paramParcel, i1);
        break;
      case 10: 
        str3 = zza.zzp(paramParcel, i1);
        break;
      case 11: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 12: 
        str2 = zza.zzp(paramParcel, i1);
        break;
      case 13: 
        str4 = zza.zzp(paramParcel, i1);
        break;
      case 14: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 15: 
        f = zza.zzl(paramParcel, i1);
        break;
      case 16: 
        l3 = zza.zzi(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != i)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str5 = "Overread allowed size end=" + i;
      ((zza.zza)localObject).<init>(str5, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/common/stats/WakeLockEvent;
    ((WakeLockEvent)localObject).<init>(j, l1, k, str1, m, localArrayList, str2, l2, n, str3, str4, f, l3);
    return (WakeLockEvent)localObject;
  }
  
  public WakeLockEvent[] zzcm(int paramInt)
  {
    return new WakeLockEvent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */