package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzt;

public abstract interface zze
  extends IInterface
{
  public abstract void zza(int paramInt, Account paramAccount, zzd paramzzd);
  
  public abstract void zza(AuthAccountRequest paramAuthAccountRequest, zzd paramzzd);
  
  public abstract void zza(ResolveAccountRequest paramResolveAccountRequest, zzt paramzzt);
  
  public abstract void zza(zzp paramzzp, int paramInt, boolean paramBoolean);
  
  public abstract void zza(CheckServerAuthResult paramCheckServerAuthResult);
  
  public abstract void zza(RecordConsentRequest paramRecordConsentRequest, zzd paramzzd);
  
  public abstract void zza(SignInRequest paramSignInRequest, zzd paramzzd);
  
  public abstract void zzav(boolean paramBoolean);
  
  public abstract void zzb(zzd paramzzd);
  
  public abstract void zzka(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */