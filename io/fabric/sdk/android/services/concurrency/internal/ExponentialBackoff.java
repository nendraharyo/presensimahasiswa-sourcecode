package io.fabric.sdk.android.services.concurrency.internal;

public class ExponentialBackoff
  implements Backoff
{
  private static final int DEFAULT_POWER = 2;
  private final long baseTimeMillis;
  private final int power;
  
  public ExponentialBackoff(long paramLong)
  {
    this(paramLong, 2);
  }
  
  public ExponentialBackoff(long paramLong, int paramInt)
  {
    this.baseTimeMillis = paramLong;
    this.power = paramInt;
  }
  
  public long getDelayMillis(int paramInt)
  {
    double d1 = this.baseTimeMillis;
    double d2 = this.power;
    double d3 = paramInt;
    d2 = Math.pow(d2, d3);
    return (d1 * d2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\ExponentialBackoff.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */