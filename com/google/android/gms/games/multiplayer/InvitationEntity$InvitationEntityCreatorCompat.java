package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

final class InvitationEntity$InvitationEntityCreatorCompat
  extends InvitationEntityCreator
{
  public InvitationEntity zzer(Parcel paramParcel)
  {
    Object localObject1 = InvitationEntity.zzvC();
    int i = InvitationEntity.zzc((Integer)localObject1);
    if (i == 0)
    {
      localObject1 = InvitationEntity.class.getCanonicalName();
      i = InvitationEntity.zzdG((String)localObject1);
      if (i == 0) {}
    }
    else
    {
      localObject1 = super.zzer(paramParcel);
    }
    for (;;)
    {
      return (InvitationEntity)localObject1;
      GameEntity localGameEntity = (GameEntity)GameEntity.CREATOR.createFromParcel(paramParcel);
      String str = paramParcel.readString();
      long l = paramParcel.readLong();
      int k = paramParcel.readInt();
      ParticipantEntity localParticipantEntity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(paramParcel);
      int m = paramParcel.readInt();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(m);
      i = 0;
      localObject1 = null;
      while (i < m)
      {
        Object localObject2 = ParticipantEntity.CREATOR.createFromParcel(paramParcel);
        localArrayList.add(localObject2);
        int j;
        i += 1;
      }
      int i1 = -1;
      localObject1 = new com/google/android/gms/games/multiplayer/InvitationEntity;
      int n = 2;
      ((InvitationEntity)localObject1).<init>(n, localGameEntity, str, l, k, localParticipantEntity, localArrayList, i1, 0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\InvitationEntity$InvitationEntityCreatorCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */