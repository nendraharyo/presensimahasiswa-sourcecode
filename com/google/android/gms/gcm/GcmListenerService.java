package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class GcmListenerService
  extends Service
{
  private int zzaLy;
  private int zzaLz;
  private final Object zzpV;
  
  public GcmListenerService()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzaLz = 0;
  }
  
  private void zzm(Intent paramIntent)
  {
    Object localObject = (PendingIntent)paramIntent.getParcelableExtra("com.google.android.gms.gcm.PENDING_INTENT");
    if (localObject != null) {}
    try
    {
      ((PendingIntent)localObject).send();
      localObject = paramIntent.getExtras();
      boolean bool = zzx((Bundle)localObject);
      if (bool) {
        zza.zzf(this, paramIntent);
      }
      return;
    }
    catch (PendingIntent.CanceledException localCanceledException)
    {
      for (;;)
      {
        String str1 = "GcmListenerService";
        String str2 = "Notification pending intent canceled";
        Log.e(str1, str2);
      }
    }
  }
  
  private void zzn(Intent paramIntent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject1;
    Object localObject2;
    if (i >= j)
    {
      localObject1 = AsyncTask.THREAD_POOL_EXECUTOR;
      localObject2 = new com/google/android/gms/gcm/GcmListenerService$1;
      ((GcmListenerService.1)localObject2).<init>(this, paramIntent);
      ((Executor)localObject1).execute((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/gcm/GcmListenerService$2;
      ((GcmListenerService.2)localObject1).<init>(this, paramIntent);
      j = 0;
      localObject2 = new Void[0];
      ((GcmListenerService.2)localObject1).execute((Object[])localObject2);
    }
  }
  
  private void zzo(Intent paramIntent)
  {
    for (;;)
    {
      try
      {
        Object localObject1 = paramIntent.getAction();
        int i = -1;
        int j = ((String)localObject1).hashCode();
        String str1;
        switch (j)
        {
        default: 
          switch (i)
          {
          default: 
            str1 = "GcmListenerService";
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            str2 = "Unknown intent action: ";
            localObject1 = ((StringBuilder)localObject1).append(str2);
            str2 = paramIntent.getAction();
            localObject1 = ((StringBuilder)localObject1).append(str2);
            localObject1 = ((StringBuilder)localObject1).toString();
            Log.d(str1, (String)localObject1);
            zzyh();
            return;
          }
        case 366519424: 
          str2 = "com.google.android.c2dm.intent.RECEIVE";
          bool2 = ((String)localObject1).equals(str2);
          if (!bool2) {
            continue;
          }
          i = 0;
          str1 = null;
          break;
        }
        String str2 = "com.google.android.gms.gcm.NOTIFICATION_DISMISS";
        boolean bool2 = ((String)localObject1).equals(str2);
        if (!bool2) {
          continue;
        }
        i = 1;
        continue;
        zzp(paramIntent);
        continue;
        localBundle = paramIntent.getExtras();
      }
      finally
      {
        GcmReceiver.completeWakefulIntent(paramIntent);
      }
      Bundle localBundle;
      boolean bool1 = zzx(localBundle);
      if (bool1) {
        zza.zzg(this, paramIntent);
      }
    }
  }
  
  private void zzp(Intent paramIntent)
  {
    Object localObject1 = paramIntent.getStringExtra("message_type");
    if (localObject1 == null) {
      localObject1 = "gcm";
    }
    int i = -1;
    int j = ((String)localObject1).hashCode();
    String str1;
    Object localObject2;
    switch (j)
    {
    default: 
      switch (i)
      {
      default: 
        str1 = "GcmListenerService";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Received message with unknown type: ";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        localObject1 = (String)localObject1;
        Log.w(str1, (String)localObject1);
      }
      break;
    }
    for (;;)
    {
      return;
      localObject2 = "gcm";
      boolean bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1) {
        break;
      }
      i = 0;
      str1 = null;
      break;
      localObject2 = "deleted_messages";
      bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1) {
        break;
      }
      i = 1;
      break;
      localObject2 = "send_event";
      bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1) {
        break;
      }
      i = 2;
      break;
      localObject2 = "send_error";
      bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1) {
        break;
      }
      i = 3;
      break;
      localObject1 = paramIntent.getExtras();
      boolean bool2 = zzx((Bundle)localObject1);
      if (bool2) {
        zza.zze(this, paramIntent);
      }
      zzq(paramIntent);
      continue;
      onDeletedMessages();
      continue;
      localObject1 = paramIntent.getStringExtra("google.message_id");
      onMessageSent((String)localObject1);
      continue;
      localObject1 = paramIntent.getStringExtra("google.message_id");
      str1 = paramIntent.getStringExtra("error");
      onSendError((String)localObject1, str1);
    }
  }
  
  private void zzq(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    localBundle.remove("message_type");
    Object localObject = "android.support.content.wakelockid";
    localBundle.remove((String)localObject);
    boolean bool = zzb.zzy(localBundle);
    if (bool)
    {
      bool = zzb.zzaI(this);
      if (!bool)
      {
        localObject = getClass();
        localObject = zzb.zzc(this, (Class)localObject);
        ((zzb)localObject).zzA(localBundle);
      }
    }
    for (;;)
    {
      return;
      localObject = paramIntent.getExtras();
      bool = zzx((Bundle)localObject);
      if (bool) {
        zza.zzh(this, paramIntent);
      }
      zzb.zzz(localBundle);
      localObject = localBundle.getString("from");
      String str = "from";
      localBundle.remove(str);
      zzw(localBundle);
      onMessageReceived((String)localObject, localBundle);
    }
  }
  
  static void zzw(Bundle paramBundle)
  {
    Object localObject = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      if (localObject != null)
      {
        String str = "google.c.";
        bool = ((String)localObject).startsWith(str);
        if (bool) {
          localIterator.remove();
        }
      }
    }
  }
  
  static boolean zzx(Bundle paramBundle)
  {
    String str = paramBundle.getString("google.c.a.e");
    return "1".equals(str);
  }
  
  private void zzyh()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzaLz + -1;
      this.zzaLz = i;
      i = this.zzaLz;
      if (i == 0)
      {
        i = this.zzaLy;
        zzhd(i);
      }
      return;
    }
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onDeletedMessages() {}
  
  public void onMessageReceived(String paramString, Bundle paramBundle) {}
  
  public void onMessageSent(String paramString) {}
  
  public void onSendError(String paramString1, String paramString2) {}
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    synchronized (this.zzpV)
    {
      this.zzaLy = paramInt2;
      int i = this.zzaLz + 1;
      this.zzaLz = i;
      if (paramIntent == null)
      {
        zzyh();
        i = 2;
        return i;
      }
    }
    String str = "com.google.android.gms.gcm.NOTIFICATION_OPEN";
    ??? = paramIntent.getAction();
    boolean bool = str.equals(???);
    if (bool)
    {
      zzm(paramIntent);
      zzyh();
      GcmReceiver.completeWakefulIntent(paramIntent);
    }
    for (;;)
    {
      int j = 3;
      break;
      zzn(paramIntent);
    }
  }
  
  boolean zzhd(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmListenerService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */