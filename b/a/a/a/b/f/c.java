package b.a.a.a.b.f;

import b.a.a.a.e.e.a;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class c
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private int g;
  private String h;
  private String i;
  private String j;
  private List k;
  private String l;
  private String m;
  private String n;
  
  public c()
  {
    this.g = -1;
  }
  
  public c(URI paramURI)
  {
    a(paramURI);
  }
  
  private List a(String paramString, Charset paramCharset)
  {
    int i1;
    if (paramString != null)
    {
      i1 = paramString.length();
      if (i1 <= 0) {}
    }
    for (List localList = e.a(paramString, paramCharset);; localList = null)
    {
      return localList;
      i1 = 0;
    }
  }
  
  private void a(URI paramURI)
  {
    Object localObject = paramURI.getScheme();
    this.a = ((String)localObject);
    localObject = paramURI.getRawSchemeSpecificPart();
    this.b = ((String)localObject);
    localObject = paramURI.getRawAuthority();
    this.c = ((String)localObject);
    localObject = paramURI.getHost();
    this.f = ((String)localObject);
    int i1 = paramURI.getPort();
    this.g = i1;
    localObject = paramURI.getRawUserInfo();
    this.e = ((String)localObject);
    localObject = paramURI.getUserInfo();
    this.d = ((String)localObject);
    localObject = paramURI.getRawPath();
    this.i = ((String)localObject);
    localObject = paramURI.getPath();
    this.h = ((String)localObject);
    localObject = paramURI.getRawQuery();
    this.j = ((String)localObject);
    localObject = paramURI.getRawQuery();
    Charset localCharset = b.a.a.a.c.a;
    localObject = a((String)localObject, localCharset);
    this.k = ((List)localObject);
    localObject = paramURI.getRawFragment();
    this.n = ((String)localObject);
    localObject = paramURI.getFragment();
    this.m = ((String)localObject);
  }
  
  private String b(List paramList)
  {
    Charset localCharset = b.a.a.a.c.a;
    return e.a(paramList, localCharset);
  }
  
  private String e()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.a;
    if (localObject1 != null)
    {
      localObject1 = this.a;
      localObject1 = localStringBuilder.append((String)localObject1);
      char c1 = ':';
      ((StringBuilder)localObject1).append(c1);
    }
    localObject1 = this.b;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      localStringBuilder.append((String)localObject1);
      localObject1 = this.n;
      if (localObject1 == null) {
        break label467;
      }
      localObject1 = localStringBuilder.append("#");
      localObject2 = this.n;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localObject1 = this.c;
      if (localObject1 != null)
      {
        localObject1 = localStringBuilder.append("//");
        localObject2 = this.c;
        ((StringBuilder)localObject1).append((String)localObject2);
        label120:
        localObject1 = this.i;
        if (localObject1 == null) {
          break label355;
        }
        localObject1 = i(this.i);
        localStringBuilder.append((String)localObject1);
      }
      for (;;)
      {
        localObject1 = this.j;
        if (localObject1 == null) {
          break label387;
        }
        localObject1 = localStringBuilder.append("?");
        localObject2 = this.j;
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
        localObject1 = this.f;
        if (localObject1 == null) {
          break label120;
        }
        localStringBuilder.append("//");
        localObject1 = this.e;
        if (localObject1 != null)
        {
          localObject1 = this.e;
          localObject1 = localStringBuilder.append((String)localObject1);
          localObject2 = "@";
          ((StringBuilder)localObject1).append((String)localObject2);
          label222:
          localObject1 = this.f;
          boolean bool = a.d((String)localObject1);
          if (!bool) {
            break label341;
          }
          localObject1 = localStringBuilder.append("[");
          localObject2 = this.f;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = "]";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        for (;;)
        {
          int i2 = this.g;
          if (i2 < 0) {
            break;
          }
          localObject1 = localStringBuilder.append(":");
          int i1 = this.g;
          ((StringBuilder)localObject1).append(i1);
          break;
          localObject1 = this.d;
          if (localObject1 == null) {
            break label222;
          }
          localObject1 = this.d;
          localObject1 = f((String)localObject1);
          localObject1 = localStringBuilder.append((String)localObject1);
          localObject2 = "@";
          ((StringBuilder)localObject1).append((String)localObject2);
          break label222;
          label341:
          localObject1 = this.f;
          localStringBuilder.append((String)localObject1);
        }
        label355:
        localObject1 = this.h;
        if (localObject1 != null)
        {
          localObject1 = i(this.h);
          localObject1 = g((String)localObject1);
          localStringBuilder.append((String)localObject1);
        }
      }
      label387:
      localObject1 = this.k;
      if (localObject1 != null)
      {
        localObject1 = localStringBuilder.append("?");
        localObject2 = this.k;
        localObject2 = b((List)localObject2);
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
      }
      localObject1 = this.l;
      if (localObject1 == null) {
        break;
      }
      localObject1 = localStringBuilder.append("?");
      localObject2 = this.l;
      localObject2 = h((String)localObject2);
      ((StringBuilder)localObject1).append((String)localObject2);
      break;
      label467:
      localObject1 = this.m;
      if (localObject1 != null)
      {
        localObject1 = localStringBuilder.append("#");
        localObject2 = this.m;
        localObject2 = h((String)localObject2);
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
  }
  
  private String f(String paramString)
  {
    Charset localCharset = b.a.a.a.c.a;
    return e.b(paramString, localCharset);
  }
  
  private String g(String paramString)
  {
    Charset localCharset = b.a.a.a.c.a;
    return e.d(paramString, localCharset);
  }
  
  private String h(String paramString)
  {
    Charset localCharset = b.a.a.a.c.a;
    return e.c(paramString, localCharset);
  }
  
  private static String i(String paramString)
  {
    if (paramString == null)
    {
      paramString = null;
      return paramString;
    }
    int i1 = 0;
    for (;;)
    {
      int i2 = paramString.length();
      if (i1 < i2)
      {
        i2 = paramString.charAt(i1);
        int i3 = 47;
        if (i2 == i3) {}
      }
      else
      {
        i2 = 1;
        if (i1 <= i2) {
          break;
        }
        i1 += -1;
        paramString = paramString.substring(i1);
        break;
      }
      i1 += 1;
    }
  }
  
  public c a(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1;
    }
    this.g = paramInt;
    this.b = null;
    this.c = null;
    return this;
  }
  
  public c a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public c a(List paramList)
  {
    Object localObject = this.k;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.k = ((List)localObject);
    }
    this.k.addAll(paramList);
    this.j = null;
    this.b = null;
    this.l = null;
    return this;
  }
  
  public URI a()
  {
    URI localURI = new java/net/URI;
    String str = e();
    localURI.<init>(str);
    return localURI;
  }
  
  public c b(String paramString)
  {
    this.d = paramString;
    this.b = null;
    this.c = null;
    this.e = null;
    return this;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public c c(String paramString)
  {
    this.f = paramString;
    this.b = null;
    this.c = null;
    return this;
  }
  
  public String c()
  {
    return this.f;
  }
  
  public c d(String paramString)
  {
    this.h = paramString;
    this.b = null;
    this.i = null;
    return this;
  }
  
  public String d()
  {
    return this.h;
  }
  
  public c e(String paramString)
  {
    this.m = paramString;
    this.n = null;
    return this;
  }
  
  public String toString()
  {
    return e();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\f\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */