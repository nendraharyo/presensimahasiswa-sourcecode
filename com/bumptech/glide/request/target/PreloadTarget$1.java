package com.bumptech.glide.request.target;

import android.os.Handler.Callback;
import android.os.Message;

class PreloadTarget$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    PreloadTarget localPreloadTarget;
    if (j == i)
    {
      localPreloadTarget = (PreloadTarget)paramMessage.obj;
      localPreloadTarget.clear();
      j = i;
    }
    for (;;)
    {
      return j;
      int k = 0;
      localPreloadTarget = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\PreloadTarget$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */