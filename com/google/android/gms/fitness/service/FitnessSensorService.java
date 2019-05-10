package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.zzne;
import java.util.List;

public abstract class FitnessSensorService
  extends Service
{
  public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
  private FitnessSensorService.zza zzaBP;
  
  public IBinder onBind(Intent paramIntent)
  {
    Object localObject1 = "com.google.android.gms.fitness.service.FitnessSensorService";
    Object localObject2 = paramIntent.getAction();
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = "FitnessSensorService";
      int i = 3;
      bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = "FitnessSensorService";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Intent ").append(paramIntent).append(" received by ");
        String str = getClass().getName();
        localObject2 = str;
        Log.d((String)localObject1, (String)localObject2);
      }
    }
    for (localObject1 = this.zzaBP.asBinder();; localObject1 = null)
    {
      return (IBinder)localObject1;
      bool = false;
    }
  }
  
  public void onCreate()
  {
    super.onCreate();
    FitnessSensorService.zza localzza = new com/google/android/gms/fitness/service/FitnessSensorService$zza;
    localzza.<init>(this, null);
    this.zzaBP = localzza;
  }
  
  public abstract List onFindDataSources(List paramList);
  
  public abstract boolean onRegister(FitnessSensorServiceRequest paramFitnessSensorServiceRequest);
  
  public abstract boolean onUnregister(DataSource paramDataSource);
  
  protected void zzvr()
  {
    int i = Binder.getCallingUid();
    Object localObject = "com.google.android.gms";
    int j = zzne.zzsk();
    if (j != 0)
    {
      localObject = (AppOpsManager)getSystemService("appops");
      String str1 = "com.google.android.gms";
      ((AppOpsManager)localObject).checkPackage(i, str1);
      return;
    }
    localObject = getPackageManager();
    String[] arrayOfString = ((PackageManager)localObject).getPackagesForUid(i);
    if (arrayOfString != null)
    {
      int m = arrayOfString.length;
      j = 0;
      localObject = null;
      for (;;)
      {
        if (j >= m) {
          break label100;
        }
        String str2 = arrayOfString[j];
        String str3 = "com.google.android.gms";
        boolean bool = str2.equals(str3);
        if (bool) {
          break;
        }
        int k;
        j += 1;
      }
    }
    label100:
    localObject = new java/lang/SecurityException;
    ((SecurityException)localObject).<init>("Unauthorized caller");
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\service\FitnessSensorService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */