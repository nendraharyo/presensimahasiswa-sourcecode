package b.a.a.a.k;

import b.a.a.a.h;
import b.a.a.a.p;

public abstract class a
  implements p
{
  protected q headergroup;
  protected b.a.a.a.l.e params;
  
  protected a()
  {
    this(null);
  }
  
  protected a(b.a.a.a.l.e parame)
  {
    q localq = new b/a/a/a/k/q;
    localq.<init>();
    this.headergroup = localq;
    this.params = parame;
  }
  
  public void addHeader(b.a.a.a.e parame)
  {
    this.headergroup.a(parame);
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    b.a.a.a.o.a.a(paramString1, "Header name");
    q localq = this.headergroup;
    b localb = new b/a/a/a/k/b;
    localb.<init>(paramString1, paramString2);
    localq.a(localb);
  }
  
  public boolean containsHeader(String paramString)
  {
    return this.headergroup.d(paramString);
  }
  
  public b.a.a.a.e[] getAllHeaders()
  {
    return this.headergroup.b();
  }
  
  public b.a.a.a.e getFirstHeader(String paramString)
  {
    return this.headergroup.b(paramString);
  }
  
  public b.a.a.a.e[] getHeaders(String paramString)
  {
    return this.headergroup.a(paramString);
  }
  
  public b.a.a.a.e getLastHeader(String paramString)
  {
    return this.headergroup.c(paramString);
  }
  
  public b.a.a.a.l.e getParams()
  {
    Object localObject = this.params;
    if (localObject == null)
    {
      localObject = new b/a/a/a/l/b;
      ((b.a.a.a.l.b)localObject).<init>();
      this.params = ((b.a.a.a.l.e)localObject);
    }
    return this.params;
  }
  
  public h headerIterator()
  {
    return this.headergroup.c();
  }
  
  public h headerIterator(String paramString)
  {
    return this.headergroup.e(paramString);
  }
  
  public void removeHeader(b.a.a.a.e parame)
  {
    this.headergroup.b(parame);
  }
  
  public void removeHeaders(String paramString)
  {
    if (paramString == null) {
      return;
    }
    h localh = this.headergroup.c();
    for (;;)
    {
      boolean bool = localh.hasNext();
      if (!bool) {
        break;
      }
      String str = localh.a().c();
      bool = paramString.equalsIgnoreCase(str);
      if (bool) {
        localh.remove();
      }
    }
  }
  
  public void setHeader(b.a.a.a.e parame)
  {
    this.headergroup.c(parame);
  }
  
  public void setHeader(String paramString1, String paramString2)
  {
    b.a.a.a.o.a.a(paramString1, "Header name");
    q localq = this.headergroup;
    b localb = new b/a/a/a/k/b;
    localb.<init>(paramString1, paramString2);
    localq.c(localb);
  }
  
  public void setHeaders(b.a.a.a.e[] paramArrayOfe)
  {
    this.headergroup.a(paramArrayOfe);
  }
  
  public void setParams(b.a.a.a.l.e parame)
  {
    b.a.a.a.l.e locale = (b.a.a.a.l.e)b.a.a.a.o.a.a(parame, "HTTP parameters");
    this.params = locale;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */