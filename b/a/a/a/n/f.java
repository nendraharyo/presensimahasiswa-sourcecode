package b.a.a.a.n;

import b.a.a.a.j;
import b.a.a.a.n;
import b.a.a.a.q;

public class f
  implements e
{
  private final e a;
  
  public f()
  {
    a locala = new b/a/a/a/n/a;
    locala.<init>();
    this.a = locala;
  }
  
  public f(e parame)
  {
    this.a = parame;
  }
  
  public static f b(e parame)
  {
    Object localObject = "HTTP context";
    b.a.a.a.o.a.a(parame, (String)localObject);
    boolean bool = parame instanceof f;
    if (bool) {}
    for (parame = (f)parame;; parame = (e)localObject)
    {
      return parame;
      localObject = new b/a/a/a/n/f;
      ((f)localObject).<init>(parame);
    }
  }
  
  public Object a(String paramString)
  {
    return this.a.a(paramString);
  }
  
  public Object a(String paramString, Class paramClass)
  {
    b.a.a.a.o.a.a(paramClass, "Attribute class");
    Object localObject = a(paramString);
    if (localObject == null) {}
    for (localObject = null;; localObject = paramClass.cast(localObject)) {
      return localObject;
    }
  }
  
  public void a(String paramString, Object paramObject)
  {
    this.a.a(paramString, paramObject);
  }
  
  public j l()
  {
    return (j)a("http.connection", j.class);
  }
  
  public q m()
  {
    return (q)a("http.request", q.class);
  }
  
  public boolean n()
  {
    Class localClass = Boolean.class;
    Boolean localBoolean = (Boolean)a("http.request_sent", localClass);
    boolean bool;
    if (localBoolean != null)
    {
      bool = localBoolean.booleanValue();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localBoolean = null;
    }
  }
  
  public n o()
  {
    return (n)a("http.target_host", n.class);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */