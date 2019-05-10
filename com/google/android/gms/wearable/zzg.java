package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(ConnectionConfiguration paramConnectionConfiguration, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramConnectionConfiguration.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramConnectionConfiguration.getName();
    zzb.zza(paramParcel, 2, str, false);
    str = paramConnectionConfiguration.getAddress();
    zzb.zza(paramParcel, 3, str, false);
    j = paramConnectionConfiguration.getType();
    zzb.zzc(paramParcel, 4, j);
    j = paramConnectionConfiguration.getRole();
    zzb.zzc(paramParcel, 5, j);
    boolean bool = paramConnectionConfiguration.isEnabled();
    zzb.zza(paramParcel, 6, bool);
    bool = paramConnectionConfiguration.isConnected();
    zzb.zza(paramParcel, 7, bool);
    str = paramConnectionConfiguration.zzIt();
    zzb.zza(paramParcel, 8, str, false);
    bool = paramConnectionConfiguration.zzIu();
    zzb.zza(paramParcel, 9, bool);
    str = paramConnectionConfiguration.getNodeId();
    zzb.zza(paramParcel, 10, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ConnectionConfiguration zzhY(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    String str2 = null;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    int k = 0;
    String str3 = null;
    Object localObject1 = null;
    int m = 0;
    zza.zza localzza = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        j = zza.zzg(paramParcel, n);
        break;
      case 6: 
        bool3 = zza.zzc(paramParcel, n);
        break;
      case 7: 
        bool2 = zza.zzc(paramParcel, n);
        break;
      case 8: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 9: 
        bool1 = zza.zzc(paramParcel, n);
        break;
      case 10: 
        str1 = zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/wearable/ConnectionConfiguration;
    ((ConnectionConfiguration)localObject2).<init>(m, (String)localObject1, str3, k, j, bool3, bool2, str2, bool1, str1);
    return (ConnectionConfiguration)localObject2;
  }
  
  public ConnectionConfiguration[] zzlz(int paramInt)
  {
    return new ConnectionConfiguration[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */