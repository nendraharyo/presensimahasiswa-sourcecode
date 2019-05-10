package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;

public class zzhu
  extends zzim
  implements zzhv, zzhy
{
  private final Context mContext;
  private final String zzCd;
  private final zzif.zza zzGd;
  private int zzGu = 3;
  private final zzia zzKB;
  private final zzhy zzKC;
  private final String zzKD;
  private final String zzKE;
  private int zzKF = 0;
  private final Object zzpV;
  private final String zzrG;
  
  public zzhu(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, zzif.zza paramzza, zzia paramzzia, zzhy paramzzhy)
  {
    this.mContext = paramContext;
    this.zzCd = paramString1;
    this.zzrG = paramString2;
    this.zzKD = paramString3;
    this.zzKE = paramString4;
    this.zzGd = paramzza;
    this.zzKB = paramzzia;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzKC = paramzzhy;
  }
  
  private void zza(AdRequestParcel paramAdRequestParcel, zzey paramzzey)
  {
    String str1 = "com.google.ads.mediation.admob.AdMobAdapter";
    for (;;)
    {
      try
      {
        str3 = this.zzCd;
        boolean bool = str1.equals(str3);
        if (bool)
        {
          str1 = this.zzKD;
          str3 = this.zzKE;
          paramzzey.zza(paramAdRequestParcel, str1, str3);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Fail to load ad from adapter.", localRemoteException);
        String str2 = this.zzCd;
        String str3 = null;
        zza(str2, 0);
        continue;
      }
      str1 = this.zzKD;
      paramzzey.zzb(paramAdRequestParcel, str1);
    }
  }
  
  private void zzk(long paramLong)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        int i = this.zzKF;
        if (i != 0) {
          return;
        }
        boolean bool = zzf(paramLong);
        if (bool) {}
      }
    }
  }
  
  public void onStop() {}
  
  public void zzN(int paramInt)
  {
    String str = this.zzCd;
    zza(str, 0);
  }
  
  public void zza(String paramString, int paramInt)
  {
    Object localObject1 = this.zzpV;
    int i = 2;
    try
    {
      this.zzKF = i;
      this.zzGu = paramInt;
      Object localObject2 = this.zzpV;
      localObject2.notify();
      return;
    }
    finally {}
  }
  
  public void zzax(String paramString)
  {
    Object localObject1 = this.zzpV;
    int i = 1;
    try
    {
      this.zzKF = i;
      Object localObject2 = this.zzpV;
      localObject2.notify();
      return;
    }
    finally {}
  }
  
  public void zzbr()
  {
    Object localObject1 = this.zzKB;
    if (localObject1 != null)
    {
      localObject1 = this.zzKB.zzgQ();
      if (localObject1 != null)
      {
        localObject1 = this.zzKB.zzgP();
        if (localObject1 != null) {
          break label34;
        }
      }
    }
    label34:
    Object localObject3;
    zzey localzzey;
    for (;;)
    {
      return;
      localObject3 = this.zzKB.zzgQ();
      ((zzhx)localObject3).zza(this);
      ((zzhx)localObject3).zza(this);
      localObject1 = this.zzGd.zzLd.zzHt;
      localzzey = this.zzKB.zzgP();
      for (;;)
      {
        try
        {
          boolean bool = localzzey.isInitialized();
          if (!bool) {
            continue;
          }
          localHandler = zza.zzMS;
          localObject4 = new com/google/android/gms/internal/zzhu$1;
          ((zzhu.1)localObject4).<init>(this, (AdRequestParcel)localObject1, localzzey);
          localHandler.post((Runnable)localObject4);
        }
        catch (RemoteException localRemoteException)
        {
          Handler localHandler;
          Object localObject4;
          long l;
          int i;
          int j;
          zzin.zzd("Fail to check if adapter is initialized.", localRemoteException);
          Object localObject2 = this.zzCd;
          int k = 0;
          localzzey = null;
          zza((String)localObject2, 0);
          continue;
          localObject2 = this.zzKC;
          localObject3 = this.zzCd;
          k = this.zzGu;
          ((zzhy)localObject2).zza((String)localObject3, k);
        }
        localObject1 = zzr.zzbG();
        l = ((zzmq)localObject1).elapsedRealtime();
        zzk(l);
        ((zzhx)localObject3).zza(null);
        ((zzhx)localObject3).zza(null);
        i = this.zzKF;
        j = 1;
        if (i != j) {
          continue;
        }
        localObject1 = this.zzKC;
        localObject3 = this.zzCd;
        ((zzhy)localObject1).zzax((String)localObject3);
        break;
        localHandler = zza.zzMS;
        localObject4 = new com/google/android/gms/internal/zzhu$2;
        ((zzhu.2)localObject4).<init>(this, localzzey, (AdRequestParcel)localObject1, (zzhx)localObject3);
        localHandler.post((Runnable)localObject4);
      }
    }
  }
  
  protected boolean zzf(long paramLong)
  {
    boolean bool1 = false;
    Object localObject = zzr.zzbG();
    long l1 = ((zzmq)localObject).elapsedRealtime() - paramLong;
    long l2 = 20000L - l1;
    l1 = 0L;
    boolean bool2 = l2 < l1;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      try
      {
        localObject = this.zzpV;
        localObject.wait(l2);
        bool1 = true;
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  public void zzgN()
  {
    AdRequestParcel localAdRequestParcel = this.zzGd.zzLd.zzHt;
    zzey localzzey = this.zzKB.zzgP();
    zza(localAdRequestParcel, localzzey);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */