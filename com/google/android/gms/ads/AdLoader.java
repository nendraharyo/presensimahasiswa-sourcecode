package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzb;

public class AdLoader
{
  private final Context mContext;
  private final zzh zzoB;
  private final zzr zzoC;
  
  AdLoader(Context paramContext, zzr paramzzr)
  {
    this(paramContext, paramzzr, localzzh);
  }
  
  AdLoader(Context paramContext, zzr paramzzr, zzh paramzzh)
  {
    this.mContext = paramContext;
    this.zzoC = paramzzr;
    this.zzoB = paramzzh;
  }
  
  private void zza(zzaa paramzzaa)
  {
    try
    {
      zzr localzzr = this.zzoC;
      localObject = this.zzoB;
      Context localContext = this.mContext;
      localObject = ((zzh)localObject).zza(localContext, paramzzaa);
      localzzr.zzf((AdRequestParcel)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to load ad.";
        zzb.zzb((String)localObject, localRemoteException);
      }
    }
  }
  
  public String getMediationAdapterClassName()
  {
    try
    {
      localObject1 = this.zzoC;
      localObject1 = ((zzr)localObject1).getMediationAdapterClassName();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get the mediation adapter class name.";
        zzb.zzd(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public boolean isLoading()
  {
    try
    {
      zzr localzzr = this.zzoC;
      bool = localzzr.isLoading();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to check if ad is loading.";
        zzb.zzd(str, localRemoteException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    zzaa localzzaa = paramAdRequest.zzaE();
    zza(localzzaa);
  }
  
  public void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    zzaa localzzaa = paramPublisherAdRequest.zzaE();
    zza(localzzaa);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\AdLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */