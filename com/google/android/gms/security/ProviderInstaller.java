package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import java.lang.reflect.Method;

public class ProviderInstaller
{
  public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
  private static final zzc zzbgP = ;
  private static Method zzbgQ = null;
  private static final Object zzqy;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
  }
  
  public static void installIfNeeded(Context paramContext)
  {
    int i = 8;
    zzx.zzb(paramContext, "Context must not be null");
    zzbgP.zzak(paramContext);
    Object localObject1 = zze.getRemoteContext(paramContext);
    if (localObject1 == null)
    {
      Log.e("ProviderInstaller", "Failed to get remote context");
      localObject1 = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
      ((GooglePlayServicesNotAvailableException)localObject1).<init>(i);
      throw ((Throwable)localObject1);
    }
    synchronized (zzqy)
    {
      try
      {
        localObject5 = zzbgQ;
        if (localObject5 == null) {
          zzaV((Context)localObject1);
        }
        localObject5 = zzbgQ;
        localStringBuilder = null;
        int j = 1;
        localObject6 = new Object[j];
        localObject6[0] = localObject1;
        ((Method)localObject5).invoke(null, (Object[])localObject6);
        return;
      }
      catch (Exception localException)
      {
        Object localObject5 = "ProviderInstaller";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Object localObject6 = "Failed to install provider: ";
        localStringBuilder = localStringBuilder.append((String)localObject6);
        Object localObject2 = localException.getMessage();
        localObject2 = localStringBuilder.append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.e((String)localObject5, (String)localObject2);
        localObject2 = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
        i = 8;
        ((GooglePlayServicesNotAvailableException)localObject2).<init>(i);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public static void installIfNeededAsync(Context paramContext, ProviderInstaller.ProviderInstallListener paramProviderInstallListener)
  {
    zzx.zzb(paramContext, "Context must not be null");
    zzx.zzb(paramProviderInstallListener, "Listener must not be null");
    zzx.zzcD("Must be called on the UI thread");
    ProviderInstaller.1 local1 = new com/google/android/gms/security/ProviderInstaller$1;
    local1.<init>(paramContext, paramProviderInstallListener);
    Void[] arrayOfVoid = new Void[0];
    local1.execute(arrayOfVoid);
  }
  
  private static void zzaV(Context paramContext)
  {
    Class localClass = paramContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl");
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    zzbgQ = localClass.getMethod("insertProvider", arrayOfClass);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\security\ProviderInstaller.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */