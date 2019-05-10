package com.google.android.gms.drive.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzz;

final class DriveEventService$zza
  extends Handler
{
  DriveEventService$zza(DriveEventService paramDriveEventService) {}
  
  private Message zzb(OnEventResponse paramOnEventResponse)
  {
    return obtainMessage(1, paramOnEventResponse);
  }
  
  private Message zzsW()
  {
    return obtainMessage(2);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = "DriveEventService";
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = "handleMessage message type:";
    localObject2 = ((StringBuilder)localObject2).append(str);
    int i = paramMessage.what;
    localObject2 = i;
    zzz.zzy((String)localObject1, (String)localObject2);
    int j = paramMessage.what;
    switch (j)
    {
    default: 
      localObject1 = "DriveEventService";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Unexpected message type:";
      localObject2 = ((StringBuilder)localObject2).append(str);
      i = paramMessage.what;
      localObject2 = i;
      zzz.zzz((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject2 = this.zzapP;
      localObject1 = (OnEventResponse)paramMessage.obj;
      DriveEventService.zza((DriveEventService)localObject2, (OnEventResponse)localObject1);
      continue;
      localObject1 = getLooper();
      ((Looper)localObject1).quit();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\DriveEventService$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */