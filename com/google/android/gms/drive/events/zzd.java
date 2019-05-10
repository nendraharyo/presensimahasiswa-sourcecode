package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class zzd
  implements Parcelable.Creator
{
  static void zza(ChangesAvailableOptions paramChangesAvailableOptions, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramChangesAvailableOptions.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramChangesAvailableOptions.zzapz;
    zzb.zzc(paramParcel, 2, j);
    boolean bool = paramChangesAvailableOptions.zzapA;
    zzb.zza(paramParcel, 3, bool);
    List localList = paramChangesAvailableOptions.zzapB;
    zzb.zzc(paramParcel, 4, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ChangesAvailableOptions zzaR(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    Object localObject2 = null;
    int j = 0;
    int k = 0;
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
        j = zza.zzg(paramParcel, m);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 4: 
        localObject2 = DriveSpace.CREATOR;
        localObject2 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject2);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    ChangesAvailableOptions localChangesAvailableOptions = new com/google/android/gms/drive/events/ChangesAvailableOptions;
    localChangesAvailableOptions.<init>(k, j, bool, (List)localObject2);
    return localChangesAvailableOptions;
  }
  
  public ChangesAvailableOptions[] zzcG(int paramInt)
  {
    return new ChangesAvailableOptions[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */