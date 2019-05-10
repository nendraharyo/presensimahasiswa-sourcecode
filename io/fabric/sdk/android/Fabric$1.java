package io.fabric.sdk.android;

import android.app.Activity;
import android.os.Bundle;

class Fabric$1
  extends ActivityLifecycleManager.Callbacks
{
  Fabric$1(Fabric paramFabric) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    this.this$0.setCurrentActivity(paramActivity);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    this.this$0.setCurrentActivity(paramActivity);
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    this.this$0.setCurrentActivity(paramActivity);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\Fabric$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */