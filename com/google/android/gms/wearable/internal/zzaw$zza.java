package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import java.util.List;

public abstract class zzaw$zza
  extends Binder
  implements zzaw
{
  public zzaw$zza()
  {
    attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
  }
  
  public static zzaw zzet(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzaw)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzaw;
        if (bool)
        {
          localObject = (zzaw)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/wearable/internal/zzaw$zza$zza;
      ((zzaw.zza.zza)localObject).<init>(paramIBinder);
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
      localObject = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzag((DataHolder)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (MessageEventParcelable)MessageEventParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zza((MessageEventParcelable)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zza((NodeParcelable)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((NodeParcelable)localObject);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
      localObject = NodeParcelable.CREATOR;
      localObject = paramParcel1.createTypedArrayList((Parcelable.Creator)localObject);
      onConnectedNodes((List)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zza((AncsNotificationParcelable)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ChannelEventParcelable)ChannelEventParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ChannelEventParcelable)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (CapabilityInfoParcelable)CapabilityInfoParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zza((CapabilityInfoParcelable)localObject);
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableListener";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (AmsEntityUpdateParcelable)AmsEntityUpdateParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zza((AmsEntityUpdateParcelable)localObject);
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */