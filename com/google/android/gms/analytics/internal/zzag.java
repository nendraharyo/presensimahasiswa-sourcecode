package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.zzx;

class zzag
  extends BroadcastReceiver
{
  static final String zzSZ = zzag.class.getName();
  private final zzf zzQj;
  private boolean zzTa;
  private boolean zzTb;
  
  zzag(zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    this.zzQj = paramzzf;
  }
  
  private Context getContext()
  {
    return this.zzQj.getContext();
  }
  
  private zzb zziH()
  {
    return this.zzQj.zziH();
  }
  
  private zzaf zzjm()
  {
    return this.zzQj.zzjm();
  }
  
  private void zzlz()
  {
    zzjm();
    zziH();
  }
  
  public boolean isConnected()
  {
    boolean bool = this.zzTa;
    if (!bool)
    {
      zzaf localzzaf = this.zzQj.zzjm();
      String str = "Connectivity unknown. Receiver not registered";
      localzzaf.zzbg(str);
    }
    return this.zzTb;
  }
  
  public boolean isRegistered()
  {
    return this.zzTa;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    zzlz();
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = this.zzQj.zzjm();
    String str = "NetworkBroadcastReceiver received action";
    ((zzaf)localObject2).zza(str, localObject1);
    localObject2 = "android.net.conn.CONNECTIVITY_CHANGE";
    boolean bool1 = ((String)localObject2).equals(localObject1);
    boolean bool2;
    if (bool1)
    {
      bool2 = zzlB();
      bool1 = this.zzTb;
      if (bool1 != bool2)
      {
        this.zzTb = bool2;
        localObject2 = zziH();
        ((zzb)localObject2).zzJ(bool2);
      }
    }
    for (;;)
    {
      return;
      localObject2 = "com.google.analytics.RADIO_POWERED";
      bool1 = ((String)localObject2).equals(localObject1);
      if (bool1)
      {
        localObject1 = zzSZ;
        bool2 = paramIntent.hasExtra((String)localObject1);
        if (!bool2)
        {
          localObject1 = zziH();
          ((zzb)localObject1).zzjg();
        }
      }
      else
      {
        localObject2 = this.zzQj.zzjm();
        str = "NetworkBroadcastReceiver received unknown action";
        ((zzaf)localObject2).zzd(str, localObject1);
      }
    }
  }
  
  public void unregister()
  {
    String str = null;
    boolean bool = isRegistered();
    if (!bool) {}
    for (;;)
    {
      return;
      Object localObject1 = this.zzQj.zzjm();
      Object localObject2 = "Unregistering connectivity change receiver";
      ((zzaf)localObject1).zzbd((String)localObject2);
      this.zzTa = false;
      this.zzTb = false;
      localObject1 = getContext();
      try
      {
        ((Context)localObject1).unregisterReceiver(this);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject2 = zzjm();
        str = "Failed to unregister the network broadcast receiver";
        ((zzaf)localObject2).zze(str, localIllegalArgumentException);
      }
    }
  }
  
  public void zzlA()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 10;
    if (i <= j) {}
    for (;;)
    {
      return;
      Context localContext = getContext();
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("com.google.analytics.RADIO_POWERED");
      String str = localContext.getPackageName();
      localIntent.addCategory(str);
      str = zzSZ;
      boolean bool = true;
      localIntent.putExtra(str, bool);
      str = null;
      localContext.sendOrderedBroadcast(localIntent, null);
    }
  }
  
  protected boolean zzlB()
  {
    Object localObject1 = getContext();
    String str = "connectivity";
    for (localObject1 = (ConnectivityManager)((Context)localObject1).getSystemService(str);; localObject1 = null)
    {
      try
      {
        localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
        if (localObject1 == null) {
          break label39;
        }
        bool = ((NetworkInfo)localObject1).isConnected();
        if (!bool) {
          break label39;
        }
        bool = true;
      }
      catch (SecurityException localSecurityException)
      {
        for (;;)
        {
          label39:
          boolean bool = false;
          Object localObject2 = null;
        }
      }
      return bool;
      bool = false;
    }
  }
  
  public void zzly()
  {
    zzlz();
    boolean bool1 = this.zzTa;
    if (bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = getContext();
      Object localObject2 = new android/content/IntentFilter;
      ((IntentFilter)localObject2).<init>("android.net.conn.CONNECTIVITY_CHANGE");
      ((Context)localObject1).registerReceiver(this, (IntentFilter)localObject2);
      Object localObject3 = new android/content/IntentFilter;
      ((IntentFilter)localObject3).<init>("com.google.analytics.RADIO_POWERED");
      localObject2 = ((Context)localObject1).getPackageName();
      ((IntentFilter)localObject3).addCategory((String)localObject2);
      ((Context)localObject1).registerReceiver(this, (IntentFilter)localObject3);
      bool1 = zzlB();
      this.zzTb = bool1;
      localObject1 = this.zzQj.zzjm();
      localObject2 = "Registering connectivity change receiver. Network connected";
      boolean bool2 = this.zzTb;
      localObject3 = Boolean.valueOf(bool2);
      ((zzaf)localObject1).zza((String)localObject2, localObject3);
      bool1 = true;
      this.zzTa = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */