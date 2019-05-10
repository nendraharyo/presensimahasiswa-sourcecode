package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;

public class zzjr
{
  public zzjp zza(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel)
  {
    return zza(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, null, null);
  }
  
  public zzjp zza(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, zzd paramzzd)
  {
    zzjs localzzjs = new com/google/android/gms/internal/zzjs;
    Object localObject = zzjt.zzb(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, paramzzcb, paramzzd);
    localzzjs.<init>((zzjp)localObject);
    localObject = zzr.zzbE().zzb(localzzjs, paramBoolean2);
    localzzjs.setWebViewClient((WebViewClient)localObject);
    localObject = zzr.zzbE().zzk(localzzjs);
    localzzjs.setWebChromeClient((WebChromeClient)localObject);
    return localzzjs;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */