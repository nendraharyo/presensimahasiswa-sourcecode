package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class AdvertisingIdClient$zza
  extends Thread
{
  private WeakReference zzoY;
  private long zzoZ;
  CountDownLatch zzpa;
  boolean zzpb;
  
  public AdvertisingIdClient$zza(AdvertisingIdClient paramAdvertisingIdClient, long paramLong)
  {
    Object localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramAdvertisingIdClient);
    this.zzoY = ((WeakReference)localObject);
    this.zzoZ = paramLong;
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    this.zzpa = ((CountDownLatch)localObject);
    this.zzpb = false;
    start();
  }
  
  private void disconnect()
  {
    AdvertisingIdClient localAdvertisingIdClient = (AdvertisingIdClient)this.zzoY.get();
    if (localAdvertisingIdClient != null)
    {
      localAdvertisingIdClient.finish();
      boolean bool = true;
      this.zzpb = bool;
    }
  }
  
  public void cancel()
  {
    this.zzpa.countDown();
  }
  
  public void run()
  {
    try
    {
      CountDownLatch localCountDownLatch = this.zzpa;
      long l = this.zzoZ;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      boolean bool = localCountDownLatch.await(l, localTimeUnit);
      if (!bool) {
        disconnect();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        disconnect();
      }
    }
  }
  
  public boolean zzaK()
  {
    return this.zzpb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\identifier\AdvertisingIdClient$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */