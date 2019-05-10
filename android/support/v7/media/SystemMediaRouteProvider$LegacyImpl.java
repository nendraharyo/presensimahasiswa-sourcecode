package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.support.v7.mediarouter.R.string;
import java.util.ArrayList;
import java.util.Collection;

class SystemMediaRouteProvider$LegacyImpl
  extends SystemMediaRouteProvider
{
  private static final ArrayList CONTROL_FILTERS;
  private static final int PLAYBACK_STREAM = 3;
  private final AudioManager mAudioManager;
  private int mLastReportedVolume = -1;
  private final SystemMediaRouteProvider.LegacyImpl.VolumeChangeReceiver mVolumeChangeReceiver;
  
  static
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>();
    localIntentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
    localIntentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    CONTROL_FILTERS = localArrayList;
    CONTROL_FILTERS.add(localIntentFilter);
  }
  
  public SystemMediaRouteProvider$LegacyImpl(Context paramContext)
  {
    super(paramContext);
    Object localObject = (AudioManager)paramContext.getSystemService("audio");
    this.mAudioManager = ((AudioManager)localObject);
    localObject = new android/support/v7/media/SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver;
    ((SystemMediaRouteProvider.LegacyImpl.VolumeChangeReceiver)localObject).<init>(this);
    this.mVolumeChangeReceiver = ((SystemMediaRouteProvider.LegacyImpl.VolumeChangeReceiver)localObject);
    localObject = this.mVolumeChangeReceiver;
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>("android.media.VOLUME_CHANGED_ACTION");
    paramContext.registerReceiver((BroadcastReceiver)localObject, localIntentFilter);
    publishRoutes();
  }
  
  private void publishRoutes()
  {
    int i = 3;
    Object localObject = getContext().getResources();
    int j = this.mAudioManager.getStreamMaxVolume(i);
    int k = this.mAudioManager.getStreamVolume(i);
    this.mLastReportedVolume = k;
    MediaRouteDescriptor.Builder localBuilder = new android/support/v7/media/MediaRouteDescriptor$Builder;
    int m = R.string.mr_system_route_name;
    localObject = ((Resources)localObject).getString(m);
    localBuilder.<init>("DEFAULT_ROUTE", (String)localObject);
    localObject = CONTROL_FILTERS;
    localObject = localBuilder.addControlFilters((Collection)localObject).setPlaybackStream(i).setPlaybackType(0).setVolumeHandling(1).setVolumeMax(j);
    j = this.mLastReportedVolume;
    localObject = ((MediaRouteDescriptor.Builder)localObject).setVolume(j).build();
    MediaRouteProviderDescriptor.Builder localBuilder1 = new android/support/v7/media/MediaRouteProviderDescriptor$Builder;
    localBuilder1.<init>();
    localObject = localBuilder1.addRoute((MediaRouteDescriptor)localObject).build();
    setDescriptor((MediaRouteProviderDescriptor)localObject);
  }
  
  public MediaRouteProvider.RouteController onCreateRouteController(String paramString)
  {
    Object localObject = "DEFAULT_ROUTE";
    boolean bool = paramString.equals(localObject);
    if (bool)
    {
      localObject = new android/support/v7/media/SystemMediaRouteProvider$LegacyImpl$DefaultRouteController;
      ((SystemMediaRouteProvider.LegacyImpl.DefaultRouteController)localObject).<init>(this);
    }
    for (;;)
    {
      return (MediaRouteProvider.RouteController)localObject;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider$LegacyImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */