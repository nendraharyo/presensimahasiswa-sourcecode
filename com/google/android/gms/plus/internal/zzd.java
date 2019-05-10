package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import java.util.List;

public abstract interface zzd
  extends IInterface
{
  public abstract String getAccountName();
  
  public abstract String getAuthCode();
  
  public abstract void zzEY();
  
  public abstract boolean zzEZ();
  
  public abstract zzq zza(zzb paramzzb, int paramInt1, int paramInt2, int paramInt3, String paramString);
  
  public abstract void zza(SafeParcelResponse paramSafeParcelResponse);
  
  public abstract void zza(zzb paramzzb);
  
  public abstract void zza(zzb paramzzb, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3);
  
  public abstract void zza(zzb paramzzb, Uri paramUri, Bundle paramBundle);
  
  public abstract void zza(zzb paramzzb, SafeParcelResponse paramSafeParcelResponse);
  
  public abstract void zza(zzb paramzzb, String paramString);
  
  public abstract void zza(zzb paramzzb, String paramString1, String paramString2);
  
  public abstract void zza(zzb paramzzb, List paramList);
  
  public abstract void zza(String paramString, FavaDiagnosticsEntity paramFavaDiagnosticsEntity1, FavaDiagnosticsEntity paramFavaDiagnosticsEntity2);
  
  public abstract void zzb(zzb paramzzb);
  
  public abstract void zzb(zzb paramzzb, String paramString);
  
  public abstract void zzc(zzb paramzzb, String paramString);
  
  public abstract void zzd(zzb paramzzb, String paramString);
  
  public abstract void zze(zzb paramzzb, String paramString);
  
  public abstract void zzfG(String paramString);
  
  public abstract String zzmR();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */