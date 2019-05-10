package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.internal.zzne;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;

class zzm
  extends zzj
{
  private final boolean zzbcv;
  private final ClientAppContext zzbcw;
  private final zzm.zzg zzbcx;
  private final zzm.zzg zzbcy;
  
  zzm(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, com.google.android.gms.common.internal.zzf paramzzf, MessagesOptions paramMessagesOptions)
  {
    super(paramContext, paramLooper, i, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject1 = new com/google/android/gms/nearby/messages/internal/zzm$1;
    ((zzm.1)localObject1).<init>(this);
    this.zzbcx = ((zzm.zzg)localObject1);
    localObject1 = new com/google/android/gms/nearby/messages/internal/zzm$2;
    ((zzm.2)localObject1).<init>(this);
    this.zzbcy = ((zzm.zzg)localObject1);
    localObject1 = paramzzf.zzqv();
    int j = zzaU(paramContext);
    String str;
    boolean bool1;
    int k;
    if (paramMessagesOptions != null)
    {
      localObject3 = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
      str = paramMessagesOptions.zzbbF;
      bool1 = paramMessagesOptions.zzbbH;
      ((ClientAppContext)localObject3).<init>((String)localObject1, str, bool1, j);
      this.zzbcw = ((ClientAppContext)localObject3);
      k = paramMessagesOptions.zzbbG;
    }
    for (this.zzbcv = k;; this.zzbcv = false)
    {
      k = 1;
      if (j == k)
      {
        bool2 = zzne.zzsg();
        if (bool2)
        {
          paramContext = (Activity)paramContext;
          localObject3 = new Object[1];
          i = 0;
          str = null;
          localObject4 = paramContext.getPackageName();
          localObject3[0] = localObject4;
          localObject2 = String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", (Object[])localObject3);
          Log.v("NearbyMessagesClient", (String)localObject2);
          localObject1 = paramContext.getApplication();
          localObject2 = new com/google/android/gms/nearby/messages/internal/zzm$zzb;
          localObject3 = null;
          ((zzm.zzb)localObject2).<init>(paramContext, this, null);
          ((Application)localObject1).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
        }
      }
      return;
      localObject3 = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
      i = 0;
      str = null;
      bool1 = false;
      localObject4 = null;
      ((ClientAppContext)localObject3).<init>((String)localObject1, null, false, j);
      this.zzbcw = ((ClientAppContext)localObject3);
      boolean bool2 = false;
      localObject1 = null;
    }
  }
  
  private static zzq zza(GoogleApiClient paramGoogleApiClient, Object paramObject, zzm.zzg paramzzg)
  {
    Object localObject = paramzzg.zzG(paramObject);
    if (localObject != null) {}
    for (localObject = ((zzm.zza)localObject).zzEE();; localObject = paramGoogleApiClient.zzr(paramObject)) {
      return (zzq)localObject;
    }
  }
  
  private static int zzaU(Context paramContext)
  {
    int i = paramContext instanceof Activity;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      boolean bool1 = paramContext instanceof Application;
      if (bool1)
      {
        int j = 2;
      }
      else
      {
        boolean bool2 = paramContext instanceof Service;
        int k;
        if (bool2) {
          k = 3;
        } else {
          k = 0;
        }
      }
    }
  }
  
  public void disconnect()
  {
    int i = 2;
    try
    {
      zzjq(i);
      super.disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str2 = "NearbyMessagesClient";
        String str3 = "Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s";
        int j = 1;
        Object[] arrayOfObject = new Object[j];
        arrayOfObject[0] = localRemoteException;
        String str1 = String.format(str3, arrayOfObject);
        Log.v(str2, str1);
      }
    }
  }
  
  zzq zza(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
  {
    zzm.zzg localzzg = this.zzbcy;
    return zza(paramGoogleApiClient, paramMessageListener, localzzg);
  }
  
  zzq zza(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    zzm.zzg localzzg = this.zzbcx;
    return zza(paramGoogleApiClient, paramStatusCallback, localzzg);
  }
  
  void zza(zza.zzb paramzzb, PendingIntent paramPendingIntent)
  {
    UnsubscribeRequest localUnsubscribeRequest = new com/google/android/gms/nearby/messages/internal/UnsubscribeRequest;
    zzp localzzp = zzp.zzn(paramzzb);
    ClientAppContext localClientAppContext = this.zzbcw;
    localUnsubscribeRequest.<init>(null, localzzp, paramPendingIntent, 0, localClientAppContext);
    ((zzf)zzqJ()).zza(localUnsubscribeRequest);
  }
  
  void zza(zza.zzb paramzzb, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions)
  {
    SubscribeRequest localSubscribeRequest = new com/google/android/gms/nearby/messages/internal/SubscribeRequest;
    Strategy localStrategy = paramSubscribeOptions.getStrategy();
    zzp localzzp = zzp.zzn(paramzzb);
    MessageFilter localMessageFilter = paramSubscribeOptions.getFilter();
    boolean bool = this.zzbcv;
    zzm.zzf localzzf = zzm.zzf.zzb(paramSubscribeOptions.getCallback());
    ClientAppContext localClientAppContext = this.zzbcw;
    localSubscribeRequest.<init>(null, localStrategy, localzzp, localMessageFilter, paramPendingIntent, 0, null, bool, localzzf, localClientAppContext);
    ((zzf)zzqJ()).zza(localSubscribeRequest);
  }
  
  void zza(zza.zzb paramzzb, zzq paramzzq, MessageListener paramMessageListener)
  {
    Object localObject1 = this.zzbcy.zzG(paramMessageListener);
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/nearby/messages/internal/UnsubscribeRequest;
      Object localObject2 = (IBinder)this.zzbcy.zza(paramzzq, paramMessageListener);
      zzp localzzp = zzp.zzn(paramzzb);
      ClientAppContext localClientAppContext = this.zzbcw;
      ((UnsubscribeRequest)localObject1).<init>((IBinder)localObject2, localzzp, null, 0, localClientAppContext);
      localObject2 = (zzf)zzqJ();
      ((zzf)localObject2).zza((UnsubscribeRequest)localObject1);
      localObject1 = this.zzbcy;
      ((zzm.zzg)localObject1).zzH(paramMessageListener);
    }
  }
  
  void zza(zza.zzb paramzzb, zzq paramzzq, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions, byte[] paramArrayOfByte)
  {
    SubscribeRequest localSubscribeRequest = new com/google/android/gms/nearby/messages/internal/SubscribeRequest;
    IBinder localIBinder = (IBinder)this.zzbcy.zza(paramzzq, paramMessageListener);
    Strategy localStrategy = paramSubscribeOptions.getStrategy();
    zzp localzzp = zzp.zzn(paramzzb);
    MessageFilter localMessageFilter = paramSubscribeOptions.getFilter();
    boolean bool = this.zzbcv;
    zzm.zzf localzzf = zzm.zzf.zzb(paramSubscribeOptions.getCallback());
    ClientAppContext localClientAppContext = this.zzbcw;
    localSubscribeRequest.<init>(localIBinder, localStrategy, localzzp, localMessageFilter, null, 0, paramArrayOfByte, bool, localzzf, localClientAppContext);
    ((zzf)zzqJ()).zza(localSubscribeRequest);
  }
  
  void zza(zza.zzb paramzzb, zzq paramzzq, StatusCallback paramStatusCallback)
  {
    RegisterStatusCallbackRequest localRegisterStatusCallbackRequest = new com/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;
    zzp localzzp = zzp.zzn(paramzzb);
    IBinder localIBinder = (IBinder)this.zzbcx.zza(paramzzq, paramStatusCallback);
    ClientAppContext localClientAppContext = this.zzbcw;
    localRegisterStatusCallbackRequest.<init>(localzzp, localIBinder, localClientAppContext);
    localRegisterStatusCallbackRequest.zzbcX = true;
    ((zzf)zzqJ()).zza(localRegisterStatusCallbackRequest);
  }
  
  void zza(zza.zzb paramzzb, MessageWrapper paramMessageWrapper)
  {
    UnpublishRequest localUnpublishRequest = new com/google/android/gms/nearby/messages/internal/UnpublishRequest;
    zzp localzzp = zzp.zzn(paramzzb);
    ClientAppContext localClientAppContext = this.zzbcw;
    localUnpublishRequest.<init>(paramMessageWrapper, localzzp, localClientAppContext);
    ((zzf)zzqJ()).zza(localUnpublishRequest);
  }
  
  void zza(zza.zzb paramzzb, MessageWrapper paramMessageWrapper, PublishOptions paramPublishOptions)
  {
    PublishRequest localPublishRequest = new com/google/android/gms/nearby/messages/internal/PublishRequest;
    Strategy localStrategy = paramPublishOptions.getStrategy();
    zzp localzzp = zzp.zzn(paramzzb);
    boolean bool = this.zzbcv;
    zzm.zzd localzzd = zzm.zzd.zzb(paramPublishOptions.getCallback());
    ClientAppContext localClientAppContext = this.zzbcw;
    localPublishRequest.<init>(paramMessageWrapper, localStrategy, localzzp, bool, localzzd, localClientAppContext);
    ((zzf)zzqJ()).zza(localPublishRequest);
  }
  
  void zzb(zza.zzb paramzzb, zzq paramzzq, StatusCallback paramStatusCallback)
  {
    Object localObject = this.zzbcx.zzG(paramStatusCallback);
    if (localObject == null) {}
    for (;;)
    {
      return;
      RegisterStatusCallbackRequest localRegisterStatusCallbackRequest = new com/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;
      zzp localzzp = zzp.zzn(paramzzb);
      localObject = (IBinder)this.zzbcx.zza(paramzzq, paramStatusCallback);
      ClientAppContext localClientAppContext = this.zzbcw;
      localRegisterStatusCallbackRequest.<init>(localzzp, (IBinder)localObject, localClientAppContext);
      localRegisterStatusCallbackRequest.zzbcX = false;
      ((zzf)zzqJ()).zza(localRegisterStatusCallbackRequest);
      localObject = this.zzbcx;
      ((zzm.zzg)localObject).zzH(paramStatusCallback);
    }
  }
  
  protected zzf zzdE(IBinder paramIBinder)
  {
    return zzf.zza.zzdA(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
  }
  
  void zzjq(int paramInt)
  {
    int i = 1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    switch (paramInt)
    {
    default: 
      localObject1 = "NearbyMessagesClient";
      localObject2 = new Object[i];
      localObject3 = Integer.valueOf(paramInt);
      localObject2[0] = localObject3;
      localObject4 = String.format("Received unknown/unforeseen client lifecycle event %d, can't do anything with it.", (Object[])localObject2);
      Log.w((String)localObject1, (String)localObject4);
    }
    for (;;)
    {
      return;
      for (localObject1 = "ACTIVITY_STOPPED";; localObject1 = "CLIENT_DISCONNECTED")
      {
        boolean bool = isConnected();
        if (!bool) {
          break label157;
        }
        localObject4 = new com/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;
        localObject2 = this.zzbcw;
        ((HandleClientLifecycleEventRequest)localObject4).<init>((ClientAppContext)localObject2, paramInt);
        localObject2 = "NearbyMessagesClient";
        localObject3 = "Emitting client lifecycle event %s";
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = localObject1;
        localObject1 = String.format((String)localObject3, arrayOfObject);
        Log.d((String)localObject2, (String)localObject1);
        localObject1 = (zzf)zzqJ();
        ((zzf)localObject1).zza((HandleClientLifecycleEventRequest)localObject4);
        break;
      }
      label157:
      localObject4 = "NearbyMessagesClient";
      localObject2 = "Failed to emit client lifecycle event %s due to GmsClient being disconnected";
      localObject3 = new Object[i];
      localObject3[0] = localObject1;
      localObject1 = String.format((String)localObject2, (Object[])localObject3);
      Log.d((String)localObject4, (String)localObject1);
    }
  }
  
  void zzm(zza.zzb paramzzb)
  {
    GetPermissionStatusRequest localGetPermissionStatusRequest = new com/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;
    zzp localzzp = zzp.zzn(paramzzb);
    ClientAppContext localClientAppContext = this.zzbcw;
    localGetPermissionStatusRequest.<init>(localzzp, localClientAppContext);
    ((zzf)zzqJ()).zza(localGetPermissionStatusRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */