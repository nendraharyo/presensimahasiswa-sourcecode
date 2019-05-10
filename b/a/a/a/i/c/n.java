package b.a.a.a.i.c;

import b.a.a.a.c;
import b.a.a.a.j.e;
import b.a.a.a.j.g;
import b.a.a.a.o.d;
import java.nio.charset.Charset;

public class n
  implements g
{
  private final g a;
  private final r b;
  private final String c;
  
  public n(g paramg, r paramr, String paramString)
  {
    this.a = paramg;
    this.b = paramr;
    if (paramString != null) {}
    for (;;)
    {
      this.c = paramString;
      return;
      Charset localCharset = c.b;
      paramString = localCharset.name();
    }
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(int paramInt)
  {
    this.a.a(paramInt);
    r localr = this.b;
    boolean bool = localr.a();
    if (bool)
    {
      localr = this.b;
      localr.a(paramInt);
    }
  }
  
  public void a(d paramd)
  {
    this.a.a(paramd);
    Object localObject1 = this.b;
    boolean bool = ((r)localObject1).a();
    if (bool)
    {
      localObject1 = new java/lang/String;
      Object localObject2 = paramd.b();
      int i = paramd.c();
      ((String)localObject1).<init>((char[])localObject2, 0, i);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = (String)localObject1 + "\r\n";
      localObject2 = this.b;
      String str = this.c;
      localObject1 = ((String)localObject1).getBytes(str);
      ((r)localObject2).a((byte[])localObject1);
    }
  }
  
  public void a(String paramString)
  {
    this.a.a(paramString);
    Object localObject = this.b;
    boolean bool = ((r)localObject).a();
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + "\r\n";
      r localr = this.b;
      String str = this.c;
      localObject = ((String)localObject).getBytes(str);
      localr.a((byte[])localObject);
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.a(paramArrayOfByte, paramInt1, paramInt2);
    r localr = this.b;
    boolean bool = localr.a();
    if (bool)
    {
      localr = this.b;
      localr.a(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public e b()
  {
    return this.a.b();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */