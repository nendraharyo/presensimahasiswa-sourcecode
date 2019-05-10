package b.a.a.a.k;

import b.a.a.a.ac;
import b.a.a.a.ad;
import b.a.a.a.af;
import b.a.a.a.k;
import b.a.a.a.s;
import b.a.a.a.v;
import java.util.Locale;

public class h
  extends a
  implements s
{
  private af a;
  private ac b;
  private int c;
  private String d;
  private k e;
  private final ad f;
  private Locale g;
  
  public h(af paramaf, ad paramad, Locale paramLocale)
  {
    Object localObject = (af)b.a.a.a.o.a.a(paramaf, "Status line");
    this.a = ((af)localObject);
    localObject = paramaf.a();
    this.b = ((ac)localObject);
    int i = paramaf.b();
    this.c = i;
    localObject = paramaf.c();
    this.d = ((String)localObject);
    this.f = paramad;
    this.g = paramLocale;
  }
  
  public af a()
  {
    Object localObject = this.a;
    n localn;
    int i;
    if (localObject == null)
    {
      localn = new b/a/a/a/k/n;
      localObject = this.b;
      if (localObject == null) {
        break label67;
      }
      localObject = this.b;
      i = this.c;
      str = this.d;
      if (str == null) {
        break label74;
      }
    }
    label67:
    label74:
    int j;
    for (String str = this.d;; str = a(j))
    {
      localn.<init>((ac)localObject, i, str);
      this.a = localn;
      return this.a;
      localObject = v.c;
      break;
      j = this.c;
    }
  }
  
  protected String a(int paramInt)
  {
    Object localObject = this.f;
    ad localad;
    if (localObject != null)
    {
      localad = this.f;
      localObject = this.g;
      if (localObject != null) {
        localObject = this.g;
      }
    }
    for (localObject = localad.a(paramInt, (Locale)localObject);; localObject = null)
    {
      return (String)localObject;
      localObject = Locale.getDefault();
      break;
    }
  }
  
  public void a(k paramk)
  {
    this.e = paramk;
  }
  
  public k b()
  {
    return this.e;
  }
  
  public ac getProtocolVersion()
  {
    return this.b;
  }
  
  public String toString()
  {
    char c1 = ' ';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = a();
    localStringBuilder.append(localObject);
    localStringBuilder.append(c1);
    localObject = this.headergroup;
    localStringBuilder.append(localObject);
    localObject = this.e;
    if (localObject != null)
    {
      localStringBuilder.append(c1);
      localObject = this.e;
      localStringBuilder.append(localObject);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */