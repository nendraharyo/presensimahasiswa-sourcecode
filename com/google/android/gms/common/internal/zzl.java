package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class zzl
{
  private static final Object zzalX;
  private static zzl zzalY;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzalX = localObject;
  }
  
  public static zzl zzau(Context paramContext)
  {
    synchronized (zzalX)
    {
      Object localObject2 = zzalY;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/common/internal/zzm;
        Context localContext = paramContext.getApplicationContext();
        ((zzm)localObject2).<init>(localContext);
        zzalY = (zzl)localObject2;
      }
      return zzalY;
    }
  }
  
  public abstract boolean zza(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract boolean zza(String paramString1, ServiceConnection paramServiceConnection, String paramString2);
  
  public abstract void zzb(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract void zzb(String paramString1, ServiceConnection paramServiceConnection, String paramString2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */