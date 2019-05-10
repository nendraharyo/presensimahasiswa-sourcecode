package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;

public abstract class zzrz$zza
  extends Binder
  implements zzrz
{
  public static zzrz zzel(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzrz)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzrz;
        if (bool)
        {
          localObject = (zzrz)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzrz$zza$zza;
      ((zzrz.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject3;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject2 = "com.google.android.gms.wallet.internal.IOwService";
        paramParcel2.writeString((String)localObject2);
      }
    case 1: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label263;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((MaskedWalletRequest)localObject3, (Bundle)localObject2, (zzsc)localObject1);
        j = i;
        break;
        localObject3 = null;
        break label206;
        j = 0;
      }
    case 2: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (FullWalletRequest)FullWalletRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label368;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((FullWalletRequest)localObject3, (Bundle)localObject2, (zzsc)localObject1);
        j = i;
        break;
        localObject3 = null;
        break label311;
        j = 0;
      }
    case 3: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      localObject3 = paramParcel1.readString();
      String str = paramParcel1.readString();
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((String)localObject3, str, (Bundle)localObject2, (zzsc)localObject1);
        j = i;
        break;
        j = 0;
      }
    case 4: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (NotifyTransactionStatusRequest)NotifyTransactionStatusRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label546;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza((NotifyTransactionStatusRequest)localObject3, (Bundle)localObject2);
        j = i;
        break;
        localObject3 = null;
        break label500;
        j = 0;
      }
    case 5: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject3 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((Bundle)localObject2, (zzsc)localObject3);
        j = i;
        break;
        j = 0;
      }
    case 6: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (CreateWalletObjectsRequest)CreateWalletObjectsRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label719;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((CreateWalletObjectsRequest)localObject3, (Bundle)localObject2, (zzsc)localObject1);
        j = i;
        break;
        localObject3 = null;
        break label662;
        j = 0;
      }
    case 7: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label824;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsb.zza.zzen(paramParcel1.readStrongBinder());
        zza((MaskedWalletRequest)localObject3, (Bundle)localObject2, (zzsb)localObject1);
        j = i;
        break;
        localObject3 = null;
        break label767;
        j = 0;
      }
    case 8: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (GetInstrumentsRequest)GetInstrumentsRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label929;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((GetInstrumentsRequest)localObject3, (Bundle)localObject2, (zzsc)localObject1);
        j = i;
        break;
        localObject3 = null;
        break label872;
        j = 0;
      }
    case 9: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zzK((Bundle)localObject2);
        j = i;
        break;
        j = 0;
      }
    case 10: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zzL((Bundle)localObject2);
        j = i;
        break;
        j = 0;
      }
    case 11: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject3 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zzb((Bundle)localObject2, (zzsc)localObject3);
        j = i;
        break;
        j = 0;
      }
    case 12: 
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (GetBuyFlowInitializationTokenRequest)GetBuyFlowInitializationTokenRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        j = paramParcel1.readInt();
        if (j == 0) {
          break label1216;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((GetBuyFlowInitializationTokenRequest)localObject3, (Bundle)localObject2, (zzsc)localObject1);
        j = i;
        break;
        localObject3 = null;
        break label1159;
        j = 0;
      }
    case 13: 
      label206:
      label263:
      label311:
      label368:
      label500:
      label546:
      label662:
      label719:
      label767:
      label824:
      label872:
      label929:
      label1159:
      label1216:
      localObject2 = "com.google.android.gms.wallet.internal.IOwService";
      paramParcel1.enforceInterface((String)localObject2);
      j = paramParcel1.readInt();
      if (j != 0)
      {
        localObject2 = (InitializeBuyFlowRequest)InitializeBuyFlowRequest.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        label1264:
        j = paramParcel1.readInt();
        if (j == 0) {
          break label1321;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
        zza((InitializeBuyFlowRequest)localObject3, (Bundle)localObject2, (zzsc)localObject1);
        j = i;
        break;
        localObject3 = null;
        break label1264;
        label1321:
        j = 0;
      }
    }
    Object localObject2 = "com.google.android.gms.wallet.internal.IOwService";
    paramParcel1.enforceInterface((String)localObject2);
    int j = paramParcel1.readInt();
    if (j != 0)
    {
      localObject2 = (IsReadyToPayRequest)IsReadyToPayRequest.CREATOR.createFromParcel(paramParcel1);
      localObject3 = localObject2;
      label1369:
      j = paramParcel1.readInt();
      if (j == 0) {
        break label1426;
      }
    }
    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
    {
      localObject1 = zzsc.zza.zzeo(paramParcel1.readStrongBinder());
      zza((IsReadyToPayRequest)localObject3, (Bundle)localObject2, (zzsc)localObject1);
      j = i;
      break;
      localObject3 = null;
      break label1369;
      label1426:
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrz$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */