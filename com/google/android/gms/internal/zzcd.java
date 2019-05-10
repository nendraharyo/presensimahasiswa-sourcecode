package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public class zzcd
  implements CustomRenderedAd
{
  private final zzce zzxH;
  
  public zzcd(zzce paramzzce)
  {
    this.zzxH = paramzzce;
  }
  
  public String getBaseUrl()
  {
    try
    {
      localObject1 = this.zzxH;
      localObject1 = ((zzce)localObject1).zzdF();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Could not delegate getBaseURL to CustomRenderedAd";
        zzb.zzd(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public String getContent()
  {
    try
    {
      localObject1 = this.zzxH;
      localObject1 = ((zzce)localObject1).getContent();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Could not delegate getContent to CustomRenderedAd";
        zzb.zzd(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public void onAdRendered(View paramView)
  {
    for (;;)
    {
      try
      {
        localObject = this.zzxH;
        if (paramView != null)
        {
          localzzd = zze.zzC(paramView);
          ((zzce)localObject).zzb(localzzd);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzd localzzd;
        Object localObject = "Could not delegate onAdRendered to CustomRenderedAd";
        zzb.zzd((String)localObject, localRemoteException);
        continue;
      }
      localzzd = null;
    }
  }
  
  public void recordClick()
  {
    try
    {
      zzce localzzce = this.zzxH;
      localzzce.recordClick();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not delegate recordClick to CustomRenderedAd";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void recordImpression()
  {
    try
    {
      zzce localzzce = this.zzxH;
      localzzce.recordImpression();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not delegate recordImpression to CustomRenderedAd";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */