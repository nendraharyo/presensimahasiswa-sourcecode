package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import java.lang.ref.WeakReference;

final class zzse$zzc
  extends zzse.zza
{
  private final int zzagz;
  private final WeakReference zzbqC;
  
  public zzse$zzc(Context paramContext, int paramInt)
  {
    super(null);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    paramContext = (Activity)paramContext;
    localWeakReference.<init>(paramContext);
    this.zzbqC = localWeakReference;
    this.zzagz = paramInt;
  }
  
  public void zza(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
  {
    Object localObject1 = (Activity)this.zzbqC.get();
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = "WalletClientImpl";
      localObject3 = "Ignoring onFullWalletLoaded, Activity has gone";
      Log.d((String)localObject1, (String)localObject3);
    }
    for (;;)
    {
      return;
      boolean bool1 = false;
      localObject3 = null;
      if (paramBundle != null) {
        localObject3 = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
      }
      Object localObject4 = new com/google/android/gms/common/ConnectionResult;
      ((ConnectionResult)localObject4).<init>(paramInt, (PendingIntent)localObject3);
      bool1 = ((ConnectionResult)localObject4).hasResolution();
      if (bool1)
      {
        try
        {
          int i = this.zzagz;
          ((ConnectionResult)localObject4).startResolutionForResult((Activity)localObject1, i);
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          localObject3 = "WalletClientImpl";
          localObject4 = "Exception starting pending intent";
          Log.w((String)localObject3, (String)localObject4, localSendIntentException);
        }
      }
      else
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        boolean bool2 = ((ConnectionResult)localObject4).isSuccess();
        int j;
        Object localObject2;
        if (bool2)
        {
          j = -1;
          localObject4 = "com.google.android.gms.wallet.EXTRA_FULL_WALLET";
          localIntent.putExtra((String)localObject4, paramFullWallet);
          int k = this.zzagz;
          int m = 1073741824;
          localObject2 = localSendIntentException.createPendingResult(k, localIntent, m);
          if (localObject2 == null)
          {
            localObject2 = "WalletClientImpl";
            localObject3 = "Null pending result returned for onFullWalletLoaded";
            Log.w((String)localObject2, (String)localObject3);
          }
        }
        else
        {
          j = 408;
          if (paramInt == j)
          {
            j = 0;
            localObject3 = null;
          }
          for (;;)
          {
            localObject4 = "com.google.android.gms.wallet.EXTRA_ERROR_CODE";
            localIntent.putExtra((String)localObject4, paramInt);
            break;
            j = 1;
          }
        }
        try
        {
          ((PendingIntent)localObject2).send(j);
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          localObject3 = "WalletClientImpl";
          localObject4 = "Exception setting pending result";
          Log.w((String)localObject3, (String)localObject4, localCanceledException);
        }
      }
    }
  }
  
  public void zza(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
  {
    Object localObject1 = (Activity)this.zzbqC.get();
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = "WalletClientImpl";
      localObject3 = "Ignoring onMaskedWalletLoaded, Activity has gone";
      Log.d((String)localObject1, (String)localObject3);
    }
    for (;;)
    {
      return;
      boolean bool1 = false;
      localObject3 = null;
      if (paramBundle != null) {
        localObject3 = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
      }
      Object localObject4 = new com/google/android/gms/common/ConnectionResult;
      ((ConnectionResult)localObject4).<init>(paramInt, (PendingIntent)localObject3);
      bool1 = ((ConnectionResult)localObject4).hasResolution();
      if (bool1)
      {
        try
        {
          int i = this.zzagz;
          ((ConnectionResult)localObject4).startResolutionForResult((Activity)localObject1, i);
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          localObject3 = "WalletClientImpl";
          localObject4 = "Exception starting pending intent";
          Log.w((String)localObject3, (String)localObject4, localSendIntentException);
        }
      }
      else
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        boolean bool2 = ((ConnectionResult)localObject4).isSuccess();
        int j;
        Object localObject2;
        if (bool2)
        {
          j = -1;
          localObject4 = "com.google.android.gms.wallet.EXTRA_MASKED_WALLET";
          localIntent.putExtra((String)localObject4, paramMaskedWallet);
          int k = this.zzagz;
          int m = 1073741824;
          localObject2 = localSendIntentException.createPendingResult(k, localIntent, m);
          if (localObject2 == null)
          {
            localObject2 = "WalletClientImpl";
            localObject3 = "Null pending result returned for onMaskedWalletLoaded";
            Log.w((String)localObject2, (String)localObject3);
          }
        }
        else
        {
          j = 408;
          if (paramInt == j)
          {
            j = 0;
            localObject3 = null;
          }
          for (;;)
          {
            localObject4 = "com.google.android.gms.wallet.EXTRA_ERROR_CODE";
            localIntent.putExtra((String)localObject4, paramInt);
            break;
            j = 1;
          }
        }
        try
        {
          ((PendingIntent)localObject2).send(j);
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          localObject3 = "WalletClientImpl";
          localObject4 = "Exception setting pending result";
          Log.w((String)localObject3, (String)localObject4, localCanceledException);
        }
      }
    }
  }
  
  public void zza(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    Object localObject1 = (Activity)this.zzbqC.get();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "WalletClientImpl";
      localObject2 = "Ignoring onPreAuthorizationDetermined, Activity has gone";
      Log.d((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>();
      String str = "com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED";
      ((Intent)localObject2).putExtra(str, paramBoolean);
      int i = this.zzagz;
      int j = 1073741824;
      localObject1 = ((Activity)localObject1).createPendingResult(i, (Intent)localObject2, j);
      if (localObject1 == null)
      {
        localObject1 = "WalletClientImpl";
        localObject2 = "Null pending result returned for onPreAuthorizationDetermined";
        Log.w((String)localObject1, (String)localObject2);
      }
      else
      {
        int k = -1;
        try
        {
          ((PendingIntent)localObject1).send(k);
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          localObject2 = "WalletClientImpl";
          str = "Exception setting pending result";
          Log.w((String)localObject2, str, localCanceledException);
        }
      }
    }
  }
  
  public void zza(Status paramStatus, boolean paramBoolean, Bundle paramBundle)
  {
    Object localObject1 = (Activity)this.zzbqC.get();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "WalletClientImpl";
      localObject2 = "Ignoring onIsReadyToPayDetermined, Activity has gone";
      Log.d((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>();
      String str = "com.google.android.gms.wallet.EXTRA_IS_READY_TO_PAY";
      ((Intent)localObject2).putExtra(str, paramBoolean);
      int i = this.zzagz;
      int j = 1073741824;
      localObject1 = ((Activity)localObject1).createPendingResult(i, (Intent)localObject2, j);
      if (localObject1 == null)
      {
        localObject1 = "WalletClientImpl";
        localObject2 = "Null pending result returned for onIsReadyToPayDetermined";
        Log.w((String)localObject1, (String)localObject2);
      }
      else
      {
        int k = -1;
        try
        {
          ((PendingIntent)localObject1).send(k);
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          localObject2 = "WalletClientImpl";
          str = "Exception setting pending result in onIsReadyToPayDetermined";
          Log.w((String)localObject2, str, localCanceledException);
        }
      }
    }
  }
  
  public void zzb(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    Object localObject1 = (Activity)this.zzbqC.get();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = "WalletClientImpl";
      localObject2 = "Ignoring onIsNewUserDetermined, Activity has gone";
      Log.d((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>();
      String str = "com.google.android.gms.wallet.EXTRA_IS_NEW_USER";
      ((Intent)localObject2).putExtra(str, paramBoolean);
      int i = this.zzagz;
      int j = 1073741824;
      localObject1 = ((Activity)localObject1).createPendingResult(i, (Intent)localObject2, j);
      if (localObject1 == null)
      {
        localObject1 = "WalletClientImpl";
        localObject2 = "Null pending result returned for onIsNewUserDetermined";
        Log.w((String)localObject1, (String)localObject2);
      }
      else
      {
        int k = -1;
        try
        {
          ((PendingIntent)localObject1).send(k);
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          localObject2 = "WalletClientImpl";
          str = "Exception setting pending result";
          Log.w((String)localObject2, str, localCanceledException);
        }
      }
    }
  }
  
  public void zzj(int paramInt, Bundle paramBundle)
  {
    zzx.zzb(paramBundle, "Bundle should not be null");
    Object localObject1 = (Activity)this.zzbqC.get();
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = "WalletClientImpl";
      localObject3 = "Ignoring onWalletObjectsCreated, Activity has gone";
      Log.d((String)localObject1, (String)localObject3);
    }
    for (;;)
    {
      return;
      localObject3 = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
      Object localObject4 = new com/google/android/gms/common/ConnectionResult;
      ((ConnectionResult)localObject4).<init>(paramInt, (PendingIntent)localObject3);
      boolean bool = ((ConnectionResult)localObject4).hasResolution();
      int i;
      if (bool)
      {
        try
        {
          i = this.zzagz;
          ((ConnectionResult)localObject4).startResolutionForResult((Activity)localObject1, i);
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          localObject3 = "WalletClientImpl";
          localObject4 = "Exception starting pending intent";
          Log.w((String)localObject3, (String)localObject4, localSendIntentException);
        }
      }
      else
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "Create Wallet Objects confirmation UI will not be shown connection result: ";
        localStringBuilder = localStringBuilder.append(str);
        localObject4 = localObject4;
        Log.e("WalletClientImpl", (String)localObject4);
        localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>();
        localObject4 = "com.google.android.gms.wallet.EXTRA_ERROR_CODE";
        ((Intent)localObject3).putExtra((String)localObject4, 413);
        int j = this.zzagz;
        int k = 1073741824;
        Object localObject2 = localSendIntentException.createPendingResult(j, (Intent)localObject3, k);
        if (localObject2 == null)
        {
          localObject2 = "WalletClientImpl";
          localObject3 = "Null pending result returned for onWalletObjectsCreated";
          Log.w((String)localObject2, (String)localObject3);
        }
        else
        {
          i = 1;
          try
          {
            ((PendingIntent)localObject2).send(i);
          }
          catch (PendingIntent.CanceledException localCanceledException)
          {
            localObject3 = "WalletClientImpl";
            localObject4 = "Exception setting pending result";
            Log.w((String)localObject3, (String)localObject4, localCanceledException);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzse$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */