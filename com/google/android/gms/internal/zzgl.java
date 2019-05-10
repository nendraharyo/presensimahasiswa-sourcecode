package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

public class zzgl
  implements InAppPurchase
{
  private final zzgc zzFL;
  
  public zzgl(zzgc paramzzgc)
  {
    this.zzFL = paramzzgc;
  }
  
  public String getProductId()
  {
    try
    {
      localObject1 = this.zzFL;
      localObject1 = ((zzgc)localObject1).getProductId();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Could not forward getProductId to InAppPurchase";
        zzin.zzd(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public void recordPlayBillingResolution(int paramInt)
  {
    try
    {
      zzgc localzzgc = this.zzFL;
      localzzgc.recordPlayBillingResolution(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward recordPlayBillingResolution to InAppPurchase";
        zzin.zzd(str, localRemoteException);
      }
    }
  }
  
  public void recordResolution(int paramInt)
  {
    try
    {
      zzgc localzzgc = this.zzFL;
      localzzgc.recordResolution(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward recordResolution to InAppPurchase";
        zzin.zzd(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */