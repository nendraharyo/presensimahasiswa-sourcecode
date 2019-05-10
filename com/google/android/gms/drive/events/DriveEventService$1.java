package com.google.android.gms.drive.events;

import android.os.Looper;
import com.google.android.gms.drive.internal.zzz;
import java.util.concurrent.CountDownLatch;

class DriveEventService$1
  extends Thread
{
  DriveEventService$1(DriveEventService paramDriveEventService, CountDownLatch paramCountDownLatch) {}
  
  public void run()
  {
    try
    {
      Looper.prepare();
      Object localObject1 = this.zzapP;
      localObject3 = new com/google/android/gms/drive/events/DriveEventService$zza;
      DriveEventService localDriveEventService = this.zzapP;
      ((DriveEventService.zza)localObject3).<init>(localDriveEventService);
      ((DriveEventService)localObject1).zzapM = ((DriveEventService.zza)localObject3);
      localObject1 = this.zzapP;
      localObject3 = null;
      ((DriveEventService)localObject1).zzapN = false;
      localObject1 = this.zzapO;
      ((CountDownLatch)localObject1).countDown();
      localObject1 = "DriveEventService";
      localObject3 = "Bound and starting loop";
      zzz.zzy((String)localObject1, (String)localObject3);
      Looper.loop();
      localObject1 = "DriveEventService";
      localObject3 = "Finished loop";
      zzz.zzy((String)localObject1, (String)localObject3);
      return;
    }
    finally
    {
      Object localObject3 = DriveEventService.zzb(this.zzapP);
      if (localObject3 != null)
      {
        localObject3 = DriveEventService.zzb(this.zzapP);
        ((CountDownLatch)localObject3).countDown();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\DriveEventService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */