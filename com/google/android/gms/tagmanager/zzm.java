package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

class zzm
{
  final zzm.zza zzbhK;
  
  public zzm()
  {
    zzm.1 local1 = new com/google/android/gms/tagmanager/zzm$1;
    local1.<init>(this);
    this.zzbhK = local1;
  }
  
  int zzFY()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public zzl zza(int paramInt, zzm.zza paramzza)
  {
    Object localObject;
    if (paramInt <= 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("maxSize <= 0");
      throw ((Throwable)localObject);
    }
    int i = zzFY();
    int j = 12;
    if (i < j)
    {
      localObject = new com/google/android/gms/tagmanager/zzcw;
      ((zzcw)localObject).<init>(paramInt, paramzza);
    }
    for (;;)
    {
      return (zzl)localObject;
      localObject = new com/google/android/gms/tagmanager/zzba;
      ((zzba)localObject).<init>(paramInt, paramzza);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */