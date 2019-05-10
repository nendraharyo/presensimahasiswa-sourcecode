package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

public class zzb$zza
  extends Handler
{
  public zzb$zza()
  {
    this(localLooper);
  }
  
  public zzb$zza(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = "BasePendingResult";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Don't know how to handle message: ");
      int j = paramMessage.what;
      localObject2 = j;
      Exception localException = new java/lang/Exception;
      localException.<init>();
      Log.wtf((String)localObject1, (String)localObject2, localException);
    }
    for (;;)
    {
      return;
      localObject1 = (Pair)paramMessage.obj;
      localObject2 = (ResultCallback)((Pair)localObject1).first;
      localObject1 = (Result)((Pair)localObject1).second;
      zzb((ResultCallback)localObject2, (Result)localObject1);
      continue;
      localObject1 = (zzb)paramMessage.obj;
      localObject2 = Status.zzagF;
      ((zzb)localObject1).zzx((Status)localObject2);
    }
  }
  
  public void zza(ResultCallback paramResultCallback, Result paramResult)
  {
    Pair localPair = new android/util/Pair;
    localPair.<init>(paramResultCallback, paramResult);
    Message localMessage = obtainMessage(1, localPair);
    sendMessage(localMessage);
  }
  
  public void zza(zzb paramzzb, long paramLong)
  {
    Message localMessage = obtainMessage(2, paramzzb);
    sendMessageDelayed(localMessage, paramLong);
  }
  
  protected void zzb(ResultCallback paramResultCallback, Result paramResult)
  {
    try
    {
      paramResultCallback.onResult(paramResult);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      zzb.zzc(paramResult);
      throw localRuntimeException;
    }
  }
  
  public void zzph()
  {
    removeMessages(2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */