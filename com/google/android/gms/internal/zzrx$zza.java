package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract class zzrx$zza
  extends Binder
  implements zzrx
{
  public static zzrx zzej(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzrx)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzrx;
        if (bool)
        {
          localObject = (zzrx)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzrx$zza$zza;
      ((zzrx.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    IBinder localIBinder = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
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
    case 10: 
    case 11: 
    case 12: 
    case 13: 
      for (;;)
      {
        return j;
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
        localObject2 = paramParcel1.readStrongBinder();
        zzd localzzd = zzd.zza.zzbs((IBinder)localObject2);
        int k = paramParcel1.readInt();
        if (k != 0)
        {
          localObject2 = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(paramParcel1);
          localObject1 = localObject2;
          label219:
          k = paramParcel1.readInt();
          if (k == 0) {
            break label270;
          }
        }
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza(localzzd, (WalletFragmentOptions)localObject1, (Bundle)localObject2);
          paramParcel2.writeNoException();
          break;
          i = 0;
          localObject1 = null;
          break label219;
          label270:
          k = 0;
        }
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0) {}
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          onCreate((Bundle)localObject2);
          paramParcel2.writeNoException();
          break;
          k = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
        localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readStrongBinder();
        localzzd = zzd.zza.zzbs((IBinder)localObject2);
        k = paramParcel1.readInt();
        if (k != 0) {}
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          localObject2 = onCreateView((zzd)localObject1, localzzd, (Bundle)localObject2);
          paramParcel2.writeNoException();
          if (localObject2 != null) {
            localIBinder = ((zzd)localObject2).asBinder();
          }
          paramParcel2.writeStrongBinder(localIBinder);
          break;
          k = 0;
        }
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        onStart();
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        onResume();
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        onPause();
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        onStop();
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0) {}
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          onSaveInstanceState((Bundle)localObject2);
          paramParcel2.writeNoException();
          if (localObject2 == null) {
            break label597;
          }
          paramParcel2.writeInt(j);
          ((Bundle)localObject2).writeToParcel(paramParcel2, j);
          break;
          k = 0;
        }
        label597:
        paramParcel2.writeInt(0);
        continue;
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        i = paramParcel1.readInt();
        int n = paramParcel1.readInt();
        k = paramParcel1.readInt();
        if (k != 0) {}
        for (localObject2 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          onActivityResult(i, n, (Intent)localObject2);
          paramParcel2.writeNoException();
          break;
          k = 0;
        }
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0) {}
        for (localObject2 = (WalletFragmentInitParams)WalletFragmentInitParams.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          initialize((WalletFragmentInitParams)localObject2);
          paramParcel2.writeNoException();
          break;
          k = 0;
        }
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0) {}
        for (localObject2 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          updateMaskedWalletRequest((MaskedWalletRequest)localObject2);
          paramParcel2.writeNoException();
          break;
          k = 0;
        }
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        if (k != 0) {
          k = j;
        }
        for (;;)
        {
          setEnabled(k);
          paramParcel2.writeNoException();
          break;
          m = 0;
          localObject2 = null;
        }
        localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
        paramParcel1.enforceInterface((String)localObject2);
        m = getState();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(m);
      }
    }
    Object localObject2 = "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate";
    paramParcel1.enforceInterface((String)localObject2);
    int m = paramParcel1.readInt();
    if (m != 0) {}
    for (localObject2 = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
    {
      updateMaskedWallet((MaskedWallet)localObject2);
      paramParcel2.writeNoException();
      break;
      m = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrx$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */