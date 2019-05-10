package com.google.android.gms.internal;

public class zzbk$zza
{
  final long value;
  final String zztx;
  final int zzty;
  
  zzbk$zza(long paramLong, String paramString, int paramInt)
  {
    this.value = paramLong;
    this.zztx = paramString;
    this.zzty = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    Object localObject;
    if (paramObject != null)
    {
      bool = paramObject instanceof zza;
      if (bool) {}
    }
    else
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = paramObject;
      localObject = (zza)paramObject;
      long l1 = ((zza)localObject).value;
      long l2 = this.value;
      bool = l1 < l2;
      if (!bool)
      {
        paramObject = (zza)paramObject;
        i = ((zza)paramObject).zzty;
        int j = this.zzty;
        if (i == j)
        {
          i = 1;
          continue;
        }
      }
      int i = 0;
      localObject = null;
    }
  }
  
  public int hashCode()
  {
    return (int)this.value;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */