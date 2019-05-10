package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

public final class AdMobExtras
  implements NetworkExtras
{
  private final Bundle mExtras;
  
  public AdMobExtras(Bundle paramBundle)
  {
    Bundle localBundle;
    if (paramBundle != null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>(paramBundle);
    }
    for (;;)
    {
      this.mExtras = localBundle;
      return;
      localBundle = null;
    }
  }
  
  public Bundle getExtras()
  {
    return this.mExtras;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\admob\AdMobExtras.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */