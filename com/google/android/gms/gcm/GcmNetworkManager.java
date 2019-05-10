package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.List;

public class GcmNetworkManager
{
  public static final int RESULT_FAILURE = 2;
  public static final int RESULT_RESCHEDULE = 1;
  public static final int RESULT_SUCCESS;
  private static GcmNetworkManager zzaLB;
  private Context mContext;
  private final PendingIntent mPendingIntent;
  
  private GcmNetworkManager(Context paramContext)
  {
    this.mContext = paramContext;
    Object localObject = this.mContext;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localObject = PendingIntent.getBroadcast((Context)localObject, 0, localIntent, 0);
    this.mPendingIntent = ((PendingIntent)localObject);
  }
  
  public static GcmNetworkManager getInstance(Context paramContext)
  {
    synchronized (GcmNetworkManager.class)
    {
      GcmNetworkManager localGcmNetworkManager = zzaLB;
      if (localGcmNetworkManager == null)
      {
        localGcmNetworkManager = new com/google/android/gms/gcm/GcmNetworkManager;
        Context localContext = paramContext.getApplicationContext();
        localGcmNetworkManager.<init>(localContext);
        zzaLB = localGcmNetworkManager;
      }
      localGcmNetworkManager = zzaLB;
      return localGcmNetworkManager;
    }
  }
  
  static void zzdT(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    IllegalArgumentException localIllegalArgumentException;
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Must provide a valid tag.");
      throw localIllegalArgumentException;
    }
    int i = 100;
    int j = paramString.length();
    if (i < j)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Tag is larger than max permissible tag length (100)");
      throw localIllegalArgumentException;
    }
  }
  
  private void zzdU(String paramString)
  {
    int i = 1;
    zzx.zzb(paramString, "GcmTaskService must not be null.");
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("com.google.android.gms.gcm.ACTION_TASK_READY");
    Object localObject2 = this.mContext.getPackageName();
    ((Intent)localObject1).setPackage((String)localObject2);
    localObject2 = this.mContext.getPackageManager().queryIntentServices((Intent)localObject1, 0);
    boolean bool;
    if (localObject2 != null)
    {
      int j = ((List)localObject2).size();
      if (j != 0)
      {
        j = i;
        String str = "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?";
        zzx.zzb(j, str);
        localObject2 = ((List)localObject2).iterator();
        do
        {
          bool = ((Iterator)localObject2).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = ((ResolveInfo)((Iterator)localObject2).next()).serviceInfo.name;
          bool = ((String)localObject1).equals(paramString);
        } while (!bool);
      }
    }
    for (;;)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "The GcmTaskService class you provided " + paramString + " does not seem to support receiving" + " com.google.android.gms.gcm.ACTION_TASK_READY.";
      zzx.zzb(i, localObject1);
      return;
      bool = false;
      localObject1 = null;
      break;
      i = 0;
    }
  }
  
  private Intent zzyi()
  {
    Object localObject1 = this.mContext;
    int i = GoogleCloudMessaging.zzaK((Context)localObject1);
    int j = GoogleCloudMessaging.zzaLM;
    String str1;
    Object localObject2;
    if (i < j)
    {
      str1 = "GcmNetworkManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = "Google Play Services is not available, dropping GcmNetworkManager request. code=";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject1 = i;
      Log.e(str1, (String)localObject1);
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Intent)localObject1;
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>("com.google.android.gms.gcm.ACTION_SCHEDULE");
      str1 = GoogleCloudMessaging.zzaJ(this.mContext);
      ((Intent)localObject1).setPackage(str1);
      str1 = "app";
      localObject2 = this.mPendingIntent;
      ((Intent)localObject1).putExtra(str1, (Parcelable)localObject2);
    }
  }
  
  public void cancelAllTasks(Class paramClass)
  {
    zzc(paramClass);
  }
  
  public void cancelTask(String paramString, Class paramClass)
  {
    zza(paramString, paramClass);
  }
  
  public void schedule(Task paramTask)
  {
    Object localObject1 = paramTask.getServiceName();
    zzdU((String)localObject1);
    localObject1 = zzyi();
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      Object localObject2 = ((Intent)localObject1).getExtras();
      String str1 = "scheduler_action";
      String str2 = "SCHEDULE_TASK";
      ((Bundle)localObject2).putString(str1, str2);
      paramTask.toBundle((Bundle)localObject2);
      ((Intent)localObject1).putExtras((Bundle)localObject2);
      localObject2 = this.mContext;
      ((Context)localObject2).sendBroadcast((Intent)localObject1);
    }
  }
  
  public void zza(String paramString, Class paramClass)
  {
    zzdT(paramString);
    Object localObject = paramClass.getName();
    zzdU((String)localObject);
    localObject = zzyi();
    if (localObject == null) {}
    for (;;)
    {
      return;
      ((Intent)localObject).putExtra("scheduler_action", "CANCEL_TASK");
      ((Intent)localObject).putExtra("tag", paramString);
      ComponentName localComponentName = new android/content/ComponentName;
      Context localContext1 = this.mContext;
      localComponentName.<init>(localContext1, paramClass);
      ((Intent)localObject).putExtra("component", localComponentName);
      Context localContext2 = this.mContext;
      localContext2.sendBroadcast((Intent)localObject);
    }
  }
  
  public void zzc(Class paramClass)
  {
    Object localObject = paramClass.getName();
    zzdU((String)localObject);
    localObject = zzyi();
    if (localObject == null) {}
    for (;;)
    {
      return;
      ((Intent)localObject).putExtra("scheduler_action", "CANCEL_ALL");
      ComponentName localComponentName = new android/content/ComponentName;
      Context localContext1 = this.mContext;
      localComponentName.<init>(localContext1, paramClass);
      ((Intent)localObject).putExtra("component", localComponentName);
      Context localContext2 = this.mContext;
      localContext2.sendBroadcast((Intent)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmNetworkManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */