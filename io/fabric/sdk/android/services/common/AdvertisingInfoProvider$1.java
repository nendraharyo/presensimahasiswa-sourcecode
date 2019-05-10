package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

class AdvertisingInfoProvider$1
  extends BackgroundPriorityRunnable
{
  AdvertisingInfoProvider$1(AdvertisingInfoProvider paramAdvertisingInfoProvider, AdvertisingInfo paramAdvertisingInfo) {}
  
  public void onRun()
  {
    AdvertisingInfo localAdvertisingInfo = AdvertisingInfoProvider.access$000(this.this$0);
    Object localObject = this.val$advertisingInfo;
    boolean bool = ((AdvertisingInfo)localObject).equals(localAdvertisingInfo);
    if (!bool)
    {
      localObject = Fabric.getLogger();
      String str1 = "Fabric";
      String str2 = "Asychronously getting Advertising Info and storing it to preferences";
      ((Logger)localObject).d(str1, str2);
      localObject = this.this$0;
      AdvertisingInfoProvider.access$100((AdvertisingInfoProvider)localObject, localAdvertisingInfo);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AdvertisingInfoProvider$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */