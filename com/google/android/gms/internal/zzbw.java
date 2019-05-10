package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

public class zzbw
{
  public zzbv zza(zzbu paramzzbu)
  {
    Object localObject;
    if (paramzzbu == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("CSI configuration can't be null. ");
      throw ((Throwable)localObject);
    }
    boolean bool = paramzzbu.zzdu();
    if (!bool)
    {
      zzin.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (zzbv)localObject;
      localObject = paramzzbu.getContext();
      if (localObject == null)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Context can't be null. Please set up context in CsiConfiguration.");
        throw ((Throwable)localObject);
      }
      localObject = paramzzbu.zzcs();
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        throw ((Throwable)localObject);
      }
      localObject = new com/google/android/gms/internal/zzbv;
      Context localContext = paramzzbu.getContext();
      String str1 = paramzzbu.zzcs();
      String str2 = paramzzbu.zzdv();
      Map localMap = paramzzbu.zzdw();
      ((zzbv)localObject).<init>(localContext, str1, str2, localMap);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */