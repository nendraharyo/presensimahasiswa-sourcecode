package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.io.Serializable;

public class q
  implements Serializable
{
  private float a;
  private float b;
  private int c;
  private float d;
  
  public q(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a = paramFloat2;
    float f = paramFloat3 + paramFloat2;
    this.b = f;
    this.c = paramInt;
    this.d = paramFloat1;
  }
  
  protected int a()
  {
    return this.c;
  }
  
  public boolean a(double paramDouble)
  {
    boolean bool1 = true;
    double d1 = 360.0D;
    float f = this.a;
    double d2 = f;
    boolean bool2 = paramDouble < d2;
    if (!bool2)
    {
      f = this.b;
      d2 = f;
      bool2 = paramDouble < d2;
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      double d3 = paramDouble % d1;
      double d4 = this.a;
      f = this.b;
      for (d2 = f;; d2 -= d1)
      {
        bool2 = d2 < d1;
        if (!bool2) {
          break;
        }
        d4 -= d1;
      }
      bool2 = d3 < d4;
      if (!bool2)
      {
        bool2 = d3 < d2;
        if (!bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  protected float b()
  {
    return this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("mDataIndex=");
    int i = this.c;
    localStringBuilder = localStringBuilder.append(i).append(",mValue=");
    float f = this.d;
    localStringBuilder = localStringBuilder.append(f).append(",mStartAngle=");
    f = this.a;
    localStringBuilder = localStringBuilder.append(f).append(",mEndAngle=");
    f = this.b;
    return f;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */