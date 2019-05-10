package b.a.a.a.i.c;

import b.a.a.a.c;
import b.a.a.a.j.b;
import b.a.a.a.j.e;
import b.a.a.a.j.f;
import b.a.a.a.o.d;
import java.nio.charset.Charset;

public class m
  implements b, f
{
  private final f a;
  private final b b;
  private final r c;
  private final String d;
  
  public m(f paramf, r paramr, String paramString)
  {
    this.a = paramf;
    boolean bool = paramf instanceof b;
    if (bool)
    {
      paramf = (b)paramf;
      this.b = paramf;
      this.c = paramr;
      if (paramString == null) {
        break label50;
      }
    }
    for (;;)
    {
      this.d = paramString;
      return;
      paramf = null;
      break;
      label50:
      Charset localCharset = c.b;
      paramString = localCharset.name();
    }
  }
  
  public int a()
  {
    f localf = this.a;
    int i = localf.a();
    r localr = this.c;
    boolean bool = localr.a();
    if (bool)
    {
      int j = -1;
      if (i != j)
      {
        localr = this.c;
        localr.b(i);
      }
    }
    return i;
  }
  
  public int a(d paramd)
  {
    f localf = this.a;
    int i = localf.a(paramd);
    Object localObject1 = this.c;
    boolean bool = ((r)localObject1).a();
    if ((bool) && (i >= 0))
    {
      int j = paramd.c() - i;
      Object localObject2 = new java/lang/String;
      Object localObject3 = paramd.b();
      ((String)localObject2).<init>((char[])localObject3, j, i);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = (String)localObject2 + "\r\n";
      localObject2 = this.c;
      localObject3 = this.d;
      localObject1 = ((String)localObject1).getBytes((String)localObject3);
      ((r)localObject2).b((byte[])localObject1);
    }
    return i;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f localf = this.a;
    int i = localf.a(paramArrayOfByte, paramInt1, paramInt2);
    r localr = this.c;
    boolean bool = localr.a();
    if ((bool) && (i > 0))
    {
      localr = this.c;
      localr.b(paramArrayOfByte, paramInt1, i);
    }
    return i;
  }
  
  public boolean a(int paramInt)
  {
    return this.a.a(paramInt);
  }
  
  public e b()
  {
    return this.a.b();
  }
  
  public boolean c()
  {
    b localb = this.b;
    boolean bool;
    if (localb != null)
    {
      localb = this.b;
      bool = localb.c();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localb = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */