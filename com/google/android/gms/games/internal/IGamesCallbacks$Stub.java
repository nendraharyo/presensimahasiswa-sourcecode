package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.video.VideoCapabilities;

public abstract class IGamesCallbacks$Stub
  extends Binder
  implements IGamesCallbacks
{
  public IGamesCallbacks$Stub()
  {
    attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
  }
  
  public static IGamesCallbacks zzbW(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (IGamesCallbacks)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof IGamesCallbacks;
        if (bool)
        {
          localObject = (IGamesCallbacks)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/games/internal/IGamesCallbacks$Stub$Proxy;
      ((IGamesCallbacks.Stub.Proxy)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
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
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      Object localObject3 = paramParcel1.readString();
      zzg(i, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = DataHolder.CREATOR.zzak(paramParcel1);; localObject1 = null)
      {
        zzh((DataHolder)localObject1);
        paramParcel2.writeNoException();
        break;
        i = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      localObject3 = paramParcel1.readString();
      zzh(i, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzj((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = DataHolder.CREATOR.zzak(paramParcel1);; localObject1 = null)
      {
        n = paramParcel1.readInt();
        if (n != 0)
        {
          localObject3 = DataHolder.CREATOR;
          localObject2 = ((zze)localObject3).zzak(paramParcel1);
        }
        zza((DataHolder)localObject1, (DataHolder)localObject2);
        paramParcel2.writeNoException();
        break;
        i = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzk((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzl((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzm((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzn((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzo((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzp((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      zzwr();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzr((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzs((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzz((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzA((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      localObject3 = paramParcel1.readString();
      onLeftRoom(i, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzB((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzC((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzD((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzE((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzF((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      localObject1 = paramParcel1.createStringArray();
      zza((DataHolder)localObject2, (String[])localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      localObject1 = paramParcel1.createStringArray();
      zzb((DataHolder)localObject2, (String[])localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      localObject1 = paramParcel1.createStringArray();
      zzc((DataHolder)localObject2, (String[])localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      localObject1 = paramParcel1.createStringArray();
      zzd((DataHolder)localObject2, (String[])localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      localObject1 = paramParcel1.createStringArray();
      zze((DataHolder)localObject2, (String[])localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      localObject1 = paramParcel1.createStringArray();
      zzf((DataHolder)localObject2, (String[])localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = (RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        onRealTimeMessageReceived((RealTimeMessage)localObject1);
        paramParcel2.writeNoException();
        break;
        i = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      int n = paramParcel1.readInt();
      String str = paramParcel1.readString();
      zzb(i, n, str);
      paramParcel2.writeNoException();
      continue;
      localObject3 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject3);
      n = paramParcel1.readInt();
      str = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      if (i1 != 0) {
        i = m;
      }
      zza(n, str, i);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      int j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzG((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzH((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      zzgn(j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzI((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      zzgo(j);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = paramParcel1.readString();
      onP2PConnected((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = paramParcel1.readString();
      onP2PDisconnected((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzJ((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      n = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzc(n, (Bundle)localObject1);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzu((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzv((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzw((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzx((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      localObject3 = paramParcel1.readString();
      zzi(j, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzy((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = paramParcel1.readString();
      onTurnBasedMatchRemoved((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = paramParcel1.readString();
      onInvitationRemoved((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzq((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzt((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = paramParcel1.readString();
      onRequestRemoved((String)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzK((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzL((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      n = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzd(n, (Bundle)localObject1);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzM((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      n = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zze(n, (Bundle)localObject1);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzN((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
        localObject3 = localObject1;
        label3345:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label3394;
        }
      }
      for (localObject1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza((DataHolder)localObject3, (Contents)localObject1);
        paramParcel2.writeNoException();
        break;
        n = 0;
        localObject3 = null;
        break label3345;
        label3394:
        j = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      label3437:
      Object localObject4;
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject3 = ((zze)localObject1).zzak(paramParcel1);
        str = paramParcel1.readString();
        j = paramParcel1.readInt();
        if (j == 0) {
          break label3563;
        }
        localObject1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
        localObject4 = localObject1;
        label3472:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label3572;
        }
        localObject1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
      }
      label3563:
      label3572:
      for (Object localObject5 = localObject1;; localObject5 = null)
      {
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
          localObject2 = localObject1;
        }
        localObject1 = this;
        zza((DataHolder)localObject3, str, (Contents)localObject4, (Contents)localObject5, (Contents)localObject2);
        paramParcel2.writeNoException();
        break;
        n = 0;
        localObject3 = null;
        break label3437;
        i1 = 0;
        localObject4 = null;
        break label3472;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzO((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      localObject3 = paramParcel1.readString();
      zzj(j, (String)localObject3);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      n = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzf(n, (Bundle)localObject1);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzU((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzi((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzP((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzQ((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzR((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzS((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzT((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      n = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zzg(n, (Bundle)localObject1);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzV((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      zzgp(j);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      localObject1 = DataHolder.CREATOR;
      localObject1 = (DataHolder[])paramParcel1.createTypedArray((Parcelable.Creator)localObject1);
      zza((DataHolder[])localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzW((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject1 = DataHolder.CREATOR;
        localObject2 = ((zze)localObject1).zzak(paramParcel1);
      }
      zzX((DataHolder)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      j = paramParcel1.readInt();
      zzgq(j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      n = paramParcel1.readInt();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject1 = (VideoCapabilities)VideoCapabilities.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        zza(n, (VideoCapabilities)localObject1);
        paramParcel2.writeNoException();
        break;
        j = 0;
      }
      localObject3 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject3);
      n = paramParcel1.readInt();
      int i2 = paramParcel1.readInt();
      if (i2 != 0) {
        j = m;
      }
      zzd(n, j);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.games.internal.IGamesCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      int k = paramParcel1.readInt();
      localObject3 = paramParcel1.createLongArray();
      zza(k, (long[])localObject3);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\IGamesCallbacks$Stub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */