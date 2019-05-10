package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class GameEntity$GameEntityCreatorCompat
  extends GameEntityCreator
{
  public GameEntity zzea(Parcel paramParcel)
  {
    Object localObject = GameEntity.zzvC();
    boolean bool1 = GameEntity.zzc((Integer)localObject);
    if (!bool1)
    {
      localObject = GameEntity.class.getCanonicalName();
      bool1 = GameEntity.zzdG((String)localObject);
      if (!bool1) {}
    }
    else
    {
      localObject = super.zzea(paramParcel);
      return (GameEntity)localObject;
    }
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    String str3 = paramParcel.readString();
    String str4 = paramParcel.readString();
    String str5 = paramParcel.readString();
    String str6 = paramParcel.readString();
    localObject = paramParcel.readString();
    Uri localUri1;
    label84:
    Uri localUri2;
    label96:
    Uri localUri3;
    label108:
    boolean bool2;
    if (localObject == null)
    {
      localUri1 = null;
      localObject = paramParcel.readString();
      if (localObject != null) {
        break label222;
      }
      localUri2 = null;
      localObject = paramParcel.readString();
      if (localObject != null) {
        break label231;
      }
      localUri3 = null;
      int i = paramParcel.readInt();
      if (i <= 0) {
        break label240;
      }
      bool2 = true;
      label120:
      i = paramParcel.readInt();
      if (i <= 0) {
        break label246;
      }
    }
    label222:
    label231:
    label240:
    label246:
    for (boolean bool3 = true;; bool3 = false)
    {
      String str7 = paramParcel.readString();
      int j = paramParcel.readInt();
      int k = paramParcel.readInt();
      int m = paramParcel.readInt();
      localObject = new com/google/android/gms/games/GameEntity;
      int n = 7;
      ((GameEntity)localObject).<init>(n, str1, str2, str3, str4, str5, str6, localUri1, localUri2, localUri3, bool2, bool3, str7, j, k, m, false, false, null, null, null, false, false, false, null, false);
      break;
      localUri1 = Uri.parse((String)localObject);
      break label84;
      localUri2 = Uri.parse((String)localObject);
      break label96;
      localUri3 = Uri.parse((String)localObject);
      break label108;
      bool2 = false;
      break label120;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\GameEntity$GameEntityCreatorCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */