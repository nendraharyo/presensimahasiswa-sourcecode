package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public static zzf zzdA(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzf;
        if (bool)
        {
          localObject = (zzf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/nearby/messages/internal/zzf$zza$zza;
      ((zzf.zza.zza)localObject).<init>(paramIBinder);
    }
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
      localObject = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (PublishRequest)PublishRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((PublishRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (UnpublishRequest)UnpublishRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((UnpublishRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SubscribeRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((UnsubscribeRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      localObject = paramParcel1.readString();
      zzfB((String)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetPermissionStatusRequest)GetPermissionStatusRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetPermissionStatusRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (RegisterStatusCallbackRequest)RegisterStatusCallbackRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((RegisterStatusCallbackRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (HandleClientLifecycleEventRequest)HandleClientLifecycleEventRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((HandleClientLifecycleEventRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */