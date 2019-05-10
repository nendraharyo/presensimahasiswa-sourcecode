package android.support.v7.app;

class TwilightCalculator
{
  private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976F;
  private static final float C1 = 0.0334196F;
  private static final float C2 = 3.49066E-4F;
  private static final float C3 = 5.236E-6F;
  public static final int DAY = 0;
  private static final float DEGREES_TO_RADIANS = 0.017453292F;
  private static final float J0 = 9.0E-4F;
  public static final int NIGHT = 1;
  private static final float OBLIQUITY = 0.4092797F;
  private static final long UTC_2000 = 946728000000L;
  private static TwilightCalculator sInstance;
  public int state;
  public long sunrise;
  public long sunset;
  
  static TwilightCalculator getInstance()
  {
    TwilightCalculator localTwilightCalculator = sInstance;
    if (localTwilightCalculator == null)
    {
      localTwilightCalculator = new android/support/v7/app/TwilightCalculator;
      localTwilightCalculator.<init>();
      sInstance = localTwilightCalculator;
    }
    return sInstance;
  }
  
  public void calculateTwilight(long paramLong, double paramDouble1, double paramDouble2)
  {
    long l1 = paramLong - 946728000000L;
    float f1 = (float)l1 / 8.64E7F;
    float f2 = 0.01720197F * f1;
    float f3 = 6.24006F + f2;
    double d1 = f3;
    double d2 = Math.sin(f3);
    double d3 = 0.03341960161924362D * d2;
    d1 += d3;
    d2 = Math.sin(2.0F * f3);
    d3 = 3.4906598739326E-4D * d2;
    d1 += d3;
    d2 = Math.sin(3.0F * f3);
    d3 = 5.236000106378924E-6D * d2;
    d1 = d1 + d3 + 1.796593063D + 3.141592653589793D;
    d3 = -paramDouble2 / 360.0D;
    f1 = (float)Math.round(f1 - 9.0E-4F - d3);
    float f4 = 9.0E-4F;
    f1 += f4;
    d2 = f1;
    d3 += d2;
    double d4 = Math.sin(f3) * 0.0053D + d3;
    d2 = Math.sin(2.0D * d1);
    d3 = -0.0069D * d2;
    d4 += d3;
    d1 = Math.sin(d1);
    d3 = Math.sin(0.4092797040939331D);
    d1 = Math.asin(d1 * d3);
    d3 = 0.01745329238474369D * paramDouble1;
    long l2 = -4631161762379464704L;
    d2 = Math.sin(-0.10471975803375244D);
    double d5 = Math.sin(d3);
    double d6 = Math.sin(d1);
    d5 *= d6;
    d2 -= d5;
    d3 = Math.cos(d3);
    d1 = Math.cos(d1) * d3;
    d1 = d2 / d1;
    long l3 = 4607182418800017408L;
    d3 = 1.0D;
    boolean bool = d1 < d3;
    int i;
    if (!bool)
    {
      i = 1;
      f1 = Float.MIN_VALUE;
      this.state = i;
      this.sunset = -1;
      l1 = -1;
      d4 = 0.0D / 0.0D;
      this.sunrise = l1;
    }
    for (;;)
    {
      return;
      l3 = -4616189618054758400L;
      d3 = -1.0D;
      bool = d1 < d3;
      if (!bool)
      {
        i = 0;
        f1 = 0.0F;
        this.state = 0;
        this.sunset = -1;
        l1 = -1;
        d4 = 0.0D / 0.0D;
        this.sunrise = l1;
      }
      else
      {
        f2 = (float)(Math.acos(d1) / 6.283185307179586D);
        d3 = (f2 + d4) * 8.64E7D;
        l3 = Math.round(d3);
        l2 = 946728000000L;
        d2 = 4.67745780756E-312D;
        l3 += l2;
        this.sunset = l3;
        d1 = f2;
        d4 = (d4 - d1) * 8.64E7D;
        l1 = Math.round(d4);
        long l4 = 946728000000L;
        d1 = 4.67745780756E-312D;
        l1 += l4;
        this.sunrise = l1;
        l1 = this.sunrise;
        i = l1 < paramLong;
        if (i < 0)
        {
          l1 = this.sunset;
          i = l1 < paramLong;
          if (i > 0)
          {
            i = 0;
            f1 = 0.0F;
            this.state = 0;
            continue;
          }
        }
        i = 1;
        f1 = Float.MIN_VALUE;
        this.state = i;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\TwilightCalculator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */