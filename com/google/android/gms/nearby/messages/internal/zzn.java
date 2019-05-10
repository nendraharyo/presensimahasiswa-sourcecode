package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.PublishOptions.Builder;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.nearby.messages.SubscribeOptions.Builder;
import java.util.Iterator;
import java.util.List;

public class zzn
  implements Messages
{
  public static final Api.zzc zzUI;
  public static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/nearby/messages/internal/zzn$1;
    ((zzn.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
  }
  
  private static Message zzA(Intent paramIntent)
  {
    return (Message)zzj.zzc(paramIntent, "com.google.android.gms.nearby.messages.MESSAGES");
  }
  
  private static Message zzB(Intent paramIntent)
  {
    return (Message)zzj.zzc(paramIntent, "com.google.android.gms.nearby.messages.LOST_MESSAGE");
  }
  
  private static List zzC(Intent paramIntent)
  {
    return zzj.zzd(paramIntent, "com.google.android.gms.nearby.messages.UPDATED_MESSAGES");
  }
  
  public PendingResult getPermissionStatus(GoogleApiClient paramGoogleApiClient)
  {
    zzn.9 local9 = new com/google/android/gms/nearby/messages/internal/zzn$9;
    local9.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local9);
  }
  
  public void handleIntent(Intent paramIntent, MessageListener paramMessageListener)
  {
    Object localObject = zzA(paramIntent);
    if (localObject != null) {
      paramMessageListener.onFound((Message)localObject);
    }
    localObject = zzB(paramIntent);
    if (localObject != null) {
      paramMessageListener.onLost((Message)localObject);
    }
    localObject = zzC(paramIntent);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Message)localIterator.next();
      paramMessageListener.zza((Message)localObject);
    }
  }
  
  public PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage)
  {
    PublishOptions localPublishOptions = PublishOptions.DEFAULT;
    return publish(paramGoogleApiClient, paramMessage, localPublishOptions);
  }
  
  public PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, PublishOptions paramPublishOptions)
  {
    zzx.zzz(paramMessage);
    zzx.zzz(paramPublishOptions);
    zzn.3 local3 = new com/google/android/gms/nearby/messages/internal/zzn$3;
    local3.<init>(this, paramGoogleApiClient, paramMessage, paramPublishOptions);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, Strategy paramStrategy)
  {
    Object localObject = new com/google/android/gms/nearby/messages/PublishOptions$Builder;
    ((PublishOptions.Builder)localObject).<init>();
    localObject = ((PublishOptions.Builder)localObject).setStrategy(paramStrategy).build();
    return publish(paramGoogleApiClient, paramMessage, (PublishOptions)localObject);
  }
  
  public PendingResult registerStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    zzx.zzz(paramStatusCallback);
    Object localObject = zzUI;
    localObject = ((zzm)paramGoogleApiClient.zza((Api.zzc)localObject)).zza(paramGoogleApiClient, paramStatusCallback);
    zzn.10 local10 = new com/google/android/gms/nearby/messages/internal/zzn$10;
    local10.<init>(this, paramGoogleApiClient, (zzq)localObject, paramStatusCallback);
    return paramGoogleApiClient.zzb(local10);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    SubscribeOptions localSubscribeOptions = SubscribeOptions.DEFAULT;
    return subscribe(paramGoogleApiClient, paramPendingIntent, localSubscribeOptions);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions)
  {
    zzx.zzz(paramPendingIntent);
    zzx.zzz(paramSubscribeOptions);
    zzn.6 local6 = new com/google/android/gms/nearby/messages/internal/zzn$6;
    local6.<init>(this, paramGoogleApiClient, paramPendingIntent, paramSubscribeOptions);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
  {
    SubscribeOptions localSubscribeOptions = SubscribeOptions.DEFAULT;
    return subscribe(paramGoogleApiClient, paramMessageListener, localSubscribeOptions);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, Strategy paramStrategy)
  {
    Object localObject = new com/google/android/gms/nearby/messages/SubscribeOptions$Builder;
    ((SubscribeOptions.Builder)localObject).<init>();
    localObject = ((SubscribeOptions.Builder)localObject).setStrategy(paramStrategy).build();
    return subscribe(paramGoogleApiClient, paramMessageListener, (SubscribeOptions)localObject);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, Strategy paramStrategy, MessageFilter paramMessageFilter)
  {
    Object localObject = new com/google/android/gms/nearby/messages/SubscribeOptions$Builder;
    ((SubscribeOptions.Builder)localObject).<init>();
    localObject = ((SubscribeOptions.Builder)localObject).setStrategy(paramStrategy).setFilter(paramMessageFilter).build();
    return subscribe(paramGoogleApiClient, paramMessageListener, (SubscribeOptions)localObject);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions)
  {
    zzx.zzz(paramMessageListener);
    zzx.zzz(paramSubscribeOptions);
    Object localObject = zzUI;
    zzq localzzq = ((zzm)paramGoogleApiClient.zza((Api.zzc)localObject)).zza(paramGoogleApiClient, paramMessageListener);
    localObject = new com/google/android/gms/nearby/messages/internal/zzn$5;
    ((zzn.5)localObject).<init>(this, paramGoogleApiClient, localzzq, paramMessageListener, paramSubscribeOptions);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
  
  public PendingResult unpublish(GoogleApiClient paramGoogleApiClient, Message paramMessage)
  {
    zzx.zzz(paramMessage);
    zzn.4 local4 = new com/google/android/gms/nearby/messages/internal/zzn$4;
    local4.<init>(this, paramGoogleApiClient, paramMessage);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult unregisterStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    Object localObject = zzUI;
    localObject = ((zzm)paramGoogleApiClient.zza((Api.zzc)localObject)).zza(paramGoogleApiClient, paramStatusCallback);
    zzn.2 local2 = new com/google/android/gms/nearby/messages/internal/zzn$2;
    local2.<init>(this, paramGoogleApiClient, (zzq)localObject, paramStatusCallback);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    zzx.zzz(paramPendingIntent);
    zzn.8 local8 = new com/google/android/gms/nearby/messages/internal/zzn$8;
    local8.<init>(this, paramGoogleApiClient, paramPendingIntent);
    return paramGoogleApiClient.zzb(local8);
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
  {
    zzx.zzz(paramMessageListener);
    Object localObject = zzUI;
    localObject = ((zzm)paramGoogleApiClient.zza((Api.zzc)localObject)).zza(paramGoogleApiClient, paramMessageListener);
    zzn.7 local7 = new com/google/android/gms/nearby/messages/internal/zzn$7;
    local7.<init>(this, paramGoogleApiClient, (zzq)localObject, paramMessageListener);
    return paramGoogleApiClient.zzb(local7);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */