package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.concurrent.atomic.AtomicReference;

class zzj$3
  implements GoogleApiClient.ConnectionCallbacks
{
  zzj$3(zzj paramzzj, AtomicReference paramAtomicReference, zzv paramzzv) {}
  
  public void onConnected(Bundle paramBundle)
  {
    zzj localzzj = this.zzaid;
    GoogleApiClient localGoogleApiClient = (GoogleApiClient)this.zzaie.get();
    zzv localzzv = this.zzaif;
    zzj.zza(localzzj, localGoogleApiClient, localzzv, true);
  }
  
  public void onConnectionSuspended(int paramInt) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */