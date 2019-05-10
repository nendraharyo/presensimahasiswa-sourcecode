package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zze;

public abstract class zzg
{
  private final String zzavI;
  private Object zzavJ;
  
  protected zzg(String paramString)
  {
    this.zzavI = paramString;
  }
  
  protected final Object zzaB(Context paramContext)
  {
    Object localObject1 = this.zzavJ;
    if (localObject1 == null)
    {
      zzx.zzz(paramContext);
      localObject1 = zze.getRemoteContext(paramContext);
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/dynamic/zzg$zza;
        ((zzg.zza)localObject1).<init>("Could not get remote context.");
        throw ((Throwable)localObject1);
      }
      localObject1 = ((Context)localObject1).getClassLoader();
    }
    try
    {
      localObject2 = this.zzavI;
      localObject1 = ((ClassLoader)localObject1).loadClass((String)localObject2);
      localObject1 = ((Class)localObject1).newInstance();
      localObject1 = (IBinder)localObject1;
      localObject1 = zzd((IBinder)localObject1);
      this.zzavJ = localObject1;
      return this.zzavJ;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = new com/google/android/gms/dynamic/zzg$zza;
      ((zzg.zza)localObject2).<init>("Could not load creator class.", localClassNotFoundException);
      throw ((Throwable)localObject2);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new com/google/android/gms/dynamic/zzg$zza;
      ((zzg.zza)localObject2).<init>("Could not instantiate creator.", localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new com/google/android/gms/dynamic/zzg$zza;
      ((zzg.zza)localObject2).<init>("Could not access creator.", localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
  }
  
  protected abstract Object zzd(IBinder paramIBinder);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */