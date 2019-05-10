package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

public class zzba
  extends zzau
{
  private zzeg.zzd zzsF;
  private boolean zzsG;
  
  public zzba(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb, zzeg paramzzeg)
  {
    super(paramContext, paramAdSizeParcel, paramzzif, paramVersionInfoParcel, paramzzbb);
    Object localObject1 = paramzzeg.zzer();
    this.zzsF = ((zzeg.zzd)localObject1);
    try
    {
      localObject1 = paramzzbb.zzcq();
      localObject1 = ((zzbb)localObject1).zzco();
      localObject1 = zzd((View)localObject1);
      localObject2 = this.zzsF;
      localObject3 = new com/google/android/gms/internal/zzba$1;
      ((zzba.1)localObject3).<init>(this, (JSONObject)localObject1);
      localObject1 = new com/google/android/gms/internal/zzba$2;
      ((zzba.2)localObject1).<init>(this);
      ((zzeg.zzd)localObject2).zza((zzji.zzc)localObject3, (zzji.zza)localObject1);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Object localObject3;
        Object localObject2 = "Failure while processing active view data.";
        zzin.zzb((String)localObject2, localRuntimeException);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject1 = this.zzsF;
    localObject2 = new com/google/android/gms/internal/zzba$3;
    ((zzba.3)localObject2).<init>(this);
    localObject3 = new com/google/android/gms/internal/zzba$4;
    ((zzba.4)localObject3).<init>(this);
    ((zzeg.zzd)localObject1).zza((zzji.zzc)localObject2, (zzji.zza)localObject3);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Tracking ad unit: ");
    localObject2 = this.zzrZ.zzcu();
    zzin.zzaI((String)localObject2);
  }
  
  protected void destroy()
  {
    synchronized (this.zzpV)
    {
      super.destroy();
      zzeg.zzd localzzd = this.zzsF;
      zzba.6 local6 = new com/google/android/gms/internal/zzba$6;
      local6.<init>(this);
      zzji.zzb localzzb = new com/google/android/gms/internal/zzji$zzb;
      localzzb.<init>();
      localzzd.zza(local6, localzzb);
      localzzd = this.zzsF;
      localzzd.release();
      return;
    }
  }
  
  protected void zzb(JSONObject paramJSONObject)
  {
    zzeg.zzd localzzd = this.zzsF;
    zzba.5 local5 = new com/google/android/gms/internal/zzba$5;
    local5.<init>(this, paramJSONObject);
    zzji.zzb localzzb = new com/google/android/gms/internal/zzji$zzb;
    localzzb.<init>();
    localzzd.zza(local5, localzzb);
  }
  
  protected boolean zzcl()
  {
    return this.zzsG;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */