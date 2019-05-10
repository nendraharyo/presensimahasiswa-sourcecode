package com.bumptech.glide.load.engine;

import android.os.Handler.Callback;
import android.os.Message;

class EngineJob$MainThreadCallback
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    Object localObject1 = (EngineJob)paramMessage.obj;
    int i = paramMessage.what;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized message: ");
      int j = paramMessage.what;
      localObject2 = j;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      ((EngineJob)localObject1).handleResultOnMainThread();
    }
    for (;;)
    {
      return true;
      ((EngineJob)localObject1).handleExceptionOnMainThread();
      continue;
      ((EngineJob)localObject1).handleCancelledOnMainThread();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\EngineJob$MainThreadCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */