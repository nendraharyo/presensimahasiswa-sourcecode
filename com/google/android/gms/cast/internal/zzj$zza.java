package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;

public abstract class zzj$zza
  extends Binder
  implements zzj
{
  public zzj$zza()
  {
    attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool2;
      localObject2 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel2.writeString((String)localObject2);
      continue;
      localObject2 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      zzbk(j);
      continue;
      String str1 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface(str1);
      int k = paramParcel1.readInt();
      if (k != 0) {
        localObject2 = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(paramParcel1);
      }
      str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      if (m != 0) {
        bool1 = bool2;
      }
      zza((ApplicationMetadata)localObject2, str1, str2, bool1);
      continue;
      localObject2 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      zzbl(j);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      localObject2 = paramParcel1.readString();
      double d = paramParcel1.readDouble();
      k = paramParcel1.readInt();
      if (k != 0) {
        bool1 = bool2;
      }
      zza((String)localObject2, d, bool1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      zzt((String)localObject2, (String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.createByteArray();
      zzb((String)localObject2, (byte[])localObject1);
      continue;
      localObject2 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      zzbn(j);
      continue;
      localObject2 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      zzbm(j);
      continue;
      localObject2 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      onApplicationDisconnected(j);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      localObject2 = paramParcel1.readString();
      long l = paramParcel1.readLong();
      int i = paramParcel1.readInt();
      zza((String)localObject2, l, i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      localObject2 = paramParcel1.readString();
      l = paramParcel1.readLong();
      zzc((String)localObject2, l);
      continue;
      localObject1 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (ApplicationStatus)ApplicationStatus.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((ApplicationStatus)localObject2);
      continue;
      localObject1 = "com.google.android.gms.cast.internal.ICastDeviceControllerListener";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (DeviceStatus)DeviceStatus.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((DeviceStatus)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */