package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;

class zzrk$zzb
  extends zza.zza
{
  private final String zzXI;
  private final String zzbgJ;
  private final boolean zzbgK;
  
  protected zzrk$zzb(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super((Api.zzc)localObject, paramGoogleApiClient);
    boolean bool = Log.isLoggable("SearchAuth", 3);
    this.zzbgK = bool;
    this.zzXI = paramString;
    localObject = paramGoogleApiClient.getContext().getPackageName();
    this.zzbgJ = ((String)localObject);
  }
  
  protected void zza(zzrj paramzzrj)
  {
    boolean bool = this.zzbgK;
    if (bool)
    {
      localObject1 = "SearchAuth";
      localObject2 = "ClearTokenImpl started";
      Log.d((String)localObject1, (String)localObject2);
    }
    Object localObject2 = new com/google/android/gms/internal/zzrk$zzb$1;
    ((zzrk.zzb.1)localObject2).<init>(this);
    Object localObject1 = (zzri)paramzzrj.zzqJ();
    String str1 = this.zzbgJ;
    String str2 = this.zzXI;
    ((zzri)localObject1).zzb((zzrh)localObject2, str1, str2);
  }
  
  protected Status zzb(Status paramStatus)
  {
    boolean bool = this.zzbgK;
    if (bool)
    {
      String str1 = "SearchAuth";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("ClearTokenImpl received failure: ");
      String str2 = paramStatus.getStatusMessage();
      localObject = str2;
      Log.d(str1, (String)localObject);
    }
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrk$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */