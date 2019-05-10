package b.a.a.a.i.b;

import b.a.a.a.l.e;

public class g
  extends b.a.a.a.l.a
{
  protected final e a;
  protected final e b;
  protected final e c;
  protected final e d;
  
  public g(e parame1, e parame2, e parame3, e parame4)
  {
    this.a = parame1;
    this.b = parame2;
    this.c = parame3;
    this.d = parame4;
  }
  
  public e a(String paramString, Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Setting parameters in a stack is not supported.");
    throw localUnsupportedOperationException;
  }
  
  public Object a(String paramString)
  {
    b.a.a.a.o.a.a(paramString, "Parameter name");
    Object localObject = null;
    e locale = this.d;
    if (locale != null) {
      localObject = this.d.a(paramString);
    }
    if (localObject == null)
    {
      locale = this.c;
      if (locale != null) {
        localObject = this.c.a(paramString);
      }
    }
    if (localObject == null)
    {
      locale = this.b;
      if (locale != null) {
        localObject = this.b.a(paramString);
      }
    }
    if (localObject == null)
    {
      locale = this.a;
      if (locale != null) {
        localObject = this.a.a(paramString);
      }
    }
    return localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */