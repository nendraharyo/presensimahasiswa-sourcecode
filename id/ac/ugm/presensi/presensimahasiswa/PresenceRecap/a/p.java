package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p
  implements Serializable
{
  private List a;
  private int b;
  private int c;
  private int d;
  
  public p()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.a = localArrayList;
  }
  
  public double a(r paramr)
  {
    float f1 = paramr.a();
    int i = this.c;
    float f2 = i;
    f1 -= f2;
    double d1 = f1;
    float f3 = paramr.b();
    int j = this.d;
    float f4 = j;
    f3 = -(f3 - f4);
    d1 = Math.atan2(f3, d1);
    double d2 = 0.0D;
    boolean bool = d1 < d2;
    if (bool) {}
    for (d1 = Math.abs(d1);; d1 = d2 - d1)
    {
      return Math.toDegrees(d1);
      d2 = 6.283185307179586D;
    }
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public void a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    List localList = this.a;
    q localq = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/q;
    localq.<init>(paramInt, paramFloat1, paramFloat2, paramFloat3);
    localList.add(localq);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public boolean a(int paramInt)
  {
    List localList = this.a;
    int i = localList.size();
    if (i == paramInt) {
      i = 1;
    }
    for (;;)
    {
      return i;
      i = 0;
      localList = null;
    }
  }
  
  public boolean b(r paramr)
  {
    double d1 = 2.0D;
    float f1 = this.c;
    float f2 = paramr.a();
    f1 -= f2;
    double d2 = Math.pow(f1, d1);
    float f3 = this.d;
    float f4 = paramr.b();
    f3 -= f4;
    double d3 = Math.pow(f3, d1);
    d2 += d3;
    int i = this.b;
    int j = this.b;
    i *= j;
    d3 = i;
    boolean bool = d2 < d3;
    if (!bool) {
      bool = true;
    }
    for (f1 = Float.MIN_VALUE;; f1 = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  public v c(r paramr)
  {
    boolean bool1 = b(paramr);
    Object localObject2;
    if (bool1)
    {
      double d1 = a(paramr);
      Object localObject1 = this.a;
      localObject2 = ((List)localObject1).iterator();
      boolean bool2;
      do
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (q)((Iterator)localObject2).next();
        bool2 = ((q)localObject1).a(d1);
      } while (!bool2);
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/v;
      int i = ((q)localObject1).a();
      float f1 = ((q)localObject1).b();
      double d2 = f1;
      float f2 = ((q)localObject1).b();
      double d3 = f2;
      ((v)localObject2).<init>(0, i, d2, d3);
    }
    for (;;)
    {
      return (v)localObject2;
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */