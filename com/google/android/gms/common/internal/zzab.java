package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public final class zzab
  extends zzg
{
  private static final zzab zzamw;
  
  static
  {
    zzab localzzab = new com/google/android/gms/common/internal/zzab;
    localzzab.<init>();
    zzamw = localzzab;
  }
  
  private zzab()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View zzb(Context paramContext, int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    return zzamw.zzc(paramContext, paramInt1, paramInt2, paramArrayOfScope);
  }
  
  private View zzc(Context paramContext, int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    try
    {
      localObject1 = new com/google/android/gms/common/internal/SignInButtonConfig;
      ((SignInButtonConfig)localObject1).<init>(paramInt1, paramInt2, paramArrayOfScope);
      localObject2 = zze.zzC(paramContext);
      Object localObject3 = zzaB(paramContext);
      localObject3 = (zzu)localObject3;
      localObject3 = ((zzu)localObject3).zza((zzd)localObject2, (SignInButtonConfig)localObject1);
      localObject3 = zze.zzp((zzd)localObject3);
      return (View)localObject3;
    }
    catch (Exception localException)
    {
      Object localObject1 = new com/google/android/gms/dynamic/zzg$zza;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Could not get button with size " + paramInt1 + " and color " + paramInt2;
      ((zzg.zza)localObject1).<init>((String)localObject2, localException);
      throw ((Throwable)localObject1);
    }
  }
  
  public zzu zzaV(IBinder paramIBinder)
  {
    return zzu.zza.zzaU(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */