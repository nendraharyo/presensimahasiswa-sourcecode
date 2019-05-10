package android.support.v7.media;

import android.media.AudioManager;

final class SystemMediaRouteProvider$LegacyImpl$DefaultRouteController
  extends MediaRouteProvider.RouteController
{
  SystemMediaRouteProvider$LegacyImpl$DefaultRouteController(SystemMediaRouteProvider.LegacyImpl paramLegacyImpl) {}
  
  public void onSetVolume(int paramInt)
  {
    SystemMediaRouteProvider.LegacyImpl.access$000(this.this$0).setStreamVolume(3, paramInt, 0);
    SystemMediaRouteProvider.LegacyImpl.access$100(this.this$0);
  }
  
  public void onUpdateVolume(int paramInt)
  {
    int i = 3;
    AudioManager localAudioManager1 = SystemMediaRouteProvider.LegacyImpl.access$000(this.this$0);
    int j = localAudioManager1.getStreamVolume(i);
    AudioManager localAudioManager2 = SystemMediaRouteProvider.LegacyImpl.access$000(this.this$0);
    int k = localAudioManager2.getStreamMaxVolume(i);
    int m = j + paramInt;
    m = Math.max(0, m);
    k = Math.min(k, m);
    if (k != j)
    {
      localAudioManager2 = SystemMediaRouteProvider.LegacyImpl.access$000(this.this$0);
      localAudioManager2.setStreamVolume(i, j, 0);
    }
    SystemMediaRouteProvider.LegacyImpl.access$100(this.this$0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider$LegacyImpl$DefaultRouteController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */