package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

public class b
{
  protected a a;
  protected ab b;
  
  public b(a parama)
  {
    this.a = parama;
    boolean bool = parama instanceof z;
    if (bool)
    {
      parama = (z)parama;
      ab localab = parama.a();
      this.b = localab;
    }
  }
  
  protected void a(double paramDouble1, double paramDouble2, int paramInt)
  {
    this.b.a(paramDouble1, paramInt);
    this.b.b(paramDouble2, paramInt);
  }
  
  public void a(double[] paramArrayOfDouble, int paramInt)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = this.a;
    boolean bool1 = localObject instanceof z;
    if (bool1)
    {
      localObject = ((z)this.a).b(paramInt);
      if (localObject != null)
      {
        ab localab = this.b;
        boolean bool2 = localab.g(paramInt);
        double d1;
        if (!bool2)
        {
          d1 = localObject[0];
          paramArrayOfDouble[0] = d1;
          localab = this.b;
          d1 = paramArrayOfDouble[0];
          localab.a(d1, paramInt);
        }
        localab = this.b;
        bool2 = localab.i(paramInt);
        if (!bool2)
        {
          d1 = localObject[k];
          paramArrayOfDouble[k] = d1;
          localab = this.b;
          d1 = paramArrayOfDouble[k];
          localab.b(d1, paramInt);
        }
        localab = this.b;
        bool2 = localab.k(paramInt);
        if (!bool2)
        {
          d1 = localObject[j];
          paramArrayOfDouble[j] = d1;
          localab = this.b;
          d1 = paramArrayOfDouble[j];
          localab.c(d1, paramInt);
        }
        localab = this.b;
        bool2 = localab.m(paramInt);
        if (!bool2)
        {
          double d2 = localObject[i];
          paramArrayOfDouble[i] = d2;
          localObject = this.b;
          d1 = paramArrayOfDouble[i];
          ((ab)localObject).d(d1, paramInt);
        }
      }
    }
  }
  
  public double[] a(int paramInt)
  {
    double d1 = this.b.f(paramInt);
    double d2 = this.b.h(paramInt);
    double d3 = this.b.j(paramInt);
    double d4 = this.b.l(paramInt);
    double[] arrayOfDouble = new double[4];
    arrayOfDouble[0] = d1;
    arrayOfDouble[1] = d2;
    arrayOfDouble[2] = d3;
    arrayOfDouble[3] = d4;
    return arrayOfDouble;
  }
  
  protected void b(double paramDouble1, double paramDouble2, int paramInt)
  {
    this.b.c(paramDouble1, paramInt);
    this.b.d(paramDouble2, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */