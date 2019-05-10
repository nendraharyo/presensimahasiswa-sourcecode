package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgj;
import com.google.android.gms.internal.zzin;

public class InAppPurchaseActivity
  extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
  public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
  private zzge zzOw;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      zzge localzzge = this.zzOw;
      if (localzzge != null)
      {
        localzzge = this.zzOw;
        localzzge.onActivityResult(paramInt1, paramInt2, paramIntent);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onActivityResult to in-app purchase manager:";
        zzin.zzd(str, localRemoteException);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = zzgj.createInAppPurchaseManager(this);
    this.zzOw = ((zzge)localObject);
    localObject = this.zzOw;
    if (localObject == null)
    {
      localObject = "Could not create in-app purchase manager.";
      zzin.zzaK((String)localObject);
      finish();
    }
    for (;;)
    {
      return;
      try
      {
        localObject = this.zzOw;
        ((zzge)localObject).onCreate();
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Could not forward onCreate to in-app purchase manager:";
        zzin.zzd(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      zzge localzzge = this.zzOw;
      if (localzzge != null)
      {
        localzzge = this.zzOw;
        localzzge.onDestroy();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onDestroy to in-app purchase manager:";
        zzin.zzd(str, localRemoteException);
      }
    }
    super.onDestroy();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\purchase\InAppPurchaseActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */