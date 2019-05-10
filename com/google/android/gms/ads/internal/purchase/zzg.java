package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgg.zza;
import com.google.android.gms.internal.zzin;

public final class zzg
  extends zzgg.zza
  implements ServiceConnection
{
  private Context mContext;
  zzb zzFC;
  private String zzFI;
  private zzf zzFM;
  private boolean zzFS = false;
  private int zzFT;
  private Intent zzFU;
  
  public zzg(Context paramContext, String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, zzf paramzzf)
  {
    this.zzFI = paramString;
    this.zzFT = paramInt;
    this.zzFU = paramIntent;
    this.zzFS = paramBoolean;
    this.mContext = paramContext;
    this.zzFM = paramzzf;
  }
  
  public void finishPurchase()
  {
    Object localObject1 = zzr.zzbM();
    Object localObject2 = this.zzFU;
    int i = ((zzi)localObject1).zzd((Intent)localObject2);
    int j = this.zzFT;
    int k = -1;
    if ((j != k) || (i != 0)) {}
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/ads/internal/purchase/zzb;
      localObject2 = this.mContext;
      ((zzb)localObject1).<init>((Context)localObject2);
      this.zzFC = ((zzb)localObject1);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>("com.android.vending.billing.InAppBillingService.BIND");
      ((Intent)localObject1).setPackage("com.android.vending");
      localObject2 = com.google.android.gms.common.stats.zzb.zzrP();
      Context localContext = this.mContext;
      int m = 1;
      ((com.google.android.gms.common.stats.zzb)localObject2).zza(localContext, (Intent)localObject1, this, m);
    }
  }
  
  public String getProductId()
  {
    return this.zzFI;
  }
  
  public Intent getPurchaseData()
  {
    return this.zzFU;
  }
  
  public int getResultCode()
  {
    return this.zzFT;
  }
  
  public boolean isVerified()
  {
    return this.zzFS;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    zzin.zzaJ("In-app billing service connected.");
    this.zzFC.zzN(paramIBinder);
    Object localObject1 = zzr.zzbM();
    Object localObject2 = this.zzFU;
    localObject1 = ((zzi)localObject1).zze((Intent)localObject2);
    localObject2 = zzr.zzbM();
    localObject1 = ((zzi)localObject2).zzar((String)localObject1);
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject2 = this.zzFC;
      String str = this.mContext.getPackageName();
      int i = ((zzb)localObject2).zzh(str, (String)localObject1);
      if (i == 0)
      {
        localObject1 = zzh.zzy(this.mContext);
        localObject2 = this.zzFM;
        ((zzh)localObject1).zza((zzf)localObject2);
      }
      localObject1 = com.google.android.gms.common.stats.zzb.zzrP();
      localObject2 = this.mContext;
      ((com.google.android.gms.common.stats.zzb)localObject1).zza((Context)localObject2, this);
      localObject1 = this.zzFC;
      ((zzb)localObject1).destroy();
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    this.zzFC.destroy();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */