package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.DataSourcesResult;

public abstract class zzoi$zza
  extends Binder
  implements zzoi
{
  public zzoi$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
  }
  
  public static zzoi zzbD(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzoi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzoi;
        if (bool)
        {
          localObject = (zzoi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzoi$zza$zza;
      ((zzoi.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.fitness.internal.IDataSourcesCallback";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.fitness.internal.IDataSourcesCallback";
    paramParcel1.enforceInterface((String)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (DataSourcesResult)DataSourcesResult.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      zza((DataSourcesResult)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzoi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */