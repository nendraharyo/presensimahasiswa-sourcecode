package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.DataStatsResult;

public abstract class zzot$zza
  extends Binder
  implements zzot
{
  public static zzot zzbO(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzot)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IReadStatsCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzot;
        if (bool)
        {
          localObject = (zzot)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzot$zza$zza;
      ((zzot.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.fitness.internal.IReadStatsCallback";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.fitness.internal.IReadStatsCallback";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (DataStatsResult)DataStatsResult.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zza((DataStatsResult)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzot$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */