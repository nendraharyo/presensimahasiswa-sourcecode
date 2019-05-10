package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zzns
{
  private static final List zzavZ;
  
  static
  {
    TimeUnit[] arrayOfTimeUnit = new TimeUnit[7];
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    arrayOfTimeUnit[0] = localTimeUnit;
    localTimeUnit = TimeUnit.MICROSECONDS;
    arrayOfTimeUnit[1] = localTimeUnit;
    localTimeUnit = TimeUnit.MILLISECONDS;
    arrayOfTimeUnit[2] = localTimeUnit;
    localTimeUnit = TimeUnit.SECONDS;
    arrayOfTimeUnit[3] = localTimeUnit;
    localTimeUnit = TimeUnit.MINUTES;
    arrayOfTimeUnit[4] = localTimeUnit;
    localTimeUnit = TimeUnit.HOURS;
    arrayOfTimeUnit[5] = localTimeUnit;
    localTimeUnit = TimeUnit.DAYS;
    arrayOfTimeUnit[6] = localTimeUnit;
    zzavZ = Arrays.asList(arrayOfTimeUnit);
  }
  
  public static long zza(long paramLong, TimeUnit paramTimeUnit1, TimeUnit paramTimeUnit2)
  {
    long l = paramTimeUnit2.convert(paramLong, paramTimeUnit1);
    return paramTimeUnit1.convert(l, paramTimeUnit2);
  }
  
  public static boolean zza(TimeUnit paramTimeUnit)
  {
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return zza(paramTimeUnit, localTimeUnit);
  }
  
  private static boolean zza(TimeUnit paramTimeUnit1, TimeUnit paramTimeUnit2)
  {
    List localList1 = zzavZ;
    int i = localList1.indexOf(paramTimeUnit1);
    List localList2 = zzavZ;
    int k = localList2.indexOf(paramTimeUnit2);
    if (i < k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localList1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzns.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */