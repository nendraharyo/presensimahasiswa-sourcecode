package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult;

class zzrk$zzd
  implements SearchAuthApi.GoogleNowAuthResult
{
  private final Status zzUX;
  private final GoogleNowAuthState zzbgO;
  
  zzrk$zzd(Status paramStatus, GoogleNowAuthState paramGoogleNowAuthState)
  {
    this.zzUX = paramStatus;
    this.zzbgO = paramGoogleNowAuthState;
  }
  
  public GoogleNowAuthState getGoogleNowAuthState()
  {
    return this.zzbgO;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrk$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */