package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class zzcu$2
  implements Handler.Callback
{
  zzcu$2(zzcu paramzzcu) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    if (i == j)
    {
      Object localObject1 = zzcu.zzHs();
      Object localObject2 = paramMessage.obj;
      boolean bool1 = localObject1.equals(localObject2);
      if (bool1)
      {
        this.zzblb.dispatch();
        localObject1 = this.zzblb;
        int k = zzcu.zzb((zzcu)localObject1);
        if (k > 0)
        {
          localObject1 = this.zzblb;
          boolean bool2 = zzcu.zzc((zzcu)localObject1);
          if (!bool2)
          {
            localObject1 = zzcu.zzd(this.zzblb);
            localObject2 = zzcu.zzd(this.zzblb);
            Object localObject3 = zzcu.zzHs();
            localObject2 = ((Handler)localObject2).obtainMessage(i, localObject3);
            localObject3 = this.zzblb;
            int m = zzcu.zzb((zzcu)localObject3);
            long l = m;
            ((Handler)localObject1).sendMessageDelayed((Message)localObject2, l);
          }
        }
      }
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcu$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */