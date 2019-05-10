package com.bumptech.glide.load.engine;

import android.os.Handler.Callback;
import android.os.Message;

final class ResourceRecycler$ResourceRecyclerCallback
  implements Handler.Callback
{
  static final int RECYCLE_RESOURCE = 1;
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    Resource localResource;
    if (j == i)
    {
      localResource = (Resource)paramMessage.obj;
      localResource.recycle();
      j = i;
    }
    for (;;)
    {
      return j;
      int k = 0;
      localResource = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ResourceRecycler$ResourceRecyclerCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */