package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;

public final class zzmd$zza
{
  public final int zzakx;
  public final int zzaky;
  
  public zzmd$zza(int paramInt1, int paramInt2)
  {
    this.zzakx = paramInt1;
    this.zzaky = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof zza;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (this != paramObject)
      {
        paramObject = (zza)paramObject;
        int i = ((zza)paramObject).zzakx;
        int j = this.zzakx;
        if (i == j)
        {
          i = ((zza)paramObject).zzaky;
          j = this.zzaky;
          if (i == j) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(this.zzakx);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(this.zzaky);
    arrayOfObject[1] = localInteger;
    return zzw.hashCode(arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */