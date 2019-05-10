package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class zzad
{
  private static Context zzaSU;
  private static zzc zzaSV;
  
  private static Context getRemoteContext(Context paramContext)
  {
    Context localContext = zzaSU;
    if (localContext == null)
    {
      boolean bool = zzAg();
      if (!bool) {
        break label29;
      }
      localContext = paramContext.getApplicationContext();
    }
    for (zzaSU = localContext;; zzaSU = localContext)
    {
      return zzaSU;
      label29:
      localContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
    }
  }
  
  public static boolean zzAg()
  {
    return false;
  }
  
  private static Class zzAh()
  {
    String str = "com.google.android.gms.maps.internal.CreatorImpl";
    try
    {
      return Class.forName(str);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localClassNotFoundException);
      throw localRuntimeException;
    }
  }
  
  private static Object zza(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      Object localObject1 = zzx.zzz(paramClassLoader);
      localObject1 = (ClassLoader)localObject1;
      localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
      return zzd((Class)localObject1);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unable to find dynamic class " + paramString;
      localIllegalStateException.<init>((String)localObject2);
      throw localIllegalStateException;
    }
  }
  
  public static zzc zzaO(Context paramContext)
  {
    zzx.zzz(paramContext);
    zzc localzzc = zzaSV;
    if (localzzc != null) {
      localzzc = zzaSV;
    }
    for (;;)
    {
      return localzzc;
      zzaP(paramContext);
      localzzc = zzaQ(paramContext);
      zzaSV = localzzc;
      try
      {
        localzzc = zzaSV;
        localObject = getRemoteContext(paramContext);
        localObject = ((Context)localObject).getResources();
        localObject = zze.zzC(localObject);
        int i = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        localzzc.zzd((zzd)localObject, i);
        localzzc = zzaSV;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
    }
  }
  
  private static void zzaP(Context paramContext)
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext);
    switch (i)
    {
    default: 
      GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
      localGooglePlayServicesNotAvailableException.<init>(i);
      throw localGooglePlayServicesNotAvailableException;
    }
  }
  
  private static zzc zzaQ(Context paramContext)
  {
    boolean bool = zzAg();
    String str;
    if (bool)
    {
      localObject = zzad.class.getSimpleName();
      str = "Making Creator statically";
      Log.i((String)localObject, str);
    }
    for (Object localObject = (zzc)zzd(zzAh());; localObject = zzc.zza.zzcu((IBinder)zza((ClassLoader)localObject, str)))
    {
      return (zzc)localObject;
      Log.i(zzad.class.getSimpleName(), "Making Creator dynamically");
      localObject = getRemoteContext(paramContext).getClassLoader();
      str = "com.google.android.gms.maps.internal.CreatorImpl";
    }
  }
  
  private static Object zzd(Class paramClass)
  {
    try
    {
      return paramClass.newInstance();
    }
    catch (InstantiationException localInstantiationException)
    {
      IllegalStateException localIllegalStateException1 = new java/lang/IllegalStateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Unable to instantiate the dynamic class ");
      str = paramClass.getName();
      localObject = str;
      localIllegalStateException1.<init>((String)localObject);
      throw localIllegalStateException1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Unable to call the default constructor of ");
      String str = paramClass.getName();
      localObject = str;
      localIllegalStateException2.<init>((String)localObject);
      throw localIllegalStateException2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\internal\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */