package com.google.android.gms.wearable;

import android.os.Binder;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.zzaw.zza;
import java.util.List;

final class WearableListenerService$zza
  extends zzaw.zza
{
  private volatile int zzakz = -1;
  
  private WearableListenerService$zza(WearableListenerService paramWearableListenerService) {}
  
  private void zzIx()
  {
    int i = Binder.getCallingUid();
    int j = this.zzakz;
    if (i == j) {}
    for (;;)
    {
      return;
      WearableListenerService localWearableListenerService = this.zzbrq;
      boolean bool = GooglePlayServicesUtil.zzf(localWearableListenerService, i);
      if (!bool) {
        break;
      }
      this.zzakz = i;
    }
    SecurityException localSecurityException = new java/lang/SecurityException;
    localSecurityException.<init>("Caller is not GooglePlayServices");
    throw localSecurityException;
  }
  
  private boolean zza(Runnable paramRunnable, String paramString, Object paramObject)
  {
    WearableListenerService localWearableListenerService = this.zzbrq;
    boolean bool = localWearableListenerService instanceof zzj;
    if (!bool)
    {
      bool = false;
      localWearableListenerService = null;
    }
    for (;;)
    {
      return bool;
      bool = zzb(paramRunnable, paramString, paramObject);
    }
  }
  
  private boolean zzb(Runnable paramRunnable, String paramString, Object paramObject)
  {
    int i = 3;
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    ??? = "WearableLS";
    boolean bool3 = Log.isLoggable((String)???, i);
    Object localObject4;
    if (bool3)
    {
      ??? = "WearableLS";
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      String str = WearableListenerService.zza(this.zzbrq);
      arrayOfObject[bool1] = str;
      int j = 2;
      arrayOfObject[j] = paramObject;
      localObject4 = String.format("%s: %s %s", arrayOfObject);
      Log.d((String)???, (String)localObject4);
    }
    zzIx();
    synchronized (WearableListenerService.zzb(this.zzbrq))
    {
      localObject4 = this.zzbrq;
      boolean bool4 = WearableListenerService.zzc((WearableListenerService)localObject4);
      if (bool4) {
        return bool2;
      }
      localObject1 = this.zzbrq;
      localObject1 = WearableListenerService.zzd((WearableListenerService)localObject1);
      ((Handler)localObject1).post(paramRunnable);
      bool2 = bool1;
    }
  }
  
  public void onConnectedNodes(List paramList)
  {
    WearableListenerService.zza.5 local5 = new com/google/android/gms/wearable/WearableListenerService$zza$5;
    local5.<init>(this, paramList);
    zzb(local5, "onConnectedNodes", paramList);
  }
  
  public void zza(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable)
  {
    WearableListenerService.zza.8 local8 = new com/google/android/gms/wearable/WearableListenerService$zza$8;
    local8.<init>(this, paramAmsEntityUpdateParcelable);
    zza(local8, "onEntityUpdate", paramAmsEntityUpdateParcelable);
  }
  
  public void zza(AncsNotificationParcelable paramAncsNotificationParcelable)
  {
    WearableListenerService.zza.7 local7 = new com/google/android/gms/wearable/WearableListenerService$zza$7;
    local7.<init>(this, paramAncsNotificationParcelable);
    zza(local7, "onNotificationReceived", paramAncsNotificationParcelable);
  }
  
  public void zza(CapabilityInfoParcelable paramCapabilityInfoParcelable)
  {
    WearableListenerService.zza.6 local6 = new com/google/android/gms/wearable/WearableListenerService$zza$6;
    local6.<init>(this, paramCapabilityInfoParcelable);
    zzb(local6, "onConnectedCapabilityChanged", paramCapabilityInfoParcelable);
  }
  
  public void zza(ChannelEventParcelable paramChannelEventParcelable)
  {
    WearableListenerService.zza.9 local9 = new com/google/android/gms/wearable/WearableListenerService$zza$9;
    local9.<init>(this, paramChannelEventParcelable);
    zzb(local9, "onChannelEvent", paramChannelEventParcelable);
  }
  
  public void zza(MessageEventParcelable paramMessageEventParcelable)
  {
    WearableListenerService.zza.2 local2 = new com/google/android/gms/wearable/WearableListenerService$zza$2;
    local2.<init>(this, paramMessageEventParcelable);
    zzb(local2, "onMessageReceived", paramMessageEventParcelable);
  }
  
  public void zza(NodeParcelable paramNodeParcelable)
  {
    WearableListenerService.zza.3 local3 = new com/google/android/gms/wearable/WearableListenerService$zza$3;
    local3.<init>(this, paramNodeParcelable);
    zzb(local3, "onPeerConnected", paramNodeParcelable);
  }
  
  public void zzag(DataHolder paramDataHolder)
  {
    WearableListenerService.zza.1 local1 = new com/google/android/gms/wearable/WearableListenerService$zza$1;
    local1.<init>(this, paramDataHolder);
    String str = "onDataItemChanged";
    try
    {
      boolean bool = zzb(local1, str, paramDataHolder);
      if (!bool) {}
      return;
    }
    finally
    {
      paramDataHolder.close();
    }
  }
  
  public void zzb(NodeParcelable paramNodeParcelable)
  {
    WearableListenerService.zza.4 local4 = new com/google/android/gms/wearable/WearableListenerService$zza$4;
    local4.<init>(this, paramNodeParcelable);
    zzb(local4, "onPeerDisconnected", paramNodeParcelable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */