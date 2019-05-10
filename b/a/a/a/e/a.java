package b.a.a.a.e;

import b.a.a.a.g.f;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

public class a
  extends f
  implements i, l
{
  protected o a;
  protected final boolean b;
  
  public a(b.a.a.a.k paramk, o paramo, boolean paramBoolean)
  {
    super(paramk);
    b.a.a.a.o.a.a(paramo, "Connection");
    this.a = paramo;
    this.b = paramBoolean;
  }
  
  /* Error */
  private void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	b/a/a/a/e/a:a	Lb/a/a/a/e/o;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +4 -> 10
    //   9: return
    //   10: aload_0
    //   11: getfield 27	b/a/a/a/e/a:b	Z
    //   14: istore_2
    //   15: iload_2
    //   16: ifeq +30 -> 46
    //   19: aload_0
    //   20: getfield 31	b/a/a/a/e/a:wrappedEntity	Lb/a/a/a/k;
    //   23: astore_1
    //   24: aload_1
    //   25: invokestatic 35	b/a/a/a/o/f:a	(Lb/a/a/a/k;)V
    //   28: aload_0
    //   29: getfield 25	b/a/a/a/e/a:a	Lb/a/a/a/e/o;
    //   32: astore_1
    //   33: aload_1
    //   34: invokeinterface 41 1 0
    //   39: aload_0
    //   40: invokevirtual 44	b/a/a/a/e/a:c	()V
    //   43: goto -34 -> 9
    //   46: aload_0
    //   47: getfield 25	b/a/a/a/e/a:a	Lb/a/a/a/e/o;
    //   50: astore_1
    //   51: aload_1
    //   52: invokeinterface 47 1 0
    //   57: goto -18 -> 39
    //   60: astore_1
    //   61: aload_0
    //   62: invokevirtual 44	b/a/a/a/e/a:c	()V
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	a
    //   4	48	1	localObject1	Object
    //   60	6	1	localObject2	Object
    //   14	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   10	14	60	finally
    //   19	23	60	finally
    //   24	28	60	finally
    //   28	32	60	finally
    //   33	39	60	finally
    //   46	50	60	finally
    //   51	57	60	finally
  }
  
  /* Error */
  public boolean a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	b/a/a/a/e/a:a	Lb/a/a/a/e/o;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +27 -> 33
    //   9: aload_0
    //   10: getfield 27	b/a/a/a/e/a:b	Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +24 -> 39
    //   18: aload_1
    //   19: invokevirtual 52	java/io/InputStream:close	()V
    //   22: aload_0
    //   23: getfield 25	b/a/a/a/e/a:a	Lb/a/a/a/e/o;
    //   26: astore_2
    //   27: aload_2
    //   28: invokeinterface 41 1 0
    //   33: aload_0
    //   34: invokevirtual 44	b/a/a/a/e/a:c	()V
    //   37: iconst_0
    //   38: ireturn
    //   39: aload_0
    //   40: getfield 25	b/a/a/a/e/a:a	Lb/a/a/a/e/o;
    //   43: astore_2
    //   44: aload_2
    //   45: invokeinterface 47 1 0
    //   50: goto -17 -> 33
    //   53: astore_2
    //   54: aload_0
    //   55: invokevirtual 44	b/a/a/a/e/a:c	()V
    //   58: aload_2
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	a
    //   0	60	1	paramInputStream	InputStream
    //   4	41	2	localo	o
    //   53	6	2	localObject	Object
    //   13	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	4	53	finally
    //   9	13	53	finally
    //   18	22	53	finally
    //   22	26	53	finally
    //   27	33	53	finally
    //   39	43	53	finally
    //   44	50	53	finally
  }
  
  public void b()
  {
    o localo = this.a;
    if (localo != null) {}
    try
    {
      localo = this.a;
      localo.b();
      return;
    }
    finally
    {
      this.a = null;
    }
  }
  
  public boolean b(InputStream paramInputStream)
  {
    for (;;)
    {
      try
      {
        o localo1 = this.a;
        if (localo1 != null)
        {
          boolean bool1 = this.b;
          if (bool1)
          {
            localo1 = this.a;
            bool2 = localo1.c();
          }
        }
        else
        {
          try
          {
            paramInputStream.close();
            localo1 = this.a;
            localo1.i();
          }
          catch (SocketException localSocketException)
          {
            if (!bool2) {
              continue;
            }
            throw localSocketException;
          }
          return false;
        }
      }
      finally
      {
        boolean bool2;
        c();
      }
      o localo2 = this.a;
      localo2.j();
    }
  }
  
  public void b_()
  {
    d();
  }
  
  protected void c()
  {
    o localo = this.a;
    if (localo != null) {}
    try
    {
      localo = this.a;
      localo.b_();
      return;
    }
    finally
    {
      this.a = null;
    }
  }
  
  public boolean c(InputStream paramInputStream)
  {
    o localo = this.a;
    if (localo != null)
    {
      localo = this.a;
      localo.b();
    }
    return false;
  }
  
  public void consumeContent()
  {
    d();
  }
  
  public InputStream getContent()
  {
    k localk = new b/a/a/a/e/k;
    InputStream localInputStream = this.wrappedEntity.getContent();
    localk.<init>(localInputStream, this);
    return localk;
  }
  
  public boolean isRepeatable()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    super.writeTo(paramOutputStream);
    d();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */