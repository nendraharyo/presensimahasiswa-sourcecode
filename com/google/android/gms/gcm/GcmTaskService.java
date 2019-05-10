package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService
  extends Service
{
  public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
  public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
  public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
  private final Set zzaLI;
  private int zzaLJ;
  
  public GcmTaskService()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzaLI = localHashSet;
  }
  
  private void zzdY(String paramString)
  {
    synchronized (this.zzaLI)
    {
      Set localSet2 = this.zzaLI;
      localSet2.remove(paramString);
      localSet2 = this.zzaLI;
      int i = localSet2.size();
      if (i == 0)
      {
        i = this.zzaLJ;
        stopSelf(i);
      }
      return;
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onInitializeTasks() {}
  
  public abstract int onRunTask(TaskParams paramTaskParams);
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    int i = 2;
    Object localObject1 = PendingCallback.class.getClassLoader();
    paramIntent.setExtrasClassLoader((ClassLoader)localObject1);
    localObject1 = "com.google.android.gms.gcm.ACTION_TASK_READY";
    ??? = paramIntent.getAction();
    boolean bool1 = ((String)localObject1).equals(???);
    String str;
    if (bool1)
    {
      str = paramIntent.getStringExtra("tag");
      ??? = paramIntent.getParcelableExtra("callback");
      localObject1 = (Bundle)paramIntent.getParcelableExtra("extras");
      if (??? != null)
      {
        boolean bool2 = ??? instanceof PendingCallback;
        if (bool2) {}
      }
      else
      {
        localObject1 = "GcmTaskService";
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>();
        ??? = getPackageName();
        ??? = ((StringBuilder)???).append((String)???);
        ??? = " ";
        ??? = ((StringBuilder)???).append((String)???).append(str);
        str = ": Could not process request, invalid callback.";
        ??? = str;
        Log.e((String)localObject1, (String)???);
      }
    }
    for (;;)
    {
      return i;
      synchronized (this.zzaLI)
      {
        Set localSet = this.zzaLI;
        localSet.add(str);
        int k = this.zzaLJ;
        stopSelf(k);
        this.zzaLJ = paramInt2;
        ??? = new com/google/android/gms/gcm/GcmTaskService$zza;
        ??? = ((PendingCallback)???).getIBinder();
        ((GcmTaskService.zza)???).<init>(this, str, (IBinder)???, (Bundle)localObject1);
        ((GcmTaskService.zza)???).start();
      }
      Object localObject3 = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
      ??? = paramIntent.getAction();
      bool1 = ((String)localObject3).equals(???);
      if (!bool1) {
        continue;
      }
      onInitializeTasks();
      synchronized (this.zzaLI)
      {
        this.zzaLJ = paramInt2;
        localObject3 = this.zzaLI;
        int j = ((Set)localObject3).size();
        if (j == 0)
        {
          j = this.zzaLJ;
          stopSelf(j);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmTaskService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */