package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Typeface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class g
  implements Serializable
{
  private static final Typeface c = Typeface.create(Typeface.SERIF, 0);
  private int A;
  private int[] B;
  private float C;
  private boolean D;
  private boolean E;
  private boolean F;
  private float G;
  private boolean H;
  private float I;
  private boolean J;
  private int K;
  private boolean L;
  private boolean M;
  private float N;
  private String a = "";
  private float b = 15.0F;
  private String d;
  private int e;
  private Typeface f;
  private int g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private int o;
  private float p;
  private boolean q;
  private float r;
  private boolean s;
  private boolean t;
  private boolean u;
  private float v;
  private boolean w;
  private boolean x;
  private List y;
  private boolean z;
  
  public g()
  {
    Object localObject = c.toString();
    this.d = ((String)localObject);
    this.e = 0;
    this.i = bool;
    this.j = i1;
    this.k = i1;
    this.l = bool;
    this.m = bool;
    this.n = bool;
    this.o = i1;
    this.p = 10.0F;
    this.q = bool;
    this.r = 12.0F;
    this.s = false;
    this.t = false;
    this.u = false;
    this.w = false;
    this.x = false;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.y = ((List)localObject);
    this.z = bool;
    this.A = 0;
    localObject = new int[4];
    Object tmp143_142 = localObject;
    Object tmp144_143 = tmp143_142;
    Object tmp144_143 = tmp143_142;
    tmp144_143[0] = 20;
    tmp144_143[1] = 30;
    tmp144_143[2] = 10;
    tmp144_143[3] = 20;
    this.B = ((int[])localObject);
    this.C = 1.0F;
    this.D = bool;
    this.E = bool;
    this.F = false;
    this.G = 1.5F;
    this.H = false;
    float f1 = this.C;
    this.I = f1;
    this.J = false;
    this.K = 15;
    this.N = 0.0F;
  }
  
  public float A()
  {
    return this.C;
  }
  
  public float B()
  {
    return this.I;
  }
  
  public boolean C()
  {
    return this.E;
  }
  
  public boolean D()
  {
    return this.F;
  }
  
  public boolean E()
  {
    return this.H;
  }
  
  public float F()
  {
    return this.G;
  }
  
  public boolean G()
  {
    return this.D;
  }
  
  public boolean H()
  {
    return this.J;
  }
  
  public int I()
  {
    return this.K;
  }
  
  public int J()
  {
    return this.A;
  }
  
  public int[] K()
  {
    return this.B;
  }
  
  public boolean L()
  {
    return this.M;
  }
  
  public float M()
  {
    return this.N;
  }
  
  public boolean N()
  {
    return this.L;
  }
  
  public w a(int paramInt)
  {
    return (w)this.y.get(paramInt);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(float paramFloat)
  {
    this.C = paramFloat;
  }
  
  public void a(w paramw)
  {
    this.y.add(paramw);
  }
  
  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
    this.m = paramBoolean;
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.l = paramBoolean1;
    this.m = paramBoolean2;
  }
  
  public float b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public int c()
  {
    return this.y.size();
  }
  
  public void c(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }
  
  public int d()
  {
    return this.g;
  }
  
  public void d(boolean paramBoolean)
  {
    b(paramBoolean);
    c(paramBoolean);
  }
  
  public void e(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public boolean e()
  {
    return this.h;
  }
  
  public int f()
  {
    return this.j;
  }
  
  public int g()
  {
    return this.k;
  }
  
  public int h()
  {
    return this.o;
  }
  
  public float i()
  {
    return this.p;
  }
  
  public boolean j()
  {
    return this.i;
  }
  
  public boolean k()
  {
    boolean bool = this.l;
    if (!bool)
    {
      bool = this.m;
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean l()
  {
    return this.l;
  }
  
  public boolean m()
  {
    return this.m;
  }
  
  public boolean n()
  {
    return this.n;
  }
  
  public boolean o()
  {
    return this.t;
  }
  
  public boolean p()
  {
    return this.u;
  }
  
  public float q()
  {
    return this.v;
  }
  
  public boolean r()
  {
    return this.w;
  }
  
  public boolean s()
  {
    return this.x;
  }
  
  public boolean t()
  {
    return this.q;
  }
  
  public boolean u()
  {
    return this.s;
  }
  
  public String v()
  {
    return this.d;
  }
  
  public int w()
  {
    return this.e;
  }
  
  public Typeface x()
  {
    return this.f;
  }
  
  public float y()
  {
    return this.r;
  }
  
  public boolean z()
  {
    return this.z;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */