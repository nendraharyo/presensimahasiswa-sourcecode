package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult;

class zzrk$zzc
  extends zza.zza
{
  private final String zzbgJ;
  private final boolean zzbgK;
  private final String zzbgM;
  
  protected zzrk$zzc(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super((Api.zzc)localObject, paramGoogleApiClient);
    boolean bool = Log.isLoggable("SearchAuth", 3);
    this.zzbgK = bool;
    this.zzbgM = paramString;
    localObject = paramGoogleApiClient.getContext().getPackageName();
    this.zzbgJ = ((String)localObject);
  }
  
  protected void zza(zzrj paramzzrj)
  {
    boolean bool = this.zzbgK;
    if (bool)
    {
      localObject1 = "SearchAuth";
      localObject2 = "GetGoogleNowAuthImpl started";
      Log.d((String)localObject1, (String)localObject2);
    }
    Object localObject2 = new com/google/android/gms/internal/zzrk$zzc$1;
    ((zzrk.zzc.1)localObject2).<init>(this);
    Object localObject1 = (zzri)paramzzrj.zzqJ();
    String str1 = this.zzbgJ;
    String str2 = this.zzbgM;
    ((zzri)localObject1).zza((zzrh)localObject2, str1, str2);
  }
  
  protected SearchAuthApi.GoogleNowAuthResult zzbk(Status paramStatus)
  {
    boolean bool = this.zzbgK;
    if (bool)
    {
      localObject1 = "SearchAuth";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("GetGoogleNowAuthImpl received failure: ");
      String str = paramStatus.getStatusMessage();
      localObject2 = str;
      Log.d((String)localObject1, (String)localObject2);
    }
    Object localObject1 = new com/google/android/gms/internal/zzrk$zzd;
    ((zzrk.zzd)localObject1).<init>(paramStatus, null);
    return (SearchAuthApi.GoogleNowAuthResult)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrk$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */