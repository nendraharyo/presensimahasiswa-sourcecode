package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.zzq;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzj.zzf;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrn;
import com.google.android.gms.internal.zzro;

public class zzh
  extends zzj
  implements zzrn
{
  private final zzf zzahz;
  private Integer zzale;
  private final Bundle zzbgU;
  private final boolean zzbhi;
  
  public zzh(Context paramContext, Looper paramLooper, boolean paramBoolean, zzf paramzzf, Bundle paramBundle, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 44, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzbhi = paramBoolean;
    this.zzahz = paramzzf;
    this.zzbgU = paramBundle;
    localObject = paramzzf.zzqz();
    this.zzale = ((Integer)localObject);
  }
  
  public zzh(Context paramContext, Looper paramLooper, boolean paramBoolean, zzf paramzzf, zzro paramzzro, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, paramBoolean, paramzzf, localBundle, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  private ResolveAccountRequest zzFN()
  {
    Account localAccount = this.zzahz.zzqq();
    GoogleSignInAccount localGoogleSignInAccount = null;
    Object localObject = "<<default account>>";
    String str = localAccount.name;
    boolean bool = ((String)localObject).equals(str);
    if (bool) {
      localGoogleSignInAccount = zzq.zzaf(getContext()).zzno();
    }
    localObject = new com/google/android/gms/common/internal/ResolveAccountRequest;
    int i = this.zzale.intValue();
    ((ResolveAccountRequest)localObject).<init>(localAccount, i, localGoogleSignInAccount);
    return (ResolveAccountRequest)localObject;
  }
  
  public static Bundle zza(zzf paramzzf)
  {
    zzro localzzro = paramzzf.zzqy();
    Object localObject = paramzzf.zzqz();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str = "com.google.android.gms.signin.internal.clientRequestedAccount";
    Account localAccount = paramzzf.getAccount();
    localBundle.putParcelable(str, localAccount);
    if (localObject != null)
    {
      str = "com.google.android.gms.common.internal.ClientSettings.sessionId";
      int i = ((Integer)localObject).intValue();
      localBundle.putInt(str, i);
    }
    if (localzzro != null)
    {
      boolean bool1 = localzzro.zzFH();
      localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", bool1);
      bool1 = localzzro.zzmO();
      localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", bool1);
      str = localzzro.zzmR();
      localBundle.putString("com.google.android.gms.signin.internal.serverClientId", str);
      localBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
      bool1 = localzzro.zzmQ();
      localBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", bool1);
      str = localzzro.zzmS();
      localBundle.putString("com.google.android.gms.signin.internal.hostedDomain", str);
      localObject = "com.google.android.gms.signin.internal.waitForAccessTokenRefresh";
      boolean bool2 = localzzro.zzFI();
      localBundle.putBoolean((String)localObject, bool2);
    }
    return localBundle;
  }
  
  public void connect()
  {
    zzj.zzf localzzf = new com/google/android/gms/common/internal/zzj$zzf;
    localzzf.<init>(this);
    zza(localzzf);
  }
  
  public void zzFG()
  {
    try
    {
      Object localObject1 = zzqJ();
      localObject1 = (zze)localObject1;
      localObject2 = this.zzale;
      int i = ((Integer)localObject2).intValue();
      ((zze)localObject1).zzka(i);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "SignInClientImpl";
        Object localObject2 = "Remote service probably died when clearAccountFromSessionStore is called";
        Log.w(str, (String)localObject2);
      }
    }
  }
  
  public void zza(zzp paramzzp, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = zzqJ();
      localObject1 = (zze)localObject1;
      localObject2 = this.zzale;
      int i = ((Integer)localObject2).intValue();
      ((zze)localObject1).zza(paramzzp, i, paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "SignInClientImpl";
        Object localObject2 = "Remote service probably died when saveDefaultAccount is called";
        Log.w(str, (String)localObject2);
      }
    }
  }
  
  public void zza(zzd paramzzd)
  {
    Object localObject1 = "Expecting a valid ISignInCallbacks";
    zzx.zzb(paramzzd, localObject1);
    try
    {
      localObject2 = zzFN();
      localObject1 = zzqJ();
      localObject1 = (zze)localObject1;
      localObject3 = new com/google/android/gms/signin/internal/SignInRequest;
      ((SignInRequest)localObject3).<init>((ResolveAccountRequest)localObject2);
      ((zze)localObject1).zza((SignInRequest)localObject3, paramzzd);
      return;
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        Object localObject2 = "SignInClientImpl";
        Object localObject3 = "Remote service probably died when signIn is called";
        Log.w((String)localObject2, (String)localObject3);
        try
        {
          localObject2 = new com/google/android/gms/signin/internal/SignInResponse;
          int i = 8;
          ((SignInResponse)localObject2).<init>(i);
          paramzzd.zzb((SignInResponse)localObject2);
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "SignInClientImpl";
          localObject3 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.";
          Log.wtf(str, (String)localObject3, localRemoteException1);
        }
      }
    }
  }
  
  protected zze zzec(IBinder paramIBinder)
  {
    return zze.zza.zzeb(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public boolean zzmE()
  {
    return this.zzbhi;
  }
  
  protected Bundle zzml()
  {
    Object localObject = this.zzahz.zzqv();
    String str1 = getContext().getPackageName();
    boolean bool = str1.equals(localObject);
    if (!bool)
    {
      localObject = this.zzbgU;
      str1 = "com.google.android.gms.signin.internal.realClientPackageName";
      String str2 = this.zzahz.zzqv();
      ((Bundle)localObject).putString(str1, str2);
    }
    return this.zzbgU;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */