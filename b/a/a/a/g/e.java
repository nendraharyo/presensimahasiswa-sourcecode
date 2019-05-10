package b.a.a.a.g;

import b.a.a.a.c;
import b.a.a.a.o.a;
import b.a.a.a.o.d;
import b.a.a.a.o.h;
import b.a.a.a.y;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

public final class e
  implements Serializable
{
  public static final e a;
  public static final e b;
  public static final e c;
  public static final e d;
  public static final e e;
  public static final e f;
  public static final e g;
  public static final e h;
  public static final e i;
  public static final e j;
  public static final e k;
  public static final e l = a("*/*", null);
  public static final e m = j;
  public static final e n = d;
  private final String o;
  private final Charset p;
  private final y[] q;
  
  static
  {
    Charset localCharset = c.c;
    a = a("application/atom+xml", localCharset);
    localCharset = c.c;
    b = a("application/x-www-form-urlencoded", localCharset);
    localCharset = c.a;
    c = a("application/json", localCharset);
    ((Charset)null);
    d = a("application/octet-stream", null);
    localCharset = c.c;
    e = a("application/svg+xml", localCharset);
    localCharset = c.c;
    f = a("application/xhtml+xml", localCharset);
    localCharset = c.c;
    g = a("application/xml", localCharset);
    localCharset = c.c;
    h = a("multipart/form-data", localCharset);
    localCharset = c.c;
    i = a("text/html", localCharset);
    localCharset = c.c;
    j = a("text/plain", localCharset);
    localCharset = c.c;
    k = a("text/xml", localCharset);
    ((Charset)null);
  }
  
  e(String paramString, Charset paramCharset)
  {
    this.o = paramString;
    this.p = paramCharset;
    this.q = null;
  }
  
  public static e a(String paramString1, String paramString2)
  {
    boolean bool = h.b(paramString2);
    if (!bool) {}
    for (Charset localCharset = Charset.forName(paramString2);; localCharset = null)
    {
      return a(paramString1, localCharset);
      bool = false;
    }
  }
  
  public static e a(String paramString, Charset paramCharset)
  {
    String str = (String)a.b(paramString, "MIME type");
    Object localObject = Locale.ENGLISH;
    str = str.toLowerCase((Locale)localObject);
    a.a(a(str), "MIME type may not contain reserved characters");
    localObject = new b/a/a/a/g/e;
    ((e)localObject).<init>(str, paramCharset);
    return (e)localObject;
  }
  
  private static boolean a(String paramString)
  {
    boolean bool = false;
    int i1 = 0;
    int i2 = paramString.length();
    if (i1 < i2)
    {
      i2 = paramString.charAt(i1);
      int i3 = 34;
      if (i2 != i3)
      {
        i3 = 44;
        if (i2 != i3)
        {
          i3 = 59;
          if (i2 != i3) {
            break label52;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      label52:
      i1 += 1;
      break;
      bool = true;
    }
  }
  
  public Charset a()
  {
    return this.p;
  }
  
  public String toString()
  {
    d locald = new b/a/a/a/o/d;
    int i1 = 64;
    locald.<init>(i1);
    Object localObject = this.o;
    locald.a((String)localObject);
    localObject = this.q;
    if (localObject != null)
    {
      locald.a("; ");
      localObject = b.a.a.a.k.e.b;
      y[] arrayOfy = this.q;
      ((b.a.a.a.k.e)localObject).a(locald, arrayOfy, false);
    }
    for (;;)
    {
      return locald.toString();
      localObject = this.p;
      if (localObject != null)
      {
        locald.a("; charset=");
        localObject = this.p.name();
        locald.a((String)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\g\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */