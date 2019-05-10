package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

public abstract class zzrc$zza
  extends Binder
  implements zzrc
{
  public zzrc$zza()
  {
    attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
  }
  
  public static zzrc zzdU(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzrc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzrc;
        if (bool)
        {
          localObject = (zzrc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzrc$zza$zza;
      ((zzrc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    Object localObject2;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
      for (;;)
      {
        return bool;
        localObject1 = "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks";
        paramParcel2.writeString((String)localObject1);
        bool = i;
        continue;
        localObject1 = "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks";
        paramParcel1.enforceInterface((String)localObject1);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
          localObject2 = localObject1;
          label118:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label164;
          }
        }
        for (localObject1 = (AttestationData)AttestationData.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          zza((Status)localObject2, (AttestationData)localObject1);
          j = i;
          break;
          localObject2 = null;
          break label118;
          label164:
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        localObject1 = paramParcel1.readString();
        zzfI((String)localObject1);
        j = i;
      }
    }
    Object localObject1 = "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks";
    paramParcel1.enforceInterface((String)localObject1);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      localObject2 = localObject1;
      label237:
      j = paramParcel1.readInt();
      if (j == 0) {
        break label283;
      }
    }
    for (localObject1 = (SafeBrowsingData)SafeBrowsingData.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      zza((Status)localObject2, (SafeBrowsingData)localObject1);
      j = i;
      break;
      localObject2 = null;
      break label237;
      label283:
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */