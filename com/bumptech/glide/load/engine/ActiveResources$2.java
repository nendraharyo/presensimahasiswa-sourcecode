package com.bumptech.glide.load.engine;

import android.os.Process;

class ActiveResources$2
  implements Runnable
{
  ActiveResources$2(ActiveResources paramActiveResources) {}
  
  public void run()
  {
    Process.setThreadPriority(10);
    this.this$0.cleanReferenceQueue();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ActiveResources$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */