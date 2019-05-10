package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

public class zzae
{
  private static volatile Logger zzSV;
  
  static
  {
    zzs localzzs = new com/google/android/gms/analytics/internal/zzs;
    localzzs.<init>();
    setLogger(localzzs);
  }
  
  public static Logger getLogger()
  {
    return zzSV;
  }
  
  public static void setLogger(Logger paramLogger)
  {
    zzSV = paramLogger;
  }
  
  public static void v(String paramString)
  {
    Object localObject = zzaf.zzlx();
    if (localObject != null) {
      ((zzaf)localObject).zzbd(paramString);
    }
    for (;;)
    {
      localObject = zzSV;
      if (localObject != null) {
        ((Logger)localObject).verbose(paramString);
      }
      return;
      localObject = null;
      boolean bool = zzQ(0);
      if (bool)
      {
        localObject = (String)zzy.zzRL.get();
        Log.v((String)localObject, paramString);
      }
    }
  }
  
  public static boolean zzQ(int paramInt)
  {
    boolean bool = false;
    Logger localLogger = getLogger();
    if (localLogger != null)
    {
      localLogger = getLogger();
      int i = localLogger.getLogLevel();
      if (i <= paramInt) {
        bool = true;
      }
    }
    return bool;
  }
  
  public static void zzaJ(String paramString)
  {
    Object localObject = zzaf.zzlx();
    if (localObject != null) {
      ((zzaf)localObject).zzbf(paramString);
    }
    for (;;)
    {
      localObject = zzSV;
      if (localObject != null) {
        ((Logger)localObject).info(paramString);
      }
      return;
      boolean bool = zzQ(1);
      if (bool)
      {
        localObject = (String)zzy.zzRL.get();
        Log.i((String)localObject, paramString);
      }
    }
  }
  
  public static void zzaK(String paramString)
  {
    Object localObject = zzaf.zzlx();
    if (localObject != null) {
      ((zzaf)localObject).zzbg(paramString);
    }
    for (;;)
    {
      localObject = zzSV;
      if (localObject != null) {
        ((Logger)localObject).warn(paramString);
      }
      return;
      boolean bool = zzQ(2);
      if (bool)
      {
        localObject = (String)zzy.zzRL.get();
        Log.w((String)localObject, paramString);
      }
    }
  }
  
  public static void zzf(String paramString, Object paramObject)
  {
    Object localObject1 = zzaf.zzlx();
    if (localObject1 != null) {
      ((zzaf)localObject1).zze(paramString, paramObject);
    }
    boolean bool;
    do
    {
      localObject1 = zzSV;
      if (localObject1 != null) {
        ((Logger)localObject1).error(paramString);
      }
      return;
      bool = zzQ(3);
    } while (!bool);
    if (paramObject != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = paramString + ":" + paramObject;
    }
    for (Object localObject2 = localObject1;; localObject2 = paramString)
    {
      localObject1 = (String)zzy.zzRL.get();
      Log.e((String)localObject1, (String)localObject2);
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */