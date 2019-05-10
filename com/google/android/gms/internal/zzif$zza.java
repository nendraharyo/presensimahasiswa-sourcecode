package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import org.json.JSONObject;

public final class zzif$zza
{
  public final int errorCode;
  public final JSONObject zzKT;
  public final zzeo zzKV;
  public final long zzKY;
  public final long zzKZ;
  public final AdRequestInfoParcel zzLd;
  public final AdResponseParcel zzLe;
  public final AdSizeParcel zzrp;
  
  public zzif$zza(AdRequestInfoParcel paramAdRequestInfoParcel, AdResponseParcel paramAdResponseParcel, zzeo paramzzeo, AdSizeParcel paramAdSizeParcel, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject)
  {
    this.zzLd = paramAdRequestInfoParcel;
    this.zzLe = paramAdResponseParcel;
    this.zzKV = paramzzeo;
    this.zzrp = paramAdSizeParcel;
    this.errorCode = paramInt;
    this.zzKY = paramLong1;
    this.zzKZ = paramLong2;
    this.zzKT = paramJSONObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzif$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */