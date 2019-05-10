package com.google.android.gms.gcm;

import android.content.Intent;

class GcmListenerService$1
  implements Runnable
{
  GcmListenerService$1(GcmListenerService paramGcmListenerService, Intent paramIntent) {}
  
  public void run()
  {
    GcmListenerService localGcmListenerService = this.zzaLA;
    Intent localIntent = this.val$intent;
    GcmListenerService.zza(localGcmListenerService, localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmListenerService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */