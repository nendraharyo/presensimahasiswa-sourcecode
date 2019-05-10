package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

class zza$2
  implements zza.zza
{
  zza$2(zza paramzza, Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2) {}
  
  public int getState()
  {
    return 0;
  }
  
  public void zzb(LifecycleDelegate paramLifecycleDelegate)
  {
    LifecycleDelegate localLifecycleDelegate = zza.zzb(this.zzavB);
    Activity localActivity = this.val$activity;
    Bundle localBundle1 = this.zzavC;
    Bundle localBundle2 = this.zzavD;
    localLifecycleDelegate.onInflate(localActivity, localBundle1, localBundle2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zza$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */