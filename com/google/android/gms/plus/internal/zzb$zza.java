package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.internal.model.people.zza;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public zzb$zza()
  {
    attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
  }
  
  public static zzb zzdP(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzb;
        if (bool)
        {
          localObject = (zzb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/plus/internal/zzb$zza$zza;
      ((zzb.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      for (;;)
      {
        return bool;
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel2.writeString((String)localObject2);
        bool = i;
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel1.enforceInterface((String)localObject2);
        int k = paramParcel1.readInt();
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          localObject3 = localObject2;
          label180:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label235;
          }
        }
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza(k, (Bundle)localObject3, (Bundle)localObject2);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label180;
          label235:
          j = 0;
        }
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          localObject3 = localObject2;
          label289:
          j = paramParcel1.readInt();
          if (j == 0) {
            break label344;
          }
        }
        for (localObject2 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza(k, (Bundle)localObject3, (ParcelFileDescriptor)localObject2);
          paramParcel2.writeNoException();
          j = i;
          break;
          m = 0;
          localObject3 = null;
          break label289;
          label344:
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        localObject2 = paramParcel1.readString();
        zzfE((String)localObject2);
        paramParcel2.writeNoException();
        j = i;
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = DataHolder.CREATOR;
          localObject1 = ((com.google.android.gms.common.data.zze)localObject2).zzak(paramParcel1);
        }
        localObject2 = paramParcel1.readString();
        zza((DataHolder)localObject1, (String)localObject2);
        paramParcel2.writeNoException();
        j = i;
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel1.enforceInterface((String)localObject2);
        int m = paramParcel1.readInt();
        j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          k = paramParcel1.readInt();
          if (k != 0) {
            localObject1 = SafeParcelResponse.CREATOR.zzaE(paramParcel1);
          }
          zza(m, (Bundle)localObject2, (SafeParcelResponse)localObject1);
          paramParcel2.writeNoException();
          j = i;
          break;
          j = 0;
        }
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = DataHolder.CREATOR;
          localObject1 = ((com.google.android.gms.common.data.zze)localObject2).zzak(paramParcel1);
        }
        localObject2 = paramParcel1.readString();
        Object localObject3 = paramParcel1.readString();
        zza((DataHolder)localObject1, (String)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        j = i;
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel1.enforceInterface((String)localObject2);
        m = paramParcel1.readInt();
        j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zzi(m, (Bundle)localObject2);
          paramParcel2.writeNoException();
          j = i;
          break;
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        localObject2 = paramParcel1.readString();
        zzfF((String)localObject2);
        paramParcel2.writeNoException();
        j = i;
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
        paramParcel1.enforceInterface((String)localObject2);
        j = paramParcel1.readInt();
        m = paramParcel1.readInt();
        if (m != 0)
        {
          localObject3 = PersonEntity.CREATOR;
          localObject1 = ((zza)localObject3).zzgE(paramParcel1);
        }
        zza(j, (PersonEntity)localObject1);
        paramParcel2.writeNoException();
        j = i;
      }
    }
    Object localObject2 = "com.google.android.gms.plus.internal.IPlusCallbacks";
    paramParcel1.enforceInterface((String)localObject2);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
    {
      zzbe((Status)localObject2);
      paramParcel2.writeNoException();
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */