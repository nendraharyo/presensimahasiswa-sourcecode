package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzne;

public class zze
{
  public void zza(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    zza(paramContext, paramAdOverlayInfoParcel, true);
  }
  
  public void zza(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    int i = paramAdOverlayInfoParcel.zzEJ;
    int j = 4;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (i == j)
    {
      localObject1 = paramAdOverlayInfoParcel.zzEC;
      if (localObject1 == null)
      {
        localObject1 = paramAdOverlayInfoParcel.zzEB;
        if (localObject1 != null)
        {
          localObject1 = paramAdOverlayInfoParcel.zzEB;
          ((com.google.android.gms.ads.internal.client.zza)localObject1).onAdClicked();
        }
        localObject1 = zzr.zzbz();
        localObject2 = paramAdOverlayInfoParcel.zzEA;
        localObject3 = paramAdOverlayInfoParcel.zzEI;
        ((zza)localObject1).zza(paramContext, (AdLauncherIntentInfoParcel)localObject2, (zzp)localObject3);
      }
    }
    for (;;)
    {
      return;
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      ((Intent)localObject1).setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
      localObject3 = paramAdOverlayInfoParcel.zzrl;
      boolean bool3 = ((VersionInfoParcel)localObject3).zzNb;
      ((Intent)localObject1).putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", bool3);
      localObject2 = "shouldCallOnOverlayOpened";
      ((Intent)localObject1).putExtra((String)localObject2, paramBoolean);
      AdOverlayInfoParcel.zza((Intent)localObject1, paramAdOverlayInfoParcel);
      boolean bool1 = zzne.isAtLeastL();
      if (!bool1)
      {
        int k = 524288;
        ((Intent)localObject1).addFlags(k);
      }
      boolean bool2 = paramContext instanceof Activity;
      if (!bool2)
      {
        int m = 268435456;
        ((Intent)localObject1).addFlags(m);
      }
      localObject2 = zzr.zzbC();
      ((zzir)localObject2).zzb((Context)paramContext, (Intent)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */