package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;

class GcmTaskService$zza
  extends Thread
{
  private final Bundle mExtras;
  private final String mTag;
  private final zzc zzaLK;
  
  GcmTaskService$zza(GcmTaskService paramGcmTaskService, String paramString, IBinder paramIBinder, Bundle paramBundle)
  {
    this.mTag = paramString;
    zzc localzzc = zzc.zza.zzbZ(paramIBinder);
    this.zzaLK = localzzc;
    this.mExtras = paramBundle;
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    GcmTaskService localGcmTaskService = this.zzaLL;
    Object localObject3 = new com/google/android/gms/gcm/TaskParams;
    String str = this.mTag;
    Bundle localBundle = this.mExtras;
    ((TaskParams)localObject3).<init>(str, localBundle);
    int i = localGcmTaskService.onRunTask((TaskParams)localObject3);
    try
    {
      localObject3 = this.zzaLK;
      ((zzc)localObject3).zzhe(i);
      localGcmTaskService = this.zzaLL;
      localObject3 = this.mTag;
      GcmTaskService.zza(localGcmTaskService, (String)localObject3);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1 = "GcmTaskService";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "Error reporting result of operation to scheduler for ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = this.mTag;
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.e((String)localObject1, (String)localObject3);
        localObject1 = this.zzaLL;
        localObject3 = this.mTag;
        GcmTaskService.zza((GcmTaskService)localObject1, (String)localObject3);
      }
    }
    finally
    {
      localObject3 = this.zzaLL;
      str = this.mTag;
      GcmTaskService.zza((GcmTaskService)localObject3, str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmTaskService$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */