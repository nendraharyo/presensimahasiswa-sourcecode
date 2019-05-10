package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$PlayerXpForGameCategoriesLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$PlayerXpForGameCategoriesLoadedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzf(int paramInt, Bundle paramBundle)
  {
    Object localObject = getClass().getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject);
    localObject = GamesStatusCodes.zzgc(paramInt);
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.LoadXpForGameCategoriesResultImpl localLoadXpForGameCategoriesResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadXpForGameCategoriesResultImpl;
    localLoadXpForGameCategoriesResultImpl.<init>((Status)localObject, paramBundle);
    localzzb.zzs(localLoadXpForGameCategoriesResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$PlayerXpForGameCategoriesLoadedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */