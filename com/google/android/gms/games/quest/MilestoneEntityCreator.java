package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class MilestoneEntityCreator
  implements Parcelable.Creator
{
  static void zza(MilestoneEntity paramMilestoneEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramMilestoneEntity.getMilestoneId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramMilestoneEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    long l = paramMilestoneEntity.getCurrentProgress();
    zzb.zza(paramParcel, 2, l);
    l = paramMilestoneEntity.getTargetProgress();
    zzb.zza(paramParcel, 3, l);
    localObject = paramMilestoneEntity.getCompletionRewardData();
    zzb.zza(paramParcel, 4, (byte[])localObject, false);
    j = paramMilestoneEntity.getState();
    zzb.zzc(paramParcel, 5, j);
    localObject = paramMilestoneEntity.getEventId();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public MilestoneEntity zzex(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    byte[] arrayOfByte = null;
    long l2 = l1;
    String str2 = null;
    int k = 0;
    StringBuilder localStringBuilder = null;
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
        str2 = zza.zzp(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        l2 = zza.zzi(paramParcel, m);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 4: 
        arrayOfByte = zza.zzs(paramParcel, m);
        break;
      case 5: 
        i = zza.zzg(paramParcel, m);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = "Overread allowed size end=" + j;
      ((zza.zza)localObject).<init>(str3, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/games/quest/MilestoneEntity;
    ((MilestoneEntity)localObject).<init>(k, str2, l2, l1, arrayOfByte, i, str1);
    return (MilestoneEntity)localObject;
  }
  
  public MilestoneEntity[] zzgN(int paramInt)
  {
    return new MilestoneEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\MilestoneEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */