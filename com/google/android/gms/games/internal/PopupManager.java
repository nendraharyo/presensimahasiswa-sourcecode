package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.internal.zzne;

public class PopupManager
{
  protected GamesClientImpl zzaFJ;
  protected PopupManager.PopupLocationInfo zzaFK;
  
  private PopupManager(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    this.zzaFJ = paramGamesClientImpl;
    zzgv(paramInt);
  }
  
  public static PopupManager zza(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    boolean bool = zzne.zzse();
    Object localObject;
    if (bool)
    {
      localObject = new com/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;
      ((PopupManager.PopupManagerHCMR1)localObject).<init>(paramGamesClientImpl, paramInt);
    }
    for (;;)
    {
      return (PopupManager)localObject;
      localObject = new com/google/android/gms/games/internal/PopupManager;
      ((PopupManager)localObject).<init>(paramGamesClientImpl, paramInt);
    }
  }
  
  public void setGravity(int paramInt)
  {
    this.zzaFK.gravity = paramInt;
  }
  
  protected void zzgv(int paramInt)
  {
    PopupManager.PopupLocationInfo localPopupLocationInfo = new com/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    Binder localBinder = new android/os/Binder;
    localBinder.<init>();
    localPopupLocationInfo.<init>(paramInt, localBinder, null);
    this.zzaFK = localPopupLocationInfo;
  }
  
  public void zzp(View paramView) {}
  
  public void zzxh()
  {
    GamesClientImpl localGamesClientImpl = this.zzaFJ;
    IBinder localIBinder = this.zzaFK.zzaFL;
    Bundle localBundle = this.zzaFK.zzxg();
    localGamesClientImpl.zza(localIBinder, localBundle);
  }
  
  public Bundle zzxi()
  {
    return this.zzaFK.zzxg();
  }
  
  public IBinder zzxj()
  {
    return this.zzaFK.zzaFL;
  }
  
  public PopupManager.PopupLocationInfo zzxk()
  {
    return this.zzaFK;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\PopupManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */