package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.zzas;
import com.google.android.gms.internal.zzas.zza;
import java.io.IOException;

final class zzd$1
  implements zzd.zza
{
  zzd$1(Account paramAccount, String paramString, Bundle paramBundle) {}
  
  public TokenData zzam(IBinder paramIBinder)
  {
    Object localObject1 = zzas.zza.zza(paramIBinder);
    Object localObject2 = this.zzVg;
    Object localObject3 = this.zzVh;
    Bundle localBundle = this.zzVi;
    localObject1 = (Bundle)zzd.zzn(((zzas)localObject1).zza((Account)localObject2, (String)localObject3, localBundle));
    localObject2 = TokenData.zzc((Bundle)localObject1, "tokenDetails");
    if (localObject2 != null) {
      return (TokenData)localObject2;
    }
    localObject2 = ((Bundle)localObject1).getString("Error");
    localObject1 = (Intent)((Bundle)localObject1).getParcelable("userRecoveryIntent");
    localObject3 = com.google.android.gms.auth.firstparty.shared.zzd.zzbY((String)localObject2);
    boolean bool1 = com.google.android.gms.auth.firstparty.shared.zzd.zza((com.google.android.gms.auth.firstparty.shared.zzd)localObject3);
    if (bool1)
    {
      localObject3 = new com/google/android/gms/auth/UserRecoverableAuthException;
      ((UserRecoverableAuthException)localObject3).<init>((String)localObject2, (Intent)localObject1);
      throw ((Throwable)localObject3);
    }
    boolean bool2 = com.google.android.gms.auth.firstparty.shared.zzd.zzc((com.google.android.gms.auth.firstparty.shared.zzd)localObject3);
    if (bool2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = new com/google/android/gms/auth/GoogleAuthException;
    ((GoogleAuthException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */