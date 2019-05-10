package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.internal.request.GameRequestClusterCreator;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.video.VideoConfiguration;
import java.util.List;

public abstract class IGamesService$Stub
  extends Binder
  implements IGamesService
{
  public IGamesService$Stub()
  {
    attachInterface(this, "com.google.android.gms.games.internal.IGamesService");
  }
  
  public static IGamesService zzbY(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IGamesService)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IGamesService;
        if (bool)
        {
          localObject = (IGamesService)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/games/internal/IGamesService$Stub$Proxy;
      ((IGamesService.Stub.Proxy)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int k = 0;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      Object localObject2 = "com.google.android.gms.games.internal.IGamesService";
      paramParcel2.writeString((String)localObject2);
      continue;
      localObject2 = "com.google.android.gms.games.internal.IGamesService";
      paramParcel1.enforceInterface((String)localObject2);
      long l1 = paramParcel1.readLong();
      zzF(l1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
      zza((IGamesCallbacks)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = zzwK();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject2 = zzoi();
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(m);
        ((Bundle)localObject2).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject2 = "com.google.android.gms.games.internal.IGamesService";
        paramParcel1.enforceInterface((String)localObject2);
        Object localObject3 = paramParcel1.readStrongBinder();
        int n = paramParcel1.readInt();
        if (n != 0) {}
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza((IBinder)localObject3, (Bundle)localObject2);
          paramParcel2.writeNoException();
          break;
          n = 0;
        }
        localObject2 = "com.google.android.gms.games.internal.IGamesService";
        paramParcel1.enforceInterface((String)localObject2);
        zzwR();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = zzww();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = paramParcel1.readString();
        localObject2 = zzdK((String)localObject2);
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        zzE((String)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = zzwT();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = zzwU();
        paramParcel2.writeNoException();
        if (localObject2 != null)
        {
          paramParcel2.writeInt(m);
          ((DataHolder)localObject2).writeToParcel(paramParcel2, m);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zza((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          int i11 = paramParcel1.readInt();
          n = paramParcel1.readInt();
          if (n != 0) {
            n = m;
          }
          for (;;)
          {
            i12 = paramParcel1.readInt();
            if (i12 != 0) {
              k = m;
            }
            zza((IGamesCallbacks)localObject3, i11, n, k);
            paramParcel2.writeNoException();
            break;
            i1 = 0;
            localObject2 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          long l2 = paramParcel1.readLong();
          zza((IGamesCallbacks)localObject2, (String)localObject3, l2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          zzb((IGamesCallbacks)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zzb((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          Object localObject4 = paramParcel1.readString();
          int i12 = paramParcel1.readInt();
          int i13 = paramParcel1.readInt();
          int i17 = paramParcel1.readInt();
          int i1 = paramParcel1.readInt();
          if (i1 != 0) {
            bool1 = m;
          }
          for (;;)
          {
            localObject2 = this;
            zza((IGamesCallbacks)localObject3, (String)localObject4, i12, i13, i17, bool1);
            paramParcel2.writeNoException();
            break;
            bool1 = false;
            localObject1 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject4 = paramParcel1.readString();
          i12 = paramParcel1.readInt();
          i13 = paramParcel1.readInt();
          i17 = paramParcel1.readInt();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {
            bool1 = m;
          }
          for (;;)
          {
            localObject2 = this;
            zzb((IGamesCallbacks)localObject3, (String)localObject4, i12, i13, i17, bool1);
            paramParcel2.writeNoException();
            break;
            bool1 = false;
            localObject1 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          i1 = paramParcel1.readInt();
          if (i1 != 0) {}
          for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
          {
            i11 = paramParcel1.readInt();
            i12 = paramParcel1.readInt();
            zza((IGamesCallbacks)localObject3, (Bundle)localObject2, i11, i12);
            paramParcel2.writeNoException();
            break;
            i1 = 0;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          zzc((IGamesCallbacks)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject4 = paramParcel1.readString();
          Object localObject5 = paramParcel1.readStrongBinder();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {}
          for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
          {
            zza((IGamesCallbacks)localObject3, (String)localObject4, (IBinder)localObject5, (Bundle)localObject2);
            paramParcel2.writeNoException();
            break;
            i1 = 0;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject4 = paramParcel1.readString();
          localObject5 = paramParcel1.readStrongBinder();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {}
          for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
          {
            zzb((IGamesCallbacks)localObject3, (String)localObject4, (IBinder)localObject5, (Bundle)localObject2);
            paramParcel2.writeNoException();
            break;
            i1 = 0;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject4 = paramParcel1.readString();
          i12 = paramParcel1.readInt();
          Object localObject6 = paramParcel1.readStrongBinder();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          for (Object localObject7 = localObject2;; localObject7 = null)
          {
            localObject2 = this;
            zza((IGamesCallbacks)localObject3, (String)localObject4, i12, (IBinder)localObject6, (Bundle)localObject7);
            paramParcel2.writeNoException();
            break;
            i17 = 0;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          zzd((IGamesCallbacks)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          zze((IGamesCallbacks)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readString();
          int i22 = paramParcel1.readInt();
          zzr((String)localObject2, i22);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readString();
          i22 = paramParcel1.readInt();
          zzq((String)localObject2, i22);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          l2 = paramParcel1.readLong();
          zza((IGamesCallbacks)localObject2, l2);
          paramParcel2.writeNoException();
          continue;
          localObject2 = "com.google.android.gms.games.internal.IGamesService";
          paramParcel1.enforceInterface((String)localObject2);
          l1 = paramParcel1.readLong();
          zzG(l1);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject4 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject5 = paramParcel1.readStrongBinder();
          i13 = paramParcel1.readInt();
          localObject7 = paramParcel1.createStringArray();
          i1 = paramParcel1.readInt();
          if (i1 != 0)
          {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            localObject1 = localObject2;
          }
          i1 = paramParcel1.readInt();
          if (i1 != 0) {
            k = m;
          }
          long l3 = paramParcel1.readLong();
          localObject3 = this;
          zza((IGamesCallbacks)localObject4, (IBinder)localObject5, i13, (String[])localObject7, (Bundle)localObject1, k, l3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject4 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject5 = paramParcel1.readStrongBinder();
          localObject6 = paramParcel1.readString();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {
            i17 = m;
          }
          for (;;)
          {
            long l4 = paramParcel1.readLong();
            localObject3 = this;
            zza((IGamesCallbacks)localObject4, (IBinder)localObject5, (String)localObject6, i17, l4);
            paramParcel2.writeNoException();
            break;
            i18 = 0;
            localObject7 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zzc((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.createByteArray();
          localObject4 = paramParcel1.readString();
          localObject5 = paramParcel1.readString();
          i1 = zza((IGamesCallbacks)localObject2, (byte[])localObject3, (String)localObject4, (String)localObject5);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(i1);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.createByteArray();
          localObject3 = paramParcel1.readString();
          localObject4 = paramParcel1.createStringArray();
          i1 = zzb((byte[])localObject2, (String)localObject3, (String[])localObject4);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(i1);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readString();
          localObject2 = zzdL((String)localObject2);
          paramParcel2.writeNoException();
          paramParcel2.writeString((String)localObject2);
          continue;
          localObject2 = "com.google.android.gms.games.internal.IGamesService";
          paramParcel1.enforceInterface((String)localObject2);
          i1 = paramParcel1.readInt();
          zzgt(i1);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zzd((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          localObject4 = paramParcel1.readString();
          zza((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject4 = paramParcel1.readString();
          localObject5 = paramParcel1.readString();
          i13 = paramParcel1.readInt();
          int i18 = paramParcel1.readInt();
          int i = paramParcel1.readInt();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {
            k = m;
          }
          localObject2 = this;
          zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, i13, i18, i, k);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject4 = paramParcel1.readString();
          localObject5 = paramParcel1.readString();
          i13 = paramParcel1.readInt();
          i18 = paramParcel1.readInt();
          i = paramParcel1.readInt();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {
            k = m;
          }
          localObject2 = this;
          zzb((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, i13, i18, i, k);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          localObject4 = paramParcel1.readString();
          zzb((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zze((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zzf((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          i11 = paramParcel1.readInt();
          i12 = paramParcel1.readInt();
          i1 = paramParcel1.readInt();
          if (i1 != 0)
          {
            i13 = m;
            label3991:
            i1 = paramParcel1.readInt();
            if (i1 == 0) {
              break label4039;
            }
            i18 = m;
          }
          boolean bool6;
          label4039:
          boolean bool9;
          for (;;)
          {
            localObject2 = this;
            zza((IGamesCallbacks)localObject3, i11, i12, i13, i18);
            paramParcel2.writeNoException();
            break;
            bool6 = false;
            localObject6 = null;
            break label3991;
            bool9 = false;
            localObject7 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          localObject4 = paramParcel1.readString();
          i12 = paramParcel1.readInt();
          i1 = paramParcel1.readInt();
          if (i1 != 0)
          {
            bool6 = m;
            label4094:
            i1 = paramParcel1.readInt();
            if (i1 == 0) {
              break label4142;
            }
            bool9 = m;
          }
          for (;;)
          {
            localObject2 = this;
            zza((IGamesCallbacks)localObject3, (String)localObject4, i12, bool6, bool9);
            paramParcel2.writeNoException();
            break;
            bool6 = false;
            localObject6 = null;
            break label4094;
            label4142:
            bool9 = false;
            localObject7 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          i11 = paramParcel1.readInt();
          i1 = paramParcel1.readInt();
          if (i1 != 0) {
            i1 = m;
          }
          for (;;)
          {
            i12 = paramParcel1.readInt();
            if (i12 != 0) {
              k = m;
            }
            zzb((IGamesCallbacks)localObject3, i11, i1, k);
            paramParcel2.writeNoException();
            break;
            i2 = 0;
            localObject2 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          zzf((IGamesCallbacks)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readStrongBinder();
          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
          i11 = paramParcel1.readInt();
          int i2 = paramParcel1.readInt();
          if (i2 != 0) {
            i2 = m;
          }
          int i3;
          for (;;)
          {
            i12 = paramParcel1.readInt();
            if (i12 != 0) {
              k = m;
            }
            zzc((IGamesCallbacks)localObject3, i11, i2, k);
            paramParcel2.writeNoException();
            break;
            i3 = 0;
            localObject2 = null;
          }
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          zzg((IGamesCallbacks)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readString();
          zzdM((String)localObject2);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = paramParcel1.readString();
          localObject3 = paramParcel1.readString();
          i11 = paramParcel1.readInt();
          zzd((String)localObject2, (String)localObject3, i11);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          zzg((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
          localObject3 = paramParcel1.readString();
          localObject2 = zzh((IGamesCallbacks)localObject2, (String)localObject3);
          paramParcel2.writeNoException();
          if (localObject2 != null)
          {
            paramParcel2.writeInt(m);
            ((RoomEntity)localObject2).writeToParcel(paramParcel2, m);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = paramParcel1.readString();
            i3 = zzdN((String)localObject2);
            paramParcel2.writeNoException();
            paramParcel2.writeInt(i3);
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
            localObject3 = paramParcel1.readString();
            i11 = paramParcel1.readInt();
            if (i11 != 0) {
              k = m;
            }
            zza((IGamesCallbacks)localObject2, (String)localObject3, k);
            paramParcel2.writeNoException();
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
            localObject3 = paramParcel1.readString();
            zzi((IGamesCallbacks)localObject2, (String)localObject3);
            paramParcel2.writeNoException();
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = paramParcel1.readString();
            i22 = paramParcel1.readInt();
            zzt((String)localObject2, i22);
            paramParcel2.writeNoException();
            continue;
            localObject2 = "com.google.android.gms.games.internal.IGamesService";
            paramParcel1.enforceInterface((String)localObject2);
            boolean bool4 = zzwV();
            paramParcel2.writeNoException();
            if (bool4) {
              k = m;
            }
            paramParcel2.writeInt(k);
            continue;
            localObject2 = "com.google.android.gms.games.internal.IGamesService";
            paramParcel1.enforceInterface((String)localObject2);
            int i4 = paramParcel1.readInt();
            if (i4 != 0) {
              k = m;
            }
            zzai(k);
            paramParcel2.writeNoException();
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
            zzh((IGamesCallbacks)localObject2);
            paramParcel2.writeNoException();
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
            localObject3 = paramParcel1.readString();
            zzj((IGamesCallbacks)localObject2, (String)localObject3);
            paramParcel2.writeNoException();
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
            zzi((IGamesCallbacks)localObject2);
            paramParcel2.writeNoException();
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = paramParcel1.readStrongBinder();
            localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
            i4 = paramParcel1.readInt();
            if (i4 != 0) {
              k = m;
            }
            i4 = paramParcel1.readInt();
            if (i4 != 0) {}
            for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
            {
              zza((IGamesCallbacks)localObject3, k, (Bundle)localObject2);
              paramParcel2.writeNoException();
              break;
              i4 = 0;
            }
            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            localObject2 = paramParcel1.readString();
            localObject2 = zzdO((String)localObject2);
            paramParcel2.writeNoException();
            if (localObject2 != null)
            {
              paramParcel2.writeInt(m);
              ((Uri)localObject2).writeToParcel(paramParcel2, m);
            }
            else
            {
              paramParcel2.writeInt(0);
              continue;
              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
              localObject2 = paramParcel1.readStrongBinder();
              localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
              localObject4 = paramParcel1.readString();
              i12 = paramParcel1.readInt();
              i4 = paramParcel1.readInt();
              if (i4 != 0)
              {
                bool6 = m;
                label5048:
                i4 = paramParcel1.readInt();
                if (i4 == 0) {
                  break label5096;
                }
                bool9 = m;
              }
              for (;;)
              {
                localObject2 = this;
                zzb((IGamesCallbacks)localObject3, (String)localObject4, i12, bool6, bool9);
                paramParcel2.writeNoException();
                break;
                bool6 = false;
                localObject6 = null;
                break label5048;
                label5096:
                bool9 = false;
                localObject7 = null;
              }
              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
              localObject2 = zzwW();
              paramParcel2.writeNoException();
              if (localObject2 != null)
              {
                paramParcel2.writeInt(m);
                ((DataHolder)localObject2).writeToParcel(paramParcel2, m);
              }
              else
              {
                paramParcel2.writeInt(0);
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                i22 = paramParcel1.readInt();
                if (i22 != 0) {
                  k = m;
                }
                zza((IGamesCallbacks)localObject2, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                localObject4 = paramParcel1.readString();
                i12 = paramParcel1.readInt();
                if (i12 != 0) {
                  k = m;
                }
                zza((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readStrongBinder();
                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                i11 = paramParcel1.readInt();
                i4 = paramParcel1.readInt();
                if (i4 != 0) {
                  i4 = m;
                }
                for (;;)
                {
                  i12 = paramParcel1.readInt();
                  if (i12 != 0) {
                    k = m;
                  }
                  zzd((IGamesCallbacks)localObject3, i11, i4, k);
                  paramParcel2.writeNoException();
                  break;
                  i5 = 0;
                  localObject2 = null;
                }
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readStrongBinder();
                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                i11 = paramParcel1.readInt();
                int i5 = paramParcel1.readInt();
                if (i5 != 0) {
                  i5 = m;
                }
                for (;;)
                {
                  i12 = paramParcel1.readInt();
                  if (i12 != 0) {
                    k = m;
                  }
                  zze((IGamesCallbacks)localObject3, i11, i5, k);
                  paramParcel2.writeNoException();
                  break;
                  i6 = 0;
                  localObject2 = null;
                }
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readStrongBinder();
                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                localObject4 = paramParcel1.readString();
                i12 = paramParcel1.readInt();
                int i6 = paramParcel1.readInt();
                if (i6 != 0)
                {
                  bool6 = m;
                  label5469:
                  i6 = paramParcel1.readInt();
                  if (i6 == 0) {
                    break label5551;
                  }
                  bool9 = m;
                  label5484:
                  i6 = paramParcel1.readInt();
                  if (i6 == 0) {
                    break label5560;
                  }
                  i = m;
                }
                label5551:
                label5560:
                boolean bool2;
                for (;;)
                {
                  i6 = paramParcel1.readInt();
                  if (i6 != 0) {
                    k = m;
                  }
                  localObject2 = this;
                  zza((IGamesCallbacks)localObject3, (String)localObject4, i12, bool6, bool9, i, k);
                  paramParcel2.writeNoException();
                  break;
                  bool6 = false;
                  localObject6 = null;
                  break label5469;
                  bool9 = false;
                  localObject7 = null;
                  break label5484;
                  bool2 = false;
                  localObject1 = null;
                }
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                i11 = paramParcel1.readInt();
                if (i11 != 0) {
                  k = m;
                }
                zzb((IGamesCallbacks)localObject2, (String)localObject3, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                i22 = paramParcel1.readInt();
                if (i22 != 0) {
                  k = m;
                }
                zzb((IGamesCallbacks)localObject2, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                i11 = paramParcel1.readInt();
                if (i11 != 0) {
                  k = m;
                }
                zzc((IGamesCallbacks)localObject2, (String)localObject3, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                i11 = paramParcel1.readInt();
                if (i11 != 0) {
                  k = m;
                }
                zzd((IGamesCallbacks)localObject2, (String)localObject3, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                localObject4 = paramParcel1.readString();
                i12 = paramParcel1.readInt();
                if (i12 != 0) {
                  k = m;
                }
                zzb((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4, k);
                paramParcel2.writeNoException();
                continue;
                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                paramParcel1.enforceInterface((String)localObject2);
                i6 = paramParcel1.readInt();
                if (i6 != 0) {}
                for (localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                {
                  localObject2 = zzn((Uri)localObject2);
                  paramParcel2.writeNoException();
                  if (localObject2 == null) {
                    break label5912;
                  }
                  paramParcel2.writeInt(m);
                  ((ParcelFileDescriptor)localObject2).writeToParcel(paramParcel2, m);
                  break;
                  i6 = 0;
                }
                label5912:
                paramParcel2.writeInt(0);
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                zzk((IGamesCallbacks)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readStrongBinder();
                localObject4 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                localObject5 = paramParcel1.readString();
                long l5 = paramParcel1.readLong();
                localObject1 = paramParcel1.readString();
                localObject3 = this;
                zza((IGamesCallbacks)localObject4, (String)localObject5, l5, (String)localObject1);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readStrongBinder();
                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                localObject4 = paramParcel1.readString();
                i12 = paramParcel1.readInt();
                localObject6 = paramParcel1.readStrongBinder();
                i6 = paramParcel1.readInt();
                if (i6 != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                for (localObject7 = localObject2;; localObject7 = null)
                {
                  localObject2 = this;
                  zzb((IGamesCallbacks)localObject3, (String)localObject4, i12, (IBinder)localObject6, (Bundle)localObject7);
                  paramParcel2.writeNoException();
                  break;
                  bool9 = false;
                }
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject3 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject4 = paramParcel1.readString();
                localObject5 = paramParcel1.readString();
                int i14 = paramParcel1.readInt();
                int i19 = paramParcel1.readInt();
                localObject2 = this;
                zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, i14, i19);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readString();
                zzdP((String)localObject2);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.createIntArray();
                zza((IGamesCallbacks)localObject2, (int[])localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readStrongBinder();
                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                i11 = paramParcel1.readInt();
                i12 = paramParcel1.readInt();
                localObject6 = paramParcel1.createStringArray();
                i6 = paramParcel1.readInt();
                if (i6 != 0) {
                  localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
                }
                for (localObject7 = localObject2;; localObject7 = null)
                {
                  localObject2 = this;
                  zza((IGamesCallbacks)localObject3, i11, i12, (String[])localObject6, (Bundle)localObject7);
                  paramParcel2.writeNoException();
                  break;
                  i19 = 0;
                }
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                zzl((IGamesCallbacks)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                zzm((IGamesCallbacks)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject3 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject4 = paramParcel1.readString();
                localObject5 = paramParcel1.createByteArray();
                localObject6 = paramParcel1.readString();
                localObject2 = ParticipantResult.CREATOR;
                localObject7 = (ParticipantResult[])paramParcel1.createTypedArray((Parcelable.Creator)localObject2);
                localObject2 = this;
                zza((IGamesCallbacks)localObject3, (String)localObject4, (byte[])localObject5, (String)localObject6, (ParticipantResult[])localObject7);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject3 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject4 = paramParcel1.readString();
                localObject5 = paramParcel1.createByteArray();
                localObject2 = ParticipantResult.CREATOR;
                localObject2 = (ParticipantResult[])paramParcel1.createTypedArray((Parcelable.Creator)localObject2);
                zza((IGamesCallbacks)localObject3, (String)localObject4, (byte[])localObject5, (ParticipantResult[])localObject2);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                zzn((IGamesCallbacks)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                zzo((IGamesCallbacks)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                localObject4 = paramParcel1.readString();
                zzc((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                l2 = paramParcel1.readLong();
                zzb((IGamesCallbacks)localObject2, l2);
                paramParcel2.writeNoException();
                continue;
                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                paramParcel1.enforceInterface((String)localObject2);
                l1 = paramParcel1.readLong();
                zzH(l1);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                zzp((IGamesCallbacks)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                paramParcel1.enforceInterface((String)localObject2);
                i6 = zzwL();
                paramParcel2.writeNoException();
                paramParcel2.writeInt(i6);
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readString();
                localObject3 = paramParcel1.readString();
                zzF((String)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                localObject4 = paramParcel1.readString();
                zzd((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                localObject4 = paramParcel1.readString();
                zze((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                localObject4 = paramParcel1.createIntArray();
                zza((IGamesCallbacks)localObject2, (String)localObject3, (int[])localObject4);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readString();
                localObject3 = paramParcel1.readString();
                i11 = paramParcel1.readInt();
                zze((String)localObject2, (String)localObject3, i11);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                l2 = paramParcel1.readLong();
                localObject3 = paramParcel1.readString();
                zza((IGamesCallbacks)localObject2, l2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                paramParcel1.enforceInterface((String)localObject2);
                l1 = paramParcel1.readLong();
                localObject4 = paramParcel1.readString();
                zzb(l1, (String)localObject4);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                l2 = paramParcel1.readLong();
                localObject3 = paramParcel1.readString();
                zzb((IGamesCallbacks)localObject2, l2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                paramParcel1.enforceInterface((String)localObject2);
                l1 = paramParcel1.readLong();
                localObject4 = paramParcel1.readString();
                zzc(l1, (String)localObject4);
                paramParcel2.writeNoException();
                continue;
                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                paramParcel1.enforceInterface((String)localObject2);
                zzwX();
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                i11 = paramParcel1.readInt();
                i12 = paramParcel1.readInt();
                if (i12 != 0) {
                  k = m;
                }
                zza((IGamesCallbacks)localObject2, (String)localObject3, i11, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                i22 = paramParcel1.readInt();
                if (i22 != 0) {
                  k = m;
                }
                zzc((IGamesCallbacks)localObject2, k);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = paramParcel1.readStrongBinder();
                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                localObject4 = paramParcel1.readString();
                i12 = paramParcel1.readInt();
                i6 = paramParcel1.readInt();
                if (i6 != 0)
                {
                  i14 = m;
                  label7331:
                  i6 = paramParcel1.readInt();
                  if (i6 == 0) {
                    break label7379;
                  }
                  i19 = m;
                }
                boolean bool7;
                label7379:
                boolean bool10;
                for (;;)
                {
                  localObject2 = this;
                  zzc((IGamesCallbacks)localObject3, (String)localObject4, i12, i14, i19);
                  paramParcel2.writeNoException();
                  break;
                  bool7 = false;
                  localObject6 = null;
                  break label7331;
                  bool10 = false;
                  localObject7 = null;
                }
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                localObject3 = paramParcel1.readString();
                zzq((IGamesCallbacks)localObject2, (String)localObject3);
                paramParcel2.writeNoException();
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                localObject2 = zzwz();
                paramParcel2.writeNoException();
                if (localObject2 != null)
                {
                  paramParcel2.writeInt(m);
                  ((Intent)localObject2).writeToParcel(paramParcel2, m);
                }
                else
                {
                  paramParcel2.writeInt(0);
                  continue;
                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                  localObject2 = paramParcel1.readString();
                  localObject2 = zzdQ((String)localObject2);
                  paramParcel2.writeNoException();
                  if (localObject2 != null)
                  {
                    paramParcel2.writeInt(m);
                    ((Intent)localObject2).writeToParcel(paramParcel2, m);
                  }
                  else
                  {
                    paramParcel2.writeInt(0);
                    continue;
                    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    localObject2 = zzwA();
                    paramParcel2.writeNoException();
                    if (localObject2 != null)
                    {
                      paramParcel2.writeInt(m);
                      ((Intent)localObject2).writeToParcel(paramParcel2, m);
                    }
                    else
                    {
                      paramParcel2.writeInt(0);
                      continue;
                      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                      localObject2 = zzwB();
                      paramParcel2.writeNoException();
                      if (localObject2 != null)
                      {
                        paramParcel2.writeInt(m);
                        ((Intent)localObject2).writeToParcel(paramParcel2, m);
                      }
                      else
                      {
                        paramParcel2.writeInt(0);
                        continue;
                        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                        localObject2 = zzwC();
                        paramParcel2.writeNoException();
                        if (localObject2 != null)
                        {
                          paramParcel2.writeInt(m);
                          ((Intent)localObject2).writeToParcel(paramParcel2, m);
                        }
                        else
                        {
                          paramParcel2.writeInt(0);
                          continue;
                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                          paramParcel1.enforceInterface((String)localObject2);
                          i22 = paramParcel1.readInt();
                          i11 = paramParcel1.readInt();
                          i6 = paramParcel1.readInt();
                          if (i6 != 0) {
                            i6 = m;
                          }
                          for (;;)
                          {
                            localObject2 = zzb(i22, i11, i6);
                            paramParcel2.writeNoException();
                            if (localObject2 == null) {
                              break label7746;
                            }
                            paramParcel2.writeInt(m);
                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                            break;
                            i7 = 0;
                            localObject2 = null;
                          }
                          label7746:
                          paramParcel2.writeInt(0);
                          continue;
                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                          paramParcel1.enforceInterface((String)localObject2);
                          i22 = paramParcel1.readInt();
                          i11 = paramParcel1.readInt();
                          int i7 = paramParcel1.readInt();
                          if (i7 != 0) {
                            i7 = m;
                          }
                          int i8;
                          for (;;)
                          {
                            localObject2 = zzc(i22, i11, i7);
                            paramParcel2.writeNoException();
                            if (localObject2 == null) {
                              break label7838;
                            }
                            paramParcel2.writeInt(m);
                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                            break;
                            i8 = 0;
                            localObject2 = null;
                          }
                          label7838:
                          paramParcel2.writeInt(0);
                          continue;
                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                          localObject2 = zzwH();
                          paramParcel2.writeNoException();
                          if (localObject2 != null)
                          {
                            paramParcel2.writeInt(m);
                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                          }
                          else
                          {
                            paramParcel2.writeInt(0);
                            continue;
                            localObject2 = "com.google.android.gms.games.internal.IGamesService";
                            paramParcel1.enforceInterface((String)localObject2);
                            i8 = paramParcel1.readInt();
                            if (i8 != 0) {}
                            for (localObject2 = (RoomEntity)RoomEntity.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                            {
                              i22 = paramParcel1.readInt();
                              localObject2 = zza((RoomEntity)localObject2, i22);
                              paramParcel2.writeNoException();
                              if (localObject2 == null) {
                                break label7978;
                              }
                              paramParcel2.writeInt(m);
                              ((Intent)localObject2).writeToParcel(paramParcel2, m);
                              break;
                              i8 = 0;
                            }
                            label7978:
                            paramParcel2.writeInt(0);
                            continue;
                            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                            localObject2 = zzwI();
                            paramParcel2.writeNoException();
                            if (localObject2 != null)
                            {
                              paramParcel2.writeInt(m);
                              ((Intent)localObject2).writeToParcel(paramParcel2, m);
                            }
                            else
                            {
                              paramParcel2.writeInt(0);
                              continue;
                              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                              localObject2 = zzwY();
                              paramParcel2.writeNoException();
                              if (localObject2 != null)
                              {
                                paramParcel2.writeInt(m);
                                ((Intent)localObject2).writeToParcel(paramParcel2, m);
                              }
                              else
                              {
                                paramParcel2.writeInt(0);
                                continue;
                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                localObject2 = ParticipantEntity.CREATOR;
                                localObject3 = (ParticipantEntity[])paramParcel1.createTypedArray((Parcelable.Creator)localObject2);
                                localObject4 = paramParcel1.readString();
                                localObject5 = paramParcel1.readString();
                                i8 = paramParcel1.readInt();
                                if (i8 != 0)
                                {
                                  localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                                  localObject6 = localObject2;
                                  label8141:
                                  i8 = paramParcel1.readInt();
                                  if (i8 == 0) {
                                    break label8224;
                                  }
                                  localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                                }
                                for (localObject7 = localObject2;; localObject7 = null)
                                {
                                  localObject2 = this;
                                  localObject2 = zza((ParticipantEntity[])localObject3, (String)localObject4, (String)localObject5, (Uri)localObject6, (Uri)localObject7);
                                  paramParcel2.writeNoException();
                                  if (localObject2 == null) {
                                    break label8233;
                                  }
                                  paramParcel2.writeInt(m);
                                  ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                  break;
                                  bool7 = false;
                                  localObject6 = null;
                                  break label8141;
                                  label8224:
                                  bool10 = false;
                                }
                                label8233:
                                paramParcel2.writeInt(0);
                                continue;
                                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                paramParcel1.enforceInterface((String)localObject2);
                                i8 = zzwJ();
                                paramParcel2.writeNoException();
                                paramParcel2.writeInt(i8);
                                continue;
                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                localObject2 = paramParcel1.readStrongBinder();
                                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                localObject4 = paramParcel1.readString();
                                i12 = paramParcel1.readInt();
                                i8 = paramParcel1.readInt();
                                if (i8 != 0)
                                {
                                  bool7 = m;
                                  label8316:
                                  i8 = paramParcel1.readInt();
                                  if (i8 == 0) {
                                    break label8364;
                                  }
                                  bool10 = m;
                                }
                                for (;;)
                                {
                                  localObject2 = this;
                                  zzd((IGamesCallbacks)localObject3, (String)localObject4, i12, bool7, bool10);
                                  paramParcel2.writeNoException();
                                  break;
                                  bool7 = false;
                                  localObject6 = null;
                                  break label8316;
                                  label8364:
                                  bool10 = false;
                                  localObject7 = null;
                                }
                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                localObject2 = paramParcel1.readStrongBinder();
                                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                localObject4 = paramParcel1.readString();
                                localObject5 = paramParcel1.readString();
                                int i15 = paramParcel1.readInt();
                                i8 = paramParcel1.readInt();
                                if (i8 != 0)
                                {
                                  bool10 = m;
                                  label8425:
                                  i8 = paramParcel1.readInt();
                                  if (i8 == 0) {
                                    break label8475;
                                  }
                                  bool2 = m;
                                }
                                for (;;)
                                {
                                  localObject2 = this;
                                  zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, i15, bool10, bool2);
                                  paramParcel2.writeNoException();
                                  break;
                                  bool10 = false;
                                  localObject7 = null;
                                  break label8425;
                                  label8475:
                                  bool2 = false;
                                  localObject1 = null;
                                }
                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                localObject2 = paramParcel1.readString();
                                localObject2 = zzdR((String)localObject2);
                                paramParcel2.writeNoException();
                                if (localObject2 != null)
                                {
                                  paramParcel2.writeInt(m);
                                  ((ParcelFileDescriptor)localObject2).writeToParcel(paramParcel2, m);
                                }
                                else
                                {
                                  paramParcel2.writeInt(0);
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  l2 = paramParcel1.readLong();
                                  zzc((IGamesCallbacks)localObject2, l2);
                                  paramParcel2.writeNoException();
                                  continue;
                                  localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                  paramParcel1.enforceInterface((String)localObject2);
                                  l1 = paramParcel1.readLong();
                                  zzI(l1);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  l2 = paramParcel1.readLong();
                                  localObject3 = paramParcel1.readString();
                                  zzc((IGamesCallbacks)localObject2, l2, (String)localObject3);
                                  paramParcel2.writeNoException();
                                  continue;
                                  localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                  paramParcel1.enforceInterface((String)localObject2);
                                  l1 = paramParcel1.readLong();
                                  localObject4 = paramParcel1.readString();
                                  zzd(l1, (String)localObject4);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject3 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  localObject4 = paramParcel1.readString();
                                  localObject5 = paramParcel1.createStringArray();
                                  i15 = paramParcel1.readInt();
                                  localObject7 = paramParcel1.createByteArray();
                                  int j = paramParcel1.readInt();
                                  localObject2 = this;
                                  zza((IGamesCallbacks)localObject3, (String)localObject4, (String[])localObject5, i15, (byte[])localObject7, j);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  localObject3 = paramParcel1.createStringArray();
                                  zza((IGamesCallbacks)localObject2, (String[])localObject3);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  localObject3 = paramParcel1.createStringArray();
                                  zzb((IGamesCallbacks)localObject2, (String[])localObject3);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  localObject3 = paramParcel1.readString();
                                  localObject4 = paramParcel1.readString();
                                  localObject5 = paramParcel1.createStringArray();
                                  zza((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4, (String[])localObject5);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  i22 = paramParcel1.readInt();
                                  i11 = paramParcel1.readInt();
                                  i12 = paramParcel1.readInt();
                                  zza((IGamesCallbacks)localObject2, i22, i11, i12);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject3 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  localObject4 = paramParcel1.readString();
                                  localObject5 = paramParcel1.readString();
                                  i15 = paramParcel1.readInt();
                                  int i20 = paramParcel1.readInt();
                                  j = paramParcel1.readInt();
                                  localObject2 = this;
                                  zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, i15, i20, j);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                  localObject3 = paramParcel1.readString();
                                  i11 = paramParcel1.readInt();
                                  zza((IGamesCallbacks)localObject2, (String)localObject3, i11);
                                  paramParcel2.writeNoException();
                                  continue;
                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                  i8 = paramParcel1.readInt();
                                  localObject3 = paramParcel1.createByteArray();
                                  i11 = paramParcel1.readInt();
                                  localObject5 = paramParcel1.readString();
                                  localObject2 = zza(i8, (byte[])localObject3, i11, (String)localObject5);
                                  paramParcel2.writeNoException();
                                  if (localObject2 != null)
                                  {
                                    paramParcel2.writeInt(m);
                                    ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                  }
                                  else
                                  {
                                    paramParcel2.writeInt(0);
                                    continue;
                                    localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                    paramParcel1.enforceInterface((String)localObject2);
                                    i8 = zzwN();
                                    paramParcel2.writeNoException();
                                    paramParcel2.writeInt(i8);
                                    continue;
                                    localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                    paramParcel1.enforceInterface((String)localObject2);
                                    i8 = zzwO();
                                    paramParcel2.writeNoException();
                                    paramParcel2.writeInt(i8);
                                    continue;
                                    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                    localObject2 = zzwM();
                                    paramParcel2.writeNoException();
                                    if (localObject2 != null)
                                    {
                                      paramParcel2.writeInt(m);
                                      ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                    }
                                    else
                                    {
                                      paramParcel2.writeInt(0);
                                      continue;
                                      localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                      paramParcel1.enforceInterface((String)localObject2);
                                      i8 = paramParcel1.readInt();
                                      if (i8 != 0)
                                      {
                                        localObject2 = GameRequestCluster.CREATOR;
                                        localObject1 = ((GameRequestClusterCreator)localObject2).zzeq(paramParcel1);
                                      }
                                      localObject2 = paramParcel1.readString();
                                      localObject2 = zza((GameRequestCluster)localObject1, (String)localObject2);
                                      paramParcel2.writeNoException();
                                      if (localObject2 != null)
                                      {
                                        paramParcel2.writeInt(m);
                                        ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                      }
                                      else
                                      {
                                        paramParcel2.writeInt(0);
                                        continue;
                                        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                        localObject2 = paramParcel1.readString();
                                        i22 = paramParcel1.readInt();
                                        zzu((String)localObject2, i22);
                                        paramParcel2.writeNoException();
                                        continue;
                                        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                        localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                        i22 = paramParcel1.readInt();
                                        zza((IGamesCallbacks)localObject2, i22);
                                        paramParcel2.writeNoException();
                                        continue;
                                        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                        localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                        localObject3 = paramParcel1.readString();
                                        i11 = paramParcel1.readInt();
                                        i12 = paramParcel1.readInt();
                                        if (i12 != 0) {
                                          k = m;
                                        }
                                        zzb((IGamesCallbacks)localObject2, (String)localObject3, i11, k);
                                        paramParcel2.writeNoException();
                                        continue;
                                        localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                        paramParcel1.enforceInterface((String)localObject2);
                                        i8 = paramParcel1.readInt();
                                        if (i8 != 0)
                                        {
                                          localObject2 = ZInvitationCluster.CREATOR;
                                          localObject1 = ((InvitationClusterCreator)localObject2).zzeo(paramParcel1);
                                        }
                                        localObject2 = paramParcel1.readString();
                                        localObject3 = paramParcel1.readString();
                                        localObject2 = zza((ZInvitationCluster)localObject1, (String)localObject2, (String)localObject3);
                                        paramParcel2.writeNoException();
                                        if (localObject2 != null)
                                        {
                                          paramParcel2.writeInt(m);
                                          ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                        }
                                        else
                                        {
                                          paramParcel2.writeInt(0);
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          i22 = paramParcel1.readInt();
                                          localObject4 = paramParcel1.createIntArray();
                                          zza((IGamesCallbacks)localObject2, i22, (int[])localObject4);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          i11 = paramParcel1.readInt();
                                          localObject5 = paramParcel1.createIntArray();
                                          zza((IGamesCallbacks)localObject2, (String)localObject3, i11, (int[])localObject5);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.createStringArray();
                                          zzc((IGamesCallbacks)localObject2, (String[])localObject3);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          zzj((IGamesCallbacks)localObject2);
                                          paramParcel2.writeNoException();
                                          continue;
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          zzwZ();
                                          paramParcel2.writeNoException();
                                          continue;
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          localObject4 = paramParcel1.readString();
                                          i8 = paramParcel1.readInt();
                                          if (i8 != 0)
                                          {
                                            i8 = m;
                                            label9746:
                                            i22 = paramParcel1.readInt();
                                            if (i22 == 0) {
                                              break label9816;
                                            }
                                            i22 = m;
                                          }
                                          for (;;)
                                          {
                                            i12 = paramParcel1.readInt();
                                            localObject2 = zza((String)localObject4, i8, i22, i12);
                                            paramParcel2.writeNoException();
                                            if (localObject2 == null) {
                                              break label9825;
                                            }
                                            paramParcel2.writeInt(m);
                                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                            break;
                                            i9 = 0;
                                            localObject2 = null;
                                            break label9746;
                                            label9816:
                                            i23 = 0;
                                            localObject3 = null;
                                          }
                                          label9825:
                                          paramParcel2.writeInt(0);
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          int i23 = paramParcel1.readInt();
                                          if (i23 != 0) {
                                            k = m;
                                          }
                                          zzd((IGamesCallbacks)localObject2, k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          localObject4 = paramParcel1.readString();
                                          i12 = paramParcel1.readInt();
                                          if (i12 != 0) {
                                            k = m;
                                          }
                                          zzc((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4, k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          i11 = paramParcel1.readInt();
                                          if (i11 != 0) {
                                            k = m;
                                          }
                                          zze((IGamesCallbacks)localObject2, (String)localObject3, k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.readStrongBinder();
                                          localObject4 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                          localObject5 = paramParcel1.readString();
                                          int i9 = paramParcel1.readInt();
                                          if (i9 != 0)
                                          {
                                            localObject2 = SnapshotMetadataChangeEntity.CREATOR.zzeC(paramParcel1);
                                            localObject3 = localObject2;
                                            label10041:
                                            i9 = paramParcel1.readInt();
                                            if (i9 == 0) {
                                              break label10094;
                                            }
                                          }
                                          for (localObject2 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                          {
                                            zza((IGamesCallbacks)localObject4, (String)localObject5, (SnapshotMetadataChangeEntity)localObject3, (Contents)localObject2);
                                            paramParcel2.writeNoException();
                                            break;
                                            i23 = 0;
                                            localObject3 = null;
                                            break label10041;
                                            label10094:
                                            i9 = 0;
                                          }
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          i9 = paramParcel1.readInt();
                                          if (i9 != 0) {}
                                          for (localObject2 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                          {
                                            zza((Contents)localObject2);
                                            paramParcel2.writeNoException();
                                            break;
                                            i9 = 0;
                                          }
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          zzr((IGamesCallbacks)localObject2, (String)localObject3);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.readStrongBinder();
                                          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                          localObject4 = paramParcel1.readString();
                                          localObject5 = paramParcel1.readString();
                                          i9 = paramParcel1.readInt();
                                          if (i9 != 0)
                                          {
                                            localObject2 = SnapshotMetadataChangeEntity.CREATOR;
                                            localObject6 = ((SnapshotMetadataChangeCreator)localObject2).zzeC(paramParcel1);
                                            label10251:
                                            i9 = paramParcel1.readInt();
                                            if (i9 == 0) {
                                              break label10313;
                                            }
                                            localObject2 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
                                          }
                                          for (localObject7 = localObject2;; localObject7 = null)
                                          {
                                            localObject2 = this;
                                            zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, (SnapshotMetadataChangeEntity)localObject6, (Contents)localObject7);
                                            paramParcel2.writeNoException();
                                            break;
                                            i15 = 0;
                                            localObject6 = null;
                                            break label10251;
                                            label10313:
                                            i20 = 0;
                                          }
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          i9 = zzwP();
                                          paramParcel2.writeNoException();
                                          paramParcel2.writeInt(i9);
                                          continue;
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          i9 = zzwQ();
                                          paramParcel2.writeNoException();
                                          paramParcel2.writeInt(i9);
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          zzs((IGamesCallbacks)localObject2, (String)localObject3);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          i11 = paramParcel1.readInt();
                                          zzb((IGamesCallbacks)localObject2, (String)localObject3, i11);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          i11 = paramParcel1.readInt();
                                          zzc((IGamesCallbacks)localObject2, (String)localObject3, i11);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.readStrongBinder();
                                          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                          localObject4 = paramParcel1.readString();
                                          i12 = paramParcel1.readInt();
                                          i9 = paramParcel1.readInt();
                                          if (i9 != 0)
                                          {
                                            i15 = m;
                                            label10550:
                                            i9 = paramParcel1.readInt();
                                            if (i9 == 0) {
                                              break label10598;
                                            }
                                            i20 = m;
                                          }
                                          boolean bool8;
                                          label10598:
                                          boolean bool11;
                                          for (;;)
                                          {
                                            localObject2 = this;
                                            zze((IGamesCallbacks)localObject3, (String)localObject4, i12, i15, i20);
                                            paramParcel2.writeNoException();
                                            break;
                                            bool8 = false;
                                            localObject6 = null;
                                            break label10550;
                                            bool11 = false;
                                            localObject7 = null;
                                          }
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.readStrongBinder();
                                          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                          localObject4 = paramParcel1.readString();
                                          i12 = paramParcel1.readInt();
                                          i9 = paramParcel1.readInt();
                                          if (i9 != 0)
                                          {
                                            bool8 = m;
                                            label10653:
                                            i9 = paramParcel1.readInt();
                                            if (i9 == 0) {
                                              break label10701;
                                            }
                                            bool11 = m;
                                          }
                                          for (;;)
                                          {
                                            localObject2 = this;
                                            zzf((IGamesCallbacks)localObject3, (String)localObject4, i12, bool8, bool11);
                                            paramParcel2.writeNoException();
                                            break;
                                            bool8 = false;
                                            localObject6 = null;
                                            break label10653;
                                            label10701:
                                            bool11 = false;
                                            localObject7 = null;
                                          }
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          boolean bool5 = zzxa();
                                          paramParcel2.writeNoException();
                                          if (bool5) {
                                            k = m;
                                          }
                                          paramParcel2.writeInt(k);
                                          continue;
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          int i10 = paramParcel1.readInt();
                                          if (i10 != 0) {
                                            k = m;
                                          }
                                          zzaj(k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          zzt((IGamesCallbacks)localObject2, (String)localObject3);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          i23 = paramParcel1.readInt();
                                          if (i23 != 0) {
                                            k = m;
                                          }
                                          zze((IGamesCallbacks)localObject2, k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          i23 = paramParcel1.readInt();
                                          if (i23 != 0) {
                                            k = m;
                                          }
                                          zzf((IGamesCallbacks)localObject2, k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          i23 = paramParcel1.readInt();
                                          if (i23 != 0) {
                                            k = m;
                                          }
                                          localObject3 = paramParcel1.createStringArray();
                                          zza((IGamesCallbacks)localObject2, k, (String[])localObject3);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.readString();
                                          i23 = paramParcel1.readInt();
                                          zzp((String)localObject2, i23);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          zzu((IGamesCallbacks)localObject2, (String)localObject3);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.readString();
                                          localObject4 = paramParcel1.readString();
                                          zzf((IGamesCallbacks)localObject2, (String)localObject3, (String)localObject4);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.createIntArray();
                                          i11 = paramParcel1.readInt();
                                          i12 = paramParcel1.readInt();
                                          if (i12 != 0) {
                                            k = m;
                                          }
                                          zza((IGamesCallbacks)localObject2, (int[])localObject3, i11, k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          localObject3 = paramParcel1.createStringArray();
                                          i11 = paramParcel1.readInt();
                                          if (i11 != 0) {
                                            k = m;
                                          }
                                          zza((IGamesCallbacks)localObject2, (String[])localObject3, k);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.readStrongBinder();
                                          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                          localObject4 = paramParcel1.readString();
                                          localObject5 = paramParcel1.readString();
                                          localObject6 = paramParcel1.createIntArray();
                                          int i21 = paramParcel1.readInt();
                                          i10 = paramParcel1.readInt();
                                          if (i10 != 0) {
                                            j = m;
                                          }
                                          boolean bool3;
                                          for (;;)
                                          {
                                            localObject2 = this;
                                            zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, (int[])localObject6, i21, j);
                                            paramParcel2.writeNoException();
                                            break;
                                            bool3 = false;
                                            localObject1 = null;
                                          }
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.readStrongBinder();
                                          localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                          localObject4 = paramParcel1.readString();
                                          localObject5 = paramParcel1.readString();
                                          localObject6 = paramParcel1.createStringArray();
                                          i10 = paramParcel1.readInt();
                                          if (i10 != 0) {
                                            i21 = m;
                                          }
                                          boolean bool12;
                                          for (;;)
                                          {
                                            localObject2 = this;
                                            zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, (String[])localObject6, i21);
                                            paramParcel2.writeNoException();
                                            break;
                                            bool12 = false;
                                            localObject7 = null;
                                          }
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          l2 = paramParcel1.readLong();
                                          zzd((IGamesCallbacks)localObject2, l2);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                          l2 = paramParcel1.readLong();
                                          localObject3 = paramParcel1.readString();
                                          zzd((IGamesCallbacks)localObject2, l2, (String)localObject3);
                                          paramParcel2.writeNoException();
                                          continue;
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          l1 = paramParcel1.readLong();
                                          zzJ(l1);
                                          paramParcel2.writeNoException();
                                          continue;
                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                          paramParcel1.enforceInterface((String)localObject2);
                                          l1 = paramParcel1.readLong();
                                          localObject4 = paramParcel1.readString();
                                          zze(l1, (String)localObject4);
                                          paramParcel2.writeNoException();
                                          continue;
                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                          localObject2 = paramParcel1.createIntArray();
                                          localObject2 = zzb((int[])localObject2);
                                          paramParcel2.writeNoException();
                                          if (localObject2 != null)
                                          {
                                            paramParcel2.writeInt(m);
                                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                          }
                                          else
                                          {
                                            paramParcel2.writeInt(0);
                                            continue;
                                            paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                            localObject2 = paramParcel1.readString();
                                            localObject2 = zzdI((String)localObject2);
                                            paramParcel2.writeNoException();
                                            if (localObject2 != null)
                                            {
                                              paramParcel2.writeInt(m);
                                              ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                            }
                                            else
                                            {
                                              paramParcel2.writeInt(0);
                                              continue;
                                              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                              localObject2 = paramParcel1.readStrongBinder();
                                              localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                              localObject4 = paramParcel1.readString();
                                              localObject5 = paramParcel1.readString();
                                              int i16 = paramParcel1.readInt();
                                              i10 = paramParcel1.readInt();
                                              if (i10 != 0)
                                              {
                                                bool12 = m;
                                                label11676:
                                                i10 = paramParcel1.readInt();
                                                if (i10 == 0) {
                                                  break label11726;
                                                }
                                                bool3 = m;
                                              }
                                              for (;;)
                                              {
                                                localObject2 = this;
                                                zzb((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, i16, bool12, bool3);
                                                paramParcel2.writeNoException();
                                                break;
                                                bool12 = false;
                                                localObject7 = null;
                                                break label11676;
                                                label11726:
                                                bool3 = false;
                                                localObject1 = null;
                                              }
                                              localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                              paramParcel1.enforceInterface((String)localObject2);
                                              i10 = paramParcel1.readInt();
                                              if (i10 != 0) {
                                                k = m;
                                              }
                                              zzak(k);
                                              paramParcel2.writeNoException();
                                              continue;
                                              localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                              paramParcel1.enforceInterface((String)localObject2);
                                              localObject3 = paramParcel1.readString();
                                              localObject4 = paramParcel1.readStrongBinder();
                                              i10 = paramParcel1.readInt();
                                              if (i10 != 0) {}
                                              for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                              {
                                                zza((String)localObject3, (IBinder)localObject4, (Bundle)localObject2);
                                                paramParcel2.writeNoException();
                                                break;
                                                i10 = 0;
                                              }
                                              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                              localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                              i23 = paramParcel1.readInt();
                                              if (i23 != 0) {
                                                k = m;
                                              }
                                              zzg((IGamesCallbacks)localObject2, k);
                                              paramParcel2.writeNoException();
                                              continue;
                                              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                              localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                              i23 = paramParcel1.readInt();
                                              if (i23 != 0) {
                                                k = m;
                                              }
                                              zzh((IGamesCallbacks)localObject2, k);
                                              paramParcel2.writeNoException();
                                              continue;
                                              localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                              paramParcel1.enforceInterface((String)localObject2);
                                              i10 = paramParcel1.readInt();
                                              if (i10 != 0) {}
                                              for (localObject2 = (AchievementEntity)AchievementEntity.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                              {
                                                localObject2 = zza((AchievementEntity)localObject2);
                                                paramParcel2.writeNoException();
                                                if (localObject2 == null) {
                                                  break label12014;
                                                }
                                                paramParcel2.writeInt(m);
                                                ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                break;
                                                i10 = 0;
                                              }
                                              label12014:
                                              paramParcel2.writeInt(0);
                                              continue;
                                              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                              localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                              localObject3 = paramParcel1.readString();
                                              i11 = paramParcel1.readInt();
                                              if (i11 != 0) {
                                                k = m;
                                              }
                                              zzf((IGamesCallbacks)localObject2, (String)localObject3, k);
                                              paramParcel2.writeNoException();
                                              continue;
                                              paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                              localObject2 = paramParcel1.readString();
                                              i23 = paramParcel1.readInt();
                                              localObject2 = zzv((String)localObject2, i23);
                                              paramParcel2.writeNoException();
                                              if (localObject2 != null)
                                              {
                                                paramParcel2.writeInt(m);
                                                ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                              }
                                              else
                                              {
                                                paramParcel2.writeInt(0);
                                                continue;
                                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                localObject2 = paramParcel1.readStrongBinder();
                                                localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                                i11 = paramParcel1.readInt();
                                                localObject5 = paramParcel1.readString();
                                                localObject6 = paramParcel1.createStringArray();
                                                i10 = paramParcel1.readInt();
                                                if (i10 != 0) {
                                                  bool12 = m;
                                                }
                                                for (;;)
                                                {
                                                  localObject2 = this;
                                                  zza((IGamesCallbacks)localObject3, i11, (String)localObject5, (String[])localObject6, bool12);
                                                  paramParcel2.writeNoException();
                                                  break;
                                                  bool12 = false;
                                                  localObject7 = null;
                                                }
                                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                localObject2 = ParticipantEntity.CREATOR;
                                                localObject3 = (ParticipantEntity[])paramParcel1.createTypedArray((Parcelable.Creator)localObject2);
                                                localObject4 = paramParcel1.readString();
                                                localObject5 = paramParcel1.readString();
                                                i10 = paramParcel1.readInt();
                                                if (i10 != 0)
                                                {
                                                  localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                                                  localObject6 = localObject2;
                                                  label12285:
                                                  i10 = paramParcel1.readInt();
                                                  if (i10 == 0) {
                                                    break label12376;
                                                  }
                                                  localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                                                }
                                                for (localObject7 = localObject2;; localObject7 = null)
                                                {
                                                  localObject1 = paramParcel1.readString();
                                                  localObject2 = this;
                                                  localObject2 = zza((ParticipantEntity[])localObject3, (String)localObject4, (String)localObject5, (Uri)localObject6, (Uri)localObject7, (String)localObject1);
                                                  paramParcel2.writeNoException();
                                                  if (localObject2 == null) {
                                                    break label12385;
                                                  }
                                                  paramParcel2.writeInt(m);
                                                  ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                  break;
                                                  i16 = 0;
                                                  localObject6 = null;
                                                  break label12285;
                                                  label12376:
                                                  bool12 = false;
                                                }
                                                label12385:
                                                paramParcel2.writeInt(0);
                                                continue;
                                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                localObject3 = paramParcel1.readString();
                                                i11 = paramParcel1.readInt();
                                                if (i11 != 0) {
                                                  k = m;
                                                }
                                                i11 = paramParcel1.readInt();
                                                zza((IGamesCallbacks)localObject2, (String)localObject3, k, i11);
                                                paramParcel2.writeNoException();
                                                continue;
                                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                localObject2 = paramParcel1.createStringArray();
                                                zzb((String[])localObject2);
                                                paramParcel2.writeNoException();
                                                continue;
                                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                localObject2 = IGamesClient.Stub.zzbX(paramParcel1.readStrongBinder());
                                                l2 = paramParcel1.readLong();
                                                zza((IGamesClient)localObject2, l2);
                                                paramParcel2.writeNoException();
                                                continue;
                                                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                                paramParcel1.enforceInterface((String)localObject2);
                                                l1 = paramParcel1.readLong();
                                                zzK(l1);
                                                paramParcel2.writeNoException();
                                                continue;
                                                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                                paramParcel1.enforceInterface((String)localObject2);
                                                i10 = paramParcel1.readInt();
                                                if (i10 != 0) {}
                                                for (localObject2 = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                                {
                                                  localObject2 = zza((PlayerEntity)localObject2);
                                                  paramParcel2.writeNoException();
                                                  if (localObject2 == null) {
                                                    break label12622;
                                                  }
                                                  paramParcel2.writeInt(m);
                                                  ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                  break;
                                                  i10 = 0;
                                                }
                                                label12622:
                                                paramParcel2.writeInt(0);
                                                continue;
                                                localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                                paramParcel1.enforceInterface((String)localObject2);
                                                zzxb();
                                                paramParcel2.writeNoException();
                                                continue;
                                                paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                localObject2 = zzxc();
                                                paramParcel2.writeNoException();
                                                if (localObject2 != null)
                                                {
                                                  paramParcel2.writeInt(m);
                                                  ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                }
                                                else
                                                {
                                                  paramParcel2.writeInt(0);
                                                  continue;
                                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                  localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                  i23 = paramParcel1.readInt();
                                                  if (i23 != 0) {
                                                    k = m;
                                                  }
                                                  zzi((IGamesCallbacks)localObject2, k);
                                                  paramParcel2.writeNoException();
                                                  continue;
                                                  paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                  localObject2 = paramParcel1.readString();
                                                  i23 = paramParcel1.readInt();
                                                  i11 = paramParcel1.readInt();
                                                  localObject2 = zzm((String)localObject2, i23, i11);
                                                  paramParcel2.writeNoException();
                                                  if (localObject2 != null)
                                                  {
                                                    paramParcel2.writeInt(m);
                                                    ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                  }
                                                  else
                                                  {
                                                    paramParcel2.writeInt(0);
                                                    continue;
                                                    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                    localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                    zzk((IGamesCallbacks)localObject2);
                                                    paramParcel2.writeNoException();
                                                    continue;
                                                    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                    localObject2 = zzxd();
                                                    paramParcel2.writeNoException();
                                                    if (localObject2 != null)
                                                    {
                                                      paramParcel2.writeInt(m);
                                                      ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                    }
                                                    else
                                                    {
                                                      paramParcel2.writeInt(0);
                                                      continue;
                                                      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                      localObject2 = paramParcel1.readStrongBinder();
                                                      localObject3 = IGamesCallbacks.Stub.zzbW((IBinder)localObject2);
                                                      localObject4 = paramParcel1.readString();
                                                      localObject5 = paramParcel1.readString();
                                                      i10 = paramParcel1.readInt();
                                                      if (i10 != 0) {}
                                                      for (localObject2 = (VideoConfiguration)VideoConfiguration.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                                      {
                                                        zza((IGamesCallbacks)localObject3, (String)localObject4, (String)localObject5, (VideoConfiguration)localObject2);
                                                        paramParcel2.writeNoException();
                                                        break;
                                                        i10 = 0;
                                                      }
                                                      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                      localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                      zzl((IGamesCallbacks)localObject2);
                                                      paramParcel2.writeNoException();
                                                      continue;
                                                      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                      localObject2 = paramParcel1.readString();
                                                      localObject3 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                      zza((String)localObject2, (IGamesCallbacks)localObject3);
                                                      paramParcel2.writeNoException();
                                                      continue;
                                                      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                      localObject2 = zzxe();
                                                      paramParcel2.writeNoException();
                                                      if (localObject2 != null)
                                                      {
                                                        paramParcel2.writeInt(m);
                                                        ((Account)localObject2).writeToParcel(paramParcel2, m);
                                                      }
                                                      else
                                                      {
                                                        paramParcel2.writeInt(0);
                                                        continue;
                                                        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                        localObject2 = paramParcel1.readString();
                                                        localObject2 = zzdS((String)localObject2);
                                                        paramParcel2.writeNoException();
                                                        if (localObject2 != null)
                                                        {
                                                          paramParcel2.writeInt(m);
                                                          ((Account)localObject2).writeToParcel(paramParcel2, m);
                                                        }
                                                        else
                                                        {
                                                          paramParcel2.writeInt(0);
                                                          continue;
                                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                                          paramParcel1.enforceInterface((String)localObject2);
                                                          localObject3 = paramParcel1.readString();
                                                          i10 = paramParcel1.readInt();
                                                          if (i10 != 0) {}
                                                          for (localObject2 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                                          {
                                                            zza((String)localObject3, (Account)localObject2);
                                                            paramParcel2.writeNoException();
                                                            break;
                                                            i10 = 0;
                                                          }
                                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                          localObject2 = ParticipantEntity.CREATOR;
                                                          localObject3 = (ParticipantEntity[])paramParcel1.createTypedArray((Parcelable.Creator)localObject2);
                                                          i10 = paramParcel1.readInt();
                                                          if (i10 != 0)
                                                          {
                                                            localObject2 = (Account)Account.CREATOR.createFromParcel(paramParcel1);
                                                            localObject4 = localObject2;
                                                            label13250:
                                                            localObject5 = paramParcel1.readString();
                                                            i10 = paramParcel1.readInt();
                                                            if (i10 == 0) {
                                                              break label13376;
                                                            }
                                                            localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                                                            localObject6 = localObject2;
                                                            label13285:
                                                            i10 = paramParcel1.readInt();
                                                            if (i10 == 0) {
                                                              break label13385;
                                                            }
                                                            localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                                                          }
                                                          for (localObject7 = localObject2;; localObject7 = null)
                                                          {
                                                            localObject1 = paramParcel1.readString();
                                                            localObject2 = this;
                                                            localObject2 = zza((ParticipantEntity[])localObject3, (Account)localObject4, (String)localObject5, (Uri)localObject6, (Uri)localObject7, (String)localObject1);
                                                            paramParcel2.writeNoException();
                                                            if (localObject2 == null) {
                                                              break label13394;
                                                            }
                                                            paramParcel2.writeInt(m);
                                                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                            break;
                                                            i11 = 0;
                                                            localObject4 = null;
                                                            break label13250;
                                                            label13376:
                                                            i16 = 0;
                                                            localObject6 = null;
                                                            break label13285;
                                                            label13385:
                                                            bool12 = false;
                                                          }
                                                          label13394:
                                                          paramParcel2.writeInt(0);
                                                          continue;
                                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                                          paramParcel1.enforceInterface((String)localObject2);
                                                          i10 = paramParcel1.readInt();
                                                          if (i10 != 0)
                                                          {
                                                            localObject2 = GameRequestCluster.CREATOR.zzeq(paramParcel1);
                                                            localObject3 = localObject2;
                                                            label13436:
                                                            i10 = paramParcel1.readInt();
                                                            if (i10 == 0) {
                                                              break label13506;
                                                            }
                                                          }
                                                          for (localObject2 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                                          {
                                                            localObject2 = zza((GameRequestCluster)localObject3, (Account)localObject2);
                                                            paramParcel2.writeNoException();
                                                            if (localObject2 == null) {
                                                              break label13515;
                                                            }
                                                            paramParcel2.writeInt(m);
                                                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                            break;
                                                            i23 = 0;
                                                            localObject3 = null;
                                                            break label13436;
                                                            label13506:
                                                            i10 = 0;
                                                          }
                                                          label13515:
                                                          paramParcel2.writeInt(0);
                                                          continue;
                                                          localObject2 = "com.google.android.gms.games.internal.IGamesService";
                                                          paramParcel1.enforceInterface((String)localObject2);
                                                          i10 = paramParcel1.readInt();
                                                          if (i10 != 0)
                                                          {
                                                            localObject2 = ZInvitationCluster.CREATOR.zzeo(paramParcel1);
                                                            localObject3 = localObject2;
                                                            label13557:
                                                            i10 = paramParcel1.readInt();
                                                            if (i10 == 0) {
                                                              break label13635;
                                                            }
                                                          }
                                                          for (localObject2 = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                                                          {
                                                            localObject4 = paramParcel1.readString();
                                                            localObject2 = zza((ZInvitationCluster)localObject3, (Account)localObject2, (String)localObject4);
                                                            paramParcel2.writeNoException();
                                                            if (localObject2 == null) {
                                                              break label13644;
                                                            }
                                                            paramParcel2.writeInt(m);
                                                            ((Intent)localObject2).writeToParcel(paramParcel2, m);
                                                            break;
                                                            i23 = 0;
                                                            localObject3 = null;
                                                            break label13557;
                                                            label13635:
                                                            i10 = 0;
                                                          }
                                                          label13644:
                                                          paramParcel2.writeInt(0);
                                                          continue;
                                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                          zzm((IGamesCallbacks)localObject2);
                                                          paramParcel2.writeNoException();
                                                          continue;
                                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                          zzn((IGamesCallbacks)localObject2);
                                                          paramParcel2.writeNoException();
                                                          continue;
                                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                          localObject2 = IGamesCallbacks.Stub.zzbW(paramParcel1.readStrongBinder());
                                                          zzo((IGamesCallbacks)localObject2);
                                                          paramParcel2.writeNoException();
                                                          continue;
                                                          paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                                                          localObject2 = zzxf();
                                                          paramParcel2.writeNoException();
                                                          paramParcel2.writeList((List)localObject2);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\IGamesService$Stub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */