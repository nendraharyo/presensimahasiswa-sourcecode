package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver
  extends BroadcastReceiver
{
  public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
  public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
  public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
  
  SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver(SystemMediaRouteProvider.LegacyImpl paramLegacyImpl) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = -1;
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = "android.media.VOLUME_CHANGED_ACTION";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = "android.media.EXTRA_VOLUME_STREAM_TYPE";
      int j = paramIntent.getIntExtra((String)localObject1, i);
      int k = 3;
      if (j == k)
      {
        localObject1 = "android.media.EXTRA_VOLUME_STREAM_VALUE";
        j = paramIntent.getIntExtra((String)localObject1, i);
        if (j >= 0)
        {
          localObject2 = this.this$0;
          k = SystemMediaRouteProvider.LegacyImpl.access$200((SystemMediaRouteProvider.LegacyImpl)localObject2);
          if (j != k)
          {
            localObject1 = this.this$0;
            SystemMediaRouteProvider.LegacyImpl.access$100((SystemMediaRouteProvider.LegacyImpl)localObject1);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */