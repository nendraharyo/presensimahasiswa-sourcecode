package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzr;
import org.json.JSONObject;

public class zzef
  implements zzed
{
  private final zzjp zzpD;
  
  public zzef(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzan paramzzan)
  {
    Object localObject = zzr.zzbD();
    AdSizeParcel localAdSizeParcel = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    localAdSizeParcel.<init>();
    localObject = ((zzjr)localObject).zza(paramContext, localAdSizeParcel, false, false, paramzzan, paramVersionInfoParcel);
    this.zzpD = ((zzjp)localObject);
    this.zzpD.getWebView().setWillNotDraw(true);
  }
  
  private void runOnUiThread(Runnable paramRunnable)
  {
    Object localObject = zzn.zzcS();
    boolean bool = ((com.google.android.gms.ads.internal.util.client.zza)localObject).zzhJ();
    if (bool) {
      paramRunnable.run();
    }
    for (;;)
    {
      return;
      localObject = zzir.zzMc;
      ((Handler)localObject).post(paramRunnable);
    }
  }
  
  public void destroy()
  {
    this.zzpD.destroy();
  }
  
  public void zzZ(String paramString)
  {
    Object localObject = new Object[1];
    localObject[0] = paramString;
    String str = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", (Object[])localObject);
    localObject = new com/google/android/gms/internal/zzef$3;
    ((zzef.3)localObject).<init>(this, str);
    runOnUiThread((Runnable)localObject);
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, boolean paramBoolean, zzdh paramzzdh, zzdj paramzzdj, zze paramzze, zzft paramzzft)
  {
    zzjq localzzjq = this.zzpD.zzhU();
    zze localzze = new com/google/android/gms/ads/internal/zze;
    localzze.<init>(false);
    localzzjq.zzb(paramzza, paramzzg, paramzzdb, paramzzp, paramBoolean, paramzzdh, paramzzdj, localzze, paramzzft);
  }
  
  public void zza(zzed.zza paramzza)
  {
    zzjq localzzjq = this.zzpD.zzhU();
    zzef.6 local6 = new com/google/android/gms/internal/zzef$6;
    local6.<init>(this, paramzza);
    localzzjq.zza(local6);
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    this.zzpD.zzhU().zza(paramString, paramzzdf);
  }
  
  public void zza(String paramString, JSONObject paramJSONObject)
  {
    zzef.1 local1 = new com/google/android/gms/internal/zzef$1;
    local1.<init>(this, paramString, paramJSONObject);
    runOnUiThread(local1);
  }
  
  public void zzaa(String paramString)
  {
    zzef.5 local5 = new com/google/android/gms/internal/zzef$5;
    local5.<init>(this, paramString);
    runOnUiThread(local5);
  }
  
  public void zzab(String paramString)
  {
    zzef.4 local4 = new com/google/android/gms/internal/zzef$4;
    local4.<init>(this, paramString);
    runOnUiThread(local4);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    this.zzpD.zzhU().zzb(paramString, paramzzdf);
  }
  
  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    this.zzpD.zzb(paramString, paramJSONObject);
  }
  
  public void zze(String paramString1, String paramString2)
  {
    zzef.2 local2 = new com/google/android/gms/internal/zzef$2;
    local2.<init>(this, paramString1, paramString2);
    runOnUiThread(local2);
  }
  
  public zzei zzen()
  {
    zzej localzzej = new com/google/android/gms/internal/zzej;
    localzzej.<init>(this);
    return localzzej;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */