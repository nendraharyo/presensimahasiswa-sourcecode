package android.support.v7.media;

import android.content.Context;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class MediaRouter
{
  public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
  public static final int AVAILABILITY_FLAG_REQUIRE_MATCH = 2;
  public static final int CALLBACK_FLAG_FORCE_DISCOVERY = 8;
  public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
  public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
  public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
  private static final boolean DEBUG = Log.isLoggable("MediaRouter", 3);
  private static final String TAG = "MediaRouter";
  public static final int UNSELECT_REASON_DISCONNECTED = 1;
  public static final int UNSELECT_REASON_ROUTE_CHANGED = 3;
  public static final int UNSELECT_REASON_STOPPED = 2;
  public static final int UNSELECT_REASON_UNKNOWN;
  static MediaRouter.GlobalMediaRouter sGlobal;
  final ArrayList mCallbackRecords;
  final Context mContext;
  
  MediaRouter(Context paramContext)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mCallbackRecords = localArrayList;
    this.mContext = paramContext;
  }
  
  static void checkCallingThread()
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject != localLooper)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The media router service must only be accessed on the application's main thread.");
      throw ((Throwable)localObject);
    }
  }
  
  static boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if ((paramObject1 == null) || (paramObject2 == null)) {
        break label27;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label27;
      }
    }
    label27:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private int findCallbackRecord(MediaRouter.Callback paramCallback)
  {
    Object localObject = this.mCallbackRecords;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = ((MediaRouter.CallbackRecord)this.mCallbackRecords.get(j)).mCallback;
      if (localObject != paramCallback) {}
    }
    for (int k = j;; k = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  public static MediaRouter getInstance(Context paramContext)
  {
    if (paramContext == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("context must not be null");
      throw ((Throwable)localObject);
    }
    checkCallingThread();
    Object localObject = sGlobal;
    if (localObject == null)
    {
      localObject = new android/support/v7/media/MediaRouter$GlobalMediaRouter;
      Context localContext = paramContext.getApplicationContext();
      ((MediaRouter.GlobalMediaRouter)localObject).<init>(localContext);
      sGlobal = (MediaRouter.GlobalMediaRouter)localObject;
      localObject = sGlobal;
      ((MediaRouter.GlobalMediaRouter)localObject).start();
    }
    return sGlobal.getRouter(paramContext);
  }
  
  public void addCallback(MediaRouteSelector paramMediaRouteSelector, MediaRouter.Callback paramCallback)
  {
    addCallback(paramMediaRouteSelector, paramCallback, 0);
  }
  
  public void addCallback(MediaRouteSelector paramMediaRouteSelector, MediaRouter.Callback paramCallback, int paramInt)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1;
    if (paramMediaRouteSelector == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("selector must not be null");
      throw ((Throwable)localObject1);
    }
    if (paramCallback == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("callback must not be null");
      throw ((Throwable)localObject1);
    }
    checkCallingThread();
    boolean bool1 = DEBUG;
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      localObject1 = "MediaRouter";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("addCallback: selector=").append(paramMediaRouteSelector).append(", callback=").append(paramCallback).append(", flags=");
      localObject3 = Integer.toHexString(paramInt);
      localObject2 = (String)localObject3;
      Log.d((String)localObject1, (String)localObject2);
    }
    int j = findCallbackRecord(paramCallback);
    int k;
    float f2;
    if (j < 0)
    {
      localObject1 = new android/support/v7/media/MediaRouter$CallbackRecord;
      ((MediaRouter.CallbackRecord)localObject1).<init>(this, paramCallback);
      localObject2 = this.mCallbackRecords;
      ((ArrayList)localObject2).add(localObject1);
      k = 0;
      f2 = 0.0F;
      localObject2 = null;
      int m = (((MediaRouter.CallbackRecord)localObject1).mFlags ^ 0xFFFFFFFF) & paramInt;
      if (m != 0)
      {
        k = ((MediaRouter.CallbackRecord)localObject1).mFlags | paramInt;
        ((MediaRouter.CallbackRecord)localObject1).mFlags = k;
        k = i;
        f2 = f1;
      }
      localObject3 = ((MediaRouter.CallbackRecord)localObject1).mSelector;
      boolean bool2 = ((MediaRouteSelector)localObject3).contains(paramMediaRouteSelector);
      if (bool2) {
        break label306;
      }
      localObject2 = new android/support/v7/media/MediaRouteSelector$Builder;
      localObject3 = ((MediaRouter.CallbackRecord)localObject1).mSelector;
      ((MediaRouteSelector.Builder)localObject2).<init>((MediaRouteSelector)localObject3);
      localObject2 = ((MediaRouteSelector.Builder)localObject2).addSelector(paramMediaRouteSelector).build();
      ((MediaRouter.CallbackRecord)localObject1).mSelector = ((MediaRouteSelector)localObject2);
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject1 = sGlobal;
        ((MediaRouter.GlobalMediaRouter)localObject1).updateDiscoveryRequest();
      }
      return;
      localObject2 = this.mCallbackRecords;
      localObject1 = (MediaRouter.CallbackRecord)((ArrayList)localObject2).get(j);
      break;
      label306:
      i = k;
      f1 = f2;
    }
  }
  
  public void addProvider(MediaRouteProvider paramMediaRouteProvider)
  {
    Object localObject1;
    if (paramMediaRouteProvider == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("providerInstance must not be null");
      throw ((Throwable)localObject1);
    }
    checkCallingThread();
    boolean bool = DEBUG;
    if (bool)
    {
      localObject1 = "MediaRouter";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "addProvider: ";
      localObject2 = str + paramMediaRouteProvider;
      Log.d((String)localObject1, (String)localObject2);
    }
    sGlobal.addProvider(paramMediaRouteProvider);
  }
  
  public void addRemoteControlClient(Object paramObject)
  {
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("remoteControlClient must not be null");
      throw ((Throwable)localObject1);
    }
    checkCallingThread();
    boolean bool = DEBUG;
    if (bool)
    {
      localObject1 = "MediaRouter";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "addRemoteControlClient: ";
      localObject2 = str + paramObject;
      Log.d((String)localObject1, (String)localObject2);
    }
    sGlobal.addRemoteControlClient(paramObject);
  }
  
  public MediaRouter.RouteInfo getDefaultRoute()
  {
    checkCallingThread();
    return sGlobal.getDefaultRoute();
  }
  
  public MediaSessionCompat.Token getMediaSessionToken()
  {
    return sGlobal.getMediaSessionToken();
  }
  
  public List getProviders()
  {
    checkCallingThread();
    return sGlobal.getProviders();
  }
  
  public List getRoutes()
  {
    checkCallingThread();
    return sGlobal.getRoutes();
  }
  
  public MediaRouter.RouteInfo getSelectedRoute()
  {
    checkCallingThread();
    return sGlobal.getSelectedRoute();
  }
  
  public boolean isRouteAvailable(MediaRouteSelector paramMediaRouteSelector, int paramInt)
  {
    if (paramMediaRouteSelector == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("selector must not be null");
      throw localIllegalArgumentException;
    }
    checkCallingThread();
    return sGlobal.isRouteAvailable(paramMediaRouteSelector, paramInt);
  }
  
  public void removeCallback(MediaRouter.Callback paramCallback)
  {
    Object localObject1;
    if (paramCallback == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("callback must not be null");
      throw ((Throwable)localObject1);
    }
    checkCallingThread();
    boolean bool = DEBUG;
    Object localObject2;
    if (bool)
    {
      localObject1 = "MediaRouter";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "removeCallback: callback=";
      localObject2 = str + paramCallback;
      Log.d((String)localObject1, (String)localObject2);
    }
    int i = findCallbackRecord(paramCallback);
    if (i >= 0)
    {
      localObject2 = this.mCallbackRecords;
      ((ArrayList)localObject2).remove(i);
      localObject1 = sGlobal;
      ((MediaRouter.GlobalMediaRouter)localObject1).updateDiscoveryRequest();
    }
  }
  
  public void removeProvider(MediaRouteProvider paramMediaRouteProvider)
  {
    Object localObject1;
    if (paramMediaRouteProvider == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("providerInstance must not be null");
      throw ((Throwable)localObject1);
    }
    checkCallingThread();
    boolean bool = DEBUG;
    if (bool)
    {
      localObject1 = "MediaRouter";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "removeProvider: ";
      localObject2 = str + paramMediaRouteProvider;
      Log.d((String)localObject1, (String)localObject2);
    }
    sGlobal.removeProvider(paramMediaRouteProvider);
  }
  
  public void removeRemoteControlClient(Object paramObject)
  {
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("remoteControlClient must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = DEBUG;
    if (bool)
    {
      localObject1 = "MediaRouter";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "removeRemoteControlClient: ";
      localObject2 = str + paramObject;
      Log.d((String)localObject1, (String)localObject2);
    }
    sGlobal.removeRemoteControlClient(paramObject);
  }
  
  public void selectRoute(MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject1;
    if (paramRouteInfo == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("route must not be null");
      throw ((Throwable)localObject1);
    }
    checkCallingThread();
    boolean bool = DEBUG;
    if (bool)
    {
      localObject1 = "MediaRouter";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "selectRoute: ";
      localObject2 = str + paramRouteInfo;
      Log.d((String)localObject1, (String)localObject2);
    }
    sGlobal.selectRoute(paramRouteInfo);
  }
  
  public void setMediaSession(Object paramObject)
  {
    boolean bool = DEBUG;
    if (bool)
    {
      String str1 = "MediaRouter";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "addMediaSession: ";
      localObject = str2 + paramObject;
      Log.d(str1, (String)localObject);
    }
    sGlobal.setMediaSession(paramObject);
  }
  
  public void setMediaSessionCompat(MediaSessionCompat paramMediaSessionCompat)
  {
    boolean bool = DEBUG;
    if (bool)
    {
      String str1 = "MediaRouter";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "addMediaSessionCompat: ";
      localObject = str2 + paramMediaSessionCompat;
      Log.d(str1, (String)localObject);
    }
    sGlobal.setMediaSessionCompat(paramMediaSessionCompat);
  }
  
  public void unselect(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 3;
      if (paramInt <= i) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Unsupported reason to unselect route");
      throw ((Throwable)localObject);
    }
    checkCallingThread();
    Object localObject = sGlobal;
    MediaRouter.RouteInfo localRouteInfo = getDefaultRoute();
    ((MediaRouter.GlobalMediaRouter)localObject).selectRoute(localRouteInfo, paramInt);
  }
  
  public MediaRouter.RouteInfo updateSelectedRoute(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("selector must not be null");
      throw ((Throwable)localObject1);
    }
    checkCallingThread();
    boolean bool1 = DEBUG;
    Object localObject2;
    if (bool1)
    {
      localObject1 = "MediaRouter";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "updateSelectedRoute: ";
      localObject2 = str + paramMediaRouteSelector;
      Log.d((String)localObject1, (String)localObject2);
    }
    Object localObject1 = sGlobal.getSelectedRoute();
    boolean bool2 = ((MediaRouter.RouteInfo)localObject1).isDefault();
    if (!bool2)
    {
      bool2 = ((MediaRouter.RouteInfo)localObject1).matchesSelector(paramMediaRouteSelector);
      if (!bool2)
      {
        localObject1 = sGlobal.getDefaultRoute();
        localObject2 = sGlobal;
        ((MediaRouter.GlobalMediaRouter)localObject2).selectRoute((MediaRouter.RouteInfo)localObject1);
      }
    }
    return (MediaRouter.RouteInfo)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */