package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

final class zzhd$4
  implements Runnable
{
  zzhd$4(zzhc paramzzhc, Context paramContext, zzhf paramzzhf, AdRequestInfoParcel paramAdRequestInfoParcel) {}
  
  public void run()
  {
    zzhl localzzhl = this.zzIU.zzIJ;
    Context localContext = this.zzxh;
    zzhf localzzhf = this.zzIY;
    VersionInfoParcel localVersionInfoParcel = this.zzIV.zzrl;
    localzzhl.zza(localContext, localzzhf, localVersionInfoParcel);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhd$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */