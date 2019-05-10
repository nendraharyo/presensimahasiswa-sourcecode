package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.zzc;

abstract class zzn
  extends BroadcastReceiver
{
  protected Context mContext;
  
  public static zzn zza(Context paramContext, zzn paramzzn)
  {
    zzc localzzc = zzc.zzoK();
    return zza(paramContext, paramzzn, localzzc);
  }
  
  public static zzn zza(Context paramContext, zzn paramzzn, zzc paramzzc)
  {
    Object localObject = new android/content/IntentFilter;
    ((IntentFilter)localObject).<init>("android.intent.action.PACKAGE_ADDED");
    String str = "package";
    ((IntentFilter)localObject).addDataScheme(str);
    paramContext.registerReceiver(paramzzn, (IntentFilter)localObject);
    paramzzn.mContext = paramContext;
    localObject = "com.google.android.gms";
    boolean bool = paramzzc.zzi(paramContext, (String)localObject);
    if (!bool)
    {
      paramzzn.zzpJ();
      paramzzn.unregister();
      paramzzn = null;
    }
    return paramzzn;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramIntent.getData();
    boolean bool = false;
    String str = null;
    if (localObject != null) {
      str = ((Uri)localObject).getSchemeSpecificPart();
    }
    localObject = "com.google.android.gms";
    bool = ((String)localObject).equals(str);
    if (bool)
    {
      zzpJ();
      unregister();
    }
  }
  
  public void unregister()
  {
    try
    {
      Context localContext = this.mContext;
      if (localContext != null)
      {
        localContext = this.mContext;
        localContext.unregisterReceiver(this);
      }
      localContext = null;
      this.mContext = null;
      return;
    }
    finally {}
  }
  
  protected abstract void zzpJ();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */