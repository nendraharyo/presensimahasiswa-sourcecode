package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zzg;

public class CampaignTrackingService
  extends Service
{
  private static Boolean zzOO;
  private Handler mHandler;
  
  private Handler getHandler()
  {
    Handler localHandler = this.mHandler;
    if (localHandler == null)
    {
      localHandler = new android/os/Handler;
      Looper localLooper = getMainLooper();
      localHandler.<init>(localLooper);
      this.mHandler = localHandler;
    }
    return localHandler;
  }
  
  public static boolean zzZ(Context paramContext)
  {
    zzx.zzz(paramContext);
    Object localObject = zzOO;
    boolean bool;
    if (localObject != null)
    {
      localObject = zzOO;
      bool = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool;
      localObject = CampaignTrackingService.class;
      bool = zzam.zza(paramContext, (Class)localObject);
      Boolean localBoolean = Boolean.valueOf(bool);
      zzOO = localBoolean;
    }
  }
  
  /* Error */
  private void zziz()
  {
    // Byte code:
    //   0: getstatic 53	com/google/android/gms/analytics/CampaignTrackingReceiver:zzqy	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: getstatic 57	com/google/android/gms/analytics/CampaignTrackingReceiver:zzOM	Lcom/google/android/gms/internal/zzrp;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull +16 -> 27
    //   14: aload_2
    //   15: invokevirtual 62	com/google/android/gms/internal/zzrp:isHeld	()Z
    //   18: istore_3
    //   19: iload_3
    //   20: ifeq +7 -> 27
    //   23: aload_2
    //   24: invokevirtual 65	com/google/android/gms/internal/zzrp:release	()V
    //   27: aload_1
    //   28: monitorexit
    //   29: return
    //   30: astore_2
    //   31: aload_1
    //   32: monitorexit
    //   33: aload_2
    //   34: athrow
    //   35: astore_2
    //   36: goto -7 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	CampaignTrackingService
    //   9	15	2	localzzrp	com.google.android.gms.internal.zzrp
    //   30	4	2	localObject2	Object
    //   35	1	2	localSecurityException	SecurityException
    //   18	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	9	30	finally
    //   14	18	30	finally
    //   23	27	30	finally
    //   27	29	30	finally
    //   31	33	30	finally
    //   0	3	35	java/lang/SecurityException
    //   4	6	35	java/lang/SecurityException
    //   33	35	35	java/lang/SecurityException
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    zzf.zzaa(this).zzjm().zzbd("CampaignTrackingService is starting up");
  }
  
  public void onDestroy()
  {
    zzf.zzaa(this).zzjm().zzbd("CampaignTrackingService is shutting down");
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    int i = 2;
    zziz();
    Object localObject1 = zzf.zzaa(this);
    zzaf localzzaf = ((zzf)localObject1).zzjm();
    boolean bool1 = false;
    Object localObject2 = null;
    Object localObject3 = ((zzf)localObject1).zzjn();
    boolean bool2 = ((zzr)localObject3).zzkr();
    if (bool2)
    {
      localObject3 = "Unexpected installation campaign (package side)";
      localzzaf.zzbh((String)localObject3);
    }
    for (;;)
    {
      localObject3 = getHandler();
      boolean bool3 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool3) {
        break;
      }
      localObject2 = ((zzf)localObject1).zzjn();
      bool1 = ((zzr)localObject2).zzkr();
      if (!bool1)
      {
        localObject2 = "No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra";
        localzzaf.zzbg((String)localObject2);
      }
      localObject2 = ((zzf)localObject1).zzjo();
      localObject1 = new com/google/android/gms/analytics/CampaignTrackingService$1;
      ((CampaignTrackingService.1)localObject1).<init>(this, localzzaf, (Handler)localObject3, paramInt2);
      ((zzg)localObject2).zzf((Runnable)localObject1);
      return i;
      localObject2 = paramIntent.getStringExtra("referrer");
    }
    Object localObject4 = ((zzf)localObject1).zzjn();
    int j = ((zzr)localObject4).zzkv();
    int k = ((String)localObject2).length();
    if (k <= j) {}
    for (;;)
    {
      Integer localInteger1 = Integer.valueOf(paramInt2);
      localzzaf.zza("CampaignTrackingService called. startId, campaign", localInteger1, localObject2);
      localObject1 = ((zzf)localObject1).zziH();
      localObject4 = new com/google/android/gms/analytics/CampaignTrackingService$2;
      ((CampaignTrackingService.2)localObject4).<init>(this, localzzaf, (Handler)localObject3, paramInt2);
      ((zzb)localObject1).zza((String)localObject2, (Runnable)localObject4);
      break;
      int m = ((String)localObject2).length();
      Integer localInteger2 = Integer.valueOf(m);
      Integer localInteger3 = Integer.valueOf(j);
      localzzaf.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", localInteger2, localInteger3);
      k = 0;
      localInteger1 = null;
      localObject2 = ((String)localObject2).substring(0, j);
    }
  }
  
  protected void zza(zzaf paramzzaf, Handler paramHandler, int paramInt)
  {
    CampaignTrackingService.3 local3 = new com/google/android/gms/analytics/CampaignTrackingService$3;
    local3.<init>(this, paramInt, paramzzaf);
    paramHandler.post(local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\CampaignTrackingService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */