package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

final class zzlv$zze
{
  private int mSize = 0;
  
  public boolean zza(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = System.currentTimeMillis();
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    long l2 = localTimeUnit.convert(paramLong, paramTimeUnit);
    for (;;)
    {
      try
      {
        int i = this.mSize;
        boolean bool2;
        if (i == 0)
        {
          bool2 = true;
          return bool2;
        }
        l3 = 0L;
        boolean bool1 = l2 < l3;
        if (!bool1)
        {
          bool2 = false;
          localTimeUnit = null;
          continue;
        }
        wait(l2);
      }
      finally {}
      long l3 = System.currentTimeMillis() - l1;
      l2 -= l3;
    }
  }
  
  public void zzoH()
  {
    try
    {
      int i = this.mSize + 1;
      this.mSize = i;
      return;
    }
    finally {}
  }
  
  public void zzoI()
  {
    try
    {
      i = this.mSize;
      if (i == 0)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        String str = "too many decrements";
        localRuntimeException.<init>(str);
        throw localRuntimeException;
      }
    }
    finally {}
    int i = this.mSize + -1;
    this.mSize = i;
    i = this.mSize;
    if (i == 0) {
      notifyAll();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlv$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */