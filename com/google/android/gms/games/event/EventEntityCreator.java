package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public class EventEntityCreator
  implements Parcelable.Creator
{
  public static final int CONTENT_DESCRIPTION;
  
  static void zza(EventEntity paramEventEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramEventEntity.getEventId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramEventEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramEventEntity.getName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramEventEntity.getDescription();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramEventEntity.getIconImageUri();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramEventEntity.getIconImageUrl();
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramEventEntity.getPlayer();
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    long l = paramEventEntity.getValue();
    zzb.zza(paramParcel, 7, l);
    localObject = paramEventEntity.getFormattedValue();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    boolean bool = paramEventEntity.isVisible();
    zzb.zza(paramParcel, 9, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public EventEntity createFromParcel(Parcel paramParcel)
  {
    boolean bool = false;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    long l = 0L;
    Object localObject1 = null;
    String str2 = null;
    Object localObject2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    int j = 0;
    Object localObject3 = null;
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
        str5 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject2 = Uri.CREATOR;
        localObject4 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        localObject1 = PlayerEntity.CREATOR;
        localObject4 = (PlayerEntity)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 7: 
        l = zza.zzi(paramParcel, k);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/games/event/EventEntity;
    ((EventEntity)localObject4).<init>(j, str5, str4, str3, (Uri)localObject2, str2, (Player)localObject1, l, str1, bool);
    return (EventEntity)localObject4;
  }
  
  public EventEntity[] newArray(int paramInt)
  {
    return new EventEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\event\EventEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */