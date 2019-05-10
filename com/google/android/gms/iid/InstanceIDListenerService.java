package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.gcm.GcmReceiver;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;

public class InstanceIDListenerService
  extends Service
{
  static String ACTION = "action";
  private static String zzaLH = "gcm.googleapis.com/refresh";
  private static String zzaMY = "google.com/iid";
  private static String zzaMZ = "CMD";
  MessengerCompat zzaMW;
  BroadcastReceiver zzaMX;
  int zzaNa;
  int zzaNb;
  
  public InstanceIDListenerService()
  {
    Object localObject = new com/google/android/gms/iid/MessengerCompat;
    InstanceIDListenerService.1 local1 = new com/google/android/gms/iid/InstanceIDListenerService$1;
    Looper localLooper = Looper.getMainLooper();
    local1.<init>(this, localLooper);
    ((MessengerCompat)localObject).<init>(local1);
    this.zzaMW = ((MessengerCompat)localObject);
    localObject = new com/google/android/gms/iid/InstanceIDListenerService$2;
    ((InstanceIDListenerService.2)localObject).<init>(this);
    this.zzaMX = ((BroadcastReceiver)localObject);
  }
  
  static void zza(Context paramContext, zzd paramzzd)
  {
    paramzzd.zzyG();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.iid.InstanceID");
    String str = zzaMZ;
    localIntent.putExtra(str, "RST");
    str = paramContext.getPackageName();
    localIntent.setPackage(str);
    paramContext.startService(localIntent);
  }
  
  private void zza(Message paramMessage, int paramInt)
  {
    zzc.zzaN(this);
    getPackageManager();
    int i = zzc.zzaNi;
    Object localObject1;
    if (paramInt != i)
    {
      i = zzc.zzaNh;
      if (paramInt != i)
      {
        localObject1 = "InstanceID";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Message from unexpected caller ").append(paramInt).append(" mine=");
        int j = zzc.zzaNh;
        localObject2 = ((StringBuilder)localObject2).append(j);
        String str = " appid=";
        localObject2 = ((StringBuilder)localObject2).append(str);
        j = zzc.zzaNi;
        localObject2 = j;
        Log.w((String)localObject1, (String)localObject2);
      }
    }
    for (;;)
    {
      return;
      localObject1 = (Intent)paramMessage.obj;
      zzp((Intent)localObject1);
    }
  }
  
  static void zzaM(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.iid.InstanceID");
    String str = paramContext.getPackageName();
    localIntent.setPackage(str);
    str = zzaMZ;
    localIntent.putExtra(str, "SYNC");
    paramContext.startService(localIntent);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    boolean bool;
    if (paramIntent != null)
    {
      localObject = "com.google.android.gms.iid.InstanceID";
      String str = paramIntent.getAction();
      bool = ((String)localObject).equals(str);
      if (!bool) {}
    }
    for (Object localObject = this.zzaMW.getBinder();; localObject = null)
    {
      return (IBinder)localObject;
      bool = false;
    }
  }
  
  public void onCreate()
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>("com.google.android.c2dm.intent.REGISTRATION");
    Object localObject = getPackageName();
    localIntentFilter.addCategory((String)localObject);
    localObject = this.zzaMX;
    registerReceiver((BroadcastReceiver)localObject, localIntentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
  }
  
  public void onDestroy()
  {
    BroadcastReceiver localBroadcastReceiver = this.zzaMX;
    unregisterReceiver(localBroadcastReceiver);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    int i = 2;
    zzhl(paramInt2);
    int j;
    if (paramIntent == null)
    {
      stop();
      j = i;
    }
    for (;;)
    {
      return j;
      try
      {
        Object localObject1 = paramIntent.getAction();
        String str = "com.google.android.gms.iid.InstanceID";
        boolean bool = str.equals(localObject1);
        if (bool)
        {
          k = Build.VERSION.SDK_INT;
          int m = 18;
          if (k <= m)
          {
            localObject1 = "GSF";
            localObject1 = paramIntent.getParcelableExtra((String)localObject1);
            localObject1 = (Intent)localObject1;
            if (localObject1 != null)
            {
              startService((Intent)localObject1);
              k = 1;
              stop();
              continue;
            }
          }
          zzp(paramIntent);
        }
        stop();
        localObject1 = paramIntent.getStringExtra("from");
        if (localObject1 != null) {
          GcmReceiver.completeWakefulIntent(paramIntent);
        }
        int k = i;
      }
      finally
      {
        stop();
      }
    }
  }
  
  public void onTokenRefresh() {}
  
  void stop()
  {
    try
    {
      int i = this.zzaNa + -1;
      this.zzaNa = i;
      i = this.zzaNa;
      if (i == 0)
      {
        i = this.zzaNb;
        stopSelf(i);
      }
      String str1 = "InstanceID";
      int j = 3;
      boolean bool = Log.isLoggable(str1, j);
      if (bool)
      {
        str1 = "InstanceID";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Stop ";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        int k = this.zzaNa;
        localObject2 = ((StringBuilder)localObject2).append(k);
        str2 = " ";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        k = this.zzaNb;
        localObject2 = ((StringBuilder)localObject2).append(k);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.d(str1, (String)localObject2);
      }
      return;
    }
    finally {}
  }
  
  public void zzal(boolean paramBoolean)
  {
    onTokenRefresh();
  }
  
  void zzhl(int paramInt)
  {
    try
    {
      int i = this.zzaNa + 1;
      this.zzaNa = i;
      i = this.zzaNb;
      if (paramInt > i) {
        this.zzaNb = paramInt;
      }
      return;
    }
    finally {}
  }
  
  public void zzp(Intent paramIntent)
  {
    int i = 3;
    boolean bool1 = true;
    Bundle localBundle1 = null;
    Object localObject1 = "subtype";
    Object localObject2 = paramIntent.getStringExtra((String)localObject1);
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (localObject2 == null)
    {
      localObject1 = InstanceID.getInstance(this);
      localObject3 = zzaMZ;
      localObject3 = paramIntent.getStringExtra((String)localObject3);
      localObject4 = paramIntent.getStringExtra("error");
      if (localObject4 == null)
      {
        localObject4 = paramIntent.getStringExtra("registration_id");
        if (localObject4 == null) {
          break label181;
        }
      }
      localObject3 = "InstanceID";
      boolean bool2 = Log.isLoggable((String)localObject3, i);
      if (bool2)
      {
        localObject3 = "InstanceID";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "Register result in service ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject2 = (String)localObject2;
        Log.d((String)localObject3, (String)localObject2);
      }
      localObject1 = ((InstanceID)localObject1).zzyC();
      ((zzc)localObject1).zzw(paramIntent);
    }
    for (;;)
    {
      return;
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      localObject3 = "subtype";
      ((Bundle)localObject1).putString((String)localObject3, (String)localObject2);
      localObject1 = InstanceID.zza(this, (Bundle)localObject1);
      break;
      label181:
      localObject4 = "InstanceID";
      boolean bool3 = Log.isLoggable((String)localObject4, i);
      if (bool3)
      {
        localObject4 = "InstanceID";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Service command ").append((String)localObject2).append(" ").append((String)localObject3).append(" ");
        Bundle localBundle2 = paramIntent.getExtras();
        localObject5 = localBundle2;
        Log.d((String)localObject4, (String)localObject5);
      }
      localObject4 = paramIntent.getStringExtra("unregistered");
      if (localObject4 != null)
      {
        localObject3 = ((InstanceID)localObject1).zzyB();
        if (localObject2 == null) {
          localObject2 = "";
        }
        ((zzd)localObject3).zzef((String)localObject2);
        localObject1 = ((InstanceID)localObject1).zzyC();
        ((zzc)localObject1).zzw(paramIntent);
      }
      else
      {
        localObject4 = zzaLH;
        localObject5 = paramIntent.getStringExtra("from");
        bool3 = ((String)localObject4).equals(localObject5);
        if (bool3)
        {
          localObject1 = ((InstanceID)localObject1).zzyB();
          ((zzd)localObject1).zzef((String)localObject2);
          zzal(false);
        }
        else
        {
          localObject4 = "RST";
          bool3 = ((String)localObject4).equals(localObject3);
          if (bool3)
          {
            ((InstanceID)localObject1).zzyA();
            zzal(bool1);
          }
          else
          {
            localObject4 = "RST_FULL";
            bool3 = ((String)localObject4).equals(localObject3);
            if (bool3)
            {
              localObject2 = ((InstanceID)localObject1).zzyB();
              boolean bool4 = ((zzd)localObject2).isEmpty();
              if (!bool4)
              {
                localObject1 = ((InstanceID)localObject1).zzyB();
                ((zzd)localObject1).zzyG();
                zzal(bool1);
              }
            }
            else
            {
              localObject4 = "SYNC";
              bool3 = ((String)localObject4).equals(localObject3);
              if (bool3)
              {
                localObject1 = ((InstanceID)localObject1).zzyB();
                ((zzd)localObject1).zzef((String)localObject2);
                zzal(false);
              }
              else
              {
                localObject1 = "PING";
                boolean bool5 = ((String)localObject1).equals(localObject3);
                if (bool5) {
                  try
                  {
                    localObject2 = GoogleCloudMessaging.getInstance(this);
                    localObject3 = zzaMY;
                    localObject4 = zzc.zzyF();
                    long l = 0L;
                    localBundle1 = paramIntent.getExtras();
                    ((GoogleCloudMessaging)localObject2).send((String)localObject3, (String)localObject4, l, localBundle1);
                  }
                  catch (IOException localIOException)
                  {
                    String str = "InstanceID";
                    localObject2 = "Failed to send ping response";
                    Log.w(str, (String)localObject2);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\InstanceIDListenerService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */