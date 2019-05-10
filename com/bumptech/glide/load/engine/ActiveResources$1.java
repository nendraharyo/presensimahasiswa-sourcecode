package com.bumptech.glide.load.engine;

import android.os.Handler.Callback;
import android.os.Message;

class ActiveResources$1
  implements Handler.Callback
{
  ActiveResources$1(ActiveResources paramActiveResources) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    ActiveResources.ResourceWeakReference localResourceWeakReference;
    if (j == i)
    {
      ActiveResources localActiveResources = this.this$0;
      localResourceWeakReference = (ActiveResources.ResourceWeakReference)paramMessage.obj;
      localActiveResources.cleanupActiveReference(localResourceWeakReference);
      j = i;
    }
    for (;;)
    {
      return j;
      int k = 0;
      localResourceWeakReference = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ActiveResources$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */