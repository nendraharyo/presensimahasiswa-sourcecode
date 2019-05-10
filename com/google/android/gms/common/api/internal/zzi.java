package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Queue;
import java.util.Set;

public class zzi
  implements zzk
{
  private final zzl zzahj;
  
  public zzi(zzl paramzzl)
  {
    this.zzahj = paramzzl;
  }
  
  public void begin()
  {
    this.zzahj.zzpM();
    zzj localzzj = this.zzahj.zzagW;
    Set localSet = Collections.emptySet();
    localzzj.zzahU = localSet;
  }
  
  public void connect()
  {
    this.zzahj.zzpK();
  }
  
  public boolean disconnect()
  {
    return true;
  }
  
  public void onConnected(Bundle paramBundle) {}
  
  public void onConnectionSuspended(int paramInt) {}
  
  public zza.zza zza(zza.zza paramzza)
  {
    this.zzahj.zzagW.zzahN.add(paramzza);
    return paramzza;
  }
  
  public void zza(ConnectionResult paramConnectionResult, Api paramApi, int paramInt) {}
  
  public zza.zza zzb(zza.zza paramzza)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("GoogleApiClient is not connected yet.");
    throw localIllegalStateException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */