package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

public abstract class zzax$zza
  extends Binder
  implements zzax
{
  public static zzax zzeu(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzax)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzax;
        if (bool)
        {
          localObject = (zzax)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/wearable/internal/zzax$zza$zza;
      ((zzax.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      localObject2 = "com.google.android.gms.wearable.internal.IWearableService";
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      int n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (ConnectionConfiguration)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zza((zzav)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zza((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zzb((zzav)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zzc((zzav)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (PutDataRequest)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (Uri)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzb((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((zzav)localObject1, (Uri)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      n = paramParcel1.readInt();
      zza((zzav)localObject1, (Uri)localObject2, n);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      zzc((zzav)localObject1, (Uri)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      n = paramParcel1.readInt();
      zzb((zzav)localObject1, (Uri)localObject2, n);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      Object localObject3 = paramParcel1.readString();
      Object localObject4 = paramParcel1.createByteArray();
      zza((zzav)localObject2, (String)localObject1, (String)localObject3, (byte[])localObject4);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (Asset)Asset.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (Asset)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzc((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzd((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      n = paramParcel1.readInt();
      zza((zzav)localObject2, (String)localObject1, n);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      zza((zzav)localObject2, i);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zzd((zzav)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zze((zzav)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (AddListenerRequest)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (RemoveListenerRequest)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zze((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzf((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzg((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzh((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (AncsNotificationParcelable)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      zzb((zzav)localObject2, i);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      zzc((zzav)localObject2, i);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzi((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      zza((zzav)localObject2, (String)localObject1, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zzf((zzav)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      n = paramParcel1.readInt();
      zzb((zzav)localObject2, (String)localObject1, n);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = zzau.zza.zzer(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      zza((zzav)localObject2, (zzau)localObject1, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject1 = zzau.zza.zzer(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      zzb((zzav)localObject2, (zzau)localObject1, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      if (i1 != 0) {
        localObject2 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);
      }
      zza((zzav)localObject1, (String)localObject3, (ParcelFileDescriptor)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      i1 = paramParcel1.readInt();
      if (i1 != 0) {
        localObject2 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);
      }
      for (localObject4 = localObject2;; localObject4 = null)
      {
        long l1 = paramParcel1.readLong();
        long l2 = paramParcel1.readLong();
        localObject2 = this;
        zza((zzav)localObject1, (String)localObject3, (ParcelFileDescriptor)localObject4, l1, l2);
        paramParcel2.writeNoException();
        break;
        i1 = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzj((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = paramParcel1.readStrongBinder();
      localObject3 = zzav.zza.zzes((IBinder)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {
        j = m;
      }
      for (;;)
      {
        zza((zzav)localObject3, j);
        paramParcel2.writeNoException();
        break;
        int k = 0;
        localObject2 = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzk((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        i = m;
      }
      zzb((zzav)localObject2, i);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzl((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzm((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      byte b = paramParcel1.readByte();
      zza((zzav)localObject2, b);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject1 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((zzav)localObject1, (ConnectionConfiguration)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzn((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzo((zzav)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      localObject2 = zzav.zza.zzes(paramParcel1.readStrongBinder());
      zzp((zzav)localObject2);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzax$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */