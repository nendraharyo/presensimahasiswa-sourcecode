package b.a.a.a.b.f;

import b.a.a.a.n;
import b.a.a.a.o.a;
import b.a.a.a.o.h;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;

public class d
{
  public static URI a(URI paramURI)
  {
    Object localObject = "URI";
    a.a(paramURI, (String)localObject);
    boolean bool1 = paramURI.isOpaque();
    if (bool1) {}
    for (;;)
    {
      return paramURI;
      localObject = new b/a/a/a/b/f/c;
      ((c)localObject).<init>(paramURI);
      String str = ((c)localObject).b();
      if (str != null) {
        ((c)localObject).b(null);
      }
      str = ((c)localObject).d();
      boolean bool2 = h.a(str);
      if (bool2)
      {
        str = "/";
        ((c)localObject).d(str);
      }
      str = ((c)localObject).c();
      if (str != null)
      {
        str = ((c)localObject).c();
        Locale localLocale = Locale.ENGLISH;
        str = str.toLowerCase(localLocale);
        ((c)localObject).c(str);
      }
      ((c)localObject).e(null);
      paramURI = ((c)localObject).a();
    }
  }
  
  public static URI a(URI paramURI, n paramn, boolean paramBoolean)
  {
    Object localObject = "URI";
    a.a(paramURI, (String)localObject);
    boolean bool1 = paramURI.isOpaque();
    if (bool1) {
      return paramURI;
    }
    localObject = new b/a/a/a/b/f/c;
    ((c)localObject).<init>(paramURI);
    String str;
    if (paramn != null)
    {
      str = paramn.c();
      ((c)localObject).a(str);
      str = paramn.a();
      ((c)localObject).c(str);
      int i = paramn.b();
      ((c)localObject).a(i);
    }
    for (;;)
    {
      if (paramBoolean) {
        ((c)localObject).e(null);
      }
      str = ((c)localObject).d();
      boolean bool2 = h.a(str);
      if (bool2)
      {
        str = "/";
        ((c)localObject).d(str);
      }
      paramURI = ((c)localObject).a();
      break;
      ((c)localObject).a(null);
      ((c)localObject).c(null);
      int j = -1;
      ((c)localObject).a(j);
    }
  }
  
  public static URI a(URI paramURI1, URI paramURI2)
  {
    a.a(paramURI1, "Base URI");
    a.a(paramURI2, "Reference URI");
    Object localObject = paramURI2.toString();
    String str = "?";
    boolean bool = ((String)localObject).startsWith(str);
    if (bool)
    {
      localObject = b(paramURI1, paramURI2);
      return (URI)localObject;
    }
    int j = ((String)localObject).length();
    if (j == 0)
    {
      j = 1;
      bool = j;
    }
    for (;;)
    {
      if (bool)
      {
        localObject = "#";
        paramURI2 = URI.create((String)localObject);
      }
      localObject = paramURI1.resolve(paramURI2);
      if (bool)
      {
        localObject = ((URI)localObject).toString();
        i = ((String)localObject).indexOf('#');
        localObject = URI.create(((String)localObject).substring(0, i));
      }
      localObject = c((URI)localObject);
      break;
      int i = 0;
      str = null;
    }
  }
  
  public static n b(URI paramURI)
  {
    Object localObject1 = null;
    if (paramURI == null) {
      return (n)localObject1;
    }
    boolean bool1 = paramURI.isAbsolute();
    int j;
    Object localObject2;
    int k;
    int m;
    int n;
    Object localObject4;
    if (bool1)
    {
      j = paramURI.getPort();
      localObject2 = paramURI.getHost();
      if (localObject2 == null)
      {
        localObject2 = paramURI.getAuthority();
        if (localObject2 != null)
        {
          k = ((String)localObject2).indexOf('@');
          if (k < 0) {
            break label293;
          }
          m = ((String)localObject2).length();
          n = k + 1;
          if (m > n)
          {
            k += 1;
            localObject4 = ((String)localObject2).substring(k);
          }
        }
      }
    }
    for (;;)
    {
      int i;
      String str;
      if (localObject4 != null)
      {
        i = 58;
        int i1 = ((String)localObject4).indexOf(i);
        if (i1 >= 0)
        {
          k = i1 + 1;
          i = k;
          m = 0;
          str = null;
          for (;;)
          {
            int i2 = ((String)localObject4).length();
            if (i >= i2) {
              break;
            }
            boolean bool3 = Character.isDigit(((String)localObject4).charAt(i));
            if (!bool3) {
              break;
            }
            m += 1;
            i += 1;
          }
          n = 0;
          localObject4 = null;
          continue;
          if (m > 0)
          {
            i = k + m;
            try
            {
              localObject2 = ((String)localObject4).substring(k, i);
              i = Integer.parseInt((String)localObject2);
            }
            catch (NumberFormatException localNumberFormatException)
            {
              for (;;)
              {
                label207:
                Object localObject5;
                i = j;
              }
            }
            localObject5 = ((String)localObject4).substring(0, i1);
            j = i;
          }
        }
      }
      Object localObject3;
      for (localObject2 = localObject5;; localObject3 = localObject4)
      {
        str = paramURI.getScheme();
        boolean bool2 = h.b((CharSequence)localObject2);
        if (!bool2)
        {
          localObject5 = new b/a/a/a/n;
          ((n)localObject5).<init>((String)localObject2, j, str);
        }
        for (localObject2 = localObject5;; localObject3 = null)
        {
          localObject1 = localObject2;
          break;
          i = 0;
        }
        i = j;
        break label207;
      }
      label293:
      localObject4 = localObject3;
    }
  }
  
  private static URI b(URI paramURI1, URI paramURI2)
  {
    int i = 63;
    Object localObject1 = paramURI1.toString();
    int j = ((String)localObject1).indexOf(i);
    int k = -1;
    if (j > k)
    {
      j = 0;
      localObject2 = null;
      k = ((String)localObject1).indexOf(i);
      localObject1 = ((String)localObject1).substring(0, k);
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
    localObject2 = paramURI2.toString();
    return URI.create((String)localObject2);
  }
  
  private static URI c(URI paramURI)
  {
    char c1 = '/';
    int i = paramURI.isOpaque();
    Object localObject1;
    if (i == 0)
    {
      localObject1 = paramURI.getAuthority();
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = paramURI;
    }
    for (;;)
    {
      return (URI)localObject1;
      i = paramURI.isAbsolute();
      Object localObject2 = "Base URI must be absolute";
      a.a(i, (String)localObject2);
      localObject1 = paramURI.getPath();
      Object localObject4;
      label83:
      Object localObject5;
      String str;
      boolean bool2;
      if (localObject1 == null)
      {
        localObject1 = "";
        localObject2 = localObject1;
        localObject3 = ((String)localObject2).split("/");
        localObject4 = new java/util/Stack;
        ((Stack)localObject4).<init>();
        int m = localObject3.length;
        i = 0;
        localObject1 = null;
        if (i >= m) {
          break label193;
        }
        localObject5 = localObject3[i];
        int i1 = ((String)localObject5).length();
        if (i1 != 0)
        {
          str = ".";
          bool2 = str.equals(localObject5);
          if (!bool2) {
            break label143;
          }
        }
      }
      label143:
      boolean bool3;
      for (;;)
      {
        int j;
        i += 1;
        break label83;
        localObject1 = paramURI.getPath();
        localObject2 = localObject1;
        break;
        str = "..";
        bool2 = str.equals(localObject5);
        if (bool2)
        {
          bool3 = ((Stack)localObject4).isEmpty();
          if (!bool3) {
            ((Stack)localObject4).pop();
          }
        }
        else
        {
          ((Stack)localObject4).push(localObject5);
        }
      }
      label193:
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject3 = ((Stack)localObject4).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)((Iterator)localObject3).next();
        localObject4 = localStringBuilder.append(c1);
        ((StringBuilder)localObject4).append((String)localObject1);
      }
      int k = ((String)localObject2).lastIndexOf(c1);
      int i2 = ((String)localObject2).length() + -1;
      if (k == i2) {
        localStringBuilder.append(c1);
      }
      try
      {
        localObject1 = paramURI.getScheme();
        localObject2 = Locale.ENGLISH;
        localObject2 = ((String)localObject1).toLowerCase((Locale)localObject2);
        localObject1 = paramURI.getAuthority();
        localObject3 = Locale.ENGLISH;
        localObject3 = ((String)localObject1).toLowerCase((Locale)localObject3);
        localObject1 = new java/net/URI;
        localObject4 = localStringBuilder.toString();
        int n = 0;
        localStringBuilder = null;
        bool3 = false;
        localObject5 = null;
        ((URI)localObject1).<init>((String)localObject2, (String)localObject3, (String)localObject4, null, null);
        localObject2 = paramURI.getQuery();
        if (localObject2 == null)
        {
          localObject2 = paramURI.getFragment();
          if (localObject2 == null) {
            continue;
          }
        }
        localObject2 = new java/lang/StringBuilder;
        localObject1 = ((URI)localObject1).toASCIIString();
        ((StringBuilder)localObject2).<init>((String)localObject1);
        localObject1 = paramURI.getQuery();
        if (localObject1 != null)
        {
          k = 63;
          localObject1 = ((StringBuilder)localObject2).append(k);
          localObject3 = paramURI.getRawQuery();
          ((StringBuilder)localObject1).append((String)localObject3);
        }
        localObject1 = paramURI.getFragment();
        if (localObject1 != null)
        {
          char c2 = '#';
          localObject1 = ((StringBuilder)localObject2).append(c2);
          localObject3 = paramURI.getRawFragment();
          ((StringBuilder)localObject1).append((String)localObject3);
        }
        localObject1 = ((StringBuilder)localObject2).toString();
        localObject1 = URI.create((String)localObject1);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        localObject2 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject2).<init>(localURISyntaxException);
        throw ((Throwable)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\f\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */