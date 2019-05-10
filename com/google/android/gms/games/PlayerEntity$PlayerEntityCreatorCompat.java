package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class PlayerEntity$PlayerEntityCreatorCompat
  extends PlayerEntityCreator
{
  public PlayerEntity zzeb(Parcel paramParcel)
  {
    Object localObject = PlayerEntity.zzvC();
    boolean bool1 = PlayerEntity.zzc((Integer)localObject);
    if (!bool1)
    {
      localObject = PlayerEntity.class.getCanonicalName();
      bool1 = PlayerEntity.zzdG((String)localObject);
      if (!bool1) {}
    }
    else
    {
      localObject = super.zzeb(paramParcel);
      return (PlayerEntity)localObject;
    }
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    localObject = paramParcel.readString();
    String str3 = paramParcel.readString();
    Uri localUri1;
    if (localObject == null)
    {
      localUri1 = null;
      label66:
      if (str3 != null) {
        break label158;
      }
    }
    label158:
    for (Uri localUri2 = null;; localUri2 = Uri.parse(str3))
    {
      long l1 = paramParcel.readLong();
      String str4 = paramParcel.readString();
      String str5 = paramParcel.readString();
      int i = -1;
      long l2 = -1;
      boolean bool2 = true;
      localObject = new com/google/android/gms/games/PlayerEntity;
      int j = 13;
      ((PlayerEntity)localObject).<init>(j, str1, str2, localUri1, localUri2, l1, i, l2, null, null, null, null, null, bool2, false, str4, str5, null, null, null, null);
      break;
      localUri1 = Uri.parse((String)localObject);
      break label66;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerEntity$PlayerEntityCreatorCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */