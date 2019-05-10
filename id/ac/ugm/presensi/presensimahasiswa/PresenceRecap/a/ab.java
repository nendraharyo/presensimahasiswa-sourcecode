package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Color;
import android.graphics.Paint.Align;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ab
  extends g
{
  private Paint.Align A;
  private Paint.Align[] B;
  private float C;
  private float D;
  private float E;
  private Paint.Align[] F;
  private int G;
  private int[] H;
  private boolean I;
  private NumberFormat J;
  private NumberFormat[] K;
  private float L;
  private double M;
  private double N;
  private String a = "";
  private String[] b;
  private float c = 12.0F;
  private double[] d;
  private double[] e;
  private double[] f;
  private double[] g;
  private int h = 5;
  private int i = 5;
  private ab.a j;
  private Map k;
  private Map l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private double q;
  private int r;
  private double[] s;
  private double[] t;
  private float u;
  private float v;
  private Map w;
  private float x;
  private int[] y;
  private int z;
  
  public ab()
  {
    this(1);
  }
  
  public ab(int paramInt)
  {
    Object localObject = ab.a.a;
    this.j = ((ab.a)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.k = ((Map)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.l = ((Map)localObject);
    this.m = bool;
    this.n = bool;
    this.o = bool;
    this.p = bool;
    this.q = d1;
    this.r = 0;
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.w = ((Map)localObject);
    this.x = 3.0F;
    localObject = Paint.Align.CENTER;
    this.A = ((Paint.Align)localObject);
    this.C = 0.0F;
    this.D = 0.0F;
    this.E = 2.0F;
    this.G = i1;
    localObject = new int[bool];
    localObject[0] = i1;
    this.H = ((int[])localObject);
    this.I = bool;
    this.L = -1.0F;
    this.M = d1;
    this.N = d1;
    this.z = paramInt;
    c(paramInt);
  }
  
  public boolean C()
  {
    boolean bool = X();
    if (!bool)
    {
      bool = Y();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean G()
  {
    boolean bool = V();
    if (!bool)
    {
      bool = W();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public ab.a O()
  {
    return this.j;
  }
  
  public String P()
  {
    return this.a;
  }
  
  public String Q()
  {
    return e(0);
  }
  
  public float R()
  {
    return this.c;
  }
  
  public int S()
  {
    return this.h;
  }
  
  public Double[] T()
  {
    try
    {
      Object localObject1 = this.k;
      localObject1 = ((Map)localObject1).keySet();
      Double[] arrayOfDouble = null;
      arrayOfDouble = new Double[0];
      localObject1 = ((Set)localObject1).toArray(arrayOfDouble);
      localObject1 = (Double[])localObject1;
      return (Double[])localObject1;
    }
    finally {}
  }
  
  public int U()
  {
    return this.i;
  }
  
  public boolean V()
  {
    return this.m;
  }
  
  public boolean W()
  {
    return this.n;
  }
  
  public boolean X()
  {
    return this.o;
  }
  
  public boolean Y()
  {
    return this.p;
  }
  
  public int Z()
  {
    return this.r;
  }
  
  public String a(Double paramDouble)
  {
    try
    {
      Object localObject1 = this.k;
      localObject1 = ((Map)localObject1).get(paramDouble);
      localObject1 = (String)localObject1;
      return (String)localObject1;
    }
    finally {}
  }
  
  public String a(Double paramDouble, int paramInt)
  {
    try
    {
      Object localObject1 = this.l;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject1 = ((Map)localObject1).get(localInteger);
      localObject1 = (Map)localObject1;
      localObject1 = ((Map)localObject1).get(paramDouble);
      localObject1 = (String)localObject1;
      return (String)localObject1;
    }
    finally {}
  }
  
  public void a(double paramDouble, int paramInt)
  {
    boolean bool = g(paramInt);
    if (!bool)
    {
      Object localObject = this.w;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject = (double[])((Map)localObject).get(localInteger);
      localInteger = null;
      localObject[0] = paramDouble;
    }
    this.d[paramInt] = paramDouble;
  }
  
  public void a(double[] paramArrayOfDouble, int paramInt)
  {
    double d1 = paramArrayOfDouble[0];
    a(d1, paramInt);
    d1 = paramArrayOfDouble[1];
    b(d1, paramInt);
    d1 = paramArrayOfDouble[2];
    c(d1, paramInt);
    d1 = paramArrayOfDouble[3];
    d(d1, paramInt);
  }
  
  public double[] aa()
  {
    return this.s;
  }
  
  public double[] ab()
  {
    return this.t;
  }
  
  public float ac()
  {
    return this.u;
  }
  
  public float ad()
  {
    return this.v;
  }
  
  public boolean ae()
  {
    return q(0);
  }
  
  public int af()
  {
    return this.G;
  }
  
  public Paint.Align ag()
  {
    return this.A;
  }
  
  public float ah()
  {
    return this.C;
  }
  
  public float ai()
  {
    return this.D;
  }
  
  public float aj()
  {
    return this.E;
  }
  
  public NumberFormat ak()
  {
    return al();
  }
  
  public NumberFormat al()
  {
    return this.J;
  }
  
  public double am()
  {
    return this.M;
  }
  
  public double an()
  {
    return this.N;
  }
  
  public int ao()
  {
    return this.z;
  }
  
  public void b(double paramDouble, int paramInt)
  {
    boolean bool = i(paramInt);
    if (!bool)
    {
      Object localObject = this.w;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject = (double[])((Map)localObject).get(localInteger);
      int i1 = 1;
      localObject[i1] = paramDouble;
    }
    this.e[paramInt] = paramDouble;
  }
  
  public void c(double paramDouble, int paramInt)
  {
    boolean bool = k(paramInt);
    if (!bool)
    {
      Object localObject = this.w;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject = (double[])((Map)localObject).get(localInteger);
      int i1 = 2;
      localObject[i1] = paramDouble;
    }
    this.f[paramInt] = paramDouble;
  }
  
  public void c(int paramInt)
  {
    int i1 = 200;
    Object localObject1 = new String[paramInt];
    this.b = ((String[])localObject1);
    localObject1 = new Paint.Align[paramInt];
    this.B = ((Paint.Align[])localObject1);
    localObject1 = new Paint.Align[paramInt];
    this.F = ((Paint.Align[])localObject1);
    localObject1 = new int[paramInt];
    this.H = ((int[])localObject1);
    localObject1 = new NumberFormat[paramInt];
    this.K = ((NumberFormat[])localObject1);
    localObject1 = new double[paramInt];
    this.d = ((double[])localObject1);
    localObject1 = new double[paramInt];
    this.e = ((double[])localObject1);
    localObject1 = new double[paramInt];
    this.f = ((double[])localObject1);
    localObject1 = new double[paramInt];
    this.g = ((double[])localObject1);
    localObject1 = new int[paramInt];
    this.y = ((int[])localObject1);
    int i2 = 0;
    localObject1 = null;
    while (i2 < paramInt)
    {
      this.H[i2] = -3355444;
      Object localObject2 = this.K;
      NumberFormat localNumberFormat = NumberFormat.getNumberInstance();
      localObject2[i2] = localNumberFormat;
      localObject2 = this.y;
      int i3 = Color.argb(75, i1, i1, i1);
      localObject2[i2] = i3;
      d(i2);
      i2 += 1;
    }
  }
  
  public void d(double paramDouble, int paramInt)
  {
    boolean bool = m(paramInt);
    if (!bool)
    {
      Object localObject = this.w;
      Integer localInteger = Integer.valueOf(paramInt);
      localObject = (double[])((Map)localObject).get(localInteger);
      int i1 = 3;
      localObject[i1] = paramDouble;
    }
    this.g[paramInt] = paramDouble;
  }
  
  public void d(int paramInt)
  {
    double d1 = Double.MAX_VALUE;
    double d2 = -1.7976931348623157E308D;
    this.d[paramInt] = d1;
    this.e[paramInt] = d2;
    this.f[paramInt] = d1;
    this.g[paramInt] = d2;
    Object localObject1 = new double[4];
    d2 = this.d[paramInt];
    localObject1[0] = d2;
    d2 = this.e[paramInt];
    localObject1[1] = d2;
    d2 = this.f[paramInt];
    localObject1[2] = d2;
    d2 = this.g[paramInt];
    localObject1[3] = d2;
    Object localObject2 = this.w;
    Object localObject3 = Integer.valueOf(paramInt);
    ((Map)localObject2).put(localObject3, localObject1);
    this.b[paramInt] = "";
    localObject1 = this.l;
    localObject2 = Integer.valueOf(paramInt);
    localObject3 = new java/util/HashMap;
    ((HashMap)localObject3).<init>();
    ((Map)localObject1).put(localObject2, localObject3);
    localObject1 = this.B;
    localObject2 = Paint.Align.CENTER;
    localObject1[paramInt] = localObject2;
    localObject1 = this.F;
    localObject2 = Paint.Align.LEFT;
    localObject1[paramInt] = localObject2;
  }
  
  public String e(int paramInt)
  {
    return this.b[paramInt];
  }
  
  public double f(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public boolean g(int paramInt)
  {
    double[] arrayOfDouble = this.d;
    double d1 = arrayOfDouble[paramInt];
    double d2 = Double.MAX_VALUE;
    boolean bool = d1 < d2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfDouble = null;
    }
  }
  
  public double h(int paramInt)
  {
    return this.e[paramInt];
  }
  
  public boolean i(int paramInt)
  {
    double[] arrayOfDouble = this.e;
    double d1 = arrayOfDouble[paramInt];
    double d2 = -1.7976931348623157E308D;
    boolean bool = d1 < d2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfDouble = null;
    }
  }
  
  public double j(int paramInt)
  {
    return this.f[paramInt];
  }
  
  public boolean k(int paramInt)
  {
    double[] arrayOfDouble = this.f;
    double d1 = arrayOfDouble[paramInt];
    double d2 = Double.MAX_VALUE;
    boolean bool = d1 < d2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfDouble = null;
    }
  }
  
  public double l(int paramInt)
  {
    return this.g[paramInt];
  }
  
  public boolean m(int paramInt)
  {
    double[] arrayOfDouble = this.g;
    double d1 = arrayOfDouble[paramInt];
    double d2 = -1.7976931348623157E308D;
    boolean bool = d1 < d2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfDouble = null;
    }
  }
  
  public Double[] n(int paramInt)
  {
    try
    {
      Object localObject1 = this.l;
      Object localObject3 = Integer.valueOf(paramInt);
      localObject1 = ((Map)localObject1).get(localObject3);
      localObject1 = (Map)localObject1;
      localObject1 = ((Map)localObject1).keySet();
      localObject3 = null;
      localObject3 = new Double[0];
      localObject1 = ((Set)localObject1).toArray((Object[])localObject3);
      localObject1 = (Double[])localObject1;
      return (Double[])localObject1;
    }
    finally {}
  }
  
  public void o(int paramInt)
  {
    this.r = paramInt;
  }
  
  public int p(int paramInt)
  {
    return this.y[paramInt];
  }
  
  public boolean q(int paramInt)
  {
    Object localObject = this.w;
    Integer localInteger = Integer.valueOf(paramInt);
    localObject = ((Map)localObject).get(localInteger);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public double[] r(int paramInt)
  {
    Map localMap = this.w;
    Integer localInteger = Integer.valueOf(paramInt);
    return (double[])localMap.get(localInteger);
  }
  
  public int s(int paramInt)
  {
    return this.H[paramInt];
  }
  
  public Paint.Align t(int paramInt)
  {
    return this.B[paramInt];
  }
  
  public Paint.Align u(int paramInt)
  {
    return this.F[paramInt];
  }
  
  public NumberFormat v(int paramInt)
  {
    return this.K[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */