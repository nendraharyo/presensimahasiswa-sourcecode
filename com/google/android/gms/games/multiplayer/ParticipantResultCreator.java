package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class ParticipantResultCreator
  implements Parcelable.Creator
{
  static void zza(ParticipantResult paramParticipantResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    String str = paramParticipantResult.getParticipantId();
    zzb.zza(paramParcel, 1, str, false);
    int j = paramParticipantResult.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    j = paramParticipantResult.getResult();
    zzb.zzc(paramParcel, 2, j);
    j = paramParticipantResult.getPlacing();
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public ParticipantResult zzet(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    String str = null;
    int k = 0;
    Object localObject = null;
    int m = 0;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
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
        str = zza.zzp(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    ParticipantResult localParticipantResult = new com/google/android/gms/games/multiplayer/ParticipantResult;
    localParticipantResult.<init>(m, str, k, i);
    return localParticipantResult;
  }
  
  public ParticipantResult[] zzgJ(int paramInt)
  {
    return new ParticipantResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantResultCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */