package android.support.v7.media;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.support.v7.mediarouter.R.string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

class SystemMediaRouteProvider$JellybeanImpl
  extends SystemMediaRouteProvider
  implements MediaRouterJellybean.Callback, MediaRouterJellybean.VolumeCallback
{
  private static final ArrayList LIVE_AUDIO_CONTROL_FILTERS;
  private static final ArrayList LIVE_VIDEO_CONTROL_FILTERS;
  protected boolean mActiveScan;
  protected final Object mCallbackObj;
  protected boolean mCallbackRegistered;
  private MediaRouterJellybean.GetDefaultRouteWorkaround mGetDefaultRouteWorkaround;
  protected int mRouteTypes;
  protected final Object mRouterObj;
  private MediaRouterJellybean.SelectRouteWorkaround mSelectRouteWorkaround;
  private final SystemMediaRouteProvider.SyncCallback mSyncCallback;
  protected final ArrayList mSystemRouteRecords;
  protected final Object mUserRouteCategoryObj;
  protected final ArrayList mUserRouteRecords;
  protected final Object mVolumeCallbackObj;
  
  static
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>();
    localIntentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    LIVE_AUDIO_CONTROL_FILTERS = localArrayList;
    LIVE_AUDIO_CONTROL_FILTERS.add(localIntentFilter);
    localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>();
    localIntentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    LIVE_VIDEO_CONTROL_FILTERS = localArrayList;
    LIVE_VIDEO_CONTROL_FILTERS.add(localIntentFilter);
  }
  
  public SystemMediaRouteProvider$JellybeanImpl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
  {
    super(paramContext);
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mSystemRouteRecords = ((ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mUserRouteRecords = ((ArrayList)localObject1);
    this.mSyncCallback = paramSyncCallback;
    localObject1 = MediaRouterJellybean.getMediaRouter(paramContext);
    this.mRouterObj = localObject1;
    localObject1 = createCallbackObj();
    this.mCallbackObj = localObject1;
    localObject1 = createVolumeCallbackObj();
    this.mVolumeCallbackObj = localObject1;
    localObject1 = paramContext.getResources();
    Object localObject2 = this.mRouterObj;
    int i = R.string.mr_user_route_category_name;
    localObject1 = ((Resources)localObject1).getString(i);
    localObject1 = MediaRouterJellybean.createRouteCategory(localObject2, (String)localObject1, false);
    this.mUserRouteCategoryObj = localObject1;
    updateSystemRoutes();
  }
  
  private boolean addSystemRouteNoPublish(Object paramObject)
  {
    Object localObject = getUserRouteRecord(paramObject);
    int i;
    if (localObject == null)
    {
      i = findSystemRouteRecord(paramObject);
      if (i < 0)
      {
        localObject = assignRouteId(paramObject);
        SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord localSystemRouteRecord = new android/support/v7/media/SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord;
        localSystemRouteRecord.<init>(paramObject, (String)localObject);
        updateSystemRouteDescriptor(localSystemRouteRecord);
        localObject = this.mSystemRouteRecords;
        ((ArrayList)localObject).add(localSystemRouteRecord);
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject = null;
    }
  }
  
  private String assignRouteId(Object paramObject)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = getDefaultRoute();
    int k;
    if (localObject1 == paramObject)
    {
      k = j;
      if (k == 0) {
        break label53;
      }
    }
    label53:
    String str;
    Object localObject2;
    int n;
    Object localObject3;
    for (localObject1 = "DEFAULT_ROUTE";; localObject1 = String.format((Locale)localObject1, str, (Object[])localObject2))
    {
      m = findSystemRouteRecordByDescriptorId((String)localObject1);
      if (m >= 0) {
        break label105;
      }
      return (String)localObject1;
      k = 0;
      localObject1 = null;
      break;
      localObject1 = Locale.US;
      str = "ROUTE_%08x";
      localObject2 = new Object[j];
      n = getRouteName(paramObject).hashCode();
      localObject3 = Integer.valueOf(n);
      localObject2[0] = localObject3;
    }
    label105:
    int m = i;
    for (;;)
    {
      localObject2 = Locale.US;
      localObject3 = "%s_%d";
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = localObject1;
      Integer localInteger = Integer.valueOf(m);
      arrayOfObject[j] = localInteger;
      localObject2 = String.format((Locale)localObject2, (String)localObject3, arrayOfObject);
      n = findSystemRouteRecordByDescriptorId((String)localObject2);
      if (n < 0)
      {
        localObject1 = localObject2;
        break;
      }
      m += 1;
    }
  }
  
  private void updateSystemRoutes()
  {
    boolean bool1 = false;
    Iterator localIterator = MediaRouterJellybean.getRoutes(this.mRouterObj).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      Object localObject = localIterator.next();
      bool2 = addSystemRouteNoPublish(localObject);
      bool1 |= bool2;
    }
    if (bool1) {
      publishRoutes();
    }
  }
  
  protected Object createCallbackObj()
  {
    return MediaRouterJellybean.createCallback(this);
  }
  
  protected Object createVolumeCallbackObj()
  {
    return MediaRouterJellybean.createVolumeCallback(this);
  }
  
  protected int findSystemRouteRecord(Object paramObject)
  {
    Object localObject = this.mSystemRouteRecords;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)this.mSystemRouteRecords.get(j)).mRouteObj;
      if (localObject != paramObject) {}
    }
    for (int k = j;; k = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  protected int findSystemRouteRecordByDescriptorId(String paramString)
  {
    Object localObject = this.mSystemRouteRecords;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)this.mSystemRouteRecords.get(j)).mRouteDescriptorId;
      k = ((String)localObject).equals(paramString);
      if (k == 0) {}
    }
    int m;
    for (int k = j;; m = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  protected int findUserRouteRecord(MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject = this.mUserRouteRecords;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = ((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)this.mUserRouteRecords.get(j)).mRoute;
      if (localObject != paramRouteInfo) {}
    }
    for (int k = j;; k = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  protected Object getDefaultRoute()
  {
    MediaRouterJellybean.GetDefaultRouteWorkaround localGetDefaultRouteWorkaround = this.mGetDefaultRouteWorkaround;
    if (localGetDefaultRouteWorkaround == null)
    {
      localGetDefaultRouteWorkaround = new android/support/v7/media/MediaRouterJellybean$GetDefaultRouteWorkaround;
      localGetDefaultRouteWorkaround.<init>();
      this.mGetDefaultRouteWorkaround = localGetDefaultRouteWorkaround;
    }
    localGetDefaultRouteWorkaround = this.mGetDefaultRouteWorkaround;
    Object localObject = this.mRouterObj;
    return localGetDefaultRouteWorkaround.getDefaultRoute(localObject);
  }
  
  protected String getRouteName(Object paramObject)
  {
    Object localObject = getContext();
    localObject = MediaRouterJellybean.RouteInfo.getName(paramObject, (Context)localObject);
    if (localObject != null) {}
    for (localObject = ((CharSequence)localObject).toString();; localObject = "") {
      return (String)localObject;
    }
  }
  
  protected SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord getUserRouteRecord(Object paramObject)
  {
    Object localObject = MediaRouterJellybean.RouteInfo.getTag(paramObject);
    boolean bool = localObject instanceof SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord;
    if (bool) {}
    for (localObject = (SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject;; localObject = null) {
      return (SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject;
    }
  }
  
  protected void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
  {
    Object localObject = paramSystemRouteRecord.mRouteObj;
    int i = MediaRouterJellybean.RouteInfo.getSupportedTypes(localObject);
    int j = i & 0x1;
    if (j != 0)
    {
      ArrayList localArrayList = LIVE_AUDIO_CONTROL_FILTERS;
      paramBuilder.addControlFilters(localArrayList);
    }
    i &= 0x2;
    if (i != 0)
    {
      localObject = LIVE_VIDEO_CONTROL_FILTERS;
      paramBuilder.addControlFilters((Collection)localObject);
    }
    i = MediaRouterJellybean.RouteInfo.getPlaybackType(paramSystemRouteRecord.mRouteObj);
    paramBuilder.setPlaybackType(i);
    i = MediaRouterJellybean.RouteInfo.getPlaybackStream(paramSystemRouteRecord.mRouteObj);
    paramBuilder.setPlaybackStream(i);
    i = MediaRouterJellybean.RouteInfo.getVolume(paramSystemRouteRecord.mRouteObj);
    paramBuilder.setVolume(i);
    i = MediaRouterJellybean.RouteInfo.getVolumeMax(paramSystemRouteRecord.mRouteObj);
    paramBuilder.setVolumeMax(i);
    i = MediaRouterJellybean.RouteInfo.getVolumeHandling(paramSystemRouteRecord.mRouteObj);
    paramBuilder.setVolumeHandling(i);
  }
  
  public MediaRouteProvider.RouteController onCreateRouteController(String paramString)
  {
    int i = findSystemRouteRecordByDescriptorId(paramString);
    SystemMediaRouteProvider.JellybeanImpl.SystemRouteController localSystemRouteController;
    if (i >= 0)
    {
      localObject = (SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)this.mSystemRouteRecords.get(i);
      localSystemRouteController = new android/support/v7/media/SystemMediaRouteProvider$JellybeanImpl$SystemRouteController;
      localObject = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localObject).mRouteObj;
      localSystemRouteController.<init>(this, localObject);
    }
    for (Object localObject = localSystemRouteController;; localObject = null)
    {
      return (MediaRouteProvider.RouteController)localObject;
      i = 0;
    }
  }
  
  public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    int i = 0;
    String str1 = null;
    int m;
    int n;
    boolean bool1;
    if (paramMediaRouteDiscoveryRequest != null)
    {
      List localList = paramMediaRouteDiscoveryRequest.getSelector().getControlCategories();
      int k = localList.size();
      m = 0;
      n = 0;
      if (m < k)
      {
        str1 = (String)localList.get(m);
        String str2 = "android.media.intent.category.LIVE_AUDIO";
        boolean bool3 = str1.equals(str2);
        if (bool3) {
          i = n | 0x1;
        }
        for (;;)
        {
          m += 1;
          n = i;
          break;
          str2 = "android.media.intent.category.LIVE_VIDEO";
          i = str1.equals(str2);
          int j;
          if (i != 0) {
            j = n | 0x2;
          } else {
            j = 0x800000 | n;
          }
        }
      }
      bool1 = paramMediaRouteDiscoveryRequest.isActiveScan();
    }
    for (;;)
    {
      m = this.mRouteTypes;
      if (m == n)
      {
        boolean bool2 = this.mActiveScan;
        if (bool2 == bool1) {}
      }
      else
      {
        this.mRouteTypes = n;
        this.mActiveScan = bool1;
        updateCallback();
        updateSystemRoutes();
      }
      return;
      n = 0;
    }
  }
  
  public void onRouteAdded(Object paramObject)
  {
    boolean bool = addSystemRouteNoPublish(paramObject);
    if (bool) {
      publishRoutes();
    }
  }
  
  public void onRouteChanged(Object paramObject)
  {
    Object localObject = getUserRouteRecord(paramObject);
    if (localObject == null)
    {
      int i = findSystemRouteRecord(paramObject);
      if (i >= 0)
      {
        ArrayList localArrayList = this.mSystemRouteRecords;
        localObject = (SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localArrayList.get(i);
        updateSystemRouteDescriptor((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localObject);
        publishRoutes();
      }
    }
  }
  
  public void onRouteGrouped(Object paramObject1, Object paramObject2, int paramInt) {}
  
  public void onRouteRemoved(Object paramObject)
  {
    SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord localUserRouteRecord = getUserRouteRecord(paramObject);
    if (localUserRouteRecord == null)
    {
      int i = findSystemRouteRecord(paramObject);
      if (i >= 0)
      {
        ArrayList localArrayList = this.mSystemRouteRecords;
        localArrayList.remove(i);
        publishRoutes();
      }
    }
  }
  
  public void onRouteSelected(int paramInt, Object paramObject)
  {
    Object localObject = this.mRouterObj;
    int i = 8388611;
    localObject = MediaRouterJellybean.getSelectedRoute(localObject, i);
    if (paramObject != localObject) {}
    for (;;)
    {
      return;
      localObject = getUserRouteRecord(paramObject);
      if (localObject != null)
      {
        localObject = ((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject).mRoute;
        ((MediaRouter.RouteInfo)localObject).select();
      }
      else
      {
        int j = findSystemRouteRecord(paramObject);
        if (j >= 0)
        {
          localObject = (SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)this.mSystemRouteRecords.get(j);
          SystemMediaRouteProvider.SyncCallback localSyncCallback = this.mSyncCallback;
          localObject = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localObject).mRouteDescriptorId;
          localObject = localSyncCallback.getSystemRouteByDescriptorId((String)localObject);
          if (localObject != null) {
            ((MediaRouter.RouteInfo)localObject).select();
          }
        }
      }
    }
  }
  
  public void onRouteUngrouped(Object paramObject1, Object paramObject2) {}
  
  public void onRouteUnselected(int paramInt, Object paramObject) {}
  
  public void onRouteVolumeChanged(Object paramObject)
  {
    Object localObject1 = getUserRouteRecord(paramObject);
    if (localObject1 == null)
    {
      int i = findSystemRouteRecord(paramObject);
      if (i >= 0)
      {
        Object localObject2 = this.mSystemRouteRecords;
        localObject1 = (SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)((ArrayList)localObject2).get(i);
        int j = MediaRouterJellybean.RouteInfo.getVolume(paramObject);
        Object localObject3 = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localObject1).mRouteDescriptor;
        int k = ((MediaRouteDescriptor)localObject3).getVolume();
        if (j != k)
        {
          localObject3 = new android/support/v7/media/MediaRouteDescriptor$Builder;
          MediaRouteDescriptor localMediaRouteDescriptor = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localObject1).mRouteDescriptor;
          ((MediaRouteDescriptor.Builder)localObject3).<init>(localMediaRouteDescriptor);
          localObject2 = ((MediaRouteDescriptor.Builder)localObject3).setVolume(j).build();
          ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localObject1).mRouteDescriptor = ((MediaRouteDescriptor)localObject2);
          publishRoutes();
        }
      }
    }
  }
  
  public void onSyncRouteAdded(MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject1 = paramRouteInfo.getProviderInstance();
    Object localObject2;
    if (localObject1 != this)
    {
      localObject1 = this.mRouterObj;
      localObject2 = this.mUserRouteCategoryObj;
      localObject1 = MediaRouterJellybean.createUserRoute(localObject1, localObject2);
      localObject2 = new android/support/v7/media/SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord;
      ((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject2).<init>(paramRouteInfo, localObject1);
      MediaRouterJellybean.RouteInfo.setTag(localObject1, localObject2);
      Object localObject3 = this.mVolumeCallbackObj;
      MediaRouterJellybean.UserRouteInfo.setVolumeCallback(localObject1, localObject3);
      updateUserRouteProperties((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject2);
      localObject3 = this.mUserRouteRecords;
      ((ArrayList)localObject3).add(localObject2);
      localObject2 = this.mRouterObj;
      MediaRouterJellybean.addUserRoute(localObject2, localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = this.mRouterObj;
      int i = 8388611;
      localObject1 = MediaRouterJellybean.getSelectedRoute(localObject1, i);
      int j = findSystemRouteRecord(localObject1);
      if (j >= 0)
      {
        localObject1 = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)this.mSystemRouteRecords.get(j)).mRouteDescriptorId;
        localObject2 = paramRouteInfo.getDescriptorId();
        boolean bool = ((String)localObject1).equals(localObject2);
        if (bool) {
          paramRouteInfo.select();
        }
      }
    }
  }
  
  public void onSyncRouteChanged(MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject = paramRouteInfo.getProviderInstance();
    if (localObject != this)
    {
      int i = findUserRouteRecord(paramRouteInfo);
      if (i >= 0)
      {
        ArrayList localArrayList = this.mUserRouteRecords;
        localObject = (SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localArrayList.get(i);
        updateUserRouteProperties((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject);
      }
    }
  }
  
  public void onSyncRouteRemoved(MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject1 = paramRouteInfo.getProviderInstance();
    if (localObject1 != this)
    {
      int i = findUserRouteRecord(paramRouteInfo);
      if (i >= 0)
      {
        localObject1 = (SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)this.mUserRouteRecords.remove(i);
        MediaRouterJellybean.RouteInfo.setTag(((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject1).mRouteObj, null);
        MediaRouterJellybean.UserRouteInfo.setVolumeCallback(((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject1).mRouteObj, null);
        Object localObject2 = this.mRouterObj;
        localObject1 = ((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject1).mRouteObj;
        MediaRouterJellybean.removeUserRoute(localObject2, localObject1);
      }
    }
  }
  
  public void onSyncRouteSelected(MediaRouter.RouteInfo paramRouteInfo)
  {
    boolean bool = paramRouteInfo.isSelected();
    if (!bool) {}
    for (;;)
    {
      return;
      Object localObject = paramRouteInfo.getProviderInstance();
      int i;
      ArrayList localArrayList;
      if (localObject != this)
      {
        i = findUserRouteRecord(paramRouteInfo);
        if (i >= 0)
        {
          localArrayList = this.mUserRouteRecords;
          localObject = ((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localArrayList.get(i)).mRouteObj;
          selectRoute(localObject);
        }
      }
      else
      {
        localObject = paramRouteInfo.getDescriptorId();
        i = findSystemRouteRecordByDescriptorId((String)localObject);
        if (i >= 0)
        {
          localArrayList = this.mSystemRouteRecords;
          localObject = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)localArrayList.get(i)).mRouteObj;
          selectRoute(localObject);
        }
      }
    }
  }
  
  public void onVolumeSetRequest(Object paramObject, int paramInt)
  {
    Object localObject = getUserRouteRecord(paramObject);
    if (localObject != null)
    {
      localObject = ((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject).mRoute;
      ((MediaRouter.RouteInfo)localObject).requestSetVolume(paramInt);
    }
  }
  
  public void onVolumeUpdateRequest(Object paramObject, int paramInt)
  {
    Object localObject = getUserRouteRecord(paramObject);
    if (localObject != null)
    {
      localObject = ((SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord)localObject).mRoute;
      ((MediaRouter.RouteInfo)localObject).requestUpdateVolume(paramInt);
    }
  }
  
  protected void publishRoutes()
  {
    MediaRouteProviderDescriptor.Builder localBuilder = new android/support/v7/media/MediaRouteProviderDescriptor$Builder;
    localBuilder.<init>();
    int i = this.mSystemRouteRecords.size();
    int j = 0;
    Object localObject = null;
    for (int k = 0; k < i; k = j)
    {
      localObject = ((SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)this.mSystemRouteRecords.get(k)).mRouteDescriptor;
      localBuilder.addRoute((MediaRouteDescriptor)localObject);
      j = k + 1;
    }
    localObject = localBuilder.build();
    setDescriptor((MediaRouteProviderDescriptor)localObject);
  }
  
  protected void selectRoute(Object paramObject)
  {
    MediaRouterJellybean.SelectRouteWorkaround localSelectRouteWorkaround = this.mSelectRouteWorkaround;
    if (localSelectRouteWorkaround == null)
    {
      localSelectRouteWorkaround = new android/support/v7/media/MediaRouterJellybean$SelectRouteWorkaround;
      localSelectRouteWorkaround.<init>();
      this.mSelectRouteWorkaround = localSelectRouteWorkaround;
    }
    localSelectRouteWorkaround = this.mSelectRouteWorkaround;
    Object localObject = this.mRouterObj;
    localSelectRouteWorkaround.selectRoute(localObject, 8388611, paramObject);
  }
  
  protected void updateCallback()
  {
    boolean bool = this.mCallbackRegistered;
    Object localObject1;
    if (bool)
    {
      bool = false;
      this.mCallbackRegistered = false;
      localObject1 = this.mRouterObj;
      Object localObject2 = this.mCallbackObj;
      MediaRouterJellybean.removeCallback(localObject1, localObject2);
    }
    int i = this.mRouteTypes;
    if (i != 0)
    {
      i = 1;
      this.mCallbackRegistered = i;
      localObject1 = this.mRouterObj;
      int j = this.mRouteTypes;
      Object localObject3 = this.mCallbackObj;
      MediaRouterJellybean.addCallback(localObject1, j, localObject3);
    }
  }
  
  protected void updateSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord)
  {
    Object localObject1 = new android/support/v7/media/MediaRouteDescriptor$Builder;
    String str = paramSystemRouteRecord.mRouteDescriptorId;
    Object localObject2 = paramSystemRouteRecord.mRouteObj;
    localObject2 = getRouteName(localObject2);
    ((MediaRouteDescriptor.Builder)localObject1).<init>(str, (String)localObject2);
    onBuildSystemRouteDescriptor(paramSystemRouteRecord, (MediaRouteDescriptor.Builder)localObject1);
    localObject1 = ((MediaRouteDescriptor.Builder)localObject1).build();
    paramSystemRouteRecord.mRouteDescriptor = ((MediaRouteDescriptor)localObject1);
  }
  
  protected void updateUserRouteProperties(SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord paramUserRouteRecord)
  {
    Object localObject = paramUserRouteRecord.mRouteObj;
    String str = paramUserRouteRecord.mRoute.getName();
    MediaRouterJellybean.UserRouteInfo.setName(localObject, str);
    localObject = paramUserRouteRecord.mRouteObj;
    int i = paramUserRouteRecord.mRoute.getPlaybackType();
    MediaRouterJellybean.UserRouteInfo.setPlaybackType(localObject, i);
    localObject = paramUserRouteRecord.mRouteObj;
    i = paramUserRouteRecord.mRoute.getPlaybackStream();
    MediaRouterJellybean.UserRouteInfo.setPlaybackStream(localObject, i);
    localObject = paramUserRouteRecord.mRouteObj;
    i = paramUserRouteRecord.mRoute.getVolume();
    MediaRouterJellybean.UserRouteInfo.setVolume(localObject, i);
    localObject = paramUserRouteRecord.mRouteObj;
    i = paramUserRouteRecord.mRoute.getVolumeMax();
    MediaRouterJellybean.UserRouteInfo.setVolumeMax(localObject, i);
    localObject = paramUserRouteRecord.mRouteObj;
    i = paramUserRouteRecord.mRoute.getVolumeHandling();
    MediaRouterJellybean.UserRouteInfo.setVolumeHandling(localObject, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider$JellybeanImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */