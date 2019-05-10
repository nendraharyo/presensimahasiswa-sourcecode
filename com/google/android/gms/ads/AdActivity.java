package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfu;
import com.google.android.gms.internal.zzfv;

public class AdActivity
  extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
  public static final String SIMPLE_CLASS_NAME = "AdActivity";
  private zzfv zzoA;
  
  private void zzaD()
  {
    zzfv localzzfv = this.zzoA;
    if (localzzfv != null) {}
    try
    {
      localzzfv = this.zzoA;
      localzzfv.zzaD();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward setContentViewSet to ad overlay:";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onBackPressed()
  {
    boolean bool = true;
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        bool = localzzfv.zzfn();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onBackPressed to ad overlay:";
        zzb.zzd(str, localRemoteException);
      }
    }
    if (bool) {
      super.onBackPressed();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = zzfu.createAdOverlay(this);
    this.zzoA = ((zzfv)localObject);
    localObject = this.zzoA;
    if (localObject == null)
    {
      localObject = "Could not create ad overlay.";
      zzb.zzaK((String)localObject);
      finish();
    }
    for (;;)
    {
      return;
      try
      {
        localObject = this.zzoA;
        ((zzfv)localObject).onCreate(paramBundle);
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Could not forward onCreate to ad overlay:";
        zzb.zzd(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        localzzfv.onDestroy();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onDestroy to ad overlay:";
        zzb.zzd(str, localRemoteException);
      }
    }
    super.onDestroy();
  }
  
  protected void onPause()
  {
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        localzzfv.onPause();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onPause to ad overlay:";
        zzb.zzd(str, localRemoteException);
        finish();
      }
    }
    super.onPause();
  }
  
  protected void onRestart()
  {
    super.onRestart();
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        localzzfv.onRestart();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onRestart to ad overlay:";
        zzb.zzd(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        localzzfv.onResume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onResume to ad overlay:";
        zzb.zzd(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        localzzfv.onSaveInstanceState(paramBundle);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onSaveInstanceState to ad overlay:";
        zzb.zzd(str, localRemoteException);
        finish();
      }
    }
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        localzzfv.onStart();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onStart to ad overlay:";
        zzb.zzd(str, localRemoteException);
        finish();
      }
    }
  }
  
  protected void onStop()
  {
    try
    {
      zzfv localzzfv = this.zzoA;
      if (localzzfv != null)
      {
        localzzfv = this.zzoA;
        localzzfv.onStop();
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not forward onStop to ad overlay:";
        zzb.zzd(str, localRemoteException);
        finish();
      }
    }
    super.onStop();
  }
  
  public void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
    zzaD();
  }
  
  public void setContentView(View paramView)
  {
    super.setContentView(paramView);
    zzaD();
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
    zzaD();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\AdActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */