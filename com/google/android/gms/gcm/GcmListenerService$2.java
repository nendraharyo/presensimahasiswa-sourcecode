package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.AsyncTask;

class GcmListenerService$2
  extends AsyncTask
{
  GcmListenerService$2(GcmListenerService paramGcmListenerService, Intent paramIntent) {}
  
  protected Void zzb(Void... paramVarArgs)
  {
    GcmListenerService localGcmListenerService = this.zzaLA;
    Intent localIntent = this.val$intent;
    GcmListenerService.zza(localGcmListenerService, localIntent);
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmListenerService$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */