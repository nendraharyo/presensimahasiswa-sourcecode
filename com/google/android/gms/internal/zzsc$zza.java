package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;

public abstract class zzsc$zza
  extends Binder
  implements zzsc
{
  public zzsc$zza()
  {
    attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
  }
  
  public static zzsc zzeo(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzsc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzsc;
        if (bool)
        {
          localObject = (zzsc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzsc$zza$zza;
      ((zzsc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int j = 1;
    int k;
    label172:
    label223:
    label277:
    label328:
    int i;
    label523:
    Object localObject3;
    label552:
    label603:
    label612:
    label742:
    label771:
    boolean bool2;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      for (;;)
      {
        return j;
        localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
        paramParcel2.writeString((String)localObject2);
      }
    case 1: 
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject2 = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        m = paramParcel1.readInt();
        if (m == 0) {
          break label223;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza(k, (MaskedWallet)localObject1, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        bool1 = false;
        localObject1 = null;
        break label172;
        m = 0;
      }
    case 2: 
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject2 = (FullWallet)FullWallet.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        m = paramParcel1.readInt();
        if (m == 0) {
          break label328;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza(k, (FullWallet)localObject1, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        bool1 = false;
        localObject1 = null;
        break label277;
        m = 0;
      }
    case 3: 
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      m = paramParcel1.readInt();
      if (m != 0) {
        bool1 = j;
      }
      m = paramParcel1.readInt();
      if (m != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza(k, bool1, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        m = 0;
      }
    case 4: 
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      i = paramParcel1.readInt();
      m = paramParcel1.readInt();
      if (m != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zzj(i, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        m = 0;
      }
    case 5: 
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        m = paramParcel1.readInt();
        if (m == 0) {
          break label603;
        }
        localObject2 = (GetInstrumentsResponse)GetInstrumentsResponse.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        m = paramParcel1.readInt();
        if (m == 0) {
          break label612;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza((Status)localObject1, (GetInstrumentsResponse)localObject3, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        i = 0;
        localObject1 = null;
        break label523;
        k = 0;
        localObject3 = null;
        break label552;
        m = 0;
      }
    case 6: 
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      k = paramParcel1.readInt();
      m = paramParcel1.readInt();
      if (m != 0) {
        i = j;
      }
      m = paramParcel1.readInt();
      if (m != 0) {}
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zzb(k, i, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        m = 0;
      }
    case 7: 
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        m = paramParcel1.readInt();
        if (m == 0) {
          break label822;
        }
        localObject2 = (GetBuyFlowInitializationTokenResponse)GetBuyFlowInitializationTokenResponse.CREATOR.createFromParcel(paramParcel1);
        localObject3 = localObject2;
        m = paramParcel1.readInt();
        if (m == 0) {
          break label831;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza((Status)localObject1, (GetBuyFlowInitializationTokenResponse)localObject3, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        bool2 = false;
        localObject1 = null;
        break label742;
        k = 0;
        localObject3 = null;
        break label771;
        m = 0;
      }
    case 8: 
      label822:
      label831:
      localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0)
      {
        localObject2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        localObject1 = localObject2;
        label879:
        m = paramParcel1.readInt();
        if (m == 0) {
          break label928;
        }
      }
      for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza((Status)localObject1, (Bundle)localObject2);
        paramParcel2.writeNoException();
        break;
        bool2 = false;
        localObject1 = null;
        break label879;
        label928:
        m = 0;
      }
    }
    Object localObject2 = "com.google.android.gms.wallet.internal.IWalletServiceCallbacks";
    paramParcel1.enforceInterface((String)localObject2);
    int m = paramParcel1.readInt();
    if (m != 0)
    {
      localObject2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      localObject3 = localObject2;
      label976:
      m = paramParcel1.readInt();
      if (m != 0) {
        bool2 = j;
      }
      m = paramParcel1.readInt();
      if (m == 0) {
        break label1042;
      }
    }
    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
    {
      zza((Status)localObject3, bool2, (Bundle)localObject2);
      paramParcel2.writeNoException();
      break;
      k = 0;
      localObject3 = null;
      break label976;
      label1042:
      m = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */