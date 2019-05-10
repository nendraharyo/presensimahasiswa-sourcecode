package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GoogleSignInOptions$Builder
{
  private Account zzTI;
  private boolean zzXa;
  private boolean zzXb;
  private boolean zzXc;
  private String zzXd;
  private String zzXe;
  private Set zzXf;
  
  public GoogleSignInOptions$Builder()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzXf = localHashSet;
  }
  
  public GoogleSignInOptions$Builder(GoogleSignInOptions paramGoogleSignInOptions)
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzXf = ((Set)localObject);
    zzx.zzz(paramGoogleSignInOptions);
    localObject = new java/util/HashSet;
    ArrayList localArrayList = GoogleSignInOptions.zzb(paramGoogleSignInOptions);
    ((HashSet)localObject).<init>(localArrayList);
    this.zzXf = ((Set)localObject);
    boolean bool = GoogleSignInOptions.zzc(paramGoogleSignInOptions);
    this.zzXb = bool;
    bool = GoogleSignInOptions.zzd(paramGoogleSignInOptions);
    this.zzXc = bool;
    bool = GoogleSignInOptions.zze(paramGoogleSignInOptions);
    this.zzXa = bool;
    localObject = GoogleSignInOptions.zzf(paramGoogleSignInOptions);
    this.zzXd = ((String)localObject);
    localObject = GoogleSignInOptions.zzg(paramGoogleSignInOptions);
    this.zzTI = ((Account)localObject);
    localObject = GoogleSignInOptions.zzh(paramGoogleSignInOptions);
    this.zzXe = ((String)localObject);
  }
  
  private String zzbK(String paramString)
  {
    zzx.zzcM(paramString);
    String str = this.zzXd;
    boolean bool;
    if (str != null)
    {
      str = this.zzXd;
      bool = str.equals(paramString);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "two different server client ids provided");
      return paramString;
      bool = false;
      str = null;
    }
  }
  
  public GoogleSignInOptions build()
  {
    boolean bool1 = this.zzXa;
    if (bool1)
    {
      localObject = this.zzTI;
      if (localObject != null)
      {
        localObject = this.zzXf;
        bool1 = ((Set)localObject).isEmpty();
        if (bool1) {}
      }
      else
      {
        requestId();
      }
    }
    Object localObject = new com/google/android/gms/auth/api/signin/GoogleSignInOptions;
    Set localSet = this.zzXf;
    Account localAccount = this.zzTI;
    boolean bool2 = this.zzXa;
    boolean bool3 = this.zzXb;
    boolean bool4 = this.zzXc;
    String str1 = this.zzXd;
    String str2 = this.zzXe;
    ((GoogleSignInOptions)localObject).<init>(localSet, localAccount, bool2, bool3, bool4, str1, str2, null);
    return (GoogleSignInOptions)localObject;
  }
  
  public Builder requestEmail()
  {
    Set localSet = this.zzXf;
    Scope localScope = GoogleSignInOptions.zzWX;
    localSet.add(localScope);
    return this;
  }
  
  public Builder requestId()
  {
    Set localSet = this.zzXf;
    Scope localScope = GoogleSignInOptions.zzWY;
    localSet.add(localScope);
    return this;
  }
  
  public Builder requestIdToken(String paramString)
  {
    this.zzXa = true;
    String str = zzbK(paramString);
    this.zzXd = str;
    return this;
  }
  
  public Builder requestProfile()
  {
    Set localSet = this.zzXf;
    Scope localScope = GoogleSignInOptions.zzWW;
    localSet.add(localScope);
    return this;
  }
  
  public Builder requestScopes(Scope paramScope, Scope... paramVarArgs)
  {
    this.zzXf.add(paramScope);
    Set localSet = this.zzXf;
    List localList = Arrays.asList(paramVarArgs);
    localSet.addAll(localList);
    return this;
  }
  
  public Builder requestServerAuthCode(String paramString)
  {
    return requestServerAuthCode(paramString, false);
  }
  
  public Builder requestServerAuthCode(String paramString, boolean paramBoolean)
  {
    this.zzXb = true;
    String str = zzbK(paramString);
    this.zzXd = str;
    this.zzXc = paramBoolean;
    return this;
  }
  
  public Builder setAccountName(String paramString)
  {
    Account localAccount = new android/accounts/Account;
    String str = zzx.zzcM(paramString);
    localAccount.<init>(str, "com.google");
    this.zzTI = localAccount;
    return this;
  }
  
  public Builder setHostedDomain(String paramString)
  {
    String str = zzx.zzcM(paramString);
    this.zzXe = str;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\GoogleSignInOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */