package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzz;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService
  extends Service
  implements ChangeListener, CompletionListener, zzc, zzq
{
  public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
  private final String mName;
  int zzakz = -1;
  private CountDownLatch zzapL;
  DriveEventService.zza zzapM;
  boolean zzapN = false;
  
  protected DriveEventService()
  {
    this("DriveEventService");
  }
  
  protected DriveEventService(String paramString)
  {
    this.mName = paramString;
  }
  
  private void zza(OnEventResponse paramOnEventResponse)
  {
    localObject1 = paramOnEventResponse.zzts();
    Object localObject2 = "DriveEventService";
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject5 = "handleEventMessage: ";
    localObject4 = (String)localObject5 + localObject1;
    zzz.zzy((String)localObject2, (String)localObject4);
    for (;;)
    {
      try
      {
        int i = ((DriveEvent)localObject1).getType();
        switch (i)
        {
        default: 
          localObject2 = this.mName;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject5 = "Unhandled event: ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).append(localObject1);
          localObject4 = ((StringBuilder)localObject4).toString();
          zzz.zzz((String)localObject2, (String)localObject4);
          return;
        }
      }
      catch (Exception localException)
      {
        localObject4 = this.mName;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        String str = "Error handling event: ";
        localObject5 = ((StringBuilder)localObject5).append(str);
        localObject1 = localObject1;
        zzz.zza((String)localObject4, localException, (String)localObject1);
        continue;
        Object localObject6 = localObject1;
        localObject6 = (CompletionEvent)localObject1;
        Object localObject3 = localObject6;
        onCompletion((CompletionEvent)localObject6);
        continue;
        localObject6 = localObject1;
        localObject6 = (ChangesAvailableEvent)localObject1;
        localObject3 = localObject6;
        zza((ChangesAvailableEvent)localObject6);
        continue;
        localObject6 = localObject1;
        localObject6 = (TransferStateEvent)localObject1;
        localObject3 = localObject6;
        zza((TransferStateEvent)localObject6);
        continue;
      }
      localObject6 = localObject1;
      localObject6 = (ChangeEvent)localObject1;
      localObject2 = localObject6;
      onChange((ChangeEvent)localObject6);
    }
  }
  
  private void zzsV()
  {
    int i = getCallingUid();
    int j = this.zzakz;
    if (i == j) {}
    for (;;)
    {
      return;
      boolean bool = GooglePlayServicesUtil.zzf(this, i);
      if (!bool) {
        break;
      }
      this.zzakz = i;
    }
    SecurityException localSecurityException = new java/lang/SecurityException;
    localSecurityException.<init>("Caller is not GooglePlayServices");
    throw localSecurityException;
  }
  
  protected int getCallingUid()
  {
    return Binder.getCallingUid();
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.drive.events.HANDLE_EVENT";; localObject3 = null) {
      try
      {
        Object localObject4 = paramIntent.getAction();
        boolean bool = ((String)localObject1).equals(localObject4);
        if (bool)
        {
          localObject1 = this.zzapM;
          long l;
          if (localObject1 == null)
          {
            bool = this.zzapN;
            if (!bool)
            {
              bool = true;
              this.zzapN = bool;
              localObject1 = new java/util/concurrent/CountDownLatch;
              int i = 1;
              ((CountDownLatch)localObject1).<init>(i);
              localObject4 = new java/util/concurrent/CountDownLatch;
              int j = 1;
              ((CountDownLatch)localObject4).<init>(j);
              this.zzapL = ((CountDownLatch)localObject4);
              localObject4 = new com/google/android/gms/drive/events/DriveEventService$1;
              ((DriveEventService.1)localObject4).<init>(this, (CountDownLatch)localObject1);
              ((DriveEventService.1)localObject4).start();
              l = 5000L;
            }
          }
          try
          {
            localObject4 = TimeUnit.MILLISECONDS;
            bool = ((CountDownLatch)localObject1).await(l, (TimeUnit)localObject4);
            if (!bool)
            {
              localObject1 = "DriveEventService";
              localObject4 = "Failed to synchronously initialize event handler.";
              zzz.zzA((String)localObject1, (String)localObject4);
            }
            localObject1 = new com/google/android/gms/drive/events/DriveEventService$zzb;
            ((DriveEventService.zzb)localObject1).<init>(this);
            localObject1 = ((DriveEventService.zzb)localObject1).asBinder();
            return (IBinder)localObject1;
          }
          catch (InterruptedException localInterruptedException)
          {
            localObject4 = new java/lang/RuntimeException;
            String str = "Unable to start event handler";
            ((RuntimeException)localObject4).<init>(str, localInterruptedException);
            throw ((Throwable)localObject4);
          }
        }
        bool = false;
      }
      finally {}
    }
  }
  
  public void onChange(ChangeEvent paramChangeEvent)
  {
    String str = this.mName;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Unhandled change event: " + paramChangeEvent;
    zzz.zzz(str, (String)localObject);
  }
  
  public void onCompletion(CompletionEvent paramCompletionEvent)
  {
    String str = this.mName;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Unhandled completion event: " + paramCompletionEvent;
    zzz.zzz(str, (String)localObject);
  }
  
  public void onDestroy()
  {
    Object localObject1 = "DriveEventService";
    Object localObject3 = "onDestroy";
    for (;;)
    {
      boolean bool;
      long l;
      try
      {
        zzz.zzy((String)localObject1, (String)localObject3);
        localObject1 = this.zzapM;
        if (localObject1 != null)
        {
          localObject1 = this.zzapM;
          localObject1 = DriveEventService.zza.zza((DriveEventService.zza)localObject1);
          localObject3 = this.zzapM;
          ((DriveEventService.zza)localObject3).sendMessage((Message)localObject1);
          bool = false;
          localObject1 = null;
          this.zzapM = null;
        }
      }
      finally {}
      try
      {
        localObject1 = this.zzapL;
        l = 5000L;
        localObject3 = TimeUnit.MILLISECONDS;
        bool = ((CountDownLatch)localObject1).await(l, (TimeUnit)localObject3);
        if (!bool)
        {
          localObject1 = "DriveEventService";
          localObject3 = "Failed to synchronously quit event handler. Will quit itself";
          zzz.zzz((String)localObject1, (String)localObject3);
        }
      }
      catch (InterruptedException localInterruptedException) {}
    }
    bool = false;
    localObject1 = null;
    this.zzapL = null;
    super.onDestroy();
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    return true;
  }
  
  public void zza(ChangesAvailableEvent paramChangesAvailableEvent)
  {
    String str = this.mName;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Unhandled changes available event: " + paramChangesAvailableEvent;
    zzz.zzz(str, (String)localObject);
  }
  
  public void zza(TransferStateEvent paramTransferStateEvent)
  {
    String str = this.mName;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Unhandled transfer state event: " + paramTransferStateEvent;
    zzz.zzz(str, (String)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\DriveEventService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */