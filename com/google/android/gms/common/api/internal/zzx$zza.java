package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class zzx$zza
  extends Handler
{
  public zzx$zza(zzx paramzzx, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    Object localObject4;
    switch (i)
    {
    default: 
      localObject1 = "TransformedResultImpl";
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject5 = "TransformationResultHandler received unknown message type: ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      int j = paramMessage.what;
      localObject4 = j;
      Log.e((String)localObject1, (String)localObject4);
      return;
    case 0: 
      localObject1 = (PendingResult)paramMessage.obj;
      localObject4 = zzx.zzf(this.zzaiU);
      if (localObject1 == null) {}
      for (;;)
      {
        try
        {
          localObject1 = this.zzaiU;
          localObject1 = zzx.zzg((zzx)localObject1);
          localObject5 = new com/google/android/gms/common/api/Status;
          int k = 13;
          String str1 = "Transform returned null";
          ((Status)localObject5).<init>(k, str1);
          zzx.zza((zzx)localObject1, (Status)localObject5);
          break;
        }
        finally {}
        boolean bool = localObject2 instanceof zzt;
        if (bool)
        {
          localObject5 = this.zzaiU;
          localObject5 = zzx.zzg((zzx)localObject5);
          localObject3 = (zzt)localObject2;
          localObject3 = ((zzt)localObject3).getStatus();
          zzx.zza((zzx)localObject5, (Status)localObject3);
        }
        else
        {
          localObject5 = this.zzaiU;
          localObject5 = zzx.zzg((zzx)localObject5);
          ((zzx)localObject5).zza((PendingResult)localObject3);
        }
      }
    }
    Object localObject3 = (RuntimeException)paramMessage.obj;
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    localObject5 = ((StringBuilder)localObject5).append("Runtime exception on the transformation worker thread: ");
    String str2 = ((RuntimeException)localObject3).getMessage();
    localObject5 = str2;
    Log.e("TransformedResultImpl", (String)localObject5);
    throw ((Throwable)localObject3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzx$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */