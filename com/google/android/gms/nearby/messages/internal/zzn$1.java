package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.nearby.messages.MessagesOptions;

final class zzn$1
  extends Api.zza
{
  public int getPriority()
  {
    return -1 >>> 1;
  }
  
  public zzm zza(Context paramContext, Looper paramLooper, zzf paramzzf, MessagesOptions paramMessagesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzm localzzm = new com/google/android/gms/nearby/messages/internal/zzm;
    localzzm.<init>(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf, paramMessagesOptions);
    return localzzm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzn$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */