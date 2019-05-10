package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.concurrent.Callable;

final class zzhd$1
  implements Callable
{
  zzhd$1(zzhc paramzzhc, Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, Bundle paramBundle) {}
  
  public Void zzdt()
  {
    zzhh localzzhh = this.zzIU.zzIP;
    Context localContext = this.zzxh;
    String str = this.zzIV.zzHu.packageName;
    Bundle localBundle = this.zzIW;
    localzzhh.zza(localContext, str, localBundle);
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */