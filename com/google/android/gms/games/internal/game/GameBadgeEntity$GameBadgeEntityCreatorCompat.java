package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;

final class GameBadgeEntity$GameBadgeEntityCreatorCompat
  extends GameBadgeEntityCreator
{
  public GameBadgeEntity zzen(Parcel paramParcel)
  {
    Object localObject = GameBadgeEntity.zzvC();
    boolean bool = GameBadgeEntity.zzc((Integer)localObject);
    if (!bool)
    {
      localObject = GameBadgeEntity.class.getCanonicalName();
      bool = GameBadgeEntity.zzdG((String)localObject);
      if (!bool) {}
    }
    else
    {
      localObject = super.zzen(paramParcel);
      return (GameBadgeEntity)localObject;
    }
    int i = paramParcel.readInt();
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    localObject = paramParcel.readString();
    if (localObject == null) {}
    for (Uri localUri = null;; localUri = Uri.parse((String)localObject))
    {
      localObject = new com/google/android/gms/games/internal/game/GameBadgeEntity;
      int j = 1;
      ((GameBadgeEntity)localObject).<init>(j, i, str1, str2, localUri);
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\game\GameBadgeEntity$GameBadgeEntityCreatorCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */