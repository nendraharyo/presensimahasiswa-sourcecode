package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;

public abstract interface zzrz
  extends IInterface
{
  public abstract void zzK(Bundle paramBundle);
  
  public abstract void zzL(Bundle paramBundle);
  
  public abstract void zza(Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(CreateWalletObjectsRequest paramCreateWalletObjectsRequest, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(IsReadyToPayRequest paramIsReadyToPayRequest, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, zzsb paramzzsb);
  
  public abstract void zza(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle);
  
  public abstract void zza(GetBuyFlowInitializationTokenRequest paramGetBuyFlowInitializationTokenRequest, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(GetInstrumentsRequest paramGetInstrumentsRequest, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(InitializeBuyFlowRequest paramInitializeBuyFlowRequest, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zza(String paramString1, String paramString2, Bundle paramBundle, zzsc paramzzsc);
  
  public abstract void zzb(Bundle paramBundle, zzsc paramzzsc);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */