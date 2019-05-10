package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class zza
  implements ServiceConnection
{
  private final BlockingQueue zzafA;
  boolean zzafz = false;
  
  public zza()
  {
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    this.zzafA = localLinkedBlockingQueue;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.zzafA.add(paramIBinder);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
  
  public IBinder zzoJ()
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject == localLooper)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("BlockingServiceConnection.getService() called on main thread");
      throw ((Throwable)localObject);
    }
    boolean bool = this.zzafz;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    this.zzafz = true;
    return (IBinder)this.zzafA.take();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */