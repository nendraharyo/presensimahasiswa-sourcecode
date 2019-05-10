package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(BeginCompoundOperationRequest paramBeginCompoundOperationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramBeginCompoundOperationRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    boolean bool = paramBeginCompoundOperationRequest.zzauG;
    zzb.zza(paramParcel, 2, bool);
    String str = paramBeginCompoundOperationRequest.mName;
    zzb.zza(paramParcel, 3, str, false);
    bool = paramBeginCompoundOperationRequest.zzauH;
    zzb.zza(paramParcel, 4, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public BeginCompoundOperationRequest zzcx(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Object localObject = null;
    boolean bool2 = true;
    int j = 0;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 3: 
        localObject = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        bool2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      zza.zza localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    BeginCompoundOperationRequest localBeginCompoundOperationRequest = new com/google/android/gms/drive/realtime/internal/BeginCompoundOperationRequest;
    localBeginCompoundOperationRequest.<init>(j, bool1, (String)localObject, bool2);
    return localBeginCompoundOperationRequest;
  }
  
  public BeginCompoundOperationRequest[] zzes(int paramInt)
  {
    return new BeginCompoundOperationRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */