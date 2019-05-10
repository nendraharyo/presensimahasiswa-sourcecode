package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class m
  extends b
{
  private List c;
  private boolean d;
  private boolean e;
  
  public m(a parama)
  {
    super(parama);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.c = localArrayList;
    this.d = false;
    this.e = false;
  }
  
  private double a(double[] paramArrayOfDouble)
  {
    double d1 = paramArrayOfDouble[1];
    double d2 = paramArrayOfDouble[0];
    d1 = Math.abs(d1 - d2);
    d2 = paramArrayOfDouble[3];
    double d3 = paramArrayOfDouble[2];
    d2 = Math.abs(d2 - d3);
    return d1 / d2;
  }
  
  private void a()
  {
    try
    {
      Object localObject1 = this.c;
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (n)localObject1;
        ((n)localObject1).a();
      }
    }
    finally {}
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = true;
    float f2 = Float.MIN_VALUE;
    boolean bool3 = true;
    float f3 = Float.MIN_VALUE;
    int j = 1;
    Object localObject1 = this.a;
    boolean bool4 = localObject1 instanceof z;
    double[] arrayOfDouble1;
    float f4;
    int i2;
    int i3;
    double[] arrayOfDouble2;
    Object localObject2;
    double d1;
    double d3;
    boolean bool5;
    label259:
    double d4;
    if (bool4)
    {
      int m = this.b.ao();
      localObject1 = this.b;
      arrayOfDouble1 = ((ab)localObject1).aa();
      int k;
      if (arrayOfDouble1 != null)
      {
        k = arrayOfDouble1.length;
        int n = 4;
        f4 = 5.6E-45F;
        if (k == n) {
          k = 1;
        }
      }
      for (i2 = k;; i2 = 0)
      {
        localObject1 = (z)this.a;
        i3 = 0;
        if (i3 >= m) {
          break label975;
        }
        arrayOfDouble2 = a(i3);
        localObject2 = ((z)localObject1).b(i3);
        boolean bool6 = this.d;
        if (!bool6) {
          break;
        }
        bool6 = this.e;
        if (!bool6) {
          break;
        }
        arrayOfDouble3 = null;
        d1 = arrayOfDouble2[0];
        d2 = arrayOfDouble2[1];
        bool6 = d1 < d2;
        if (!bool6)
        {
          arrayOfDouble3 = null;
          d1 = localObject2[0];
          d2 = localObject2[1];
          bool6 = d1 < d2;
          if (!bool6) {}
        }
        else
        {
          d1 = arrayOfDouble2[2];
          d2 = arrayOfDouble2[3];
          bool6 = d1 < d2;
          if (bool6) {
            break;
          }
          d1 = localObject2[2];
          int i4 = 3;
          d3 = localObject2[i4];
          bool5 = d1 < d3;
          if (bool5) {
            break;
          }
        }
        return;
        k = 0;
        localObject1 = null;
      }
      a(arrayOfDouble2, i3);
      localObject2 = ((z)localObject1).a(paramFloat1, paramFloat2, i3);
      double[] arrayOfDouble3 = ((z)localObject1).a(paramFloat3, paramFloat4, i3);
      d1 = localObject2[0];
      d2 = arrayOfDouble3[0];
      d2 = d1 - d2;
      d1 = localObject2[1];
      bool5 = true;
      f4 = Float.MIN_VALUE;
      d3 = arrayOfDouble3[bool5];
      d3 = d1 - d3;
      d4 = a(arrayOfDouble2);
      ab localab = this.b;
      boolean bool7 = ((z)localObject1).a(localab);
      if (!bool7) {
        break label1015;
      }
      d1 = -d3 * d4;
      d3 = d2 / d4;
    }
    for (double d2 = d3;; d2 = d3)
    {
      localObject2 = this.b;
      bool5 = ((ab)localObject2).V();
      Object localObject3;
      label464:
      boolean bool8;
      float f5;
      if (bool5) {
        if (arrayOfDouble1 != null) {
          if (bool3)
          {
            d3 = arrayOfDouble1[0];
            f3 = 0.0F;
            localObject3 = null;
            d4 = arrayOfDouble2[0] + d1;
            bool3 = d3 < d4;
            if (!bool3)
            {
              bool3 = true;
              f3 = Float.MIN_VALUE;
              bool8 = bool3;
              f5 = f3;
              label472:
              if (j != 0)
              {
                d3 = arrayOfDouble1[1];
                f3 = Float.MIN_VALUE;
                d4 = arrayOfDouble2[1] + d1;
                bool3 = d3 < d4;
                if (bool3) {
                  break label823;
                }
                bool3 = true;
                f3 = Float.MIN_VALUE;
                label515:
                j = bool3;
              }
              label519:
              if ((i2 != 0) && ((!bool8) || (j == 0))) {
                break label835;
              }
              d3 = arrayOfDouble2[0] + d1;
              d4 = arrayOfDouble2[1];
              d1 += d4;
              localObject3 = this;
              a(d3, d1, i3);
              bool3 = false;
              f3 = 0.0F;
              localObject3 = null;
              this.d = false;
            }
          }
        }
      }
      for (;;)
      {
        label583:
        localObject3 = this.b;
        bool3 = ((ab)localObject3).W();
        if (bool3)
        {
          if (arrayOfDouble1 != null)
          {
            if (bool2)
            {
              d3 = arrayOfDouble1[2];
              f3 = 2.8E-45F;
              d1 = arrayOfDouble2[2] + d2;
              bool3 = d3 < d1;
              if (bool3) {
                break label851;
              }
              bool3 = true;
              f3 = Float.MIN_VALUE;
              label649:
              bool2 = bool3;
              f2 = f3;
            }
            if (bool1)
            {
              d3 = arrayOfDouble1[3];
              f3 = 4.2E-45F;
              d1 = arrayOfDouble2[3] + d2;
              bool3 = d3 < d1;
              if (bool3) {
                break label863;
              }
              bool3 = true;
              f3 = Float.MIN_VALUE;
              label700:
              bool1 = bool3;
              f1 = f3;
            }
          }
          if ((i2 == 0) || ((bool2) && (bool1)))
          {
            d3 = arrayOfDouble2[2] + d2;
            d1 = arrayOfDouble2[3] + d2;
            localObject3 = this;
            b(d3, d1, i3);
            localObject3 = null;
            this.e = false;
            bool3 = bool2;
            f3 = f2;
            bool5 = bool1;
          }
        }
        for (f4 = f1;; f4 = f1)
        {
          i3 += 1;
          bool2 = bool3;
          f2 = f3;
          bool1 = bool5;
          f1 = f4;
          bool3 = bool8;
          f3 = f5;
          break;
          bool3 = false;
          f3 = 0.0F;
          localObject3 = null;
          break label464;
          label823:
          bool3 = false;
          f3 = 0.0F;
          localObject3 = null;
          break label515;
          label835:
          bool3 = true;
          f3 = Float.MIN_VALUE;
          this.d = bool3;
          break label583;
          label851:
          bool3 = false;
          f3 = 0.0F;
          localObject3 = null;
          break label649;
          label863:
          bool3 = false;
          f3 = 0.0F;
          localObject3 = null;
          break label700;
          bool3 = true;
          f3 = Float.MIN_VALUE;
          this.e = bool3;
          bool3 = bool2;
          f3 = f2;
          bool5 = bool1;
        }
        localObject1 = (t)this.a;
        int i = ((t)localObject1).b();
        int i1 = (int)(paramFloat3 - paramFloat1);
        i += i1;
        ((t)localObject1).b(i);
        i = ((t)localObject1).c();
        f4 = paramFloat4 - paramFloat2;
        i1 = (int)f4;
        i += i1;
        ((t)localObject1).c(i);
        label975:
        a();
        break label259;
        bool8 = i;
        f5 = f3;
        break label472;
        bool8 = i;
        f5 = f3;
        break label519;
        bool8 = i;
        f5 = f3;
      }
      label1015:
      d1 = d2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */