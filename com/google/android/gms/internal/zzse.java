package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

public class zzse
  extends zzj
{
  private final Context mContext;
  private final int mTheme;
  private final String zzVa;
  private final int zzbpM;
  private final boolean zzbpN;
  
  public zzse(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramLooper, 4, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.mContext = paramContext;
    this.zzbpM = paramInt1;
    localObject = paramzzf.getAccountName();
    this.zzVa = ((String)localObject);
    this.mTheme = paramInt2;
    this.zzbpN = paramBoolean;
  }
  
  private Bundle zzIp()
  {
    int i = this.zzbpM;
    String str1 = this.mContext.getPackageName();
    String str2 = this.zzVa;
    int j = this.mTheme;
    boolean bool = this.zzbpN;
    return zza(i, str1, str2, j, bool);
  }
  
  public static Bundle zza(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", paramInt1);
    localBundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", paramBoolean);
    String str1 = "androidPackageName";
    localBundle.putString(str1, paramString1);
    boolean bool = TextUtils.isEmpty(paramString2);
    if (!bool)
    {
      str1 = "com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT";
      Account localAccount = new android/accounts/Account;
      String str2 = "com.google";
      localAccount.<init>(paramString2, str2);
      localBundle.putParcelable(str1, localAccount);
    }
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", paramInt2);
    return localBundle;
  }
  
  public void zza(FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    zzse.zzc localzzc = new com/google/android/gms/internal/zzse$zzc;
    Object localObject = this.mContext;
    localzzc.<init>((Context)localObject, paramInt);
    Bundle localBundle1 = zzIp();
    try
    {
      localObject = zzqJ();
      localObject = (zzrz)localObject;
      ((zzrz)localObject).zza(paramFullWalletRequest, localBundle1, localzzc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("WalletClientImpl", "RemoteException getting full wallet", localRemoteException);
        int i = 8;
        localBundle1 = null;
        Bundle localBundle2 = Bundle.EMPTY;
        localzzc.zza(i, null, localBundle2);
      }
    }
  }
  
  public void zza(IsReadyToPayRequest paramIsReadyToPayRequest, zza.zzb paramzzb)
  {
    zzse.zzb localzzb = new com/google/android/gms/internal/zzse$zzb;
    localzzb.<init>(paramzzb);
    Bundle localBundle1 = zzIp();
    try
    {
      Object localObject = zzqJ();
      localObject = (zzrz)localObject;
      ((zzrz)localObject).zza(paramIsReadyToPayRequest, localBundle1, localzzb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("WalletClientImpl", "RemoteException during isReadyToPay", localRemoteException);
        Status localStatus = Status.zzagE;
        localBundle1 = null;
        Bundle localBundle2 = Bundle.EMPTY;
        localzzb.zza(localStatus, false, localBundle2);
      }
    }
  }
  
  public void zza(MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Bundle localBundle1 = zzIp();
    zzse.zzc localzzc = new com/google/android/gms/internal/zzse$zzc;
    Object localObject = this.mContext;
    localzzc.<init>((Context)localObject, paramInt);
    try
    {
      localObject = zzqJ();
      localObject = (zzrz)localObject;
      ((zzrz)localObject).zza(paramMaskedWalletRequest, localBundle1, localzzc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("WalletClientImpl", "RemoteException getting masked wallet", localRemoteException);
        int i = 8;
        localBundle1 = null;
        Bundle localBundle2 = Bundle.EMPTY;
        localzzc.zza(i, null, localBundle2);
      }
    }
  }
  
  public void zza(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Bundle localBundle = zzIp();
    try
    {
      Object localObject = zzqJ();
      localObject = (zzrz)localObject;
      ((zzrz)localObject).zza(paramNotifyTransactionStatusRequest, localBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  protected zzrz zzep(IBinder paramIBinder)
  {
    return zzrz.zza.zzel(paramIBinder);
  }
  
  public void zzf(String paramString1, String paramString2, int paramInt)
  {
    Bundle localBundle1 = zzIp();
    zzse.zzc localzzc = new com/google/android/gms/internal/zzse$zzc;
    Object localObject = this.mContext;
    localzzc.<init>((Context)localObject, paramInt);
    try
    {
      localObject = zzqJ();
      localObject = (zzrz)localObject;
      ((zzrz)localObject).zza(paramString1, paramString2, localBundle1, localzzc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("WalletClientImpl", "RemoteException changing masked wallet", localRemoteException);
        int i = 8;
        localBundle1 = null;
        Bundle localBundle2 = Bundle.EMPTY;
        localzzc.zza(i, null, localBundle2);
      }
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.wallet.service.BIND";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.wallet.internal.IOwService";
  }
  
  public void zzln(int paramInt)
  {
    Bundle localBundle1 = zzIp();
    zzse.zzc localzzc = new com/google/android/gms/internal/zzse$zzc;
    Object localObject = this.mContext;
    localzzc.<init>((Context)localObject, paramInt);
    try
    {
      localObject = zzqJ();
      localObject = (zzrz)localObject;
      ((zzrz)localObject).zza(localBundle1, localzzc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", localRemoteException);
        int i = 8;
        localBundle1 = null;
        Bundle localBundle2 = Bundle.EMPTY;
        localzzc.zza(i, false, localBundle2);
      }
    }
  }
  
  public void zzlo(int paramInt)
  {
    Bundle localBundle1 = zzIp();
    zzse.zzc localzzc = new com/google/android/gms/internal/zzse$zzc;
    Object localObject = this.mContext;
    localzzc.<init>((Context)localObject, paramInt);
    try
    {
      localObject = zzqJ();
      localObject = (zzrz)localObject;
      ((zzrz)localObject).zzb(localBundle1, localzzc);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("WalletClientImpl", "RemoteException during isNewUser", localRemoteException);
        int i = 8;
        localBundle1 = null;
        Bundle localBundle2 = Bundle.EMPTY;
        localzzc.zzb(i, false, localBundle2);
      }
    }
  }
  
  public boolean zzqK()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */