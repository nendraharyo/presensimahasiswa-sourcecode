package com.crashlytics.android.answers;

import java.util.concurrent.atomic.AtomicReference;

class BackgroundManager$1
  implements Runnable
{
  BackgroundManager$1(BackgroundManager paramBackgroundManager) {}
  
  public void run()
  {
    this.this$0.backgroundFutureRef.set(null);
    BackgroundManager.access$000(this.this$0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\BackgroundManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */