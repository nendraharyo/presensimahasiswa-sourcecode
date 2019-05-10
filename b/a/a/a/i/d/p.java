package b.a.a.a.i.d;

import b.a.a.a.f;
import b.a.a.a.f.e;
import b.a.a.a.f.l;
import b.a.a.a.o.a;
import b.a.a.a.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class p
  extends b
{
  protected static String a(e parame)
  {
    String str1 = parame.b();
    int i = str1.lastIndexOf('/');
    if (i >= 0) {
      if (i == 0) {
        i = 1;
      }
    }
    for (String str2 = str1.substring(0, i);; str2 = str1) {
      return str2;
    }
  }
  
  protected static String b(e parame)
  {
    return parame.a();
  }
  
  protected List a(f[] paramArrayOff, e parame)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayOff.length;
    localArrayList.<init>(i);
    int j = paramArrayOff.length;
    i = 0;
    Object localObject1 = null;
    for (int k = 0; k < j; k = i)
    {
      localObject1 = paramArrayOff[k];
      Object localObject2 = ((f)localObject1).a();
      String str = ((f)localObject1).b();
      if (localObject2 != null)
      {
        int m = ((String)localObject2).length();
        if (m != 0) {}
      }
      else
      {
        localObject1 = new b/a/a/a/f/l;
        ((l)localObject1).<init>("Cookie name may not be empty");
        throw ((Throwable)localObject1);
      }
      c localc = new b/a/a/a/i/d/c;
      localc.<init>((String)localObject2, str);
      localObject2 = a(parame);
      localc.e((String)localObject2);
      localObject2 = b(parame);
      localc.d((String)localObject2);
      localObject2 = ((f)localObject1).c();
      i = localObject2.length + -1;
      while (i >= 0)
      {
        str = localObject2[i];
        Object localObject3 = str.a();
        Object localObject4 = Locale.ENGLISH;
        localObject3 = ((String)localObject3).toLowerCase((Locale)localObject4);
        localObject4 = str.b();
        localc.a((String)localObject3, (String)localObject4);
        localObject3 = a((String)localObject3);
        if (localObject3 != null)
        {
          str = str.b();
          ((b.a.a.a.f.c)localObject3).a(localc, str);
        }
        i += -1;
      }
      localArrayList.add(localc);
      i = k + 1;
    }
    return localArrayList;
  }
  
  public void a(b.a.a.a.f.b paramb, e parame)
  {
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    Object localObject = c();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (b.a.a.a.f.c)localIterator.next();
      ((b.a.a.a.f.c)localObject).a(paramb, parame);
    }
  }
  
  public boolean b(b.a.a.a.f.b paramb, e parame)
  {
    a.a(paramb, "Cookie");
    a.a(parame, "Cookie origin");
    Object localObject = c();
    Iterator localIterator = ((Collection)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (b.a.a.a.f.c)localIterator.next();
      bool = ((b.a.a.a.f.c)localObject).b(paramb, parame);
    } while (bool);
    boolean bool = false;
    localObject = null;
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */