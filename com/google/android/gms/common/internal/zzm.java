package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.stats.zzb;
import java.util.HashMap;

final class zzm
  extends zzl
  implements Handler.Callback
{
  private final Handler mHandler;
  private final HashMap zzalZ;
  private final zzb zzama;
  private final long zzamb;
  private final Context zzsa;
  
  zzm(Context paramContext)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzalZ = ((HashMap)localObject);
    localObject = paramContext.getApplicationContext();
    this.zzsa = ((Context)localObject);
    localObject = new android/os/Handler;
    Looper localLooper = paramContext.getMainLooper();
    ((Handler)localObject).<init>(localLooper, this);
    this.mHandler = ((Handler)localObject);
    localObject = zzb.zzrP();
    this.zzama = ((zzb)localObject);
    this.zzamb = 5000L;
  }
  
  private boolean zza(zzm.zza paramzza, ServiceConnection paramServiceConnection, String paramString)
  {
    Object localObject1 = "ServiceConnection must not be null";
    zzx.zzb(paramServiceConnection, localObject1);
    for (;;)
    {
      Object localObject3;
      Object localObject4;
      synchronized (this.zzalZ)
      {
        localObject1 = this.zzalZ;
        localObject1 = ((HashMap)localObject1).get(paramzza);
        localObject1 = (zzm.zzb)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/common/internal/zzm$zzb;
          ((zzm.zzb)localObject1).<init>(this, paramzza);
          ((zzm.zzb)localObject1).zza(paramServiceConnection, paramString);
          ((zzm.zzb)localObject1).zzcH(paramString);
          localObject3 = this.zzalZ;
          ((HashMap)localObject3).put(paramzza, localObject1);
          boolean bool1 = ((zzm.zzb)localObject1).isBound();
          return bool1;
        }
        localObject3 = this.mHandler;
        localObject4 = null;
        ((Handler)localObject3).removeMessages(0, localObject1);
        boolean bool2 = ((zzm.zzb)localObject1).zza(paramServiceConnection);
        if (bool2)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = "Trying to bind a GmsServiceConnection that was already connected before.  config=";
          localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
          localObject3 = ((StringBuilder)localObject3).append(paramzza);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((IllegalStateException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      ((zzm.zzb)localObject2).zza(paramServiceConnection, paramString);
      int i = ((zzm.zzb)localObject2).getState();
      switch (i)
      {
      default: 
        break;
      case 1: 
        localObject3 = ((zzm.zzb)localObject2).getComponentName();
        localObject4 = ((zzm.zzb)localObject2).getBinder();
        paramServiceConnection.onServiceConnected((ComponentName)localObject3, (IBinder)localObject4);
        break;
      case 2: 
        ((zzm.zzb)localObject2).zzcH(paramString);
      }
    }
  }
  
  private void zzb(zzm.zza paramzza, ServiceConnection paramServiceConnection, String paramString)
  {
    Object localObject1 = "ServiceConnection must not be null";
    zzx.zzb(paramServiceConnection, localObject1);
    Object localObject4;
    String str;
    synchronized (this.zzalZ)
    {
      localObject1 = this.zzalZ;
      localObject1 = ((HashMap)localObject1).get(paramzza);
      localObject1 = (zzm.zzb)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        str = "Nonexistent connection status for service config: ";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).append(paramzza);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((IllegalStateException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    boolean bool = ((zzm.zzb)localObject2).zza(paramServiceConnection);
    Object localObject3;
    if (!bool)
    {
      localObject3 = new java/lang/IllegalStateException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      str = "Trying to unbind a GmsServiceConnection  that was not bound before.  config=";
      localObject4 = ((StringBuilder)localObject4).append(str);
      localObject4 = ((StringBuilder)localObject4).append(paramzza);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((IllegalStateException)localObject3).<init>((String)localObject4);
      throw ((Throwable)localObject3);
    }
    ((zzm.zzb)localObject3).zzb(paramServiceConnection, paramString);
    bool = ((zzm.zzb)localObject3).zzqT();
    if (bool)
    {
      localObject4 = this.mHandler;
      str = null;
      localObject3 = ((Handler)localObject4).obtainMessage(0, localObject3);
      localObject4 = this.mHandler;
      long l = this.zzamb;
      ((Handler)localObject4).sendMessageDelayed((Message)localObject3, l);
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    switch (i)
    {
    default: 
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      localObject1 = (zzm.zzb)paramMessage.obj;
      synchronized (this.zzalZ)
      {
        boolean bool = ((zzm.zzb)localObject1).zzqT();
        if (bool)
        {
          bool = ((zzm.zzb)localObject1).isBound();
          if (bool)
          {
            localObject3 = "GmsClientSupervisor";
            ((zzm.zzb)localObject1).zzcI((String)localObject3);
          }
          Object localObject3 = this.zzalZ;
          localObject1 = zzm.zzb.zza((zzm.zzb)localObject1);
          ((HashMap)localObject3).remove(localObject1);
        }
        int j = 1;
      }
    }
  }
  
  public boolean zza(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    zzm.zza localzza = new com/google/android/gms/common/internal/zzm$zza;
    localzza.<init>(paramComponentName);
    return zza(localzza, paramServiceConnection, paramString);
  }
  
  public boolean zza(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    zzm.zza localzza = new com/google/android/gms/common/internal/zzm$zza;
    localzza.<init>(paramString1);
    return zza(localzza, paramServiceConnection, paramString2);
  }
  
  public void zzb(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    zzm.zza localzza = new com/google/android/gms/common/internal/zzm$zza;
    localzza.<init>(paramComponentName);
    zzb(localzza, paramServiceConnection, paramString);
  }
  
  public void zzb(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    zzm.zza localzza = new com/google/android/gms/common/internal/zzm$zza;
    localzza.<init>(paramString1);
    zzb(localzza, paramServiceConnection, paramString2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */