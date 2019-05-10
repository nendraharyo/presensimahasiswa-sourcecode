package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

public class zzv
  extends zzd
{
  private boolean zzRG;
  private boolean zzRH;
  private AlarmManager zzRI;
  
  protected zzv(zzf paramzzf)
  {
    super(paramzzf);
    AlarmManager localAlarmManager = (AlarmManager)getContext().getSystemService("alarm");
    this.zzRI = localAlarmManager;
  }
  
  private PendingIntent zzld()
  {
    Intent localIntent = new android/content/Intent;
    Context localContext = getContext();
    localIntent.<init>(localContext, AnalyticsReceiver.class);
    localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    return PendingIntent.getBroadcast(getContext(), 0, localIntent, 0);
  }
  
  public void cancel()
  {
    zzjv();
    this.zzRH = false;
    AlarmManager localAlarmManager = this.zzRI;
    PendingIntent localPendingIntent = zzld();
    localAlarmManager.cancel(localPendingIntent);
  }
  
  public boolean zzbw()
  {
    return this.zzRH;
  }
  
  protected void zziJ()
  {
    try
    {
      Object localObject1 = this.zzRI;
      Object localObject2 = zzld();
      ((AlarmManager)localObject1).cancel((PendingIntent)localObject2);
      localObject1 = zzjn();
      long l1 = ((zzr)localObject1).zzkA();
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (bool)
      {
        localObject1 = getContext();
        localObject1 = ((Context)localObject1).getPackageManager();
        localObject2 = new android/content/ComponentName;
        Context localContext = getContext();
        Class localClass = AnalyticsReceiver.class;
        ((ComponentName)localObject2).<init>(localContext, localClass);
        int i = 2;
        localObject1 = ((PackageManager)localObject1).getReceiverInfo((ComponentName)localObject2, i);
        if (localObject1 != null)
        {
          bool = ((ActivityInfo)localObject1).enabled;
          if (bool)
          {
            localObject1 = "Receiver registered. Using alarm for local dispatch.";
            zzbd((String)localObject1);
            bool = true;
            this.zzRG = bool;
          }
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public boolean zzlb()
  {
    return this.zzRG;
  }
  
  public void zzlc()
  {
    long l1 = 0L;
    zzjv();
    boolean bool1 = zzlb();
    String str = "Receiver not registered";
    zzx.zza(bool1, str);
    Object localObject = zzjn();
    long l2 = ((zzr)localObject).zzkA();
    boolean bool2 = l2 < l1;
    if (bool2)
    {
      cancel();
      zzmq localzzmq = zzjl();
      long l3 = localzzmq.elapsedRealtime() + l2;
      bool1 = true;
      this.zzRH = bool1;
      localObject = this.zzRI;
      int i = 2;
      PendingIntent localPendingIntent = zzld();
      ((AlarmManager)localObject).setInexactRepeating(i, l3, l1, localPendingIntent);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */