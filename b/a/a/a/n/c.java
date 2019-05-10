package b.a.a.a.n;

import b.a.a.a.o.a;

public final class c
  implements e
{
  private final e a;
  private final e b;
  
  public c(e parame1, e parame2)
  {
    e locale = (e)a.a(parame1, "HTTP context");
    this.a = locale;
    this.b = parame2;
  }
  
  public Object a(String paramString)
  {
    Object localObject = this.a.a(paramString);
    if (localObject == null) {
      localObject = this.b.a(paramString);
    }
    return localObject;
  }
  
  public void a(String paramString, Object paramObject)
  {
    this.a.a(paramString, paramObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[local: ");
    e locale = this.a;
    localStringBuilder2.append(locale);
    localStringBuilder2 = localStringBuilder1.append("defaults: ");
    locale = this.b;
    localStringBuilder2.append(locale);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */