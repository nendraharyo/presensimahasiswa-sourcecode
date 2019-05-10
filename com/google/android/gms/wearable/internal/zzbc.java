package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbc
  implements Parcelable.Creator
{
  static void zza(NodeParcelable paramNodeParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramNodeParcelable.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramNodeParcelable.getId();
    zzb.zza(paramParcel, 2, str, false);
    str = paramNodeParcelable.getDisplayName();
    zzb.zza(paramParcel, 3, str, false);
    j = paramNodeParcelable.getHopCount();
    zzb.zzc(paramParcel, 4, j);
    boolean bool = paramNodeParcelable.isNearby();
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public NodeParcelable zziB(Parcel paramParcel)
  {
    String str = null;
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        str = zza.zzp(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/wearable/internal/NodeParcelable;
    ((NodeParcelable)localObject2).<init>(k, (String)localObject1, str, j, bool);
    return (NodeParcelable)localObject2;
  }
  
  public NodeParcelable[] zzmf(int paramInt)
  {
    return new NodeParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */