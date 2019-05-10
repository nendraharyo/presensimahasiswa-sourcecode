package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.common.zza;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzat.zza;
import java.io.IOException;

public class AdvertisingIdClient
{
  private final Context mContext;
  zza zzoS;
  zzat zzoT;
  boolean zzoU;
  Object zzoV;
  AdvertisingIdClient.zza zzoW;
  final long zzoX;
  
  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L);
  }
  
  public AdvertisingIdClient(Context paramContext, long paramLong)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzoV = localObject;
    zzx.zzz(paramContext);
    this.mContext = paramContext;
    this.zzoU = false;
    this.zzoX = paramLong;
  }
  
  public static AdvertisingIdClient.Info getAdvertisingIdInfo(Context paramContext)
  {
    AdvertisingIdClient localAdvertisingIdClient = new com/google/android/gms/ads/identifier/AdvertisingIdClient;
    long l = -1;
    localAdvertisingIdClient.<init>(paramContext, l);
    AdvertisingIdClient.Info localInfo = null;
    try
    {
      localAdvertisingIdClient.zzb(false);
      localInfo = localAdvertisingIdClient.getInfo();
      return localInfo;
    }
    finally
    {
      localAdvertisingIdClient.finish();
    }
  }
  
  public static void setShouldSkipGmsCoreVersionCheck(boolean paramBoolean) {}
  
  static zzat zza(Context paramContext, zza paramzza)
  {
    IOException localIOException2;
    try
    {
      IBinder localIBinder = paramzza.zzoJ();
      return zzat.zza.zzb(localIBinder);
    }
    catch (InterruptedException localInterruptedException)
    {
      IOException localIOException1 = new java/io/IOException;
      localIOException1.<init>("Interrupted exception");
      throw localIOException1;
    }
    finally
    {
      localIOException2 = new java/io/IOException;
      localIOException2.<init>(localThrowable);
    }
  }
  
  private void zzaJ()
  {
    synchronized (this.zzoV)
    {
      AdvertisingIdClient.zza localzza = this.zzoW;
      if (localzza != null)
      {
        localzza = this.zzoW;
        localzza.cancel();
      }
      try
      {
        localzza = this.zzoW;
        localzza.join();
      }
      catch (InterruptedException localInterruptedException)
      {
        long l1;
        long l2;
        boolean bool;
        for (;;) {}
      }
      l1 = this.zzoX;
      l2 = 0L;
      bool = l1 < l2;
      if (bool)
      {
        localzza = new com/google/android/gms/ads/identifier/AdvertisingIdClient$zza;
        l1 = this.zzoX;
        localzza.<init>(this, l1);
        this.zzoW = localzza;
      }
      return;
    }
  }
  
  static zza zzp(Context paramContext)
  {
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      localObject3 = "com.android.vending";
      localObject4 = null;
      ((PackageManager)localObject1).getPackageInfo((String)localObject3, 0);
      localObject1 = zzc.zzoK();
      int i = ((zzc)localObject1).isGooglePlayServicesAvailable(paramContext);
      switch (i)
      {
      default: 
        localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("Google Play services not available");
        throw ((Throwable)localObject1);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject2 = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
      ((GooglePlayServicesNotAvailableException)localObject2).<init>(9);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new com/google/android/gms/common/zza;
    ((zza)localObject2).<init>();
    Object localObject3 = new android/content/Intent;
    ((Intent)localObject3).<init>("com.google.android.gms.ads.identifier.service.START");
    Object localObject4 = "com.google.android.gms";
    ((Intent)localObject3).setPackage((String)localObject4);
    try
    {
      localObject4 = zzb.zzrP();
      int j = 1;
      boolean bool = ((zzb)localObject4).zza(paramContext, (Intent)localObject3, (ServiceConnection)localObject2, j);
      if (bool) {
        return (zza)localObject2;
      }
    }
    finally
    {
      localObject3 = new java/io/IOException;
      ((IOException)localObject3).<init>(localThrowable);
    }
    IOException localIOException = new java/io/IOException;
    localIOException.<init>("Connection failure");
    throw localIOException;
  }
  
  protected void finalize()
  {
    finish();
    super.finalize();
  }
  
  public void finish()
  {
    Object localObject1 = "Calling this from your main thread can lead to deadlock";
    zzx.zzcE((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = this.mContext;
        if (localObject1 != null)
        {
          localObject1 = this.zzoS;
          if (localObject1 != null) {}
        }
        else
        {
          return;
        }
      }
      finally {}
      try
      {
        bool = this.zzoU;
        if (bool)
        {
          localObject1 = zzb.zzrP();
          localObject3 = this.mContext;
          localObject4 = this.zzoS;
          ((zzb)localObject1).zza((Context)localObject3, (ServiceConnection)localObject4);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject3 = "AdvertisingIdClient";
        localObject4 = "AdvertisingIdClient unbindService failed.";
        Log.i((String)localObject3, (String)localObject4, localIllegalArgumentException);
        continue;
      }
      boolean bool = false;
      localObject1 = null;
      this.zzoU = false;
      bool = false;
      localObject1 = null;
      this.zzoT = null;
      bool = false;
      localObject1 = null;
      this.zzoS = null;
    }
  }
  
  public AdvertisingIdClient.Info getInfo()
  {
    Object localObject1 = "Calling this from your main thread can lead to deadlock";
    zzx.zzcE((String)localObject1);
    Object localObject6;
    try
    {
      bool1 = this.zzoU;
      if (bool1) {
        break label126;
      }
      synchronized (this.zzoV)
      {
        localObject1 = this.zzoW;
        if (localObject1 != null)
        {
          localObject1 = this.zzoW;
          bool1 = ((AdvertisingIdClient.zza)localObject1).zzaK();
          if (bool1) {}
        }
        else
        {
          localObject1 = new java/io/IOException;
          localObject6 = "AdvertisingIdClient is not connected.";
          ((IOException)localObject1).<init>((String)localObject6);
          throw ((Throwable)localObject1);
        }
      }
    }
    finally {}
    boolean bool1 = false;
    IOException localIOException1 = null;
    try
    {
      zzb(false);
      bool1 = this.zzoU;
      if (!bool1)
      {
        localIOException1 = new java/io/IOException;
        ??? = "AdvertisingIdClient cannot reconnect.";
        localIOException1.<init>((String)???);
        throw localIOException1;
      }
    }
    catch (Exception localException)
    {
      ??? = new java/io/IOException;
      localObject6 = "AdvertisingIdClient cannot reconnect.";
      ((IOException)???).<init>((String)localObject6, localException);
      throw ((Throwable)???);
    }
    label126:
    Object localObject4 = this.zzoS;
    zzx.zzz(localObject4);
    localObject4 = this.zzoT;
    zzx.zzz(localObject4);
    try
    {
      localObject4 = new com/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
      ??? = this.zzoT;
      ??? = ((zzat)???).getId();
      localObject6 = this.zzoT;
      boolean bool2 = true;
      boolean bool3 = ((zzat)localObject6).zzc(bool2);
      ((AdvertisingIdClient.Info)localObject4).<init>((String)???, bool3);
      zzaJ();
      return (AdvertisingIdClient.Info)localObject4;
    }
    catch (RemoteException localRemoteException)
    {
      ??? = "AdvertisingIdClient";
      localObject6 = "GMS remote exception ";
      Log.i((String)???, (String)localObject6, localRemoteException);
      IOException localIOException2 = new java/io/IOException;
      ??? = "Remote exception";
      localIOException2.<init>((String)???);
      throw localIOException2;
    }
  }
  
  public void start()
  {
    zzb(true);
  }
  
  protected void zzb(boolean paramBoolean)
  {
    Object localObject1 = "Calling this from your main thread can lead to deadlock";
    zzx.zzcE((String)localObject1);
    try
    {
      boolean bool = this.zzoU;
      if (bool) {
        finish();
      }
      localObject1 = this.mContext;
      localObject1 = zzp((Context)localObject1);
      this.zzoS = ((zza)localObject1);
      localObject1 = this.mContext;
      zza localzza = this.zzoS;
      localObject1 = zza((Context)localObject1, localzza);
      this.zzoT = ((zzat)localObject1);
      bool = true;
      this.zzoU = bool;
      if (paramBoolean) {
        zzaJ();
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\identifier\AdvertisingIdClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */