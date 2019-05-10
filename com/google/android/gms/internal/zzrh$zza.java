package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

public abstract class zzrh$zza
  extends Binder
  implements zzrh
{
  public zzrh$zza()
  {
    attachInterface(this, "com.google.android.gms.search.internal.ISearchAuthCallbacks");
  }
  
  public static zzrh zzdX(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzrh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzrh;
        if (bool)
        {
          localObject = (zzrh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzrh$zza$zza;
      ((zzrh.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject1 = "com.google.android.gms.search.internal.ISearchAuthCallbacks";
        paramParcel2.writeString((String)localObject1);
      }
    case 1: 
      localObject1 = "com.google.android.gms.search.internal.ISearchAuthCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      Object localObject2;
      if (j != 0)
      {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject2 = localObject1;
        label110:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label156;
        }
      }
      for (localObject1 = (GoogleNowAuthState)GoogleNowAuthState.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((Status)localObject2, (GoogleNowAuthState)localObject1);
        j = i;
        break;
        localObject2 = null;
        break label110;
        label156:
        j = 0;
      }
    }
    Object localObject1 = "com.google.android.gms.search.internal.ISearchAuthCallbacks";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zzbj((Status)localObject1);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */