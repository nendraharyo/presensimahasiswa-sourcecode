package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgc;
import com.google.android.gms.internal.zzge.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzis;

public class zze
  extends zzge.zza
  implements ServiceConnection
{
  private final Activity mActivity;
  private zzb zzFC;
  zzh zzFD;
  private zzk zzFF;
  private Context zzFK;
  private zzgc zzFL;
  private zzf zzFM;
  private zzj zzFN;
  private String zzFO = null;
  
  public zze(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    zzh localzzh = zzh.zzy(this.mActivity.getApplicationContext());
    this.zzFD = localzzh;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1001;
    if (paramInt1 == i)
    {
      i = 0;
      Object localObject1 = null;
    }
    for (;;)
    {
      try
      {
        Object localObject4 = zzr.zzbM();
        int j = ((zzi)localObject4).zzd(paramIntent);
        int k = -1;
        if (paramInt2 == k)
        {
          zzr.zzbM();
          if (j == 0)
          {
            localObject5 = this.zzFF;
            localObject6 = this.zzFO;
            boolean bool = ((zzk)localObject5).zza((String)localObject6, paramInt2, paramIntent);
            if (bool) {
              i = 1;
            }
            localObject5 = this.zzFL;
            ((zzgc)localObject5).recordPlayBillingResolution(j);
            localObject4 = this.mActivity;
            ((Activity)localObject4).finish();
            localObject4 = this.zzFL;
            localObject4 = ((zzgc)localObject4).getProductId();
            zza((String)localObject4, i, paramInt2, paramIntent);
            return;
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject5;
        Object localObject6;
        Object localObject2 = "Fail to process purchase result.";
        zzin.zzaK((String)localObject2);
        localObject2 = this.mActivity;
        ((Activity)localObject2).finish();
        this.zzFO = null;
        continue;
      }
      finally
      {
        this.zzFO = null;
      }
      localObject5 = this.zzFD;
      localObject6 = this.zzFM;
      ((zzh)localObject5).zza((zzf)localObject6);
    }
  }
  
  public void onCreate()
  {
    Object localObject1 = GInAppPurchaseManagerInfoParcel.zzc(this.mActivity.getIntent());
    Object localObject2 = ((GInAppPurchaseManagerInfoParcel)localObject1).zzFy;
    this.zzFN = ((zzj)localObject2);
    localObject2 = ((GInAppPurchaseManagerInfoParcel)localObject1).zzrI;
    this.zzFF = ((zzk)localObject2);
    localObject2 = ((GInAppPurchaseManagerInfoParcel)localObject1).zzFw;
    this.zzFL = ((zzgc)localObject2);
    localObject2 = new com/google/android/gms/ads/internal/purchase/zzb;
    Context localContext = this.mActivity.getApplicationContext();
    ((zzb)localObject2).<init>(localContext);
    this.zzFC = ((zzb)localObject2);
    localObject1 = ((GInAppPurchaseManagerInfoParcel)localObject1).zzFx;
    this.zzFK = ((Context)localObject1);
    localObject1 = this.mActivity.getResources().getConfiguration();
    int i = ((Configuration)localObject1).orientation;
    int j = 2;
    if (i == j)
    {
      localObject1 = this.mActivity;
      localObject2 = zzr.zzbE();
      j = ((zzis)localObject2).zzhv();
      ((Activity)localObject1).setRequestedOrientation(j);
    }
    for (;;)
    {
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>("com.android.vending.billing.InAppBillingService.BIND");
      ((Intent)localObject1).setPackage("com.android.vending");
      this.mActivity.bindService((Intent)localObject1, this, 1);
      return;
      localObject1 = this.mActivity;
      localObject2 = zzr.zzbE();
      j = ((zzis)localObject2).zzhw();
      ((Activity)localObject1).setRequestedOrientation(j);
    }
  }
  
  public void onDestroy()
  {
    this.mActivity.unbindService(this);
    this.zzFC.destroy();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject1 = this.zzFC;
    ((zzb)localObject1).zzN(paramIBinder);
    for (;;)
    {
      try
      {
        localObject1 = this.zzFF;
        localObject1 = ((zzk)localObject1).zzfZ();
        this.zzFO = ((String)localObject1);
        localObject1 = this.zzFC;
        localObject2 = this.mActivity;
        localObject2 = ((Activity)localObject2).getPackageName();
        localObject3 = this.zzFL;
        localObject3 = ((zzgc)localObject3).getProductId();
        localObject4 = this.zzFO;
        localObject3 = ((zzb)localObject1).zzb((String)localObject2, (String)localObject3, (String)localObject4);
        localObject1 = "BUY_INTENT";
        localObject1 = ((Bundle)localObject3).getParcelable((String)localObject1);
        localObject5 = localObject1;
        localObject5 = (PendingIntent)localObject1;
        localObject2 = localObject5;
        if (localObject5 == null)
        {
          localObject1 = zzr.zzbM();
          int i = ((zzi)localObject1).zzd((Bundle)localObject3);
          localObject2 = this.zzFL;
          ((zzgc)localObject2).recordPlayBillingResolution(i);
          localObject2 = this.zzFL;
          localObject2 = ((zzgc)localObject2).getProductId();
          j = 0;
          localObject3 = null;
          localObject4 = null;
          zza((String)localObject2, false, i, null);
          localObject1 = this.mActivity;
          ((Activity)localObject1).finish();
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject3;
        Object localObject4;
        Object localObject5;
        int j;
        int k;
        Integer localInteger1;
        int m;
        Integer localInteger2;
        int n;
        Integer localInteger3;
        Object localObject2 = "Error when connecting in-app billing service";
        zzin.zzd((String)localObject2, localRemoteException);
        Activity localActivity = this.mActivity;
        localActivity.finish();
        continue;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        continue;
      }
      localObject1 = new com/google/android/gms/ads/internal/purchase/zzf;
      localObject3 = this.zzFL;
      localObject3 = ((zzgc)localObject3).getProductId();
      localObject4 = this.zzFO;
      ((zzf)localObject1).<init>((String)localObject3, (String)localObject4);
      this.zzFM = ((zzf)localObject1);
      localObject1 = this.zzFD;
      localObject3 = this.zzFM;
      ((zzh)localObject1).zzb((zzf)localObject3);
      localObject1 = this.mActivity;
      localObject2 = ((PendingIntent)localObject5).getIntentSender();
      j = 1001;
      localObject4 = new android/content/Intent;
      ((Intent)localObject4).<init>();
      k = 0;
      localInteger1 = null;
      localInteger1 = Integer.valueOf(0);
      k = localInteger1.intValue();
      m = 0;
      localInteger2 = null;
      localInteger2 = Integer.valueOf(0);
      m = localInteger2.intValue();
      n = 0;
      localInteger3 = null;
      localInteger3 = Integer.valueOf(0);
      n = localInteger3.intValue();
      ((Activity)localObject1).startIntentSenderForResult((IntentSender)localObject2, j, (Intent)localObject4, k, m, n);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    this.zzFC.destroy();
  }
  
  protected void zza(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent)
  {
    zzj localzzj = this.zzFN;
    if (localzzj != null)
    {
      localzzj = this.zzFN;
      zzf localzzf = this.zzFM;
      localzzj.zza(paramString, paramBoolean, paramInt, paramIntent, localzzf);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */