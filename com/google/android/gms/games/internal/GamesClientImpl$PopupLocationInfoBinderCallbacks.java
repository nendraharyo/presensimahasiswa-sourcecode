package com.google.android.gms.games.internal;

final class GamesClientImpl$PopupLocationInfoBinderCallbacks
  extends AbstractGamesClient
{
  private final PopupManager zzaEd;
  
  public GamesClientImpl$PopupLocationInfoBinderCallbacks(PopupManager paramPopupManager)
  {
    this.zzaEd = paramPopupManager;
  }
  
  public PopupLocationInfoParcelable zzws()
  {
    PopupLocationInfoParcelable localPopupLocationInfoParcelable = new com/google/android/gms/games/internal/PopupLocationInfoParcelable;
    PopupManager.PopupLocationInfo localPopupLocationInfo = this.zzaEd.zzxk();
    localPopupLocationInfoParcelable.<init>(localPopupLocationInfo);
    return localPopupLocationInfoParcelable;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$PopupLocationInfoBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */