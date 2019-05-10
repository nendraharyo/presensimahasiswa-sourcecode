package android.support.v7.media;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.v4.app.b;
import android.support.v4.c.a.a;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat.b;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class MediaRouter$GlobalMediaRouter
  implements RegisteredMediaRouteProviderWatcher.Callback, SystemMediaRouteProvider.SyncCallback
{
  private final Context mApplicationContext;
  private final MediaRouter.GlobalMediaRouter.CallbackHandler mCallbackHandler;
  private MediaSessionCompat mCompatSession;
  private MediaRouter.RouteInfo mDefaultRoute;
  private MediaRouteDiscoveryRequest mDiscoveryRequest;
  private final a mDisplayManager;
  private final boolean mLowRam;
  private MediaRouter.GlobalMediaRouter.MediaSessionRecord mMediaSession;
  private final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo;
  private final MediaRouter.GlobalMediaRouter.ProviderCallback mProviderCallback;
  private final ArrayList mProviders;
  private MediaSessionCompat mRccMediaSession;
  private RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
  private final ArrayList mRemoteControlClients;
  private final ArrayList mRouters;
  private final ArrayList mRoutes;
  private MediaRouter.RouteInfo mSelectedRoute;
  private MediaRouteProvider.RouteController mSelectedRouteController;
  private MediaSessionCompat.b mSessionActiveListener;
  private final SystemMediaRouteProvider mSystemProvider;
  
  MediaRouter$GlobalMediaRouter(Context paramContext)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mRouters = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mRoutes = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mProviders = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mRemoteControlClients = ((ArrayList)localObject);
    localObject = new android/support/v7/media/RemoteControlClientCompat$PlaybackInfo;
    ((RemoteControlClientCompat.PlaybackInfo)localObject).<init>();
    this.mPlaybackInfo = ((RemoteControlClientCompat.PlaybackInfo)localObject);
    localObject = new android/support/v7/media/MediaRouter$GlobalMediaRouter$ProviderCallback;
    ((MediaRouter.GlobalMediaRouter.ProviderCallback)localObject).<init>(this, null);
    this.mProviderCallback = ((MediaRouter.GlobalMediaRouter.ProviderCallback)localObject);
    localObject = new android/support/v7/media/MediaRouter$GlobalMediaRouter$CallbackHandler;
    ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject).<init>(this, null);
    this.mCallbackHandler = ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject);
    localObject = new android/support/v7/media/MediaRouter$GlobalMediaRouter$1;
    ((MediaRouter.GlobalMediaRouter.1)localObject).<init>(this);
    this.mSessionActiveListener = ((MediaSessionCompat.b)localObject);
    this.mApplicationContext = paramContext;
    localObject = a.a(paramContext);
    this.mDisplayManager = ((a)localObject);
    boolean bool = b.a((ActivityManager)paramContext.getSystemService("activity"));
    this.mLowRam = bool;
    localObject = SystemMediaRouteProvider.obtain(paramContext, this);
    this.mSystemProvider = ((SystemMediaRouteProvider)localObject);
    localObject = this.mSystemProvider;
    addProvider((MediaRouteProvider)localObject);
  }
  
  private String assignRouteUniqueId(MediaRouter.ProviderInfo paramProviderInfo, String paramString)
  {
    int i = 2;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = paramProviderInfo.getComponentName().flattenToShortString();
    localObject1 = ((StringBuilder)localObject1).append(str1).append(":").append(paramString);
    str1 = ((StringBuilder)localObject1).toString();
    int j = findRouteByUniqueId(str1);
    if (j < 0)
    {
      localObject1 = str1;
      return (String)localObject1;
    }
    j = i;
    for (;;)
    {
      Object localObject2 = Locale.US;
      String str2 = "%s_%d";
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      int k = 1;
      Integer localInteger = Integer.valueOf(j);
      arrayOfObject[k] = localInteger;
      localObject2 = String.format((Locale)localObject2, str2, arrayOfObject);
      int m = findRouteByUniqueId((String)localObject2);
      if (m < 0)
      {
        localObject1 = localObject2;
        break;
      }
      j += 1;
    }
  }
  
  private MediaRouter.RouteInfo chooseFallbackRoute()
  {
    Object localObject = this.mRoutes;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    boolean bool2;
    do
    {
      do
      {
        MediaRouter.RouteInfo localRouteInfo;
        do
        {
          boolean bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject = (MediaRouter.RouteInfo)localIterator.next();
          localRouteInfo = this.mDefaultRoute;
        } while (localObject == localRouteInfo);
        bool2 = isSystemLiveAudioOnlyRoute((MediaRouter.RouteInfo)localObject);
      } while (!bool2);
      bool2 = isRouteSelectable((MediaRouter.RouteInfo)localObject);
    } while (!bool2);
    for (;;)
    {
      return (MediaRouter.RouteInfo)localObject;
      localObject = this.mDefaultRoute;
    }
  }
  
  private int findProviderInfo(MediaRouteProvider paramMediaRouteProvider)
  {
    Object localObject = this.mProviders;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = MediaRouter.ProviderInfo.access$600((MediaRouter.ProviderInfo)this.mProviders.get(j));
      if (localObject != paramMediaRouteProvider) {}
    }
    for (int k = j;; k = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  private int findRemoteControlClientRecord(Object paramObject)
  {
    Object localObject = this.mRemoteControlClients;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = ((MediaRouter.GlobalMediaRouter.RemoteControlClientRecord)this.mRemoteControlClients.get(j)).getRemoteControlClient();
      if (localObject != paramObject) {}
    }
    for (int k = j;; k = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  private int findRouteByUniqueId(String paramString)
  {
    Object localObject = this.mRoutes;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = MediaRouter.RouteInfo.access$800((MediaRouter.RouteInfo)this.mRoutes.get(j));
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
  
  private boolean isRouteSelectable(MediaRouter.RouteInfo paramRouteInfo)
  {
    MediaRouteDescriptor localMediaRouteDescriptor = MediaRouter.RouteInfo.access$900(paramRouteInfo);
    boolean bool;
    if (localMediaRouteDescriptor != null)
    {
      bool = MediaRouter.RouteInfo.access$400(paramRouteInfo);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMediaRouteDescriptor = null;
    }
  }
  
  private boolean isSystemDefaultRoute(MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject1 = paramRouteInfo.getProviderInstance();
    Object localObject2 = this.mSystemProvider;
    boolean bool;
    if (localObject1 == localObject2)
    {
      localObject1 = MediaRouter.RouteInfo.access$000(paramRouteInfo);
      localObject2 = "DEFAULT_ROUTE";
      bool = ((String)localObject1).equals(localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  private boolean isSystemLiveAudioOnlyRoute(MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject = paramRouteInfo.getProviderInstance();
    SystemMediaRouteProvider localSystemMediaRouteProvider = this.mSystemProvider;
    boolean bool;
    if (localObject == localSystemMediaRouteProvider)
    {
      localObject = "android.media.intent.category.LIVE_AUDIO";
      bool = paramRouteInfo.supportsControlCategory((String)localObject);
      if (bool)
      {
        localObject = "android.media.intent.category.LIVE_VIDEO";
        bool = paramRouteInfo.supportsControlCategory((String)localObject);
        if (!bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void setSelectedRouteInternal(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    Object localObject1 = this.mSelectedRoute;
    if (localObject1 != paramRouteInfo)
    {
      localObject1 = this.mSelectedRoute;
      boolean bool;
      Object localObject2;
      Object localObject3;
      int i;
      if (localObject1 != null)
      {
        bool = MediaRouter.access$500();
        if (bool)
        {
          localObject1 = "MediaRouter";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Route unselected: ");
          localObject3 = this.mSelectedRoute;
          localObject2 = ((StringBuilder)localObject2).append(localObject3);
          localObject3 = " reason: ";
          localObject2 = (String)localObject3 + paramInt;
          Log.d((String)localObject1, (String)localObject2);
        }
        localObject1 = this.mCallbackHandler;
        i = 263;
        localObject3 = this.mSelectedRoute;
        ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject1).post(i, localObject3);
        localObject1 = this.mSelectedRouteController;
        if (localObject1 != null)
        {
          this.mSelectedRouteController.onUnselect(paramInt);
          this.mSelectedRouteController.onRelease();
          bool = false;
          localObject1 = null;
          this.mSelectedRouteController = null;
        }
      }
      this.mSelectedRoute = paramRouteInfo;
      localObject1 = this.mSelectedRoute;
      if (localObject1 != null)
      {
        localObject1 = paramRouteInfo.getProviderInstance();
        localObject2 = MediaRouter.RouteInfo.access$000(paramRouteInfo);
        localObject1 = ((MediaRouteProvider)localObject1).onCreateRouteController((String)localObject2);
        this.mSelectedRouteController = ((MediaRouteProvider.RouteController)localObject1);
        localObject1 = this.mSelectedRouteController;
        if (localObject1 != null)
        {
          localObject1 = this.mSelectedRouteController;
          ((MediaRouteProvider.RouteController)localObject1).onSelect();
        }
        bool = MediaRouter.access$500();
        if (bool)
        {
          localObject1 = "MediaRouter";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Route selected: ");
          localObject3 = this.mSelectedRoute;
          localObject2 = localObject3;
          Log.d((String)localObject1, (String)localObject2);
        }
        localObject1 = this.mCallbackHandler;
        i = 262;
        localObject3 = this.mSelectedRoute;
        ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject1).post(i, localObject3);
      }
      updatePlaybackInfoFromSelectedRoute();
    }
  }
  
  private void updatePlaybackInfoFromSelectedRoute()
  {
    MediaRouter.GlobalMediaRouter.MediaSessionRecord localMediaSessionRecord = null;
    Object localObject1 = this.mSelectedRoute;
    int i;
    int j;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject1 = this.mPlaybackInfo;
      i = this.mSelectedRoute.getVolume();
      ((RemoteControlClientCompat.PlaybackInfo)localObject1).volume = i;
      localObject1 = this.mPlaybackInfo;
      i = this.mSelectedRoute.getVolumeMax();
      ((RemoteControlClientCompat.PlaybackInfo)localObject1).volumeMax = i;
      localObject1 = this.mPlaybackInfo;
      i = this.mSelectedRoute.getVolumeHandling();
      ((RemoteControlClientCompat.PlaybackInfo)localObject1).volumeHandling = i;
      localObject1 = this.mPlaybackInfo;
      i = this.mSelectedRoute.getPlaybackStream();
      ((RemoteControlClientCompat.PlaybackInfo)localObject1).playbackStream = i;
      localObject1 = this.mPlaybackInfo;
      i = this.mSelectedRoute.getPlaybackType();
      ((RemoteControlClientCompat.PlaybackInfo)localObject1).playbackType = i;
      localObject1 = this.mRemoteControlClients;
      j = ((ArrayList)localObject1).size();
      i = 0;
      localObject2 = null;
      while (i < j)
      {
        localObject1 = (MediaRouter.GlobalMediaRouter.RemoteControlClientRecord)this.mRemoteControlClients.get(i);
        ((MediaRouter.GlobalMediaRouter.RemoteControlClientRecord)localObject1).updatePlaybackInfo();
        k = i + 1;
        i = k;
      }
      localObject1 = this.mMediaSession;
      if (localObject1 != null)
      {
        localObject1 = this.mSelectedRoute;
        localObject2 = getDefaultRoute();
        if (localObject1 == localObject2)
        {
          localObject1 = this.mMediaSession;
          ((MediaRouter.GlobalMediaRouter.MediaSessionRecord)localObject1).clearVolumeHandling();
        }
      }
      else
      {
        return;
      }
      localObject1 = this.mPlaybackInfo;
      k = ((RemoteControlClientCompat.PlaybackInfo)localObject1).volumeHandling;
      i = 1;
      if (k != i) {
        break label271;
      }
      k = 2;
    }
    for (;;)
    {
      localMediaSessionRecord = this.mMediaSession;
      localObject2 = this.mPlaybackInfo;
      i = ((RemoteControlClientCompat.PlaybackInfo)localObject2).volumeMax;
      RemoteControlClientCompat.PlaybackInfo localPlaybackInfo = this.mPlaybackInfo;
      j = localPlaybackInfo.volume;
      localMediaSessionRecord.configureVolume(k, i, j);
      break;
      localObject1 = this.mMediaSession;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.mMediaSession;
      ((MediaRouter.GlobalMediaRouter.MediaSessionRecord)localObject1).clearVolumeHandling();
      break;
      label271:
      k = 0;
      localObject1 = null;
    }
  }
  
  private void updateProviderContents(MediaRouter.ProviderInfo paramProviderInfo, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject1 = null;
    boolean bool2 = paramProviderInfo.updateDescriptor(paramMediaRouteProviderDescriptor);
    int m;
    String str;
    int n;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i3;
    Object localObject5;
    Object localObject6;
    int i4;
    float f2;
    if (bool2) {
      if (paramMediaRouteProviderDescriptor != null)
      {
        bool2 = paramMediaRouteProviderDescriptor.isValid();
        if (bool2)
        {
          List localList = paramMediaRouteProviderDescriptor.getRoutes();
          int k = localList.size();
          m = 0;
          str = null;
          n = 0;
          localObject2 = null;
          if (m >= k) {
            break label726;
          }
          localObject3 = (MediaRouteDescriptor)localList.get(m);
          localObject4 = ((MediaRouteDescriptor)localObject3).getId();
          i3 = paramProviderInfo.findRouteByDescriptorId((String)localObject4);
          if (i3 < 0)
          {
            localObject5 = assignRouteUniqueId(paramProviderInfo, (String)localObject4);
            localObject6 = new android/support/v7/media/MediaRouter$RouteInfo;
            ((MediaRouter.RouteInfo)localObject6).<init>(paramProviderInfo, (String)localObject4, (String)localObject5);
            localObject5 = MediaRouter.ProviderInfo.access$700(paramProviderInfo);
            i4 = n + 1;
            ((ArrayList)localObject5).add(n, localObject6);
            localObject2 = this.mRoutes;
            ((ArrayList)localObject2).add(localObject6);
            ((MediaRouter.RouteInfo)localObject6).updateDescriptor((MediaRouteDescriptor)localObject3);
            bool2 = MediaRouter.access$500();
            if (bool2)
            {
              localObject3 = "MediaRouter";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject5 = "Route added: ";
              localObject2 = (String)localObject5 + localObject6;
              Log.d((String)localObject3, (String)localObject2);
            }
            localObject3 = this.mCallbackHandler;
            n = 257;
            ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject3).post(n, localObject6);
            bool2 = bool1;
            f2 = f1;
          }
        }
      }
    }
    for (;;)
    {
      m += 1;
      n = i4;
      bool1 = bool2;
      f1 = f2;
      break;
      if (i3 < n)
      {
        localObject4 = "MediaRouter";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject6 = "Ignoring route descriptor with duplicate id: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject3 = localObject3;
        Log.w((String)localObject4, (String)localObject3);
        bool2 = bool1;
        f2 = f1;
        i4 = n;
      }
      else
      {
        localObject4 = (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$700(paramProviderInfo).get(i3);
        Object localObject7 = MediaRouter.ProviderInfo.access$700(paramProviderInfo);
        int i5 = n + 1;
        Collections.swap((List)localObject7, i3, n);
        int i = ((MediaRouter.RouteInfo)localObject4).updateDescriptor((MediaRouteDescriptor)localObject3);
        if (i != 0)
        {
          n = i & 0x1;
          if (n != 0)
          {
            boolean bool5 = MediaRouter.access$500();
            if (bool5)
            {
              localObject2 = "MediaRouter";
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject7 = "Route changed: ";
              localObject6 = (String)localObject7 + localObject4;
              Log.d((String)localObject2, (String)localObject6);
            }
            localObject2 = this.mCallbackHandler;
            i3 = 259;
            ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject2).post(i3, localObject4);
          }
          int i1 = i & 0x2;
          if (i1 != 0)
          {
            boolean bool6 = MediaRouter.access$500();
            if (bool6)
            {
              localObject2 = "MediaRouter";
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject7 = "Route volume changed: ";
              localObject6 = (String)localObject7 + localObject4;
              Log.d((String)localObject2, (String)localObject6);
            }
            localObject2 = this.mCallbackHandler;
            i3 = 260;
            ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject2).post(i3, localObject4);
          }
          i &= 0x4;
          boolean bool3;
          int i2;
          if (i != 0)
          {
            bool3 = MediaRouter.access$500();
            if (bool3)
            {
              localObject3 = "MediaRouter";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject6 = "Route presentation display changed: ";
              localObject2 = (String)localObject6 + localObject4;
              Log.d((String)localObject3, (String)localObject2);
            }
            localObject3 = this.mCallbackHandler;
            i2 = 261;
            ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject3).post(i2, localObject4);
          }
          localObject3 = this.mSelectedRoute;
          if (localObject4 == localObject3)
          {
            bool3 = true;
            f2 = Float.MIN_VALUE;
            i4 = i5;
            continue;
            localObject3 = "MediaRouter";
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject2 = "Ignoring invalid provider descriptor: ";
            localObject4 = (String)localObject2 + paramMediaRouteProviderDescriptor;
            Log.w((String)localObject3, (String)localObject4);
            i2 = 0;
            localObject2 = null;
            label726:
            localObject3 = MediaRouter.ProviderInfo.access$700(paramProviderInfo);
            int j = ((ArrayList)localObject3).size() + -1;
            for (i4 = j; i4 >= i2; i4 = j)
            {
              localObject3 = (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$700(paramProviderInfo).get(i4);
              i5 = 0;
              ((MediaRouter.RouteInfo)localObject3).updateDescriptor(null);
              localObject5 = this.mRoutes;
              ((ArrayList)localObject5).remove(localObject3);
              j = i4 + -1;
            }
            updateSelectedRouteIfNeeded(bool1);
            localObject3 = MediaRouter.ProviderInfo.access$700(paramProviderInfo);
            j = ((ArrayList)localObject3).size() + -1;
            for (i4 = j; i4 >= i2; i4 = j)
            {
              localObject3 = (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$700(paramProviderInfo).remove(i4);
              bool1 = MediaRouter.access$500();
              if (bool1)
              {
                localObject1 = "MediaRouter";
                localObject5 = new java/lang/StringBuilder;
                ((StringBuilder)localObject5).<init>();
                str = "Route removed: ";
                localObject5 = str + localObject3;
                Log.d((String)localObject1, (String)localObject5);
              }
              localObject1 = this.mCallbackHandler;
              i5 = 258;
              ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject1).post(i5, localObject3);
              j = i4 + -1;
            }
            bool4 = MediaRouter.access$500();
            if (bool4)
            {
              localObject3 = "MediaRouter";
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              localObject1 = "Provider changed: ";
              localObject4 = (String)localObject1 + paramProviderInfo;
              Log.d((String)localObject3, (String)localObject4);
            }
            localObject3 = this.mCallbackHandler;
            i4 = 515;
            ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject3).post(i4, paramProviderInfo);
            return;
          }
        }
        boolean bool4 = bool1;
        f2 = f1;
        i4 = i5;
      }
    }
  }
  
  private void updateProviderDescriptor(MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    int i = findProviderInfo(paramMediaRouteProvider);
    if (i >= 0)
    {
      ArrayList localArrayList = this.mProviders;
      MediaRouter.ProviderInfo localProviderInfo = (MediaRouter.ProviderInfo)localArrayList.get(i);
      updateProviderContents(localProviderInfo, paramMediaRouteProviderDescriptor);
    }
  }
  
  private void updateSelectedRouteIfNeeded(boolean paramBoolean)
  {
    Object localObject1 = this.mDefaultRoute;
    boolean bool1;
    Object localObject2;
    MediaRouter.RouteInfo localRouteInfo;
    if (localObject1 != null)
    {
      localObject1 = this.mDefaultRoute;
      bool1 = isRouteSelectable((MediaRouter.RouteInfo)localObject1);
      if (!bool1)
      {
        localObject1 = "MediaRouter";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Clearing the default route because it is no longer selectable: ");
        localRouteInfo = this.mDefaultRoute;
        localObject2 = localRouteInfo;
        Log.i((String)localObject1, (String)localObject2);
        this.mDefaultRoute = null;
      }
    }
    localObject1 = this.mDefaultRoute;
    if (localObject1 == null)
    {
      localObject1 = this.mRoutes;
      bool1 = ((ArrayList)localObject1).isEmpty();
      if (!bool1)
      {
        localObject1 = this.mRoutes;
        localObject2 = ((ArrayList)localObject1).iterator();
        boolean bool2;
        do
        {
          do
          {
            bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (MediaRouter.RouteInfo)((Iterator)localObject2).next();
            bool2 = isSystemDefaultRoute((MediaRouter.RouteInfo)localObject1);
          } while (!bool2);
          bool2 = isRouteSelectable((MediaRouter.RouteInfo)localObject1);
        } while (!bool2);
        this.mDefaultRoute = ((MediaRouter.RouteInfo)localObject1);
        localObject1 = "MediaRouter";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Found default route: ");
        localRouteInfo = this.mDefaultRoute;
        localObject2 = localRouteInfo;
        Log.i((String)localObject1, (String)localObject2);
      }
    }
    localObject1 = this.mSelectedRoute;
    if (localObject1 != null)
    {
      localObject1 = this.mSelectedRoute;
      bool1 = isRouteSelectable((MediaRouter.RouteInfo)localObject1);
      if (!bool1)
      {
        localObject1 = "MediaRouter";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unselecting the current route because it is no longer selectable: ");
        localRouteInfo = this.mSelectedRoute;
        localObject2 = localRouteInfo;
        Log.i((String)localObject1, (String)localObject2);
        setSelectedRouteInternal(null, 0);
      }
    }
    localObject1 = this.mSelectedRoute;
    if (localObject1 == null)
    {
      localObject1 = chooseFallbackRoute();
      setSelectedRouteInternal((MediaRouter.RouteInfo)localObject1, 0);
    }
    for (;;)
    {
      return;
      if (paramBoolean) {
        updatePlaybackInfoFromSelectedRoute();
      }
    }
  }
  
  public void addProvider(MediaRouteProvider paramMediaRouteProvider)
  {
    int i = findProviderInfo(paramMediaRouteProvider);
    if (i < 0)
    {
      Object localObject1 = new android/support/v7/media/MediaRouter$ProviderInfo;
      ((MediaRouter.ProviderInfo)localObject1).<init>(paramMediaRouteProvider);
      Object localObject2 = this.mProviders;
      ((ArrayList)localObject2).add(localObject1);
      boolean bool = MediaRouter.access$500();
      if (bool)
      {
        localObject2 = "MediaRouter";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Provider added: ";
        localObject3 = str + localObject1;
        Log.d((String)localObject2, (String)localObject3);
      }
      localObject2 = this.mCallbackHandler;
      int j = 513;
      ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject2).post(j, localObject1);
      localObject2 = paramMediaRouteProvider.getDescriptor();
      updateProviderContents((MediaRouter.ProviderInfo)localObject1, (MediaRouteProviderDescriptor)localObject2);
      localObject1 = this.mProviderCallback;
      paramMediaRouteProvider.setCallback((MediaRouteProvider.Callback)localObject1);
      localObject1 = this.mDiscoveryRequest;
      paramMediaRouteProvider.setDiscoveryRequest((MediaRouteDiscoveryRequest)localObject1);
    }
  }
  
  public void addRemoteControlClient(Object paramObject)
  {
    int i = findRemoteControlClientRecord(paramObject);
    if (i < 0)
    {
      MediaRouter.GlobalMediaRouter.RemoteControlClientRecord localRemoteControlClientRecord = new android/support/v7/media/MediaRouter$GlobalMediaRouter$RemoteControlClientRecord;
      localRemoteControlClientRecord.<init>(this, paramObject);
      ArrayList localArrayList = this.mRemoteControlClients;
      localArrayList.add(localRemoteControlClientRecord);
    }
  }
  
  public ContentResolver getContentResolver()
  {
    return this.mApplicationContext.getContentResolver();
  }
  
  public MediaRouter.RouteInfo getDefaultRoute()
  {
    Object localObject = this.mDefaultRoute;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("There is no default route.  The media router has not yet been fully initialized.");
      throw ((Throwable)localObject);
    }
    return this.mDefaultRoute;
  }
  
  public Display getDisplay(int paramInt)
  {
    return this.mDisplayManager.a(paramInt);
  }
  
  public MediaSessionCompat.Token getMediaSessionToken()
  {
    Object localObject = this.mMediaSession;
    if (localObject != null) {
      localObject = this.mMediaSession.getToken();
    }
    for (;;)
    {
      return (MediaSessionCompat.Token)localObject;
      localObject = this.mCompatSession;
      if (localObject != null) {
        localObject = this.mCompatSession.b();
      } else {
        localObject = null;
      }
    }
  }
  
  public Context getProviderContext(String paramString)
  {
    Object localObject1 = "android";
    boolean bool = paramString.equals(localObject1);
    if (bool) {
      localObject1 = this.mApplicationContext;
    }
    for (;;)
    {
      return (Context)localObject1;
      try
      {
        localObject1 = this.mApplicationContext;
        int i = 4;
        localObject1 = ((Context)localObject1).createPackageContext(paramString, i);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        bool = false;
        Object localObject2 = null;
      }
    }
  }
  
  public List getProviders()
  {
    return this.mProviders;
  }
  
  public MediaRouter getRouter(Context paramContext)
  {
    Object localObject1 = this.mRouters;
    int i = ((ArrayList)localObject1).size();
    for (;;)
    {
      int j = i + -1;
      Object localObject2;
      if (j >= 0)
      {
        localObject1 = (MediaRouter)((WeakReference)this.mRouters.get(j)).get();
        if (localObject1 == null)
        {
          localObject1 = this.mRouters;
          ((ArrayList)localObject1).remove(j);
          i = j;
          continue;
        }
        localObject2 = ((MediaRouter)localObject1).mContext;
        if (localObject2 != paramContext) {}
      }
      else
      {
        for (;;)
        {
          return (MediaRouter)localObject1;
          localObject1 = new android/support/v7/media/MediaRouter;
          ((MediaRouter)localObject1).<init>(paramContext);
          ArrayList localArrayList = this.mRouters;
          localObject2 = new java/lang/ref/WeakReference;
          ((WeakReference)localObject2).<init>(localObject1);
          localArrayList.add(localObject2);
        }
      }
      i = j;
    }
  }
  
  public List getRoutes()
  {
    return this.mRoutes;
  }
  
  public MediaRouter.RouteInfo getSelectedRoute()
  {
    Object localObject = this.mSelectedRoute;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("There is no currently selected route.  The media router has not yet been fully initialized.");
      throw ((Throwable)localObject);
    }
    return this.mSelectedRoute;
  }
  
  public MediaRouter.RouteInfo getSystemRouteByDescriptorId(String paramString)
  {
    Object localObject = this.mSystemProvider;
    int i = findProviderInfo((MediaRouteProvider)localObject);
    int j;
    if (i >= 0)
    {
      ArrayList localArrayList = this.mProviders;
      localObject = (MediaRouter.ProviderInfo)localArrayList.get(i);
      j = ((MediaRouter.ProviderInfo)localObject).findRouteByDescriptorId(paramString);
      if (j < 0) {}
    }
    for (localObject = (MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$700((MediaRouter.ProviderInfo)localObject).get(j);; localObject = null)
    {
      return (MediaRouter.RouteInfo)localObject;
      i = 0;
    }
  }
  
  public boolean isRouteAvailable(MediaRouteSelector paramMediaRouteSelector, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = paramMediaRouteSelector.isEmpty();
    Object localObject;
    if (bool2)
    {
      bool2 = false;
      localObject = null;
    }
    for (;;)
    {
      return bool2;
      int i = paramInt & 0x2;
      if (i == 0)
      {
        boolean bool3 = this.mLowRam;
        if (bool3)
        {
          bool3 = bool1;
          continue;
        }
      }
      localObject = this.mRoutes;
      int k = ((ArrayList)localObject).size();
      int m = 0;
      boolean bool4;
      if (m < k)
      {
        localObject = (MediaRouter.RouteInfo)this.mRoutes.get(m);
        int n = paramInt & 0x1;
        if (n != 0)
        {
          boolean bool5 = ((MediaRouter.RouteInfo)localObject).isDefault();
          if (!bool5) {}
        }
        do
        {
          int j = m + 1;
          m = j;
          break;
          bool4 = ((MediaRouter.RouteInfo)localObject).matchesSelector(paramMediaRouteSelector);
        } while (!bool4);
        bool4 = bool1;
      }
      else
      {
        bool4 = false;
        localObject = null;
      }
    }
  }
  
  public void removeProvider(MediaRouteProvider paramMediaRouteProvider)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = findProviderInfo(paramMediaRouteProvider);
    if (i >= 0)
    {
      paramMediaRouteProvider.setCallback(null);
      paramMediaRouteProvider.setDiscoveryRequest(null);
      Object localObject2 = (MediaRouter.ProviderInfo)this.mProviders.get(i);
      updateProviderContents((MediaRouter.ProviderInfo)localObject2, null);
      bool = MediaRouter.access$500();
      if (bool)
      {
        localObject1 = "MediaRouter";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Provider removed: ";
        localObject3 = str + localObject2;
        Log.d((String)localObject1, (String)localObject3);
      }
      localObject1 = this.mCallbackHandler;
      int j = 514;
      ((MediaRouter.GlobalMediaRouter.CallbackHandler)localObject1).post(j, localObject2);
      localObject2 = this.mProviders;
      ((ArrayList)localObject2).remove(i);
    }
  }
  
  public void removeRemoteControlClient(Object paramObject)
  {
    int i = findRemoteControlClientRecord(paramObject);
    if (i >= 0)
    {
      ArrayList localArrayList = this.mRemoteControlClients;
      MediaRouter.GlobalMediaRouter.RemoteControlClientRecord localRemoteControlClientRecord = (MediaRouter.GlobalMediaRouter.RemoteControlClientRecord)localArrayList.remove(i);
      localRemoteControlClientRecord.disconnect();
    }
  }
  
  public void requestSetVolume(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    Object localObject = this.mSelectedRoute;
    if (paramRouteInfo == localObject)
    {
      localObject = this.mSelectedRouteController;
      if (localObject != null)
      {
        localObject = this.mSelectedRouteController;
        ((MediaRouteProvider.RouteController)localObject).onSetVolume(paramInt);
      }
    }
  }
  
  public void requestUpdateVolume(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    Object localObject = this.mSelectedRoute;
    if (paramRouteInfo == localObject)
    {
      localObject = this.mSelectedRouteController;
      if (localObject != null)
      {
        localObject = this.mSelectedRouteController;
        ((MediaRouteProvider.RouteController)localObject).onUpdateVolume(paramInt);
      }
    }
  }
  
  public void selectRoute(MediaRouter.RouteInfo paramRouteInfo)
  {
    selectRoute(paramRouteInfo, 3);
  }
  
  public void selectRoute(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    Object localObject1 = this.mRoutes;
    boolean bool = ((ArrayList)localObject1).contains(paramRouteInfo);
    Object localObject2;
    String str;
    if (!bool)
    {
      localObject1 = "MediaRouter";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Ignoring attempt to select removed route: ";
      localObject2 = str + paramRouteInfo;
      Log.w((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      bool = MediaRouter.RouteInfo.access$400(paramRouteInfo);
      if (!bool)
      {
        localObject1 = "MediaRouter";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Ignoring attempt to select disabled route: ";
        localObject2 = str + paramRouteInfo;
        Log.w((String)localObject1, (String)localObject2);
      }
      else
      {
        setSelectedRouteInternal(paramRouteInfo, paramInt);
      }
    }
  }
  
  public void sendControlRequest(MediaRouter.RouteInfo paramRouteInfo, Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    Object localObject = this.mSelectedRoute;
    if (paramRouteInfo == localObject)
    {
      localObject = this.mSelectedRouteController;
      if (localObject != null)
      {
        localObject = this.mSelectedRouteController;
        boolean bool = ((MediaRouteProvider.RouteController)localObject).onControlRequest(paramIntent, paramControlRequestCallback);
        if (!bool) {}
      }
    }
    for (;;)
    {
      return;
      if (paramControlRequestCallback != null) {
        paramControlRequestCallback.onError(null, null);
      }
    }
  }
  
  public void setMediaSession(Object paramObject)
  {
    MediaRouter.GlobalMediaRouter.MediaSessionRecord localMediaSessionRecord = this.mMediaSession;
    if (localMediaSessionRecord != null)
    {
      localMediaSessionRecord = this.mMediaSession;
      localMediaSessionRecord.clearVolumeHandling();
    }
    if (paramObject == null)
    {
      localMediaSessionRecord = null;
      this.mMediaSession = null;
    }
    for (;;)
    {
      return;
      localMediaSessionRecord = new android/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;
      localMediaSessionRecord.<init>(this, paramObject);
      this.mMediaSession = localMediaSessionRecord;
      updatePlaybackInfoFromSelectedRoute();
    }
  }
  
  public void setMediaSessionCompat(MediaSessionCompat paramMediaSessionCompat)
  {
    this.mCompatSession = paramMediaSessionCompat;
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j) {
      if (paramMediaSessionCompat != null)
      {
        localObject = paramMediaSessionCompat.c();
        setMediaSession(localObject);
      }
    }
    for (;;)
    {
      return;
      i = 0;
      localObject = null;
      break;
      i = Build.VERSION.SDK_INT;
      j = 14;
      if (i >= j)
      {
        localObject = this.mRccMediaSession;
        if (localObject != null)
        {
          localObject = this.mRccMediaSession.d();
          removeRemoteControlClient(localObject);
          localObject = this.mRccMediaSession;
          MediaSessionCompat.b localb = this.mSessionActiveListener;
          ((MediaSessionCompat)localObject).b(localb);
        }
        this.mRccMediaSession = paramMediaSessionCompat;
        if (paramMediaSessionCompat != null)
        {
          localObject = this.mSessionActiveListener;
          paramMediaSessionCompat.a((MediaSessionCompat.b)localObject);
          boolean bool = paramMediaSessionCompat.a();
          if (bool)
          {
            localObject = paramMediaSessionCompat.d();
            addRemoteControlClient(localObject);
          }
        }
      }
    }
  }
  
  public void start()
  {
    RegisteredMediaRouteProviderWatcher localRegisteredMediaRouteProviderWatcher = new android/support/v7/media/RegisteredMediaRouteProviderWatcher;
    Context localContext = this.mApplicationContext;
    localRegisteredMediaRouteProviderWatcher.<init>(localContext, this);
    this.mRegisteredProviderWatcher = localRegisteredMediaRouteProviderWatcher;
    this.mRegisteredProviderWatcher.start();
  }
  
  public void updateDiscoveryRequest()
  {
    int i = 1;
    MediaRouteSelector.Builder localBuilder = new android/support/v7/media/MediaRouteSelector$Builder;
    localBuilder.<init>();
    Object localObject1 = this.mRouters;
    int j = ((ArrayList)localObject1).size();
    int m = 0;
    int n = 0;
    int i1 = j + -1;
    Object localObject2;
    if (i1 >= 0)
    {
      localObject1 = (MediaRouter)((WeakReference)this.mRouters.get(i1)).get();
      if (localObject1 == null)
      {
        localObject1 = this.mRouters;
        ((ArrayList)localObject1).remove(i1);
      }
      for (;;)
      {
        j = i1;
        break;
        localObject2 = ((MediaRouter)localObject1).mCallbackRecords;
        int i2 = ((ArrayList)localObject2).size();
        int i5;
        for (int i3 = 0; i3 < i2; i3 = i5)
        {
          localObject2 = (MediaRouter.CallbackRecord)((MediaRouter)localObject1).mCallbackRecords.get(i3);
          MediaRouteSelector localMediaRouteSelector = ((MediaRouter.CallbackRecord)localObject2).mSelector;
          localBuilder.addSelector(localMediaRouteSelector);
          int i4 = ((MediaRouter.CallbackRecord)localObject2).mFlags & 0x1;
          if (i4 != 0)
          {
            m = i;
            n = i;
          }
          i4 = ((MediaRouter.CallbackRecord)localObject2).mFlags & 0x4;
          if (i4 != 0)
          {
            boolean bool2 = this.mLowRam;
            if (!bool2) {
              n = i;
            }
          }
          i5 = ((MediaRouter.CallbackRecord)localObject2).mFlags & 0x8;
          if (i5 != 0) {
            n = i;
          }
          i5 = i3 + 1;
        }
      }
    }
    if (n != 0)
    {
      localObject1 = localBuilder.build();
      localObject2 = this.mDiscoveryRequest;
      if (localObject2 == null) {
        break label281;
      }
      localObject2 = this.mDiscoveryRequest.getSelector();
      int i6 = ((MediaRouteSelector)localObject2).equals(localObject1);
      if (i6 == 0) {
        break label281;
      }
      localObject2 = this.mDiscoveryRequest;
      i6 = ((MediaRouteDiscoveryRequest)localObject2).isActiveScan();
      if (i6 != m) {
        break label281;
      }
    }
    label281:
    int i7;
    do
    {
      return;
      localObject1 = MediaRouteSelector.EMPTY;
      break;
      i7 = ((MediaRouteSelector)localObject1).isEmpty();
      if ((i7 == 0) || (m != 0)) {
        break label477;
      }
      localObject1 = this.mDiscoveryRequest;
    } while (localObject1 == null);
    j = 0;
    localObject1 = null;
    for (this.mDiscoveryRequest = null;; this.mDiscoveryRequest = ((MediaRouteDiscoveryRequest)localObject2))
    {
      boolean bool1 = MediaRouter.access$500();
      MediaRouteDiscoveryRequest localMediaRouteDiscoveryRequest;
      if (bool1)
      {
        localObject1 = "MediaRouter";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Updated discovery request: ");
        localMediaRouteDiscoveryRequest = this.mDiscoveryRequest;
        localObject2 = localMediaRouteDiscoveryRequest;
        Log.d((String)localObject1, (String)localObject2);
      }
      if ((n != 0) && (m == 0))
      {
        bool1 = this.mLowRam;
        if (bool1)
        {
          localObject1 = "MediaRouter";
          localObject2 = "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.";
          Log.i((String)localObject1, (String)localObject2);
        }
      }
      localObject1 = this.mProviders;
      m = ((ArrayList)localObject1).size();
      i7 = 0;
      localObject2 = null;
      while (i7 < m)
      {
        localObject1 = MediaRouter.ProviderInfo.access$600((MediaRouter.ProviderInfo)this.mProviders.get(i7));
        localMediaRouteDiscoveryRequest = this.mDiscoveryRequest;
        ((MediaRouteProvider)localObject1).setDiscoveryRequest(localMediaRouteDiscoveryRequest);
        int k = i7 + 1;
        i7 = k;
      }
      break;
      label477:
      localObject2 = new android/support/v7/media/MediaRouteDiscoveryRequest;
      ((MediaRouteDiscoveryRequest)localObject2).<init>((MediaRouteSelector)localObject1, m);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$GlobalMediaRouter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */