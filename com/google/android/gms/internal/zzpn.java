package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.identity.intents.UserAddressRequest;

public class zzpn
  extends zzj
{
  private Activity mActivity;
  private final int mTheme;
  private final String zzVa;
  private zzpn.zza zzaMC;
  
  public zzpn(Activity paramActivity, Looper paramLooper, zzf paramzzf, int paramInt, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramActivity, paramLooper, 12, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject = paramzzf.getAccountName();
    this.zzVa = ((String)localObject);
    this.mActivity = paramActivity;
    this.mTheme = paramInt;
  }
  
  public void disconnect()
  {
    super.disconnect();
    zzpn.zza localzza = this.zzaMC;
    if (localzza != null)
    {
      localzza = this.zzaMC;
      zzpn.zza.zza(localzza, null);
      this.zzaMC = null;
    }
  }
  
  public void zza(UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    zzyx();
    Object localObject1 = new com/google/android/gms/internal/zzpn$zza;
    Object localObject2 = this.mActivity;
    ((zzpn.zza)localObject1).<init>(paramInt, (Activity)localObject2);
    this.zzaMC = ((zzpn.zza)localObject1);
    try
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      localObject2 = getContext();
      localObject2 = ((Context)localObject2).getPackageName();
      localObject3 = "com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME";
      ((Bundle)localObject1).putString((String)localObject3, (String)localObject2);
      localObject2 = this.zzVa;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool)
      {
        localObject2 = "com.google.android.gms.identity.intents.EXTRA_ACCOUNT";
        localObject3 = new android/accounts/Account;
        String str1 = this.zzVa;
        String str2 = "com.google";
        ((Account)localObject3).<init>(str1, str2);
        ((Bundle)localObject1).putParcelable((String)localObject2, (Parcelable)localObject3);
      }
      localObject2 = "com.google.android.gms.identity.intents.EXTRA_THEME";
      i = this.mTheme;
      ((Bundle)localObject1).putInt((String)localObject2, i);
      localObject2 = zzyw();
      localObject3 = this.zzaMC;
      ((zzpp)localObject2).zza((zzpo)localObject3, paramUserAddressRequest, (Bundle)localObject1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject3 = "Exception requesting user address";
        Log.e("AddressClientImpl", (String)localObject3, localRemoteException);
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
        localObject2 = this.zzaMC;
        int i = 1;
        ((zzpn.zza)localObject2).zzh(i, localBundle);
      }
    }
  }
  
  protected zzpp zzca(IBinder paramIBinder)
  {
    return zzpp.zza.zzcc(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.identity.service.BIND";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.identity.intents.internal.IAddressService";
  }
  
  public boolean zzqK()
  {
    return true;
  }
  
  protected zzpp zzyw()
  {
    return (zzpp)super.zzqJ();
  }
  
  protected void zzyx()
  {
    super.zzqI();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */