package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class zzo$zzb
  extends Handler
{
  private final ContainerHolder.ContainerAvailableListener zzbhZ;
  
  public zzo$zzb(zzo paramzzo, ContainerHolder.ContainerAvailableListener paramContainerAvailableListener, Looper paramLooper)
  {
    super(paramLooper);
    this.zzbhZ = paramContainerAvailableListener;
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    String str;
    switch (i)
    {
    default: 
      str = "Don't know how to handle this message.";
      zzbg.e(str);
    }
    for (;;)
    {
      return;
      str = (String)paramMessage.obj;
      zzfV(str);
    }
  }
  
  public void zzfU(String paramString)
  {
    Message localMessage = obtainMessage(1, paramString);
    sendMessage(localMessage);
  }
  
  protected void zzfV(String paramString)
  {
    ContainerHolder.ContainerAvailableListener localContainerAvailableListener = this.zzbhZ;
    zzo localzzo = this.zzbia;
    localContainerAvailableListener.onContainerAvailable(localzzo, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzo$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */