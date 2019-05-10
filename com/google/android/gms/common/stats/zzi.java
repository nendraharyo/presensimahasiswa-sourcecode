package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzlz;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zzmv;
import java.util.List;

public class zzi
{
  private static String TAG = "WakeLockTracker";
  private static zzi zzanY;
  private static Integer zzanv;
  
  static
  {
    zzi localzzi = new com/google/android/gms/common/stats/zzi;
    localzzi.<init>();
    zzanY = localzzi;
  }
  
  private static int getLogLevel()
  {
    for (;;)
    {
      try
      {
        boolean bool = zzmp.zzkr();
        if (!bool) {
          continue;
        }
        Object localObject = zzc.zzb.zzanz;
        localObject = ((zzlz)localObject).get();
        localObject = (Integer)localObject;
        i = ((Integer)localObject).intValue();
      }
      catch (SecurityException localSecurityException)
      {
        int i = zzd.LOG_LEVEL_OFF;
        continue;
      }
      return i;
      i = zzd.LOG_LEVEL_OFF;
    }
  }
  
  private static boolean zzav(Context paramContext)
  {
    Integer localInteger = zzanv;
    if (localInteger == null)
    {
      i = getLogLevel();
      localInteger = Integer.valueOf(i);
      zzanv = localInteger;
    }
    localInteger = zzanv;
    int i = localInteger.intValue();
    int k = zzd.LOG_LEVEL_OFF;
    if (i != k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localInteger = null;
    }
  }
  
  public static zzi zzrZ()
  {
    return zzanY;
  }
  
  public void zza(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, List paramList)
  {
    zza(paramContext, paramString1, paramInt1, paramString2, paramString3, paramInt2, paramList, 0L);
  }
  
  public void zza(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, List paramList, long paramLong)
  {
    boolean bool = zzav(paramContext);
    if (!bool) {}
    for (;;)
    {
      return;
      bool = TextUtils.isEmpty(paramString1);
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (bool)
      {
        localObject1 = TAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "missing wakeLock key. ";
        localObject2 = (String)localObject3 + paramString1;
        Log.e((String)localObject1, (String)localObject2);
      }
      else
      {
        long l1 = System.currentTimeMillis();
        int i = 7;
        if (i != paramInt1)
        {
          i = 8;
          if (i != paramInt1)
          {
            i = 10;
            if (i != paramInt1)
            {
              i = 11;
              if (i != paramInt1) {
                continue;
              }
            }
          }
        }
        localObject1 = new com/google/android/gms/common/stats/WakeLockEvent;
        long l2 = SystemClock.elapsedRealtime();
        int j = zzmv.zzax(paramContext);
        String str = paramContext.getPackageName();
        float f = zzmv.zzay(paramContext);
        ((WakeLockEvent)localObject1).<init>(l1, paramInt1, paramString2, paramInt2, paramList, paramString1, l2, j, paramString3, str, f, paramLong);
        try
        {
          localObject2 = new android/content/Intent;
          ((Intent)localObject2).<init>();
          localObject3 = zzd.zzanF;
          localObject2 = ((Intent)localObject2).setComponent((ComponentName)localObject3);
          localObject3 = "com.google.android.gms.common.stats.EXTRA_LOG_EVENT";
          localObject1 = ((Intent)localObject2).putExtra((String)localObject3, (Parcelable)localObject1);
          paramContext.startService((Intent)localObject1);
        }
        catch (Exception localException)
        {
          localObject2 = TAG;
          Log.wtf((String)localObject2, localException);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */