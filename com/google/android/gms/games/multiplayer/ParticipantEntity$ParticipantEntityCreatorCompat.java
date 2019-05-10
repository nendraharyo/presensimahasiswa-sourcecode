package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.PlayerEntity;

final class ParticipantEntity$ParticipantEntityCreatorCompat
  extends ParticipantEntityCreator
{
  public ParticipantEntity zzes(Parcel paramParcel)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = ParticipantEntity.zzvC();
    boolean bool = ParticipantEntity.zzc((Integer)localObject1);
    Object localObject2;
    if (!bool)
    {
      localObject1 = ParticipantEntity.class.getCanonicalName();
      bool = ParticipantEntity.zzdG((String)localObject1);
      if (!bool) {}
    }
    else
    {
      localObject2 = super.zzes(paramParcel);
      return (ParticipantEntity)localObject2;
    }
    localObject1 = paramParcel.readString();
    String str1 = paramParcel.readString();
    Object localObject3 = paramParcel.readString();
    label76:
    Object localObject4;
    label90:
    int k;
    String str2;
    int m;
    label116:
    int i1;
    label127:
    int i2;
    if (localObject3 == null)
    {
      localObject3 = null;
      localObject4 = paramParcel.readString();
      if (localObject4 != null) {
        break label200;
      }
      localObject4 = null;
      k = paramParcel.readInt();
      str2 = paramParcel.readString();
      m = paramParcel.readInt();
      if (m <= 0) {
        break label210;
      }
      m = i;
      i1 = paramParcel.readInt();
      if (i1 <= 0) {
        break label216;
      }
      i2 = 7;
      if (i == 0) {
        break label224;
      }
      localObject2 = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(paramParcel);
    }
    for (Object localObject5 = localObject2;; localObject5 = null)
    {
      localObject2 = new com/google/android/gms/games/multiplayer/ParticipantEntity;
      j = 3;
      ((ParticipantEntity)localObject2).<init>(j, (String)localObject1, str1, (Uri)localObject3, (Uri)localObject4, k, str2, m, (PlayerEntity)localObject5, i2, null, null, null);
      break;
      localObject3 = Uri.parse((String)localObject3);
      break label76;
      label200:
      localObject4 = Uri.parse((String)localObject4);
      break label90;
      label210:
      int n = 0;
      break label116;
      label216:
      i = 0;
      localObject2 = null;
      break label127;
      label224:
      i1 = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantEntity$ParticipantEntityCreatorCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */