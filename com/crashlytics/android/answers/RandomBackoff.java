package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import java.util.Random;

class RandomBackoff
  implements Backoff
{
  final Backoff backoff;
  final double jitterPercent;
  final Random random;
  
  public RandomBackoff(Backoff paramBackoff, double paramDouble)
  {
    this(paramBackoff, paramDouble, localRandom);
  }
  
  public RandomBackoff(Backoff paramBackoff, double paramDouble, Random paramRandom)
  {
    double d = 0.0D;
    boolean bool = paramDouble < d;
    Object localObject;
    if (!bool)
    {
      d = 1.0D;
      bool = paramDouble < d;
      if (!bool) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("jitterPercent must be between 0.0 and 1.0");
      throw ((Throwable)localObject);
    }
    if (paramBackoff == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("backoff must not be null");
      throw ((Throwable)localObject);
    }
    if (paramRandom == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("random must not be null");
      throw ((Throwable)localObject);
    }
    this.backoff = paramBackoff;
    this.jitterPercent = paramDouble;
    this.random = paramRandom;
  }
  
  public long getDelayMillis(int paramInt)
  {
    double d1 = randomJitter();
    double d2 = this.backoff.getDelayMillis(paramInt);
    return (d1 * d2);
  }
  
  double randomJitter()
  {
    double d1 = 1.0D;
    double d2 = this.jitterPercent;
    d2 = d1 - d2;
    double d3 = this.jitterPercent + d1;
    d1 = this.random.nextDouble();
    d3 = (d3 - d2) * d1;
    return d2 + d3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\RandomBackoff.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */