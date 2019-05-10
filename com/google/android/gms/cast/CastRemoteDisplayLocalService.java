package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.w.c;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouteSelector.Builder;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.id;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CastRemoteDisplayLocalService
  extends Service
{
  private static final zzl zzaaf;
  private static final int zzaag;
  private static final Object zzaah;
  private static AtomicBoolean zzaai;
  private static CastRemoteDisplayLocalService zzaax;
  private Handler mHandler;
  private Notification mNotification;
  private String zzZC;
  private GoogleApiClient zzaaj;
  private CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzaak;
  private CastRemoteDisplayLocalService.Callbacks zzaal;
  private CastRemoteDisplayLocalService.zzb zzaam;
  private CastRemoteDisplayLocalService.NotificationSettings zzaan;
  private boolean zzaao;
  private PendingIntent zzaap;
  private CastDevice zzaaq;
  private Display zzaar;
  private Context zzaas;
  private ServiceConnection zzaat;
  private MediaRouter zzaau;
  private boolean zzaav = false;
  private final MediaRouter.Callback zzaaw;
  private final IBinder zzaay;
  
  static
  {
    Object localObject = new com/google/android/gms/cast/internal/zzl;
    ((zzl)localObject).<init>("CastRemoteDisplayLocalService");
    zzaaf = (zzl)localObject;
    zzaag = R.id.cast_notification_id;
    localObject = new java/lang/Object;
    localObject.<init>();
    zzaah = localObject;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    zzaai = (AtomicBoolean)localObject;
  }
  
  public CastRemoteDisplayLocalService()
  {
    Object localObject = new com/google/android/gms/cast/CastRemoteDisplayLocalService$1;
    ((CastRemoteDisplayLocalService.1)localObject).<init>(this);
    this.zzaaw = ((MediaRouter.Callback)localObject);
    localObject = new com/google/android/gms/cast/CastRemoteDisplayLocalService$zza;
    ((CastRemoteDisplayLocalService.zza)localObject).<init>(this, null);
    this.zzaay = ((IBinder)localObject);
  }
  
  public static CastRemoteDisplayLocalService getInstance()
  {
    synchronized (zzaah)
    {
      CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = zzaax;
      return localCastRemoteDisplayLocalService;
    }
  }
  
  protected static void setDebugEnabled()
  {
    zzaaf.zzY(true);
  }
  
  public static void startService(Context paramContext, Class paramClass, String paramString, CastDevice paramCastDevice, CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings, CastRemoteDisplayLocalService.Callbacks paramCallbacks)
  {
    boolean bool1 = true;
    Object localObject1 = zzaaf;
    Object localObject4 = new Object[0];
    ((zzl)localObject1).zzb("Starting Service", (Object[])localObject4);
    Object localObject6;
    synchronized (zzaah)
    {
      localObject1 = zzaax;
      if (localObject1 != null)
      {
        localObject1 = zzaaf;
        localObject4 = "An existing service had not been stopped before starting one";
        localObject6 = null;
        localObject6 = new Object[0];
        ((zzl)localObject1).zzf((String)localObject4, (Object[])localObject6);
        bool2 = true;
        zzS(bool2);
      }
      zzb(paramContext, paramClass);
      zzx.zzb(paramContext, "activityContext is required.");
      zzx.zzb(paramClass, "serviceClass is required.");
      zzx.zzb(paramString, "applicationId is required.");
      zzx.zzb(paramCastDevice, "device is required.");
      zzx.zzb(paramNotificationSettings, "notificationSettings is required.");
      zzx.zzb(paramCallbacks, "callbacks is required.");
      localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings);
      if (localObject1 == null)
      {
        localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zze(paramNotificationSettings);
        if (localObject1 == null)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
          throw ((Throwable)localObject1);
        }
      }
    }
    Object localObject3 = zzaai;
    boolean bool2 = ((AtomicBoolean)localObject3).getAndSet(bool1);
    if (bool2)
    {
      localObject3 = zzaaf;
      ??? = "Service is already being started, startService has been called twice";
      localObject4 = new Object[0];
      ((zzl)localObject3).zzc((String)???, (Object[])localObject4);
    }
    for (;;)
    {
      return;
      Intent localIntent = new android/content/Intent;
      localIntent.<init>(paramContext, paramClass);
      paramContext.startService(localIntent);
      localObject3 = new com/google/android/gms/cast/CastRemoteDisplayLocalService$4;
      ??? = paramString;
      localObject4 = paramCastDevice;
      localObject6 = paramNotificationSettings;
      ((CastRemoteDisplayLocalService.4)localObject3).<init>(paramString, paramCastDevice, paramNotificationSettings, paramContext, paramCallbacks);
      int i = 64;
      paramContext.bindService(localIntent, (ServiceConnection)localObject3, i);
    }
  }
  
  public static void stopService()
  {
    zzS(false);
  }
  
  private void zzQ(boolean paramBoolean)
  {
    Object localObject1 = this.mHandler;
    if (localObject1 != null)
    {
      localObject1 = Looper.myLooper();
      Object localObject2 = Looper.getMainLooper();
      if (localObject1 == localObject2) {
        break label44;
      }
      localObject1 = this.mHandler;
      localObject2 = new com/google/android/gms/cast/CastRemoteDisplayLocalService$5;
      ((CastRemoteDisplayLocalService.5)localObject2).<init>(this, paramBoolean);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      label44:
      zzR(paramBoolean);
    }
  }
  
  private void zzR(boolean paramBoolean)
  {
    zzbe("Stopping Service");
    Object localObject1 = "stopServiceInstanceInternal must be called on the main thread";
    zzx.zzcD((String)localObject1);
    Object localObject2;
    if (!paramBoolean)
    {
      localObject1 = this.zzaau;
      if (localObject1 != null)
      {
        zzbe("Setting default route");
        localObject1 = this.zzaau;
        localObject2 = this.zzaau.getDefaultRoute();
        ((MediaRouter)localObject1).selectRoute((MediaRouter.RouteInfo)localObject2);
      }
    }
    localObject1 = this.zzaam;
    if (localObject1 != null)
    {
      zzbe("Unregistering notification receiver");
      localObject1 = this.zzaam;
      unregisterReceiver((BroadcastReceiver)localObject1);
    }
    zznF();
    zznG();
    zznB();
    localObject1 = this.zzaaj;
    if (localObject1 != null)
    {
      localObject1 = this.zzaaj;
      ((GoogleApiClient)localObject1).disconnect();
      this.zzaaj = null;
    }
    localObject1 = this.zzaas;
    if (localObject1 != null)
    {
      localObject1 = this.zzaat;
      if (localObject1 == null) {}
    }
    try
    {
      localObject1 = this.zzaas;
      localObject2 = this.zzaat;
      ((Context)localObject1).unbindService((ServiceConnection)localObject2);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        String str = "No need to unbind service, already unbound";
        zzbe(str);
      }
    }
    this.zzaat = null;
    this.zzaas = null;
    this.zzZC = null;
    this.zzaaj = null;
    this.mNotification = null;
    this.zzaar = null;
  }
  
  private static void zzS(boolean paramBoolean)
  {
    Object[] arrayOfObject = null;
    Object localObject1 = zzaaf;
    Object localObject3 = new Object[0];
    ((zzl)localObject1).zzb("Stopping Service", (Object[])localObject3);
    localObject1 = zzaai;
    ((AtomicBoolean)localObject1).set(false);
    synchronized (zzaah)
    {
      localObject1 = zzaax;
      if (localObject1 == null)
      {
        localObject1 = zzaaf;
        localObject3 = "Service is already being stopped";
        arrayOfObject = null;
        arrayOfObject = new Object[0];
        ((zzl)localObject1).zzc((String)localObject3, arrayOfObject);
        return;
      }
      localObject1 = zzaax;
      localObject3 = null;
      zzaax = null;
      ((CastRemoteDisplayLocalService)localObject1).zzQ(paramBoolean);
    }
  }
  
  private Notification zzT(boolean paramBoolean)
  {
    boolean bool1 = true;
    zzbe("createDefaultNotification");
    int i = getApplicationInfo().labelRes;
    Object localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zzc(this.zzaan);
    Object localObject2 = this.zzaan;
    Object localObject3 = CastRemoteDisplayLocalService.NotificationSettings.zzd((CastRemoteDisplayLocalService.NotificationSettings)localObject2);
    int j;
    int k;
    if (paramBoolean)
    {
      j = R.string.cast_notification_connected_message;
      k = R.drawable.cast_ic_notification_on;
      boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool3) {
        localObject1 = getString(i);
      }
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject3);
      if (!bool2) {
        break label215;
      }
      localObject3 = new Object[bool1];
      bool2 = false;
      String str = this.zzaaq.getFriendlyName();
      localObject3[0] = str;
    }
    label215:
    for (Object localObject4 = getString(j, (Object[])localObject3);; localObject4 = localObject3)
    {
      localObject3 = new android/support/v4/app/w$c;
      ((w.c)localObject3).<init>(this);
      localObject4 = ((w.c)localObject3).a((CharSequence)localObject1).b((CharSequence)localObject4);
      localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zze(this.zzaan);
      localObject2 = ((w.c)localObject4).a((PendingIntent)localObject1).a(k).a(bool1);
      int m = R.string.cast_notification_disconnect;
      localObject1 = getString(m);
      localObject3 = zznH();
      return ((w.c)localObject2).a(17301560, (CharSequence)localObject1, (PendingIntent)localObject3).a();
      j = R.string.cast_notification_connecting_message;
      k = R.drawable.cast_ic_notification_connecting;
      break;
    }
  }
  
  private GoogleApiClient zza(CastDevice paramCastDevice)
  {
    Object localObject1 = new com/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplayOptions$Builder;
    Object localObject2 = this.zzaak;
    ((CastRemoteDisplay.CastRemoteDisplayOptions.Builder)localObject1).<init>(paramCastDevice, (CastRemoteDisplay.CastRemoteDisplaySessionCallbacks)localObject2);
    localObject2 = new com/google/android/gms/cast/CastRemoteDisplayLocalService$10;
    ((CastRemoteDisplayLocalService.10)localObject2).<init>(this);
    CastRemoteDisplayLocalService.2 local2 = new com/google/android/gms/cast/CastRemoteDisplayLocalService$2;
    local2.<init>(this);
    GoogleApiClient.Builder localBuilder = new com/google/android/gms/common/api/GoogleApiClient$Builder;
    localBuilder.<init>(this, (GoogleApiClient.ConnectionCallbacks)localObject2, local2);
    localObject2 = CastRemoteDisplay.API;
    localObject1 = ((CastRemoteDisplay.CastRemoteDisplayOptions.Builder)localObject1).build();
    return localBuilder.addApi((Api)localObject2, (Api.ApiOptions.HasOptions)localObject1).build();
  }
  
  private void zza(Display paramDisplay)
  {
    this.zzaar = paramDisplay;
    boolean bool = this.zzaao;
    int i;
    if (bool)
    {
      localObject = zzT(true);
      this.mNotification = ((Notification)localObject);
      i = zzaag;
      Notification localNotification = this.mNotification;
      startForeground(i, localNotification);
    }
    Object localObject = this.zzaal;
    if (localObject != null)
    {
      this.zzaal.onRemoteDisplaySessionStarted(this);
      i = 0;
      localObject = null;
      this.zzaal = null;
    }
    localObject = this.zzaar;
    onCreatePresentation((Display)localObject);
  }
  
  private void zza(CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings)
  {
    zzx.zzcD("updateNotificationSettingsInternal must be called on the main thread");
    Object localObject1 = this.zzaan;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("No current notification settings to update");
      throw ((Throwable)localObject1);
    }
    boolean bool = this.zzaao;
    Object localObject2;
    if (bool)
    {
      localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings);
      if (localObject1 != null)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Current mode is default notification, notification attribute must not be provided");
        throw ((Throwable)localObject1);
      }
      localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zze(paramNotificationSettings);
      if (localObject1 != null)
      {
        localObject1 = this.zzaan;
        localObject2 = CastRemoteDisplayLocalService.NotificationSettings.zze(paramNotificationSettings);
        CastRemoteDisplayLocalService.NotificationSettings.zza((CastRemoteDisplayLocalService.NotificationSettings)localObject1, (PendingIntent)localObject2);
      }
      localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zzc(paramNotificationSettings);
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = this.zzaan;
        localObject2 = CastRemoteDisplayLocalService.NotificationSettings.zzc(paramNotificationSettings);
        CastRemoteDisplayLocalService.NotificationSettings.zza((CastRemoteDisplayLocalService.NotificationSettings)localObject1, (String)localObject2);
      }
      localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zzd(paramNotificationSettings);
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = this.zzaan;
        localObject2 = CastRemoteDisplayLocalService.NotificationSettings.zzd(paramNotificationSettings);
        CastRemoteDisplayLocalService.NotificationSettings.zzb((CastRemoteDisplayLocalService.NotificationSettings)localObject1, (String)localObject2);
      }
      bool = true;
      localObject1 = zzT(bool);
      this.mNotification = ((Notification)localObject1);
    }
    for (;;)
    {
      int i = zzaag;
      localObject2 = this.mNotification;
      startForeground(i, (Notification)localObject2);
      return;
      zzx.zzb(CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings), "notification is required.");
      localObject1 = CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings);
      this.mNotification = ((Notification)localObject1);
      localObject1 = this.zzaan;
      localObject2 = this.mNotification;
      CastRemoteDisplayLocalService.NotificationSettings.zza((CastRemoteDisplayLocalService.NotificationSettings)localObject1, (Notification)localObject2);
    }
  }
  
  private boolean zza(String paramString, CastDevice paramCastDevice, CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings, Context paramContext, ServiceConnection paramServiceConnection, CastRemoteDisplayLocalService.Callbacks paramCallbacks)
  {
    int i = 1;
    boolean bool = false;
    Object localObject1 = null;
    zzbe("startRemoteDisplaySession");
    zzx.zzcD("Starting the Cast Remote Display must be done on the main thread");
    for (;;)
    {
      synchronized (zzaah)
      {
        Object localObject4 = zzaax;
        if (localObject4 != null)
        {
          zzl localzzl = zzaaf;
          localObject4 = "An existing service had not been stopped before starting one";
          localObject5 = null;
          localObject5 = new Object[0];
          localzzl.zzf((String)localObject4, (Object[])localObject5);
          return bool;
        }
        zzaax = this;
        this.zzaal = paramCallbacks;
        this.zzZC = paramString;
        this.zzaaq = paramCastDevice;
        this.zzaas = paramContext;
        this.zzaat = paramServiceConnection;
        ??? = MediaRouter.getInstance(getApplicationContext());
        this.zzaau = ((MediaRouter)???);
        ??? = new android/support/v7/media/MediaRouteSelector$Builder;
        ((MediaRouteSelector.Builder)???).<init>();
        localObject4 = CastMediaControlIntent.categoryForCast(this.zzZC);
        ??? = ((MediaRouteSelector.Builder)???).addControlCategory((String)localObject4).build();
        zzbe("addMediaRouterCallback");
        localObject4 = this.zzaau;
        Object localObject5 = this.zzaaw;
        int k = 4;
        ((MediaRouter)localObject4).addCallback((MediaRouteSelector)???, (MediaRouter.Callback)localObject5, k);
        ??? = new com/google/android/gms/cast/CastRemoteDisplayLocalService$7;
        ((CastRemoteDisplayLocalService.7)???).<init>(this);
        this.zzaak = ((CastRemoteDisplay.CastRemoteDisplaySessionCallbacks)???);
        ??? = CastRemoteDisplayLocalService.NotificationSettings.zzb(paramNotificationSettings);
        this.mNotification = ((Notification)???);
        ??? = new com/google/android/gms/cast/CastRemoteDisplayLocalService$zzb;
        ((CastRemoteDisplayLocalService.zzb)???).<init>(null);
        this.zzaam = ((CastRemoteDisplayLocalService.zzb)???);
        ??? = this.zzaam;
        localObject4 = new android/content/IntentFilter;
        localObject5 = "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT";
        ((IntentFilter)localObject4).<init>((String)localObject5);
        registerReceiver((BroadcastReceiver)???, (IntentFilter)localObject4);
        ??? = new com/google/android/gms/cast/CastRemoteDisplayLocalService$NotificationSettings;
        ((CastRemoteDisplayLocalService.NotificationSettings)???).<init>(paramNotificationSettings, null);
        this.zzaan = ((CastRemoteDisplayLocalService.NotificationSettings)???);
        ??? = CastRemoteDisplayLocalService.NotificationSettings.zzb(this.zzaan);
        if (??? == null)
        {
          this.zzaao = i;
          localObject1 = zzT(false);
          this.mNotification = ((Notification)localObject1);
          int j = zzaag;
          ??? = this.mNotification;
          startForeground(j, (Notification)???);
          localObject1 = zza(paramCastDevice);
          this.zzaaj = ((GoogleApiClient)localObject1);
          this.zzaaj.connect();
          localObject1 = this.zzaal;
          if (localObject1 != null)
          {
            localObject1 = this.zzaal;
            ((CastRemoteDisplayLocalService.Callbacks)localObject1).onServiceCreated(this);
          }
          j = i;
        }
      }
      this.zzaao = false;
      Notification localNotification = CastRemoteDisplayLocalService.NotificationSettings.zzb(this.zzaan);
      this.mNotification = localNotification;
    }
  }
  
  private static void zzb(Context paramContext, Class paramClass)
  {
    try
    {
      Object localObject1 = new android/content/ComponentName;
      ((ComponentName)localObject1).<init>(paramContext, paramClass);
      Object localObject2 = paramContext.getPackageManager();
      int i = 128;
      localObject1 = ((PackageManager)localObject2).getServiceInfo((ComponentName)localObject1, i);
      if (localObject1 != null)
      {
        boolean bool = ((ServiceInfo)localObject1).exported;
        if (bool)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = "The service must not be exported, verify the manifest configuration";
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Service not found, did you forget to configure it in the manifest?");
      throw localIllegalStateException;
    }
  }
  
  private void zzbe(String paramString)
  {
    zzl localzzl = zzaaf;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    localzzl.zzb("[Instance: %s] %s", arrayOfObject);
  }
  
  private void zzbh(String paramString)
  {
    zzl localzzl = zzaaf;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    localzzl.zzc("[Instance: %s] %s", arrayOfObject);
  }
  
  private void zznB()
  {
    MediaRouter localMediaRouter = this.zzaau;
    if (localMediaRouter != null)
    {
      zzx.zzcD("CastRemoteDisplayLocalService calls must be done on the main thread");
      zzbe("removeMediaRouterCallback");
      localMediaRouter = this.zzaau;
      MediaRouter.Callback localCallback = this.zzaaw;
      localMediaRouter.removeCallback(localCallback);
    }
  }
  
  private void zznC()
  {
    zzbe("startRemoteDisplay");
    Object localObject1 = this.zzaaj;
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = this.zzaaj;
      boolean bool = ((GoogleApiClient)localObject1).isConnected();
      if (bool) {}
    }
    else
    {
      localObject1 = zzaaf;
      localObject2 = "Unable to start the remote display as the API client is not ready";
      localObject3 = new Object[0];
      ((zzl)localObject1).zzc((String)localObject2, (Object[])localObject3);
    }
    for (;;)
    {
      return;
      localObject1 = CastRemoteDisplay.CastRemoteDisplayApi;
      localObject2 = this.zzaaj;
      localObject3 = this.zzZC;
      localObject1 = ((CastRemoteDisplayApi)localObject1).startRemoteDisplay((GoogleApiClient)localObject2, (String)localObject3);
      localObject2 = new com/google/android/gms/cast/CastRemoteDisplayLocalService$8;
      ((CastRemoteDisplayLocalService.8)localObject2).<init>(this);
      ((PendingResult)localObject1).setResultCallback((ResultCallback)localObject2);
    }
  }
  
  private void zznD()
  {
    zzbe("stopRemoteDisplay");
    Object localObject1 = this.zzaaj;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.zzaaj;
      boolean bool = ((GoogleApiClient)localObject1).isConnected();
      if (bool) {}
    }
    else
    {
      localObject1 = zzaaf;
      localObject2 = "Unable to stop the remote display as the API client is not ready";
      Object[] arrayOfObject = new Object[0];
      ((zzl)localObject1).zzc((String)localObject2, arrayOfObject);
    }
    for (;;)
    {
      return;
      localObject1 = CastRemoteDisplay.CastRemoteDisplayApi;
      localObject2 = this.zzaaj;
      localObject1 = ((CastRemoteDisplayApi)localObject1).stopRemoteDisplay((GoogleApiClient)localObject2);
      localObject2 = new com/google/android/gms/cast/CastRemoteDisplayLocalService$9;
      ((CastRemoteDisplayLocalService.9)localObject2).<init>(this);
      ((PendingResult)localObject1).setResultCallback((ResultCallback)localObject2);
    }
  }
  
  private void zznE()
  {
    CastRemoteDisplayLocalService.Callbacks localCallbacks = this.zzaal;
    if (localCallbacks != null)
    {
      localCallbacks = this.zzaal;
      Status localStatus = new com/google/android/gms/common/api/Status;
      int i = 2200;
      localStatus.<init>(i);
      localCallbacks.onRemoteDisplaySessionError(localStatus);
      localCallbacks = null;
      this.zzaal = null;
    }
    stopService();
  }
  
  private void zznF()
  {
    zzbe("stopRemoteDisplaySession");
    zznD();
    onDismissPresentation();
  }
  
  private void zznG()
  {
    zzbe("Stopping the remote display Service");
    stopForeground(true);
    stopSelf();
  }
  
  private PendingIntent zznH()
  {
    Object localObject = this.zzaap;
    if (localObject == null)
    {
      localObject = new android/content/Intent;
      ((Intent)localObject).<init>("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
      int i = 268435456;
      localObject = PendingIntent.getBroadcast(this, 0, (Intent)localObject, i);
      this.zzaap = ((PendingIntent)localObject);
    }
    return this.zzaap;
  }
  
  protected Display getDisplay()
  {
    return this.zzaar;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    zzbe("onBind");
    return this.zzaay;
  }
  
  public void onCreate()
  {
    zzbe("onCreate");
    super.onCreate();
    Handler localHandler = new android/os/Handler;
    Object localObject = getMainLooper();
    localHandler.<init>((Looper)localObject);
    this.mHandler = localHandler;
    localHandler = this.mHandler;
    localObject = new com/google/android/gms/cast/CastRemoteDisplayLocalService$3;
    ((CastRemoteDisplayLocalService.3)localObject).<init>(this);
    localHandler.postDelayed((Runnable)localObject, 100);
  }
  
  public abstract void onCreatePresentation(Display paramDisplay);
  
  public abstract void onDismissPresentation();
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    zzbe("onStartCommand");
    this.zzaav = true;
    return 2;
  }
  
  public void updateNotificationSettings(CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings)
  {
    zzx.zzb(paramNotificationSettings, "notificationSettings is required.");
    zzx.zzb(this.mHandler, "Service is not ready yet.");
    Handler localHandler = this.mHandler;
    CastRemoteDisplayLocalService.6 local6 = new com/google/android/gms/cast/CastRemoteDisplayLocalService$6;
    local6.<init>(this, paramNotificationSettings);
    localHandler.post(local6);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */