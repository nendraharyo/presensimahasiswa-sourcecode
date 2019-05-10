package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class zzb
{
  public static void zza(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      String str = String.valueOf(paramObject);
      localIllegalStateException.<init>(str);
      throw localIllegalStateException;
    }
  }
  
  public static void zzab(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>();
      throw localIllegalStateException;
    }
  }
  
  public static void zzcD(String paramString)
  {
    Object localObject1 = Looper.getMainLooper().getThread();
    Object localObject2 = Thread.currentThread();
    if (localObject1 != localObject2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("checkMainThread: current thread ");
      Thread localThread = Thread.currentThread();
      localObject2 = ((StringBuilder)localObject2).append(localThread).append(" IS NOT the main thread ");
      localThread = Looper.getMainLooper().getThread();
      localObject2 = localThread + "!";
      Log.e("Asserts", (String)localObject2);
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>(paramString);
      throw ((Throwable)localObject1);
    }
  }
  
  public static void zzcE(String paramString)
  {
    Object localObject1 = Looper.getMainLooper().getThread();
    Object localObject2 = Thread.currentThread();
    if (localObject1 == localObject2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("checkNotMainThread: current thread ");
      Thread localThread = Thread.currentThread();
      localObject2 = ((StringBuilder)localObject2).append(localThread).append(" IS the main thread ");
      localThread = Looper.getMainLooper().getThread();
      localObject2 = localThread + "!";
      Log.e("Asserts", (String)localObject2);
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>(paramString);
      throw ((Throwable)localObject1);
    }
  }
  
  public static void zzv(Object paramObject)
  {
    if (paramObject == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("null reference");
      throw localIllegalArgumentException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */