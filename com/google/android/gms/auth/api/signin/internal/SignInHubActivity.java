package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.i;
import android.support.v4.app.t;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzlf.zza;
import com.google.android.gms.internal.zzlh;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SignInHubActivity
  extends i
{
  private zzq zzXP;
  private zzk zzXQ;
  private SignInConfiguration zzXR;
  private boolean zzXS;
  private String zzXT;
  private String zzXU;
  private boolean zzXV;
  private int zzXW;
  private Intent zzXX;
  
  private void zza(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = this.zzXQ.zznh();
    Iterator localIterator = ((Collection)localObject1).iterator();
    boolean bool;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzlf)localIterator.next();
      Object localObject2 = this.zzXU;
      localObject2 = zzbO((String)localObject2);
      bool = ((zzlf)localObject1).zza(paramInt1, paramInt2, paramIntent, (zzlf.zza)localObject2);
    } while (!bool);
    if (paramInt2 == 0) {
      finish();
    }
  }
  
  private void zza(int paramInt, Intent paramIntent)
  {
    int i = 8;
    Object localObject1;
    boolean bool;
    if (paramIntent != null)
    {
      localObject1 = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
      if (localObject1 != null)
      {
        Object localObject2 = ((SignInAccount)localObject1).zzmV();
        if (localObject2 != null)
        {
          localObject1 = ((SignInAccount)localObject1).zzmV();
          localObject2 = this.zzXP;
          GoogleSignInOptions localGoogleSignInOptions = this.zzXR.zznm();
          ((zzq)localObject2).zzb((GoogleSignInAccount)localObject1, localGoogleSignInOptions);
          paramIntent.removeExtra("signInAccount");
          localObject2 = "googleSignInAccount";
          paramIntent.putExtra((String)localObject2, (Parcelable)localObject1);
          bool = true;
          this.zzXV = bool;
          this.zzXW = paramInt;
          this.zzXX = paramIntent;
          zzd(paramInt, paramIntent);
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = "errorCode";
      bool = paramIntent.hasExtra((String)localObject1);
      if (bool)
      {
        localObject1 = "errorCode";
        int j = paramIntent.getIntExtra((String)localObject1, i);
        zzaS(j);
      }
      else
      {
        zzaS(i);
      }
    }
  }
  
  private void zzaR(int paramInt)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent.putExtra("errorCode", paramInt);
    setResult(0, localIntent);
    finish();
  }
  
  private void zzaS(int paramInt)
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent.putExtra("googleSignInStatus", localStatus);
    setResult(0, localIntent);
    finish();
  }
  
  private void zzb(int paramInt, Intent paramIntent)
  {
    int i = 2;
    int j = 1;
    int k = -1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (paramInt == k)
    {
      localObject1 = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
      if (localObject1 != null)
      {
        localObject2 = this.zzXP;
        localObject3 = this.zzXR;
        ((zzq)localObject2).zzb((SignInAccount)localObject1, (SignInConfiguration)localObject3);
        localObject2 = paramIntent.getStringExtra("accessToken");
        boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool1)
        {
          localObject3 = this.zzXU;
          bool1 = TextUtils.isEmpty((CharSequence)localObject3);
          if (!bool1)
          {
            localObject3 = new java/util/HashSet;
            localObject4 = Arrays.asList(TextUtils.split(this.zzXU, " "));
            ((HashSet)localObject3).<init>((Collection)localObject4);
            localObject1 = zzm.zzbN(((SignInAccount)localObject1).getUserId());
            localObject4 = new com/google/android/gms/auth/api/signin/internal/zzm$zza;
            String str = "accessTokenExpiresAtSecs";
            long l1 = 0L;
            long l2 = paramIntent.getLongExtra(str, l1);
            ((zzm.zza)localObject4).<init>((String)localObject2, l2);
            ((zzm)localObject1).zza((Set)localObject3, (zzm.zza)localObject4);
            localObject1 = "accessTokenExpiresAtSecs";
            paramIntent.removeExtra((String)localObject1);
          }
        }
        setResult(k, paramIntent);
        finish();
      }
    }
    for (;;)
    {
      return;
      localObject1 = "AuthSignInClient";
      localObject2 = "[SignInHubActivity] SignInAccount is null.";
      Log.w((String)localObject1, (String)localObject2);
      zzaR(i);
      continue;
      if (paramIntent == null)
      {
        finish();
      }
      else
      {
        localObject1 = paramIntent.getStringExtra("email");
        localObject2 = zzd.zzbL(paramIntent.getStringExtra("idProvider"));
        if (localObject2 == null)
        {
          setResult(paramInt, paramIntent);
          finish();
        }
        else
        {
          localObject3 = paramIntent.getStringExtra("pendingToken");
          this.zzXT = ((String)localObject3);
          localObject3 = this.zzXQ.zza((zzd)localObject2);
          if (localObject3 == null)
          {
            localObject1 = ((zzd)localObject2).zzae(this);
            localObject2 = "AuthSignInClient";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject1 = ((StringBuilder)localObject3).append(localObject1);
            localObject3 = " is not supported. Please check your configuration";
            localObject1 = (String)localObject3;
            Log.w((String)localObject2, (String)localObject1);
            zzaR(j);
          }
          else
          {
            localObject2 = "idpAction";
            int m = paramIntent.getIntExtra((String)localObject2, k);
            int n;
            if (m == 0)
            {
              n = TextUtils.isEmpty((CharSequence)localObject1);
              if (n != 0)
              {
                localObject1 = this.zzXU;
                localObject1 = zzbO((String)localObject1);
                ((zzlf)localObject3).zza((zzlf.zza)localObject1);
              }
              else
              {
                localObject2 = this.zzXU;
                localObject2 = zzbO((String)localObject2);
                ((zzlf)localObject3).zza((String)localObject1, (zzlf.zza)localObject2);
              }
            }
            else
            {
              if (n == j)
              {
                localObject2 = this.zzXT;
                boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
                if (!bool2)
                {
                  bool2 = TextUtils.isEmpty((CharSequence)localObject1);
                  if (!bool2)
                  {
                    localObject2 = this.zzXT;
                    localObject4 = this.zzXU;
                    localObject4 = zzbO((String)localObject4);
                    ((zzlf)localObject3).zza((String)localObject1, (String)localObject2, (zzlf.zza)localObject4);
                    continue;
                  }
                }
              }
              localObject1 = "AuthSignInClient";
              localObject2 = "Internal error!";
              Log.w((String)localObject1, (String)localObject2);
              zzaR(i);
            }
          }
        }
      }
    }
  }
  
  private zzlf.zza zzbO(String paramString)
  {
    SignInHubActivity.1 local1 = new com/google/android/gms/auth/api/signin/internal/SignInHubActivity$1;
    local1.<init>(this, paramString);
    return local1;
  }
  
  private void zzc(int paramInt, Intent paramIntent)
  {
    Intent localIntent;
    if (paramInt == 0)
    {
      localIntent = null;
      setResult(0, paramIntent);
      finish();
    }
    for (;;)
    {
      return;
      localIntent = new android/content/Intent;
      localIntent.<init>("com.google.android.gms.auth.VERIFY_ASSERTION");
      Object localObject = IdpTokenType.zzXA;
      localIntent.putExtra("idpTokenType", (Parcelable)localObject);
      localObject = paramIntent.getStringExtra("idpToken");
      localIntent.putExtra("idpToken", (String)localObject);
      localObject = this.zzXT;
      localIntent.putExtra("pendingToken", (String)localObject);
      String str = "idProvider";
      localObject = zzd.zzXi.zzmT();
      localIntent.putExtra(str, (String)localObject);
      zzj(localIntent);
    }
  }
  
  private void zzd(int paramInt, Intent paramIntent)
  {
    t localt = getSupportLoaderManager();
    SignInHubActivity.zza localzza = new com/google/android/gms/auth/api/signin/internal/SignInHubActivity$zza;
    localzza.<init>(this, null);
    localt.a(0, null, localzza);
  }
  
  private void zzj(Intent paramIntent)
  {
    paramIntent.setPackage("com.google.android.gms");
    String str1 = "config";
    Object localObject = this.zzXR;
    paramIntent.putExtra(str1, (Parcelable)localObject);
    boolean bool1 = this.zzXS;
    int i;
    if (bool1) {
      i = 40962;
    }
    try
    {
      startActivityForResult(paramIntent, i);
      return;
      i = 40961;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        String str2 = "AuthSignInClient";
        localObject = "Could not launch sign in Intent. Google Play Service is probably being updated...";
        Log.w(str2, (String)localObject);
        boolean bool2 = this.zzXS;
        int j;
        if (bool2)
        {
          j = 8;
          zzaS(j);
        }
        else
        {
          j = 2;
          zzaR(j);
        }
      }
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    setResult(0);
    switch (paramInt1)
    {
    default: 
      zza(paramInt1, paramInt2, paramIntent);
    }
    for (;;)
    {
      return;
      zza(paramInt2, paramIntent);
      continue;
      zzb(paramInt2, paramIntent);
      continue;
      zzc(paramInt2, paramIntent);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject1 = null;
    super.onCreate(paramBundle);
    Object localObject2 = zzq.zzaf(this);
    this.zzXP = ((zzq)localObject2);
    Object localObject4 = getIntent();
    localObject2 = (SignInConfiguration)((Intent)localObject4).getParcelableExtra("config");
    this.zzXR = ((SignInConfiguration)localObject2);
    Object localObject5 = ((Intent)localObject4).getAction();
    boolean bool1 = "com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(localObject5);
    this.zzXS = bool1;
    localObject2 = ((Intent)localObject4).getStringExtra("scopes");
    this.zzXU = ((String)localObject2);
    localObject2 = this.zzXR;
    if (localObject2 == null)
    {
      localObject1 = "Activity started with invalid configuration.";
      Log.e("AuthSignInClient", (String)localObject1);
      bool1 = false;
      localObject2 = null;
      setResult(0);
      finish();
      return;
    }
    localObject2 = new java/util/LinkedList;
    ((LinkedList)localObject2).<init>();
    localObject5 = new java/util/HashMap;
    ((HashMap)localObject5).<init>();
    zzi.zza(this.zzXR, (List)localObject2, (Map)localObject5);
    Object localObject6 = new com/google/android/gms/auth/api/signin/internal/zzk;
    ((zzk)localObject6).<init>(this, (List)localObject2, (Map)localObject5);
    this.zzXQ = ((zzk)localObject6);
    if (paramBundle == null)
    {
      bool1 = this.zzXS;
      if (bool1)
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        localObject5 = localObject2;
        bool1 = false;
        localObject2 = null;
      }
    }
    for (;;)
    {
      if (localObject2 != null)
      {
        localObject2 = ((SignInAccount)localObject2).zzmU();
        localObject4 = zzd.zzXi;
        if (localObject2 == localObject4)
        {
          localObject2 = this.zzXU;
          localObject2 = zzbO((String)localObject2);
          null.zza((zzlf.zza)localObject2);
          break;
          localObject5 = new android/content/Intent;
          ((Intent)localObject5).<init>("com.google.android.gms.auth.LOGIN_PICKER");
          localObject2 = "com.google.android.gms.auth.RESOLVE_CREDENTIAL";
          localObject6 = ((Intent)localObject4).getAction();
          bool1 = ((String)localObject2).equals(localObject6);
          int i;
          if (bool1)
          {
            i = 3;
            ((Intent)localObject5).fillIn((Intent)localObject4, i);
            localObject2 = (SignInAccount)((Intent)localObject4).getParcelableExtra("signInAccount");
            continue;
          }
          localObject2 = this.zzXP;
          ((zzq)localObject2).zznq();
          if (0 == 0) {
            break label432;
          }
          try
          {
            zzlh.zzag(this);
            i = 0;
            localObject2 = null;
          }
          catch (IllegalStateException localIllegalStateException)
          {
            i = 0;
            localObject3 = null;
          }
          continue;
        }
      }
      zzj((Intent)localObject5);
      break;
      Object localObject3 = paramBundle.getString("pendingToken");
      this.zzXT = ((String)localObject3);
      localObject3 = "signingInGoogleApiClients";
      boolean bool2 = paramBundle.getBoolean((String)localObject3);
      this.zzXV = bool2;
      bool2 = this.zzXV;
      if (!bool2) {
        break;
      }
      int j = paramBundle.getInt("signInResultCode");
      this.zzXW = j;
      localObject3 = (Intent)paramBundle.getParcelable("signInResultData");
      this.zzXX = ((Intent)localObject3);
      j = this.zzXW;
      localObject1 = this.zzXX;
      zzd(j, (Intent)localObject1);
      break;
      label432:
      j = 0;
      localObject3 = null;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = this.zzXT;
    paramBundle.putString("pendingToken", (String)localObject);
    String str = "signingInGoogleApiClients";
    boolean bool1 = this.zzXV;
    paramBundle.putBoolean(str, bool1);
    boolean bool2 = this.zzXV;
    if (bool2)
    {
      int i = this.zzXW;
      paramBundle.putInt("signInResultCode", i);
      str = "signInResultData";
      localObject = this.zzXX;
      paramBundle.putParcelable(str, (Parcelable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\SignInHubActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */