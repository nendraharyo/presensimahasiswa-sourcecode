package b.a.a.a.b.a;

import b.a.a.a.n;
import java.net.InetAddress;
import java.util.Collection;

public class a
  implements Cloneable
{
  public static final a a;
  private final boolean b;
  private final n c;
  private final InetAddress d;
  private final boolean e;
  private final String f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final int j;
  private final boolean k;
  private final Collection l;
  private final Collection m;
  private final int n;
  private final int o;
  private final int p;
  
  static
  {
    a.a locala = new b/a/a/a/b/a/a$a;
    locala.<init>();
    a = locala.a();
  }
  
  a(boolean paramBoolean1, n paramn, InetAddress paramInetAddress, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt1, boolean paramBoolean6, Collection paramCollection1, Collection paramCollection2, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b = paramBoolean1;
    this.c = paramn;
    this.d = paramInetAddress;
    this.e = paramBoolean2;
    this.f = paramString;
    this.g = paramBoolean3;
    this.h = paramBoolean4;
    this.i = paramBoolean5;
    this.j = paramInt1;
    this.k = paramBoolean6;
    this.l = paramCollection1;
    this.m = paramCollection2;
    this.n = paramInt2;
    this.o = paramInt3;
    this.p = paramInt4;
  }
  
  public static a.a g()
  {
    a.a locala = new b/a/a/a/b/a/a$a;
    locala.<init>();
    return locala;
  }
  
  public String a()
  {
    return this.f;
  }
  
  public boolean b()
  {
    return this.h;
  }
  
  public boolean c()
  {
    return this.i;
  }
  
  public Collection d()
  {
    return this.l;
  }
  
  public Collection e()
  {
    return this.m;
  }
  
  protected a f()
  {
    return (a)super.clone();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append(", expectContinueEnabled=");
    boolean bool1 = this.b;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", proxy=");
    Object localObject = this.c;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", localAddress=");
    localObject = this.d;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", staleConnectionCheckEnabled=");
    bool1 = this.e;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", cookieSpec=");
    localObject = this.f;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", redirectsEnabled=");
    bool1 = this.g;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", relativeRedirectsAllowed=");
    bool1 = this.h;
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", maxRedirects=");
    int i1 = this.j;
    localStringBuilder2.append(i1);
    localStringBuilder2 = localStringBuilder1.append(", circularRedirectsAllowed=");
    boolean bool2 = this.i;
    localStringBuilder2.append(bool2);
    localStringBuilder2 = localStringBuilder1.append(", authenticationEnabled=");
    bool2 = this.k;
    localStringBuilder2.append(bool2);
    localStringBuilder2 = localStringBuilder1.append(", targetPreferredAuthSchemes=");
    localObject = this.l;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", proxyPreferredAuthSchemes=");
    localObject = this.m;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", connectionRequestTimeout=");
    int i2 = this.n;
    localStringBuilder2.append(i2);
    localStringBuilder2 = localStringBuilder1.append(", connectTimeout=");
    i2 = this.o;
    localStringBuilder2.append(i2);
    localStringBuilder2 = localStringBuilder1.append(", socketTimeout=");
    i2 = this.p;
    localStringBuilder2.append(i2);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */