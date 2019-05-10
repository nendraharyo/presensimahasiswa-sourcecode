package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.l;
import b.a.a.a.k.u;
import b.a.a.a.o.a;
import b.a.a.a.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class m
  extends p
{
  private static final String[] a;
  private final String[] b;
  
  static
  {
    String[] arrayOfString = new String[14];
    arrayOfString[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    arrayOfString[1] = "EEE, dd-MMM-yy HH:mm:ss zzz";
    arrayOfString[2] = "EEE MMM d HH:mm:ss yyyy";
    arrayOfString[3] = "EEE, dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[4] = "EEE, dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[5] = "EEE, dd MMM yy HH:mm:ss z";
    arrayOfString[6] = "EEE dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[7] = "EEE dd MMM yyyy HH:mm:ss z";
    arrayOfString[8] = "EEE dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[9] = "EEE dd-MMM-yy HH:mm:ss z";
    arrayOfString[10] = "EEE dd MMM yy HH:mm:ss z";
    arrayOfString[11] = "EEE,dd-MMM-yy HH:mm:ss z";
    arrayOfString[12] = "EEE,dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[13] = "EEE, dd-MM-yyyy HH:mm:ss z";
    a = arrayOfString;
  }
  
  public m()
  {
    this(null, locala);
  }
  
  public m(String[] paramArrayOfString)
  {
    this(paramArrayOfString, locala);
  }
  
  public m(String[] paramArrayOfString, n.a parama)
  {
    if (paramArrayOfString != null) {
      localObject1 = (String[])paramArrayOfString.clone();
    }
    for (this.b = ((String[])localObject1);; this.b = ((String[])localObject1))
    {
      localObject1 = m.2.a;
      int i = parama.ordinal();
      int j = localObject1[i];
      switch (j)
      {
      default: 
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("Unknown security level");
        throw ((Throwable)localObject1);
        localObject1 = a;
      }
    }
    Object localObject1 = "path";
    Object localObject2 = new b/a/a/a/i/d/i;
    ((i)localObject2).<init>();
    a((String)localObject1, (b.a.a.a.f.c)localObject2);
    for (;;)
    {
      localObject2 = new b/a/a/a/i/d/f;
      ((f)localObject2).<init>();
      a("domain", (b.a.a.a.f.c)localObject2);
      localObject2 = new b/a/a/a/i/d/h;
      ((h)localObject2).<init>();
      a("max-age", (b.a.a.a.f.c)localObject2);
      localObject2 = new b/a/a/a/i/d/j;
      ((j)localObject2).<init>();
      a("secure", (b.a.a.a.f.c)localObject2);
      localObject2 = new b/a/a/a/i/d/e;
      ((e)localObject2).<init>();
      a("comment", (b.a.a.a.f.c)localObject2);
      localObject2 = new b/a/a/a/i/d/g;
      String[] arrayOfString = this.b;
      ((g)localObject2).<init>(arrayOfString);
      a("expires", (b.a.a.a.f.c)localObject2);
      localObject2 = new b/a/a/a/i/d/o;
      ((o)localObject2).<init>();
      a("version", (b.a.a.a.f.c)localObject2);
      return;
      localObject1 = "path";
      localObject2 = new b/a/a/a/i/d/m$1;
      ((m.1)localObject2).<init>(this);
      a((String)localObject1, (b.a.a.a.f.c)localObject2);
    }
  }
  
  private static boolean b(String paramString)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = "\"";
      bool = paramString.startsWith(str);
      if (bool)
      {
        str = "\"";
        bool = paramString.endsWith(str);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public int a()
  {
    return 0;
  }
  
  public List a(b.a.a.a.e parame, b.a.a.a.f.e parame1)
  {
    boolean bool1 = true;
    a.a(parame, "Header");
    a.a(parame1, "Cookie origin");
    Object localObject1 = parame.c();
    String str = "Set-Cookie";
    boolean bool2 = ((String)localObject1).equalsIgnoreCase(str);
    Object localObject2;
    if (!bool2)
    {
      localObject1 = new b/a/a/a/f/l;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unrecognized cookie header '");
      str = parame.toString();
      localObject2 = str + "'";
      ((l)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject3 = parame.e();
    int j = localObject3.length;
    int k = 0;
    Object localObject4 = null;
    int m = 0;
    str = null;
    bool2 = false;
    localObject1 = null;
    Object localObject5;
    while (k < j)
    {
      localObject5 = localObject3[k];
      Object localObject6 = ((b.a.a.a.f)localObject5).a("version");
      if (localObject6 != null) {
        bool2 = bool1;
      }
      localObject6 = "expires";
      localObject5 = ((b.a.a.a.f)localObject5).a((String)localObject6);
      if (localObject5 != null) {
        m = bool1;
      }
      k += 1;
    }
    if ((m != 0) || (!bool2))
    {
      localObject4 = t.a;
      bool2 = parame instanceof b.a.a.a.d;
      if (bool2)
      {
        localObject1 = parame;
        localObject2 = ((b.a.a.a.d)parame).a();
        localObject1 = new b/a/a/a/k/u;
        parame = (b.a.a.a.d)parame;
        int n = parame.b();
        j = ((b.a.a.a.o.d)localObject2).c();
        ((u)localObject1).<init>(n, j);
      }
      for (;;)
      {
        localObject1 = ((t)localObject4).a((b.a.a.a.o.d)localObject2, (u)localObject1);
        localObject2 = ((b.a.a.a.f)localObject1).a();
        localObject4 = ((b.a.a.a.f)localObject1).b();
        if (localObject2 != null)
        {
          boolean bool3 = b.a.a.a.o.h.b((CharSequence)localObject2);
          if (!bool3) {
            break;
          }
        }
        localObject1 = new b/a/a/a/f/l;
        ((l)localObject1).<init>("Cookie name may not be empty");
        throw ((Throwable)localObject1);
        localObject1 = parame.d();
        if (localObject1 == null)
        {
          localObject1 = new b/a/a/a/f/l;
          ((l)localObject1).<init>("Header value is null");
          throw ((Throwable)localObject1);
        }
        localObject2 = new b/a/a/a/o/d;
        int i1 = ((String)localObject1).length();
        ((b.a.a.a.o.d)localObject2).<init>(i1);
        ((b.a.a.a.o.d)localObject2).a((String)localObject1);
        localObject1 = new b/a/a/a/k/u;
        i1 = ((b.a.a.a.o.d)localObject2).c();
        ((u)localObject1).<init>(0, i1);
      }
      localObject3 = new b/a/a/a/i/d/c;
      ((c)localObject3).<init>((String)localObject2, (String)localObject4);
      localObject2 = a(parame1);
      ((c)localObject3).e((String)localObject2);
      localObject2 = b(parame1);
      ((c)localObject3).d((String)localObject2);
      localObject2 = ((b.a.a.a.f)localObject1).c();
      int i = localObject2.length + -1;
      while (i >= 0)
      {
        localObject4 = localObject2[i];
        Object localObject7 = ((y)localObject4).a();
        localObject5 = Locale.ENGLISH;
        localObject7 = ((String)localObject7).toLowerCase((Locale)localObject5);
        localObject5 = ((y)localObject4).b();
        ((c)localObject3).a((String)localObject7, (String)localObject5);
        localObject7 = a((String)localObject7);
        if (localObject7 != null)
        {
          localObject4 = ((y)localObject4).b();
          ((b.a.a.a.f.c)localObject7).a((b.a.a.a.f.m)localObject3, (String)localObject4);
        }
        i += -1;
      }
      if (m != 0) {
        ((c)localObject3).a(0);
      }
    }
    for (localObject1 = Collections.singletonList(localObject3);; localObject1 = a((b.a.a.a.f[])localObject3, parame1)) {
      return (List)localObject1;
    }
  }
  
  public List a(List paramList)
  {
    a.a(paramList, "List of cookies");
    b.a.a.a.o.d locald = new b/a/a/a/o/d;
    int i = paramList.size() * 20;
    locald.<init>(i);
    locald.a("Cookie");
    Object localObject = ": ";
    locald.a((String)localObject);
    int k = 0;
    b.a.a.a.k.p localp = null;
    i = paramList.size();
    if (k < i)
    {
      localObject = (b)paramList.get(k);
      if (k > 0)
      {
        str1 = "; ";
        locald.a(str1);
      }
      String str1 = ((b)localObject).a();
      String str2 = ((b)localObject).b();
      i = ((b)localObject).j();
      if (i > 0)
      {
        boolean bool = b(str2);
        if (!bool)
        {
          localObject = b.a.a.a.k.e.b;
          b.a.a.a.k.c localc = new b/a/a/a/k/c;
          localc.<init>(str1, str2);
          ((b.a.a.a.k.e)localObject).a(locald, localc, false);
        }
      }
      for (;;)
      {
        int j = k + 1;
        k = j;
        break;
        locald.a(str1);
        localObject = "=";
        locald.a((String)localObject);
        if (str2 != null) {
          locald.a(str2);
        }
      }
    }
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(1);
    localp = new b/a/a/a/k/p;
    localp.<init>(locald);
    ((List)localObject).add(localp);
    return (List)localObject;
  }
  
  public b.a.a.a.e b()
  {
    return null;
  }
  
  public String toString()
  {
    return "compatibility";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */