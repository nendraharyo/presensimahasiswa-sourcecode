package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public abstract class zzm$zza
  extends Binder
  implements zzm
{
  public static zzm zzbo(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzm)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzm;
        if (bool)
        {
          localObject = (zzm)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/drive/realtime/internal/zzm$zza$zza;
      ((zzm.zza.zza)localObject).<init>(paramIBinder);
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
      localObject2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzn.zza.zzbp(paramParcel1.readStrongBinder());
      zza((String)localObject2, (zzn)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzc.zza.zzbe(paramParcel1.readStrongBinder());
      zza((zzc)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zza((zzo)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzc.zza.zzbe(paramParcel1.readStrongBinder());
      zzb((zzc)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zzb((zzo)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzl.zza.zzbn(paramParcel1.readStrongBinder());
      zza((zzl)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzc.zza.zzbe(paramParcel1.readStrongBinder());
      zzc((zzc)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      i = paramParcel1.readInt();
      Object localObject3 = zzn.zza.zzbp(paramParcel1.readStrongBinder());
      zza((String)localObject2, i, (zzn)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      localObject3 = zzf.zza.zzbh(paramParcel1.readStrongBinder());
      zza((String)localObject2, (String)localObject1, (zzf)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzl.zza.zzbn(paramParcel1.readStrongBinder());
      zza((String)localObject2, (zzl)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = paramParcel1.readString();
      int n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      localObject3 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((String)localObject1, (DataHolder)localObject2, (zzj)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((String)localObject2, (zzj)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzf.zza.zzbh(paramParcel1.readStrongBinder());
      zza((String)localObject2, (zzf)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      localObject3 = zzg.zza.zzbi(paramParcel1.readStrongBinder());
      zza((String)localObject2, (String)localObject1, (zzg)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzl.zza.zzbn(paramParcel1.readStrongBinder());
      zzb((String)localObject2, (zzl)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzn.zza.zzbp(paramParcel1.readStrongBinder());
      zzb((String)localObject2, (zzn)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      i = paramParcel1.readInt();
      localObject3 = paramParcel1.readString();
      Object localObject4 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((String)localObject2, i, (String)localObject3, (zzj)localObject4);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      i = paramParcel1.readInt();
      n = paramParcel1.readInt();
      localObject4 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((String)localObject2, i, n, (zzj)localObject4);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      localObject3 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((String)localObject2, (String)localObject1, (zzj)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzf.zza.zzbh(paramParcel1.readStrongBinder());
      zzb((String)localObject2, (zzf)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzl.zza.zzbn(paramParcel1.readStrongBinder());
      zzc((String)localObject2, (zzl)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = paramParcel1.readString();
      n = paramParcel1.readInt();
      int i1 = paramParcel1.readInt();
      if (i1 != 0) {
        localObject2 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      localObject4 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((String)localObject1, n, (DataHolder)localObject2, (zzj)localObject4);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = paramParcel1.readString();
      n = paramParcel1.readInt();
      i1 = paramParcel1.readInt();
      if (i1 != 0) {
        localObject2 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      localObject4 = zzg.zza.zzbi(paramParcel1.readStrongBinder());
      zza((String)localObject1, n, (DataHolder)localObject2, (zzg)localObject4);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      i = paramParcel1.readInt();
      n = paramParcel1.readInt();
      localObject4 = zzg.zza.zzbi(paramParcel1.readStrongBinder());
      zza((String)localObject2, i, n, (zzg)localObject4);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = paramParcel1.readString();
      n = paramParcel1.readInt();
      localObject4 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      zzj localzzj = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      localObject2 = this;
      zza((String)localObject1, n, (String)localObject4, i2, localzzj);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (BeginCompoundOperationRequest)BeginCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zza((BeginCompoundOperationRequest)localObject2, (zzo)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((EndCompoundOperationRequest)localObject2, (zzj)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((zzj)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zzb((zzj)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzc.zza.zzbe(paramParcel1.readStrongBinder());
      zzd((zzc)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzc.zza.zzbe(paramParcel1.readStrongBinder());
      zze((zzc)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {
        j = m;
      }
      for (;;)
      {
        localObject1 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
        zza(j, (zzo)localObject1);
        paramParcel2.writeNoException();
        break;
        k = 0;
        localObject2 = null;
      }
      localObject2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject2);
      int k = paramParcel1.readInt();
      localObject1 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zza(k, (zzo)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzn.zza.zzbp(paramParcel1.readStrongBinder());
      zza((ParcelableIndexReference)localObject2, (zzn)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzk.zza.zzbm(paramParcel1.readStrongBinder());
      zza((String)localObject2, (zzk)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      i = paramParcel1.readInt();
      localObject3 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zza((String)localObject2, i, (zzo)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzl.zza.zzbn(paramParcel1.readStrongBinder());
      zzb((zzl)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      localObject1 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza(k, (zzj)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zze.zza.zzbg(paramParcel1.readStrongBinder());
      zza((zze)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzd.zza.zzbf(paramParcel1.readStrongBinder());
      zza((zzd)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzi.zza.zzbk(paramParcel1.readStrongBinder());
      zza((zzi)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzh.zza.zzbj(paramParcel1.readStrongBinder());
      zza((zzh)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zza((String)localObject2, (zzo)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zzb((String)localObject2, (zzo)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      localObject3 = zzf.zza.zzbh(paramParcel1.readStrongBinder());
      zzb((String)localObject2, (String)localObject1, (zzf)localObject3);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject1 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      i1 = paramParcel1.readInt();
      if (i1 != 0) {
        localObject2 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      localObject4 = zzj.zza.zzbl(paramParcel1.readStrongBinder());
      zza((String)localObject1, (String)localObject3, (DataHolder)localObject2, (zzj)localObject4);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject2);
      zztT();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (DriveId)DriveId.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zza((DriveId)localObject2, (zzo)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zzc((zzo)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.drive.realtime.internal.IRealtimeService";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject1 = zzo.zza.zzbq(paramParcel1.readStrongBinder());
      zza((EndCompoundOperationRequest)localObject2, (zzo)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.readString();
      localObject2 = zzf((String)localObject2, (String)localObject3, (String)localObject4);
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(m);
        ((ParcelableEventList)localObject2).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzm$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */