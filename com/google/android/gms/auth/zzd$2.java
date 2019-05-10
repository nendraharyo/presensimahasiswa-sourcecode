package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.zzas;
import com.google.android.gms.internal.zzas.zza;

final class zzd$2
  implements zzd.zza
{
  zzd$2(String paramString, Bundle paramBundle) {}
  
  public Void zzao(IBinder paramIBinder)
  {
    Object localObject1 = zzas.zza.zza(paramIBinder);
    String str = this.zzVj;
    Object localObject2 = this.zzVk;
    localObject1 = (Bundle)zzd.zzn(((zzas)localObject1).zza(str, (Bundle)localObject2));
    str = ((Bundle)localObject1).getString("Error");
    localObject2 = "booleanResult";
    boolean bool = ((Bundle)localObject1).getBoolean((String)localObject2);
    if (!bool)
    {
      localObject1 = new com/google/android/gms/auth/GoogleAuthException;
      ((GoogleAuthException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\zzd$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */