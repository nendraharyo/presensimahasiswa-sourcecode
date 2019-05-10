package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ae
  extends b
{
  private boolean c;
  private float d;
  private List e;
  private boolean f;
  private boolean g;
  
  public ae(a parama, boolean paramBoolean, float paramFloat)
  {
    super(parama);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.e = localArrayList;
    this.f = false;
    this.g = false;
    this.c = paramBoolean;
    a(paramFloat);
  }
  
  private void a(af paramaf)
  {
    try
    {
      Object localObject1 = this.e;
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (ag)localObject1;
        ((ag)localObject1).a(paramaf);
      }
    }
    finally {}
  }
  
  public void a()
  {
    try
    {
      Object localObject1 = this.e;
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (ag)localObject1;
        ((ag)localObject1).a();
      }
    }
    finally {}
  }
  
  public void a(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public void b(int paramInt)
  {
    Object localObject = this.a;
    int i = localObject instanceof z;
    int i2;
    double[] arrayOfDouble;
    double d1;
    double d2;
    double d3;
    double d4;
    float f1;
    double d5;
    double d6;
    double d7;
    int i4;
    float f2;
    label249:
    label305:
    int j;
    if (i != 0)
    {
      localObject = this.b;
      int i1 = ((ab)localObject).ao();
      i2 = 0;
      if (i2 >= i1) {
        break label974;
      }
      localObject = a(i2);
      a((double[])localObject, i2);
      arrayOfDouble = this.b.ab();
      d1 = localObject[0];
      d2 = localObject[1];
      d3 = (d1 + d2) / 2.0D;
      d1 = localObject[2];
      d2 = localObject[3];
      d4 = (d1 + d2) / 2.0D;
      d1 = localObject[1];
      d2 = localObject[0];
      d1 -= d2;
      d2 = localObject[3];
      int i3 = 2;
      f1 = 2.8E-45F;
      d5 = localObject[i3];
      d2 -= d5;
      d5 = d1 / 2.0D;
      d5 = d3 - d5;
      d6 = d1 / 2.0D + d3;
      d7 = d2 / 2.0D;
      d7 = d4 - d7;
      double d8 = d2 / 2.0D + d4;
      if (i2 == 0)
      {
        if (arrayOfDouble != null)
        {
          i4 = 0;
          double d9 = arrayOfDouble[0];
          i = d5 < d9;
          if (i > 0)
          {
            f2 = Float.MIN_VALUE;
            d5 = arrayOfDouble[1];
            i = d6 < d5;
            if (i < 0) {}
          }
          else
          {
            i = 1;
            f2 = Float.MIN_VALUE;
            this.f = i;
            if (arrayOfDouble == null) {
              break label725;
            }
            f2 = 2.8E-45F;
            d5 = arrayOfDouble[2];
            i = d7 < d5;
            if (i > 0)
            {
              f2 = 4.2E-45F;
              d5 = arrayOfDouble[3];
              i = d8 < d5;
              if (i < 0) {
                break label725;
              }
            }
            i = 1;
            f2 = Float.MIN_VALUE;
            this.g = i;
          }
        }
      }
      else
      {
        i = this.c;
        if (i == 0) {
          break label785;
        }
        localObject = this.b;
        i = ((ab)localObject).X();
        if (i == 0) {
          break label1046;
        }
        i = 1;
        f2 = Float.MIN_VALUE;
        if ((paramInt != i) && (paramInt != 0)) {
          break label1046;
        }
        j = this.f;
        if (j == 0) {
          break label735;
        }
        f2 = this.d;
        i3 = 1065353216;
        f1 = 1.0F;
        j = f2 < f1;
        if (j >= 0) {
          break label735;
        }
        d5 = d1;
      }
    }
    for (;;)
    {
      label385:
      ab localab = this.b;
      boolean bool4 = localab.Y();
      float f3;
      boolean bool5;
      if (bool4)
      {
        int i5 = 2;
        f3 = 2.8E-45F;
        if ((paramInt == i5) || (paramInt == 0))
        {
          bool5 = this.g;
          if (bool5)
          {
            f3 = this.d;
            float f4 = 1.0F;
            bool5 = f3 < f4;
            if (bool5) {
              d6 = d5;
            }
          }
        }
      }
      for (;;)
      {
        label457:
        double d10;
        if (arrayOfDouble != null)
        {
          d5 = this.b.am();
          bool5 = true;
          f3 = Float.MIN_VALUE;
          d1 = arrayOfDouble[bool5];
          d7 = arrayOfDouble[0];
          d1 -= d7;
          d1 = Math.min(d5, d1);
          localObject = this.b;
          d5 = ((ab)localObject).an();
          d7 = arrayOfDouble[3];
          i4 = 2;
          d10 = arrayOfDouble[i4];
          d10 = d7 - d10;
        }
        for (d5 = Math.min(d5, d10);; d5 = ((ab)localObject).an())
        {
          d6 = Math.max(d6, d1);
          d10 = Math.max(d2, d5);
          localObject = this.b;
          j = ((ab)localObject).X();
          if (j != 0)
          {
            j = 1;
            f2 = Float.MIN_VALUE;
            if ((paramInt == j) || (paramInt == 0))
            {
              d5 = d6 / 2.0D;
              d1 = d3 - d5;
              d5 = d6 / 2.0D;
              d2 = d3 + d5;
              a(d1, d2, i2);
            }
          }
          localObject = this.b;
          boolean bool1 = ((ab)localObject).Y();
          if (bool1)
          {
            k = 2;
            f2 = 2.8E-45F;
            if ((paramInt == k) || (paramInt == 0))
            {
              d5 = d10 / 2.0D;
              d1 = d4 - d5;
              d5 = d10 / 2.0D;
              d2 = d4 + d5;
              b(d1, d2, i2);
            }
          }
          i2 += 1;
          break;
          int k = 0;
          f2 = 0.0F;
          localObject = null;
          break label249;
          label725:
          k = 0;
          f2 = 0.0F;
          localObject = null;
          break label305;
          label735:
          f2 = this.d;
          d5 = f2;
          d5 = d1 / d5;
          break label385;
          f3 = this.d;
          d1 = f3;
          d1 = d2 / d1;
          d2 = d1;
          d6 = d5;
          break label457;
          label785:
          localObject = this.b;
          int m = ((ab)localObject).X();
          if (m != 0)
          {
            m = this.f;
            if (m == 0)
            {
              m = 1;
              f2 = Float.MIN_VALUE;
              if ((paramInt == m) || (paramInt == 0))
              {
                f2 = this.d;
                d5 = f2;
                d1 *= d5;
              }
            }
          }
          localObject = this.b;
          boolean bool2 = ((ab)localObject).Y();
          if (!bool2) {
            break label1032;
          }
          bool2 = this.g;
          if (bool2) {
            break label1032;
          }
          int n = 2;
          f2 = 2.8E-45F;
          if ((paramInt != n) && (paramInt != 0)) {
            break label1032;
          }
          f2 = this.d;
          d5 = f2 * d2;
          d2 = d5;
          d6 = d1;
          break label457;
          d1 = this.b.am();
          localObject = this.b;
        }
        localObject = ((t)this.a).a();
        boolean bool3 = this.c;
        if (bool3)
        {
          f1 = ((g)localObject).A();
          f3 = this.d;
          f1 *= f3;
          ((g)localObject).a(f1);
        }
        for (;;)
        {
          label974:
          localObject = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/af;
          bool3 = this.c;
          f3 = this.d;
          ((af)localObject).<init>(bool3, f3);
          a((af)localObject);
          return;
          f1 = ((g)localObject).A();
          f3 = this.d;
          f1 /= f3;
          ((g)localObject).a(f1);
        }
        label1032:
        d6 = d1;
        continue;
        d6 = d5;
      }
      label1046:
      d5 = d1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\ae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */