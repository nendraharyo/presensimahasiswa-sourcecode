package android.support.v7.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

public class RemotePlaybackClient
{
  private static final boolean DEBUG = Log.isLoggable("RemotePlaybackClient", 3);
  private static final String TAG = "RemotePlaybackClient";
  private final Context mContext;
  private final PendingIntent mItemStatusPendingIntent;
  private final MediaRouter.RouteInfo mRoute;
  private boolean mRouteSupportsQueuing;
  private boolean mRouteSupportsRemotePlayback;
  private boolean mRouteSupportsSessionManagement;
  private String mSessionId;
  private final PendingIntent mSessionStatusPendingIntent;
  private RemotePlaybackClient.StatusCallback mStatusCallback;
  private final RemotePlaybackClient.StatusReceiver mStatusReceiver;
  
  public RemotePlaybackClient(Context paramContext, MediaRouter.RouteInfo paramRouteInfo)
  {
    if (paramContext == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("context must not be null");
      throw ((Throwable)localObject1);
    }
    if (paramRouteInfo == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("route must not be null");
      throw ((Throwable)localObject1);
    }
    this.mContext = paramContext;
    this.mRoute = paramRouteInfo;
    Object localObject1 = new android/content/IntentFilter;
    ((IntentFilter)localObject1).<init>();
    ((IntentFilter)localObject1).addAction("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED");
    ((IntentFilter)localObject1).addAction("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED");
    Object localObject2 = new android/support/v7/media/RemotePlaybackClient$StatusReceiver;
    ((RemotePlaybackClient.StatusReceiver)localObject2).<init>(this, null);
    this.mStatusReceiver = ((RemotePlaybackClient.StatusReceiver)localObject2);
    localObject2 = this.mStatusReceiver;
    paramContext.registerReceiver((BroadcastReceiver)localObject2, (IntentFilter)localObject1);
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED");
    localObject2 = paramContext.getPackageName();
    ((Intent)localObject1).setPackage((String)localObject2);
    localObject1 = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject1, 0);
    this.mItemStatusPendingIntent = ((PendingIntent)localObject1);
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED");
    localObject2 = paramContext.getPackageName();
    ((Intent)localObject1).setPackage((String)localObject2);
    localObject1 = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject1, 0);
    this.mSessionStatusPendingIntent = ((PendingIntent)localObject1);
    detectFeatures();
  }
  
  private void adoptSession(String paramString)
  {
    if (paramString != null) {
      setSessionId(paramString);
    }
  }
  
  private static String bundleToString(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.size();
    }
    for (String str = paramBundle.toString();; str = "null") {
      return str;
    }
  }
  
  private void detectFeatures()
  {
    boolean bool1 = true;
    String str = "android.media.intent.action.PLAY";
    boolean bool2 = routeSupportsAction(str);
    if (bool2)
    {
      str = "android.media.intent.action.SEEK";
      bool2 = routeSupportsAction(str);
      if (bool2)
      {
        str = "android.media.intent.action.GET_STATUS";
        bool2 = routeSupportsAction(str);
        if (bool2)
        {
          str = "android.media.intent.action.PAUSE";
          bool2 = routeSupportsAction(str);
          if (bool2)
          {
            str = "android.media.intent.action.RESUME";
            bool2 = routeSupportsAction(str);
            if (bool2)
            {
              str = "android.media.intent.action.STOP";
              bool2 = routeSupportsAction(str);
              if (bool2)
              {
                bool2 = bool1;
                this.mRouteSupportsRemotePlayback = bool2;
                bool2 = this.mRouteSupportsRemotePlayback;
                if (!bool2) {
                  break label190;
                }
                str = "android.media.intent.action.ENQUEUE";
                bool2 = routeSupportsAction(str);
                if (!bool2) {
                  break label190;
                }
                str = "android.media.intent.action.REMOVE";
                bool2 = routeSupportsAction(str);
                if (!bool2) {
                  break label190;
                }
                bool2 = bool1;
                label124:
                this.mRouteSupportsQueuing = bool2;
                bool2 = this.mRouteSupportsRemotePlayback;
                if (!bool2) {
                  break label197;
                }
                str = "android.media.intent.action.START_SESSION";
                bool2 = routeSupportsAction(str);
                if (!bool2) {
                  break label197;
                }
                str = "android.media.intent.action.GET_SESSION_STATUS";
                bool2 = routeSupportsAction(str);
                if (!bool2) {
                  break label197;
                }
                str = "android.media.intent.action.END_SESSION";
                bool2 = routeSupportsAction(str);
                if (!bool2) {
                  break label197;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      this.mRouteSupportsSessionManagement = bool1;
      return;
      bool2 = false;
      str = null;
      break;
      label190:
      bool2 = false;
      str = null;
      break label124;
      label197:
      bool1 = false;
    }
  }
  
  private void handleError(Intent paramIntent, RemotePlaybackClient.ActionCallback paramActionCallback, String paramString, Bundle paramBundle)
  {
    int i = 0;
    String str1;
    if (paramBundle != null)
    {
      str1 = "android.media.intent.extra.ERROR_CODE";
      i = paramBundle.getInt(str1, 0);
    }
    boolean bool = DEBUG;
    if (bool)
    {
      str1 = "RemotePlaybackClient";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Received error from ");
      String str2 = paramIntent.getAction();
      localObject = ((StringBuilder)localObject).append(str2).append(": error=").append(paramString).append(", code=").append(i).append(", data=");
      str2 = bundleToString(paramBundle);
      localObject = str2;
      Log.w(str1, (String)localObject);
    }
    paramActionCallback.onError(paramString, i, paramBundle);
  }
  
  private void handleInvalidResult(Intent paramIntent, RemotePlaybackClient.ActionCallback paramActionCallback, Bundle paramBundle)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Received invalid result data from ");
    String str = paramIntent.getAction();
    localObject = ((StringBuilder)localObject).append(str).append(": data=");
    str = bundleToString(paramBundle);
    localObject = str;
    Log.w("RemotePlaybackClient", (String)localObject);
    paramActionCallback.onError(null, 0, paramBundle);
  }
  
  private static String inferMissingResult(String paramString1, String paramString2)
  {
    if (paramString2 == null) {}
    for (;;)
    {
      return paramString1;
      if (paramString1 != null)
      {
        boolean bool = paramString1.equals(paramString2);
        if (!bool) {}
      }
      else
      {
        paramString1 = paramString2;
        continue;
      }
      paramString1 = null;
    }
  }
  
  private static void logRequest(Intent paramIntent)
  {
    boolean bool = DEBUG;
    if (bool)
    {
      String str1 = "RemotePlaybackClient";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "Sending request: ";
      localObject = str2 + paramIntent;
      Log.d(str1, (String)localObject);
    }
  }
  
  private void performItemAction(Intent paramIntent, String paramString1, String paramString2, Bundle paramBundle, RemotePlaybackClient.ItemActionCallback paramItemActionCallback)
  {
    Object localObject = "android.media.intent.category.REMOTE_PLAYBACK";
    paramIntent.addCategory((String)localObject);
    if (paramString1 != null)
    {
      localObject = "android.media.intent.extra.SESSION_ID";
      paramIntent.putExtra((String)localObject, paramString1);
    }
    if (paramString2 != null)
    {
      localObject = "android.media.intent.extra.ITEM_ID";
      paramIntent.putExtra((String)localObject, paramString2);
    }
    if (paramBundle != null) {
      paramIntent.putExtras(paramBundle);
    }
    logRequest(paramIntent);
    MediaRouter.RouteInfo localRouteInfo = this.mRoute;
    localObject = new android/support/v7/media/RemotePlaybackClient$1;
    ((RemotePlaybackClient.1)localObject).<init>(this, paramString1, paramString2, paramIntent, paramItemActionCallback);
    localRouteInfo.sendControlRequest(paramIntent, (MediaRouter.ControlRequestCallback)localObject);
  }
  
  private void performSessionAction(Intent paramIntent, String paramString, Bundle paramBundle, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback)
  {
    Object localObject = "android.media.intent.category.REMOTE_PLAYBACK";
    paramIntent.addCategory((String)localObject);
    if (paramString != null)
    {
      localObject = "android.media.intent.extra.SESSION_ID";
      paramIntent.putExtra((String)localObject, paramString);
    }
    if (paramBundle != null) {
      paramIntent.putExtras(paramBundle);
    }
    logRequest(paramIntent);
    localObject = this.mRoute;
    RemotePlaybackClient.2 local2 = new android/support/v7/media/RemotePlaybackClient$2;
    local2.<init>(this, paramString, paramIntent, paramSessionActionCallback);
    ((MediaRouter.RouteInfo)localObject).sendControlRequest(paramIntent, local2);
  }
  
  private void playOrEnqueue(Uri paramUri, String paramString1, Bundle paramBundle1, long paramLong, Bundle paramBundle2, RemotePlaybackClient.ItemActionCallback paramItemActionCallback, String paramString2)
  {
    if (paramUri == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("contentUri must not be null");
      throw ((Throwable)localObject1);
    }
    throwIfRemotePlaybackNotSupported();
    Object localObject1 = "android.media.intent.action.ENQUEUE";
    boolean bool = paramString2.equals(localObject1);
    if (bool) {
      throwIfQueuingNotSupported();
    }
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramString2);
    localIntent.setDataAndType(paramUri, paramString1);
    localObject1 = "android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER";
    Object localObject2 = this.mItemStatusPendingIntent;
    localIntent.putExtra((String)localObject1, (Parcelable)localObject2);
    if (paramBundle1 != null)
    {
      localObject1 = "android.media.intent.extra.ITEM_METADATA";
      localIntent.putExtra((String)localObject1, paramBundle1);
    }
    long l = 0L;
    bool = paramLong < l;
    if (bool)
    {
      localObject1 = "android.media.intent.extra.ITEM_POSITION";
      localIntent.putExtra((String)localObject1, paramLong);
    }
    localObject2 = this.mSessionId;
    localObject1 = this;
    performItemAction(localIntent, (String)localObject2, null, paramBundle2, paramItemActionCallback);
  }
  
  private boolean routeSupportsAction(String paramString)
  {
    return this.mRoute.supportsControlAction("android.media.intent.category.REMOTE_PLAYBACK", paramString);
  }
  
  private void throwIfNoCurrentSession()
  {
    Object localObject = this.mSessionId;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("There is no current session.");
      throw ((Throwable)localObject);
    }
  }
  
  private void throwIfQueuingNotSupported()
  {
    boolean bool = this.mRouteSupportsQueuing;
    if (!bool)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("The route does not support queuing.");
      throw localUnsupportedOperationException;
    }
  }
  
  private void throwIfRemotePlaybackNotSupported()
  {
    boolean bool = this.mRouteSupportsRemotePlayback;
    if (!bool)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("The route does not support remote playback.");
      throw localUnsupportedOperationException;
    }
  }
  
  private void throwIfSessionManagementNotSupported()
  {
    boolean bool = this.mRouteSupportsSessionManagement;
    if (!bool)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("The route does not support session management.");
      throw localUnsupportedOperationException;
    }
  }
  
  public void endSession(Bundle paramBundle, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback)
  {
    throwIfSessionManagementNotSupported();
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.END_SESSION");
    String str = this.mSessionId;
    performSessionAction(localIntent, str, paramBundle, paramSessionActionCallback);
  }
  
  public void enqueue(Uri paramUri, String paramString, Bundle paramBundle1, long paramLong, Bundle paramBundle2, RemotePlaybackClient.ItemActionCallback paramItemActionCallback)
  {
    playOrEnqueue(paramUri, paramString, paramBundle1, paramLong, paramBundle2, paramItemActionCallback, "android.media.intent.action.ENQUEUE");
  }
  
  public String getSessionId()
  {
    return this.mSessionId;
  }
  
  public void getSessionStatus(Bundle paramBundle, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback)
  {
    throwIfSessionManagementNotSupported();
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.GET_SESSION_STATUS");
    String str = this.mSessionId;
    performSessionAction(localIntent, str, paramBundle, paramSessionActionCallback);
  }
  
  public void getStatus(String paramString, Bundle paramBundle, RemotePlaybackClient.ItemActionCallback paramItemActionCallback)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("itemId must not be null");
      throw ((Throwable)localObject);
    }
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.GET_STATUS");
    String str = this.mSessionId;
    Object localObject = this;
    performItemAction(localIntent, str, paramString, paramBundle, paramItemActionCallback);
  }
  
  public boolean hasSession()
  {
    String str = this.mSessionId;
    boolean bool;
    if (str != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public boolean isQueuingSupported()
  {
    return this.mRouteSupportsQueuing;
  }
  
  public boolean isRemotePlaybackSupported()
  {
    return this.mRouteSupportsRemotePlayback;
  }
  
  public boolean isSessionManagementSupported()
  {
    return this.mRouteSupportsSessionManagement;
  }
  
  public void pause(Bundle paramBundle, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback)
  {
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.PAUSE");
    String str = this.mSessionId;
    performSessionAction(localIntent, str, paramBundle, paramSessionActionCallback);
  }
  
  public void play(Uri paramUri, String paramString, Bundle paramBundle1, long paramLong, Bundle paramBundle2, RemotePlaybackClient.ItemActionCallback paramItemActionCallback)
  {
    playOrEnqueue(paramUri, paramString, paramBundle1, paramLong, paramBundle2, paramItemActionCallback, "android.media.intent.action.PLAY");
  }
  
  public void release()
  {
    Context localContext = this.mContext;
    RemotePlaybackClient.StatusReceiver localStatusReceiver = this.mStatusReceiver;
    localContext.unregisterReceiver(localStatusReceiver);
  }
  
  public void remove(String paramString, Bundle paramBundle, RemotePlaybackClient.ItemActionCallback paramItemActionCallback)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("itemId must not be null");
      throw ((Throwable)localObject);
    }
    throwIfQueuingNotSupported();
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.REMOVE");
    String str = this.mSessionId;
    Object localObject = this;
    performItemAction(localIntent, str, paramString, paramBundle, paramItemActionCallback);
  }
  
  public void resume(Bundle paramBundle, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback)
  {
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.RESUME");
    String str = this.mSessionId;
    performSessionAction(localIntent, str, paramBundle, paramSessionActionCallback);
  }
  
  public void seek(String paramString, long paramLong, Bundle paramBundle, RemotePlaybackClient.ItemActionCallback paramItemActionCallback)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("itemId must not be null");
      throw ((Throwable)localObject);
    }
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.SEEK");
    localIntent.putExtra("android.media.intent.extra.ITEM_POSITION", paramLong);
    String str = this.mSessionId;
    Object localObject = this;
    performItemAction(localIntent, str, paramString, paramBundle, paramItemActionCallback);
  }
  
  public void setSessionId(String paramString)
  {
    Object localObject1 = this.mSessionId;
    if (localObject1 != paramString)
    {
      localObject1 = this.mSessionId;
      boolean bool;
      if (localObject1 != null)
      {
        localObject1 = this.mSessionId;
        bool = ((String)localObject1).equals(paramString);
        if (bool) {}
      }
      else
      {
        bool = DEBUG;
        if (bool)
        {
          localObject1 = "RemotePlaybackClient";
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "Session id is now: ";
          localObject2 = str + paramString;
          Log.d((String)localObject1, (String)localObject2);
        }
        this.mSessionId = paramString;
        localObject1 = this.mStatusCallback;
        if (localObject1 != null)
        {
          localObject1 = this.mStatusCallback;
          ((RemotePlaybackClient.StatusCallback)localObject1).onSessionChanged(paramString);
        }
      }
    }
  }
  
  public void setStatusCallback(RemotePlaybackClient.StatusCallback paramStatusCallback)
  {
    this.mStatusCallback = paramStatusCallback;
  }
  
  public void startSession(Bundle paramBundle, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback)
  {
    throwIfSessionManagementNotSupported();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.START_SESSION");
    PendingIntent localPendingIntent = this.mSessionStatusPendingIntent;
    localIntent.putExtra("android.media.intent.extra.SESSION_STATUS_UPDATE_RECEIVER", localPendingIntent);
    performSessionAction(localIntent, null, paramBundle, paramSessionActionCallback);
  }
  
  public void stop(Bundle paramBundle, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback)
  {
    throwIfNoCurrentSession();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.media.intent.action.STOP");
    String str = this.mSessionId;
    performSessionAction(localIntent, str, paramBundle, paramSessionActionCallback);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RemotePlaybackClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */