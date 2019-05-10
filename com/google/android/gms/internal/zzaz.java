package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public class zzaz
  extends zzau
{
  private final zzeh zzsE;
  
  public zzaz(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb, zzeh paramzzeh)
  {
    super(paramContext, paramAdSizeParcel, paramzzif, paramVersionInfoParcel, paramzzbb);
    this.zzsE = paramzzeh;
    Object localObject = this.zzsE;
    zzb((zzeh)localObject);
    zzcd();
    zzh(false);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Tracking ad unit: ");
    String str = this.zzrZ.zzcu();
    zzin.zzaI(str);
  }
  
  protected void destroy()
  {
    synchronized (this.zzpV)
    {
      super.destroy();
      zzeh localzzeh = this.zzsE;
      zzc(localzzeh);
      return;
    }
  }
  
  protected void zzb(JSONObject paramJSONObject)
  {
    this.zzsE.zza("AFMA_updateActiveView", paramJSONObject);
  }
  
  public void zzcf()
  {
    destroy();
  }
  
  protected boolean zzcl()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */