package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import java.util.Map;

class zze$zzb$4
  implements Runnable
{
  zze$zzb$4(zze.zzb paramzzb, zze paramzze, String paramString1, String paramString2) {}
  
  public void run()
  {
    Object localObject1 = this.zzadV;
    for (;;)
    {
      synchronized (zze.zze((zze)localObject1))
      {
        localObject1 = this.zzadV;
        localObject1 = zze.zze((zze)localObject1);
        localObject4 = this.zzZG;
        localObject1 = ((Map)localObject1).get(localObject4);
        localObject1 = (Cast.MessageReceivedCallback)localObject1;
        if (localObject1 != null)
        {
          ??? = zze.zzf(this.zzadV);
          localObject4 = this.zzZG;
          str1 = this.zzaea;
          ((Cast.MessageReceivedCallback)localObject1).onMessageReceived((CastDevice)???, (String)localObject4, str1);
          return;
        }
      }
      zzl localzzl = zze.zzop();
      ??? = "Discarded message for unknown namespace '%s'";
      int i = 1;
      Object localObject4 = new Object[i];
      String str1 = null;
      String str2 = this.zzZG;
      localObject4[0] = str2;
      localzzl.zzb((String)???, (Object[])localObject4);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zze$zzb$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */