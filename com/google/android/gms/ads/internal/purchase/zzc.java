package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class zzc
  extends zzim
  implements ServiceConnection
{
  private Context mContext;
  private zzgh zzAK;
  private boolean zzFB;
  private zzb zzFC;
  private zzh zzFD;
  private List zzFE;
  private zzk zzFF;
  private final Object zzpV;
  
  public zzc(Context paramContext, zzgh paramzzgh, zzk paramzzk)
  {
    this(paramContext, paramzzgh, paramzzk, localzzb, localzzh);
  }
  
  zzc(Context paramContext, zzgh paramzzgh, zzk paramzzk, zzb paramzzb, zzh paramzzh)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzFB = false;
    this.zzFE = null;
    this.mContext = paramContext;
    this.zzAK = paramzzgh;
    this.zzFF = paramzzk;
    this.zzFC = paramzzb;
    this.zzFD = paramzzh;
    localObject = this.zzFD.zzg(10);
    this.zzFE = ((List)localObject);
  }
  
  private void zze(long paramLong)
  {
    boolean bool;
    do
    {
      bool = zzf(paramLong);
      if (!bool)
      {
        String str = "Timeout waiting for pending transaction to be processed.";
        zzin.v(str);
      }
      bool = this.zzFB;
    } while (!bool);
  }
  
  private boolean zzf(long paramLong)
  {
    long l1 = SystemClock.elapsedRealtime() - paramLong;
    long l2 = 60000L - l1;
    l1 = 0L;
    boolean bool1 = l2 < l1;
    boolean bool2;
    if (!bool1)
    {
      bool2 = false;
      Object localObject1 = null;
    }
    for (;;)
    {
      return bool2;
      try
      {
        Object localObject2 = this.zzpV;
        localObject2.wait(l2);
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          String str = "waitWithTimeout_lock interrupted";
          zzin.zzaK(str);
        }
      }
      bool2 = true;
    }
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzFC;
      ((zzb)localObject2).zzN(paramIBinder);
      zzfW();
      boolean bool = true;
      this.zzFB = bool;
      localObject2 = this.zzpV;
      localObject2.notify();
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    this.zzFC.destroy();
  }
  
  public void onStop()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = com.google.android.gms.common.stats.zzb.zzrP();
      Context localContext = this.mContext;
      ((com.google.android.gms.common.stats.zzb)localObject2).zza(localContext, this);
      localObject2 = this.zzFC;
      ((zzb)localObject2).destroy();
      return;
    }
  }
  
  protected void zza(zzf paramzzf, String paramString1, String paramString2)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    zzr.zzbM();
    localIntent.putExtra("RESPONSE_CODE", 0);
    zzr.zzbM();
    localIntent.putExtra("INAPP_PURCHASE_DATA", paramString1);
    zzr.zzbM();
    localIntent.putExtra("INAPP_DATA_SIGNATURE", paramString2);
    Handler localHandler = zzir.zzMc;
    zzc.1 local1 = new com/google/android/gms/ads/internal/purchase/zzc$1;
    local1.<init>(this, paramzzf, localIntent);
    localHandler.post(local1);
  }
  
  public void zzbr()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = new android/content/Intent;
      Object localObject4 = "com.android.vending.billing.InAppBillingService.BIND";
      ((Intent)localObject2).<init>((String)localObject4);
      localObject4 = "com.android.vending";
      ((Intent)localObject2).setPackage((String)localObject4);
      localObject4 = com.google.android.gms.common.stats.zzb.zzrP();
      Context localContext = this.mContext;
      int i = 1;
      ((com.google.android.gms.common.stats.zzb)localObject4).zza(localContext, (Intent)localObject2, this, i);
      long l = SystemClock.elapsedRealtime();
      zze(l);
      localObject2 = com.google.android.gms.common.stats.zzb.zzrP();
      localObject4 = this.mContext;
      ((com.google.android.gms.common.stats.zzb)localObject2).zza((Context)localObject4, this);
      localObject2 = this.zzFC;
      ((zzb)localObject2).destroy();
      return;
    }
  }
  
  protected void zzfW()
  {
    Object localObject1 = this.zzFE;
    boolean bool1 = ((List)localObject1).isEmpty();
    if (bool1) {
      return;
    }
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localObject1 = this.zzFE;
    Object localObject2 = ((List)localObject1).iterator();
    Object localObject3;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (zzf)((Iterator)localObject2).next();
      localObject3 = ((zzf)localObject1).zzFR;
      localHashMap.put(localObject3, localObject1);
    }
    bool1 = false;
    String str1;
    for (localObject1 = null;; localObject1 = str1)
    {
      localObject2 = this.zzFC;
      localObject3 = this.mContext.getPackageName();
      localObject1 = ((zzb)localObject2).zzi((String)localObject3, (String)localObject1);
      if (localObject1 == null) {}
      boolean bool3;
      do
      {
        do
        {
          int k;
          do
          {
            localObject1 = localHashMap.keySet();
            localObject2 = ((Set)localObject1).iterator();
            for (;;)
            {
              bool1 = ((Iterator)localObject2).hasNext();
              if (!bool1) {
                break;
              }
              localObject1 = (String)((Iterator)localObject2).next();
              localObject3 = this.zzFD;
              localObject1 = (zzf)localHashMap.get(localObject1);
              ((zzh)localObject3).zza((zzf)localObject1);
            }
            localObject2 = zzr.zzbM();
            k = ((zzi)localObject2).zzd((Bundle)localObject1);
          } while (k != 0);
          ArrayList localArrayList1 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
          ArrayList localArrayList2 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
          ArrayList localArrayList3 = ((Bundle)localObject1).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
          localObject2 = "INAPP_CONTINUATION_TOKEN";
          str1 = ((Bundle)localObject1).getString((String)localObject2);
          bool1 = false;
          localObject1 = null;
          int j;
          for (int m = 0;; m = j)
          {
            int i = localArrayList1.size();
            if (m >= i) {
              break;
            }
            localObject1 = localArrayList1.get(m);
            boolean bool2 = localHashMap.containsKey(localObject1);
            if (bool2)
            {
              localObject1 = (String)localArrayList1.get(m);
              localObject2 = (String)localArrayList2.get(m);
              localObject3 = (String)localArrayList3.get(m);
              zzf localzzf = (zzf)localHashMap.get(localObject1);
              String str2 = zzr.zzbM().zzaq((String)localObject2);
              String str3 = localzzf.zzFQ;
              boolean bool4 = str3.equals(str2);
              if (bool4)
              {
                zza(localzzf, (String)localObject2, (String)localObject3);
                localHashMap.remove(localObject1);
              }
            }
            j = m + 1;
          }
        } while (str1 == null);
        bool3 = localHashMap.isEmpty();
      } while (bool3);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */