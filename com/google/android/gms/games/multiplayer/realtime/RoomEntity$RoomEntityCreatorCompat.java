package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

final class RoomEntity$RoomEntityCreatorCompat
  extends RoomEntityCreator
{
  public RoomEntity zzev(Parcel paramParcel)
  {
    Object localObject1 = RoomEntity.zzvC();
    int i = RoomEntity.zzc((Integer)localObject1);
    if (i == 0)
    {
      localObject1 = RoomEntity.class.getCanonicalName();
      i = RoomEntity.zzdG((String)localObject1);
      if (i == 0) {}
    }
    else
    {
      localObject1 = super.zzev(paramParcel);
    }
    for (;;)
    {
      return (RoomEntity)localObject1;
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      long l = paramParcel.readLong();
      int k = paramParcel.readInt();
      String str3 = paramParcel.readString();
      int m = paramParcel.readInt();
      Bundle localBundle = paramParcel.readBundle();
      int n = paramParcel.readInt();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(n);
      i = 0;
      localObject1 = null;
      while (i < n)
      {
        Object localObject2 = ParticipantEntity.CREATOR.createFromParcel(paramParcel);
        localArrayList.add(localObject2);
        int j;
        i += 1;
      }
      int i2 = -1;
      localObject1 = new com/google/android/gms/games/multiplayer/realtime/RoomEntity;
      int i1 = 2;
      ((RoomEntity)localObject1).<init>(i1, str1, str2, l, k, str3, m, localBundle, localArrayList, i2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomEntity$RoomEntityCreatorCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */