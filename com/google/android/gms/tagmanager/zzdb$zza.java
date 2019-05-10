package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzdb$zza
  implements Runnable
{
  private final long zzCv;
  private final long zzaNY;
  private final String zzblw;
  private final String zzblx;
  private final long zzbly;
  private long zzblz;
  
  zzdb$zza(zzdb paramzzdb, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    this.zzblw = paramString1;
    this.zzblx = paramString2;
    this.zzaNY = paramLong1;
    this.zzbly = paramLong2;
    long l = System.currentTimeMillis();
    this.zzCv = l;
  }
  
  public void run()
  {
    long l1 = this.zzbly;
    long l2 = 0L;
    boolean bool = l1 < l2;
    Object localObject;
    String str1;
    if (bool)
    {
      l1 = this.zzblz;
      l2 = this.zzbly;
      bool = l1 < l2;
      if (!bool)
      {
        localObject = "0";
        str1 = this.zzblx;
        bool = ((String)localObject).equals(str1);
        if (!bool)
        {
          localObject = zzdb.zza(this.zzblA);
          str1 = this.zzblx;
          ((Set)localObject).remove(str1);
        }
      }
    }
    for (;;)
    {
      return;
      l1 = this.zzblz;
      l2 = 1L;
      l1 += l2;
      this.zzblz = l1;
      bool = zzcH();
      if (bool)
      {
        l1 = System.currentTimeMillis();
        DataLayer localDataLayer = zzdb.zzb(this.zzblA);
        int j = 16;
        Object[] arrayOfObject = new Object[j];
        arrayOfObject[0] = "event";
        String str2 = this.zzblw;
        arrayOfObject[1] = str2;
        arrayOfObject[2] = "gtm.timerInterval";
        str2 = String.valueOf(this.zzaNY);
        arrayOfObject[3] = str2;
        arrayOfObject[4] = "gtm.timerLimit";
        str2 = String.valueOf(this.zzbly);
        arrayOfObject[5] = str2;
        arrayOfObject[6] = "gtm.timerStartTime";
        str2 = String.valueOf(this.zzCv);
        arrayOfObject[7] = str2;
        arrayOfObject[8] = "gtm.timerCurrentTime";
        str2 = String.valueOf(l1);
        arrayOfObject[9] = str2;
        str2 = "gtm.timerElapsedTime";
        arrayOfObject[10] = str2;
        int k = 11;
        long l3 = this.zzCv;
        l1 -= l3;
        localObject = String.valueOf(l1);
        arrayOfObject[k] = localObject;
        arrayOfObject[12] = "gtm.timerEventNumber";
        long l4 = this.zzblz;
        str1 = String.valueOf(l4);
        arrayOfObject[13] = str1;
        arrayOfObject[14] = "gtm.triggers";
        int i = 15;
        str1 = this.zzblx;
        arrayOfObject[i] = str1;
        localObject = DataLayer.mapOf(arrayOfObject);
        localDataLayer.push((Map)localObject);
      }
      localObject = zzdb.zzc(this.zzblA);
      l2 = this.zzaNY;
      ((Handler)localObject).postDelayed(this, l2);
    }
  }
  
  protected boolean zzcH()
  {
    Object localObject = this.zzblA;
    boolean bool1 = zzdb.zzd((zzdb)localObject);
    if (bool1)
    {
      localObject = this.zzblA;
      bool1 = zzdb.zze((zzdb)localObject);
    }
    for (;;)
    {
      return bool1;
      localObject = (ActivityManager)zzdb.zzf(this.zzblA).getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)zzdb.zzf(this.zzblA).getSystemService("keyguard");
      PowerManager localPowerManager = (PowerManager)zzdb.zzf(this.zzblA).getSystemService("power");
      localObject = ((ActivityManager)localObject).getRunningAppProcesses();
      Iterator localIterator = ((List)localObject).iterator();
      do
      {
        do
        {
          int j;
          int i;
          do
          {
            int k;
            do
            {
              bool1 = localIterator.hasNext();
              if (!bool1) {
                break;
              }
              localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
              j = Process.myPid();
              k = ((ActivityManager.RunningAppProcessInfo)localObject).pid;
            } while (j != k);
            i = ((ActivityManager.RunningAppProcessInfo)localObject).importance;
            j = 100;
          } while (i != j);
          bool2 = localKeyguardManager.inKeyguardRestrictedInputMode();
        } while (bool2);
        bool2 = localPowerManager.isScreenOn();
      } while (!bool2);
      boolean bool2 = true;
      continue;
      bool2 = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzdb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */