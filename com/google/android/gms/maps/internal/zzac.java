package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;

public final class zzac
{
  public static void zza(Bundle paramBundle, String paramString, Parcelable paramParcelable)
  {
    Object localObject = zzac.class.getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject);
    localObject = paramBundle.getBundle("map_state");
    if (localObject == null)
    {
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
    }
    ClassLoader localClassLoader = zzac.class.getClassLoader();
    ((Bundle)localObject).setClassLoader(localClassLoader);
    ((Bundle)localObject).putParcelable(paramString, paramParcelable);
    paramBundle.putBundle("map_state", (Bundle)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */