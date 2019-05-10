package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjp;

public class zze$zzb
  implements zze.zza
{
  private final zzif.zza zzpC;
  private final zzjp zzpD;
  
  public zze$zzb(zzif.zza paramzza, zzjp paramzzjp)
  {
    this.zzpC = paramzza;
    this.zzpD = paramzzjp;
  }
  
  public void zzr(String paramString)
  {
    zzin.zzaI("An auto-clicking creative is blocked");
    Object localObject1 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject1).<init>();
    ((Uri.Builder)localObject1).scheme("https");
    ((Uri.Builder)localObject1).path("//pagead2.googlesyndication.com/pagead/gen_204");
    Object localObject2 = "id";
    Object localObject3 = "gmob-apps-blocked-navigation";
    ((Uri.Builder)localObject1).appendQueryParameter((String)localObject2, (String)localObject3);
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool)
    {
      localObject2 = "navigationURL";
      ((Uri.Builder)localObject1).appendQueryParameter((String)localObject2, paramString);
    }
    localObject2 = this.zzpC;
    if (localObject2 != null)
    {
      localObject2 = this.zzpC.zzLe;
      if (localObject2 != null)
      {
        localObject2 = this.zzpC.zzLe.zzHY;
        bool = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool)
        {
          localObject2 = "debugDialog";
          localObject3 = this.zzpC.zzLe.zzHY;
          ((Uri.Builder)localObject1).appendQueryParameter((String)localObject2, (String)localObject3);
        }
      }
    }
    localObject2 = zzr.zzbC();
    localObject3 = this.zzpD.getContext();
    String str = this.zzpD.zzhX().afmaVersion;
    localObject1 = ((Uri.Builder)localObject1).toString();
    ((zzir)localObject2).zzc((Context)localObject3, str, (String)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zze$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */