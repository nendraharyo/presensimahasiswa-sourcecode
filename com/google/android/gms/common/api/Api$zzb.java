package com.google.android.gms.common.api;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.zzp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

public abstract interface Api$zzb
{
  public abstract void disconnect();
  
  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract boolean isConnected();
  
  public abstract void zza(GoogleApiClient.zza paramzza);
  
  public abstract void zza(zzp paramzzp, Set paramSet);
  
  public abstract boolean zzmE();
  
  public abstract boolean zznb();
  
  public abstract Intent zznc();
  
  public abstract IBinder zzoT();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Api$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */