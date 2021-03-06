package com.google.android.gms.location.places.personalized;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public static zza zzcr(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zza)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zza;
        if (bool)
        {
          localObject = (zza)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/location/places/personalized/zza$zza$zza;
      ((zza.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (PlaceAliasResult)PlaceAliasResult.CREATOR.createFromParcel(paramParcel1);
      }
      zza((PlaceAliasResult)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (PlaceAliasResult)PlaceAliasResult.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((PlaceAliasResult)localObject);
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\personalized\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */