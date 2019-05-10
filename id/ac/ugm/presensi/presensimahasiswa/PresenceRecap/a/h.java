package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

public class h
  extends b
{
  public h(a parama)
  {
    super(parama);
  }
  
  public void a()
  {
    Object localObject1 = this.a;
    int i = localObject1 instanceof z;
    if (i != 0)
    {
      localObject1 = ((z)this.a).b();
      if (localObject1 != null) {}
    }
    for (;;)
    {
      return;
      int k = this.b.ao();
      localObject1 = this.b;
      i = ((ab)localObject1).ae();
      ab localab;
      int m;
      Object localObject2;
      int j;
      if (i != 0)
      {
        i = 0;
        localObject1 = null;
        while (i < k)
        {
          localab = this.b;
          m = localab.q(i);
          if (m != 0)
          {
            localab = this.b;
            localObject2 = this.b.r(i);
            localab.a((double[])localObject2, i);
          }
          i += 1;
        }
      }
      else
      {
        localObject1 = ((z)this.a).b();
        localObject2 = ((aa)localObject1).b();
        int i1 = localObject2.length;
        if (i1 > 0)
        {
          j = 0;
          localObject1 = null;
          while (j < k)
          {
            double[] arrayOfDouble1 = new double[4];
            double[] tmp154_152 = arrayOfDouble1;
            double[] tmp155_154 = tmp154_152;
            double[] tmp155_154 = tmp154_152;
            tmp155_154[0] = Double.MAX_VALUE;
            tmp155_154[1] = -1.7976931348623157E308D;
            tmp155_154[2] = Double.MAX_VALUE;
            tmp155_154[3] = -1.7976931348623157E308D;
            m = 0;
            f = 0.0F;
            localab = null;
            while (m < i1)
            {
              Object localObject3 = localObject2[m];
              int i2 = ((ac)localObject3).a();
              if (j == i2)
              {
                localObject3 = null;
                d1 = arrayOfDouble1[0];
                d2 = localObject2[m].e();
                d1 = Math.min(d1, d2);
                arrayOfDouble1[0] = d1;
                d1 = arrayOfDouble1[1];
                d2 = localObject2[m].g();
                d1 = Math.max(d1, d2);
                arrayOfDouble1[1] = d1;
                d1 = arrayOfDouble1[2];
                d2 = localObject2[m].f();
                d1 = Math.min(d1, d2);
                arrayOfDouble1[2] = d1;
                i3 = 3;
                i4 = 3;
                d1 = arrayOfDouble1[i4];
                Object localObject4 = localObject2[m];
                d2 = ((ac)localObject4).h();
                d1 = Math.max(d1, d2);
                arrayOfDouble1[i3] = d1;
              }
              m += 1;
            }
            double d3 = arrayOfDouble1[1];
            double d1 = arrayOfDouble1[0];
            d3 = Math.abs(d3 - d1) / 40.0D;
            d1 = arrayOfDouble1[3];
            int n = 2;
            f = 2.8E-45F;
            double d2 = arrayOfDouble1[n];
            d1 = Math.abs(d1 - d2);
            d2 = 40.0D;
            d1 /= d2;
            localab = this.b;
            int i5 = 4;
            double[] arrayOfDouble2 = new double[i5];
            double d4 = arrayOfDouble1[0] - d3;
            arrayOfDouble2[0] = d4;
            int i6 = 1;
            int i7 = 1;
            d4 = arrayOfDouble1[i7];
            d3 += d4;
            arrayOfDouble2[i6] = d3;
            d4 = arrayOfDouble1[2] - d1;
            arrayOfDouble2[2] = d4;
            int i3 = 3;
            int i4 = 3;
            d4 = arrayOfDouble1[i4];
            d1 += d4;
            arrayOfDouble2[i3] = d1;
            localab.a(arrayOfDouble2, j);
            j += 1;
          }
          continue;
          localObject1 = ((t)this.a).a();
          float f = ((g)localObject1).B();
          ((g)localObject1).a(f);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */