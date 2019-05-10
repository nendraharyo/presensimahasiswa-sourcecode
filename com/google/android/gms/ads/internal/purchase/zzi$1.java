package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzih;

class zzi$1
  implements ServiceConnection
{
  zzi$1(zzi paramzzi, Context paramContext) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    boolean bool = false;
    zzb localzzb = new com/google/android/gms/ads/internal/purchase/zzb;
    Context localContext = this.zzxh.getApplicationContext();
    localzzb.<init>(localContext, false);
    localzzb.zzN(paramIBinder);
    Object localObject = this.zzxh.getPackageName();
    String str = "inapp";
    int i = localzzb.zzb(3, (String)localObject, str);
    localObject = zzr.zzbF();
    if (i == 0) {
      bool = true;
    }
    ((zzih)localObject).zzC(bool);
    this.zzxh.unbindService(this);
    localzzb.destroy();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzi$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */