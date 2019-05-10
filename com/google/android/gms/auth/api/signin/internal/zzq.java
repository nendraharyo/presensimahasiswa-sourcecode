package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class zzq
{
  private static final Lock zzYa;
  private static zzq zzYb;
  private final Lock zzYc;
  private final SharedPreferences zzYd;
  
  static
  {
    ReentrantLock localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    zzYa = localReentrantLock;
  }
  
  zzq(Context paramContext)
  {
    Object localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.zzYc = ((Lock)localObject);
    localObject = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
    this.zzYd = ((SharedPreferences)localObject);
  }
  
  public static zzq zzaf(Context paramContext)
  {
    zzx.zzz(paramContext);
    Object localObject1 = zzYa;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = zzYb;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/auth/api/signin/internal/zzq;
        Context localContext = paramContext.getApplicationContext();
        ((zzq)localObject1).<init>(localContext);
        zzYb = (zzq)localObject1;
      }
      localObject1 = zzYb;
      return (zzq)localObject1;
    }
    finally
    {
      zzYa.unlock();
    }
  }
  
  private String zzs(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return paramString1 + ":" + paramString2;
  }
  
  void zza(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzx.zzz(paramGoogleSignInAccount);
    zzx.zzz(paramGoogleSignInOptions);
    String str1 = paramGoogleSignInAccount.zzmL();
    String str2 = zzs("googleSignInAccount", str1);
    String str3 = paramGoogleSignInAccount.zzmM();
    zzr(str2, str3);
    str1 = zzs("googleSignInOptions", str1);
    str2 = paramGoogleSignInOptions.zzmI();
    zzr(str1, str2);
  }
  
  void zza(SignInAccount paramSignInAccount, SignInConfiguration paramSignInConfiguration)
  {
    zzx.zzz(paramSignInAccount);
    zzx.zzz(paramSignInConfiguration);
    Object localObject1 = paramSignInAccount.getUserId();
    Object localObject2 = zzbP((String)localObject1);
    if (localObject2 != null)
    {
      localObject3 = ((SignInAccount)localObject2).zzmV();
      if (localObject3 != null)
      {
        localObject2 = ((SignInAccount)localObject2).zzmV().zzmL();
        zzbU((String)localObject2);
      }
    }
    localObject2 = zzs("signInConfiguration", (String)localObject1);
    Object localObject3 = paramSignInConfiguration.zzmI();
    zzr((String)localObject2, (String)localObject3);
    localObject1 = zzs("signInAccount", (String)localObject1);
    localObject2 = paramSignInAccount.zzmI();
    zzr((String)localObject1, (String)localObject2);
    localObject1 = paramSignInAccount.zzmV();
    if (localObject1 != null)
    {
      localObject1 = paramSignInAccount.zzmV();
      localObject2 = paramSignInConfiguration.zznm();
      zza((GoogleSignInAccount)localObject1, (GoogleSignInOptions)localObject2);
    }
  }
  
  public void zzb(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzx.zzz(paramGoogleSignInAccount);
    zzx.zzz(paramGoogleSignInOptions);
    String str = paramGoogleSignInAccount.zzmL();
    zzr("defaultGoogleSignInAccount", str);
    zza(paramGoogleSignInAccount, paramGoogleSignInOptions);
  }
  
  public void zzb(SignInAccount paramSignInAccount, SignInConfiguration paramSignInConfiguration)
  {
    zzx.zzz(paramSignInAccount);
    zzx.zzz(paramSignInConfiguration);
    zznq();
    String str = paramSignInAccount.getUserId();
    zzr("defaultSignInAccount", str);
    Object localObject = paramSignInAccount.zzmV();
    if (localObject != null)
    {
      localObject = "defaultGoogleSignInAccount";
      str = paramSignInAccount.zzmV().zzmL();
      zzr((String)localObject, str);
    }
    zza(paramSignInAccount, paramSignInConfiguration);
  }
  
  SignInAccount zzbP(String paramString)
  {
    Object localObject1 = null;
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1) {}
    for (;;)
    {
      return (SignInAccount)localObject1;
      Object localObject2 = zzs("signInAccount", paramString);
      localObject2 = zzbS((String)localObject2);
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool2) {
        try
        {
          localObject2 = SignInAccount.zzbM((String)localObject2);
          Object localObject3 = ((SignInAccount)localObject2).zzmV();
          if (localObject3 != null)
          {
            localObject3 = ((SignInAccount)localObject2).zzmV();
            localObject3 = ((GoogleSignInAccount)localObject3).zzmL();
            localObject3 = zzbQ((String)localObject3);
            if (localObject3 != null) {
              ((SignInAccount)localObject2).zza((GoogleSignInAccount)localObject3);
            }
          }
          localObject1 = localObject2;
        }
        catch (JSONException localJSONException) {}
      }
    }
  }
  
  GoogleSignInAccount zzbQ(String paramString)
  {
    GoogleSignInAccount localGoogleSignInAccount = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return localGoogleSignInAccount;
      String str = zzs("googleSignInAccount", paramString);
      str = zzbS(str);
      if (str != null) {
        try
        {
          localGoogleSignInAccount = GoogleSignInAccount.zzbH(str);
        }
        catch (JSONException localJSONException) {}
      }
    }
  }
  
  GoogleSignInOptions zzbR(String paramString)
  {
    GoogleSignInOptions localGoogleSignInOptions = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return localGoogleSignInOptions;
      String str = zzs("googleSignInOptions", paramString);
      str = zzbS(str);
      if (str != null) {
        try
        {
          localGoogleSignInOptions = GoogleSignInOptions.zzbJ(str);
        }
        catch (JSONException localJSONException) {}
      }
    }
  }
  
  protected String zzbS(String paramString)
  {
    Object localObject1 = this.zzYc;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzYd;
      localObject1 = ((SharedPreferences)localObject1).getString(paramString, null);
      return (String)localObject1;
    }
    finally
    {
      this.zzYc.unlock();
    }
  }
  
  void zzbT(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject1 = zzbP(paramString);
      Object localObject2 = zzs("signInAccount", paramString);
      zzbV((String)localObject2);
      localObject2 = zzs("signInConfiguration", paramString);
      zzbV((String)localObject2);
      if (localObject1 != null)
      {
        localObject2 = ((SignInAccount)localObject1).zzmV();
        if (localObject2 != null)
        {
          localObject1 = ((SignInAccount)localObject1).zzmV().zzmL();
          zzbU((String)localObject1);
        }
      }
    }
  }
  
  void zzbU(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return;
      String str = zzs("googleSignInAccount", paramString);
      zzbV(str);
      str = zzs("googleSignInOptions", paramString);
      zzbV(str);
    }
  }
  
  protected void zzbV(String paramString)
  {
    Object localObject1 = this.zzYc;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzYd;
      localObject1 = ((SharedPreferences)localObject1).edit();
      localObject1 = ((SharedPreferences.Editor)localObject1).remove(paramString);
      ((SharedPreferences.Editor)localObject1).apply();
      return;
    }
    finally
    {
      this.zzYc.unlock();
    }
  }
  
  public GoogleSignInAccount zzno()
  {
    String str = zzbS("defaultGoogleSignInAccount");
    return zzbQ(str);
  }
  
  public GoogleSignInOptions zznp()
  {
    String str = zzbS("defaultGoogleSignInAccount");
    return zzbR(str);
  }
  
  public void zznq()
  {
    String str = zzbS("defaultSignInAccount");
    zzbV("defaultSignInAccount");
    zznr();
    zzbT(str);
  }
  
  public void zznr()
  {
    String str = zzbS("defaultGoogleSignInAccount");
    zzbV("defaultGoogleSignInAccount");
    zzbU(str);
  }
  
  protected void zzr(String paramString1, String paramString2)
  {
    Object localObject1 = this.zzYc;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = this.zzYd;
      localObject1 = ((SharedPreferences)localObject1).edit();
      localObject1 = ((SharedPreferences.Editor)localObject1).putString(paramString1, paramString2);
      ((SharedPreferences.Editor)localObject1).apply();
      return;
    }
    finally
    {
      this.zzYc.unlock();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */