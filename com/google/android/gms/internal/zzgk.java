package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

public class zzgk
  implements InAppPurchaseResult
{
  private final zzgg zzGb;
  
  public zzgk(zzgg paramzzgg)
  {
    this.zzGb = paramzzgg;
  }
  
  public void finishPurchase()
  {
    try
    {
      zzgg localzzgg = this.zzGb;
      localzzgg.finishPurchase();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward finishPurchase to InAppPurchaseResult";
        zzin.zzd(str, localRemoteException);
      }
    }
  }
  
  public String getProductId()
  {
    try
    {
      localObject1 = this.zzGb;
      localObject1 = ((zzgg)localObject1).getProductId();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Could not forward getProductId to InAppPurchaseResult";
        zzin.zzd(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public Intent getPurchaseData()
  {
    try
    {
      localObject1 = this.zzGb;
      localObject1 = ((zzgg)localObject1).getPurchaseData();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Could not forward getPurchaseData to InAppPurchaseResult";
        zzin.zzd(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public int getResultCode()
  {
    try
    {
      zzgg localzzgg = this.zzGb;
      i = localzzgg.getResultCode();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward getPurchaseData to InAppPurchaseResult";
        zzin.zzd(str, localRemoteException);
        int i = 0;
        Object localObject = null;
      }
    }
    return i;
  }
  
  public boolean isVerified()
  {
    try
    {
      zzgg localzzgg = this.zzGb;
      bool = localzzgg.isVerified();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward isVerified to InAppPurchaseResult";
        zzin.zzd(str, localRemoteException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */