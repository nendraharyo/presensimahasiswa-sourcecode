package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.api.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class zzc
  implements GoogleSignInApi
{
  private OptionalPendingResult zza(GoogleApiClient paramGoogleApiClient, GoogleSignInOptions paramGoogleSignInOptions)
  {
    Log.d("GoogleSignInApiImpl", "trySilentSignIn");
    Object localObject = new com/google/android/gms/auth/api/signin/internal/zzc$1;
    ((zzc.1)localObject).<init>(this, paramGoogleApiClient, paramGoogleSignInOptions);
    localObject = paramGoogleApiClient.zza((zza.zza)localObject);
    zzr localzzr = new com/google/android/gms/common/api/internal/zzr;
    localzzr.<init>((PendingResult)localObject);
    return localzzr;
  }
  
  private boolean zza(Account paramAccount1, Account paramAccount2)
  {
    boolean bool;
    if (paramAccount1 == null) {
      if (paramAccount2 == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = paramAccount1.equals(paramAccount2);
    }
  }
  
  private GoogleSignInOptions zzb(GoogleApiClient paramGoogleApiClient)
  {
    Api.zzc localzzc = Auth.zzVx;
    return ((zzd)paramGoogleApiClient.zza(localzzc)).zznd();
  }
  
  public Intent getSignInIntent(GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzz(paramGoogleApiClient);
    Api.zzc localzzc = Auth.zzVx;
    return ((zzd)paramGoogleApiClient.zza(localzzc)).zznc();
  }
  
  public GoogleSignInResult getSignInResultFromIntent(Intent paramIntent)
  {
    boolean bool;
    if (paramIntent != null)
    {
      localObject = "googleSignInStatus";
      bool = paramIntent.hasExtra((String)localObject);
      if (!bool)
      {
        localObject = "googleSignInAccount";
        bool = paramIntent.hasExtra((String)localObject);
        if (bool) {}
      }
    }
    else
    {
      bool = false;
    }
    GoogleSignInResult localGoogleSignInResult;
    for (Object localObject = null;; localObject = localGoogleSignInResult)
    {
      return (GoogleSignInResult)localObject;
      localObject = (GoogleSignInAccount)paramIntent.getParcelableExtra("googleSignInAccount");
      Status localStatus = (Status)paramIntent.getParcelableExtra("googleSignInStatus");
      if (localObject != null) {
        localStatus = Status.zzagC;
      }
      localGoogleSignInResult = new com/google/android/gms/auth/api/signin/GoogleSignInResult;
      localGoogleSignInResult.<init>((GoogleSignInAccount)localObject, localStatus);
    }
  }
  
  public PendingResult revokeAccess(GoogleApiClient paramGoogleApiClient)
  {
    zzq.zzaf(paramGoogleApiClient.getContext()).zznr();
    Object localObject = GoogleApiClient.zzoV();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (GoogleApiClient)localIterator.next();
      ((GoogleApiClient)localObject).zzoW();
    }
    localObject = new com/google/android/gms/auth/api/signin/internal/zzc$3;
    ((zzc.3)localObject).<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
  
  public PendingResult signOut(GoogleApiClient paramGoogleApiClient)
  {
    zzq.zzaf(paramGoogleApiClient.getContext()).zznr();
    Object localObject = GoogleApiClient.zzoV();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (GoogleApiClient)localIterator.next();
      ((GoogleApiClient)localObject).zzoW();
    }
    localObject = new com/google/android/gms/auth/api/signin/internal/zzc$2;
    ((zzc.2)localObject).<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
  
  public OptionalPendingResult silentSignIn(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject1 = zzb(paramGoogleApiClient);
    Object localObject2 = paramGoogleApiClient.getContext();
    localObject2 = zza((Context)localObject2, (GoogleSignInOptions)localObject1);
    if (localObject2 != null) {}
    for (localObject1 = PendingResults.zzb((Result)localObject2, paramGoogleApiClient);; localObject1 = zza(paramGoogleApiClient, (GoogleSignInOptions)localObject1)) {
      return (OptionalPendingResult)localObject1;
    }
  }
  
  public GoogleSignInResult zza(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    GoogleSignInResult localGoogleSignInResult = null;
    Log.d("GoogleSignInApiImpl", "getSavedSignInResultIfEligible");
    zzx.zzz(paramGoogleSignInOptions);
    Object localObject1 = zzq.zzaf(paramContext);
    Object localObject2 = ((zzq)localObject1).zznp();
    if (localObject2 == null) {}
    for (;;)
    {
      return localGoogleSignInResult;
      Object localObject3 = ((GoogleSignInOptions)localObject2).getAccount();
      Object localObject4 = paramGoogleSignInOptions.getAccount();
      boolean bool1 = zza((Account)localObject3, (Account)localObject4);
      if (bool1)
      {
        bool1 = paramGoogleSignInOptions.zzmP();
        if (!bool1)
        {
          bool1 = paramGoogleSignInOptions.zzmO();
          if (bool1)
          {
            bool1 = ((GoogleSignInOptions)localObject2).zzmO();
            if (bool1)
            {
              localObject3 = paramGoogleSignInOptions.zzmR();
              localObject4 = ((GoogleSignInOptions)localObject2).zzmR();
              bool1 = ((String)localObject3).equals(localObject4);
              if (!bool1) {}
            }
          }
          else
          {
            localObject3 = new java/util/HashSet;
            localObject2 = ((GoogleSignInOptions)localObject2).zzmN();
            ((HashSet)localObject3).<init>((Collection)localObject2);
            localObject2 = new java/util/HashSet;
            localObject4 = paramGoogleSignInOptions.zzmN();
            ((HashSet)localObject2).<init>((Collection)localObject4);
            boolean bool2 = ((Set)localObject3).containsAll((Collection)localObject2);
            if (bool2)
            {
              localObject1 = ((zzq)localObject1).zzno();
              if (localObject1 != null)
              {
                bool2 = ((GoogleSignInAccount)localObject1).zzb();
                if (!bool2)
                {
                  localGoogleSignInResult = new com/google/android/gms/auth/api/signin/GoogleSignInResult;
                  localObject2 = Status.zzagC;
                  localGoogleSignInResult.<init>((GoogleSignInAccount)localObject1, (Status)localObject2);
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */