package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.io.Serializable;
import java.util.List;

public class ac
  implements Serializable
{
  private String a;
  private final k b;
  private double c;
  private double d;
  private double e;
  private double f;
  private final int g;
  private List h;
  private final k i;
  
  public double a(int paramInt)
  {
    try
    {
      Object localObject1 = this.b;
      localObject1 = ((k)localObject1).b(paramInt);
      localObject1 = (Double)localObject1;
      double d1 = ((Double)localObject1).doubleValue();
      return d1;
    }
    finally {}
  }
  
  public int a()
  {
    return this.g;
  }
  
  public int a(double paramDouble)
  {
    k localk = this.b;
    Double localDouble = Double.valueOf(paramDouble);
    return localk.a(localDouble);
  }
  
  /* Error */
  public java.util.SortedMap a(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload 5
    //   4: ifeq +165 -> 169
    //   7: aload_0
    //   8: getfield 22	id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/ac:b	Lid/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/k;
    //   11: astore 6
    //   13: dload_1
    //   14: invokestatic 39	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   17: astore 7
    //   19: aload 6
    //   21: aload 7
    //   23: invokevirtual 46	id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/k:headMap	(Ljava/lang/Object;)Ljava/util/SortedMap;
    //   26: astore 6
    //   28: aload 6
    //   30: invokeinterface 52 1 0
    //   35: istore 8
    //   37: iload 8
    //   39: ifne +25 -> 64
    //   42: aload 6
    //   44: invokeinterface 56 1 0
    //   49: astore 6
    //   51: aload 6
    //   53: checkcast 29	java/lang/Double
    //   56: astore 6
    //   58: aload 6
    //   60: invokevirtual 33	java/lang/Double:doubleValue	()D
    //   63: dstore_1
    //   64: aload_0
    //   65: getfield 22	id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/ac:b	Lid/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/k;
    //   68: astore 6
    //   70: dload_3
    //   71: invokestatic 39	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   74: astore 7
    //   76: aload 6
    //   78: aload 7
    //   80: invokevirtual 59	id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/k:tailMap	(Ljava/lang/Object;)Ljava/util/SortedMap;
    //   83: astore 6
    //   85: aload 6
    //   87: invokeinterface 52 1 0
    //   92: istore 8
    //   94: iload 8
    //   96: ifne +73 -> 169
    //   99: aload 6
    //   101: invokeinterface 63 1 0
    //   106: astore 6
    //   108: aload 6
    //   110: invokeinterface 69 1 0
    //   115: astore 7
    //   117: aload 7
    //   119: invokeinterface 74 1 0
    //   124: astore 6
    //   126: aload 6
    //   128: checkcast 29	java/lang/Double
    //   131: astore 6
    //   133: aload 7
    //   135: invokeinterface 77 1 0
    //   140: istore 9
    //   142: iload 9
    //   144: ifeq +69 -> 213
    //   147: aload 7
    //   149: invokeinterface 74 1 0
    //   154: astore 6
    //   156: aload 6
    //   158: checkcast 29	java/lang/Double
    //   161: astore 6
    //   163: aload 6
    //   165: invokevirtual 33	java/lang/Double:doubleValue	()D
    //   168: dstore_3
    //   169: dload_1
    //   170: dload_3
    //   171: dcmpg
    //   172: istore 10
    //   174: iload 10
    //   176: ifgt +52 -> 228
    //   179: aload_0
    //   180: getfield 22	id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/ac:b	Lid/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/k;
    //   183: astore 6
    //   185: dload_1
    //   186: invokestatic 39	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   189: astore 7
    //   191: dload_3
    //   192: invokestatic 39	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   195: astore 11
    //   197: aload 6
    //   199: aload 7
    //   201: aload 11
    //   203: invokevirtual 81	id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/k:subMap	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    //   206: astore 6
    //   208: aload_0
    //   209: monitorexit
    //   210: aload 6
    //   212: areturn
    //   213: aload 6
    //   215: invokevirtual 33	java/lang/Double:doubleValue	()D
    //   218: dstore 12
    //   220: dload_3
    //   221: dload 12
    //   223: dadd
    //   224: dstore_3
    //   225: goto -56 -> 169
    //   228: new 83	java/util/TreeMap
    //   231: astore 6
    //   233: aload 6
    //   235: invokespecial 87	java/util/TreeMap:<init>	()V
    //   238: goto -30 -> 208
    //   241: astore 6
    //   243: aload_0
    //   244: monitorexit
    //   245: aload 6
    //   247: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	ac
    //   0	248	1	paramDouble1	double
    //   0	248	3	paramDouble2	double
    //   0	248	5	paramBoolean	boolean
    //   11	223	6	localObject1	Object
    //   241	5	6	localObject2	Object
    //   17	183	7	localObject3	Object
    //   35	60	8	bool1	boolean
    //   140	3	9	bool2	boolean
    //   172	3	10	bool3	boolean
    //   195	7	11	localDouble	Double
    //   218	4	12	d1	double
    // Exception table:
    //   from	to	target	type
    //   7	11	241	finally
    //   13	17	241	finally
    //   21	26	241	finally
    //   28	35	241	finally
    //   42	49	241	finally
    //   51	56	241	finally
    //   58	63	241	finally
    //   64	68	241	finally
    //   70	74	241	finally
    //   78	83	241	finally
    //   85	92	241	finally
    //   99	106	241	finally
    //   108	115	241	finally
    //   117	124	241	finally
    //   126	131	241	finally
    //   133	140	241	finally
    //   147	154	241	finally
    //   156	161	241	finally
    //   163	168	241	finally
    //   179	183	241	finally
    //   185	189	241	finally
    //   191	195	241	finally
    //   201	206	241	finally
    //   213	218	241	finally
    //   228	231	241	finally
    //   233	238	241	finally
  }
  
  public double b(int paramInt)
  {
    return ((Double)this.i.a(paramInt)).doubleValue();
  }
  
  public String b()
  {
    return this.a;
  }
  
  public double c(int paramInt)
  {
    return ((Double)this.i.b(paramInt)).doubleValue();
  }
  
  public int c()
  {
    return this.h.size();
  }
  
  public int d()
  {
    try
    {
      k localk = this.b;
      int j = localk.size();
      return j;
    }
    finally {}
  }
  
  public String d(int paramInt)
  {
    return (String)this.h.get(paramInt);
  }
  
  public double e()
  {
    return this.c;
  }
  
  public double f()
  {
    return this.e;
  }
  
  public double g()
  {
    return this.d;
  }
  
  public double h()
  {
    return this.f;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */