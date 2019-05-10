package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.zze;

public class zza
  extends zzp.zza
{
  private Context mContext;
  private Account zzTI;
  int zzakz;
  
  public static Account zza(zzp paramzzp)
  {
    Account localAccount = null;
    if (paramzzp != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localAccount = paramzzp.getAccount();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "AccountAccessor";
        String str2 = "Remote account accessor probably died";
        Log.w(str1, str2);
        Binder.restoreCallingIdentity(l);
      }
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
    return localAccount;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof zza;
      Account localAccount1;
      if (!bool)
      {
        bool = false;
        localAccount1 = null;
      }
      else
      {
        localAccount1 = this.zzTI;
        paramObject = (zza)paramObject;
        Account localAccount2 = ((zza)paramObject).zzTI;
        bool = localAccount1.equals(localAccount2);
      }
    }
  }
  
  public Account getAccount()
  {
    int i = Binder.getCallingUid();
    int j = this.zzakz;
    if (i == j) {}
    for (Object localObject = this.zzTI;; localObject = this.zzTI)
    {
      return (Account)localObject;
      Context localContext = this.mContext;
      boolean bool = zze.zzf(localContext, i);
      if (!bool) {
        break;
      }
      this.zzakz = i;
    }
    localObject = new java/lang/SecurityException;
    ((SecurityException)localObject).<init>("Caller is not GooglePlayServices");
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */