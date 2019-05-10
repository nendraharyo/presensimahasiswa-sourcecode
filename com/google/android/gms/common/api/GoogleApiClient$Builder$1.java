package com.google.android.gms.common.api;

import android.support.v4.app.i;
import android.support.v4.app.m;
import com.google.android.gms.common.api.internal.zzw;

class GoogleApiClient$Builder$1
  implements Runnable
{
  GoogleApiClient$Builder$1(GoogleApiClient.Builder paramBuilder, GoogleApiClient paramGoogleApiClient) {}
  
  public void run()
  {
    Object localObject = GoogleApiClient.Builder.zza(this.zzagw);
    boolean bool = ((i)localObject).isFinishing();
    if (!bool)
    {
      localObject = GoogleApiClient.Builder.zza(this.zzagw).getSupportFragmentManager();
      bool = ((m)localObject).f();
      if (!bool) {
        break label38;
      }
    }
    for (;;)
    {
      return;
      label38:
      localObject = this.zzagw;
      zzw localzzw = zzw.zzb(GoogleApiClient.Builder.zza(this.zzagw));
      GoogleApiClient localGoogleApiClient = this.zzabL;
      GoogleApiClient.Builder.zza((GoogleApiClient.Builder)localObject, localzzw, localGoogleApiClient);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\GoogleApiClient$Builder$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */