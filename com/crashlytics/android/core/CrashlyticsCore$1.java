package com.crashlytics.android.core;

import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;

class CrashlyticsCore$1
  extends PriorityCallable
{
  CrashlyticsCore$1(CrashlyticsCore paramCrashlyticsCore) {}
  
  public Void call()
  {
    return this.this$0.doInBackground();
  }
  
  public Priority getPriority()
  {
    return Priority.IMMEDIATE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsCore$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */