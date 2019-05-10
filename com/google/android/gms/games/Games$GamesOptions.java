package com.google.android.gms.games;

import android.os.Bundle;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import java.util.ArrayList;

public final class Games$GamesOptions
  implements Api.ApiOptions.Optional
{
  public final boolean zzaCE;
  public final boolean zzaCF;
  public final int zzaCG;
  public final boolean zzaCH;
  public final int zzaCI;
  public final String zzaCJ;
  public final ArrayList zzaCK;
  public final boolean zzaCL;
  
  private Games$GamesOptions()
  {
    this.zzaCE = false;
    this.zzaCF = true;
    this.zzaCG = 17;
    this.zzaCH = false;
    this.zzaCI = 4368;
    this.zzaCJ = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaCK = localArrayList;
    this.zzaCL = false;
  }
  
  private Games$GamesOptions(Games.GamesOptions.Builder paramBuilder)
  {
    boolean bool1 = paramBuilder.zzaCE;
    this.zzaCE = bool1;
    bool1 = paramBuilder.zzaCF;
    this.zzaCF = bool1;
    int i = paramBuilder.zzaCG;
    this.zzaCG = i;
    boolean bool2 = paramBuilder.zzaCH;
    this.zzaCH = bool2;
    int j = paramBuilder.zzaCI;
    this.zzaCI = j;
    Object localObject = paramBuilder.zzaCJ;
    this.zzaCJ = ((String)localObject);
    localObject = paramBuilder.zzaCK;
    this.zzaCK = ((ArrayList)localObject);
    boolean bool3 = paramBuilder.zzaCL;
    this.zzaCL = bool3;
  }
  
  public static Games.GamesOptions.Builder builder()
  {
    Games.GamesOptions.Builder localBuilder = new com/google/android/gms/games/Games$GamesOptions$Builder;
    localBuilder.<init>(null);
    return localBuilder;
  }
  
  public Bundle zzvD()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    boolean bool1 = this.zzaCE;
    localBundle.putBoolean("com.google.android.gms.games.key.isHeadless", bool1);
    bool1 = this.zzaCF;
    localBundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", bool1);
    int i = this.zzaCG;
    localBundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", i);
    boolean bool2 = this.zzaCH;
    localBundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", bool2);
    int j = this.zzaCI;
    localBundle.putInt("com.google.android.gms.games.key.sdkVariant", j);
    Object localObject = this.zzaCJ;
    localBundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", (String)localObject);
    localObject = this.zzaCK;
    localBundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", (ArrayList)localObject);
    boolean bool3 = this.zzaCL;
    localBundle.putBoolean("com.google.android.gms.games.key.requireGooglePlus", bool3);
    return localBundle;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Games$GamesOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */