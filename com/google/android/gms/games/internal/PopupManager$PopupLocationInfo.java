package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class PopupManager$PopupLocationInfo
{
  public int bottom = 0;
  public int gravity;
  public int left = 0;
  public int right = 0;
  public int top = 0;
  public IBinder zzaFL;
  public int zzaFM = -1;
  
  private PopupManager$PopupLocationInfo(int paramInt, IBinder paramIBinder)
  {
    this.gravity = paramInt;
    this.zzaFL = paramIBinder;
  }
  
  public Bundle zzxg()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    int i = this.gravity;
    localBundle.putInt("popupLocationInfo.gravity", i);
    i = this.zzaFM;
    localBundle.putInt("popupLocationInfo.displayId", i);
    i = this.left;
    localBundle.putInt("popupLocationInfo.left", i);
    i = this.top;
    localBundle.putInt("popupLocationInfo.top", i);
    i = this.right;
    localBundle.putInt("popupLocationInfo.right", i);
    i = this.bottom;
    localBundle.putInt("popupLocationInfo.bottom", i);
    return localBundle;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\PopupManager$PopupLocationInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */