package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
import com.google.android.gms.auth.api.signin.zzg;
import com.google.android.gms.auth.api.signin.zzg.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import java.util.Iterator;
import java.util.Set;

public class zzd
  extends zzj
{
  private final GoogleSignInOptions zzXx;
  
  public zzd(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleSignInOptions paramGoogleSignInOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, i, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    if (paramGoogleSignInOptions != null) {}
    for (;;)
    {
      localObject1 = paramzzf.zzqt();
      boolean bool = ((Set)localObject1).isEmpty();
      if (bool) {
        break label153;
      }
      localObject2 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;
      ((GoogleSignInOptions.Builder)localObject2).<init>(paramGoogleSignInOptions);
      localObject1 = paramzzf.zzqt();
      localObject3 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Scope)((Iterator)localObject3).next();
        i = 0;
        Scope[] arrayOfScope = new Scope[0];
        ((GoogleSignInOptions.Builder)localObject2).requestScopes((Scope)localObject1, arrayOfScope);
      }
      localObject1 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;
      ((GoogleSignInOptions.Builder)localObject1).<init>();
      paramGoogleSignInOptions = ((GoogleSignInOptions.Builder)localObject1).build();
    }
    paramGoogleSignInOptions = ((GoogleSignInOptions.Builder)localObject2).build();
    label153:
    this.zzXx = paramGoogleSignInOptions;
  }
  
  protected zzh zzaB(IBinder paramIBinder)
  {
    return zzh.zza.zzaD(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  public boolean zznb()
  {
    return true;
  }
  
  public Intent zznc()
  {
    Object localObject1 = new com/google/android/gms/auth/api/signin/zzg$zza;
    Object localObject2 = getContext().getPackageName();
    ((zzg.zza)localObject1).<init>((String)localObject2);
    localObject2 = this.zzXx;
    localObject1 = ((zzg.zza)localObject1).zzi((GoogleSignInOptions)localObject2).zzmY().zzmX();
    localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    Context localContext = getContext();
    ((Intent)localObject2).setClass(localContext, SignInHubActivity.class);
    ((Intent)localObject2).putExtra("config", (Parcelable)localObject1);
    return (Intent)localObject2;
  }
  
  public GoogleSignInOptions zznd()
  {
    return this.zzXx;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */