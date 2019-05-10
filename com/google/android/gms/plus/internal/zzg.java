package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.plus.PlusOneDummyView;

public final class zzg
  extends com.google.android.gms.dynamic.zzg
{
  private static final zzg zzbeq;
  
  static
  {
    zzg localzzg = new com/google/android/gms/plus/internal/zzg;
    localzzg.<init>();
    zzbeq = localzzg;
  }
  
  private zzg()
  {
    super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
  }
  
  public static View zza(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    Object localObject;
    if (paramString == null) {
      try
      {
        NullPointerException localNullPointerException = new java/lang/NullPointerException;
        localNullPointerException.<init>();
        throw localNullPointerException;
      }
      catch (Exception localException)
      {
        localObject = new com/google/android/gms/plus/PlusOneDummyView;
        ((PlusOneDummyView)localObject).<init>(paramContext, paramInt1);
      }
    }
    for (;;)
    {
      return (View)localObject;
      localObject = zzbeq;
      localObject = ((zzg)localObject).zzaB(paramContext);
      localObject = (zzc)localObject;
      zzd localzzd = zze.zzC(paramContext);
      localObject = ((zzc)localObject).zza(localzzd, paramInt1, paramInt2, paramString, paramInt3);
      localObject = zze.zzp((zzd)localObject);
      localObject = (View)localObject;
    }
  }
  
  protected zzc zzdT(IBinder paramIBinder)
  {
    return zzc.zza.zzdQ(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */