package b.a.a.a.k;

import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.q;
import b.a.a.a.v;

public class g
  extends a
  implements q
{
  private final String a;
  private final String b;
  private ae c;
  
  public g(ae paramae)
  {
    Object localObject = (ae)b.a.a.a.o.a.a(paramae, "Request line");
    this.c = ((ae)localObject);
    localObject = paramae.a();
    this.a = ((String)localObject);
    localObject = paramae.c();
    this.b = ((String)localObject);
  }
  
  public g(String paramString1, String paramString2, ac paramac)
  {
    this(localm);
  }
  
  public ac getProtocolVersion()
  {
    return getRequestLine().b();
  }
  
  public ae getRequestLine()
  {
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = new b/a/a/a/k/m;
      String str1 = this.a;
      String str2 = this.b;
      v localv = v.c;
      ((m)localObject).<init>(str1, str2, localv);
      this.c = ((ae)localObject);
    }
    return this.c;
  }
  
  public String toString()
  {
    char c1 = ' ';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.a;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c1);
    localObject = this.b;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c1);
    localObject = this.headergroup;
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */